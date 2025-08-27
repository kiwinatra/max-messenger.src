package defpackage;

/* renamed from: yr7  reason: default package */
public final class yr7 implements v05 {
    public final String a;
    public final g1g b;
    public final ky1 c;
    public ypf d;
    public String e;
    public ca6 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k = -9223372036854775807L;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public yr7(String str) {
        this.a = str;
        g1g g1g = new g1g(1024);
        this.b = g1g;
        byte[] bArr = g1g.a;
        this.c = new ky1(bArr, (byte) 0, bArr.length, 1);
    }

    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018e, code lost:
        if (r0.l == false) goto L_0x0190;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r24) {
        /*
            r23 = this;
            r0 = r23
            ypf r1 = r0.d
            defpackage.y64.k(r1)
        L_0x0007:
            int r1 = r24.c()
            if (r1 <= 0) goto L_0x0258
            int r1 = r0.g
            r2 = 1
            r3 = 86
            if (r1 == 0) goto L_0x024c
            r4 = 2
            r5 = 0
            if (r1 == r2) goto L_0x0233
            r3 = 3
            r6 = 8
            g1g r7 = r0.b
            ky1 r8 = r0.c
            if (r1 == r4) goto L_0x020d
            if (r1 != r3) goto L_0x0207
            int r1 = r24.c()
            int r9 = r0.i
            int r10 = r0.h
            int r9 = r9 - r10
            int r1 = java.lang.Math.min(r1, r9)
            byte[] r9 = r8.b
            int r10 = r0.h
            r11 = r24
            r11.g(r10, r9, r1)
            int r9 = r0.h
            int r9 = r9 + r1
            r0.h = r9
            int r1 = r0.i
            if (r9 != r1) goto L_0x0007
            r8.q(r5)
            boolean r1 = r8.h()
            r9 = 0
            if (r1 != 0) goto L_0x018c
            r0.l = r2
            int r1 = r8.i(r2)
            if (r1 != r2) goto L_0x0059
            int r10 = r8.i(r2)
            goto L_0x005a
        L_0x0059:
            r10 = r5
        L_0x005a:
            r0.m = r10
            if (r10 != 0) goto L_0x0187
            if (r1 != r2) goto L_0x0069
            int r10 = r8.i(r4)
            int r10 = r10 + r2
            int r10 = r10 * r6
            r8.i(r10)
        L_0x0069:
            boolean r10 = r8.h()
            if (r10 == 0) goto L_0x0182
            r10 = 6
            int r12 = r8.i(r10)
            r0.n = r12
            r12 = 4
            int r13 = r8.i(r12)
            int r14 = r8.i(r3)
            if (r13 != 0) goto L_0x017d
            if (r14 != 0) goto L_0x017d
            if (r1 != 0) goto L_0x00ef
            int r13 = r8.g()
            int r14 = r8.b()
            e r15 = defpackage.q8.J(r8, r2)
            java.lang.String r5 = r15.c
            r0.u = r5
            int r5 = r15.a
            r0.r = r5
            int r5 = r15.b
            r0.t = r5
            int r5 = r8.b()
            int r14 = r14 - r5
            r8.q(r13)
            int r5 = r14 + 7
            int r5 = r5 / r6
            byte[] r5 = new byte[r5]
            r8.j(r14, r5)
            aa6 r13 = new aa6
            r13.<init>()
            java.lang.String r14 = r0.e
            r13.a = r14
            java.lang.String r14 = "audio/mp4a-latm"
            r13.k = r14
            java.lang.String r14 = r0.u
            r13.h = r14
            int r14 = r0.t
            r13.x = r14
            int r14 = r0.r
            r13.y = r14
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r13.m = r5
            java.lang.String r5 = r0.a
            r13.c = r5
            ca6 r5 = new ca6
            r5.<init>(r13)
            ca6 r13 = r0.f
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0118
            r0.f = r5
            int r13 = r5.I0
            long r13 = (long) r13
            r16 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r13 = r16 / r13
            r0.s = r13
            ypf r13 = r0.d
            r13.d(r5)
            goto L_0x0118
        L_0x00ef:
            int r5 = r8.i(r4)
            int r5 = r5 + r2
            int r5 = r5 * r6
            int r5 = r8.i(r5)
            long r13 = (long) r5
            int r5 = (int) r13
            int r13 = r8.b()
            e r14 = defpackage.q8.J(r8, r2)
            java.lang.String r15 = r14.c
            r0.u = r15
            int r15 = r14.a
            r0.r = r15
            int r14 = r14.b
            r0.t = r14
            int r14 = r8.b()
            int r13 = r13 - r14
            int r5 = r5 - r13
            r8.t(r5)
        L_0x0118:
            int r5 = r8.i(r3)
            r0.o = r5
            if (r5 == 0) goto L_0x0143
            if (r5 == r2) goto L_0x013d
            if (r5 == r3) goto L_0x0139
            if (r5 == r12) goto L_0x0139
            r3 = 5
            if (r5 == r3) goto L_0x0139
            if (r5 == r10) goto L_0x0135
            r3 = 7
            if (r5 != r3) goto L_0x012f
            goto L_0x0135
        L_0x012f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0135:
            r8.t(r2)
            goto L_0x0146
        L_0x0139:
            r8.t(r10)
            goto L_0x0146
        L_0x013d:
            r3 = 9
            r8.t(r3)
            goto L_0x0146
        L_0x0143:
            r8.t(r6)
        L_0x0146:
            boolean r3 = r8.h()
            r0.p = r3
            r12 = 0
            r0.q = r12
            if (r3 == 0) goto L_0x0173
            if (r1 != r2) goto L_0x0162
            int r1 = r8.i(r4)
            int r1 = r1 + r2
            int r1 = r1 * r6
            int r1 = r8.i(r1)
            long r1 = (long) r1
            r0.q = r1
            goto L_0x0173
        L_0x0162:
            boolean r1 = r8.h()
            long r2 = r0.q
            long r2 = r2 << r6
            int r4 = r8.i(r6)
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.q = r2
            if (r1 != 0) goto L_0x0162
        L_0x0173:
            boolean r1 = r8.h()
            if (r1 == 0) goto L_0x0192
            r8.t(r6)
            goto L_0x0192
        L_0x017d:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x0182:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x0187:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x018c:
            boolean r1 = r0.l
            if (r1 != 0) goto L_0x0192
        L_0x0190:
            r1 = 0
            goto L_0x01f4
        L_0x0192:
            int r1 = r0.m
            if (r1 != 0) goto L_0x0202
            int r1 = r0.n
            if (r1 != 0) goto L_0x01fd
            int r1 = r0.o
            if (r1 != 0) goto L_0x01f8
            r1 = 0
        L_0x019f:
            int r2 = r8.i(r6)
            int r1 = r1 + r2
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L_0x019f
            int r2 = r8.g()
            r3 = r2 & 7
            if (r3 != 0) goto L_0x01b6
            int r2 = r2 >> 3
            r7.H(r2)
            goto L_0x01c1
        L_0x01b6:
            byte[] r2 = r7.a
            int r3 = r1 * 8
            r8.j(r3, r2)
            r2 = 0
            r7.H(r2)
        L_0x01c1:
            ypf r2 = r0.d
            r2.c(r1, r7)
            long r2 = r0.k
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x01e9
            ypf r4 = r0.d
            r21 = 0
            r22 = 0
            r19 = 1
            r16 = r4
            r17 = r2
            r20 = r1
            r16.b(r17, r19, r20, r21, r22)
            long r1 = r0.k
            long r3 = r0.s
            long r1 = r1 + r3
            r0.k = r1
        L_0x01e9:
            boolean r1 = r0.p
            if (r1 == 0) goto L_0x0190
            long r1 = r0.q
            int r1 = (int) r1
            r8.t(r1)
            goto L_0x0190
        L_0x01f4:
            r0.g = r1
            goto L_0x0007
        L_0x01f8:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x01fd:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x0202:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r9, r9)
            throw r0
        L_0x0207:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x020d:
            r11 = r24
            int r1 = r0.j
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r2 = r24.v()
            r1 = r1 | r2
            r0.i = r1
            byte[] r2 = r7.a
            int r2 = r2.length
            if (r1 <= r2) goto L_0x022c
            r7.E(r1)
            byte[] r1 = r7.a
            r8.getClass()
            int r2 = r1.length
            r8.o(r2, r1)
        L_0x022c:
            r1 = 0
            r0.h = r1
            r0.g = r3
            goto L_0x0007
        L_0x0233:
            r11 = r24
            int r1 = r24.v()
            r2 = r1 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0245
            r0.j = r1
            r0.g = r4
            goto L_0x0007
        L_0x0245:
            if (r1 == r3) goto L_0x0007
            r1 = 0
            r0.g = r1
            goto L_0x0007
        L_0x024c:
            r11 = r24
            int r1 = r24.v()
            if (r1 != r3) goto L_0x0007
            r0.g = r2
            goto L_0x0007
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr7.h(g1g):void");
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
        this.d = wf5.B(qtf.e, 1);
        qtf.b();
        this.e = qtf.f;
    }
}
