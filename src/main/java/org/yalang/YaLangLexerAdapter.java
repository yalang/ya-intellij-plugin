package org.yalang;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class YaLangLexerAdapter extends FlexAdapter {
    public YaLangLexerAdapter() {
        super(new YaLangLexer((Reader) null));
    }
}
