// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaExprStmt extends PsiElement {

  @Nullable
  YaAnnassign getAnnassign();

  @Nullable
  YaAugassign getAugassign();

  @Nullable
  YaTestlist getTestlist();

  @NotNull
  List<YaTestlistStarExpr> getTestlistStarExprList();

  @Nullable
  YaYieldExpr getYieldExpr();

}
