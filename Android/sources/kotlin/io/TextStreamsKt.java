package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\b\u001aB\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001e\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n54#1,4:158\n1#2:162\n1#2:165\n1317#3,2:163\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158,4\n35#1:162\n35#1:163,2\n*E\n"})
@JvmName(name = "TextStreamsKt")
public final class TextStreamsKt {
    @InlineOnly
    private static final BufferedReader buffered(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static /* synthetic */ BufferedReader buffered$default(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static final long copyTo(Reader reader, Writer writer, int i) {
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return copyTo(reader, writer, i);
    }

    public static final void forEachLine(Reader reader, Function1<? super String, Unit> function1) {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, ConstantsKt.DEFAULT_BUFFER_SIZE);
        try {
            for (String invoke : lineSequence(bufferedReader)) {
                function1.invoke(invoke);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, (Throwable) null);
        } catch (Throwable th) {
            CloseableKt.closeFinally(bufferedReader, th);
            throw th;
        }
    }

    public static final Sequence<String> lineSequence(BufferedReader bufferedReader) {
        return SequencesKt.constrainOnce(new LinesSequence(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] readBytes(java.net.URL r2) {
        /*
            java.io.InputStream r2 = r2.openStream()
            byte[] r0 = kotlin.io.ByteStreamsKt.readBytes(r2)     // Catch:{ all -> 0x000d }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            return r0
        L_0x000d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000f }
        L_0x000f:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.TextStreamsKt.readBytes(java.net.URL):byte[]");
    }

    public static final List<String> readLines(Reader reader) {
        ArrayList arrayList = new ArrayList();
        forEachLine(reader, new TextStreamsKt$readLines$1(arrayList));
        return arrayList;
    }

    public static final String readText(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, (Object) null);
        return stringWriter.toString();
    }

    public static /* synthetic */ String readText$default(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new String(readBytes(url), charset);
    }

    @InlineOnly
    private static final StringReader reader(String str) {
        return new StringReader(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T useLines(java.io.Reader r3, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r4) {
        /*
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0007
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x000f
        L_0x0007:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x000f:
            r0 = 0
            r1 = 1
            kotlin.sequences.Sequence r2 = lineSequence(r3)     // Catch:{ all -> 0x002e }
            java.lang.Object r4 = r4.invoke(r2)     // Catch:{ all -> 0x002e }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r1, r1, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r0)
            goto L_0x002a
        L_0x0027:
            r3.close()
        L_0x002a:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r4
        L_0x002e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r1, r1, r0)
            if (r0 != 0) goto L_0x003e
            r3.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0041
        L_0x003e:
            kotlin.io.CloseableKt.closeFinally(r3, r4)
        L_0x0041:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.TextStreamsKt.useLines(java.io.Reader, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    @InlineOnly
    private static final BufferedWriter buffered(Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static /* synthetic */ BufferedWriter buffered$default(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @InlineOnly
    private static final String readText(URL url, Charset charset) {
        return new String(readBytes(url), charset);
    }
}
