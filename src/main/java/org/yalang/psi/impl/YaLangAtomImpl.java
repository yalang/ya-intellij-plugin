// This is a generated file. Not intended for manual editing.
package org.yalang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.yalang.psi.YaLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.yalang.psi.*;

public class YaLangAtomImpl extends ASTWrapperPsiElement implements YaLangAtom {

  public YaLangAtomImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitAtom(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLangDictorsetmaker getDictorsetmaker() {
    return findChildByClass(YaLangDictorsetmaker.class);
  }

  @Override
  @Nullable
  public YaLangTestlistComp getTestlistComp() {
    return findChildByClass(YaLangTestlistComp.class);
  }

  @Override
  @Nullable
  public YaLangYieldExpr getYieldExpr() {
    return findChildByClass(YaLangYieldExpr.class);
  }

}
