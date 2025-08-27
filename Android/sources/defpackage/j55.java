package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: j55  reason: default package */
public final class j55 implements Closeable {
    public ColorSpace X;
    public String Y;
    public final y33 a;
    public final r2f b;
    public h97 c = h97.c;
    public int o = -1;
    public int v = 0;
    public int w = -1;
    public int x = -1;
    public int y = 1;
    public int z = -1;

    public j55(y33 y33) {
        if (y33.m0(y33)) {
            this.a = y33.m();
            this.b = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean V(j55 j55) {
        return j55.o >= 0 && j55.w >= 0 && j55.x >= 0;
    }

    public static j55 a(j55 j55) {
        j55 j552 = null;
        if (j55 != null) {
            r2f r2f = j55.b;
            if (r2f != null) {
                j552 = new j55(r2f, j55.z);
            } else {
                y33 o2 = y33.o(j55.a);
                if (o2 != null) {
                    try {
                        j552 = new j55(o2);
                    } catch (Throwable th) {
                        y33.U(o2);
                        throw th;
                    }
                }
                y33.U(o2);
            }
            if (j552 != null) {
                j552.d(j55);
            }
        }
        return j552;
    }

    public static void b(j55 j55) {
        if (j55 != null) {
            j55.close();
        }
    }

    public static boolean k0(j55 j55) {
        return j55 != null && j55.e0();
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24, types: [kotlin.Pair] */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v30, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f8 A[Catch:{ IOException -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U() {
        /*
            r15 = this;
            r0 = 2
            r1 = -1
            r2 = 8
            r3 = 1
            java.io.InputStream r4 = r15.n()
            kotlin.Lazy r5 = defpackage.i97.d
            r5 = 0
            h97 r4 = defpackage.ld8.K(r4)     // Catch:{ IOException -> 0x028d }
            r15.c = r4
            h97 r6 = defpackage.eg4.f
            r7 = 0
            if (r4 == r6) goto L_0x0026
            h97 r6 = defpackage.eg4.g
            if (r4 == r6) goto L_0x0026
            h97 r6 = defpackage.eg4.h
            if (r4 == r6) goto L_0x0026
            h97 r6 = defpackage.eg4.i
            if (r4 != r6) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r6 = r7
            goto L_0x0027
        L_0x0026:
            r6 = r3
        L_0x0027:
            r8 = 255(0xff, float:3.57E-43)
            r9 = 4
            if (r6 != 0) goto L_0x006b
            h97 r6 = defpackage.eg4.j
            if (r4 != r6) goto L_0x0031
            goto L_0x006b
        L_0x0031:
            java.io.InputStream r5 = r15.n()     // Catch:{ all -> 0x005e }
            wsb r6 = defpackage.vo0.a(r5)     // Catch:{ all -> 0x005e }
            java.lang.Object r10 = r6.a     // Catch:{ all -> 0x005e }
            android.graphics.ColorSpace r10 = (android.graphics.ColorSpace) r10     // Catch:{ all -> 0x005e }
            r15.X = r10     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r6.b
            kotlin.Pair r6 = (kotlin.Pair) r6
            if (r6 == 0) goto L_0x0060
            java.lang.Object r10 = r6.component1()     // Catch:{ all -> 0x005e }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005e }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005e }
            r15.w = r10     // Catch:{ all -> 0x005e }
            java.lang.Object r10 = r6.component2()     // Catch:{ all -> 0x005e }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005e }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005e }
            r15.x = r10     // Catch:{ all -> 0x005e }
            goto L_0x0060
        L_0x005e:
            r15 = move-exception
            goto L_0x0065
        L_0x0060:
            r5.close()     // Catch:{ IOException -> 0x016e }
            goto L_0x016e
        L_0x0065:
            if (r5 == 0) goto L_0x006a
            r5.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r15
        L_0x006b:
            java.io.InputStream r6 = r15.n()
            if (r6 != 0) goto L_0x0073
            goto L_0x016d
        L_0x0073:
            byte[] r10 = new byte[r9]
            r6.read(r10)     // Catch:{ IOException -> 0x0126 }
            java.lang.String r11 = "RIFF"
            boolean r11 = defpackage.m58.h(r10, r11)     // Catch:{ IOException -> 0x0126 }
            if (r11 != 0) goto L_0x008b
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0153
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0153
        L_0x008b:
            defpackage.m58.u(r6)     // Catch:{ IOException -> 0x0126 }
            r6.read(r10)     // Catch:{ IOException -> 0x0126 }
            java.lang.String r11 = "WEBP"
            boolean r11 = defpackage.m58.h(r10, r11)     // Catch:{ IOException -> 0x0126 }
            if (r11 != 0) goto L_0x009e
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0153
        L_0x009e:
            r6.read(r10)     // Catch:{ IOException -> 0x0126 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0126 }
            r11.<init>()     // Catch:{ IOException -> 0x0126 }
            r12 = r7
        L_0x00a7:
            if (r12 >= r9) goto L_0x00ba
            byte r13 = r10[r12]     // Catch:{ IOException -> 0x0126 }
            short r13 = (short) r13     // Catch:{ IOException -> 0x0126 }
            short r13 = kotlin.UShort.m304constructorimpl(r13)     // Catch:{ IOException -> 0x0126 }
            r14 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r14
            char r13 = (char) r13     // Catch:{ IOException -> 0x0126 }
            r11.append(r13)     // Catch:{ IOException -> 0x0126 }
            int r12 = r12 + r3
            goto L_0x00a7
        L_0x00ba:
            java.lang.String r10 = r11.toString()     // Catch:{ IOException -> 0x0126 }
            int r11 = r10.hashCode()     // Catch:{ IOException -> 0x0126 }
            r12 = 2640674(0x284b22, float:3.700372E-39)
            if (r11 == r12) goto L_0x0139
            r12 = 2640718(0x284b4e, float:3.700434E-39)
            if (r11 == r12) goto L_0x0128
            r12 = 2640730(0x284b5a, float:3.700451E-39)
            if (r11 == r12) goto L_0x00d3
            goto L_0x0149
        L_0x00d3:
            java.lang.String r11 = "VP8X"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x0126 }
            if (r10 != 0) goto L_0x00dd
            goto L_0x0149
        L_0x00dd:
            r10 = 8
            r6.skip(r10)     // Catch:{ IOException -> 0x0126 }
            kotlin.Pair r10 = new kotlin.Pair     // Catch:{ IOException -> 0x0126 }
            int r11 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r11 = r11 & r8
            int r12 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r13 = r13 & r8
            int r13 = r13 << 16
            int r12 = r12 << r2
            r12 = r12 | r13
            r11 = r11 | r12
            int r11 = r11 + r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0126 }
            int r12 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r13 = r13 & r8
            int r14 = r6.read()     // Catch:{ IOException -> 0x0126 }
            r14 = r14 & r8
            int r14 = r14 << 16
            int r13 = r13 << r2
            r13 = r13 | r14
            r12 = r12 | r13
            int r12 = r12 + r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0126 }
            r10.<init>(r11, r12)     // Catch:{ IOException -> 0x0126 }
            r6.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0121:
            r5 = r10
            goto L_0x0153
        L_0x0123:
            r15 = move-exception
            goto L_0x0284
        L_0x0126:
            r10 = move-exception
            goto L_0x014d
        L_0x0128:
            java.lang.String r11 = "VP8L"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x0126 }
            if (r10 != 0) goto L_0x0131
            goto L_0x0149
        L_0x0131:
            kotlin.Pair r5 = defpackage.m58.y(r6)     // Catch:{ IOException -> 0x0126 }
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0153
        L_0x0139:
            java.lang.String r11 = "VP8 "
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x0126 }
            if (r10 == 0) goto L_0x0149
            kotlin.Pair r5 = defpackage.m58.x(r6)     // Catch:{ IOException -> 0x0126 }
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0153
        L_0x0149:
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0153
        L_0x014d:
            r10.printStackTrace()     // Catch:{ all -> 0x0123 }
            r6.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0153:
            if (r5 == 0) goto L_0x016d
            java.lang.Object r6 = r5.component1()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.w = r6
            java.lang.Object r6 = r5.component2()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.x = r6
        L_0x016d:
            r6 = r5
        L_0x016e:
            h97 r5 = defpackage.eg4.a
            r10 = 3
            if (r4 != r5) goto L_0x0248
            int r5 = r15.o
            if (r5 != r1) goto L_0x0248
            if (r6 == 0) goto L_0x0283
            java.io.InputStream r4 = r15.n()
        L_0x017d:
            int r5 = defpackage.kv0.Y(r4, r3, r7)     // Catch:{ IOException -> 0x023f }
            if (r5 != r8) goto L_0x01c1
            r5 = r8
        L_0x0184:
            if (r5 != r8) goto L_0x018b
            int r5 = defpackage.kv0.Y(r4, r3, r7)     // Catch:{ IOException -> 0x023f }
            goto L_0x0184
        L_0x018b:
            r6 = 225(0xe1, float:3.15E-43)
            if (r5 != r6) goto L_0x01a9
            int r5 = defpackage.kv0.Y(r4, r0, r7)     // Catch:{ IOException -> 0x023f }
            int r6 = r5 + -2
            r8 = 6
            if (r6 <= r8) goto L_0x01c1
            int r6 = defpackage.kv0.Y(r4, r9, r7)     // Catch:{ IOException -> 0x023f }
            int r8 = defpackage.kv0.Y(r4, r0, r7)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 - r2
            r11 = 1165519206(0x45786966, float:3974.5874)
            if (r6 != r11) goto L_0x01c1
            if (r8 != 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01a9:
            if (r5 == r3) goto L_0x017d
            r6 = 216(0xd8, float:3.03E-43)
            if (r5 == r6) goto L_0x017d
            r6 = 217(0xd9, float:3.04E-43)
            if (r5 == r6) goto L_0x01c1
            r6 = 218(0xda, float:3.05E-43)
            if (r5 == r6) goto L_0x01c1
            int r5 = defpackage.kv0.Y(r4, r0, r7)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 - r0
            long r5 = (long) r5     // Catch:{ IOException -> 0x023f }
            r4.skip(r5)     // Catch:{ IOException -> 0x023f }
            goto L_0x017d
        L_0x01c1:
            r5 = r7
        L_0x01c2:
            if (r5 != 0) goto L_0x01c6
            goto L_0x023f
        L_0x01c6:
            if (r5 > r2) goto L_0x01cc
        L_0x01c8:
            r5 = r7
            r6 = r5
            r11 = r6
            goto L_0x01f5
        L_0x01cc:
            int r6 = defpackage.kv0.Y(r4, r9, r7)     // Catch:{ IOException -> 0x023f }
            java.lang.Class<cjf> r8 = defpackage.cjf.class
            r11 = 1229531648(0x49492a00, float:823968.0)
            if (r6 == r11) goto L_0x01e0
            r12 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r6 == r12) goto L_0x01e0
            defpackage.bg5.a(r8)     // Catch:{ IOException -> 0x023f }
            goto L_0x01c8
        L_0x01e0:
            if (r6 != r11) goto L_0x01e4
            r6 = r3
            goto L_0x01e5
        L_0x01e4:
            r6 = r7
        L_0x01e5:
            int r11 = defpackage.kv0.Y(r4, r9, r6)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 + -8
            if (r11 < r2) goto L_0x01f1
            int r12 = r11 + -8
            if (r12 <= r5) goto L_0x01f5
        L_0x01f1:
            defpackage.bg5.a(r8)     // Catch:{ IOException -> 0x023f }
            r5 = r7
        L_0x01f5:
            int r11 = r11 - r2
            if (r5 == 0) goto L_0x023f
            if (r11 <= r5) goto L_0x01fb
            goto L_0x023f
        L_0x01fb:
            long r12 = (long) r11     // Catch:{ IOException -> 0x023f }
            r4.skip(r12)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 - r11
            r2 = 14
            if (r5 >= r2) goto L_0x0206
        L_0x0204:
            r11 = r7
            goto L_0x0228
        L_0x0206:
            int r2 = defpackage.kv0.Y(r4, r0, r6)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 + -2
        L_0x020c:
            int r8 = r2 + -1
            if (r2 <= 0) goto L_0x0204
            r2 = 12
            if (r5 < r2) goto L_0x0204
            int r2 = defpackage.kv0.Y(r4, r0, r6)     // Catch:{ IOException -> 0x023f }
            int r11 = r5 + -2
            r12 = 274(0x112, float:3.84E-43)
            if (r2 != r12) goto L_0x021f
            goto L_0x0228
        L_0x021f:
            r11 = 10
            r4.skip(r11)     // Catch:{ IOException -> 0x023f }
            int r5 = r5 + -12
            r2 = r8
            goto L_0x020c
        L_0x0228:
            r1 = 10
            if (r11 >= r1) goto L_0x022d
            goto L_0x023f
        L_0x022d:
            int r1 = defpackage.kv0.Y(r4, r0, r6)     // Catch:{ IOException -> 0x023f }
            if (r1 == r10) goto L_0x0234
            goto L_0x023f
        L_0x0234:
            int r1 = defpackage.kv0.Y(r4, r9, r6)     // Catch:{ IOException -> 0x023f }
            if (r1 == r3) goto L_0x023b
            goto L_0x023f
        L_0x023b:
            int r7 = defpackage.kv0.Y(r4, r0, r6)     // Catch:{ IOException -> 0x023f }
        L_0x023f:
            r15.v = r7
            int r0 = defpackage.ev0.o(r7)
            r15.o = r0
            goto L_0x0283
        L_0x0248:
            h97 r0 = defpackage.eg4.k
            if (r4 != r0) goto L_0x027d
            int r0 = r15.o
            if (r0 != r1) goto L_0x027d
            java.io.InputStream r0 = r15.n()
            if (r0 != 0) goto L_0x025c
            cg5 r0 = defpackage.bg5.a
            r0.getClass()
            goto L_0x0274
        L_0x025c:
            ab5 r1 = new ab5     // Catch:{ IOException -> 0x0268 }
            r1.<init>((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "Orientation"
            int r7 = r1.e(r3, r0)     // Catch:{ IOException -> 0x0268 }
            goto L_0x0274
        L_0x0268:
            r0 = move-exception
            cg5 r1 = defpackage.bg5.a
            boolean r1 = r1.a(r10)
            if (r1 == 0) goto L_0x0274
            android.util.Log.getStackTraceString(r0)
        L_0x0274:
            r15.v = r7
            int r0 = defpackage.ev0.o(r7)
            r15.o = r0
            goto L_0x0283
        L_0x027d:
            int r0 = r15.o
            if (r0 != r1) goto L_0x0283
            r15.o = r7
        L_0x0283:
            return
        L_0x0284:
            r6.close()     // Catch:{ IOException -> 0x0288 }
            goto L_0x028c
        L_0x0288:
            r0 = move-exception
            r0.printStackTrace()
        L_0x028c:
            throw r15
        L_0x028d:
            r15 = move-exception
            defpackage.n54.I(r15)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j55.U():void");
    }

    public final void close() {
        y33.U(this.a);
    }

    public final void d(j55 j55) {
        j55.m0();
        this.c = j55.c;
        j55.m0();
        this.w = j55.w;
        j55.m0();
        this.x = j55.x;
        j55.m0();
        this.o = j55.o;
        j55.m0();
        this.v = j55.v;
        this.y = j55.y;
        this.z = j55.o();
        j55.getClass();
        j55.m0();
        this.X = j55.X;
    }

    public final synchronized boolean e0() {
        return y33.m0(this.a) || this.b != null;
    }

    /* JADX INFO: finally extract failed */
    public final String m() {
        y33 o2 = y33.o(this.a);
        if (o2 == null) {
            return "";
        }
        int min = Math.min(o(), 10);
        byte[] bArr = new byte[min];
        try {
            ((e69) o2.e0()).U(0, 0, min, bArr);
            o2.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Throwable th) {
            o2.close();
            throw th;
        }
    }

    public final void m0() {
        if (this.w < 0 || this.x < 0) {
            U();
        }
    }

    public final InputStream n() {
        r2f r2f = this.b;
        if (r2f != null) {
            return (InputStream) r2f.get();
        }
        y33 o2 = y33.o(this.a);
        if (o2 == null) {
            return null;
        }
        try {
            return new sqb((e69) o2.e0());
        } finally {
            y33.U(o2);
        }
    }

    public final int o() {
        y33 y33 = this.a;
        if (y33 == null) {
            return this.z;
        }
        y33.e0();
        return ((e69) y33.e0()).V();
    }

    public j55(r2f r2f, int i) {
        r2f.getClass();
        this.a = null;
        this.b = r2f;
        this.z = i;
    }
}
