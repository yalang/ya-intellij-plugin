// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaDictorsetmaker extends PsiElement {

  @Nullable
  YaCompFor getCompFor();

  @NotNull
  List<YaExpr> getExprList();

  @NotNull
  List<YaStarExpr> getStarExprList();

  @NotNull
  List<YaTest> getTestList();

}
