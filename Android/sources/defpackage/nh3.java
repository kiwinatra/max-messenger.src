package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: nh3  reason: default package */
public final class nh3 {
    public static final gga e = new gga(9);
    public static final /* synthetic */ KProperty[] f;
    public static final String g;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;

    static {
        Class<nh3> cls = nh3.class;
        f = new KProperty[]{wj6.p(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0), wj6.p(cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0), wj6.p(cls, "connectionInfo", "getConnectionInfo()Lru/ok/tamtam/ConnectionInfo;", 0), wj6.p(cls, "sessionStateInfo", "getSessionStateInfo()Lru/ok/tamtam/session/SessionStateInfo;", 0)};
        g = cls.getName();
    }

    public nh3(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
    }

    public final rh3 a() {
        KProperty kProperty = f[2];
        return (rh3) this.c.get();
    }

    public final fn4 b() {
        KProperty kProperty = f[1];
        return (fn4) this.b.get();
    }

    public final jtb c() {
        KProperty kProperty = f[0];
        return (jtb) this.a.get();
    }

    public final boolean d() {
        boolean z = !a().a() && (!f() || !b().d() || !b().c()) && e();
        z68.c(g, "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", Boolean.valueOf(z), Boolean.valueOf(f()), Boolean.valueOf(b().d()), Boolean.valueOf(b().c()), Boolean.valueOf(e()));
        return z;
    }

    public final boolean e() {
        return (a().b() == mi3.b || a().b() == mi3.a) ? false : true;
    }

    public final boolean f() {
        KProperty kProperty = f[3];
        return ((jxd) ((hxd) this.d.get())).h == 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r16 = this;
            fn4 r0 = r16.b()
            boolean r0 = r0.d()
            fn4 r1 = r16.b()
            boolean r1 = r1.c()
            fn4 r2 = r16.b()
            hn4 r2 = (defpackage.hn4) r2
            cxe r2 = r2.g
            xt6 r2 = (defpackage.xt6) r2
            boolean r2 = r2.a()
            r3 = 1
            r2 = r2 ^ r3
            rh3 r4 = r16.a()
            mi3 r4 = r4.b()
            java.lang.String r5 = "app.forceConnection"
            r6 = 2
            r7 = 0
            if (r0 != 0) goto L_0x006d
            if (r1 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x006d
            jtb r8 = r16.c()
            ltb r8 = (defpackage.ltb) r8
            a33 r8 = r8.a
            r8.getClass()
            ls7 r8 = r8.g
            boolean r8 = r8.getBoolean(r5, r7)
            if (r8 == 0) goto L_0x0046
            goto L_0x006d
        L_0x0046:
            rh3 r8 = r16.a()
            boolean r8 = r8.e()
            jtb r9 = r16.c()
            ltb r9 = (defpackage.ltb) r9
            cud r9 = r9.b
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f54keepconnection
            long r11 = (long) r6
            long r9 = r9.r(r10, r11)
            int r9 = (int) r9
            if (r9 == 0) goto L_0x006e
            if (r9 == r3) goto L_0x0067
        L_0x0065:
            r8 = r7
            goto L_0x006e
        L_0x0067:
            mi3 r9 = defpackage.mi3.b
            if (r4 != r9) goto L_0x0065
            if (r8 == 0) goto L_0x0065
        L_0x006d:
            r8 = r3
        L_0x006e:
            java.lang.String r9 = g
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x0077
        L_0x0074:
            r15 = r8
            goto L_0x0101
        L_0x0077:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0074
            w78 r11 = defpackage.w78.o
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "shouldConnect: "
            r12.<init>(r13)
            r12.append(r8)
            java.lang.String r13 = ", connectionType: "
            r12.append(r13)
            java.lang.String r4 = defpackage.iq.C(r4)
            r12.append(r4)
            java.lang.String r4 = ", keep alive: "
            r12.append(r4)
            gga r4 = e
            jtb r13 = r16.c()
            ltb r13 = (defpackage.ltb) r13
            cud r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f54keepconnection
            r15 = r8
            long r7 = (long) r6
            long r7 = r13.r(r14, r7)
            int r7 = (int) r7
            r4.getClass()
            if (r7 == 0) goto L_0x00c2
            if (r7 == r3) goto L_0x00bf
            if (r7 == r6) goto L_0x00bc
            java.lang.String r3 = "unknown"
            goto L_0x00c4
        L_0x00bc:
            java.lang.String r3 = "never"
            goto L_0x00c4
        L_0x00bf:
            java.lang.String r3 = "wifi"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r3 = "always"
        L_0x00c4:
            r12.append(r3)
            java.lang.String r3 = ", appVisible: "
            r12.append(r3)
            r12.append(r0)
            java.lang.String r0 = ", hasForegroundServicesAlive: "
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = ", noServices: "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = ", force connection: "
            r12.append(r0)
            jtb r0 = r16.c()
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            r0.getClass()
            ls7 r0 = r0.g
            r1 = 0
            boolean r0 = r0.getBoolean(r5, r1)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r1 = 0
            r10.d(r11, r9, r0, r1)
        L_0x0101:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh3.g():boolean");
    }
}
