package org.yalang;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class YaLangFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(YaLangFileType.INSTANCE);
    }
}
