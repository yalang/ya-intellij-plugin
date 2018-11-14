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

public class YaTestImpl extends ASTWrapperPsiElement implements YaTest {

  public YaTestImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitTest(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLambdef getLambdef() {
    return findChildByClass(YaLambdef.class);
  }

  @Override
  @NotNull
  public List<YaOrTest> getOrTestList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YaOrTest.class);
  }

  @Override
  @Nullable
  public YaTest getTest() {
    return findChildByClass(YaTest.class);
  }

}
