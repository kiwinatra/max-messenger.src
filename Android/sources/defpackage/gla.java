package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: gla  reason: default package */
public final class gla implements sf5 {
    public wf5 a;
    public ixe b;
    public boolean c;

    public final boolean a(gf4 gf4) {
        boolean z;
        kla kla = new kla(0);
        if (kla.a(gf4, true) && (kla.a & 2) == 2) {
            int min = Math.min(kla.e, 8);
            g1g g1g = new g1g(min);
            gf4.q(g1g.a, 0, min, false);
            g1g.H(0);
            if (g1g.c() >= 5 && g1g.v() == 127 && g1g.w() == 1179402563) {
                this.b = new ixe(0);
            } else {
                g1g.H(0);
                try {
                    z = n54.V(1, g1g, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.b = new ixe(0);
                } else {
                    g1g.H(0);
                    if (d5b.g(g1g, d5b.o)) {
                        this.b = new ixe(0);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void d(long j, long j2) {
        ixe ixe = this.b;
        if (ixe != null) {
            jla jla = (jla) ixe.j;
            kla kla = (kla) jla.e;
            kla.a = 0;
            kla.b = 0;
            kla.c = 0;
            kla.d = 0;
            kla.e = 0;
            ((g1g) jla.f).E(0);
            jla.b = -1;
            jla.d = false;
            if (j == 0) {
                ixe.f(!ixe.h);
            } else if (ixe.e != 0) {
                long j3 = (((long) ixe.f) * j2) / 1000000;
                ixe.b = j3;
                int i = t0g.a;
                ((lla) ixe.m).c(j3);
                ixe.e = 2;
            }
        }
    }

    public final void g(wf5 wf5) {
        this.a = wf5;
    }

    public final boolean h(uf5 uf5) {
        try {
            return a((gf4) uf5);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r19, defpackage.yl4 r20) {
        /*
            r18 = this;
            r0 = r18
            wf5 r1 = r0.a
            defpackage.y64.k(r1)
            ixe r1 = r0.b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r19
            gf4 r1 = (defpackage.gf4) r1
            boolean r3 = r0.a(r1)
            if (r3 == 0) goto L_0x0019
            r1.w = r2
            goto L_0x0021
        L_0x0019:
            java.lang.String r0 = "Failed to determine bitstream type"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0021:
            boolean r1 = r0.c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            wf5 r1 = r0.a
            ypf r1 = r1.B(r2, r3)
            wf5 r4 = r0.a
            r4.v()
            ixe r4 = r0.b
            wf5 r5 = r0.a
            r4.l = r5
            r4.k = r1
            r4.f(r3)
            r0.c = r3
        L_0x003e:
            ixe r0 = r0.b
            java.lang.Object r1 = r0.k
            ypf r1 = (defpackage.ypf) r1
            defpackage.y64.k(r1)
            int r1 = defpackage.t0g.a
            int r1 = r0.e
            java.lang.Object r4 = r0.j
            jla r4 = (defpackage.jla) r4
            r5 = -1
            r7 = -1
            r8 = 3
            r14 = 2
            if (r1 == 0) goto L_0x0101
            if (r1 == r3) goto L_0x00f3
            if (r1 == r14) goto L_0x0065
            if (r1 != r8) goto L_0x005f
        L_0x005c:
            r2 = r7
            goto L_0x01aa
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0065:
            java.lang.Object r1 = r0.m
            lla r1 = (defpackage.lla) r1
            r9 = r19
            gf4 r9 = (defpackage.gf4) r9
            long r10 = r1.i(r9)
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x007e
            r1 = r20
            r1.b = r10
            r2 = r3
            goto L_0x01aa
        L_0x007e:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0089
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r0.a(r10)
        L_0x0089:
            boolean r1 = r0.h
            if (r1 != 0) goto L_0x00a1
            java.lang.Object r1 = r0.m
            lla r1 = (defpackage.lla) r1
            rnd r1 = r1.b()
            defpackage.y64.k(r1)
            java.lang.Object r10 = r0.l
            wf5 r10 = (defpackage.wf5) r10
            r10.K(r1)
            r0.h = r3
        L_0x00a1:
            long r10 = r0.g
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x00b1
            boolean r1 = r4.b(r9)
            if (r1 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r0.e = r8
            goto L_0x005c
        L_0x00b1:
            r0.g = r12
            java.lang.Object r1 = r4.f
            g1g r1 = (defpackage.g1g) r1
            long r3 = r0.c(r1)
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x00ec
            long r7 = r0.d
            long r9 = r7 + r3
            long r11 = r0.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00ec
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            int r9 = r0.f
            long r9 = (long) r9
            long r12 = r7 / r9
            java.lang.Object r7 = r0.k
            ypf r7 = (defpackage.ypf) r7
            int r8 = r1.c
            r7.c(r8, r1)
            java.lang.Object r7 = r0.k
            r11 = r7
            ypf r11 = (defpackage.ypf) r11
            int r15 = r1.c
            r16 = 0
            r17 = 0
            r14 = 1
            r11.b(r12, r14, r15, r16, r17)
            r0.b = r5
        L_0x00ec:
            long r5 = r0.d
            long r5 = r5 + r3
            r0.d = r5
            goto L_0x01aa
        L_0x00f3:
            long r3 = r0.c
            int r1 = (int) r3
            r3 = r19
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r1)
            r0.e = r14
            goto L_0x01aa
        L_0x0101:
            r1 = r19
            gf4 r1 = (defpackage.gf4) r1
            boolean r9 = r4.b(r1)
            if (r9 != 0) goto L_0x010f
            r0.e = r8
            goto L_0x005c
        L_0x010f:
            long r9 = r1.o
            long r11 = r0.c
            long r9 = r9 - r11
            r0.g = r9
            java.lang.Object r1 = r0.n
            xe8 r1 = (defpackage.xe8) r1
            java.lang.Object r9 = r4.f
            r15 = r9
            g1g r15 = (defpackage.g1g) r15
            boolean r1 = r0.e(r15, r11, r1)
            if (r1 == 0) goto L_0x012e
            r1 = r19
            gf4 r1 = (defpackage.gf4) r1
            long r9 = r1.o
            r0.c = r9
            goto L_0x0101
        L_0x012e:
            java.lang.Object r1 = r0.n
            xe8 r1 = (defpackage.xe8) r1
            java.lang.Object r1 = r1.b
            ca6 r1 = (defpackage.ca6) r1
            int r7 = r1.I0
            r0.f = r7
            boolean r7 = r0.i
            if (r7 != 0) goto L_0x0147
            java.lang.Object r7 = r0.k
            ypf r7 = (defpackage.ypf) r7
            r7.d(r1)
            r0.i = r3
        L_0x0147:
            java.lang.Object r1 = r0.n
            xe8 r1 = (defpackage.xe8) r1
            java.lang.Object r1 = r1.c
            vy r1 = (defpackage.vy) r1
            if (r1 == 0) goto L_0x0156
            r0.m = r1
        L_0x0153:
            r1 = r14
            r2 = r15
            goto L_0x018f
        L_0x0156:
            r1 = r19
            gf4 r1 = (defpackage.gf4) r1
            long r10 = r1.c
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x016a
            v9a r1 = new v9a
            r3 = 19
            r1.<init>((int) r3)
            r0.m = r1
            goto L_0x0153
        L_0x016a:
            java.lang.Object r1 = r4.e
            kla r1 = (defpackage.kla) r1
            int r4 = r1.a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0177
            r16 = r3
            goto L_0x0179
        L_0x0177:
            r16 = r2
        L_0x0179:
            kh4 r3 = new kh4
            long r8 = r0.c
            int r4 = r1.d
            int r5 = r1.e
            int r4 = r4 + r5
            long r12 = (long) r4
            long r4 = r1.b
            r6 = r3
            r7 = r0
            r1 = r14
            r2 = r15
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16)
            r0.m = r3
        L_0x018f:
            r0.e = r1
            byte[] r0 = r2.a
            int r1 = r0.length
            r3 = 65025(0xfe01, float:9.112E-41)
            if (r1 != r3) goto L_0x019a
            goto L_0x01a9
        L_0x019a:
            int r1 = r2.c
            int r1 = java.lang.Math.max(r3, r1)
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r2.c
            r2.F(r1, r0)
        L_0x01a9:
            r2 = 0
        L_0x01aa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gla.i(uf5, yl4):int");
    }

    public final void release() {
    }
}
