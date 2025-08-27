package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

public final class p0 {
    static int f = 3;
    static volatile p0 g;
    final e0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            x2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + p0.this.e);
            p0.this.a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            x2.a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                p0.this.a((InstallReferrerStateListener) this);
            } else {
                p0.this.a(i);
            }
        }
    }

    public p0(e0 e0Var, n nVar, Context context) {
        this.a = e0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            x2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a((InstallReferrerStateListener) new a());
        } catch (Throwable th) {
            x2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* renamed from: a */
    public void b(ReferrerDetails referrerDetails) {
        p1 a2 = p1.a(this.c);
        if (a2.o()) {
            x2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.a.a(str, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        a2.s();
    }

    public void b() {
        p1 a2 = p1.a(this.c);
        if (!a2.r()) {
            String m = a2.m();
            if (!TextUtils.isEmpty(m)) {
                a(m, (Runnable) null);
            }
        }
    }

    public static void a(String str, Context context, Runnable runnable) {
        p0 p0Var = g;
        if (p0Var == null) {
            p1 a2 = p1.a(context);
            if (!a2.r()) {
                a2.l(str);
            }
            runnable.run();
            return;
        }
        p0Var.a(str, runnable);
    }

    public void a(String str, Runnable runnable) {
        p1 a2 = p1.a(this.c);
        if (a2.r()) {
            x2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.a.a(str, t.b(this.c), runnable);
        this.b.a(str);
        a2.v();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (g == null) {
            synchronized (p0.class) {
                try {
                    if (g == null) {
                        p0 p0Var = new p0(e0Var, nVar, context);
                        m.a(new uug(p0Var, 0));
                        g = p0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a() {
        if (!p1.a(this.c).o()) {
            m.f(new uug(this, 1));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(p0 p0Var) {
        p0Var.b();
        p0Var.a();
    }

    public void a(int i) {
        if (this.d == null) {
            x2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                x2.a("ReferrerHandler: retrieving install referrer");
                m.a(new l8g(25, this, this.d.getInstallReferrer()));
            } catch (Throwable th) {
                x2.b("ReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            x2.a("ReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.d;
        if (installReferrerClient == null) {
            x2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            x2.a("ReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            x2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
