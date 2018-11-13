package org.yalang.lexer;

import com.intellij.lexer.FlexAdapter;
import org.yalang.lexer.YaLangLexer;

import java.io.Reader;

public class YaLangLexerAdapter extends FlexAdapter {
    public YaLangLexerAdapter() {
        super(new YaLangLexer((Reader) null));
    }

    @Override
    public YaLangLexer getFlex() {
        return (YaLangLexer)super.getFlex();
    }
}
