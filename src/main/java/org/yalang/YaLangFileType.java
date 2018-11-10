package org.yalang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class YaLangFileType extends LanguageFileType {
    public static final YaLangFileType INSTANCE = new YaLangFileType();

    private YaLangFileType() {
        super(YaLang.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "YaLang file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "YaLang language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ي";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return YaLangIcons.FILE;
    }
}
