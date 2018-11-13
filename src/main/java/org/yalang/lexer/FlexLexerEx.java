package org.yalang.lexer;

import com.intellij.lexer.FlexLexer;

public interface FlexLexerEx extends FlexLexer {

  CharSequence yytext();

  int yylength();

  void yypushback(int number);
}
