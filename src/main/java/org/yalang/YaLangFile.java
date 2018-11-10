package org.yalang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.yalang.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class YaLangFile extends PsiFileBase {
    public YaLangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, YaLang.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return YaLangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "YaLang File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
