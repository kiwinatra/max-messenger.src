package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

public final class v0 {
    static int f = 3;
    static volatile v0 g;
    final e0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            x2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + v0.this.e);
            v0.this.a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                v0.this.a((InstallReferrerStateListener) this);
                return;
            }
            x2.a("HuaweiReferrerHandler: install referrer setup is finished");
            v0.this.a(i);
        }
    }

    public v0(e0 e0Var, n nVar, Context context) {
        this.a = e0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    public void a(ReferrerDetails referrerDetails) {
        p1 a2 = p1.a(this.c);
        if (a2.p()) {
            x2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.a.b(str, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        a2.t();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (g == null) {
            synchronized (v0.class) {
                try {
                    if (g == null) {
                        v0 v0Var = new v0(e0Var, nVar, context);
                        m.a(new qof(20, v0Var));
                        g = v0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a() {
        if (!p1.a(this.c).p()) {
            try {
                x2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
                this.d = InstallReferrerClient.newBuilder(this.c).build();
                a((InstallReferrerStateListener) new a());
            } catch (Throwable th) {
                x2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    public void a(int i) {
        if (this.d == null) {
            x2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                x2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } catch (Throwable th) {
                x2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            x2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            x2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            x2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            x2.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            x2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
