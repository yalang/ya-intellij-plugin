package org.yalang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class YaFile extends PsiFileBase {
    public YaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, YaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return YaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ya File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
