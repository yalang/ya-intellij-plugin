package org.yalang.psi;

import com.intellij.psi.tree.IElementType;
import org.yalang.YaLanguage;
import org.jetbrains.annotations.*;

public class YaTokenType extends IElementType {
    public YaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, YaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "YaLangTokenType." + super.toString();
    }
}
