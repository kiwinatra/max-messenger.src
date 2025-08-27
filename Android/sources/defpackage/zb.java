package defpackage;

/* renamed from: zb  reason: default package */
public final class zb implements sf5 {
    public final int a = 0;
    public final bc b = new bc(true, (String) null);
    public final g1g c = new g1g(2048);
    public final g1g d;
    public final ky1 e;
    public wf5 f;
    public long g;
    public long h = -1;
    public int i = -1;
    public boolean j;
    public boolean k;
    public boolean l;

    public zb() {
        g1g g1g = new g1g(10);
        this.d = g1g;
        byte[] bArr = g1g.a;
        this.e = new ky1(bArr, (byte) 0, bArr.length, 1);
    }

    public final int a(gf4 gf4) {
        int i2 = 0;
        while (true) {
            g1g g1g = this.d;
            gf4.q(g1g.a, 0, 10, false);
            g1g.H(0);
            if (g1g.x() != 4801587) {
                break;
            }
            g1g.I(3);
            int u = g1g.u();
            i2 += u + 10;
            gf4.a(u, false);
        }
        gf4.w = 0;
        gf4.a(i2, false);
        if (this.h == -1) {
            this.h = (long) i2;
        }
        return i2;
    }

    public final void d(long j2, long j3) {
        this.k = false;
        this.b.a();
        this.g = j3;
    }

    public final void g(wf5 wf5) {
        this.f = wf5;
        this.b.l(wf5, new qtf(0, 1, 0, (byte) 0));
        wf5.v();
    }

