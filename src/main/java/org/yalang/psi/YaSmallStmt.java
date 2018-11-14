// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaSmallStmt extends PsiElement {

  @Nullable
  YaAssertStmt getAssertStmt();

  @Nullable
  YaDelStmt getDelStmt();

  @Nullable
  YaExprStmt getExprStmt();

  @Nullable
  YaFlowStmt getFlowStmt();

  @Nullable
  YaGlobalStmt getGlobalStmt();

  @Nullable
  YaImportStmt getImportStmt();

  @Nullable
  YaNonlocalStmt getNonlocalStmt();

  @Nullable
  YaPassStmt getPassStmt();

}
