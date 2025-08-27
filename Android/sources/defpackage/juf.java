package defpackage;

import java.nio.ByteBuffer;

/* renamed from: juf  reason: default package */
public final class juf {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final gq9 b;
    public volatile int c = 0;

    public juf(gq9 gq9, int i) {
        this.b = gq9;
        this.a = i;
    }

    public final int a(int i) {
        yp9 c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.d;
        int i2 = a2 + c2.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        yp9 c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.a;
        return ((ByteBuffer) c2.d).getInt(((ByteBuffer) c2.d).getInt(i) + i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [t8f, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yp9 c() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = d
            java.lang.Object r1 = r0.get()
            yp9 r1 = (defpackage.yp9) r1
            if (r1 != 0) goto L_0x0012
            yp9 r1 = new yp9
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            gq9 r0 = r4.b
            zp9 r0 = r0.a
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005c
            int r3 = r0.a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.a
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.d = r4
            if (r4 == 0) goto L_0x0055
            r1.a = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.b = r2
            java.lang.Object r4 = r1.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.c = r4
            goto L_0x005c
        L_0x0055:
            r4 = 0
            r1.a = r4
            r1.b = r4
            r1.c = r4
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juf.c():yp9");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        yp9 c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.d).getInt(a2 + c2.a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
