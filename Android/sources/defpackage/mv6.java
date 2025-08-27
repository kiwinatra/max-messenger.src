package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: mv6  reason: default package */
public final class mv6 implements v05 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public ypf b;
    public final fj c;
    public final g1g d;
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

    public mv6(fj fjVar) {
        this.c = fjVar;
        lv6 lv6 = new lv6(0);
        lv6.e = new byte[Uuid.SIZE_BITS];
        this.g = lv6;
        if (fjVar != null) {
            this.e = new v4a(178, 0);
            this.d = new g1g(3, false);
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public final void a() {
        vzg.p(this.f);
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

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 4
            r5 = 3
            ypf r6 = r0.b
            defpackage.y64.k(r6)
            int r6 = r1.b
            int r7 = r1.c
            byte[] r8 = r1.a
            long r9 = r0.h
            int r11 = r27.c()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.h = r9
            ypf r9 = r0.b
            int r10 = r27.c()
            r9.c(r10, r1)
        L_0x0024:
            boolean[] r9 = r0.f
            int r9 = defpackage.vzg.t(r8, r6, r7, r9)
            lv6 r10 = r0.g
            v4a r11 = r0.e
            if (r9 != r7) goto L_0x003d
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0037
            r10.a(r6, r8, r7)
        L_0x0037:
            if (r11 == 0) goto L_0x003c
            r11.a(r6, r8, r7)
        L_0x003c:
            return
        L_0x003d:
            byte[] r12 = r1.a
            int r13 = r9 + 3
            byte r12 = r12[r13]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r9 - r6
            boolean r15 = r0.j
            r4 = 0
            if (r15 != 0) goto L_0x014e
            if (r14 <= 0) goto L_0x0051
            r10.a(r6, r8, r9)
        L_0x0051:
            if (r14 >= 0) goto L_0x0055
            int r15 = -r14
            goto L_0x0056
        L_0x0055:
            r15 = r4
        L_0x0056:
            boolean r5 = r10.b
            if (r5 == 0) goto L_0x013a
            int r5 = r10.c
            int r5 = r5 - r15
            r10.c = r5
            int r15 = r10.d
            if (r15 != 0) goto L_0x0070
            r15 = 181(0xb5, float:2.54E-43)
            if (r12 != r15) goto L_0x0070
            r10.d = r5
            r17 = r7
            r18 = r13
            r13 = r6
            goto L_0x0146
        L_0x0070:
            r10.b = r4
            java.lang.String r5 = r0.a
            r5.getClass()
            byte[] r15 = r10.e
            int r4 = r10.c
            byte[] r4 = java.util.Arrays.copyOf(r15, r4)
            byte r15 = r4[r3]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r2 = r4[r16]
            r3 = r2 & 255(0xff, float:3.57E-43)
            r17 = 6
            r18 = r13
            byte r13 = r4[r17]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r17 = r7
            r7 = 4
            int r15 = r15 << r7
            int r3 = r3 >> r7
            r3 = r3 | r15
            r2 = r2 & 15
            r15 = 8
            int r2 = r2 << r15
            r2 = r2 | r13
            r13 = 7
            byte r15 = r4[r13]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r7
            r13 = 2
            if (r15 == r13) goto L_0x00bc
            r13 = 3
            if (r15 == r13) goto L_0x00b6
            if (r15 == r7) goto L_0x00ae
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c5
        L_0x00ae:
            int r7 = r2 * 121
            float r7 = (float) r7
            int r13 = r3 * 100
        L_0x00b3:
            float r13 = (float) r13
            float r7 = r7 / r13
            goto L_0x00c5
        L_0x00b6:
            int r7 = r2 * 16
            float r7 = (float) r7
            int r13 = r3 * 9
            goto L_0x00b3
        L_0x00bc:
            int r13 = r2 * 4
            float r13 = (float) r13
            r15 = 3
            int r7 = r3 * 3
            float r7 = (float) r7
            float r7 = r13 / r7
        L_0x00c5:
            aa6 r13 = new aa6
            r13.<init>()
            r13.a = r5
            java.lang.String r5 = "video/mpeg2"
            r13.k = r5
            r13.p = r3
            r13.q = r2
            r13.t = r7
            java.util.List r2 = java.util.Collections.singletonList(r4)
            r13.m = r2
            ca6 r2 = new ca6
            r2.<init>(r13)
            r3 = 7
            byte r3 = r4[r3]
            r3 = r3 & 15
            r5 = 1
            int r3 = r3 - r5
            if (r3 < 0) goto L_0x0117
            r5 = 8
            if (r3 >= r5) goto L_0x0117
            double[] r5 = q
            r19 = r5[r3]
            int r3 = r10.d
            int r3 = r3 + 9
            byte r3 = r4[r3]
            r4 = r3 & 96
            int r4 = r4 >> 5
            r3 = r3 & 31
            if (r4 == r3) goto L_0x010d
            double r4 = (double) r4
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r21
            r7 = 1
            int r3 = r3 + r7
            r13 = r6
            double r6 = (double) r3
            double r4 = r4 / r6
            double r19 = r19 * r4
            goto L_0x010e
        L_0x010d:
            r13 = r6
        L_0x010e:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r19
            long r3 = (long) r3
            goto L_0x011a
        L_0x0117:
            r13 = r6
            r3 = 0
        L_0x011a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            ypf r3 = r0.b
            java.lang.Object r4 = r2.first
            ca6 r4 = (defpackage.ca6) r4
            r3.d(r4)
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.k = r2
            r2 = 1
            r0.j = r2
            r4 = 3
            goto L_0x0154
        L_0x013a:
            r17 = r7
            r18 = r13
            r2 = 1
            r3 = 179(0xb3, float:2.51E-43)
            r13 = r6
            if (r12 != r3) goto L_0x0146
            r10.b = r2
        L_0x0146:
            byte[] r2 = defpackage.lv6.f
            r3 = 0
            r4 = 3
            r10.a(r3, r2, r4)
            goto L_0x0154
        L_0x014e:
            r17 = r7
            r18 = r13
            r4 = 3
            r13 = r6
        L_0x0154:
            if (r11 == 0) goto L_0x018e
            if (r14 <= 0) goto L_0x015d
            r11.a(r13, r8, r9)
            r3 = 0
            goto L_0x015e
        L_0x015d:
            int r3 = -r14
        L_0x015e:
            boolean r2 = r11.b(r3)
            if (r2 == 0) goto L_0x017c
            byte[] r2 = r11.e
            int r3 = r11.f
            int r2 = defpackage.vzg.K(r3, r2)
            int r3 = defpackage.t0g.a
            byte[] r3 = r11.e
            g1g r5 = r0.d
            r5.F(r2, r3)
            long r2 = r0.n
            fj r6 = r0.c
            r6.l(r2, r5)
        L_0x017c:
            r2 = 178(0xb2, float:2.5E-43)
            if (r12 != r2) goto L_0x018e
            byte[] r2 = r1.a
            r3 = 2
            int r5 = r9 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0190
            r11.d(r12)
            goto L_0x0190
        L_0x018e:
            r3 = 2
            r5 = 1
        L_0x0190:
            if (r12 == 0) goto L_0x01a0
            r2 = 179(0xb3, float:2.51E-43)
            if (r12 != r2) goto L_0x0197
            goto L_0x01a0
        L_0x0197:
            r2 = 184(0xb8, float:2.58E-43)
            if (r12 != r2) goto L_0x019d
            r0.o = r5
        L_0x019d:
            r3 = r5
            goto L_0x0203
        L_0x01a0:
            int r7 = r17 - r9
            boolean r2 = r0.p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x01ce
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x01ce
            long r9 = r0.n
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01ce
            boolean r2 = r0.o
            long r13 = r0.h
            long r3 = r0.m
            long r13 = r13 - r3
            int r3 = (int) r13
            int r23 = r3 - r7
            ypf r3 = r0.b
            r25 = 0
            r19 = r3
            r20 = r9
            r22 = r2
            r24 = r7
            r19.b(r20, r22, r23, r24, r25)
        L_0x01ce:
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.p
            if (r2 == 0) goto L_0x01d7
            goto L_0x01da
        L_0x01d7:
            r2 = 0
            r3 = 1
            goto L_0x01fc
        L_0x01da:
            long r2 = r0.h
            long r9 = (long) r7
            long r2 = r2 - r9
            r0.m = r2
            long r2 = r0.l
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01e7
            goto L_0x01f2
        L_0x01e7:
            long r2 = r0.n
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01f1
            long r9 = r0.k
            long r2 = r2 + r9
            goto L_0x01f2
        L_0x01f1:
            r2 = r5
        L_0x01f2:
            r0.n = r2
            r2 = 0
            r0.o = r2
            r0.l = r5
            r3 = 1
            r0.i = r3
        L_0x01fc:
            if (r12 != 0) goto L_0x0200
            r4 = r3
            goto L_0x0201
        L_0x0200:
            r4 = r2
        L_0x0201:
            r0.p = r4
        L_0x0203:
            r7 = r17
            r6 = r18
            r3 = 4
            r5 = 3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.h(g1g):void");
    }

    public final void i(int i2, long j2) {
        this.l = j2;
    }

    public final void j() {
    }

    public final void l(wf5 wf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.a = qtf.f;
        qtf.b();
        this.b = wf5.B(qtf.e, 2);
        fj fjVar = this.c;
        if (fjVar != null) {
            fjVar.n(wf5, qtf);
        }
    }
}
