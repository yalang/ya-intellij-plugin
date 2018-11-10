package org.yalang;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.yalang.psi.*;

import java.util.*;

public class YaLangUtil {
    public static List<YaLangProperty> findProperties(Project project, String key) {
        List<YaLangProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, YaLangFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            YaLangFile simpleFile = (YaLangFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                YaLangProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, YaLangProperty.class);
                if (properties != null) {
                    for (YaLangProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<YaLangProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<YaLangProperty>emptyList();
    }

    public static List<YaLangProperty> findProperties(Project project) {
        List<YaLangProperty> result = new ArrayList<YaLangProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, YaLangFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            YaLangFile simpleFile = (YaLangFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                YaLangProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, YaLangProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
