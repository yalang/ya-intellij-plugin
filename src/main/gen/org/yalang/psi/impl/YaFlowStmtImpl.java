// This is a generated file. Not intended for manual editing.
package org.yalang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.yalang.psi.YaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.yalang.psi.*;

public class YaFlowStmtImpl extends ASTWrapperPsiElement implements YaFlowStmt {

  public YaFlowStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitFlowStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaBreakStmt getBreakStmt() {
    return findChildByClass(YaBreakStmt.class);
  }

  @Override
  @Nullable
  public YaContinueStmt getContinueStmt() {
    return findChildByClass(YaContinueStmt.class);
  }

  @Override
  @Nullable
  public YaRaiseStmt getRaiseStmt() {
    return findChildByClass(YaRaiseStmt.class);
  }

  @Override
  @Nullable
  public YaReturnStmt getReturnStmt() {
    return findChildByClass(YaReturnStmt.class);
  }

  @Override
  @Nullable
  public YaYieldStmt getYieldStmt() {
    return findChildByClass(YaYieldStmt.class);
  }

}
