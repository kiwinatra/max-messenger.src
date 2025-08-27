package defpackage;

import android.content.Context;

/* renamed from: n7h  reason: default package */
public final class n7h extends hvg {
    public final Context d;

    public n7h(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 6);
        this.d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: e5h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: e5h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: zne} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: nwg} */
    /* JADX WARNING: type inference failed for: r5v2, types: [swg, ct6] */
    /* JADX WARNING: type inference failed for: r2v0, types: [js9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5, types: [cd4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [cd4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K0(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            r7 = 1
            r8 = 0
            android.content.Context r0 = r5.d
            if (r6 == r7) goto L_0x0016
            r1 = 2
            if (r6 == r1) goto L_0x000a
            return r8
        L_0x000a:
            r5.L0()
            u6h r5 = defpackage.u6h.r(r0)
            r5.h()
            goto L_0x00ea
        L_0x0016:
            r5.L0()
            twe r5 = defpackage.twe.a(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r6 = r5.b()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.Z
            if (r6 == 0) goto L_0x0029
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r5.c()
        L_0x0029:
            swg r5 = new swg
            defpackage.vzg.m(r1)
            js9 r2 = new js9
            r2.<init>()
            ox0 r3 = defpackage.h80.a
            r5.<init>((android.content.Context) r0, (defpackage.ox0) r3, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1, (defpackage.js9) r2)
            r0 = 3
            mvg r1 = r5.y
            android.content.Context r2 = r5.a
            if (r6 == 0) goto L_0x00aa
            int r5 = r5.e()
            if (r5 != r0) goto L_0x0047
            r5 = r7
            goto L_0x0048
        L_0x0047:
            r5 = r8
        L_0x0048:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            cs r3 = defpackage.x4h.a
            int r4 = r3.b
            if (r4 > r0) goto L_0x0055
            java.lang.String r0 = "Revoking access"
            r3.p(r0, r6)
        L_0x0055:
            twe r6 = defpackage.twe.a(r2)
            java.lang.String r0 = "refreshToken"
            java.lang.String r6 = r6.e(r0)
            defpackage.x4h.a(r2)
            if (r5 == 0) goto L_0x008f
            if (r6 != 0) goto L_0x007f
            cs r5 = defpackage.l1h.c
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r6 = 4
            r0 = 0
            r5.<init>(r6, r0, r0, r0)
            r6 = r8 ^ 1
            java.lang.String r8 = "Status code must not be SUCCESS"
            defpackage.vzg.f(r8, r6)
            nwg r6 = new nwg
            r6.<init>(r5)
            r6.X(r5)
            goto L_0x0097
        L_0x007f:
            l1h r5 = new l1h
            r5.<init>(r6)
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r5)
            r6.start()
            zne r6 = r5.b
            goto L_0x0097
        L_0x008f:
            e5h r6 = new e5h
            r6.<init>(r1, r7)
            r1.a(r6)
        L_0x0097:
            cd4 r5 = new cd4
            r5.<init>()
            qdf r8 = new qdf
            r8.<init>()
            vwg r0 = new vwg
            r0.<init>(r6, r8, r5)
            r6.T(r0)
            goto L_0x00ea
        L_0x00aa:
            int r5 = r5.e()
            if (r5 != r0) goto L_0x00b2
            r5 = r7
            goto L_0x00b3
        L_0x00b2:
            r5 = r8
        L_0x00b3:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            cs r3 = defpackage.x4h.a
            int r4 = r3.b
            if (r4 > r0) goto L_0x00c0
            java.lang.String r0 = "Signing out"
            r3.p(r0, r6)
        L_0x00c0:
            defpackage.x4h.a(r2)
            if (r5 == 0) goto L_0x00d0
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.v
            zne r6 = new zne
            r6.<init>(r1)
            r6.X(r5)
            goto L_0x00d8
        L_0x00d0:
            e5h r6 = new e5h
            r6.<init>(r1, r8)
            r1.a(r6)
        L_0x00d8:
            cd4 r5 = new cd4
            r5.<init>()
            qdf r8 = new qdf
            r8.<init>()
            vwg r0 = new vwg
            r0.<init>(r6, r8, r5)
            r6.T(r0)
        L_0x00ea:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7h.K0(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L0() {
        /*
            r5 = this;
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r1 = "com.google.android.gms"
            android.content.Context r5 = r5.d
            xg4 r2 = defpackage.rqg.a(r5)
            r2.getClass()
            android.content.Context r2 = r2.a     // Catch:{ SecurityException -> 0x008d }
            java.lang.String r3 = "appops"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ SecurityException -> 0x008d }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ SecurityException -> 0x008d }
            if (r2 == 0) goto L_0x0085
            r2.checkPackage(r0, r1)     // Catch:{ SecurityException -> 0x008d }
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{  }
            rt6 r5 = defpackage.rt6.q(r5)
            r5.getClass()
            if (r0 == 0) goto L_0x008d
            r3 = 0
            boolean r4 = defpackage.rt6.u(r0, r3)
            if (r4 == 0) goto L_0x0039
            goto L_0x0084
        L_0x0039:
            r4 = 1
            boolean r0 = defpackage.rt6.u(r0, r4)
            if (r0 == 0) goto L_0x008d
            java.lang.Object r5 = r5.b
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = defpackage.ot6.c
            if (r0 != 0) goto L_0x0076
            xg4 r0 = defpackage.rqg.a(r5)     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            defpackage.rt6.q(r5)     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            if (r0 == 0) goto L_0x006c
            boolean r5 = defpackage.rt6.u(r0, r3)     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            if (r5 != 0) goto L_0x006c
            boolean r5 = defpackage.rt6.u(r0, r4)     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            if (r5 == 0) goto L_0x006c
            defpackage.ot6.b = r4     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r5 = move-exception
            goto L_0x0071
        L_0x006c:
            defpackage.ot6.b = r3     // Catch:{ NameNotFoundException -> 0x0074, all -> 0x006a }
        L_0x006e:
            defpackage.ot6.c = r4
            goto L_0x0076
        L_0x0071:
            defpackage.ot6.c = r4
            throw r5
        L_0x0074:
            defpackage.ot6.c = r4
        L_0x0076:
            boolean r5 = defpackage.ot6.b
            if (r5 != 0) goto L_0x0084
            java.lang.String r5 = "user"
            java.lang.String r0 = android.os.Build.TYPE
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x008d
        L_0x0084:
            return
        L_0x0085:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ SecurityException -> 0x008d }
            java.lang.String r0 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r5.<init>(r0)     // Catch:{ SecurityException -> 0x008d }
            throw r5     // Catch:{ SecurityException -> 0x008d }
        L_0x008d:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            int r0 = android.os.Binder.getCallingUid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 52
            r1.<init>(r2)
            java.lang.String r2 = "Calling UID "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is not Google Play services."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7h.L0():void");
    }
}
