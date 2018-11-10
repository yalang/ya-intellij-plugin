// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaLangExprStmt extends PsiElement {

  @Nullable
  YaLangAnnassign getAnnassign();

  @Nullable
  YaLangAugassign getAugassign();

  @Nullable
  YaLangTestlist getTestlist();

  @NotNull
  List<YaLangTestlistStarExpr> getTestlistStarExprList();

  @Nullable
  YaLangYieldExpr getYieldExpr();

}