    public final boolean h(uf5 uf5) {
        gf4 gf4 = (gf4) uf5;
        int a2 = a(gf4);
        int i2 = a2;
        int i3 = 0;
        int i4 = 0;
        do {
            g1g g1g = this.d;
            gf4.q(g1g.a, 0, 2, false);
            g1g.H(0);
            if ((g1g.A() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                gf4.q(g1g.a, 0, 4, false);
                ky1 ky1 = this.e;
                ky1.q(14);
                int i5 = ky1.i(13);
                if (i5 <= 6) {
                    i2++;
                    gf4.w = 0;
                    gf4.a(i2, false);
                } else {
                    gf4.a(i5 - 6, false);
                    i4 += i5;
                }
            } else {
                i2++;
                gf4.w = 0;
                gf4.a(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - a2 < 8192);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r19, defpackage.yl4 r20) {
        /*
            r18 = this;
            r0 = r18
            wf5 r1 = r0.f
            defpackage.y64.k(r1)
            r1 = r19
            gf4 r1 = (defpackage.gf4) r1
            long r3 = r1.c
            int r1 = r0.a
            r2 = r1 & 2
            r10 = 0
            r11 = 1
            r13 = -1
            if (r2 != 0) goto L_0x0024
            r5 = r1 & 1
            if (r5 == 0) goto L_0x0021
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r5 = r13
            goto L_0x00b3
        L_0x0024:
            ky1 r5 = r0.e
            g1g r6 = r0.d
            boolean r7 = r0.j
            if (r7 == 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0.i = r13
            r7 = r19
            gf4 r7 = (defpackage.gf4) r7
            r7.w = r10
            long r8 = r7.o
            r14 = 0
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x0040
            r0.a(r7)
        L_0x0040:
            r8 = r10
        L_0x0041:
            byte[] r9 = r6.a     // Catch:{ EOFException -> 0x00a0 }
            r13 = r19
            gf4 r13 = (defpackage.gf4) r13     // Catch:{ EOFException -> 0x00a0 }
            r12 = 2
            boolean r9 = r13.q(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 == 0) goto L_0x00a0
            r6.H(r10)     // Catch:{ EOFException -> 0x00a0 }
            int r9 = r6.A()     // Catch:{ EOFException -> 0x00a0 }
            r12 = 65526(0xfff6, float:9.1821E-41)
            r9 = r9 & r12
            r12 = 65520(0xfff0, float:9.1813E-41)
            if (r9 != r12) goto L_0x0060
            r9 = r11
            goto L_0x0061
        L_0x0060:
            r9 = r10
        L_0x0061:
            if (r9 != 0) goto L_0x0065
            r8 = r10
            goto L_0x00a0
        L_0x0065:
            byte[] r9 = r6.a     // Catch:{ EOFException -> 0x00a0 }
            r12 = 4
            boolean r9 = r13.q(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x006f
            goto L_0x00a0
        L_0x006f:
            r9 = 14
            r5.q(r9)     // Catch:{ EOFException -> 0x00a0 }
            r9 = 13
            int r9 = r5.i(r9)     // Catch:{ EOFException -> 0x00a0 }
            r12 = 6
            if (r9 <= r12) goto L_0x0095
            long r10 = (long) r9     // Catch:{ EOFException -> 0x00a0 }
            long r14 = r14 + r10
            int r8 = r8 + 1
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r8 != r10) goto L_0x0087
            r10 = 1
            goto L_0x00a0
        L_0x0087:
            int r9 = r9 + -6
            r10 = 1
            boolean r9 = r13.a(r9, r10)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x0091
            goto L_0x00a0
        L_0x0091:
            r11 = r10
            r10 = 0
            r13 = -1
            goto L_0x0041
        L_0x0095:
            r10 = r11
            r0.j = r10     // Catch:{ EOFException -> 0x00a0 }
            java.lang.String r5 = "Malformed ADTS stream"
            r6 = 0
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.a(r5, r6)     // Catch:{ EOFException -> 0x00a0 }
            throw r5     // Catch:{ EOFException -> 0x00a0 }
        L_0x00a0:
            r5 = 0
            r7.w = r5
            if (r8 <= 0) goto L_0x00ad
            long r5 = (long) r8
            long r14 = r14 / r5
            int r5 = (int) r14
            r0.i = r5
            r5 = -1
        L_0x00ab:
            r6 = 1
            goto L_0x00b1
        L_0x00ad:
            r5 = -1
            r0.i = r5
            goto L_0x00ab
        L_0x00b1:
            r0.j = r6
        L_0x00b3:
            g1g r10 = r0.c
            byte[] r6 = r10.a
            r7 = 2048(0x800, float:2.87E-42)
            r8 = r19
            gf4 r8 = (defpackage.gf4) r8
            r9 = 0
            int r11 = r8.read(r6, r9, r7)
            if (r11 != r5) goto L_0x00c6
            r13 = 1
            goto L_0x00c7
        L_0x00c6:
            r13 = 0
        L_0x00c7:
            boolean r5 = r0.l
            bc r14 = r0.b
            if (r5 == 0) goto L_0x00cf
        L_0x00cd:
            r1 = 1
            goto L_0x0121
        L_0x00cf:
            r5 = 1
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00d9
            int r1 = r0.i
            if (r1 <= 0) goto L_0x00d9
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x00ea
            long r7 = r14.q
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00ea
            if (r13 != 0) goto L_0x00ea
            goto L_0x00cd
        L_0x00ea:
            if (r1 == 0) goto L_0x0114
            long r7 = r14.q
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0114
            wf5 r1 = r0.f
            if (r2 == 0) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            int r15 = r0.i
            int r2 = r15 * 8
            long r5 = (long) r2
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r16
            long r5 = r5 / r7
            int r7 = (int) r5
            ti3 r8 = new ti3
            long r5 = r0.h
            r2 = r8
            r12 = r8
            r8 = r15
            r2.<init>(r3, r5, r7, r8, r9)
            r1.K(r12)
        L_0x0112:
            r1 = 1
            goto L_0x011f
        L_0x0114:
            wf5 r1 = r0.f
            tq5 r2 = new tq5
            r2.<init>(r5)
            r1.K(r2)
            goto L_0x0112
        L_0x011f:
            r0.l = r1
        L_0x0121:
            if (r13 == 0) goto L_0x0125
            r2 = -1
            return r2
        L_0x0125:
            r2 = 0
            r10.H(r2)
            r10.G(r11)
            boolean r3 = r0.k
            if (r3 != 0) goto L_0x0138
            long r3 = r0.g
            r5 = 4
            r14.i(r5, r3)
            r0.k = r1
        L_0x0138:
            r14.h(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb.i(uf5, yl4):int");
    }

    public final void release() {
    }
}
