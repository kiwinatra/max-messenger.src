package defpackage;

/* renamed from: dfg  reason: default package */
public final class dfg implements sf5 {
    public wf5 a;
    public ypf b;
    public int c = 0;
    public long d = -1;
    public afg e;
    public int f = -1;
    public long g = -1;

    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        afg afg = this.e;
        if (afg != null) {
            afg.a(j2);
        }
    }

    public final void g(wf5 wf5) {
        this.a = wf5;
        this.b = wf5.B(0, 1);
        wf5.v();
    }

    public final boolean h(uf5 uf5) {
        return y64.h((gf4) uf5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r25, defpackage.yl4 r26) {
        /*
            r24 = this;
            r0 = r24
            ypf r1 = r0.b
            defpackage.y64.k(r1)
            int r1 = defpackage.t0g.a
            int r1 = r0.c
            r2 = 0
            r3 = -1
            r4 = 4
            r5 = 1
            if (r1 == 0) goto L_0x01ea
            r6 = 8
            r7 = 2
            r8 = -1
            if (r1 == r5) goto L_0x01b4
            r10 = 3
            if (r1 == r7) goto L_0x00b6
            if (r1 == r10) goto L_0x004a
            if (r1 != r4) goto L_0x0044
            long r6 = r0.g
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            defpackage.y64.j(r5)
            long r4 = r0.g
            r1 = r25
            gf4 r1 = (defpackage.gf4) r1
            long r6 = r1.o
            long r4 = r4 - r6
            afg r0 = r0.e
            r0.getClass()
            r1 = r25
            gf4 r1 = (defpackage.gf4) r1
            boolean r0 = r0.d(r1, r4)
            if (r0 == 0) goto L_0x0043
            r2 = r3
        L_0x0043:
            return r2
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x004a:
            r1 = r25
            gf4 r1 = (defpackage.gf4) r1
            r1.w = r2
            g1g r1 = new g1g
            r1.<init>((int) r6)
            r3 = r25
            gf4 r3 = (defpackage.gf4) r3
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            p01 r1 = defpackage.y64.G(r5, r3, r1)
            r3.z(r6)
            long r5 = r3.o
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            java.lang.Object r5 = r1.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r0.f = r5
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r10 = r0.d
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0095
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0095
            r5 = r10
        L_0x0095:
            int r1 = r0.f
            long r10 = (long) r1
            long r10 = r10 + r5
            r0.g = r10
            long r5 = r3.c
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00a7
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a7
            r0.g = r5
        L_0x00a7:
            afg r1 = r0.e
            r1.getClass()
            int r3 = r0.f
            long r5 = r0.g
            r1.b(r3, r5)
            r0.c = r4
            return r2
        L_0x00b6:
            g1g r1 = new g1g
            r3 = 16
            r1.<init>((int) r3)
            r6 = r25
            gf4 r6 = (defpackage.gf4) r6
            r7 = 1718449184(0x666d7420, float:2.8033575E23)
            p01 r7 = defpackage.y64.G(r7, r6, r1)
            long r7 = r7.c
            r11 = 16
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00d2
            r9 = r5
            goto L_0x00d3
        L_0x00d2:
            r9 = r2
        L_0x00d3:
            defpackage.y64.j(r9)
            byte[] r9 = r1.a
            r6.q(r9, r2, r3, r2)
            r1.H(r2)
            int r6 = r1.o()
            int r13 = r1.o()
            int r14 = r1.n()
            r1.n()
            int r15 = r1.o()
            int r1 = r1.o()
            int r7 = (int) r7
            int r7 = r7 - r3
            if (r7 <= 0) goto L_0x0105
            byte[] r3 = new byte[r7]
            r8 = r25
            gf4 r8 = (defpackage.gf4) r8
            r8.q(r3, r2, r7, r2)
        L_0x0102:
            r17 = r3
            goto L_0x0108
        L_0x0105:
            byte[] r3 = defpackage.t0g.f
            goto L_0x0102
        L_0x0108:
            r3 = r25
            gf4 r3 = (defpackage.gf4) r3
            long r7 = r3.r()
            long r11 = r3.o
            long r7 = r7 - r11
            int r7 = (int) r7
            r3.z(r7)
            ffg r3 = new ffg
            r11 = r3
            r12 = r6
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7 = 17
            if (r6 != r7) goto L_0x0131
            zeg r1 = new zeg
            wf5 r4 = r0.a
            ypf r5 = r0.b
            r1.<init>((defpackage.wf5) r4, (defpackage.ypf) r5, (defpackage.ffg) r3)
            r0.e = r1
            goto L_0x0199
        L_0x0131:
            r7 = 6
            if (r6 != r7) goto L_0x014c
            cfg r1 = new cfg
            wf5 r4 = r0.a
            ypf r5 = r0.b
            java.lang.String r22 = "audio/g711-alaw"
            r23 = -1
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.wf5) r19, (defpackage.ypf) r20, (defpackage.ffg) r21, (java.lang.String) r22, (int) r23)
            r0.e = r1
            goto L_0x0199
        L_0x014c:
            r7 = 7
            if (r6 != r7) goto L_0x0167
            cfg r1 = new cfg
            wf5 r4 = r0.a
            ypf r5 = r0.b
            java.lang.String r22 = "audio/g711-mlaw"
            r23 = -1
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.wf5) r19, (defpackage.ypf) r20, (defpackage.ffg) r21, (java.lang.String) r22, (int) r23)
            r0.e = r1
            goto L_0x0199
        L_0x0167:
            if (r6 == r5) goto L_0x017c
            if (r6 == r10) goto L_0x0173
            r4 = 65534(0xfffe, float:9.1833E-41)
            if (r6 == r4) goto L_0x017c
            r23 = r2
            goto L_0x0182
        L_0x0173:
            r5 = 32
            if (r1 != r5) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r4 = r2
        L_0x0179:
            r23 = r4
            goto L_0x0182
        L_0x017c:
            int r1 = defpackage.t0g.u(r1)
            r23 = r1
        L_0x0182:
            if (r23 == 0) goto L_0x019c
            cfg r1 = new cfg
            wf5 r4 = r0.a
            ypf r5 = r0.b
            java.lang.String r22 = "audio/raw"
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.wf5) r19, (defpackage.ypf) r20, (defpackage.ffg) r21, (java.lang.String) r22, (int) r23)
            r0.e = r1
        L_0x0199:
            r0.c = r10
            return r2
        L_0x019c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unsupported WAV format type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x01b4:
            g1g r1 = new g1g
            r1.<init>((int) r6)
            r3 = r25
            gf4 r3 = (defpackage.gf4) r3
            p01 r4 = defpackage.p01.b(r3, r1)
            int r5 = r4.b
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x01cb
            r3.w = r2
            goto L_0x01e5
        L_0x01cb:
            r3.a(r6, r2)
            r1.H(r2)
            byte[] r3 = r1.a
            r5 = r25
            gf4 r5 = (defpackage.gf4) r5
            r5.q(r3, r2, r6, r2)
            long r8 = r1.k()
            long r3 = r4.c
            int r1 = (int) r3
            int r1 = r1 + r6
            r5.z(r1)
        L_0x01e5:
            r0.d = r8
            r0.c = r7
            return r2
        L_0x01ea:
            r1 = r25
            gf4 r1 = (defpackage.gf4) r1
            long r6 = r1.o
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x01f8
            r1 = r5
            goto L_0x01f9
        L_0x01f8:
            r1 = r2
        L_0x01f9:
            defpackage.y64.j(r1)
            int r1 = r0.f
            if (r1 == r3) goto L_0x020a
            r3 = r25
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r1)
            r0.c = r4
            goto L_0x0221
        L_0x020a:
            r1 = r25
            gf4 r1 = (defpackage.gf4) r1
            boolean r3 = defpackage.y64.h(r1)
            if (r3 == 0) goto L_0x0222
            long r3 = r1.r()
            long r6 = r1.o
            long r3 = r3 - r6
            int r3 = (int) r3
            r1.z(r3)
            r0.c = r5
        L_0x0221:
            return r2
        L_0x0222:
            java.lang.String r0 = "Unsupported or unrecognized wav file type."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfg.i(uf5, yl4):int");
    }

    public final void release() {
    }
}
