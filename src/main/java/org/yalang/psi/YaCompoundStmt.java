// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaCompoundStmt extends PsiElement {

  @Nullable
  YaAsyncStmt getAsyncStmt();

  @Nullable
  YaClassdef getClassdef();

  @Nullable
  YaDecorated getDecorated();

  @Nullable
  YaForStmt getForStmt();

  @Nullable
  YaFuncdef getFuncdef();

  @Nullable
  YaIfStmt getIfStmt();

  @Nullable
  YaTryStmt getTryStmt();

  @Nullable
  YaWhileStmt getWhileStmt();

  @Nullable
  YaWithStmt getWithStmt();

}
