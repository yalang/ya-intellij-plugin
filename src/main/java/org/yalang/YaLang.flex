package org.yalang.lexer;

import com.intellij.psi.tree.IElementType;
import org.yalang.YaLangTokenTypes;
import org.yalang.lexer.YaLangLexerFStringHelper;
import com.intellij.openapi.util.text.StringUtil;

%%

%class YaLangLexer
%implements FlexLexerEx
%unicode
%function advance
%type IElementType

DIGIT = [٠-٩]
NONZERODIGIT = [١-٩]
OCTDIGIT = [0-7]
HEXDIGIT = [0-9A-Fa-f]
BINDIGIT = [01]

HEXINTEGER = 0[Xx]("_"?{HEXDIGIT})+
OCTINTEGER = 0[Oo]?("_"?{OCTDIGIT})+
BININTEGER = 0[Bb]("_"?{BINDIGIT})+
DECIMALINTEGER = (({NONZERODIGIT}("_"?{DIGIT})*)|0)
INTEGER = {DECIMALINTEGER}|{OCTINTEGER}|{HEXINTEGER}|{BININTEGER}
LONGINTEGER = {INTEGER}[Ll]

END_OF_LINE_COMMENT="#"[^\r\n]*

IDENT_START = [\w_--\d]
IDENT_CONTINUE = [\w_]
IDENTIFIER = {IDENT_START}{IDENT_CONTINUE}*

FLOATNUMBER=({POINTFLOAT})|({EXPONENTFLOAT})
POINTFLOAT=(({INTPART})?{FRACTION})|({INTPART}\.)
EXPONENTFLOAT=(({INTPART})|({POINTFLOAT})){EXPONENT}
INTPART = {DIGIT}("_"?{DIGIT})*
FRACTION = \.{INTPART}
EXPONENT = [eE][+\-]?{INTPART}

IMAGNUMBER=(({FLOATNUMBER})|({INTPART}))[Jj]

//STRING_LITERAL=[UuBb]?({RAW_STRING}|{QUOTED_STRING})
//RAW_STRING=[Rr]{QUOTED_STRING}
//QUOTED_STRING=({TRIPLE_APOS_LITERAL})|({QUOTED_LITERAL})|({DOUBLE_QUOTED_LITERAL})|({TRIPLE_QUOTED_LITERAL})

// If you change patterns for string literals, don't forget to update YaLangStringLiteralUtil!
// "c" prefix character is included for Cython
SINGLE_QUOTED_STRING=[UuBbCcRr]{0,3}({QUOTED_LITERAL} | {DOUBLE_QUOTED_LITERAL})
TRIPLE_QUOTED_STRING=[UuBbCcRr]{0,3}({TRIPLE_QUOTED_LITERAL}|{TRIPLE_APOS_LITERAL})

DOCSTRING_LITERAL=({SINGLE_QUOTED_STRING}|{TRIPLE_QUOTED_STRING})

