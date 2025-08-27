package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {
    final Map a = new WeakHashMap();
    final Handler b = m.a;
    final AtomicBoolean c = new AtomicBoolean();
    final e0 d;
    final y2 e;
    final w1 f;
    final Application g;
    final Runnable h;
    final Runnable i;
    final Runnable j;
    long k = 0;
    long l = 0;

    /* renamed from: com.my.tracker.obfuscated.a$a  reason: collision with other inner class name */
    public final class C0000a implements Application.ActivityLifecycleCallbacks {
        public C0000a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        this.d = e0Var;
        this.e = y2Var;
        this.f = w1Var;
        this.g = application;
        this.h = new isg(this, 0);
        this.i = new isg(this, 1);
        this.j = new isg(this, 2);
    }

    public void e() {
        if (this.c.get()) {
            m.f(this.i);
        }
    }

    public void f() {
        x2.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(v2.a((long) this.e.e()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        p1.a((Context) this.g).d(v2.b(this.k));
    }

    public void a() {
        this.g.registerActivityLifecycleCallbacks(new C0000a());
    }

    /* renamed from: b */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) == null && this.a.size() <= 1) {
            l2.d().a();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.k >= v2.a((long) this.e.i())) {
                this.f.c();
                if (this.e.v()) {
                    this.d.g();
                    a(v2.a((long) this.e.e()));
                    return;
                }
            }
            long j2 = this.l - currentTimeMillis;
            if (j2 > 0) {
                a(j2);
            } else {
                f();
            }
        }
    }

    public void c(Activity activity) {
        if (this.a.remove(activity) != null && this.a.isEmpty()) {
            l2.d().b();
            this.c.set(false);
            this.b.removeCallbacks(this.h);
            this.k = System.currentTimeMillis();
            m.a(this.j);
        }
    }

    public void d(Activity activity) {
        m.f(new l8g(10, this, activity));
    }

    public static a a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        return new a(e0Var, y2Var, w1Var, application);
    }

    public void a(long j2) {
        this.b.removeCallbacks(this.h);
        this.c.set(true);
        this.b.postDelayed(this.h, j2);
        this.l = System.currentTimeMillis() + j2;
    }
}
