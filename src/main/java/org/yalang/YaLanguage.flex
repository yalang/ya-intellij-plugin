package org.yalang.lexer;

import com.intellij.psi.tree.IElementType;
import org.yalang.YaTokenTypes;
//import org.yalang.lexer.YaLexerFStringHelper;
import com.intellij.openapi.util.text.StringUtil;

%%

%class YaLexer
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

// If you change patterns for string literals, don't forget to update YaStringLiteralUtil!
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
//private final YaLexerFStringHelper fStringHelper = new YaLexerFStringHelper(this);

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
  {FSTRING_TEXT_NO_QUOTES} { return YaTokenTypes.FSTRING_TEXT; }
  "\\" { return YaTokenTypes.FSTRING_TEXT; }
//  [\n] { return fStringHelper.handleLineBreakInLiteralText(); }
//  {FSTRING_QUOTES} { return fStringHelper.handleFStringEnd(); }
//  "{" { return fStringHelper.handleFragmentStart(); }

  [^]  { return YaTokenTypes.BAD_CHARACTER; }
}

<FSTRING_FRAGMENT> {
//  "(" { return fStringHelper.handleLeftBracketInFragment(YaTokenTypes.LPAR); }
//  ")" { return fStringHelper.handleRightBracketInFragment(YaTokenTypes.RPAR); }

//  "[" { return fStringHelper.handleLeftBracketInFragment(YaTokenTypes.LBRACKET); }
//  "]" { return fStringHelper.handleRightBracketInFragment(YaTokenTypes.RBRACKET); }

//  "{" { return fStringHelper.handleLeftBracketInFragment(YaTokenTypes.LBRACE); }
//  "}" { return fStringHelper.handleRightBracketInFragment(YaTokenTypes.RBRACE); }

  {FSTRING_FRAGMENT_TYPE_CONVERSION} { return YaTokenTypes.FSTRING_FRAGMENT_TYPE_CONVERSION; }

//  ":" { return fStringHelper.handleColonInFragment(); }

//  {SINGLE_QUOTED_STRING} { return fStringHelper.handleStringLiteral(YaTokenTypes.SINGLE_QUOTED_STRING); }
//  {TRIPLE_QUOTED_STRING} { return fStringHelper.handleStringLiteral(YaTokenTypes.TRIPLE_QUOTED_STRING); }
//  {FSTRING_START}       { return fStringHelper.handleFStringStartInFragment(); }

//  [\n] { return fStringHelper.handleLineBreakInFragment(); }

  // Should be impossible inside expression fragments: any openingQuotes should be matched as a string literal there
  // {FSTRING_QUOTES} { return hasMatchingFStringStart(yytext().toString()) ? YaTokenTypes.FSTRING_END : YaTokenTypes.FSTRING_TEXT; }
}

<FSTRING_FRAGMENT_FORMAT> {
  {FSTRING_FORMAT_TEXT_NO_QUOTES} { return YaTokenTypes.FSTRING_TEXT; }
  "\\" { return YaTokenTypes.FSTRING_TEXT; }
//  [\n] { return fStringHelper.handleLineBreakInLiteralText(); }
//  {FSTRING_QUOTES} { return fStringHelper.handleFStringEnd(); }
//  "{" { return fStringHelper.handleFragmentStart(); }
//  "}" { return fStringHelper.handleFragmentEnd(); }

  [^] { return YaTokenTypes.BAD_CHARACTER; }
}

[\ ]                        { return YaTokenTypes.SPACE; }
[\t]                        { return YaTokenTypes.TAB; }
[\f]                        { return YaTokenTypes.FORMFEED; }
"\\"                        { return YaTokenTypes.BACKSLASH; }

