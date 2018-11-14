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

public class YaCompoundStmtImpl extends ASTWrapperPsiElement implements YaCompoundStmt {

  public YaCompoundStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitCompoundStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaAsyncStmt getAsyncStmt() {
    return findChildByClass(YaAsyncStmt.class);
  }

  @Override
  @Nullable
  public YaClassdef getClassdef() {
    return findChildByClass(YaClassdef.class);
  }

  @Override
  @Nullable
  public YaDecorated getDecorated() {
    return findChildByClass(YaDecorated.class);
  }

  @Override
  @Nullable
  public YaForStmt getForStmt() {
    return findChildByClass(YaForStmt.class);
  }

  @Override
  @Nullable
  public YaFuncdef getFuncdef() {
    return findChildByClass(YaFuncdef.class);
  }

  @Override
  @Nullable
  public YaIfStmt getIfStmt() {
    return findChildByClass(YaIfStmt.class);
  }

  @Override
  @Nullable
  public YaTryStmt getTryStmt() {
    return findChildByClass(YaTryStmt.class);
  }

  @Override
  @Nullable
  public YaWhileStmt getWhileStmt() {
    return findChildByClass(YaWhileStmt.class);
  }

  @Override
  @Nullable
  public YaWithStmt getWithStmt() {
    return findChildByClass(YaWithStmt.class);
  }

}
