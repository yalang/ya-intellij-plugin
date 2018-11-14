package org.yalang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import org.yalang.YaIcons;
import org.yalang.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class YaPsiImplUtil {
    public static String getKey(YaProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(YaTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(YaProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(YaTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
