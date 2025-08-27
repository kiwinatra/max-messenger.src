package defpackage;

import java.util.Arrays;

/* renamed from: bc  reason: default package */
public final class bc implements v05 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final ky1 b = new ky1(new byte[7], (byte) 0, 7, 1);
    public final g1g c = new g1g(Arrays.copyOf(v, 10));
    public final String d;
    public String e;
    public ypf f;
    public ypf g;
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public boolean k;
    public boolean l;
    public int m = -1;
    public int n = -1;
    public int o;
    public boolean p;
    public long q = -9223372036854775807L;
    public int r;
    public long s = -9223372036854775807L;
    public ypf t;
    public long u;

    public bc(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [boolean, int, byte] */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = 7
            r4 = 0
            r5 = 2
            r6 = 1
            ypf r7 = r0.f
            r7.getClass()
            int r7 = defpackage.t0g.a
        L_0x000f:
            int r7 = r23.c()
            if (r7 <= 0) goto L_0x0301
            int r7 = r0.h
            r8 = 256(0x100, float:3.59E-43)
            r9 = 4
            r10 = 3
            r11 = 13
            g1g r12 = r0.c
            ky1 r13 = r0.b
            if (r7 == 0) goto L_0x0198
            if (r7 == r6) goto L_0x015c
            r14 = 10
            if (r7 == r5) goto L_0x0124
            if (r7 == r10) goto L_0x0070
            if (r7 != r9) goto L_0x006a
            int r7 = r23.c()
            int r9 = r0.r
            int r10 = r0.i
            int r9 = r9 - r10
            int r7 = java.lang.Math.min(r7, r9)
            ypf r9 = r0.t
            r9.c(r7, r1)
            int r9 = r0.i
            int r9 = r9 + r7
            r0.i = r9
            int r14 = r0.r
            if (r9 != r14) goto L_0x000f
            long r11 = r0.s
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0063
            ypf r10 = r0.t
            r13 = 1
            r15 = 0
            r16 = 0
            r10.b(r11, r13, r14, r15, r16)
            long r9 = r0.s
            long r11 = r0.u
            long r9 = r9 + r11
            r0.s = r9
        L_0x0063:
            r0.h = r4
            r0.i = r4
            r0.j = r8
            goto L_0x000f
        L_0x006a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0070:
            boolean r7 = r0.k
            r8 = 5
            if (r7 == 0) goto L_0x0077
            r7 = r3
            goto L_0x0078
        L_0x0077:
            r7 = r8
        L_0x0078:
            byte[] r12 = r13.b
            int r15 = r23.c()
            int r2 = r0.i
            int r2 = r7 - r2
            int r2 = java.lang.Math.min(r15, r2)
            int r15 = r0.i
            r1.g(r15, r12, r2)
            int r12 = r0.i
            int r12 = r12 + r2
            r0.i = r12
            if (r12 != r7) goto L_0x000f
            r13.q(r4)
            boolean r2 = r0.p
            if (r2 != 0) goto L_0x0102
            int r2 = r13.i(r5)
            int r2 = r2 + r6
            if (r2 == r5) goto L_0x00a1
            r2 = r5
        L_0x00a1:
            r13.t(r8)
            int r7 = r13.i(r10)
            int r8 = r0.n
            int r2 = r2 << r10
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r12 = r8 >> 1
            r12 = r12 & r3
            r2 = r2 | r12
            byte r2 = (byte) r2
            int r8 = r8 << r3
            r8 = r8 & 128(0x80, float:1.794E-43)
            int r7 = r7 << r10
            r7 = r7 & 120(0x78, float:1.68E-43)
            r7 = r7 | r8
            byte r7 = (byte) r7
            byte[] r8 = new byte[r5]
            r8[r4] = r2
            r8[r6] = r7
            ky1 r2 = new ky1
            r2.<init>((byte[]) r8, (byte) r4, (int) r5, (int) r6)
            e r2 = defpackage.q8.J(r2, r4)
            aa6 r7 = new aa6
            r7.<init>()
            java.lang.String r10 = r0.e
            r7.a = r10
            java.lang.String r10 = "audio/mp4a-latm"
            r7.k = r10
            java.lang.String r10 = r2.c
            r7.h = r10
            int r10 = r2.b
            r7.x = r10
            int r2 = r2.a
            r7.y = r2
            java.util.List r2 = java.util.Collections.singletonList(r8)
            r7.m = r2
            java.lang.String r2 = r0.d
            r7.c = r2
            ca6 r2 = new ca6
            r2.<init>(r7)
            int r7 = r2.I0
            long r7 = (long) r7
            r14 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r14 = r14 / r7
            r0.q = r14
            ypf r7 = r0.f
            r7.d(r2)
            r0.p = r6
            goto L_0x0105
        L_0x0102:
            r13.t(r14)
        L_0x0105:
            r13.t(r9)
            int r2 = r13.i(r11)
            int r7 = r2 + -7
            boolean r8 = r0.k
            if (r8 == 0) goto L_0x0114
            int r7 = r2 + -9
        L_0x0114:
            ypf r2 = r0.f
            long r10 = r0.q
            r0.h = r9
            r0.i = r4
            r0.t = r2
            r0.u = r10
            r0.r = r7
            goto L_0x000f
        L_0x0124:
            byte[] r2 = r12.a
            int r7 = r23.c()
            int r8 = r0.i
            int r8 = 10 - r8
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0.i
            r1.g(r8, r2, r7)
            int r2 = r0.i
            int r2 = r2 + r7
            r0.i = r2
            if (r2 != r14) goto L_0x000f
            ypf r2 = r0.g
            r2.c(r14, r12)
            r2 = 6
            r12.H(r2)
            ypf r2 = r0.g
            int r7 = r12.u()
            int r7 = r7 + r14
            r0.h = r9
            r0.i = r14
            r0.t = r2
            r8 = 0
            r0.u = r8
            r0.r = r7
            goto L_0x000f
        L_0x015c:
            int r2 = r23.c()
            if (r2 != 0) goto L_0x0164
            goto L_0x000f
        L_0x0164:
            byte[] r2 = r13.b
            byte[] r7 = r1.a
            int r11 = r1.b
            byte r7 = r7[r11]
            r2[r4] = r7
            r13.q(r5)
            int r2 = r13.i(r9)
            int r7 = r0.n
            r9 = -1
            if (r7 == r9) goto L_0x0186
            if (r2 == r7) goto L_0x0186
            r0.l = r4
            r0.h = r4
            r0.i = r4
            r0.j = r8
            goto L_0x000f
        L_0x0186:
            boolean r7 = r0.l
            if (r7 != 0) goto L_0x0192
            r0.l = r6
            int r7 = r0.o
            r0.m = r7
            r0.n = r2
        L_0x0192:
            r0.h = r10
            r0.i = r4
            goto L_0x000f
        L_0x0198:
            byte[] r2 = r1.a
            int r7 = r1.b
            int r14 = r1.c
        L_0x019e:
            if (r7 >= r14) goto L_0x02f6
            int r15 = r7 + 1
            byte r8 = r2[r7]
            r10 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r0.j
            r11 = 512(0x200, float:7.175E-43)
            if (r3 != r11) goto L_0x0294
            byte r3 = (byte) r10
            r3 = r3 & 255(0xff, float:3.57E-43)
            r17 = 65280(0xff00, float:9.1477E-41)
            r3 = r17 | r3
            r18 = 65526(0xfff6, float:9.1821E-41)
            r3 = r3 & r18
            r11 = 65520(0xfff0, float:9.1813E-41)
            if (r3 != r11) goto L_0x0294
            boolean r3 = r0.l
            if (r3 != 0) goto L_0x026d
            r3 = -1
            int r19 = r7 + -1
            r1.H(r7)
            byte[] r3 = r13.b
            int r11 = r23.c()
            if (r11 >= r6) goto L_0x01d2
            goto L_0x0294
        L_0x01d2:
            r1.g(r4, r3, r6)
            r13.q(r9)
            int r3 = r13.i(r6)
            int r11 = r0.m
            r9 = -1
            if (r11 == r9) goto L_0x01e8
            if (r3 == r11) goto L_0x01e8
            r20 = r2
            r2 = r9
            goto L_0x0297
        L_0x01e8:
            int r11 = r0.n
            if (r11 == r9) goto L_0x020b
            byte[] r9 = r13.b
            int r11 = r23.c()
            if (r11 >= r6) goto L_0x01f6
            goto L_0x026d
        L_0x01f6:
            r1.g(r4, r9, r6)
            r13.q(r5)
            r9 = 4
            int r11 = r13.i(r9)
            int r5 = r0.n
            if (r11 == r5) goto L_0x0207
            goto L_0x0294
        L_0x0207:
            r1.H(r15)
            goto L_0x020c
        L_0x020b:
            r9 = 4
        L_0x020c:
            byte[] r5 = r13.b
            int r11 = r23.c()
            if (r11 >= r9) goto L_0x0215
            goto L_0x026d
        L_0x0215:
            r1.g(r4, r5, r9)
            r5 = 14
            r13.q(r5)
            r5 = 13
            int r11 = r13.i(r5)
            r5 = 7
            if (r11 >= r5) goto L_0x0228
            goto L_0x0294
        L_0x0228:
            byte[] r5 = r1.a
            int r9 = r1.c
            int r11 = r19 + r11
            if (r11 < r9) goto L_0x0231
            goto L_0x026d
        L_0x0231:
            byte r4 = r5[r11]
            r20 = r2
            r2 = -1
            if (r4 != r2) goto L_0x0250
            int r11 = r11 + r6
            if (r11 != r9) goto L_0x023c
            goto L_0x026e
        L_0x023c:
            byte r4 = r5[r11]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r17 | r5
            r5 = r5 & r18
            r9 = 65520(0xfff0, float:9.1813E-41)
            if (r5 != r9) goto L_0x0297
            r4 = r4 & 8
            r5 = 3
            int r4 = r4 >> r5
            if (r4 != r3) goto L_0x0297
            goto L_0x026e
        L_0x0250:
            r3 = 73
            if (r4 == r3) goto L_0x0255
            goto L_0x0297
        L_0x0255:
            int r3 = r11 + 1
            if (r3 != r9) goto L_0x025a
            goto L_0x026e
        L_0x025a:
            byte r3 = r5[r3]
            r4 = 68
            if (r3 == r4) goto L_0x0261
            goto L_0x0297
        L_0x0261:
            r3 = 2
            int r11 = r11 + r3
            if (r11 != r9) goto L_0x0266
            goto L_0x026e
        L_0x0266:
            byte r3 = r5[r11]
            r4 = 51
            if (r3 != r4) goto L_0x0297
            goto L_0x026e
        L_0x026d:
            r2 = -1
        L_0x026e:
            r3 = r8 & 8
            r4 = 3
            int r3 = r3 >> r4
            r0.o = r3
            r3 = r8 & 1
            if (r3 != 0) goto L_0x027a
            r3 = r6
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            r0.k = r3
            boolean r3 = r0.l
            if (r3 != 0) goto L_0x0287
            r0.h = r6
            r3 = 0
            r0.i = r3
            goto L_0x028d
        L_0x0287:
            r3 = 0
            r4 = 3
            r0.h = r4
            r0.i = r3
        L_0x028d:
            r1.H(r15)
            r3 = 2
            r8 = 0
            goto L_0x02fc
        L_0x0294:
            r20 = r2
            r2 = -1
        L_0x0297:
            int r3 = r0.j
            r4 = r3 | r10
            r5 = 329(0x149, float:4.61E-43)
            if (r4 == r5) goto L_0x02dd
            r5 = 511(0x1ff, float:7.16E-43)
            if (r4 == r5) goto L_0x02d3
            r5 = 836(0x344, float:1.171E-42)
            if (r4 == r5) goto L_0x02c9
            r5 = 1075(0x433, float:1.506E-42)
            if (r4 == r5) goto L_0x02b9
            r4 = 256(0x100, float:3.59E-43)
            if (r3 == r4) goto L_0x02b5
            r0.j = r4
            r3 = 2
            r5 = 3
            r8 = 0
            goto L_0x02e7
        L_0x02b5:
            r3 = 2
            r5 = 3
            r8 = 0
            goto L_0x02e6
        L_0x02b9:
            r3 = 2
            r0.h = r3
            r5 = 3
            r0.i = r5
            r8 = 0
            r0.r = r8
            r12.H(r8)
            r1.H(r15)
            goto L_0x02fc
        L_0x02c9:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r8 = 0
            r7 = 1024(0x400, float:1.435E-42)
            r0.j = r7
            goto L_0x02e6
        L_0x02d3:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r7 = 512(0x200, float:7.175E-43)
            r8 = 0
            r0.j = r7
            goto L_0x02e6
        L_0x02dd:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r8 = 0
            r7 = 768(0x300, float:1.076E-42)
            r0.j = r7
        L_0x02e6:
            r7 = r15
        L_0x02e7:
            r10 = r5
            r2 = r20
            r9 = 4
            r11 = 13
            r5 = r3
            r3 = 7
            r21 = r8
            r8 = r4
            r4 = r21
            goto L_0x019e
        L_0x02f6:
            r8 = r4
            r3 = r5
            r2 = -1
            r1.H(r7)
        L_0x02fc:
            r5 = r3
            r4 = r8
            r3 = 7
            goto L_0x000f
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.h(g1g):void");
    }

    public final void i(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.s = j2;
        }
    }

    public final void j() {
    }

    public final void l(wf5 wf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.e = qtf.f;
        qtf.b();
        ypf B = wf5.B(qtf.e, 1);
        this.f = B;
        this.t = B;
        if (this.a) {
            qtf.a();
            qtf.b();
            ypf B2 = wf5.B(qtf.e, 5);
            this.g = B2;
            aa6 aa6 = new aa6();
            qtf.b();
            aa6.a = qtf.f;
            aa6.k = "application/id3";
            B2.d(new ca6(aa6));
            return;
        }
        this.g = new xx4();
    }
}
