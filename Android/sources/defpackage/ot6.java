package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ot6  reason: default package */
public abstract class ot6 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final /* synthetic */ int e = 0;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r9, android.content.Context r10) {
        /*
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = defpackage.xmc.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0081
            java.util.concurrent.atomic.AtomicBoolean r0 = d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001f
            goto L_0x0081
        L_0x001f:
            java.lang.Object r0 = defpackage.n54.q
            monitor-enter(r0)
            boolean r2 = defpackage.n54.r     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x005d
        L_0x0028:
            r9 = move-exception
            goto L_0x007f
        L_0x002a:
            defpackage.n54.r = r1     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0028 }
            xg4 r3 = defpackage.rqg.a(r10)     // Catch:{ all -> 0x0028 }
            android.content.Context r3 = r3.a     // Catch:{ NameNotFoundException -> 0x0054 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0054 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0054 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r2 != 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x005d
        L_0x0046:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            defpackage.n54.s = r2     // Catch:{ NameNotFoundException -> 0x0054 }
            goto L_0x005c
        L_0x0054:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0028 }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
        L_0x005d:
            int r0 = defpackage.n54.s
            if (r0 == 0) goto L_0x0079
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0067
            goto L_0x0081
        L_0x0067:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            int r10 = defpackage.et6.a
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.String r2 = " but found "
            java.lang.String r3 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.String r10 = defpackage.a81.l(r1, r10, r2, r0, r3)
            r9.<init>(r10)
            throw r9
        L_0x0079:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x0081:
            boolean r0 = defpackage.b59.K(r10)
            r2 = 0
            if (r0 != 0) goto L_0x00b7
            java.lang.Boolean r0 = defpackage.b59.t
            if (r0 != 0) goto L_0x00ad
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00a4
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x00a6
        L_0x00a4:
            r0 = r1
            goto L_0x00a7
        L_0x00a6:
            r0 = r2
        L_0x00a7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.b59.t = r0
        L_0x00ad:
            java.lang.Boolean r0 = defpackage.b59.t
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b7
            r0 = r1
            goto L_0x00b8
        L_0x00b7:
            r0 = r2
        L_0x00b8:
            if (r9 < 0) goto L_0x0167
            java.lang.String r3 = r10.getPackageName()
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00db
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00cf }
            goto L_0x00dc
        L_0x00cf:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L_0x00d8:
            r1 = r5
            goto L_0x0166
        L_0x00db:
            r6 = 0
        L_0x00dc:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x015d }
            defpackage.rt6.q(r10)
            boolean r10 = defpackage.rt6.u(r7, r1)
            if (r10 != 0) goto L_0x00f7
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L_0x00d8
        L_0x00f7:
            if (r0 == 0) goto L_0x010c
            defpackage.vzg.m(r6)
            boolean r10 = defpackage.rt6.u(r6, r1)
            if (r10 != 0) goto L_0x010c
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L_0x00d8
        L_0x010c:
            if (r0 == 0) goto L_0x0128
            if (r6 == 0) goto L_0x0128
            android.content.pm.Signature[] r10 = r6.signatures
            r10 = r10[r2]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r2]
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0128
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L_0x00d8
        L_0x0128:
            int r10 = r7.versionCode
            r0 = -1
            if (r10 != r0) goto L_0x012f
            r10 = r0
            goto L_0x0131
        L_0x012f:
            int r10 = r10 / 1000
        L_0x0131:
            if (r9 != r0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            int r0 = r9 / 1000
        L_0x0136:
            if (r10 >= r0) goto L_0x013a
            r1 = 2
            goto L_0x0166
        L_0x013a:
            android.content.pm.ApplicationInfo r9 = r7.applicationInfo
            if (r9 != 0) goto L_0x0156
            java.lang.String r9 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r9, r2)     // Catch:{ NameNotFoundException -> 0x0145 }
            goto L_0x0156
        L_0x0145:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.wtf(r2, r10, r9)
            goto L_0x0166
        L_0x0156:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x015c
            r1 = 3
            goto L_0x0166
        L_0x015c:
            return r2
        L_0x015d:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0166:
            return r1
        L_0x0167:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot6.a(int, android.content.Context):int");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ Exception -> 0x0038 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0038 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0038 }
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "com.google.android.gms"
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r2 = (android.content.pm.PackageInstaller.SessionInfo) r2
            java.lang.String r2 = r2.getAppPackageName()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0011
            r4 = 1
            return r4
        L_0x002b:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r1 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r3, r1)     // Catch:{  }
            boolean r4 = r4.enabled     // Catch:{  }
            return r4
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot6.b(android.content.Context):boolean");
    }
}
