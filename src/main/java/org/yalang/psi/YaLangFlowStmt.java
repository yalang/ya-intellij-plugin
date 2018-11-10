// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaLangFlowStmt extends PsiElement {

  @Nullable
  YaLangBreakStmt getBreakStmt();

  @Nullable
  YaLangContinueStmt getContinueStmt();

  @Nullable
  YaLangRaiseStmt getRaiseStmt();

  @Nullable
  YaLangReturnStmt getReturnStmt();

  @Nullable
  YaLangYieldStmt getYieldStmt();

}
