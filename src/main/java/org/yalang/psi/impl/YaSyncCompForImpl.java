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

public class YaSyncCompForImpl extends ASTWrapperPsiElement implements YaSyncCompFor {

  public YaSyncCompForImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitSyncCompFor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaCompIter getCompIter() {
    return findChildByClass(YaCompIter.class);
  }

  @Override
  @NotNull
  public YaExprlist getExprlist() {
    return findNotNullChildByClass(YaExprlist.class);
  }

  @Override
  @NotNull
  public YaOrTest getOrTest() {
    return findNotNullChildByClass(YaOrTest.class);
  }

}
