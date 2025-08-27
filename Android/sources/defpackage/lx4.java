package defpackage;

/* renamed from: lx4  reason: default package */
public final class lx4 implements v05 {
    public final g1g a = new g1g(new byte[18]);
    public final String b;
    public String c;
    public ypf d;
    public int e = 0;
    public int f;
    public int g;
    public long h;
    public ca6 i;
    public int j;
    public long k = -9223372036854775807L;

    public lx4(String str) {
        this.b = str;
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0009 A[EDGE_INSN: B:96:0x0009->B:89:0x0009 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            ypf r2 = r0.d
            defpackage.y64.k(r2)
        L_0x0009:
            int r2 = r22.c()
            if (r2 <= 0) goto L_0x02d1
            int r2 = r0.e
            r3 = 2
            r4 = 1
            g1g r8 = r0.a
            r9 = 0
            if (r2 == 0) goto L_0x0280
            if (r2 == r4) goto L_0x005b
            if (r2 != r3) goto L_0x0055
            int r2 = r22.c()
            int r3 = r0.j
            int r4 = r0.f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ypf r3 = r0.d
            r3.c(r2, r1)
            int r3 = r0.f
            int r3 = r3 + r2
            r0.f = r3
            int r14 = r0.j
            if (r3 != r14) goto L_0x0009
            long r11 = r0.k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            ypf r10 = r0.d
            r16 = 0
            r13 = 1
            r15 = 0
            r10.b(r11, r13, r14, r15, r16)
            long r2 = r0.k
            long r4 = r0.h
            long r2 = r2 + r4
            r0.k = r2
        L_0x0052:
            r0.e = r9
            goto L_0x0009
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x005b:
            byte[] r2 = r8.a
            int r10 = r22.c()
            int r11 = r0.f
            r12 = 18
            int r11 = 18 - r11
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r0.f
            r1.g(r11, r2, r10)
            int r2 = r0.f
            int r2 = r2 + r10
            r0.f = r2
            if (r2 != r12) goto L_0x0009
            byte[] r2 = r8.a
            ca6 r10 = r0.i
            r11 = 14
            r12 = 31
            r6 = -2
            r13 = -1
            if (r10 != 0) goto L_0x01a6
            java.lang.String r10 = r0.c
            byte r7 = r2[r9]
            r14 = 127(0x7f, float:1.78E-43)
            if (r7 != r14) goto L_0x0097
            ky1 r7 = new ky1
            int r14 = r2.length
            r15 = 1
            r5 = 0
            r7.<init>((byte[]) r2, (byte) r5, (int) r14, (int) r15)
        L_0x0093:
            r3 = 60
            goto L_0x0148
        L_0x0097:
            int r5 = r2.length
            byte[] r5 = java.util.Arrays.copyOf(r2, r5)
            byte r7 = r5[r9]
            if (r7 == r6) goto L_0x00a2
            if (r7 != r13) goto L_0x00b4
        L_0x00a2:
            r7 = r9
        L_0x00a3:
            int r14 = r5.length
            int r14 = r14 - r4
            if (r7 >= r14) goto L_0x00b4
            byte r14 = r5[r7]
            int r15 = r7 + 1
            byte r17 = r5[r15]
            r5[r7] = r17
            r5[r15] = r14
            int r7 = r7 + 2
            goto L_0x00a3
        L_0x00b4:
            ky1 r7 = new ky1
            int r14 = r5.length
            r15 = 1
            r13 = 0
            r7.<init>((byte[]) r5, (byte) r13, (int) r14, (int) r15)
            byte r13 = r5[r9]
            if (r13 != r12) goto L_0x0142
            ky1 r13 = new ky1
            int r14 = r5.length
            r15 = 1
            r12 = 0
            r13.<init>((byte[]) r5, (byte) r12, (int) r14, (int) r15)
        L_0x00c8:
            int r12 = r13.b()
            r14 = 16
            if (r12 < r14) goto L_0x0142
            r13.t(r3)
            int r12 = r13.i(r11)
            r12 = r12 & 16383(0x3fff, float:2.2957E-41)
            int r14 = r7.d
            r15 = 8
            int r14 = 8 - r14
            int r14 = java.lang.Math.min(r14, r11)
            int r15 = r7.d
            int r18 = 8 - r15
            int r18 = r18 - r14
            r19 = 65280(0xff00, float:9.1477E-41)
            int r15 = r19 >> r15
            int r19 = r4 << r18
            int r19 = r19 + -1
            r15 = r15 | r19
            byte[] r6 = r7.b
            int r9 = r7.c
            byte r20 = r6[r9]
            r15 = r20 & r15
            byte r15 = (byte) r15
            r6[r9] = r15
            int r14 = 14 - r14
            int r20 = r12 >>> r14
            int r18 = r20 << r18
            r15 = r15 | r18
            byte r15 = (byte) r15
            r6[r9] = r15
            int r9 = r9 + r4
        L_0x010b:
            r6 = 8
            if (r14 <= r6) goto L_0x011f
            byte[] r6 = r7.b
            int r15 = r9 + 1
            int r18 = r14 + -8
            int r3 = r12 >>> r18
            byte r3 = (byte) r3
            r6[r9] = r3
            int r14 = r14 + -8
            r9 = r15
            r3 = 2
            goto L_0x010b
        L_0x011f:
            int r3 = 8 - r14
            byte[] r6 = r7.b
            byte r15 = r6[r9]
            int r18 = r4 << r3
            int r18 = r18 + -1
            r15 = r15 & r18
            byte r15 = (byte) r15
            r6[r9] = r15
            int r14 = r4 << r14
            int r14 = r14 - r4
            r12 = r12 & r14
            int r3 = r12 << r3
            r3 = r3 | r15
            byte r3 = (byte) r3
            r6[r9] = r3
            r7.t(r11)
            r7.a()
            r3 = 2
            r6 = -2
            r9 = 0
            goto L_0x00c8
        L_0x0142:
            int r3 = r5.length
            r7.o(r3, r5)
            goto L_0x0093
        L_0x0148:
            r7.t(r3)
            r3 = 6
            int r5 = r7.i(r3)
            int[] r3 = defpackage.f6e.d
            r3 = r3[r5]
            r5 = 4
            int r6 = r7.i(r5)
            int[] r5 = defpackage.f6e.e
            r5 = r5[r6]
            r6 = 5
            int r9 = r7.i(r6)
            r6 = 29
            if (r9 < r6) goto L_0x0169
            r6 = -1
            r9 = 2
            goto L_0x0171
        L_0x0169:
            int[] r6 = defpackage.f6e.f
            r6 = r6[r9]
            int r6 = r6 * 1000
            r9 = 2
            int r6 = r6 / r9
        L_0x0171:
            r12 = 10
            r7.t(r12)
            int r7 = r7.i(r9)
            if (r7 <= 0) goto L_0x017e
            r7 = r4
            goto L_0x017f
        L_0x017e:
            r7 = 0
        L_0x017f:
            int r3 = r3 + r7
            aa6 r7 = new aa6
            r7.<init>()
            r7.a = r10
            java.lang.String r9 = "audio/vnd.dts"
            r7.k = r9
            r7.f = r6
            r7.x = r3
            r7.y = r5
            r3 = 0
            r7.n = r3
            java.lang.String r3 = r0.b
            r7.c = r3
            ca6 r3 = new ca6
            r3.<init>(r7)
            r0.i = r3
            ypf r5 = r0.d
            r5.d(r3)
            r3 = 0
            goto L_0x01a7
        L_0x01a6:
            r3 = r9
        L_0x01a7:
            byte r5 = r2[r3]
            r3 = 7
            r6 = -2
            if (r5 == r6) goto L_0x01ff
            r6 = -1
            if (r5 == r6) goto L_0x01e7
            r6 = 31
            if (r5 == r6) goto L_0x01cc
            r6 = 5
            byte r7 = r2[r6]
            r6 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r9 = r2[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 4
            int r9 = r9 << r10
            r6 = r6 | r9
            byte r9 = r2[r3]
            r9 = r9 & 240(0xf0, float:3.36E-43)
            int r9 = r9 >> r10
            r6 = r6 | r9
        L_0x01c9:
            int r6 = r6 + r4
            r7 = 0
            goto L_0x0214
        L_0x01cc:
            r7 = 6
            r10 = 4
            byte r6 = r2[r7]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r10
            r6 = r6 | r7
            r7 = 8
            byte r7 = r2[r7]
            r9 = 60
            r7 = r7 & r9
            r9 = 2
            int r7 = r7 >> r9
        L_0x01e3:
            r6 = r6 | r7
            int r6 = r6 + r4
            r7 = r4
            goto L_0x0214
        L_0x01e7:
            byte r6 = r2[r3]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r9 = r2[r7]
            r7 = r9 & 255(0xff, float:3.57E-43)
            r9 = 4
            int r7 = r7 << r9
            r6 = r6 | r7
            r7 = 9
            byte r7 = r2[r7]
            r10 = 60
            r7 = r7 & r10
            r10 = 2
            int r7 = r7 >> r10
            goto L_0x01e3
        L_0x01ff:
            r9 = 4
            byte r6 = r2[r9]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r6 = r6 | r7
            r7 = 6
            byte r10 = r2[r7]
            r7 = r10 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r9
            r6 = r6 | r7
            goto L_0x01c9
        L_0x0214:
            if (r7 == 0) goto L_0x0219
            int r6 = r6 * 16
            int r6 = r6 / r11
        L_0x0219:
            r0.j = r6
            r6 = -2
            if (r5 == r6) goto L_0x0251
            r6 = -1
            if (r5 == r6) goto L_0x0242
            r6 = 31
            if (r5 == r6) goto L_0x0234
            r5 = 4
            byte r3 = r2[r5]
            r3 = r3 & r4
            r6 = 6
            int r3 = r3 << r6
            r7 = 5
            byte r2 = r2[r7]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            r9 = 2
        L_0x0231:
            int r2 = r2 >> r9
            r2 = r2 | r3
            goto L_0x025e
        L_0x0234:
            r5 = 4
            r6 = 6
            r7 = 5
            r9 = 2
            byte r7 = r2[r7]
            r3 = r3 & r7
            int r3 = r3 << r5
            byte r2 = r2[r6]
            r6 = 60
            r2 = r2 & r6
            goto L_0x0231
        L_0x0242:
            r5 = 4
            r6 = 60
            r9 = 2
            byte r7 = r2[r5]
            r7 = r7 & r3
            int r5 = r7 << 4
            byte r2 = r2[r3]
            r2 = r2 & r6
            int r2 = r2 >> r9
            r2 = r2 | r5
            goto L_0x025e
        L_0x0251:
            r3 = 5
            r5 = 4
            r9 = 2
            byte r3 = r2[r3]
            r3 = r3 & r4
            r6 = 6
            int r3 = r3 << r6
            byte r2 = r2[r5]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            goto L_0x0231
        L_0x025e:
            int r2 = r2 + r4
            int r2 = r2 * 32
            long r2 = (long) r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            ca6 r4 = r0.i
            int r4 = r4.I0
            long r4 = (long) r4
            long r2 = r2 / r4
            int r2 = (int) r2
            long r2 = (long) r2
            r0.h = r2
            r2 = 0
            r8.H(r2)
            ypf r2 = r0.d
            r3 = 18
            r2.c(r3, r8)
            r2 = 2
            r0.e = r2
            goto L_0x0009
        L_0x0280:
            int r2 = r22.c()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.g
            r3 = 8
            int r2 = r2 << r3
            r0.g = r2
            int r5 = r22.v()
            r2 = r2 | r5
            r0.g = r2
            r5 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r5) goto L_0x02a8
            r5 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r5) goto L_0x02a8
            r5 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r5) goto L_0x02a8
            r5 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r5) goto L_0x0280
        L_0x02a8:
            byte[] r3 = r8.a
            int r5 = r2 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 0
            r3[r6] = r5
            int r5 = r2 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r5 = r2 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 2
            r3[r6] = r5
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5 = 3
            r3[r5] = r2
            r2 = 4
            r0.f = r2
            r2 = 0
            r0.g = r2
            r0.e = r4
            goto L_0x0009
        L_0x02d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.h(g1g):void");
    }

    public final void i(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.k = j2;
        }
    }

    public final void j() {
    }

    public final void l(wf5 wf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.c = qtf.f;
        qtf.b();
        this.d = wf5.B(qtf.e, 1);
    }
}
