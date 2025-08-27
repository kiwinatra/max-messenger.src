package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
class FilesKt__FilePathComponentsKt {
    public static final File getRoot(File file) {
        return new File(getRootName(file));
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String str) {
        int k;
        char c = File.separatorChar;
        int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, 0, false, 4, (Object) null);
        if (k2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (k = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int k3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, k + 1, false, 4, (Object) null);
            return k3 >= 0 ? k3 + 1 : str.length();
        } else if (k2 > 0 && str.charAt(k2 - 1) == ':') {
            return k2 + 1;
        } else {
            if (k2 != -1 || !StringsKt__StringsKt.endsWith$default((CharSequence) str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    public static final String getRootName(File file) {
        return file.getPath().substring(0, getRootLength$FilesKt__FilePathComponentsKt(file.getPath()));
    }

    public static final boolean isRooted(File file) {
        return getRootLength$FilesKt__FilePathComponentsKt(file.getPath()) > 0;
    }

    public static final File subPath(File file, int i, int i2) {
        return toComponents(file).subPath(i, i2);
    }

    public static final FilePathComponents toComponents(File file) {
        List list;
        String path = file.getPath();
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        if (substring2.length() == 0) {
            list = CollectionsKt.emptyList();
        } else {
            Iterable<String> x = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(x, 10));
            for (String file2 : x) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new FilePathComponents(new File(substring), list);
    }
}
