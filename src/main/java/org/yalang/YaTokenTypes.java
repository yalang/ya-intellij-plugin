/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
import org.yalang.psi.YaElementType;

public class YaTokenTypes {
  private YaTokenTypes() {
  }

  public static final YaElementType IDENTIFIER = new YaElementType("IDENTIFIER");
  public static final YaElementType LINE_BREAK = new YaElementType("LINE_BREAK");
  public static final YaElementType STATEMENT_BREAK = new YaElementType("STATEMENT_BREAK");
  public static final YaElementType SPACE = new YaElementType("SPACE");
  public static final YaElementType TAB = new YaElementType("TAB");
  public static final YaElementType FORMFEED = new YaElementType("FORMFEED");
  public static final IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
  public static final YaElementType INCONSISTENT_DEDENT = new YaElementType("INCONSISTENT_DEDENT");

  public static final YaElementType END_OF_LINE_COMMENT = new YaElementType("END_OF_LINE_COMMENT");

  public static final YaElementType AND_KEYWORD = new YaElementType("AND_KEYWORD");
  public static final YaElementType AS_KEYWORD = new YaElementType("AS_KEYWORD");
  public static final YaElementType ASSERT_KEYWORD = new YaElementType("ASSERT_KEYWORD");
  public static final YaElementType BREAK_KEYWORD = new YaElementType("BREAK_KEYWORD");
  public static final YaElementType CLASS_KEYWORD = new YaElementType("CLASS_KEYWORD");
  public static final YaElementType CONTINUE_KEYWORD = new YaElementType("CONTINUE_KEYWORD");
  public static final YaElementType DEF_KEYWORD = new YaElementType("DEF_KEYWORD");
  public static final YaElementType DEL_KEYWORD = new YaElementType("DEL_KEYWORD");
  public static final YaElementType ELIF_KEYWORD = new YaElementType("ELIF_KEYWORD");
  public static final YaElementType ELSE_KEYWORD = new YaElementType("ELSE_KEYWORD");
  public static final YaElementType EXCEPT_KEYWORD = new YaElementType("EXCEPT_KEYWORD");
  public static final YaElementType EXEC_KEYWORD = new YaElementType("EXEC_KEYWORD");
  public static final YaElementType FINALLY_KEYWORD = new YaElementType("FINALLY_KEYWORD");
  public static final YaElementType FOR_KEYWORD = new YaElementType("FOR_KEYWORD");
  public static final YaElementType FROM_KEYWORD = new YaElementType("FROM_KEYWORD");
  public static final YaElementType GLOBAL_KEYWORD = new YaElementType("GLOBAL_KEYWORD");
  public static final YaElementType IF_KEYWORD = new YaElementType("IF_KEYWORD");
  public static final YaElementType IMPORT_KEYWORD = new YaElementType("IMPORT_KEYWORD");
  public static final YaElementType IN_KEYWORD = new YaElementType("IN_KEYWORD", "__contains__");
  public static final YaElementType IS_KEYWORD = new YaElementType("IS_KEYWORD");
  public static final YaElementType LAMBDA_KEYWORD = new YaElementType("LAMBDA_KEYWORD");
  public static final YaElementType NOT_KEYWORD = new YaElementType("NOT_KEYWORD");
  public static final YaElementType OR_KEYWORD = new YaElementType("OR_KEYWORD");
  public static final YaElementType PASS_KEYWORD = new YaElementType("PASS_KEYWORD");
  public static final YaElementType PRINT_KEYWORD = new YaElementType("PRINT_KEYWORD");
  public static final YaElementType RAISE_KEYWORD = new YaElementType("RAISE_KEYWORD");
  public static final YaElementType RETURN_KEYWORD = new YaElementType("RETURN_KEYWORD");
  public static final YaElementType TRY_KEYWORD = new YaElementType("TRY_KEYWORD");
  public static final YaElementType WITH_KEYWORD = new YaElementType("WITH_KEYWORD");
  public static final YaElementType WHILE_KEYWORD = new YaElementType("WHILE_KEYWORD");
  public static final YaElementType YIELD_KEYWORD = new YaElementType("YIELD_KEYWORD");

