package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1288#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r5.delete() == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyRecursively(java.io.File r11, java.io.File r12, boolean r13, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
        /*
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001f
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            return r1
        L_0x001f:
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt__FileTreeWalkKt.walkTopDown(r11)     // Catch:{ TerminateException -> 0x00c8 }
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch:{ TerminateException -> 0x00c8 }
            r3.<init>(r14)     // Catch:{ TerminateException -> 0x00c8 }
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch:{ TerminateException -> 0x00c8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ TerminateException -> 0x00c8 }
        L_0x0030:
            boolean r3 = r0.hasNext()     // Catch:{ TerminateException -> 0x00c8 }
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r0.next()     // Catch:{ TerminateException -> 0x00c8 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ TerminateException -> 0x00c8 }
            boolean r4 = r3.exists()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 != 0) goto L_0x0057
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r6 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch:{ TerminateException -> 0x00c8 }
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00c8 }
            if (r3 != r4) goto L_0x0030
            return r2
        L_0x0057:
            java.lang.String r4 = toRelativeString(r3, r11)     // Catch:{ TerminateException -> 0x00c8 }
            java.io.File r5 = new java.io.File     // Catch:{ TerminateException -> 0x00c8 }
            r5.<init>(r12, r4)     // Catch:{ TerminateException -> 0x00c8 }
            boolean r4 = r5.exists()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 == 0) goto L_0x0098
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 == 0) goto L_0x0072
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 != 0) goto L_0x0098
        L_0x0072:
            if (r13 != 0) goto L_0x0075
            goto L_0x0088
        L_0x0075:
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 == 0) goto L_0x0082
            boolean r4 = deleteRecursively(r5)     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 != 0) goto L_0x0098
            goto L_0x0088
        L_0x0082:
            boolean r4 = r5.delete()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 != 0) goto L_0x0098
        L_0x0088:
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch:{ TerminateException -> 0x00c8 }
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00c8 }
            if (r3 != r4) goto L_0x0030
            return r2
        L_0x0098:
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00c8 }
            if (r4 == 0) goto L_0x00a2
            r5.mkdirs()     // Catch:{ TerminateException -> 0x00c8 }
            goto L_0x0030
        L_0x00a2:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00c8 }
            long r4 = r4.length()     // Catch:{ TerminateException -> 0x00c8 }
            long r6 = r3.length()     // Catch:{ TerminateException -> 0x00c8 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            java.io.IOException r4 = new java.io.IOException     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ TerminateException -> 0x00c8 }
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch:{ TerminateException -> 0x00c8 }
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00c8 }
            if (r3 != r4) goto L_0x0030
            return r2
        L_0x00c7:
            return r1
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__UtilsKt.copyRecursively(java.io.File, java.io.File, boolean, kotlin.jvm.functions.Function2):boolean");
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = FilesKt__UtilsKt$copyRecursively$1.INSTANCE;
        }
        return copyRecursively(file, file2, z, function2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        kotlin.io.CloseableKt.closeFinally(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0066, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File copyTo(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0067
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0025
            if (r8 == 0) goto L_0x001d
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x0015
            goto L_0x0025
        L_0x0015:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x001d:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0025:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x003a
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x0032
            goto L_0x0057
        L_0x0032:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x003a:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x0043
            r8.mkdirs()
        L_0x0043:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0058 }
            r6.<init>(r7)     // Catch:{ all -> 0x0058 }
            kotlin.io.ByteStreamsKt.copyTo(r8, r6, r9)     // Catch:{ all -> 0x005a }
            r9 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r9)     // Catch:{ all -> 0x0058 }
            kotlin.io.CloseableKt.closeFinally(r8, r9)
        L_0x0057:
            return r7
        L_0x0058:
            r6 = move-exception
            goto L_0x0061
        L_0x005a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x005c }
        L_0x005c:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0061:
            throw r6     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r6)
            throw r7
        L_0x0067:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__UtilsKt.copyTo(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return copyTo(file, file2, z, i);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File createTempDir(String str, String str2, File file) {
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File createTempFile(String str, String str2, File file) {
        return File.createTempFile(str, str2, file);
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static boolean deleteRecursively(File file) {
        Iterator it = FilesKt__FileTreeWalkKt.walkBottomUp(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    public static final boolean endsWith(File file, File file2) {
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (components2.isRooted()) {
            return Intrinsics.areEqual((Object) file, (Object) file2);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final String getExtension(File file) {
        return StringsKt__StringsKt.substringAfterLast(file.getName(), '.', "");
    }

    public static final String getInvariantSeparatorsPath(File file) {
        char c = File.separatorChar;
        String path = file.getPath();
        return c != '/' ? StringsKt__StringsJVMKt.replace$default(path, c, '/', false, 4, (Object) null) : path;
    }

    public static final String getNameWithoutExtension(File file) {
        return StringsKt__StringsKt.substringBeforeLast$default(file.getName(), ".", (String) null, 2, (Object) null);
    }

    public static final File normalize(File file) {
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        return resolve(components.getRoot(), CollectionsKt___CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt((List<? extends File>) components.getSegments()), File.separator, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt((List<? extends File>) filePathComponents.getSegments()));
    }

    public static final File relativeTo(File file, File file2) {
        return new File(toRelativeString(file, file2));
    }

    public static final File relativeToOrNull(File file, File file2) {
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File file2) {
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final File resolve(File file, File file2) {
        if (FilesKt__FilePathComponentsKt.isRooted(file2)) {
            return file2;
        }
        String file3 = file.toString();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt__StringsKt.endsWith$default((CharSequence) file3, c, false, 2, (Object) null)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static final File resolveSibling(File file, File file2) {
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), file2);
    }

    public static final boolean startsWith(File file, File file2) {
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (Intrinsics.areEqual((Object) components.getRoot(), (Object) components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final String toRelativeString(File file, File file2) {
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        FilePathComponents normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file));
        FilePathComponents normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file2));
        if (!Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt.getRoot(), (Object) normalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = normalize$FilesKt__UtilsKt2.getSize();
        int size2 = normalize$FilesKt__UtilsKt.getSize();
        int min = Math.min(size2, size);
        int i = 0;
        while (i < min && Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt.getSegments().get(i), (Object) normalize$FilesKt__UtilsKt2.getSegments().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (!Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt2.getSegments().get(i2).getName(), (Object) "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(File.separatorChar);
            }
            Appendable unused = CollectionsKt___CollectionsKt.joinTo$default(CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i), sb, File.separator, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 124, (Object) null);
        }
        return sb.toString();
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual((Object) name, (Object) ".")) {
                if (!Intrinsics.areEqual((Object) name, (Object) "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual((Object) ((File) CollectionsKt.last(arrayList)).getName(), (Object) "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static File resolve(File file, String str) {
        return resolve(file, new File(str));
    }

    public static final File resolveSibling(File file, String str) {
        return resolveSibling(file, new File(str));
    }

    public static final boolean startsWith(File file, String str) {
        return startsWith(file, new File(str));
    }

    public static final boolean endsWith(File file, String str) {
        return endsWith(file, new File(str));
    }
}