<YYINITIAL> {
[\n]                        { if (zzCurrentPos == 0) yybegin(PENDING_DOCSTRING); return YaTokenTypes.LINE_BREAK; }
{END_OF_LINE_COMMENT}       { if (zzCurrentPos == 0) yybegin(PENDING_DOCSTRING); return YaTokenTypes.END_OF_LINE_COMMENT; }

{SINGLE_QUOTED_STRING}          { if (zzInput == YYEOF && zzStartRead == 0) return YaTokenTypes.DOCSTRING;
                                 else return YaTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING}          { if (zzInput == YYEOF && zzStartRead == 0) return YaTokenTypes.DOCSTRING;
                                 else return YaTokenTypes.TRIPLE_QUOTED_STRING; }

{SINGLE_QUOTED_STRING}[\ \t]*[\n;]   { yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaTokenTypes.SINGLE_QUOTED_STRING;
return YaTokenTypes.DOCSTRING; }

{TRIPLE_QUOTED_STRING}[\ \t]*[\n;]   { yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaTokenTypes.TRIPLE_QUOTED_STRING;
return YaTokenTypes.DOCSTRING; }

{SINGLE_QUOTED_STRING}[\ \t]*"\\"  {
 yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaTokenTypes.SINGLE_QUOTED_STRING;
 yybegin(PENDING_DOCSTRING); return YaTokenTypes.DOCSTRING; }

{TRIPLE_QUOTED_STRING}[\ \t]*"\\"  {
 yypushback(getSpaceLength(yytext())); if (zzCurrentPos != 0) return YaTokenTypes.TRIPLE_QUOTED_STRING;
 yybegin(PENDING_DOCSTRING); return YaTokenTypes.DOCSTRING; }

}

[\n]                        { return YaTokenTypes.LINE_BREAK; }
{END_OF_LINE_COMMENT}       { return YaTokenTypes.END_OF_LINE_COMMENT; }

