package org.yalang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class YaLexerAdapter extends FlexAdapter {
    public YaLexerAdapter() {
        super(new YaLexer((Reader) null));
    }

    @Override
    public YaLexer getFlex() {
        return (YaLexer)super.getFlex();
    }
}
