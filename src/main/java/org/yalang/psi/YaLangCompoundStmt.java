// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaLangCompoundStmt extends PsiElement {

  @Nullable
  YaLangAsyncStmt getAsyncStmt();

  @Nullable
  YaLangClassdef getClassdef();

  @Nullable
  YaLangDecorated getDecorated();

  @Nullable
  YaLangForStmt getForStmt();

  @Nullable
  YaLangFuncdef getFuncdef();

  @Nullable
  YaLangIfStmt getIfStmt();

  @Nullable
  YaLangTryStmt getTryStmt();

  @Nullable
  YaLangWhileStmt getWhileStmt();

  @Nullable
  YaLangWithStmt getWithStmt();

}
