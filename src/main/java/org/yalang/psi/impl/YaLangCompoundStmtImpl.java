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

public class YaLangCompoundStmtImpl extends ASTWrapperPsiElement implements YaLangCompoundStmt {

  public YaLangCompoundStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitCompoundStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLangAsyncStmt getAsyncStmt() {
    return findChildByClass(YaLangAsyncStmt.class);
  }

  @Override
  @Nullable
  public YaLangClassdef getClassdef() {
    return findChildByClass(YaLangClassdef.class);
  }

  @Override
  @Nullable
  public YaLangDecorated getDecorated() {
    return findChildByClass(YaLangDecorated.class);
  }

  @Override
  @Nullable
  public YaLangForStmt getForStmt() {
    return findChildByClass(YaLangForStmt.class);
  }

  @Override
  @Nullable
  public YaLangFuncdef getFuncdef() {
    return findChildByClass(YaLangFuncdef.class);
  }

  @Override
  @Nullable
  public YaLangIfStmt getIfStmt() {
    return findChildByClass(YaLangIfStmt.class);
  }

  @Override
  @Nullable
  public YaLangTryStmt getTryStmt() {
    return findChildByClass(YaLangTryStmt.class);
  }

  @Override
  @Nullable
  public YaLangWhileStmt getWhileStmt() {
    return findChildByClass(YaLangWhileStmt.class);
  }

  @Override
  @Nullable
  public YaLangWithStmt getWithStmt() {
    return findChildByClass(YaLangWithStmt.class);
  }

}
