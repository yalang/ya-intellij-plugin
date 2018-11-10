package org.yalang.psi;

import com.intellij.psi.tree.IElementType;
import org.yalang.YaLang;
import org.jetbrains.annotations.*;

public class YaLangTokenType extends IElementType {
    public YaLangTokenType(@NotNull @NonNls String debugName) {
        super(debugName, YaLang.INSTANCE);
    }

    @Override
    public String toString() {
        return "YaLangTokenType." + super.toString();
    }
}
