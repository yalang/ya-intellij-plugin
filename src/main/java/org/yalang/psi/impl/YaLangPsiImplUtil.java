package org.yalang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import org.yalang.YaLang;
import org.yalang.YaLangIcons;
import org.yalang.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class YaLangPsiImplUtil {
    public static String getKey(YaLangProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(YaLangTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(YaLangProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(YaLangTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
