package org.yalang;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.yalang.psi.*;

import java.util.*;

public class YaUtil {
    public static List<YaProperty> findProperties(Project project, String key) {
        List<YaProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, YaFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            YaFile simpleFile = (YaFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                YaProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, YaProperty.class);
                if (properties != null) {
                    for (YaProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<YaProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<YaProperty>emptyList();
    }

    public static List<YaProperty> findProperties(Project project) {
        List<YaProperty> result = new ArrayList<YaProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, YaFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            YaFile simpleFile = (YaFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                YaProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, YaProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
