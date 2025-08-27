package defpackage;

/* renamed from: avd  reason: default package */
public final class avd extends ivd {
    public final String A0;
    public final String B0;
    public final long C0;
    public final String x0;
    public final long y0;
    public final int z0;

    public avd(zud zud) {
        super(zud);
        this.x0 = zud.l;
        this.y0 = zud.m;
        this.z0 = zud.n;
        this.A0 = zud.o;
        this.B0 = zud.p;
        this.C0 = zud.q;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r1v1, types: [j10, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        if (defpackage.cvg.A(r7) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e2, code lost:
        if (defpackage.cvg.A(r7) == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        if (defpackage.cvg.A(r7) == false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ga9 A() {
        /*
            r13 = this;
            m20 r0 = new m20
            r0.<init>()
            m10 r1 = new m10
            r1.<init>()
            long r2 = r13.y0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0014
            r7 = r2
            goto L_0x0015
        L_0x0014:
            r7 = r4
        L_0x0015:
            r1.b = r7
            java.lang.String r7 = r13.x0
            boolean r8 = defpackage.cvg.A(r7)
            r9 = 0
            if (r8 != 0) goto L_0x0022
            goto L_0x010d
        L_0x0022:
            if (r6 <= 0) goto L_0x00ce
            ou8 r6 = r13.n()
            hud r7 = r13.a
            if (r7 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r7 = r9
        L_0x002e:
            kotlin.Lazy r7 = r7.n
            java.lang.Object r7 = r7.getValue()
            km3 r7 = (defpackage.km3) r7
            hud r8 = r13.a
            if (r8 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r8 = r9
        L_0x003c:
            kotlin.Lazy r8 = r8.h0
            java.lang.Object r8 = r8.getValue()
            c7d r8 = (defpackage.c7d) r8
            wj0 r6 = (defpackage.wj0) r6
            d19 r6 = r6.e
            r6.getClass()
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r11 = "getVcfByContactId: contactId %d"
            java.lang.String r12 = "d19"
            defpackage.z68.c(r12, r11, r10)
            java.lang.Object r10 = r6.b     // Catch:{ Exception -> 0x0075 }
            epa r10 = (defpackage.epa) r10     // Catch:{ Exception -> 0x0075 }
            kotlin.Lazy r10 = r10.a     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ Exception -> 0x0075 }
            edb r10 = (defpackage.edb) r10     // Catch:{ Exception -> 0x0075 }
            java.lang.String[] r11 = defpackage.edb.f     // Catch:{ Exception -> 0x0075 }
            boolean r10 = r10.b(r11)     // Catch:{ Exception -> 0x0075 }
            if (r10 != 0) goto L_0x0077
            java.lang.String r6 = "getVcfByContactId: no permissions for contacts"
            defpackage.z68.f(r12, r6, r9)     // Catch:{ Exception -> 0x0075 }
        L_0x0073:
            r7 = r9
            goto L_0x00c7
        L_0x0075:
            r6 = move-exception
            goto L_0x00b3
        L_0x0077:
            if (r7 != 0) goto L_0x007e
            java.lang.String r10 = "Contact controller is null"
            defpackage.z68.f(r12, r10, r9)     // Catch:{ Exception -> 0x0075 }
        L_0x007e:
            r10 = 0
            vk3 r7 = r7.p(r2, r10)     // Catch:{ Exception -> 0x0075 }
            if (r7 != 0) goto L_0x0093
            java.lang.String r6 = "getVcfByContactId: no contact found for id %d"
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch:{ Exception -> 0x0075 }
            defpackage.z68.g(r12, r6, r7)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0073
        L_0x0093:
            long r10 = r7.s()     // Catch:{ Exception -> 0x0075 }
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x00a9
            java.lang.String r6 = "getVcfByContactId: no server phone for contact id %d"
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch:{ Exception -> 0x0075 }
            defpackage.z68.g(r12, r6, r7)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0073
        L_0x00a9:
            long r10 = r7.s()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r6.z(r10, r8)     // Catch:{ Exception -> 0x0075 }
            r7 = r2
            goto L_0x00c7
        L_0x00b3:
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getVcfByContactId: exception for contactId "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            defpackage.z68.f(r12, r2, r6)
            goto L_0x0073
        L_0x00c7:
            boolean r2 = defpackage.cvg.A(r7)
            if (r2 != 0) goto L_0x00ce
            goto L_0x010d
        L_0x00ce:
            int r2 = r13.z0
            if (r2 <= 0) goto L_0x00e5
            ou8 r3 = r13.n()
            wj0 r3 = (defpackage.wj0) r3
            d19 r3 = r3.e
            java.lang.String r7 = r3.y(r2)
            boolean r2 = defpackage.cvg.A(r7)
            if (r2 != 0) goto L_0x00e5
            goto L_0x010d
        L_0x00e5:
            long r2 = r13.C0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x010c
            ou8 r4 = r13.n()
            hud r5 = r13.a
            if (r5 == 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r5 = r9
        L_0x00f5:
            kotlin.Lazy r5 = r5.h0
            java.lang.Object r5 = r5.getValue()
            c7d r5 = (defpackage.c7d) r5
            wj0 r4 = (defpackage.wj0) r4
            d19 r4 = r4.e
            java.lang.String r7 = r4.z(r2, r5)
            boolean r2 = defpackage.cvg.A(r7)
            if (r2 != 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r7 = r9
        L_0x010d:
            r1.a = r7
            java.lang.String r2 = r13.B0
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 == 0) goto L_0x0118
            r2 = r9
        L_0x0118:
            r1.h = r2
            java.lang.String r13 = r13.A0
            boolean r2 = defpackage.cvg.A(r13)
            if (r2 == 0) goto L_0x0124
            r2 = r9
            goto L_0x0125
        L_0x0124:
            r2 = r13
        L_0x0125:
            r1.c = r2
            boolean r2 = defpackage.cvg.A(r13)
            if (r2 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r9 = r13
        L_0x012f:
            r1.d = r9
            n10 r13 = new n10
            r13.<init>(r1)
            j10 r1 = new j10
            r1.<init>()
            r1.s = r13
            g20 r13 = defpackage.g20.Y
            r1.a = r13
            l20 r13 = r1.a()
            java.util.List r13 = java.util.Collections.singletonList(r13)
            r0.a = r13
            w28 r13 = r0.c()
            ga9 r0 = new ga9
            r0.<init>()
            r0.n = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avd.A():ga9");
    }
}
