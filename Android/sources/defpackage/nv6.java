package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: nv6  reason: default package */
public final class nv6 implements w05 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public zpf b;
    public final xe8 c;
    public final l8b d;
    public final v4a e;
    public final boolean[] f = new boolean[4];
    public final lv6 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public nv6(xe8 xe8) {
        this.c = xe8;
        lv6 lv6 = new lv6(1);
        lv6.e = new byte[Uuid.SIZE_BITS];
        this.g = lv6;
        if (xe8 != null) {
            this.e = new v4a(178, 1);
            this.d = new l8b();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public final void a() {
        b0h.k(this.f);
        lv6 lv6 = this.g;
        lv6.b = false;
        lv6.c = 0;
        lv6.d = 0;
        v4a v4a = this.e;
        if (v4a != null) {
            v4a.c();
        }
        this.h = 0;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 4
            r5 = 3
            zpf r6 = r0.b
            defpackage.n79.o(r6)
            int r6 = r1.b
            int r7 = r1.c
            byte[] r8 = r1.a
            long r9 = r0.h
            int r11 = r27.a()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.h = r9
            zpf r9 = r0.b
            int r10 = r27.a()
            r11 = 0
            r9.b(r1, r10, r11)
        L_0x0025:
            boolean[] r9 = r0.f
            int r9 = defpackage.b0h.q(r8, r6, r7, r9)
            lv6 r10 = r0.g
            v4a r12 = r0.e
            if (r9 != r7) goto L_0x003e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0038
            r10.a(r6, r8, r7)
        L_0x0038:
            if (r12 == 0) goto L_0x003d
            r12.a(r6, r8, r7)
        L_0x003d:
            return
        L_0x003e:
            byte[] r13 = r1.a
            int r14 = r9 + 3
            byte r13 = r13[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r9 - r6
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x0150
            if (r15 <= 0) goto L_0x0051
            r10.a(r6, r8, r9)
        L_0x0051:
            if (r15 >= 0) goto L_0x0055
            int r4 = -r15
            goto L_0x0056
        L_0x0055:
            r4 = r11
        L_0x0056:
            boolean r5 = r10.b
            if (r5 == 0) goto L_0x013c
            int r5 = r10.c
            int r5 = r5 - r4
            r10.c = r5
            int r4 = r10.d
            if (r4 != 0) goto L_0x0070
            r4 = 181(0xb5, float:2.54E-43)
            if (r13 != r4) goto L_0x0070
            r10.d = r5
            r17 = r7
            r18 = r14
            r7 = r6
            goto L_0x0148
        L_0x0070:
            r10.b = r11
            java.lang.String r4 = r0.a
            r4.getClass()
            byte[] r5 = r10.e
            int r11 = r10.c
            byte[] r5 = java.util.Arrays.copyOf(r5, r11)
            byte r11 = r5[r3]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r2 = r5[r16]
            r3 = r2 & 255(0xff, float:3.57E-43)
            r17 = 6
            r18 = r14
            byte r14 = r5[r17]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r17 = r7
            r7 = 4
            int r11 = r11 << r7
            int r3 = r3 >> r7
            r3 = r3 | r11
            r2 = r2 & 15
            r11 = 8
            int r2 = r2 << r11
            r2 = r2 | r14
            r14 = 7
            byte r11 = r5[r14]
            r11 = r11 & 240(0xf0, float:3.36E-43)
            int r11 = r11 >> r7
            r14 = 2
            if (r11 == r14) goto L_0x00bc
            r14 = 3
            if (r11 == r14) goto L_0x00b6
            if (r11 == r7) goto L_0x00ae
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c5
        L_0x00ae:
            int r7 = r2 * 121
            float r7 = (float) r7
            int r11 = r3 * 100
        L_0x00b3:
            float r11 = (float) r11
            float r7 = r7 / r11
            goto L_0x00c5
        L_0x00b6:
            int r7 = r2 * 16
            float r7 = (float) r7
            int r11 = r3 * 9
            goto L_0x00b3
        L_0x00bc:
            int r11 = r2 * 4
            float r11 = (float) r11
            r14 = 3
            int r7 = r3 * 3
            float r7 = (float) r7
            float r7 = r11 / r7
        L_0x00c5:
            ba6 r11 = new ba6
            r11.<init>()
            r11.a = r4
            java.lang.String r4 = "video/mpeg2"
            java.lang.String r4 = defpackage.vq9.l(r4)
            r11.m = r4
            r11.s = r3
            r11.t = r2
            r11.w = r7
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r11.p = r2
            ea6 r2 = new ea6
            r2.<init>(r11)
            r3 = 7
            byte r3 = r5[r3]
            r3 = r3 & 15
            r4 = 1
            int r3 = r3 - r4
            if (r3 < 0) goto L_0x0119
            r4 = 8
            if (r3 >= r4) goto L_0x0119
            double[] r4 = q
            r3 = r4[r3]
            int r7 = r10.d
            int r7 = r7 + 9
            byte r5 = r5[r7]
            r7 = r5 & 96
            int r7 = r7 >> 5
            r5 = r5 & 31
            if (r7 == r5) goto L_0x0110
            double r10 = (double) r7
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 + r19
            r7 = 1
            int r5 = r5 + r7
            r7 = r6
            double r5 = (double) r5
            double r10 = r10 / r5
            double r3 = r3 * r10
            goto L_0x0111
        L_0x0110:
            r7 = r6
        L_0x0111:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r3
            long r3 = (long) r5
            goto L_0x011c
        L_0x0119:
            r7 = r6
            r3 = 0
        L_0x011c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            zpf r3 = r0.b
            java.lang.Object r4 = r2.first
            ea6 r4 = (defpackage.ea6) r4
            r3.e(r4)
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.k = r2
            r2 = 1
            r0.j = r2
            r4 = 3
            goto L_0x0156
        L_0x013c:
            r17 = r7
            r18 = r14
            r2 = 1
            r3 = 179(0xb3, float:2.51E-43)
            r7 = r6
            if (r13 != r3) goto L_0x0148
            r10.b = r2
        L_0x0148:
            byte[] r2 = defpackage.lv6.g
            r3 = 0
            r4 = 3
            r10.a(r3, r2, r4)
            goto L_0x0156
        L_0x0150:
            r17 = r7
            r18 = r14
            r4 = 3
            r7 = r6
        L_0x0156:
            if (r12 == 0) goto L_0x0190
            if (r15 <= 0) goto L_0x015f
            r12.a(r7, r8, r9)
            r3 = 0
            goto L_0x0160
        L_0x015f:
            int r3 = -r15
        L_0x0160:
            boolean r2 = r12.b(r3)
            if (r2 == 0) goto L_0x017e
            byte[] r2 = r12.e
            int r3 = r12.f
            int r2 = defpackage.b0h.P(r3, r2)
            int r3 = defpackage.v0g.a
            byte[] r3 = r12.e
            l8b r5 = r0.d
            r5.E(r2, r3)
            long r2 = r0.n
            xe8 r6 = r0.c
            r6.l(r2, r5)
        L_0x017e:
            r2 = 178(0xb2, float:2.5E-43)
            if (r13 != r2) goto L_0x0190
            byte[] r2 = r1.a
            r3 = 2
            int r5 = r9 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0192
            r12.d(r13)
            goto L_0x0192
        L_0x0190:
            r3 = 2
            r5 = 1
        L_0x0192:
            if (r13 == 0) goto L_0x01a2
            r2 = 179(0xb3, float:2.51E-43)
            if (r13 != r2) goto L_0x0199
            goto L_0x01a2
        L_0x0199:
            r2 = 184(0xb8, float:2.58E-43)
            if (r13 != r2) goto L_0x019f
            r0.o = r5
        L_0x019f:
            r2 = 0
            goto L_0x0205
        L_0x01a2:
            int r7 = r17 - r9
            boolean r2 = r0.p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x01d0
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x01d0
            long r9 = r0.n
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01d0
            boolean r2 = r0.o
            long r11 = r0.h
            long r14 = r0.m
            long r11 = r11 - r14
            int r11 = (int) r11
            int r23 = r11 - r7
            zpf r11 = r0.b
            r25 = 0
            r19 = r11
            r20 = r9
            r22 = r2
            r24 = r7
            r19.a(r20, r22, r23, r24, r25)
        L_0x01d0:
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r0.p
            if (r2 == 0) goto L_0x01d9
            goto L_0x01dc
        L_0x01d9:
            r2 = 0
            r5 = 1
            goto L_0x01fe
        L_0x01dc:
            long r9 = r0.h
            long r11 = (long) r7
            long r9 = r9 - r11
            r0.m = r9
            long r9 = r0.l
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01e9
            goto L_0x01f4
        L_0x01e9:
            long r9 = r0.n
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01f3
            long r11 = r0.k
            long r9 = r9 + r11
            goto L_0x01f4
        L_0x01f3:
            r9 = r5
        L_0x01f4:
            r0.n = r9
            r2 = 0
            r0.o = r2
            r0.l = r5
            r5 = 1
            r0.i = r5
        L_0x01fe:
            if (r13 != 0) goto L_0x0202
            r6 = r5
            goto L_0x0203
        L_0x0202:
            r6 = r2
        L_0x0203:
            r0.p = r6
        L_0x0205:
            r11 = r2
            r5 = r4
            r7 = r17
            r6 = r18
            r3 = 4
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv6.f(l8b):void");
    }

    public final void g(boolean z) {
        n79.o(this.b);
        if (z) {
            boolean z2 = this.o;
            this.b.a(this.n, z2 ? 1 : 0, (int) (this.h - this.m), 0, (xpf) null);
        }
    }

    public final void i(int i2, long j2) {
        this.l = j2;
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.a = qtf.f;
        qtf.b();
        this.b = xf5.B(qtf.e, 2);
        xe8 xe8 = this.c;
        if (xe8 != null) {
            xe8.m(xf5, qtf);
        }
    }
}
