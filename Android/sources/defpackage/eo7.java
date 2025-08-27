package defpackage;

/* renamed from: eo7  reason: default package */
public final class eo7 implements sf5 {
    public final g1g a = new g1g(6);
    public wf5 b;
    public int c;
    public int d;
    public int e;
    public long f = -1;
    public nt9 g;
    public uf5 h;
    public jz2 i;
    public nu9 j;

    public final void a() {
        b(new pp9[0]);
        wf5 wf5 = this.b;
        wf5.getClass();
        wf5.v();
        this.b.K(new tq5(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(pp9... pp9Arr) {
        wf5 wf5 = this.b;
        wf5.getClass();
        ypf B = wf5.B(1024, 4);
        aa6 aa6 = new aa6();
        aa6.j = "image/jpeg";
        aa6.i = new rp9(pp9Arr);
        B.d(new ca6(aa6));
    }

    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            nu9 nu9 = this.j;
            nu9.getClass();
            nu9.d(j2, j3);
        }
    }

    public final void g(wf5 wf5) {
        this.b = wf5;
    }

    public final boolean h(uf5 uf5) {
        gf4 gf4 = (gf4) uf5;
        g1g g1g = this.a;
        g1g.E(2);
        gf4.q(g1g.a, 0, 2, false);
        if (g1g.A() != 65496) {
            return false;
        }
        g1g.E(2);
        gf4.q(g1g.a, 0, 2, false);
        int A = g1g.A();
        this.d = A;
        if (A == 65504) {
            g1g.E(2);
            gf4.q(g1g.a, 0, 2, false);
            gf4.a(g1g.A() - 2, false);
            g1g.E(2);
            gf4.q(g1g.a, 0, 2, false);
            this.d = g1g.A();
        }
        if (this.d != 65505) {
            return false;
        }
        gf4.a(2, false);
        g1g.E(6);
        gf4.q(g1g.a, 0, 6, false);
        return g1g.w() == 1165519206 && g1g.A() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r26, defpackage.yl4 r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = -1
            r4 = 1
            r5 = 0
            int r6 = r0.c
            r7 = -1
            r9 = 4
            g1g r10 = r0.a
            r11 = 2
            if (r6 == 0) goto L_0x0183
            if (r6 == r4) goto L_0x016e
            if (r6 == r11) goto L_0x00b2
            r7 = 5
            if (r6 == r9) goto L_0x0050
            if (r6 == r7) goto L_0x0026
            r0 = 6
            if (r6 != r0) goto L_0x0020
            return r3
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            jz2 r3 = r0.i
            if (r3 == 0) goto L_0x002e
            uf5 r3 = r0.h
            if (r1 == r3) goto L_0x003b
        L_0x002e:
            r0.h = r1
            jz2 r3 = new jz2
            long r5 = r0.f
            gf4 r1 = (defpackage.gf4) r1
            r3.<init>((defpackage.gf4) r1, (long) r5)
            r0.i = r3
        L_0x003b:
            nu9 r1 = r0.j
            r1.getClass()
            jz2 r3 = r0.i
            int r1 = r1.i(r3, r2)
            if (r1 != r4) goto L_0x004f
            long r3 = r2.b
            long r5 = r0.f
            long r3 = r3 + r5
            r2.b = r3
        L_0x004f:
            return r1
        L_0x0050:
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            long r8 = r3.o
            long r11 = r0.f
            int r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x005e
            r2.b = r11
            return r4
        L_0x005e:
            byte[] r2 = r10.a
            gf4 r1 = (defpackage.gf4) r1
            boolean r2 = r1.q(r2, r5, r4, r4)
            if (r2 != 0) goto L_0x006c
            r25.a()
            goto L_0x00b1
        L_0x006c:
            r1.w = r5
            nu9 r2 = r0.j
            if (r2 != 0) goto L_0x0079
            nu9 r2 = new nu9
            r2.<init>()
            r0.j = r2
        L_0x0079:
            jz2 r2 = new jz2
            long r8 = r0.f
            r2.<init>((defpackage.gf4) r1, (long) r8)
            r0.i = r2
            nu9 r1 = r0.j
            r1.getClass()
            boolean r1 = defpackage.i8b.R(r2, r5, r5)
            if (r1 == 0) goto L_0x00ae
            nu9 r1 = r0.j
            jz2 r2 = new jz2
            long r8 = r0.f
            wf5 r3 = r0.b
            r3.getClass()
            r6 = 13
            r2.<init>((long) r8, (java.lang.Object) r3, (int) r6)
            r1.q = r2
            nt9 r1 = r0.g
            r1.getClass()
            pp9[] r2 = new defpackage.pp9[r4]
            r2[r5] = r1
            r0.b(r2)
            r0.c = r7
            goto L_0x00b1
        L_0x00ae:
            r25.a()
        L_0x00b1:
            return r5
        L_0x00b2:
            int r2 = r0.d
            r6 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r6) goto L_0x0163
            g1g r2 = new g1g
            int r6 = r0.e
            r2.<init>((int) r6)
            byte[] r6 = r2.a
            int r9 = r0.e
            r10 = r1
            gf4 r10 = (defpackage.gf4) r10
            r10.j(r6, r5, r9, r5)
            nt9 r6 = r0.g
            if (r6 != 0) goto L_0x0161
            java.lang.String r6 = "http://ns.adobe.com/xap/1.0/"
            java.lang.String r9 = r2.q()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0161
            java.lang.String r2 = r2.q()
            if (r2 == 0) goto L_0x0161
            gf4 r1 = (defpackage.gf4) r1
            long r9 = r1.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00eb
        L_0x00e8:
            r6 = 0
            goto L_0x0159
        L_0x00eb:
            mt9 r1 = defpackage.bs0.N(r2)     // Catch:{ ParserException | NumberFormatException | XmlPullParserException -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            if (r1 != 0) goto L_0x00f4
            goto L_0x00e8
        L_0x00f4:
            java.util.List r2 = r1.b
            int r12 = r2.size()
            if (r12 >= r11) goto L_0x00fd
            goto L_0x00e8
        L_0x00fd:
            int r11 = r2.size()
            int r11 = r11 - r4
            r4 = r5
            r13 = r7
            r15 = r13
            r19 = r15
            r21 = r19
        L_0x0109:
            if (r11 < 0) goto L_0x013e
            java.lang.Object r12 = r2.get(r11)
            kt9 r12 = (defpackage.kt9) r12
            java.lang.String r6 = r12.a
            java.lang.String r5 = "video/mp4"
            boolean r5 = r5.equals(r6)
            r4 = r4 | r5
            if (r11 != 0) goto L_0x0127
            long r5 = r12.c
            long r9 = r9 - r5
            r5 = 0
        L_0x0121:
            r23 = r5
            r5 = r9
            r9 = r23
            goto L_0x012c
        L_0x0127:
            long r5 = r12.b
            long r5 = r9 - r5
            goto L_0x0121
        L_0x012c:
            if (r4 == 0) goto L_0x0137
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0137
            long r21 = r5 - r9
            r19 = r9
            r4 = 0
        L_0x0137:
            if (r11 != 0) goto L_0x013b
            r15 = r5
            r13 = r9
        L_0x013b:
            int r11 = r11 + r3
            r5 = 0
            goto L_0x0109
        L_0x013e:
            int r2 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x014f
            goto L_0x00e8
        L_0x014f:
            nt9 r6 = new nt9
            long r1 = r1.a
            r12 = r6
            r17 = r1
            r12.<init>(r13, r15, r17, r19, r21)
        L_0x0159:
            r0.g = r6
            if (r6 == 0) goto L_0x0161
            long r1 = r6.o
            r0.f = r1
        L_0x0161:
            r2 = 0
            goto L_0x016b
        L_0x0163:
            int r2 = r0.e
            gf4 r1 = (defpackage.gf4) r1
            r1.z(r2)
            goto L_0x0161
        L_0x016b:
            r0.c = r2
            return r2
        L_0x016e:
            r2 = r5
            r10.E(r11)
            byte[] r3 = r10.a
            gf4 r1 = (defpackage.gf4) r1
            r1.j(r3, r2, r11, r2)
            int r1 = r10.A()
            int r1 = r1 - r11
            r0.e = r1
            r0.c = r11
            return r2
        L_0x0183:
            r2 = r5
            r10.E(r11)
            byte[] r3 = r10.a
            gf4 r1 = (defpackage.gf4) r1
            r1.j(r3, r2, r11, r2)
            int r1 = r10.A()
            r0.d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01a7
            long r1 = r0.f
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x01a3
            r0.c = r9
        L_0x01a1:
            r0 = 0
            goto L_0x01b9
        L_0x01a3:
            r25.a()
            goto L_0x01a1
        L_0x01a7:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01b1
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01a1
        L_0x01b1:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01a1
            r0.c = r4
            goto L_0x01a1
        L_0x01b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo7.i(uf5, yl4):int");
    }

    public final void release() {
        nu9 nu9 = this.j;
        if (nu9 != null) {
            nu9.getClass();
        }
    }
}
