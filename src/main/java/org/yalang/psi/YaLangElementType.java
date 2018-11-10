package org.yalang.psi;

import com.intellij.psi.tree.IElementType;
import org.yalang.YaLang;
import org.jetbrains.annotations.*;

public class YaLangElementType extends IElementType {
    public YaLangElementType(@NotNull @NonNls String debugName) {
        super(debugName, YaLang.INSTANCE);
    }
}
