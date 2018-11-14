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

public class YaDecoratedImpl extends ASTWrapperPsiElement implements YaDecorated {

  public YaDecoratedImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitDecorated(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaAsyncFuncdef getAsyncFuncdef() {
    return findChildByClass(YaAsyncFuncdef.class);
  }

  @Override
  @Nullable
  public YaClassdef getClassdef() {
    return findChildByClass(YaClassdef.class);
  }

  @Override
  @NotNull
  public YaDecorators getDecorators() {
    return findNotNullChildByClass(YaDecorators.class);
  }

  @Override
  @Nullable
  public YaFuncdef getFuncdef() {
    return findChildByClass(YaFuncdef.class);
  }

}
