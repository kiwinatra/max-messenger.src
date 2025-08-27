package defpackage;

import java.util.zip.Inflater;

/* renamed from: pdb  reason: default package */
public final class pdb extends ibe {
    public final g1g v0 = new g1g(3, false);
    public final g1g w0 = new g1g(3, false);
    public final odb x0 = new odb(0);
    public Inflater y0;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016b, code lost:
        r2 = null;
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uye a(int r35, byte[] r36, boolean r37) {
        /*
            r34 = this;
            r0 = r34
            g1g r1 = r0.v0
            r2 = r35
            r3 = r36
            r1.F(r2, r3)
            int r2 = r1.c()
            r3 = 255(0xff, float:3.57E-43)
            if (r2 <= 0) goto L_0x003a
            byte[] r2 = r1.a
            int r4 = r1.b
            byte r2 = r2[r4]
            r2 = r2 & r3
            r4 = 120(0x78, float:1.68E-43)
            if (r2 != r4) goto L_0x003a
            java.util.zip.Inflater r2 = r0.y0
            if (r2 != 0) goto L_0x0029
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            r0.y0 = r2
        L_0x0029:
            java.util.zip.Inflater r2 = r0.y0
            g1g r4 = r0.w0
            boolean r2 = defpackage.t0g.A(r1, r4, r2)
            if (r2 == 0) goto L_0x003a
            byte[] r2 = r4.a
            int r4 = r4.c
            r1.F(r4, r2)
        L_0x003a:
            odb r0 = r0.x0
            r2 = 0
            r0.c = r2
            r0.d = r2
            r0.e = r2
            r0.f = r2
            r0.g = r2
            r0.h = r2
            java.lang.Object r4 = r0.i
            g1g r4 = (defpackage.g1g) r4
            r4.E(r2)
            r0.b = r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0057:
            int r6 = r1.c()
            r7 = 3
            if (r6 < r7) goto L_0x0238
            int r6 = r1.c
            int r8 = r1.v()
            int r9 = r1.A()
            int r10 = r1.b
            int r10 = r10 + r9
            if (r10 <= r6) goto L_0x0075
            r1.H(r6)
            r11 = r3
            r3 = r2
            r2 = 0
            goto L_0x022f
        L_0x0075:
            r6 = 128(0x80, float:1.794E-43)
            java.lang.Object r12 = r0.a
            int[] r12 = (int[]) r12
            if (r8 == r6) goto L_0x016f
            switch(r8) {
                case 20: goto L_0x00f0;
                case 21: goto L_0x00a6;
                case 22: goto L_0x0083;
                default: goto L_0x0080;
            }
        L_0x0080:
            r11 = r3
            goto L_0x016b
        L_0x0083:
            r6 = 19
            if (r9 >= r6) goto L_0x0088
            goto L_0x0080
        L_0x0088:
            int r6 = r1.A()
            r0.c = r6
            int r6 = r1.A()
            r0.d = r6
            r6 = 11
            r1.I(r6)
            int r6 = r1.A()
            r0.e = r6
            int r6 = r1.A()
            r0.f = r6
            goto L_0x0080
        L_0x00a6:
            r8 = 4
            if (r9 >= r8) goto L_0x00aa
            goto L_0x0080
        L_0x00aa:
            r1.I(r7)
            int r7 = r1.v()
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00b6
            r13 = 1
            goto L_0x00b7
        L_0x00b6:
            r13 = r2
        L_0x00b7:
            int r6 = r9 + -4
            if (r13 == 0) goto L_0x00d9
            r7 = 7
            if (r6 >= r7) goto L_0x00bf
            goto L_0x0080
        L_0x00bf:
            int r6 = r1.x()
            if (r6 >= r8) goto L_0x00c6
            goto L_0x0080
        L_0x00c6:
            int r7 = r1.A()
            r0.g = r7
            int r7 = r1.A()
            r0.h = r7
            int r6 = r6 + -4
            r4.E(r6)
            int r6 = r9 + -11
        L_0x00d9:
            int r7 = r4.b
            int r8 = r4.c
            if (r7 >= r8) goto L_0x0080
            if (r6 <= 0) goto L_0x0080
            int r8 = r8 - r7
            int r6 = java.lang.Math.min(r6, r8)
            byte[] r8 = r4.a
            r1.g(r7, r8, r6)
            int r7 = r7 + r6
            r4.H(r7)
            goto L_0x0080
        L_0x00f0:
            int r7 = r9 % 5
            r8 = 2
            if (r7 == r8) goto L_0x00f6
            goto L_0x0080
        L_0x00f6:
            r1.I(r8)
            java.util.Arrays.fill(r12, r2)
            int r9 = r9 / 5
            r7 = r2
        L_0x00ff:
            if (r7 >= r9) goto L_0x0167
            int r8 = r1.v()
            int r14 = r1.v()
            int r15 = r1.v()
            int r16 = r1.v()
            int r17 = r1.v()
            double r13 = (double) r14
            int r15 = r15 - r6
            r36 = r12
            double r11 = (double) r15
            r18 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r18 = r18 * r11
            double r2 = r18 + r13
            int r2 = (int) r2
            int r3 = r16 + -128
            r18 = r7
            double r6 = (double) r3
            r19 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r19 = r19 * r6
            double r19 = r13 - r19
            r21 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r11 = r11 * r21
            double r11 = r19 - r11
            int r3 = (int) r11
            r11 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r6 = r6 * r11
            double r6 = r6 + r13
            int r6 = (int) r6
            int r7 = r17 << 24
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            int r2 = defpackage.t0g.j(r2, r12, r11)
            int r2 = r2 << 16
            r2 = r2 | r7
            int r3 = defpackage.t0g.j(r3, r12, r11)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = defpackage.t0g.j(r6, r12, r11)
            r2 = r2 | r3
            r36[r8] = r2
            int r7 = r18 + 1
            r12 = r36
            r3 = r11
            r2 = 0
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00ff
        L_0x0167:
            r11 = r3
            r2 = 1
            r0.b = r2
        L_0x016b:
            r2 = 0
            r3 = 0
            goto L_0x022c
        L_0x016f:
            r11 = r3
            r36 = r12
            int r2 = r0.c
            if (r2 == 0) goto L_0x0219
            int r2 = r0.d
            if (r2 == 0) goto L_0x0219
            int r2 = r0.g
            if (r2 == 0) goto L_0x0219
            int r2 = r0.h
            if (r2 == 0) goto L_0x0219
            int r2 = r4.c
            if (r2 == 0) goto L_0x0219
            int r3 = r4.b
            if (r3 != r2) goto L_0x0219
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x0190
            goto L_0x0219
        L_0x0190:
            r2 = 0
            r4.H(r2)
            int r2 = r0.g
            int r3 = r0.h
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r12 = 0
        L_0x019c:
            if (r12 >= r2) goto L_0x01d3
            int r6 = r4.v()
            if (r6 == 0) goto L_0x01ac
            int r7 = r12 + 1
            r6 = r36[r6]
            r3[r12] = r6
        L_0x01aa:
            r12 = r7
            goto L_0x019c
        L_0x01ac:
            int r6 = r4.v()
            if (r6 == 0) goto L_0x019c
            r7 = r6 & 64
            if (r7 != 0) goto L_0x01b9
            r7 = r6 & 63
            goto L_0x01c2
        L_0x01b9:
            r7 = r6 & 63
            int r7 = r7 << 8
            int r8 = r4.v()
            r7 = r7 | r8
        L_0x01c2:
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x01c8
            r6 = 0
            goto L_0x01ce
        L_0x01c8:
            int r6 = r4.v()
            r6 = r36[r6]
        L_0x01ce:
            int r7 = r7 + r12
            java.util.Arrays.fill(r3, r12, r7, r6)
            goto L_0x01aa
        L_0x01d3:
            int r2 = r0.g
            int r6 = r0.h
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r20 = android.graphics.Bitmap.createBitmap(r3, r2, r6, r7)
            int r2 = r0.e
            float r2 = (float) r2
            int r3 = r0.c
            float r3 = (float) r3
            float r24 = r2 / r3
            int r2 = r0.f
            float r2 = (float) r2
            int r6 = r0.d
            float r6 = (float) r6
            float r21 = r2 / r6
            int r2 = r0.g
            float r2 = (float) r2
            float r28 = r2 / r3
            int r2 = r0.h
            float r2 = (float) r2
            float r29 = r2 / r6
            m44 r2 = new m44
            r16 = r2
            r31 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r33 = 0
            r18 = 0
            r19 = r18
            r17 = r18
            r22 = 0
            r23 = 0
            r25 = 0
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = r32
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r30 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0217:
            r3 = 0
            goto L_0x021b
        L_0x0219:
            r2 = 0
            goto L_0x0217
        L_0x021b:
            r0.c = r3
            r0.d = r3
            r0.e = r3
            r0.f = r3
            r0.g = r3
            r0.h = r3
            r4.E(r3)
            r0.b = r3
        L_0x022c:
            r1.H(r10)
        L_0x022f:
            if (r2 == 0) goto L_0x0234
            r5.add(r2)
        L_0x0234:
            r2 = r3
            r3 = r11
            goto L_0x0057
        L_0x0238:
            g85 r0 = new g85
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.a(int, byte[], boolean):uye");
    }
}
