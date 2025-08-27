package com.my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public final class y2 {
    private final MyTrackerParams a = new MyTrackerParams();
    final List b = new ArrayList();
    private String c = "";
    private AntiFraudConfig d = AntiFraudConfig.newBuilder().build();
    private volatile boolean e = true;
    private volatile int f = 0;
    private volatile boolean g = true;
    private volatile boolean h = true;
    private volatile boolean i = true;
    private volatile boolean j = true;
    private volatile boolean k = false;
    private volatile int l = 30;
    private volatile int m = 0;
    private volatile int n = 900;
    private volatile String o = null;
    private volatile String p = null;
    private volatile MyTrackerConfig.InstalledPackagesProvider q = null;
    private volatile MyTrackerConfig.OkHttpClientProvider r = null;
    private volatile String s = "";
    private volatile String t = "";
    private volatile String u = "";
    private volatile String v = "";
    private volatile String w = "";
    private volatile MyTracker.AttributionListener x = null;
    private volatile Handler y = null;

    public static class a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final MyTrackerParams.a k;
        public final AntiFraudConfig l;
        public final MyTrackerConfig.InstalledPackagesProvider m;

        public a(String str, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, MyTrackerParams.a aVar, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
            this.k = aVar;
            this.l = antiFraudConfig;
            this.m = installedPackagesProvider;
        }
    }

    private y2() {
        z();
    }

    public static y2 y() {
        return new y2();
    }

    private void z() {
        d("tracker-api.vk-analytics.ru");
    }

    public void A() {
        this.p = "com.my.games.vendorapp";
    }

    public void a(s sVar, s sVar2) {
        synchronized (this.b) {
            sVar.a(Boolean.valueOf(this.k));
            this.b.add(sVar2);
        }
    }

    public String b() {
        return this.o;
    }

    public Handler c() {
        return this.y;
    }

    public MyTracker.AttributionListener d() {
        return this.x;
    }

    public int e() {
        return this.n;
    }

    public int f() {
        return this.m;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.t;
    }

    public int i() {
        return this.l;
    }

    public int j() {
        return this.f;
    }

    public String k() {
        return this.v;
    }

    public String l() {
        return this.u;
    }

    public MyTrackerParams m() {
        return this.a;
    }

    public MyTrackerConfig.OkHttpClientProvider n() {
        return this.r;
    }

    public a o() {
        return new a(this.c, this.l, this.n, this.m, this.f, this.e, this.g, this.h, this.i, this.j, this.a.a(), this.d, this.q);
    }

    public String p() {
        return this.w;
    }

    public String q() {
        return this.s;
    }

    public String r() {
        return this.p;
    }

    public boolean s() {
        return this.h;
    }

    public boolean t() {
        return this.k;
    }

    public boolean u() {
        return this.g;
    }

    public boolean v() {
        return this.e;
    }

    public boolean w() {
        return this.i;
    }

    public boolean x() {
        return this.j;
    }

    private void a(boolean z) {
        synchronized (this.b) {
            try {
                for (s a2 : this.b) {
                    a2.a(Boolean.valueOf(z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void c(boolean z) {
        a(z);
        this.k = z;
    }

    public void d(int i2) {
        this.f = i2;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void f(boolean z) {
        this.i = z;
    }

    public void g(boolean z) {
        this.j = z;
    }

    public AntiFraudConfig a() {
        return this.d;
    }

    public void b(int i2) {
        if (i2 > 432000) {
            x2.a("Invalid forcingPeriod value " + i2 + ", forcingPeriod set to max 432000");
            this.m = 432000;
            return;
        }
        if (i2 < 0) {
            x2.a("Invalid forcingPeriod value " + i2 + ", forcingPeriod set to min 0");
            i2 = 0;
        }
        this.m = i2;
    }

    public void c(int i2) {
        StringBuilder sb;
        String str;
        int i3 = 7200;
        if (i2 > 7200) {
            sb = new StringBuilder("Invalid launchTimeout value ");
            sb.append(i2);
            str = ", timeout set to max 7200";
        } else {
            i3 = 30;
            if (i2 < 30) {
                sb = new StringBuilder("Invalid launchTimeout value ");
                sb.append(i2);
                str = ", timeout set to min 30";
            }
            this.l = i2;
        }
        sb.append(str);
        x2.a(sb.toString());
        i2 = i3;
        this.l = i2;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public void e(String str) {
        this.p = str;
    }

    private void d(String str) {
        this.s = a3.a(str, "v3/");
        x2.a("trackerUrl set = " + this.s);
        this.t = a3.a("ip4", str, (String) null);
        x2.a("ipv4TrackerUrl set = " + this.t);
        this.w = a3.a("ts", str, "mobile/v1");
        x2.a("timeSpentUrl set = " + this.w);
        this.u = a3.a("mlapi", str, (String) null);
        this.v = a3.a("beta-ml", str, (String) null);
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.d = antiFraudConfig;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        String str2;
        String str3;
        try {
            if (TextUtils.isEmpty(str)) {
                x2.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                z();
                return;
            }
            x2.c("setProxyHost: try to set proxy host = " + str);
            int indexOf = str.indexOf("://");
            if (indexOf > 0) {
                x2.c("setProxyHost: detected custom schema, will be suppressed");
                str2 = str.substring(indexOf + 3);
            } else {
                str2 = str;
            }
            URI uri = new URI(a3.a(str2, (String) null));
            if (uri.getUserInfo() != null) {
                x2.c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                x2.c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                str3 = uri.getHost() + ":" + port;
            } else {
                str3 = uri.getHost();
            }
            if (str3.startsWith("www.")) {
                x2.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            d(str3);
            x2.c("setProxyHost: proxy host = " + str3 + " successfully set");
        } catch (Throwable th) {
            StringBuilder p2 = tr1.p("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");
            p2.append(th.getMessage());
            x2.c(p2.toString());
            z();
        }
    }

    public void a(String str) {
        this.o = str;
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.x = attributionListener;
        this.y = handler;
    }

    public void a(int i2) {
        StringBuilder sb;
        String str;
        int i3 = 86400;
        if (i2 > 86400) {
            sb = new StringBuilder("Invalid bufferingPeriod value ");
            sb.append(i2);
            str = ", bufferingPeriod set to max 86400";
        } else {
            i3 = 1;
            if (i2 < 1) {
                sb = new StringBuilder("Invalid bufferingPeriod value ");
                sb.append(i2);
                str = ", bufferingPeriod set to min 1";
            }
            this.n = i2;
        }
        sb.append(str);
        x2.a(sb.toString());
        i2 = i3;
        this.n = i2;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.q = installedPackagesProvider;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.r = okHttpClientProvider;
    }
}
