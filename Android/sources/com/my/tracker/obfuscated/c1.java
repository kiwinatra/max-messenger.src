package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.e0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class c1 {
    final AtomicBoolean a = new AtomicBoolean();
    final y2 b;
    final Application c;
    final e0 d;
    final a e;
    final n f;
    final y g;
    final s1 h;
    final w1 i;
    n1 j;
    protected t1 k;

    public final class a implements e0.b {
        public a() {
        }

        public void a() {
            c1.this.e.e();
        }

        public void a(String str) {
            c1.this.f.b(str);
        }
    }

    public c1(y2 y2Var, Application application) {
        this.b = y2Var;
        this.c = application;
        x2.c("MyTracker created, version: 3.4.2");
        e0 a2 = e0.a(y2Var, (e0.b) new a(), (Context) application);
        this.d = a2;
        w1 a3 = w1.a(a2, y2Var.a(), application);
        this.i = a3;
        this.e = a.a(a2, y2Var, a3, application);
        this.f = n.a(y2Var, (Context) application);
        this.g = y.a(a2);
        this.h = s1.a(a2, (Context) application);
        this.k = t1.a();
    }

    public static c1 a(String str, y2 y2Var, Application application) {
        y2Var.b(str);
        return new c1(y2Var, application);
    }

    public boolean b() {
        boolean z = !this.a.get();
        if (z) {
            x2.b("MyTracker error: tracker hasn't been initialized");
        }
        return z;
    }

    public void a() {
        if (!b()) {
            this.d.a();
        }
    }

    public void b(int i2, boolean z) {
        if (!b()) {
            l2.e().b(i2, z);
        }
    }

    public String a(Intent intent) {
        return this.g.a(intent);
    }

    public void b(Map map) {
        if (!b()) {
            this.d.d(map);
        }
    }

    public void a(int i2) {
        if (!b()) {
            l2.e().a(i2);
        }
    }

    public void b(String str, String str2, Map map) {
        if (!b()) {
            this.d.b(str, str2, map);
        }
    }

    public void a(List list) {
        if (!this.a.compareAndSet(false, true)) {
            x2.a("MyTracker: tracker has already been initialized");
            return;
        }
        x2.c("MyTracker is initialized with id: " + this.b.g());
        b1.c(this.c);
        y2 y2Var = this.b;
        e0 e0Var = this.d;
        Objects.requireNonNull(e0Var);
        dtg dtg = new dtg(e0Var, 0);
        e0 e0Var2 = this.d;
        Objects.requireNonNull(e0Var2);
        y2Var.a((s) dtg, (s) new dtg(e0Var2, 1));
        this.d.d();
        w0.a(this.b, this.d, this.i, (Context) this.c);
        p0.a(this.d, this.f, (Context) this.c);
        v0.a(this.d, this.f, this.c);
        l2.d().a(this.b, this.c);
        this.e.a();
        this.h.a();
        if (!list.isEmpty()) {
            n1 a2 = n1.a(this.d, this.c);
            this.j = a2;
            a2.a(list);
        }
        t1 t1Var = this.k;
        Application application = this.c;
        e0 e0Var3 = this.d;
        Objects.requireNonNull(e0Var3);
        t1Var.a(application, new dtg(e0Var3, 2));
    }

    public void a(int i2, Intent intent) {
        if (!b()) {
            if (!this.b.s()) {
                x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
            } else {
                this.h.b(i2, intent);
            }
        }
    }

    public void a(int i2, List list) {
        if (!b()) {
            if (!this.b.s()) {
                x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
            } else {
                this.h.a(i2, list);
            }
        }
    }

    public void a(int i2, boolean z) {
        if (!b()) {
            l2.e().a(i2, z);
        }
    }

    public void a(AdEvent adEvent) {
        if (!b()) {
            this.d.a(adEvent);
        }
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        if (!b()) {
            if (this.b.s()) {
                x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
            } else {
                this.h.a(obj, str, str2, str3, map);
            }
        }
    }

    public void a(String str, Map map) {
        if (!b()) {
            this.d.a(str, map);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        if (!b()) {
            if (this.b.s()) {
                x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
            } else {
                this.h.a(jSONObject, jSONObject2, str, map);
            }
        }
    }

    public void a(Map map) {
        if (!b()) {
            this.d.c(map);
        }
    }

    public void a(Activity activity) {
        if (!b()) {
            this.e.d(activity);
        }
    }

    public void a(int i2, Map map) {
        if (!b()) {
            this.d.a(i2, map);
        }
    }

    public void a(String str, String str2, Map map) {
        if (!b()) {
            this.d.a(str, str2, map);
        }
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (!b()) {
            this.d.a(miniAppEvent);
        }
    }
}