  // new keywords in YaLangthon 3
  public static final YaElementType NONE_KEYWORD = new YaElementType("NONE_KEYWORD");
  public static final YaElementType TRUE_KEYWORD = new YaElementType("TRUE_KEYWORD");
  public static final YaElementType FALSE_KEYWORD = new YaElementType("FALSE_KEYWORD");
  public static final YaElementType NONLOCAL_KEYWORD = new YaElementType("NONLOCAL_KEYWORD");
  public static final YaElementType DEBUG_KEYWORD = new YaElementType("DEBUG_KEYWORD");
  public static final YaElementType ASYNC_KEYWORD = new YaElementType("ASYNC_KEYWORD");
  public static final YaElementType AWAIT_KEYWORD = new YaElementType("AWAIT_KEYWORD", "__await__");

  public static final TokenSet PREDEFINED_KEYWORDS = TokenSet.create(
          AND_KEYWORD, AS_KEYWORD, ASSERT_KEYWORD, BREAK_KEYWORD, CLASS_KEYWORD, CONTINUE_KEYWORD, DEF_KEYWORD,
          DEL_KEYWORD, ELIF_KEYWORD, ELSE_KEYWORD, EXCEPT_KEYWORD, FINALLY_KEYWORD, FOR_KEYWORD, FROM_KEYWORD,
          GLOBAL_KEYWORD, IF_KEYWORD, IMPORT_KEYWORD, IN_KEYWORD, IS_KEYWORD, LAMBDA_KEYWORD, NOT_KEYWORD,
          OR_KEYWORD, PASS_KEYWORD, RAISE_KEYWORD, RETURN_KEYWORD, TRY_KEYWORD, WITH_KEYWORD, WHILE_KEYWORD,
          YIELD_KEYWORD, NONE_KEYWORD, TRUE_KEYWORD, FALSE_KEYWORD, NONLOCAL_KEYWORD, ASYNC_KEYWORD, AWAIT_KEYWORD);

  public static final YaElementType INTEGER_LITERAL = new YaElementType("INTEGER_LITERAL");
  public static final YaElementType FLOAT_LITERAL = new YaElementType("FLOAT_LITERAL");
  public static final YaElementType IMAGINARY_LITERAL = new YaElementType("IMAGINARY_LITERAL");

  public static final YaElementType SINGLE_QUOTED_STRING = new YaElementType("SINGLE_QUOTED_STRING");
  public static final YaElementType TRIPLE_QUOTED_STRING = new YaElementType("TRIPLE_QUOTED_STRING");
  public static final YaElementType SINGLE_QUOTED_UNICODE = new YaElementType("SINGLE_QUOTED_UNICODE");
  public static final YaElementType TRIPLE_QUOTED_UNICODE = new YaElementType("TRIPLE_QUOTED_UNICODE");

  public static final YaElementType DOCSTRING = new YaElementType("DOCSTRING");

  public static final TokenSet UNICODE_NODES = TokenSet.create(TRIPLE_QUOTED_UNICODE, SINGLE_QUOTED_UNICODE);
  public static final TokenSet TRIPLE_NODES = TokenSet.create(TRIPLE_QUOTED_UNICODE, TRIPLE_QUOTED_STRING);
  public static final TokenSet STRING_NODES = TokenSet.orSet(UNICODE_NODES, TokenSet.create(SINGLE_QUOTED_STRING,
                                                             TRIPLE_QUOTED_STRING, DOCSTRING));
  // Operators
  public static final YaElementType PLUS = new YaElementType("PLUS", "__add__");// +
  public static final YaElementType MINUS = new YaElementType("MINUS", "__sub__");// -
  public static final YaElementType MULT = new YaElementType("MULT", "__mul__");// *
  public static final YaElementType EXP = new YaElementType("EXP", "__pow__");// **
  public static final YaElementType DIV = new YaElementType("DIV", "__div__"); // /
  public static final YaElementType FLOORDIV = new YaElementType("FLOORDIV", "__floordiv__"); // //
  public static final YaElementType PERC = new YaElementType("PERC", "__mod__");// %
  public static final YaElementType LTLT = new YaElementType("LTLT", "__lshift__");// <<
  public static final YaElementType GTGT = new YaElementType("GTGT", "__rshift__");// >>
  public static final YaElementType AND = new YaElementType("AND", "__and__");// &
  public static final YaElementType OR = new YaElementType("OR", "__or__");// |
  public static final YaElementType XOR = new YaElementType("XOR", "__xor__");// ^
  public static final YaElementType TILDE = new YaElementType("TILDE", "__invert__");// ~
  public static final YaElementType LT = new YaElementType("LT", "__lt__");// <
  public static final YaElementType GT = new YaElementType("GT", "__gt__");// >
  public static final YaElementType LE = new YaElementType("LE", "__le__");// <=
  public static final YaElementType GE = new YaElementType("GE", "__ge__");// >=
  public static final YaElementType EQEQ = new YaElementType("EQEQ", "__eq__");// ==
  public static final YaElementType NE = new YaElementType("NE", "__ne__");// !=
  public static final YaElementType NE_OLD = new YaElementType("NE_OLD", "__ne__");// <>

