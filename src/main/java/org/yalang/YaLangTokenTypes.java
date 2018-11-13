/*
 * CoYaLangright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a coYaLang of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yalang;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.yalang.psi.YaLangElementType;

public class YaLangTokenTypes {
  private YaLangTokenTypes() {
  }

  public static final YaLangElementType IDENTIFIER = new YaLangElementType("IDENTIFIER");
  public static final YaLangElementType LINE_BREAK = new YaLangElementType("LINE_BREAK");
  public static final YaLangElementType STATEMENT_BREAK = new YaLangElementType("STATEMENT_BREAK");
  public static final YaLangElementType SPACE = new YaLangElementType("SPACE");
  public static final YaLangElementType TAB = new YaLangElementType("TAB");
  public static final YaLangElementType FORMFEED = new YaLangElementType("FORMFEED");
  public static final IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
  public static final YaLangElementType INCONSISTENT_DEDENT = new YaLangElementType("INCONSISTENT_DEDENT");

  public static final YaLangElementType END_OF_LINE_COMMENT = new YaLangElementType("END_OF_LINE_COMMENT");

  public static final YaLangElementType AND_KEYWORD = new YaLangElementType("AND_KEYWORD");
  public static final YaLangElementType AS_KEYWORD = new YaLangElementType("AS_KEYWORD");
  public static final YaLangElementType ASSERT_KEYWORD = new YaLangElementType("ASSERT_KEYWORD");
  public static final YaLangElementType BREAK_KEYWORD = new YaLangElementType("BREAK_KEYWORD");
  public static final YaLangElementType CLASS_KEYWORD = new YaLangElementType("CLASS_KEYWORD");
  public static final YaLangElementType CONTINUE_KEYWORD = new YaLangElementType("CONTINUE_KEYWORD");
  public static final YaLangElementType DEF_KEYWORD = new YaLangElementType("DEF_KEYWORD");
  public static final YaLangElementType DEL_KEYWORD = new YaLangElementType("DEL_KEYWORD");
  public static final YaLangElementType ELIF_KEYWORD = new YaLangElementType("ELIF_KEYWORD");
  public static final YaLangElementType ELSE_KEYWORD = new YaLangElementType("ELSE_KEYWORD");
  public static final YaLangElementType EXCEPT_KEYWORD = new YaLangElementType("EXCEPT_KEYWORD");
  public static final YaLangElementType EXEC_KEYWORD = new YaLangElementType("EXEC_KEYWORD");
  public static final YaLangElementType FINALLY_KEYWORD = new YaLangElementType("FINALLY_KEYWORD");
  public static final YaLangElementType FOR_KEYWORD = new YaLangElementType("FOR_KEYWORD");
  public static final YaLangElementType FROM_KEYWORD = new YaLangElementType("FROM_KEYWORD");
  public static final YaLangElementType GLOBAL_KEYWORD = new YaLangElementType("GLOBAL_KEYWORD");
  public static final YaLangElementType IF_KEYWORD = new YaLangElementType("IF_KEYWORD");
  public static final YaLangElementType IMPORT_KEYWORD = new YaLangElementType("IMPORT_KEYWORD");
  public static final YaLangElementType IN_KEYWORD = new YaLangElementType("IN_KEYWORD", "__contains__");
  public static final YaLangElementType IS_KEYWORD = new YaLangElementType("IS_KEYWORD");
  public static final YaLangElementType LAMBDA_KEYWORD = new YaLangElementType("LAMBDA_KEYWORD");
  public static final YaLangElementType NOT_KEYWORD = new YaLangElementType("NOT_KEYWORD");
  public static final YaLangElementType OR_KEYWORD = new YaLangElementType("OR_KEYWORD");
  public static final YaLangElementType PASS_KEYWORD = new YaLangElementType("PASS_KEYWORD");
  public static final YaLangElementType PRINT_KEYWORD = new YaLangElementType("PRINT_KEYWORD");
  public static final YaLangElementType RAISE_KEYWORD = new YaLangElementType("RAISE_KEYWORD");
  public static final YaLangElementType RETURN_KEYWORD = new YaLangElementType("RETURN_KEYWORD");
  public static final YaLangElementType TRY_KEYWORD = new YaLangElementType("TRY_KEYWORD");
  public static final YaLangElementType WITH_KEYWORD = new YaLangElementType("WITH_KEYWORD");
  public static final YaLangElementType WHILE_KEYWORD = new YaLangElementType("WHILE_KEYWORD");
  public static final YaLangElementType YIELD_KEYWORD = new YaLangElementType("YIELD_KEYWORD");

  // new keywords in YaLangthon 3
  public static final YaLangElementType NONE_KEYWORD = new YaLangElementType("NONE_KEYWORD");
  public static final YaLangElementType TRUE_KEYWORD = new YaLangElementType("TRUE_KEYWORD");
  public static final YaLangElementType FALSE_KEYWORD = new YaLangElementType("FALSE_KEYWORD");
  public static final YaLangElementType NONLOCAL_KEYWORD = new YaLangElementType("NONLOCAL_KEYWORD");
  public static final YaLangElementType DEBUG_KEYWORD = new YaLangElementType("DEBUG_KEYWORD");
  public static final YaLangElementType ASYNC_KEYWORD = new YaLangElementType("ASYNC_KEYWORD");
  public static final YaLangElementType AWAIT_KEYWORD = new YaLangElementType("AWAIT_KEYWORD", "__await__");

  public static final YaLangElementType INTEGER_LITERAL = new YaLangElementType("INTEGER_LITERAL");
  public static final YaLangElementType FLOAT_LITERAL = new YaLangElementType("FLOAT_LITERAL");
  public static final YaLangElementType IMAGINARY_LITERAL = new YaLangElementType("IMAGINARY_LITERAL");

  public static final YaLangElementType SINGLE_QUOTED_STRING = new YaLangElementType("SINGLE_QUOTED_STRING");
  public static final YaLangElementType TRIPLE_QUOTED_STRING = new YaLangElementType("TRIPLE_QUOTED_STRING");
  public static final YaLangElementType SINGLE_QUOTED_UNICODE = new YaLangElementType("SINGLE_QUOTED_UNICODE");
  public static final YaLangElementType TRIPLE_QUOTED_UNICODE = new YaLangElementType("TRIPLE_QUOTED_UNICODE");

  public static final YaLangElementType DOCSTRING = new YaLangElementType("DOCSTRING");

  public static final TokenSet UNICODE_NODES = TokenSet.create(TRIPLE_QUOTED_UNICODE, SINGLE_QUOTED_UNICODE);
  public static final TokenSet TRIPLE_NODES = TokenSet.create(TRIPLE_QUOTED_UNICODE, TRIPLE_QUOTED_STRING);
  public static final TokenSet STRING_NODES = TokenSet.orSet(UNICODE_NODES, TokenSet.create(SINGLE_QUOTED_STRING,
                                                             TRIPLE_QUOTED_STRING, DOCSTRING));
  // Operators
  public static final YaLangElementType PLUS = new YaLangElementType("PLUS", "__add__");// +
  public static final YaLangElementType MINUS = new YaLangElementType("MINUS", "__sub__");// -
  public static final YaLangElementType MULT = new YaLangElementType("MULT", "__mul__");// *
  public static final YaLangElementType EXP = new YaLangElementType("EXP", "__pow__");// **
  public static final YaLangElementType DIV = new YaLangElementType("DIV", "__div__"); // /
  public static final YaLangElementType FLOORDIV = new YaLangElementType("FLOORDIV", "__floordiv__"); // //
  public static final YaLangElementType PERC = new YaLangElementType("PERC", "__mod__");// %
  public static final YaLangElementType LTLT = new YaLangElementType("LTLT", "__lshift__");// <<
  public static final YaLangElementType GTGT = new YaLangElementType("GTGT", "__rshift__");// >>
  public static final YaLangElementType AND = new YaLangElementType("AND", "__and__");// &
  public static final YaLangElementType OR = new YaLangElementType("OR", "__or__");// |
  public static final YaLangElementType XOR = new YaLangElementType("XOR", "__xor__");// ^
  public static final YaLangElementType TILDE = new YaLangElementType("TILDE", "__invert__");// ~
  public static final YaLangElementType LT = new YaLangElementType("LT", "__lt__");// <
  public static final YaLangElementType GT = new YaLangElementType("GT", "__gt__");// >
  public static final YaLangElementType LE = new YaLangElementType("LE", "__le__");// <=
  public static final YaLangElementType GE = new YaLangElementType("GE", "__ge__");// >=
  public static final YaLangElementType EQEQ = new YaLangElementType("EQEQ", "__eq__");// ==
  public static final YaLangElementType NE = new YaLangElementType("NE", "__ne__");// !=
  public static final YaLangElementType NE_OLD = new YaLangElementType("NE_OLD", "__ne__");// <>

  // Delimiters
  public static final YaLangElementType LPAR = new YaLangElementType("LPAR");// (
  public static final YaLangElementType RPAR = new YaLangElementType("RPAR");// )
  public static final YaLangElementType LBRACKET = new YaLangElementType("LBRACKET");// [
  public static final YaLangElementType RBRACKET = new YaLangElementType("RBRACKET");// ]
  public static final YaLangElementType LBRACE = new YaLangElementType("LBRACE");// {
  public static final YaLangElementType RBRACE = new YaLangElementType("RBRACE");// }
  public static final YaLangElementType AT = new YaLangElementType("AT", "__matmul__");// @
  public static final YaLangElementType COMMA = new YaLangElementType("COMMA");// ,
  public static final YaLangElementType COLON = new YaLangElementType("COLON");// :
  public static final YaLangElementType DOT = new YaLangElementType("DOT");// .
  public static final YaLangElementType TICK = new YaLangElementType("TICK");// `
  public static final YaLangElementType EQ = new YaLangElementType("EQ");// =
  public static final YaLangElementType SEMICOLON = new YaLangElementType("SEMICOLON");// ;
  public static final YaLangElementType PLUSEQ = new YaLangElementType("PLUSEQ");// +=
  public static final YaLangElementType MINUSEQ = new YaLangElementType("MINUSEQ");// -=
  public static final YaLangElementType MULTEQ = new YaLangElementType("MULTEQ");// *=
  public static final YaLangElementType ATEQ = new YaLangElementType("ATEQ"); // @=
  public static final YaLangElementType DIVEQ = new YaLangElementType("DIVEQ"); // /=
  public static final YaLangElementType FLOORDIVEQ = new YaLangElementType("FLOORDIVEQ"); // //=
  public static final YaLangElementType PERCEQ = new YaLangElementType("PERCEQ");// %=
  public static final YaLangElementType ANDEQ = new YaLangElementType("ANDEQ");// &=
  public static final YaLangElementType OREQ = new YaLangElementType("OREQ");// |=
  public static final YaLangElementType XOREQ = new YaLangElementType("XOREQ");// ^=
  public static final YaLangElementType LTLTEQ = new YaLangElementType("LTLTEQ");// <<=
  public static final YaLangElementType GTGTEQ = new YaLangElementType("GTGTEQ");// >>=
  public static final YaLangElementType EXPEQ = new YaLangElementType("EXPEQ");// **=
  public static final YaLangElementType RARROW = new YaLangElementType("RARROW");// ->

  public static final TokenSet OPERATIONS = TokenSet.create(
      PLUS, MINUS, MULT, AT, EXP, DIV, FLOORDIV, PERC, LTLT, GTGT, AND, OR,
      XOR, TILDE, LT, GT, LE, GE, EQEQ, NE, NE_OLD, AT, COLON, TICK, EQ,
      PLUSEQ, MINUSEQ,
      MULTEQ, ATEQ, DIVEQ, FLOORDIVEQ, PERCEQ, ANDEQ, OREQ, XOREQ, LTLTEQ, GTGTEQ,
      EXPEQ);

  public static final TokenSet COMPARISON_OPERATIONS = TokenSet.create(
      LT, GT, EQEQ, GE, LE, NE, NE_OLD, IN_KEYWORD, IS_KEYWORD, NOT_KEYWORD);

  public static final TokenSet SHIFT_OPERATIONS = TokenSet.create(LTLT, GTGT);
  public static final TokenSet ADDITIVE_OPERATIONS = TokenSet.create(PLUS, MINUS);
  public static final TokenSet MULTIPLICATIVE_OPERATIONS = TokenSet.create(MULT, AT, FLOORDIV, DIV, PERC);
  public static final TokenSet STAR_OPERATORS = TokenSet.create(MULT, EXP);
  public static final TokenSet UNARY_OPERATIONS = TokenSet.create(PLUS, MINUS, TILDE);
  public static final TokenSet BITWISE_OPERATIONS = TokenSet.create(AND, OR, XOR);
  public static final TokenSet EQUALITY_OPERATIONS = TokenSet.create(EQEQ, NE, NE_OLD);
  public static final TokenSet RELATIONAL_OPERATIONS = TokenSet.create(LT, GT, LE, GE);
  public static final TokenSet END_OF_STATEMENT = TokenSet.create(STATEMENT_BREAK, SEMICOLON);
  public static final TokenSet WHITESPACE = TokenSet.create(SPACE, TAB, FORMFEED);
  public static final TokenSet WHITESPACE_OR_LINEBREAK = TokenSet.create(SPACE, TAB, FORMFEED, LINE_BREAK);
  public static final TokenSet OPEN_BRACES = TokenSet.create(LBRACKET, LBRACE, LPAR);
  public static final TokenSet CLOSE_BRACES = TokenSet.create(RBRACKET, RBRACE, RPAR);
  
  public static final TokenSet NUMERIC_LITERALS = TokenSet.create(FLOAT_LITERAL, INTEGER_LITERAL, IMAGINARY_LITERAL);
  public static final TokenSet BOOL_LITERALS = TokenSet.create(TRUE_KEYWORD, FALSE_KEYWORD);
  public static final TokenSet SCALAR_LITERALS = TokenSet.orSet(BOOL_LITERALS, NUMERIC_LITERALS, TokenSet.create(NONE_KEYWORD));
  public static final TokenSet EXPRESSION_KEYWORDS = TokenSet.create(TRUE_KEYWORD, FALSE_KEYWORD, NONE_KEYWORD);

  public static final TokenSet AUG_ASSIGN_OPERATIONS = TokenSet.create(PLUSEQ, MINUSEQ, MULTEQ, ATEQ, DIVEQ,
      PERCEQ, EXPEQ, GTGTEQ, LTLTEQ, ANDEQ, OREQ, XOREQ, FLOORDIVEQ);

  public static final YaLangElementType BACKSLASH = new YaLangElementType("BACKSLASH");

  public static final YaLangElementType INDENT = new YaLangElementType("INDENT");
  public static final YaLangElementType DEDENT = new YaLangElementType("DEDENT");

  public static final YaLangElementType FSTRING_TEXT = new YaLangElementType("FSTRING_TEXT");
  public static final YaLangElementType FSTRING_START = new YaLangElementType("FSTRING_START");
  public static final YaLangElementType FSTRING_END = new YaLangElementType("FSTRING_END");
  public static final YaLangElementType FSTRING_FRAGMENT_START = new YaLangElementType("FSTRING_FRAGMENT_START");
  public static final YaLangElementType FSTRING_FRAGMENT_END = new YaLangElementType("FSTRING_FRAGMENT_END");
  public static final YaLangElementType FSTRING_FRAGMENT_FORMAT_START = new YaLangElementType("FSTRING_FRAGMENT_FORMAT_START");
  public static final YaLangElementType FSTRING_FRAGMENT_TYPE_CONVERSION = new YaLangElementType("FSTRING_FRAGMENT_TYPE_CONVERSION");
}
