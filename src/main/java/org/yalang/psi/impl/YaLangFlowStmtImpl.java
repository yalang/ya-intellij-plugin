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

public class YaLangFlowStmtImpl extends ASTWrapperPsiElement implements YaLangFlowStmt {

  public YaLangFlowStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitFlowStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLangBreakStmt getBreakStmt() {
    return findChildByClass(YaLangBreakStmt.class);
  }

  @Override
  @Nullable
  public YaLangContinueStmt getContinueStmt() {
    return findChildByClass(YaLangContinueStmt.class);
  }

  @Override
  @Nullable
  public YaLangRaiseStmt getRaiseStmt() {
    return findChildByClass(YaLangRaiseStmt.class);
  }

  @Override
  @Nullable
  public YaLangReturnStmt getReturnStmt() {
    return findChildByClass(YaLangReturnStmt.class);
  }

  @Override
  @Nullable
  public YaLangYieldStmt getYieldStmt() {
    return findChildByClass(YaLangYieldStmt.class);
  }

}
