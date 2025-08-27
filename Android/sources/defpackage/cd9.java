package defpackage;

/* renamed from: cd9  reason: default package */
public final class cd9 {
    public final hs7 a;

    public cd9(hs7 hs7) {
        this.a = hs7;
    }

    public static boolean a(a32 a32, uj5 uj5, boolean z) {
        if (a32 == null || !a32.f0()) {
            return false;
        }
        return !a32.K() || a32.y() || (((vj5) uj5).p() && ((a32.z() && z) || a32.e0() || ld9.F(a32.f(a32.w), 1024) || z));
    }

    public static boolean c(a32 a32, ha9 ha9) {
        if (ha9.x()) {
            return false;
        }
        return (ha9.o() || !cvg.A(ha9.y) || (!ha9.r() && !ha9.t())) && a32 != null && a32.b.i() && ha9.c != 0 && ha9.K0 == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.a32 r12, defpackage.a89 r13) {
        /*
            r11 = this;
            ha9 r0 = r13.a
            boolean r1 = r0.x()
            r2 = 0
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.y()
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.F()
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.A()
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.w()
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.o()
            w28 r3 = r0.x0
            if (r1 == 0) goto L_0x0033
            g20 r1 = defpackage.g20.z
            l20 r1 = r3.I(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0145
        L_0x0033:
            boolean r1 = r0.q()
            if (r1 != 0) goto L_0x0145
            boolean r1 = r0.D()
            if (r1 == 0) goto L_0x0041
            goto L_0x0145
        L_0x0041:
            boolean r1 = r0.o()
            r4 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r3.b
            java.util.List r1 = (java.util.List) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x005b
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x005b
            r5 = r2
            goto L_0x0080
        L_0x005b:
            java.util.Iterator r1 = r1.iterator()
            r5 = r2
        L_0x0060:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0080
            java.lang.Object r6 = r1.next()
            l20 r6 = (defpackage.l20) r6     // Catch:{ all -> 0x0079 }
            g20 r6 = r6.a     // Catch:{ all -> 0x0079 }
            g20 r7 = defpackage.g20.c     // Catch:{ all -> 0x0079 }
            if (r6 == r7) goto L_0x0076
            g20 r7 = defpackage.g20.o     // Catch:{ all -> 0x0079 }
            if (r6 != r7) goto L_0x0060
        L_0x0076:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0079:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x0080:
            int r1 = r3.G()
            if (r5 != r1) goto L_0x0088
            r1 = r4
            goto L_0x0089
        L_0x0088:
            r1 = r2
        L_0x0089:
            java.lang.String r3 = r0.y
            boolean r3 = defpackage.cvg.A(r3)
            if (r3 == 0) goto L_0x0094
            if (r1 != 0) goto L_0x0094
            return r2
        L_0x0094:
            boolean r1 = r12.K()
            hs7 r11 = r11.a
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r0 = r11.get()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            vj5 r0 = r0.e
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r12.z()
            if (r0 == 0) goto L_0x00ba
            vk3 r13 = r13.b
            boolean r13 = r13.w
            if (r13 == 0) goto L_0x00ba
            r13 = r4
            goto L_0x00bb
        L_0x00ba:
            r13 = r2
        L_0x00bb:
            java.lang.Object r11 = r11.get()
            jtb r11 = (defpackage.jtb) r11
            ltb r11 = (defpackage.ltb) r11
            vj5 r11 = r11.e
            boolean r11 = r11.p()
            if (r11 == 0) goto L_0x00e1
            boolean r11 = r12.e0()
            if (r11 != 0) goto L_0x00df
            long r0 = r12.w
            int r11 = r12.f(r0)
            r0 = 512(0x200, float:7.175E-43)
            boolean r11 = defpackage.ld9.F(r11, r0)
            if (r11 == 0) goto L_0x00e1
        L_0x00df:
            r11 = r4
            goto L_0x00e2
        L_0x00e1:
            r11 = r2
        L_0x00e2:
            boolean r12 = r12.y()
            if (r12 != 0) goto L_0x00ec
            if (r13 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ed
        L_0x00ec:
            r2 = r4
        L_0x00ed:
            return r2
        L_0x00ee:
            boolean r13 = r0.p()
            if (r13 == 0) goto L_0x00f5
            return r4
        L_0x00f5:
            long r5 = r0.c
            r7 = 0
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x0126
            java.lang.Object r13 = r11.get()
            jtb r13 = (defpackage.jtb) r13
            ltb r13 = (defpackage.ltb) r13
            a33 r1 = r13.a
            long r5 = r1.m()
            long r9 = r0.o
            long r5 = r5 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            cud r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f34edittimeout
            r3 = 86400(0x15180, float:1.21072E-40)
            long r9 = (long) r3
            long r9 = r13.r(r1, r9)
            int r13 = (int) r9
            long r9 = (long) r13
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0145
        L_0x0126:
            java.lang.Object r11 = r11.get()
            jtb r11 = (defpackage.jtb) r11
            ltb r11 = (defpackage.ltb) r11
            a33 r11 = r11.a
            long r5 = r11.s()
            long r0 = r0.w
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0144
            boolean r11 = r12.H()
            if (r11 == 0) goto L_0x0145
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0145
        L_0x0144:
            r2 = r4
        L_0x0145:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd9.b(a32, a89):boolean");
    }

    public final boolean d(a32 a32, a89 a89) {
        if (a32.V(((ltb) ((jtb) this.a.get())).e) && a32.b.i()) {
            ha9 ha9 = a89.a;
            return ha9.c != 0 && ha9.K0 == 0;
        }
    }
}
