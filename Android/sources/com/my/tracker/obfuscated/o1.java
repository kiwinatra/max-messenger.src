package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import org.json.JSONObject;

public final class o1 {
    final e0 a;
    final y2 b;
    final Context c;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public o1(e0 e0Var, y2 y2Var, Context context) {
        this.a = e0Var;
        this.b = y2Var;
        this.c = context.getApplicationContext();
    }

    public static a a(int i, String str, String str2) {
        try {
            x2.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            x2.b("PreInstallHandler error: exception when converting raw data to json with pid", th);
            x2.a("PreInstallHandler: nothing has been found for source: " + i);
            return null;
        }
    }

    public a b() {
        String str = "ro.mtpi." + this.b.g();
        String a2 = c2.a(str);
        if (TextUtils.isEmpty(a2)) {
            x2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        x2.a("PreInstallHandler: raw data in SystemProperties has been found: " + a2);
        return a(3, a2, str);
    }

    public void c() {
        String r = this.b.r();
        if (!TextUtils.isEmpty(r)) {
            p1 a2 = p1.a(this.c);
            if (!a2.q()) {
                x2.a("PreInstallHandler: checking preinstall");
                PackageManager packageManager = this.c.getPackageManager();
                try {
                    String a3 = a(packageManager.getResourcesForApplication(r), this.c.getPackageName(), r);
                    a2.u();
                    if (TextUtils.isEmpty(a3)) {
                        x2.a("PreInstallHandler: referrer is empty");
                        return;
                    }
                    x2.a("PreInstallHandler: referrer " + a3);
                    this.a.a(a3, t.b(this.c), (Runnable) null);
                    p1.a(this.c).v();
                } catch (Throwable unused) {
                    x2.a("PreInstallHandler: unable to locate vendor app " + r);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "PreInstallHandler: searching string in file "
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r2.<init>(r0)     // Catch:{ all -> 0x0071 }
            r2.append(r7)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0071 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x0071 }
            android.content.Context r6 = r6.c     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            r0.append(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = "="
            r0.append(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0071 }
            int r0 = r6.length()     // Catch:{ all -> 0x0071 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0071 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0071 }
            r3.<init>(r7)     // Catch:{ all -> 0x0071 }
            r2.<init>(r3)     // Catch:{ all -> 0x0071 }
        L_0x0037:
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x006d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r4.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "PreInstallHandler: processing string "
            r4.append(r5)     // Catch:{ all -> 0x006b }
            r4.append(r3)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006b }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r4)     // Catch:{ all -> 0x006b }
            boolean r4 = r3.startsWith(r6)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0037
            int r4 = r3.length()     // Catch:{ all -> 0x006b }
            if (r4 <= r0) goto L_0x0037
            java.lang.String r3 = r3.substring(r0)     // Catch:{ all -> 0x006b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            return r3
        L_0x006b:
            r6 = move-exception
            goto L_0x0073
        L_0x006d:
            r2.close()     // Catch:{ all -> 0x008a }
            goto L_0x008a
        L_0x0071:
            r6 = move-exception
            r2 = r1
        L_0x0073:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r0.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r3 = "PreInstallHandler error: exception while retrieving data in file"
            r0.append(r3)     // Catch:{ all -> 0x008b }
            r0.append(r7)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x008b }
            com.my.tracker.obfuscated.x2.b(r7, r6)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x008a
            goto L_0x006d
        L_0x008a:
            return r1
        L_0x008b:
            r6 = move-exception
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.o1.a(java.lang.String):java.lang.String");
    }

    public a a(int i) {
        String str;
        String str2;
        StringBuilder sb;
        if (i == 1) {
            str2 = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str2 = "ro.appsflyer.preinstall.path";
        } else {
            str = "PreInstallHandler: wrong property property key";
            x2.a(str);
            return null;
        }
        String a2 = c2.a(str2);
        if (TextUtils.isEmpty(a2)) {
            sb = new StringBuilder("PreInstallHandler: empty path for source: ");
        } else {
            String a3 = a(a2);
            if (TextUtils.isEmpty(a3)) {
                sb = new StringBuilder("PreInstallHandler: empty data for source: ");
            } else {
                x2.a("PreInstallHandler: raw data for source has been found: " + a3);
                return a(i, a3, a2);
            }
        }
        sb.append(i);
        str = sb.toString();
        x2.a(str);
        return null;
    }

    public a a() {
        if (!this.b.w()) {
            x2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a b2 = b();
        if (b2 != null) {
            return b2;
        }
        a a2 = a(1);
        if (a2 != null) {
            return a2;
        }
        if (this.b.x()) {
            return a(2);
        }
        return null;
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static o1 a(e0 e0Var, y2 y2Var, Context context) {
        return new o1(e0Var, y2Var, context);
    }
}
