// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaFlowStmt extends PsiElement {

  @Nullable
  YaBreakStmt getBreakStmt();

  @Nullable
  YaContinueStmt getContinueStmt();

  @Nullable
  YaRaiseStmt getRaiseStmt();

  @Nullable
  YaReturnStmt getReturnStmt();

  @Nullable
  YaYieldStmt getYieldStmt();

}
