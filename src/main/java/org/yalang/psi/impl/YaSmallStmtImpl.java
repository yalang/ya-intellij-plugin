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

public class YaSmallStmtImpl extends ASTWrapperPsiElement implements YaSmallStmt {

  public YaSmallStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitSmallStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaAssertStmt getAssertStmt() {
    return findChildByClass(YaAssertStmt.class);
  }

  @Override
  @Nullable
  public YaDelStmt getDelStmt() {
    return findChildByClass(YaDelStmt.class);
  }

  @Override
  @Nullable
  public YaExprStmt getExprStmt() {
    return findChildByClass(YaExprStmt.class);
  }

  @Override
  @Nullable
  public YaFlowStmt getFlowStmt() {
    return findChildByClass(YaFlowStmt.class);
  }

  @Override
  @Nullable
  public YaGlobalStmt getGlobalStmt() {
    return findChildByClass(YaGlobalStmt.class);
  }

  @Override
  @Nullable
  public YaImportStmt getImportStmt() {
    return findChildByClass(YaImportStmt.class);
  }

  @Override
  @Nullable
  public YaNonlocalStmt getNonlocalStmt() {
    return findChildByClass(YaNonlocalStmt.class);
  }

  @Override
  @Nullable
  public YaPassStmt getPassStmt() {
    return findChildByClass(YaPassStmt.class);
  }

}
