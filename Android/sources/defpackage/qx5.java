package defpackage;

/* renamed from: qx5  reason: default package */
public final class qx5 implements tf5 {
    public int X;
    public int Y;
    public int Z;
    public final l8b a = new l8b(4);
    public final l8b b = new l8b(9);
    public final l8b c = new l8b(11);
    public final l8b o = new l8b();
    public final nhd v;
    public long v0;
    public xf5 w;
    public boolean w0;
    public int x;
    public s70 x0;
    public boolean y;
    public z8g y0;
    public long z;

    /* JADX WARNING: type inference failed for: r0v4, types: [nhd, j3h] */
    public qx5() {
        ? j3h = new j3h((Object) new ip4());
        j3h.b = -9223372036854775807L;
        j3h.c = new long[0];
        j3h.o = new long[0];
        this.v = j3h;
        this.x = 1;
    }

    public final void U(xf5 xf5) {
        this.w = xf5;
    }

    public final l8b a(hf4 hf4) {
        int i = this.Z;
        l8b l8b = this.o;
        byte[] bArr = l8b.a;
        if (i > bArr.length) {
            l8b.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            l8b.G(0);
        }
        l8b.F(this.Z);
        hf4.j(l8b.a, 0, this.Z, false);
        return l8b;
    }

    public final void d(long j, long j2) {
        if (j == 0) {
            this.x = 1;
            this.y = false;
        } else {
            this.x = 3;
        }
        this.X = 0;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [s70, j3h] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r16, defpackage.yl4 r17) {
        /*
            r15 = this;
            r0 = r15
            xf5 r1 = r0.w
            defpackage.n79.o(r1)
        L_0x0006:
            int r1 = r0.x
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 9
            r7 = 8
            r8 = 2
            if (r1 == r4) goto L_0x0137
            r9 = 3
            if (r1 == r8) goto L_0x0128
            if (r1 == r9) goto L_0x00eb
            if (r1 != r2) goto L_0x00e5
            boolean r1 = r0.y
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            nhd r5 = r0.v
            if (r1 == 0) goto L_0x002b
            long r13 = r0.z
            long r11 = r0.v0
            long r13 = r13 + r11
            goto L_0x0036
        L_0x002b:
            long r11 = r5.b
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            r13 = 0
            goto L_0x0036
        L_0x0034:
            long r13 = r0.v0
        L_0x0036:
            int r1 = r0.Y
            if (r1 != r7) goto L_0x0061
            s70 r7 = r0.x0
            if (r7 == 0) goto L_0x0061
            boolean r1 = r0.w0
            if (r1 != 0) goto L_0x004e
            xf5 r1 = r0.w
            me0 r6 = new me0
            r6.<init>(r9)
            r1.M(r6)
            r0.w0 = r4
        L_0x004e:
            s70 r1 = r0.x0
            r6 = r16
            hf4 r6 = (defpackage.hf4) r6
            l8b r6 = r15.a(r6)
            r1.n1(r6)
            boolean r1 = r1.o1(r13, r6)
        L_0x005f:
            r6 = r4
            goto L_0x00c8
        L_0x0061:
            if (r1 != r6) goto L_0x008f
            z8g r6 = r0.y0
            if (r6 == 0) goto L_0x008f
            boolean r1 = r0.w0
            if (r1 != 0) goto L_0x0077
            xf5 r1 = r0.w
            me0 r6 = new me0
            r6.<init>(r9)
            r1.M(r6)
            r0.w0 = r4
        L_0x0077:
            z8g r1 = r0.y0
            r6 = r16
            hf4 r6 = (defpackage.hf4) r6
            l8b r6 = r15.a(r6)
            boolean r7 = r1.n1(r6)
            if (r7 == 0) goto L_0x00bb
            boolean r1 = r1.o1(r13, r6)
            if (r1 == 0) goto L_0x00bb
            r1 = r4
            goto L_0x005f
        L_0x008f:
            r6 = 18
            if (r1 != r6) goto L_0x00bd
            boolean r1 = r0.w0
            if (r1 != 0) goto L_0x00bd
            r1 = r16
            hf4 r1 = (defpackage.hf4) r1
            l8b r1 = r15.a(r1)
            r5.getClass()
            r5.n1(r13, r1)
            long r6 = r5.b
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            xf5 r1 = r0.w
            we7 r11 = new we7
            long[] r12 = r5.o
            long[] r13 = r5.c
            r11.<init>(r6, r12, r13)
            r1.M(r11)
            r0.w0 = r4
        L_0x00bb:
            r1 = r3
            goto L_0x005f
        L_0x00bd:
            int r1 = r0.Z
            r6 = r16
            hf4 r6 = (defpackage.hf4) r6
            r6.z(r1)
            r1 = r3
            r6 = r1
        L_0x00c8:
            boolean r7 = r0.y
            if (r7 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            r0.y = r4
            long r4 = r5.b
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            long r4 = r0.v0
            long r11 = -r4
            goto L_0x00dc
        L_0x00da:
            r11 = 0
        L_0x00dc:
            r0.z = r11
        L_0x00de:
            r0.X = r2
            r0.x = r8
            if (r6 == 0) goto L_0x0006
            return r3
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00eb:
            l8b r1 = r0.c
            byte[] r6 = r1.a
            r7 = 11
            r8 = r16
            hf4 r8 = (defpackage.hf4) r8
            boolean r4 = r8.j(r6, r3, r7, r4)
            if (r4 != 0) goto L_0x00fc
            return r5
        L_0x00fc:
            r1.G(r3)
            int r3 = r1.u()
            r0.Y = r3
            int r3 = r1.x()
            r0.Z = r3
            int r3 = r1.x()
            long r3 = (long) r3
            r0.v0 = r3
            int r3 = r1.u()
            int r3 = r3 << 24
            long r3 = (long) r3
            long r5 = r0.v0
            long r3 = r3 | r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.v0 = r3
            r1.H(r9)
            r0.x = r2
            goto L_0x0006
        L_0x0128:
            int r1 = r0.X
            r2 = r16
            hf4 r2 = (defpackage.hf4) r2
            r2.z(r1)
            r0.X = r3
            r0.x = r9
            goto L_0x0006
        L_0x0137:
            l8b r1 = r0.b
            byte[] r9 = r1.a
            r10 = r16
            hf4 r10 = (defpackage.hf4) r10
            boolean r9 = r10.j(r9, r3, r6, r4)
            if (r9 != 0) goto L_0x0146
            return r5
        L_0x0146:
            r1.G(r3)
            r1.H(r2)
            int r2 = r1.u()
            r5 = r2 & 4
            if (r5 == 0) goto L_0x0156
            r5 = r4
            goto L_0x0157
        L_0x0156:
            r5 = r3
        L_0x0157:
            r2 = r2 & 1
            if (r2 == 0) goto L_0x015c
            r3 = r4
        L_0x015c:
            if (r5 == 0) goto L_0x016f
            s70 r2 = r0.x0
            if (r2 != 0) goto L_0x016f
            s70 r2 = new s70
            xf5 r5 = r0.w
            zpf r4 = r5.B(r7, r4)
            r2.<init>((java.lang.Object) r4)
            r0.x0 = r2
        L_0x016f:
            if (r3 == 0) goto L_0x0182
            z8g r2 = r0.y0
            if (r2 != 0) goto L_0x0182
            z8g r2 = new z8g
            xf5 r3 = r0.w
            zpf r3 = r3.B(r6, r8)
            r2.<init>(r3)
            r0.y0 = r2
        L_0x0182:
            xf5 r2 = r0.w
            r2.v()
            int r1 = r1.g()
            int r1 = r1 + -5
            r0.X = r1
            r0.x = r8
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx5.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        l8b l8b = this.a;
        ((hf4) vf5).q(l8b.a, 0, 3, false);
        l8b.G(0);
        if (l8b.x() != 4607062) {
            return false;
        }
        hf4 hf4 = (hf4) vf5;
        hf4.q(l8b.a, 0, 2, false);
        l8b.G(0);
        if ((l8b.A() & 250) != 0) {
            return false;
        }
        hf4.q(l8b.a, 0, 4, false);
        l8b.G(0);
        int g = l8b.g();
        hf4.w = 0;
        hf4.a(g, false);
        hf4.q(l8b.a, 0, 4, false);
        l8b.G(0);
        return l8b.g() == 0;
    }

    public final void release() {
    }
}
