package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath = Paths.get("", new String[0]);
    private static final Path parentPath = Paths.get("..", new String[0]);

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path path2) {
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        int i = 0;
        while (i < min) {
            Path name = normalize.getName(i);
            Path path3 = parentPath;
            if (!Intrinsics.areEqual((Object) name, (Object) path3)) {
                break;
            } else if (Intrinsics.areEqual((Object) normalize2.getName(i), (Object) path3)) {
                i++;
            } else {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (!Intrinsics.areEqual((Object) normalize2, (Object) normalize) && Intrinsics.areEqual((Object) normalize, (Object) emptyPath)) {
            return normalize2;
        }
        String obj = relativize.toString();
        return StringsKt__StringsJVMKt.endsWith$default(obj, relativize.getFileSystem().getSeparator(), false, 2, (Object) null) ? relativize.getFileSystem().getPath(StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
    }
}
