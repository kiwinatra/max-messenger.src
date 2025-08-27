package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: iz  reason: default package */
public final class iz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final rl b;
    public final r62 c;
    public final jtb d;
    public final d18 e;

    public iz(rl rlVar, r62 r62, jtb jtb, d18 d18) {
        this.b = rlVar;
        this.c = r62;
        this.d = jtb;
        this.e = d18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r6 <= r2.c.g.getLong("app.update.to.version.with.live.location.date", 0)) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        if (r9 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (((defpackage.ltb) r5).a.m() > r2.j) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ha9 r13) {
        /*
            r12 = this;
            oa9 r0 = r13.X
            oa9 r1 = defpackage.oa9.SENDING
            if (r0 == r1) goto L_0x0120
            oa9 r1 = defpackage.oa9.ERROR
            if (r0 == r1) goto L_0x0120
            oa9 r1 = defpackage.oa9.UNKNOWN
            if (r0 != r1) goto L_0x0010
            goto L_0x0120
        L_0x0010:
            w28 r0 = r13.x0
            r1 = 0
            l20 r2 = r0.F(r1)
            r3 = 0
            jtb r5 = r12.d
            long r6 = r13.o
            if (r2 == 0) goto L_0x006e
            boolean r8 = r2.s
            if (r8 == 0) goto L_0x0024
            goto L_0x006e
        L_0x0024:
            u10 r2 = r2.m
            if (r2 != 0) goto L_0x0029
            goto L_0x006e
        L_0x0029:
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x002f
            goto L_0x00d1
        L_0x002f:
            r2 = r5
            ltb r2 = (defpackage.ltb) r2
            cud r8 = r2.b
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f55livelocationenabled
            r10 = 1
            boolean r8 = r8.m(r9, r10)
            if (r8 == 0) goto L_0x006e
            d18 r8 = r12.e
            j18 r8 = (defpackage.j18) r8
            boolean r8 = r8.g(r13)
            if (r8 != 0) goto L_0x006e
            cud r8 = r2.b
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f56livelocationreleasedate
            r10 = 1577626560000(0x16f51dee600, double:7.794510852627E-312)
            long r8 = r8.r(r9, r10)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x006e
            hq r2 = r2.c
            ls7 r2 = r2.g
            java.lang.String r8 = "app.update.to.version.with.live.location.date"
            long r8 = r2.getLong(r8, r3)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x006e
            goto L_0x00d1
        L_0x006e:
            l20 r2 = r0.F(r1)
            if (r2 == 0) goto L_0x00b0
            boolean r8 = r2.s
            if (r8 == 0) goto L_0x0079
            goto L_0x00b0
        L_0x0079:
            c20 r8 = r2.g
            if (r8 == 0) goto L_0x0085
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x0085
            l20 r2 = r8.g
        L_0x0085:
            boolean r8 = r2.s
            if (r8 == 0) goto L_0x008a
            goto L_0x00b0
        L_0x008a:
            k20 r2 = r2.d
            if (r2 != 0) goto L_0x008f
            goto L_0x00b0
        L_0x008f:
            zy r8 = r2.m
            boolean r9 = r2.f
            if (r8 != 0) goto L_0x0098
            if (r9 != 0) goto L_0x0098
            goto L_0x00d1
        L_0x0098:
            if (r9 == 0) goto L_0x00b0
            long r8 = r2.b
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x00b0
            r8 = r5
            ltb r8 = (defpackage.ltb) r8
            a33 r8 = r8.a
            long r8 = r8.m()
            long r10 = r2.j
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b0
            goto L_0x00d1
        L_0x00b0:
            l20 r0 = r0.F(r1)
            if (r0 == 0) goto L_0x0120
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x00bb
            goto L_0x0120
        L_0x00bb:
            boolean r0 = defpackage.ld8.Y(r0)
            if (r0 == 0) goto L_0x0120
            ltb r5 = (defpackage.ltb) r5
            hq r0 = r5.c
            ls7 r0 = r0.g
            java.lang.String r1 = "app.update.to.version.with.file.video.date"
            long r0 = r0.getLong(r1, r3)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0120
        L_0x00d1:
            java.util.concurrent.ConcurrentHashMap r0 = r12.a
            long r1 = r13.b
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r4 = java.lang.System.currentTimeMillis()
            if (r3 == 0) goto L_0x00f1
            long r6 = r3.longValue()
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0120
        L_0x00f1:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            long r0 = r13.z
            r62 r2 = r12.c
            a32 r0 = r2.G(r0)
            if (r0 != 0) goto L_0x010b
            goto L_0x0120
        L_0x010b:
            m72 r0 = r0.b
            long r0 = r0.a
            long r2 = r13.c
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.util.List r13 = java.util.Collections.singletonList(r13)
            rl r12 = r12.b
            jna r12 = (defpackage.jna) r12
            r12.K(r0, r13)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.a(ha9):void");
    }
}
