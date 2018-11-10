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

public class YaLangForStmtImpl extends ASTWrapperPsiElement implements YaLangForStmt {

  public YaLangForStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitForStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YaLangExprlist getExprlist() {
    return findNotNullChildByClass(YaLangExprlist.class);
  }

  @Override
  @NotNull
  public List<YaLangSuite> getSuiteList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YaLangSuite.class);
  }

  @Override
  @NotNull
  public YaLangTestlist getTestlist() {
    return findNotNullChildByClass(YaLangTestlist.class);
  }

}