<YYINITIAL, IN_DOCSTRING_OWNER, FSTRING_FRAGMENT> {
{LONGINTEGER}         { return YaTokenTypes.INTEGER_LITERAL; }
{INTEGER}             { return YaTokenTypes.INTEGER_LITERAL; }
{FLOATNUMBER}         { return YaTokenTypes.FLOAT_LITERAL; }
{IMAGNUMBER}          { return YaTokenTypes.IMAGINARY_LITERAL; }

{SINGLE_QUOTED_STRING} { return YaTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING} { return YaTokenTypes.TRIPLE_QUOTED_STRING; }

"و"                   { return YaTokenTypes.AND_KEYWORD; }
"أكد"                 { return YaTokenTypes.ASSERT_KEYWORD; }
"اكسر"                { return YaTokenTypes.BREAK_KEYWORD; }
"صنف"                 { yybegin(IN_DOCSTRING_OWNER); return YaTokenTypes.CLASS_KEYWORD; }
"استمر"               { return YaTokenTypes.CONTINUE_KEYWORD; }
"وظيفة"               { yybegin(IN_DOCSTRING_OWNER); return YaTokenTypes.DEF_KEYWORD; }
"حذف"                 { return YaTokenTypes.DEL_KEYWORD; }
"ولو"                 { return YaTokenTypes.ELIF_KEYWORD; }
"آخر"                 { return YaTokenTypes.ELSE_KEYWORD; }
"إلا"                  { return YaTokenTypes.EXCEPT_KEYWORD; }
"أخيرا"               { return YaTokenTypes.FINALLY_KEYWORD; }
"لأن"                  { return YaTokenTypes.FOR_KEYWORD; }
"من"                  { return YaTokenTypes.FROM_KEYWORD; }
"عالمي"               { return YaTokenTypes.GLOBAL_KEYWORD; }
"لو"                  { return YaTokenTypes.IF_KEYWORD; }
"استيراد"             { return YaTokenTypes.IMPORT_KEYWORD; }
"في"                  { return YaTokenTypes.IN_KEYWORD; }
"يساوي"               { return YaTokenTypes.IS_KEYWORD; }
"امدا"                { return YaTokenTypes.LAMBDA_KEYWORD; }
"لا"                   { return YaTokenTypes.NOT_KEYWORD; }
"أو"                  { return YaTokenTypes.OR_KEYWORD; }
"مرر"                 { return YaTokenTypes.PASS_KEYWORD; }
"رفع"                 { return YaTokenTypes.RAISE_KEYWORD; }
"إرجع"                { return YaTokenTypes.RETURN_KEYWORD; }
"حاول"                { return YaTokenTypes.TRY_KEYWORD; }
"بينما"               { return YaTokenTypes.WHILE_KEYWORD; }
"محصول"               { return YaTokenTypes.YIELD_KEYWORD; }

"صحيح"                { return YaTokenTypes.TRUE_KEYWORD; }
"زائف"                { return YaTokenTypes.FALSE_KEYWORD; }
"لااحد"                { return YaTokenTypes.NONE_KEYWORD; }
"غيرمتزامن"           { return YaTokenTypes.ASYNC_KEYWORD; }
"مثل"                 { return YaTokenTypes.AS_KEYWORD; }
"ترقب"                { return YaTokenTypes.AWAIT_KEYWORD; }
"مع"                  { return YaTokenTypes.WITH_KEYWORD; }
"غيرمحلي"             { return YaTokenTypes.NONLOCAL_KEYWORD; }

{IDENTIFIER}          { return YaTokenTypes.IDENTIFIER; }

"+="                  { return YaTokenTypes.PLUSEQ; }
"-="                  { return YaTokenTypes.MINUSEQ; }
"**="                 { return YaTokenTypes.EXPEQ; }
"*="                  { return YaTokenTypes.MULTEQ; }
"@="                  { return YaTokenTypes.ATEQ; }
"//="                 { return YaTokenTypes.FLOORDIVEQ; }
"/="                  { return YaTokenTypes.DIVEQ; }
"٪="                  { return YaTokenTypes.PERCEQ; }
"&="                  { return YaTokenTypes.ANDEQ; }
"|="                  { return YaTokenTypes.OREQ; }
"^="                  { return YaTokenTypes.XOREQ; }
">>="                 { return YaTokenTypes.GTGTEQ; }
"<<="                 { return YaTokenTypes.LTLTEQ; }
"<<"                  { return YaTokenTypes.LTLT; }
">>"                  { return YaTokenTypes.GTGT; }
"**"                  { return YaTokenTypes.EXP; }
"//"                  { return YaTokenTypes.FLOORDIV; }
"<="                  { return YaTokenTypes.LE; }
">="                  { return YaTokenTypes.GE; }
"=="                  { return YaTokenTypes.EQEQ; }
"!="                  { return YaTokenTypes.NE; }
"<>"                  { return YaTokenTypes.NE_OLD; }
"->"                  { return YaTokenTypes.RARROW; }
"+"                   { return YaTokenTypes.PLUS; }
"-"                   { return YaTokenTypes.MINUS; }
"*"                   { return YaTokenTypes.MULT; }
"/"                   { return YaTokenTypes.DIV; }
"٪"                   { return YaTokenTypes.PERC; }
"&"                   { return YaTokenTypes.AND; }
"|"                   { return YaTokenTypes.OR; }
"^"                   { return YaTokenTypes.XOR; }
"~"                   { return YaTokenTypes.TILDE; }
"<"                   { return YaTokenTypes.LT; }
">"                   { return YaTokenTypes.GT; }
"("                   { return YaTokenTypes.LPAR; }
")"                   { return YaTokenTypes.RPAR; }
"["                   { return YaTokenTypes.LBRACKET; }
"]"                   { return YaTokenTypes.RBRACKET; }
"{"                   { return YaTokenTypes.LBRACE; }
"}"                   { return YaTokenTypes.RBRACE; }
"@"                   { return YaTokenTypes.AT; }
"،"                   { return YaTokenTypes.COMMA; }
":"                   { return YaTokenTypes.COLON; }

"."                   { return YaTokenTypes.DOT; }
"`"                   { return YaTokenTypes.TICK; }
"="                   { return YaTokenTypes.EQ; }
"؛"                   { return YaTokenTypes.SEMICOLON; }

//{FSTRING_START}       { return fStringHelper.handleFStringStart(); }

[^]                   { return YaTokenTypes.BAD_CHARACTER; }
}

<IN_DOCSTRING_OWNER> {
":"(\ )*{END_OF_LINE_COMMENT}?"\n"          { yypushback(yylength()-1); yybegin(PENDING_DOCSTRING); return YaTokenTypes.COLON; }
}

<PENDING_DOCSTRING> {
{SINGLE_QUOTED_STRING}          { if (zzInput == YYEOF) return YaTokenTypes.DOCSTRING;
                                 else yybegin(YYINITIAL); return YaTokenTypes.SINGLE_QUOTED_STRING; }
{TRIPLE_QUOTED_STRING}          { if (zzInput == YYEOF) return YaTokenTypes.DOCSTRING;
                                 else yybegin(YYINITIAL); return YaTokenTypes.TRIPLE_QUOTED_STRING; }
{DOCSTRING_LITERAL}[\ \t]*[\n;] { yypushback(getSpaceLength(yytext())); yybegin(YYINITIAL); return YaTokenTypes.DOCSTRING; }
{DOCSTRING_LITERAL}[\ \t]*"\\"  { yypushback(getSpaceLength(yytext())); return YaTokenTypes.DOCSTRING; }
.                               { yypushback(1); yybegin(YYINITIAL); }
}