  // Delimiters
  public static final YaElementType LPAR = new YaElementType("LPAR");// (
  public static final YaElementType RPAR = new YaElementType("RPAR");// )
  public static final YaElementType LBRACKET = new YaElementType("LBRACKET");// [
  public static final YaElementType RBRACKET = new YaElementType("RBRACKET");// ]
  public static final YaElementType LBRACE = new YaElementType("LBRACE");// {
  public static final YaElementType RBRACE = new YaElementType("RBRACE");// }
  public static final YaElementType AT = new YaElementType("AT", "__matmul__");// @
  public static final YaElementType COMMA = new YaElementType("COMMA");// ,
  public static final YaElementType COLON = new YaElementType("COLON");// :
  public static final YaElementType DOT = new YaElementType("DOT");// .
  public static final YaElementType TICK = new YaElementType("TICK");// `
  public static final YaElementType EQ = new YaElementType("EQ");// =
  public static final YaElementType SEMICOLON = new YaElementType("SEMICOLON");// ;
  public static final YaElementType PLUSEQ = new YaElementType("PLUSEQ");// +=
  public static final YaElementType MINUSEQ = new YaElementType("MINUSEQ");// -=
  public static final YaElementType MULTEQ = new YaElementType("MULTEQ");// *=
  public static final YaElementType ATEQ = new YaElementType("ATEQ"); // @=
  public static final YaElementType DIVEQ = new YaElementType("DIVEQ"); // /=
  public static final YaElementType FLOORDIVEQ = new YaElementType("FLOORDIVEQ"); // //=
  public static final YaElementType PERCEQ = new YaElementType("PERCEQ");// %=
  public static final YaElementType ANDEQ = new YaElementType("ANDEQ");// &=
  public static final YaElementType OREQ = new YaElementType("OREQ");// |=
  public static final YaElementType XOREQ = new YaElementType("XOREQ");// ^=
  public static final YaElementType LTLTEQ = new YaElementType("LTLTEQ");// <<=
  public static final YaElementType GTGTEQ = new YaElementType("GTGTEQ");// >>=
  public static final YaElementType EXPEQ = new YaElementType("EXPEQ");// **=
  public static final YaElementType RARROW = new YaElementType("RARROW");// ->

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

  public static final YaElementType BACKSLASH = new YaElementType("BACKSLASH");

  public static final YaElementType INDENT = new YaElementType("INDENT");
  public static final YaElementType DEDENT = new YaElementType("DEDENT");

  public static final YaElementType FSTRING_TEXT = new YaElementType("FSTRING_TEXT");
  public static final YaElementType FSTRING_START = new YaElementType("FSTRING_START");
  public static final YaElementType FSTRING_END = new YaElementType("FSTRING_END");
  public static final YaElementType FSTRING_FRAGMENT_START = new YaElementType("FSTRING_FRAGMENT_START");
  public static final YaElementType FSTRING_FRAGMENT_END = new YaElementType("FSTRING_FRAGMENT_END");
  public static final YaElementType FSTRING_FRAGMENT_FORMAT_START = new YaElementType("FSTRING_FRAGMENT_FORMAT_START");
  public static final YaElementType FSTRING_FRAGMENT_TYPE_CONVERSION = new YaElementType("FSTRING_FRAGMENT_TYPE_CONVERSION");
}
