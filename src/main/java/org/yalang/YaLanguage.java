package org.yalang;

import com.intellij.lang.Language;

public class YaLanguage extends Language {
    public static final YaLanguage INSTANCE = new YaLanguage();

    private YaLanguage() {
        super("Ya");
    }
}
