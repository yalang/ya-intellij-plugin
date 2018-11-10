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

public class YaLangSmallStmtImpl extends ASTWrapperPsiElement implements YaLangSmallStmt {

  public YaLangSmallStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitSmallStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLangAssertStmt getAssertStmt() {
    return findChildByClass(YaLangAssertStmt.class);
  }

  @Override
  @Nullable
  public YaLangDelStmt getDelStmt() {
    return findChildByClass(YaLangDelStmt.class);
  }

  @Override
  @Nullable
  public YaLangExprStmt getExprStmt() {
    return findChildByClass(YaLangExprStmt.class);
  }

  @Override
  @Nullable
  public YaLangFlowStmt getFlowStmt() {
    return findChildByClass(YaLangFlowStmt.class);
  }

  @Override
  @Nullable
  public YaLangGlobalStmt getGlobalStmt() {
    return findChildByClass(YaLangGlobalStmt.class);
  }

  @Override
  @Nullable
  public YaLangImportStmt getImportStmt() {
    return findChildByClass(YaLangImportStmt.class);
  }

  @Override
  @Nullable
  public YaLangNonlocalStmt getNonlocalStmt() {
    return findChildByClass(YaLangNonlocalStmt.class);
  }

  @Override
  @Nullable
  public YaLangPassStmt getPassStmt() {
    return findChildByClass(YaLangPassStmt.class);
  }

}
