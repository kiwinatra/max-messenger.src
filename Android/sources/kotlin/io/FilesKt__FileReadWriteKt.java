package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\b\u001a!\u0010\u0013\u001a\u00020\u0014*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\b\u001aB\u0010\u0015\u001a\u00020\u0007*\u00020\b26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u0017\u001aJ\u0010\u0015\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000326\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u0017\u001a7\u0010\u001d\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00070\u001e\u001a\r\u0010 \u001a\u00020!*\u00020\bH\b\u001a\u0014\u0010\"\u001a\n #*\u0004\u0018\u00010\u00050\u0005*\u00020\u000fH\u0000\u001a\r\u0010$\u001a\u00020%*\u00020\bH\b\u001a\u0017\u0010&\u001a\u00020'*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\b\u001a\n\u0010(\u001a\u00020\n*\u00020\b\u001a\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0**\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010+\u001a\u00020\r*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0017\u0010,\u001a\u00020-*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\b\u001aL\u0010.\u001a\u0002H/\"\u0004\b\u0000\u0010/*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0018\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r01\u0012\u0004\u0012\u0002H/0\u001eH\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00102\u001a\u0012\u00103\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u00104\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u001c\u00105\u001a\u00020\u0007*\u0002062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0017\u00107\u001a\u000208*\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\b\u0002\u0007\n\u0005\b20\u0001¨\u00069"}, d2 = {"byteBufferForEncoding", "Ljava/nio/ByteBuffer;", "chunkSize", "", "encoder", "Ljava/nio/charset/CharsetEncoder;", "appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "newReplaceEncoder", "kotlin.jvm.PlatformType", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writeTextImpl", "Ljava/io/OutputStream;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void appendBytes(java.io.File r2, byte[] r3) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x0010 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0010 }
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return
        L_0x0010:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.appendBytes(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void appendText(java.io.File r2, java.lang.String r3, java.nio.charset.Charset r4) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            writeTextImpl(r0, r3, r4)     // Catch:{ all -> 0x0010 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0010 }
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return
        L_0x0010:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.appendText(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        appendText(file, str, charset);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(File file, Charset charset, int i) {
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(File file, Charset charset, int i) {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    public static ByteBuffer byteBufferForEncoding(int i, CharsetEncoder charsetEncoder) {
        return ByteBuffer.allocate(i * ((int) ((float) Math.ceil((double) charsetEncoder.maxBytesPerChar()))));
    }

    public static final void forEachBlock(File file, Function2<? super byte[], ? super Integer, Unit> function2) {
        forEachBlock(file, ConstantsKt.DEFAULT_BLOCK_SIZE, function2);
    }

    public static final void forEachLine(File file, Charset charset, Function1<? super String, Unit> function1) {
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), function1);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        forEachLine(file, charset, function1);
    }

    @InlineOnly
    private static final FileInputStream inputStream(File file) {
        return new FileInputStream(file);
    }

    public static CharsetEncoder newReplaceEncoder(Charset charset) {
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @InlineOnly
    private static final FileOutputStream outputStream(File file) {
        return new FileOutputStream(file);
    }

    @InlineOnly
    private static final PrintWriter printWriter(File file, Charset charset) {
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), ConstantsKt.DEFAULT_BUFFER_SIZE));
    }

    public static /* synthetic */ PrintWriter printWriter$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), ConstantsKt.DEFAULT_BUFFER_SIZE));
    }

    public static byte[] readBytes(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
                        exposingBufferByteArrayOutputStream.write(read2);
                        ByteStreamsKt.copyTo$default(fileInputStream, exposingBufferByteArrayOutputStream, 0, 2, (Object) null);
                        int size = exposingBufferByteArrayOutputStream.size() + i;
                        if (size >= 0) {
                            bArr = ArraysKt.copyInto(exposingBufferByteArrayOutputStream.getBuffer(), Arrays.copyOf(bArr, size), i, 0, exposingBufferByteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            CloseableKt.closeFinally(fileInputStream, th);
            throw th;
        }
    }

    public static final List<String> readLines(File file, Charset charset) {
        ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new FilesKt__FileReadWriteKt$readLines$1(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readLines(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String readText(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = kotlin.io.TextStreamsKt.readText(r0)     // Catch:{ all -> 0x0013 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            return r2
        L_0x0013:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.readText(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(file, charset);
    }

    @InlineOnly
    private static final InputStreamReader reader(File file, Charset charset) {
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T useLines(java.io.File r2, java.nio.charset.Charset r3, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r4) {
        /*
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r3)
            r3 = 0
            r0 = 1
            kotlin.sequences.Sequence r1 = kotlin.io.TextStreamsKt.lineSequence(r2)     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r4.invoke(r1)     // Catch:{ all -> 0x0030 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r3 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r3)
            if (r3 == 0) goto L_0x0029
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            goto L_0x002c
        L_0x0029:
            r2.close()
        L_0x002c:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r4
        L_0x0030:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r3 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r3)
            if (r3 != 0) goto L_0x0040
            r2.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0043
        L_0x0040:
            kotlin.io.CloseableKt.closeFinally(r2, r4)
        L_0x0043:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.useLines(java.io.File, java.nio.charset.Charset, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object useLines$default(java.io.File r1, java.nio.charset.Charset r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L_0x0006:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r2)
            r2 = 0
            kotlin.sequences.Sequence r4 = kotlin.io.TextStreamsKt.lineSequence(r1)     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r3.invoke(r4)     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 == 0) goto L_0x002e
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L_0x0031
        L_0x002e:
            r1.close()
        L_0x0031:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            return r3
        L_0x0035:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 != 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0048
        L_0x0045:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
        L_0x0048:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.useLines$default(java.io.File, java.nio.charset.Charset, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeBytes(java.io.File r1, byte[] r2) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x000f }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x000f }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x000f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.writeBytes(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeText(java.io.File r1, java.lang.String r2, java.nio.charset.Charset r3) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            writeTextImpl(r0, r2, r3)     // Catch:{ all -> 0x000f }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x000f }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x000f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.writeText(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(file, str, charset);
    }

    public static void writeTextImpl(OutputStream outputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            outputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder newReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer allocate = CharBuffer.allocate(ConstantsKt.DEFAULT_BUFFER_SIZE);
        ByteBuffer byteBufferForEncoding = byteBufferForEncoding(ConstantsKt.DEFAULT_BUFFER_SIZE, newReplaceEncoder);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            str.getChars(i, i3, allocate.array(), i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (newReplaceEncoder.encode(allocate, byteBufferForEncoding, i3 == str.length()).isUnderflow()) {
                outputStream.write(byteBufferForEncoding.array(), 0, byteBufferForEncoding.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                byteBufferForEncoding.clear();
                i = i3;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @InlineOnly
    private static final OutputStreamWriter writer(File file, Charset charset) {
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void forEachBlock(java.io.File r1, int r2, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r3) {
        /*
            r0 = 512(0x200, float:7.175E-43)
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast((int) r2, (int) r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x000d:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x001a }
            if (r1 > 0) goto L_0x001c
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001a }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x001a:
            r1 = move-exception
            goto L_0x0024
        L_0x001c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x001a }
            r3.invoke(r2, r1)     // Catch:{ all -> 0x001a }
            goto L_0x000d
        L_0x0024:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FileReadWriteKt.forEachBlock(java.io.File, int, kotlin.jvm.functions.Function2):void");
    }
}
