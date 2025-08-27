package defpackage;

/* renamed from: zr7  reason: default package */
public final class zr7 implements w05 {
    public final String a;
    public final int b;
    public final l8b c;
    public final ky1 d;
    public zpf e;
    public String f;
    public ea6 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l = -9223372036854775807L;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public zr7(String str, int i2) {
        this.a = str;
        this.b = i2;
        l8b l8b = new l8b(1024);
        this.c = l8b;
        byte[] bArr = l8b.a;
        this.d = new ky1(bArr, (byte) 0, bArr.length, 2);
    }

    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0196, code lost:
        if (r0.m == false) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r24) {
        /*
            r23 = this;
            r0 = r23
            zpf r1 = r0.e
            defpackage.n79.o(r1)
        L_0x0007:
            int r1 = r24.a()
            if (r1 <= 0) goto L_0x0268
            int r1 = r0.h
            r2 = 1
            r3 = 86
            if (r1 == 0) goto L_0x025c
            r4 = 2
            r5 = 0
            if (r1 == r2) goto L_0x0243
            r3 = 3
            r6 = 8
            l8b r7 = r0.c
            ky1 r8 = r0.d
            if (r1 == r4) goto L_0x021d
            if (r1 != r3) goto L_0x0217
            int r1 = r24.a()
            int r9 = r0.j
            int r10 = r0.i
            int r9 = r9 - r10
            int r1 = java.lang.Math.min(r1, r9)
            byte[] r9 = r8.b
            int r10 = r0.i
            r11 = r24
            r11.e(r10, r9, r1)
            int r9 = r0.i
            int r9 = r9 + r1
            r0.i = r9
            int r1 = r0.j
            if (r9 != r1) goto L_0x0007
            r8.q(r5)
            boolean r1 = r8.h()
            r9 = 0
            if (r1 != 0) goto L_0x0194
            r0.m = r2
            int r1 = r8.i(r2)
            if (r1 != r2) goto L_0x0059
            int r10 = r8.i(r2)
            goto L_0x005a
        L_0x0059:
            r10 = r5
        L_0x005a:
            r0.n = r10
            if (r10 != 0) goto L_0x018f
            if (r1 != r2) goto L_0x0069
            int r10 = r8.i(r4)
            int r10 = r10 + r2
            int r10 = r10 * r6
            r8.i(r10)
        L_0x0069:
            boolean r10 = r8.h()
            if (r10 == 0) goto L_0x018a
            r10 = 6
            int r12 = r8.i(r10)
            r0.o = r12
            r12 = 4
            int r13 = r8.i(r12)
            int r14 = r8.i(r3)
            if (r13 != 0) goto L_0x0185
            if (r14 != 0) goto L_0x0185
            if (r1 != 0) goto L_0x00f7
            int r13 = r8.g()
            int r14 = r8.b()
            e r15 = defpackage.iq.T(r8, r2)
            java.lang.String r5 = r15.c
            r0.v = r5
            int r5 = r15.a
            r0.s = r5
            int r5 = r15.b
            r0.u = r5
            int r5 = r8.b()
            int r14 = r14 - r5
            r8.q(r13)
            int r5 = r14 + 7
            int r5 = r5 / r6
            byte[] r5 = new byte[r5]
            r8.j(r14, r5)
            ba6 r13 = new ba6
            r13.<init>()
            java.lang.String r14 = r0.f
            r13.a = r14
            java.lang.String r14 = "audio/mp4a-latm"
            java.lang.String r14 = defpackage.vq9.l(r14)
            r13.m = r14
            java.lang.String r14 = r0.v
            r13.i = r14
            int r14 = r0.u
            r13.A = r14
            int r14 = r0.s
            r13.B = r14
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r13.p = r5
            java.lang.String r5 = r0.a
            r13.d = r5
            int r5 = r0.b
            r13.f = r5
            ea6 r5 = new ea6
            r5.<init>(r13)
            ea6 r13 = r0.g
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0120
            r0.g = r5
            int r13 = r5.C
            long r13 = (long) r13
            r16 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r13 = r16 / r13
            r0.t = r13
            zpf r13 = r0.e
            r13.e(r5)
            goto L_0x0120
        L_0x00f7:
            int r5 = r8.i(r4)
            int r5 = r5 + r2
            int r5 = r5 * r6
            int r5 = r8.i(r5)
            long r13 = (long) r5
            int r5 = (int) r13
            int r13 = r8.b()
            e r14 = defpackage.iq.T(r8, r2)
            java.lang.String r15 = r14.c
            r0.v = r15
            int r15 = r14.a
            r0.s = r15
            int r14 = r14.b
            r0.u = r14
            int r14 = r8.b()
            int r13 = r13 - r14
            int r5 = r5 - r13
            r8.t(r5)
        L_0x0120:
            int r5 = r8.i(r3)
            r0.p = r5
            if (r5 == 0) goto L_0x014b
            if (r5 == r2) goto L_0x0145
            if (r5 == r3) goto L_0x0141
            if (r5 == r12) goto L_0x0141
            r3 = 5
            if (r5 == r3) goto L_0x0141
            if (r5 == r10) goto L_0x013d
            r3 = 7
            if (r5 != r3) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x013d:
            r8.t(r2)
            goto L_0x014e
        L_0x0141:
            r8.t(r10)
            goto L_0x014e
        L_0x0145:
            r3 = 9
            r8.t(r3)
            goto L_0x014e
        L_0x014b:
            r8.t(r6)
        L_0x014e:
            boolean r3 = r8.h()
            r0.q = r3
            r12 = 0
            r0.r = r12
            if (r3 == 0) goto L_0x017b
            if (r1 != r2) goto L_0x016a
            int r1 = r8.i(r4)
            int r1 = r1 + r2
            int r1 = r1 * r6
            int r1 = r8.i(r1)
            long r3 = (long) r1
            r0.r = r3
            goto L_0x017b
        L_0x016a:
            boolean r1 = r8.h()
            long r3 = r0.r
            long r3 = r3 << r6
            int r5 = r8.i(r6)
            long r12 = (long) r5
            long r3 = r3 + r12
            r0.r = r3
            if (r1 != 0) goto L_0x016a
        L_0x017b:
            boolean r1 = r8.h()
            if (r1 == 0) goto L_0x019a
            r8.t(r6)
            goto L_0x019a
        L_0x0185:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x018a:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x018f:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x0194:
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x019a
        L_0x0198:
            r1 = 0
            goto L_0x0204
        L_0x019a:
            int r1 = r0.n
            if (r1 != 0) goto L_0x0212
            int r1 = r0.o
            if (r1 != 0) goto L_0x020d
            int r1 = r0.p
            if (r1 != 0) goto L_0x0208
            r1 = 0
        L_0x01a7:
            int r3 = r8.i(r6)
            int r1 = r1 + r3
            r4 = 255(0xff, float:3.57E-43)
            if (r3 == r4) goto L_0x01a7
            int r3 = r8.g()
            r4 = r3 & 7
            if (r4 != 0) goto L_0x01bf
            int r3 = r3 >> 3
            r7.G(r3)
            r3 = 0
            goto L_0x01ca
        L_0x01bf:
            byte[] r3 = r7.a
            int r4 = r1 * 8
            r8.j(r4, r3)
            r3 = 0
            r7.G(r3)
        L_0x01ca:
            zpf r4 = r0.e
            r4.b(r7, r1, r3)
            long r3 = r0.l
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r2 = 0
        L_0x01dc:
            defpackage.n79.n(r2)
            zpf r2 = r0.e
            long r3 = r0.l
            r21 = 0
            r22 = 0
            r19 = 1
            r16 = r2
            r17 = r3
            r20 = r1
            r16.a(r17, r19, r20, r21, r22)
            long r1 = r0.l
            long r3 = r0.t
            long r1 = r1 + r3
            r0.l = r1
            boolean r1 = r0.q
            if (r1 == 0) goto L_0x0198
            long r1 = r0.r
            int r1 = (int) r1
            r8.t(r1)
            goto L_0x0198
        L_0x0204:
            r0.h = r1
            goto L_0x0007
        L_0x0208:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x020d:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x0212:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r9, r9)
            throw r0
        L_0x0217:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x021d:
            r11 = r24
            int r1 = r0.k
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r2 = r24.u()
            r1 = r1 | r2
            r0.j = r1
            byte[] r2 = r7.a
            int r2 = r2.length
            if (r1 <= r2) goto L_0x023c
            r7.D(r1)
            byte[] r1 = r7.a
            r8.getClass()
            int r2 = r1.length
            r8.o(r2, r1)
        L_0x023c:
            r1 = 0
            r0.i = r1
            r0.h = r3
            goto L_0x0007
        L_0x0243:
            r11 = r24
            int r1 = r24.u()
            r2 = r1 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0255
            r0.k = r1
            r0.h = r4
            goto L_0x0007
        L_0x0255:
            if (r1 == r3) goto L_0x0007
            r1 = 0
            r0.h = r1
            goto L_0x0007
        L_0x025c:
            r11 = r24
            int r1 = r24.u()
            if (r1 != r3) goto L_0x0007
            r0.h = r2
            goto L_0x0007
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr7.f(l8b):void");
    }

    public final void g(boolean z) {
    }

    public final void i(int i2, long j2) {
        this.l = j2;
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.e = xf5.B(qtf.e, 1);
        qtf.b();
        this.f = qtf.f;
    }
}
