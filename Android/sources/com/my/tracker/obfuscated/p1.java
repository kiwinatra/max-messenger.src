package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;

public final class p1 {
    private static volatile p1 b;
    private final SharedPreferences a;

    private p1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public String a() {
        return c("appVersion");
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public String c() {
        return c("appId");
    }

    public String d() {
        return c("appSetId");
    }

    public int e() {
        return (int) b("appSetIdScope");
    }

    public String f() {
        return c("appVersionName");
    }

    public String g() {
        return c("appsHash");
    }

    public String h() {
        return c("attribution");
    }

    public String i() {
        return c("firebaseAppInstanceId");
    }

    public long j() {
        return b("installTimestamp");
    }

    public String k() {
        return c("instanceId");
    }

    public long l() {
        return b("lastUpdateTimestamp");
    }

    public String m() {
        return c("referrer");
    }

    public long n() {
        long b2 = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0);
        return b2;
    }

    public boolean o() {
        return a("apiReferrerSent");
    }

    public boolean p() {
        return a("huaweiApiReferrerSent");
    }

    public boolean q() {
        return a("preinstallRead");
    }

    public boolean r() {
        return a("referrerSent");
    }

    public void s() {
        a("apiReferrerSent", true);
    }

    public void t() {
        a("huaweiApiReferrerSent", true);
    }

    public void u() {
        a("preinstallRead", true);
    }

    public void v() {
        a("referrerSent", true);
    }

    public boolean a(String str) {
        try {
            return this.a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public long b(String str) {
        try {
            return this.a.getLong(str, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String c(String str) {
        try {
            return this.a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public void e(String str) {
        a("appId", str);
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a("attribution", str);
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public void l(String str) {
        a("referrer", str);
    }

    public static p1 a(Context context) {
        p1 p1Var = b;
        if (p1Var == null) {
            synchronized (p1.class) {
                try {
                    p1Var = b;
                    if (p1Var == null) {
                        p1Var = new p1(context.getSharedPreferences("mytracker_prefs", 0));
                        b = p1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p1Var;
    }

    public void b(long j) {
        a("installTimestamp", j);
    }

    public void c(long j) {
        a("lastUpdateTimestamp", j);
    }

    public void d(long j) {
        a("lastStopTimeStampSec", j);
    }

    public void a(String str, boolean z) {
        try {
            this.a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, long j) {
        try {
            this.a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, String str2) {
        try {
            this.a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }

    public void a(long j) {
        a("appGalleryTrackedTime", j);
    }

    public void a(int i) {
        a("appSetIdScope", (long) i);
    }
}
