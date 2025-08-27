package defpackage;

import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import kotlin.uuid.Uuid;
import org.json.HTTP;

/* renamed from: e57  reason: default package */
public abstract class e57 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        Charset charset = Charsets.UTF_8;
        a = HTTP.CRLF.getBytes(charset);
        b = "--".getBytes(charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r2 = r7.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r2 == '\"') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r2 == '\\') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != 13) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r6.append('\\');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r6.append(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1 >= r7.length()) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.StringBuilder r6, java.lang.String r7) {
        /*
            r0 = 34
            r6.append(r0)
            r1 = 0
            r2 = r1
        L_0x0007:
            int r3 = r7.length()
            if (r2 >= r3) goto L_0x0038
            char r3 = r7.charAt(r2)
            r4 = 13
            r5 = 92
            if (r3 == r0) goto L_0x001f
            if (r3 == r5) goto L_0x001f
            if (r3 != r4) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x001f:
            int r2 = r7.length()
            if (r1 >= r2) goto L_0x003b
            char r2 = r7.charAt(r1)
            if (r2 == r0) goto L_0x002f
            if (r2 == r5) goto L_0x002f
            if (r2 != r4) goto L_0x0032
        L_0x002f:
            r6.append(r5)
        L_0x0032:
            r6.append(r2)
            int r1 = r1 + 1
            goto L_0x001f
        L_0x0038:
            r6.append(r7)
        L_0x003b:
            r6.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e57.a(java.lang.StringBuilder, java.lang.String):void");
    }

    public static final int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            i += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : 3;
        }
        return i;
    }

    public static final void c(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt <= 2047) {
                outputStream.write((charAt >> 6) | 192);
                outputStream.write((charAt & '?') | 128);
            } else {
                outputStream.write((charAt >> 12) | 224);
                outputStream.write(((charAt >> 6) & 63) | Uuid.SIZE_BITS);
                outputStream.write((charAt & '?') | 128);
            }
        }
    }
}
