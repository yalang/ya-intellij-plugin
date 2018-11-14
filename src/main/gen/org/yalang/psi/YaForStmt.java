// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaForStmt extends PsiElement {

  @NotNull
  YaExprlist getExprlist();

  @NotNull
  List<YaSuite> getSuiteList();

  @NotNull
  YaTestlist getTestlist();

}
