package org.yalang;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class YaFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(YaFileType.INSTANCE);
    }
}
