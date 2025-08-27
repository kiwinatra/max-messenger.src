package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final LineReader INSTANCE = new LineReader();
    private static final ByteBuffer byteBuf;
    private static final byte[] bytes;
    private static final CharBuffer charBuf;
    private static final char[] chars;
    private static CharsetDecoder decoder;
    private static boolean directEOL;
    private static final StringBuilder sb = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        byteBuf = ByteBuffer.wrap(bArr);
        charBuf = CharBuffer.wrap(cArr);
    }

    private LineReader() {
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int decode(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            if (decode.isError()) {
                resetAll();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i = position - 1;
            sb2.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private final int decodeEndOfInput(int i, int i2) {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(i);
        charBuf.position(i2);
        int decode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return decode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void trimStringBuilder() {
        StringBuilder sb2 = sb;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        decoder = charset.newDecoder();
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == 10) {
            z = true;
        }
        directEOL = z;
        resetAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (sb.length() != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0 != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r2 != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10 = decodeEndOfInput(r0, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC, Splitter:B:49:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0028 A[EDGE_INSN: B:62:0x0028->B:15:0x0028 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String readLine(java.io.InputStream r10, java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.nio.charset.CharsetDecoder r0 = decoder     // Catch:{ all -> 0x0014 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            if (r0 != 0) goto L_0x0009
            r0 = r1
        L_0x0009:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x0014 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x001a
            goto L_0x0017
        L_0x0014:
            r10 = move-exception
            goto L_0x00b1
        L_0x0017:
            r9.updateCharset(r11)     // Catch:{ all -> 0x0014 }
        L_0x001a:
            r11 = 0
            r0 = r11
            r2 = r0
        L_0x001d:
            int r3 = r10.read()     // Catch:{ all -> 0x0014 }
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L_0x003b
            java.lang.StringBuilder r10 = sb     // Catch:{ all -> 0x0014 }
            int r10 = r10.length()     // Catch:{ all -> 0x0014 }
            if (r10 != 0) goto L_0x0036
            if (r0 != 0) goto L_0x0036
            if (r2 != 0) goto L_0x0036
            monitor-exit(r9)
            return r1
        L_0x0036:
            int r10 = r9.decodeEndOfInput(r0, r2)     // Catch:{ all -> 0x0014 }
            goto L_0x0069
        L_0x003b:
            byte[] r5 = bytes     // Catch:{ all -> 0x0014 }
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch:{ all -> 0x0014 }
            r5[r0] = r8     // Catch:{ all -> 0x0014 }
            if (r3 == r6) goto L_0x004d
            if (r7 == r4) goto L_0x004d
            boolean r0 = directEOL     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = r7
            goto L_0x001d
        L_0x004d:
            java.nio.ByteBuffer r0 = byteBuf     // Catch:{ all -> 0x0014 }
            r0.limit(r7)     // Catch:{ all -> 0x0014 }
            java.nio.CharBuffer r3 = charBuf     // Catch:{ all -> 0x0014 }
            r3.position(r2)     // Catch:{ all -> 0x0014 }
            int r2 = r9.decode(r11)     // Catch:{ all -> 0x0014 }
            if (r2 <= 0) goto L_0x00ab
            char[] r3 = chars     // Catch:{ all -> 0x0014 }
            int r5 = r2 + -1
            char r3 = r3[r5]     // Catch:{ all -> 0x0014 }
            if (r3 != r6) goto L_0x00ab
            r0.position(r11)     // Catch:{ all -> 0x0014 }
            r10 = r2
        L_0x0069:
            if (r10 <= 0) goto L_0x0083
            char[] r0 = chars     // Catch:{ all -> 0x0014 }
            int r1 = r10 + -1
            char r1 = r0[r1]     // Catch:{ all -> 0x0014 }
            if (r1 != r6) goto L_0x0083
            int r1 = r10 + -1
            if (r1 <= 0) goto L_0x0082
            int r2 = r10 + -2
            char r0 = r0[r2]     // Catch:{ all -> 0x0014 }
            r2 = 13
            if (r0 != r2) goto L_0x0082
            int r10 = r10 + -2
            goto L_0x0083
        L_0x0082:
            r10 = r1
        L_0x0083:
            java.lang.StringBuilder r0 = sb     // Catch:{ all -> 0x0014 }
            int r1 = r0.length()     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0014 }
            char[] r1 = chars     // Catch:{ all -> 0x0014 }
            r0.<init>(r1, r11, r10)     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r0
        L_0x0094:
            char[] r1 = chars     // Catch:{ all -> 0x0014 }
            r0.append(r1, r11, r10)     // Catch:{ all -> 0x0014 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0014 }
            int r1 = r0.length()     // Catch:{ all -> 0x0014 }
            if (r1 <= r4) goto L_0x00a6
            r9.trimStringBuilder()     // Catch:{ all -> 0x0014 }
        L_0x00a6:
            r0.setLength(r11)     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r10
        L_0x00ab:
            int r0 = r9.compactBytes()     // Catch:{ all -> 0x0014 }
            goto L_0x001d
        L_0x00b1:
            monitor-exit(r9)     // Catch:{ all -> 0x0014 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
