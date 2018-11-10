package org.yalang;

import com.intellij.lang.Language;

public class YaLang extends Language {
    public static final YaLang INSTANCE = new YaLang();

    private YaLang() {
        super("YaLang");
    }
}