QUOTED_LITERAL="'" ([^\\\'\r\n] | {ESCAPE_SEQUENCE} | (\\[\r\n]))* ("'"|\\)?
DOUBLE_QUOTED_LITERAL=\"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|(\\[\r\n]))*?(\"|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]

ANY_ESCAPE_SEQUENCE = \\[^]

THREE_QUO = (\"\"\")
ONE_TWO_QUO = (\"[^\\\"]) | (\"\\[^]) | (\"\"[^\\\"]) | (\"\"\\[^])
QUO_STRING_CHAR = [^\\\"] | {ANY_ESCAPE_SEQUENCE} | {ONE_TWO_QUO}
TRIPLE_QUOTED_LITERAL = {THREE_QUO} {QUO_STRING_CHAR}* {THREE_QUO}?

THREE_APOS = (\'\'\')
ONE_TWO_APOS = ('[^\\']) | ('\\[^]) | (''[^\\']) | (''\\[^])
APOS_STRING_CHAR = [^\\'] | {ANY_ESCAPE_SEQUENCE} | {ONE_TWO_APOS}
TRIPLE_APOS_LITERAL = {THREE_APOS} {APOS_STRING_CHAR}* {THREE_APOS}?

FSTRING_PREFIX = [UuBbCcRr]{0,3}[fF][UuBbCcRr]{0,3}
FSTRING_START = {FSTRING_PREFIX} (\"\"\"|'''|\"|')
FSTRING_QUOTES = (\"{1,3}|'{1,3})
FSTRING_ESCAPED_LBRACE = "{{"
FSTRING_ESCAPE_SEQUENCE = \\[^{}\r\n]
// TODO report it in annotation
//FSTRING_ESCAPED_RBRACE = "}}"
NAMED_UNICODE_ESCAPE = \\N\{[\w ]*\}?
FSTRING_TEXT_NO_QUOTES = ([^\\\'\"\r\n{] | {NAMED_UNICODE_ESCAPE} | {FSTRING_ESCAPE_SEQUENCE} | {FSTRING_ESCAPED_LBRACE} | (\\[\r\n]) )+
FSTRING_FORMAT_TEXT_NO_QUOTES = ([^\\\'\"\r\n{}] | {NAMED_UNICODE_ESCAPE} | {FSTRING_ESCAPE_SEQUENCE} | (\\[\r\n]) )+
FSTRING_FRAGMENT_TYPE_CONVERSION = "!" [^=:'\"} \t\r\n]*

%state PENDING_DOCSTRING
%state IN_DOCSTRING_OWNER
%xstate FSTRING
%state FSTRING_FRAGMENT
%xstate FSTRING_FRAGMENT_FORMAT
%{
private final YaLangLexerFStringHelper fStringHelper = new YaLangLexerFStringHelper(this);

private int getSpaceLength(CharSequence string) {
String string1 = string.toString();
string1 = StringUtil.trimEnd(string1, "\\");
string1 = StringUtil.trimEnd(string1, ";");
final String s = StringUtil.trimTrailing(string1);
return yylength()-s.length();

}
%}

%%

<FSTRING> {
  {FSTRING_TEXT_NO_QUOTES} { return YaLangTokenTypes.FSTRING_TEXT; }
  "\\" { return YaLangTokenTypes.FSTRING_TEXT; }
  [\n] { return fStringHelper.handleLineBreakInLiteralText(); }
  {FSTRING_QUOTES} { return fStringHelper.handleFStringEnd(); }
  "{" { return fStringHelper.handleFragmentStart(); }

  [^]  { return YaLangTokenTypes.BAD_CHARACTER; }
}

<FSTRING_FRAGMENT> {
  "(" { return fStringHelper.handleLeftBracketInFragment(YaLangTokenTypes.LPAR); }
  ")" { return fStringHelper.handleRightBracketInFragment(YaLangTokenTypes.RPAR); }

  "[" { return fStringHelper.handleLeftBracketInFragment(YaLangTokenTypes.LBRACKET); }
  "]" { return fStringHelper.handleRightBracketInFragment(YaLangTokenTypes.RBRACKET); }

  "{" { return fStringHelper.handleLeftBracketInFragment(YaLangTokenTypes.LBRACE); }
  "}" { return fStringHelper.handleRightBracketInFragment(YaLangTokenTypes.RBRACE); }

  {FSTRING_FRAGMENT_TYPE_CONVERSION} { return YaLangTokenTypes.FSTRING_FRAGMENT_TYPE_CONVERSION; }

  ":" { return fStringHelper.handleColonInFragment(); }

  {SINGLE_QUOTED_STRING} { return fStringHelper.handleStringLiteral(YaLangTokenTypes.SINGLE_QUOTED_STRING); }
  {TRIPLE_QUOTED_STRING} { return fStringHelper.handleStringLiteral(YaLangTokenTypes.TRIPLE_QUOTED_STRING); }
  {FSTRING_START}       { return fStringHelper.handleFStringStartInFragment(); }

  [\n] { return fStringHelper.handleLineBreakInFragment(); }

  // Should be impossible inside expression fragments: any openingQuotes should be matched as a string literal there
  // {FSTRING_QUOTES} { return hasMatchingFStringStart(yytext().toString()) ? YaLangTokenTypes.FSTRING_END : YaLangTokenTypes.FSTRING_TEXT; }
}

<FSTRING_FRAGMENT_FORMAT> {
  {FSTRING_FORMAT_TEXT_NO_QUOTES} { return YaLangTokenTypes.FSTRING_TEXT; }
  "\\" { return YaLangTokenTypes.FSTRING_TEXT; }
  [\n] { return fStringHelper.handleLineBreakInLiteralText(); }
  {FSTRING_QUOTES} { return fStringHelper.handleFStringEnd(); }
  "{" { return fStringHelper.handleFragmentStart(); }
  "}" { return fStringHelper.handleFragmentEnd(); }

  [^] { return YaLangTokenTypes.BAD_CHARACTER; }
}

[\ ]                        { return YaLangTokenTypes.SPACE; }
[\t]                        { return YaLangTokenTypes.TAB; }
[\f]                        { return YaLangTokenTypes.FORMFEED; }
"\\"                        { return YaLangTokenTypes.BACKSLASH; }

<YYINITIAL> {
[\n]                        { if (zzCurrentPos == 0) yybegin(PENDING_DOCSTRING); return YaLangTokenTypes.LINE_BREAK; }
{END_OF_LINE_COMMENT}       { if (zzCurrentPos == 0) yybegin(PENDING_DOCSTRING); return YaLangTokenTypes.END_OF_LINE_COMMENT; }

{SINGLE_QUOTED_STRING}          { if (zzInput == YYEOF && zzStartRead == 0) return YaLangTokenTypes.DOCSTRING;
                                 else return YaLangTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING}          { if (zzInput == YYEOF && zzStartRead == 0) return YaLangTokenTypes.DOCSTRING;
                                 else return YaLangTokenTypes.TRIPLE_QUOTED_STRING; }

{SINGLE_QUOTED_STRING}[\ \t]*[\n;]   { yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaLangTokenTypes.SINGLE_QUOTED_STRING;
return YaLangTokenTypes.DOCSTRING; }

{TRIPLE_QUOTED_STRING}[\ \t]*[\n;]   { yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaLangTokenTypes.TRIPLE_QUOTED_STRING;
return YaLangTokenTypes.DOCSTRING; }

{SINGLE_QUOTED_STRING}[\ \t]*"\\"  {
 yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaLangTokenTypes.SINGLE_QUOTED_STRING;
 yybegin(PENDING_DOCSTRING); return YaLangTokenTypes.DOCSTRING; }

{TRIPLE_QUOTED_STRING}[\ \t]*"\\"  {
 yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaLangTokenTypes.TRIPLE_QUOTED_STRING;
 yybegin(PENDING_DOCSTRING); return YaLangTokenTypes.DOCSTRING; }

}

[\n]                        { return YaLangTokenTypes.LINE_BREAK; }
{END_OF_LINE_COMMENT}       { return YaLangTokenTypes.END_OF_LINE_COMMENT; }

<YYINITIAL, IN_DOCSTRING_OWNER, FSTRING_FRAGMENT> {
{LONGINTEGER}         { return YaLangTokenTypes.INTEGER_LITERAL; }
{INTEGER}             { return YaLangTokenTypes.INTEGER_LITERAL; }
{FLOATNUMBER}         { return YaLangTokenTypes.FLOAT_LITERAL; }
{IMAGNUMBER}          { return YaLangTokenTypes.IMAGINARY_LITERAL; }

{SINGLE_QUOTED_STRING} { return YaLangTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING} { return YaLangTokenTypes.TRIPLE_QUOTED_STRING; }

"و"                   { return YaLangTokenTypes.AND_KEYWORD; }
"أكد"                 { return YaLangTokenTypes.ASSERT_KEYWORD; }
"اكسر"                { return YaLangTokenTypes.BREAK_KEYWORD; }
"صنف"                 { yybegin(IN_DOCSTRING_OWNER); return YaLangTokenTypes.CLASS_KEYWORD; }
"استمر"               { return YaLangTokenTypes.CONTINUE_KEYWORD; }
"وظيفة"               { yybegin(IN_DOCSTRING_OWNER); return YaLangTokenTypes.DEF_KEYWORD; }
"حذف"                 { return YaLangTokenTypes.DEL_KEYWORD; }
"ولو"                 { return YaLangTokenTypes.ELIF_KEYWORD; }
"آخر"                 { return YaLangTokenTypes.ELSE_KEYWORD; }
"إلا"                  { return YaLangTokenTypes.EXCEPT_KEYWORD; }
"أخيرا"               { return YaLangTokenTypes.FINALLY_KEYWORD; }
"لأن"                  { return YaLangTokenTypes.FOR_KEYWORD; }
"من"                  { return YaLangTokenTypes.FROM_KEYWORD; }
"عالمي"               { return YaLangTokenTypes.GLOBAL_KEYWORD; }
"لو"                  { return YaLangTokenTypes.IF_KEYWORD; }
"استيراد"             { return YaLangTokenTypes.IMPORT_KEYWORD; }
"في"                  { return YaLangTokenTypes.IN_KEYWORD; }
"يساوي"               { return YaLangTokenTypes.IS_KEYWORD; }
"امدا"                { return YaLangTokenTypes.LAMBDA_KEYWORD; }
"لا"                   { return YaLangTokenTypes.NOT_KEYWORD; }
"أو"                  { return YaLangTokenTypes.OR_KEYWORD; }
"مرر"                 { return YaLangTokenTypes.PASS_KEYWORD; }
"رفع"                 { return YaLangTokenTypes.RAISE_KEYWORD; }
"إرجع"                { return YaLangTokenTypes.RETURN_KEYWORD; }
"حاول"                { return YaLangTokenTypes.TRY_KEYWORD; }
"بينما"               { return YaLangTokenTypes.WHILE_KEYWORD; }
"محصول"               { return YaLangTokenTypes.YIELD_KEYWORD; }

{IDENTIFIER}          { return YaLangTokenTypes.IDENTIFIER; }

"+="                  { return YaLangTokenTypes.PLUSEQ; }
"-="                  { return YaLangTokenTypes.MINUSEQ; }
"**="                 { return YaLangTokenTypes.EXPEQ; }
"*="                  { return YaLangTokenTypes.MULTEQ; }
"@="                  { return YaLangTokenTypes.ATEQ; }
"//="                 { return YaLangTokenTypes.FLOORDIVEQ; }
"/="                  { return YaLangTokenTypes.DIVEQ; }
"%="                  { return YaLangTokenTypes.PERCEQ; }
"&="                  { return YaLangTokenTypes.ANDEQ; }
"|="                  { return YaLangTokenTypes.OREQ; }
"^="                  { return YaLangTokenTypes.XOREQ; }
">>="                 { return YaLangTokenTypes.GTGTEQ; }
"<<="                 { return YaLangTokenTypes.LTLTEQ; }
"<<"                  { return YaLangTokenTypes.LTLT; }
">>"                  { return YaLangTokenTypes.GTGT; }
"**"                  { return YaLangTokenTypes.EXP; }
"//"                  { return YaLangTokenTypes.FLOORDIV; }
"<="                  { return YaLangTokenTypes.LE; }
">="                  { return YaLangTokenTypes.GE; }
"=="                  { return YaLangTokenTypes.EQEQ; }
"!="                  { return YaLangTokenTypes.NE; }
"<>"                  { return YaLangTokenTypes.NE_OLD; }
"->"                  { return YaLangTokenTypes.RARROW; }
"+"                   { return YaLangTokenTypes.PLUS; }
"-"                   { return YaLangTokenTypes.MINUS; }
"*"                   { return YaLangTokenTypes.MULT; }
"/"                   { return YaLangTokenTypes.DIV; }
"%"                   { return YaLangTokenTypes.PERC; }
"&"                   { return YaLangTokenTypes.AND; }
"|"                   { return YaLangTokenTypes.OR; }
"^"                   { return YaLangTokenTypes.XOR; }
"~"                   { return YaLangTokenTypes.TILDE; }
"<"                   { return YaLangTokenTypes.LT; }
">"                   { return YaLangTokenTypes.GT; }
"("                   { return YaLangTokenTypes.LPAR; }
")"                   { return YaLangTokenTypes.RPAR; }
"["                   { return YaLangTokenTypes.LBRACKET; }
"]"                   { return YaLangTokenTypes.RBRACKET; }
"{"                   { return YaLangTokenTypes.LBRACE; }
"}"                   { return YaLangTokenTypes.RBRACE; }
"@"                   { return YaLangTokenTypes.AT; }
","                   { return YaLangTokenTypes.COMMA; }
":"                   { return YaLangTokenTypes.COLON; }

"."                   { return YaLangTokenTypes.DOT; }
"`"                   { return YaLangTokenTypes.TICK; }
"="                   { return YaLangTokenTypes.EQ; }
";"                   { return YaLangTokenTypes.SEMICOLON; }

{FSTRING_START}       { return fStringHelper.handleFStringStart(); }

[^]                   { return YaLangTokenTypes.BAD_CHARACTER; }
}

<IN_DOCSTRING_OWNER> {
":"(\ )*{END_OF_LINE_COMMENT}?"\n"          { yypushback(yylength()-1); yybegin(PENDING_DOCSTRING); return YaLangTokenTypes.COLON; }
}

<PENDING_DOCSTRING> {
{SINGLE_QUOTED_STRING}          { if (zzInput == YYEOF) return YaLangTokenTypes.DOCSTRING;
                                 else yybegin(YYINITIAL); return YaLangTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING}          { if (zzInput == YYEOF) return YaLangTokenTypes.DOCSTRING;
                                 else yybegin(YYINITIAL); return YaLangTokenTypes.TRIPLE_QUOTED_STRING; }
{DOCSTRING_LITERAL}[\ \t]*[\n;] { yypushback(getSpaceLength(yytext())); yybegin(YYINITIAL); return YaLangTokenTypes.DOCSTRING; }
{DOCSTRING_LITERAL}[\ \t]*"\\"  { yypushback(getSpaceLength(yytext())); return YaLangTokenTypes.DOCSTRING; }
.                               { yypushback(1); yybegin(YYINITIAL); }
}

