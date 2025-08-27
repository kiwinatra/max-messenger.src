package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "onPreVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "onVisitFile", "onVisitFileFailed", "Ljava/io/IOException;", "onPostVisitDirectory", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "postVisitDirectory", "dir", "exc", "preVisitDirectory", "attrs", "visitFile", "file", "visitFileFailed", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FileVisitorImpl extends SimpleFileVisitor<Path> {
    private final Function2<Path, IOException, FileVisitResult> onPostVisitDirectory;
    private final Function2<Path, BasicFileAttributes, FileVisitResult> onPreVisitDirectory;
    private final Function2<Path, BasicFileAttributes, FileVisitResult> onVisitFile;
    private final Function2<Path, IOException, FileVisitResult> onVisitFileFailed;

    public FileVisitorImpl(Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2, Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function22, Function2<? super Path, ? super IOException, ? extends FileVisitResult> function23, Function2<? super Path, ? super IOException, ? extends FileVisitResult> function24) {
        this.onPreVisitDirectory = function2;
        this.onVisitFile = function22;
        this.onVisitFileFailed = function23;
        this.onPostVisitDirectory = function24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.invoke(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path r2, java.io.IOException r3) {
        /*
            r1 = this;
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.onPostVisitDirectory
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.nio.file.FileVisitResult r0 = super.postVisitDirectory(r2, r3)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.FileVisitorImpl.postVisitDirectory(java.nio.file.Path, java.io.IOException):java.nio.file.FileVisitResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.invoke(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
        /*
            r1 = this;
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.onPreVisitDirectory
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.nio.file.FileVisitResult r0 = super.preVisitDirectory(r2, r3)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.FileVisitorImpl.preVisitDirectory(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes):java.nio.file.FileVisitResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.invoke(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
        /*
            r1 = this;
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.onVisitFile
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.nio.file.FileVisitResult r0 = super.visitFile(r2, r3)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.FileVisitorImpl.visitFile(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes):java.nio.file.FileVisitResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.invoke(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.file.FileVisitResult visitFileFailed(java.nio.file.Path r2, java.io.IOException r3) {
        /*
            r1 = this;
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.onVisitFileFailed
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.nio.file.FileVisitResult r0 = super.visitFileFailed(r2, r3)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.FileVisitorImpl.visitFileFailed(java.nio.file.Path, java.io.IOException):java.nio.file.FileVisitResult");
    }
}
