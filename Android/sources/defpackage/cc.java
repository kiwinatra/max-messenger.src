package defpackage;

import java.util.Arrays;

/* renamed from: cc  reason: default package */
public final class cc implements w05 {
    public static final byte[] w = {73, 68, 51};
    public final boolean a;
    public final ky1 b = new ky1(new byte[7], (byte) 0, 7, 2);
    public final l8b c = new l8b(Arrays.copyOf(w, 10));
    public final String d;
    public final int e;
    public String f;
    public zpf g;
    public zpf h;
    public int i = 0;
    public int j = 0;
    public int k = 256;
    public boolean l;
    public boolean m;
    public int n = -1;
    public int o = -1;
    public int p;
    public boolean q;
    public long r = -9223372036854775807L;
    public int s;
    public long t = -9223372036854775807L;
    public zpf u;
    public long v;

    public cc(boolean z, String str, int i2) {
        this.a = z;
        this.d = str;
        this.e = i2;
    }

    public final void a() {
        this.t = -9223372036854775807L;
        this.m = false;
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [boolean, int, byte] */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0304  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = 7
            r4 = 0
            r5 = 2
            r6 = 1
            zpf r7 = r0.g
            r7.getClass()
            int r7 = defpackage.v0g.a
        L_0x000f:
            int r7 = r22.a()
            if (r7 <= 0) goto L_0x0328
            int r7 = r0.i
            r8 = 256(0x100, float:3.59E-43)
            r9 = 4
            r10 = 3
            r11 = 13
            l8b r12 = r0.c
            ky1 r13 = r0.b
            if (r7 == 0) goto L_0x01bf
            if (r7 == r6) goto L_0x0183
            r14 = 10
            if (r7 == r5) goto L_0x014b
            if (r7 == r10) goto L_0x0079
            if (r7 != r9) goto L_0x0073
            int r7 = r22.a()
            int r9 = r0.s
            int r10 = r0.j
            int r9 = r9 - r10
            int r7 = java.lang.Math.min(r7, r9)
            zpf r9 = r0.u
            r9.b(r1, r7, r4)
            int r9 = r0.j
            int r9 = r9 + r7
            r0.j = r9
            int r7 = r0.s
            if (r9 != r7) goto L_0x000f
            long r9 = r0.t
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0055
            r7 = r6
            goto L_0x0056
        L_0x0055:
            r7 = r4
        L_0x0056:
            defpackage.n79.n(r7)
            zpf r9 = r0.u
            long r10 = r0.t
            int r13 = r0.s
            r12 = 1
            r14 = 0
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
            long r9 = r0.t
            long r11 = r0.v
            long r9 = r9 + r11
            r0.t = r9
            r0.i = r4
            r0.j = r4
            r0.k = r8
            goto L_0x000f
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0079:
            boolean r7 = r0.l
            r8 = 5
            if (r7 == 0) goto L_0x0080
            r7 = r3
            goto L_0x0081
        L_0x0080:
            r7 = r8
        L_0x0081:
            byte[] r12 = r13.b
            int r15 = r22.a()
            int r2 = r0.j
            int r2 = r7 - r2
            int r2 = java.lang.Math.min(r15, r2)
            int r15 = r0.j
            r1.e(r15, r12, r2)
            int r12 = r0.j
            int r12 = r12 + r2
            r0.j = r12
            if (r12 != r7) goto L_0x000f
            r13.q(r4)
            boolean r2 = r0.q
            if (r2 != 0) goto L_0x0129
            int r2 = r13.i(r5)
            int r2 = r2 + r6
            if (r2 == r5) goto L_0x00c0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r12 = "Detected audio object type: "
            r7.<init>(r12)
            r7.append(r2)
            java.lang.String r2 = ", but assuming AAC LC."
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            defpackage.i8b.V(r2)
            r2 = r5
        L_0x00c0:
            r13.t(r8)
            int r7 = r13.i(r10)
            int r8 = r0.o
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
            r2.<init>((byte[]) r8, (byte) r4, (int) r5, (int) r5)
            e r2 = defpackage.iq.T(r2, r4)
            ba6 r7 = new ba6
            r7.<init>()
            java.lang.String r10 = r0.f
            r7.a = r10
            java.lang.String r10 = "audio/mp4a-latm"
            java.lang.String r10 = defpackage.vq9.l(r10)
            r7.m = r10
            java.lang.String r10 = r2.c
            r7.i = r10
            int r10 = r2.b
            r7.A = r10
            int r2 = r2.a
            r7.B = r2
            java.util.List r2 = java.util.Collections.singletonList(r8)
            r7.p = r2
            java.lang.String r2 = r0.d
            r7.d = r2
            int r2 = r0.e
            r7.f = r2
            ea6 r2 = new ea6
            r2.<init>(r7)
            int r7 = r2.C
            long r7 = (long) r7
            r14 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r14 = r14 / r7
            r0.r = r14
            zpf r7 = r0.g
            r7.e(r2)
            r0.q = r6
            goto L_0x012c
        L_0x0129:
            r13.t(r14)
        L_0x012c:
            r13.t(r9)
            int r2 = r13.i(r11)
            int r7 = r2 + -7
            boolean r8 = r0.l
            if (r8 == 0) goto L_0x013b
            int r7 = r2 + -9
        L_0x013b:
            zpf r2 = r0.g
            long r10 = r0.r
            r0.i = r9
            r0.j = r4
            r0.u = r2
            r0.v = r10
            r0.s = r7
            goto L_0x000f
        L_0x014b:
            byte[] r2 = r12.a
            int r7 = r22.a()
            int r8 = r0.j
            int r8 = 10 - r8
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0.j
            r1.e(r8, r2, r7)
            int r2 = r0.j
            int r2 = r2 + r7
            r0.j = r2
            if (r2 != r14) goto L_0x000f
            zpf r2 = r0.h
            r2.b(r12, r14, r4)
            r2 = 6
            r12.G(r2)
            zpf r2 = r0.h
            int r7 = r12.t()
            int r7 = r7 + r14
            r0.i = r9
            r0.j = r14
            r0.u = r2
            r8 = 0
            r0.v = r8
            r0.s = r7
            goto L_0x000f
        L_0x0183:
            int r2 = r22.a()
            if (r2 != 0) goto L_0x018b
            goto L_0x000f
        L_0x018b:
            byte[] r2 = r13.b
            byte[] r7 = r1.a
            int r11 = r1.b
            byte r7 = r7[r11]
            r2[r4] = r7
            r13.q(r5)
            int r2 = r13.i(r9)
            int r7 = r0.o
            r9 = -1
            if (r7 == r9) goto L_0x01ad
            if (r2 == r7) goto L_0x01ad
            r0.m = r4
            r0.i = r4
            r0.j = r4
            r0.k = r8
            goto L_0x000f
        L_0x01ad:
            boolean r7 = r0.m
            if (r7 != 0) goto L_0x01b9
            r0.m = r6
            int r7 = r0.p
            r0.n = r7
            r0.o = r2
        L_0x01b9:
            r0.i = r10
            r0.j = r4
            goto L_0x000f
        L_0x01bf:
            byte[] r2 = r1.a
            int r7 = r1.b
            int r14 = r1.c
        L_0x01c5:
            if (r7 >= r14) goto L_0x031d
            int r15 = r7 + 1
            byte r8 = r2[r7]
            r10 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r0.k
            r11 = 512(0x200, float:7.175E-43)
            if (r3 != r11) goto L_0x02bb
            byte r3 = (byte) r10
            r3 = r3 & 255(0xff, float:3.57E-43)
            r16 = 65280(0xff00, float:9.1477E-41)
            r3 = r16 | r3
            r17 = 65526(0xfff6, float:9.1821E-41)
            r3 = r3 & r17
            r11 = 65520(0xfff0, float:9.1813E-41)
            if (r3 != r11) goto L_0x02bb
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x0294
            r3 = -1
            int r18 = r7 + -1
            r1.G(r7)
            byte[] r3 = r13.b
            int r11 = r22.a()
            if (r11 >= r6) goto L_0x01f9
            goto L_0x02bb
        L_0x01f9:
            r1.e(r4, r3, r6)
            r13.q(r9)
            int r3 = r13.i(r6)
            int r11 = r0.n
            r9 = -1
            if (r11 == r9) goto L_0x020f
            if (r3 == r11) goto L_0x020f
            r19 = r2
            r2 = r9
            goto L_0x02be
        L_0x020f:
            int r11 = r0.o
            if (r11 == r9) goto L_0x0232
            byte[] r9 = r13.b
            int r11 = r22.a()
            if (r11 >= r6) goto L_0x021d
            goto L_0x0294
        L_0x021d:
            r1.e(r4, r9, r6)
            r13.q(r5)
            r9 = 4
            int r11 = r13.i(r9)
            int r5 = r0.o
            if (r11 == r5) goto L_0x022e
            goto L_0x02bb
        L_0x022e:
            r1.G(r15)
            goto L_0x0233
        L_0x0232:
            r9 = 4
        L_0x0233:
            byte[] r5 = r13.b
            int r11 = r22.a()
            if (r11 >= r9) goto L_0x023c
            goto L_0x0294
        L_0x023c:
            r1.e(r4, r5, r9)
            r5 = 14
            r13.q(r5)
            r5 = 13
            int r11 = r13.i(r5)
            r5 = 7
            if (r11 >= r5) goto L_0x024f
            goto L_0x02bb
        L_0x024f:
            byte[] r5 = r1.a
            int r9 = r1.c
            int r11 = r18 + r11
            if (r11 < r9) goto L_0x0258
            goto L_0x0294
        L_0x0258:
            byte r4 = r5[r11]
            r19 = r2
            r2 = -1
            if (r4 != r2) goto L_0x0277
            int r11 = r11 + r6
            if (r11 != r9) goto L_0x0263
            goto L_0x0295
        L_0x0263:
            byte r4 = r5[r11]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r16 | r5
            r5 = r5 & r17
            r9 = 65520(0xfff0, float:9.1813E-41)
            if (r5 != r9) goto L_0x02be
            r4 = r4 & 8
            r5 = 3
            int r4 = r4 >> r5
            if (r4 != r3) goto L_0x02be
            goto L_0x0295
        L_0x0277:
            r3 = 73
            if (r4 == r3) goto L_0x027c
            goto L_0x02be
        L_0x027c:
            int r3 = r11 + 1
            if (r3 != r9) goto L_0x0281
            goto L_0x0295
        L_0x0281:
            byte r3 = r5[r3]
            r4 = 68
            if (r3 == r4) goto L_0x0288
            goto L_0x02be
        L_0x0288:
            r3 = 2
            int r11 = r11 + r3
            if (r11 != r9) goto L_0x028d
            goto L_0x0295
        L_0x028d:
            byte r3 = r5[r11]
            r4 = 51
            if (r3 != r4) goto L_0x02be
            goto L_0x0295
        L_0x0294:
            r2 = -1
        L_0x0295:
            r3 = r8 & 8
            r4 = 3
            int r3 = r3 >> r4
            r0.p = r3
            r3 = r8 & 1
            if (r3 != 0) goto L_0x02a1
            r3 = r6
            goto L_0x02a2
        L_0x02a1:
            r3 = 0
        L_0x02a2:
            r0.l = r3
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x02ae
            r0.i = r6
            r3 = 0
            r0.j = r3
            goto L_0x02b4
        L_0x02ae:
            r3 = 0
            r4 = 3
            r0.i = r4
            r0.j = r3
        L_0x02b4:
            r1.G(r15)
            r3 = 2
            r8 = 0
            goto L_0x0323
        L_0x02bb:
            r19 = r2
            r2 = -1
        L_0x02be:
            int r3 = r0.k
            r4 = r3 | r10
            r5 = 329(0x149, float:4.61E-43)
            if (r4 == r5) goto L_0x0304
            r5 = 511(0x1ff, float:7.16E-43)
            if (r4 == r5) goto L_0x02fa
            r5 = 836(0x344, float:1.171E-42)
            if (r4 == r5) goto L_0x02f0
            r5 = 1075(0x433, float:1.506E-42)
            if (r4 == r5) goto L_0x02e0
            r4 = 256(0x100, float:3.59E-43)
            if (r3 == r4) goto L_0x02dc
            r0.k = r4
            r3 = 2
            r5 = 3
            r8 = 0
            goto L_0x030e
        L_0x02dc:
            r3 = 2
            r5 = 3
            r8 = 0
            goto L_0x030d
        L_0x02e0:
            r3 = 2
            r0.i = r3
            r5 = 3
            r0.j = r5
            r8 = 0
            r0.s = r8
            r12.G(r8)
            r1.G(r15)
            goto L_0x0323
        L_0x02f0:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r8 = 0
            r7 = 1024(0x400, float:1.435E-42)
            r0.k = r7
            goto L_0x030d
        L_0x02fa:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r7 = 512(0x200, float:7.175E-43)
            r8 = 0
            r0.k = r7
            goto L_0x030d
        L_0x0304:
            r3 = 2
            r4 = 256(0x100, float:3.59E-43)
            r5 = 3
            r8 = 0
            r7 = 768(0x300, float:1.076E-42)
            r0.k = r7
        L_0x030d:
            r7 = r15
        L_0x030e:
            r10 = r5
            r2 = r19
            r9 = 4
            r11 = 13
            r5 = r3
            r3 = 7
            r20 = r8
            r8 = r4
            r4 = r20
            goto L_0x01c5
        L_0x031d:
            r8 = r4
            r3 = r5
            r2 = -1
            r1.G(r7)
        L_0x0323:
            r5 = r3
            r4 = r8
            r3 = 7
            goto L_0x000f
        L_0x0328:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc.f(l8b):void");
    }

    public final void g(boolean z) {
    }

    public final void i(int i2, long j2) {
        this.t = j2;
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.f = qtf.f;
        qtf.b();
        zpf B = xf5.B(qtf.e, 1);
        this.g = B;
        this.u = B;
        if (this.a) {
            qtf.a();
            qtf.b();
            zpf B2 = xf5.B(qtf.e, 5);
            this.h = B2;
            ba6 ba6 = new ba6();
            qtf.b();
            ba6.a = qtf.f;
            ba6.m = vq9.l("application/id3");
            B2.e(new ea6(ba6));
            return;
        }
        this.h = new ip4();
    }
}
