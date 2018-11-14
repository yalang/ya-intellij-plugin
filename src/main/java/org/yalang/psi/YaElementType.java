package org.yalang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.yalang.YaLanguage;
import org.jetbrains.annotations.*;

import java.lang.reflect.Constructor;

public class YaElementType extends IElementType {
    protected Class<? extends PsiElement> myPsiElementClass;
    private static final Class[] PARAMETER_TYPES = new Class[]{ASTNode.class};
    private Constructor<? extends PsiElement> myConstructor;

    private String mySpecialMethodName;

    public YaElementType(@NotNull @NonNls String debugName) {
        super(debugName, YaLanguage.INSTANCE);
    }
    public YaElementType(@NotNull @NonNls String debugName, @NotNull Class<? extends PsiElement> psiElementClass) {
        this(debugName);
        myPsiElementClass = psiElementClass;
    }

    public YaElementType(@NotNull @NonNls String debugName, @NotNull @NonNls String specialMethodName) {
        this(debugName);
        mySpecialMethodName = specialMethodName;
    }

    @NotNull
    public PsiElement createElement(@NotNull ASTNode node) {
        if (myPsiElementClass == null) {
            throw new IllegalStateException("Cannot create an element for " + node.getElementType() + " without element class");
        }
        try {
            if (myConstructor == null) {
                myConstructor = myPsiElementClass.getConstructor(PARAMETER_TYPES);
            }
            return myConstructor.newInstance(node);
        }
        catch (Exception e) {
            throw new IllegalStateException("No necessary constructor for " + node.getElementType(), e);
        }
    }

    /**
     * @return name of special method for operation marked by this token; e.g. "__add__" for "+".
     */
    @Nullable
    public String getSpecialMethodName() {
        return mySpecialMethodName;
    }

    @Override
    public String toString() {
        return "Ya:" + super.toString();
    }
}
