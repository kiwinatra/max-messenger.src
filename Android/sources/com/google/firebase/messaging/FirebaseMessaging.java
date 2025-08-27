package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static xga k;
    public static m9c l = new gc3(5);
    public static ScheduledThreadPoolExecutor m;
    public final hp5 a;
    public final Context b;
    public final kwd c;
    public final zqd d;
    public final lf6 e;
    public final Executor f;
    public final Executor g;
    public final jv3 h;
    public boolean i = false;

    /* JADX WARNING: type inference failed for: r6v0, types: [kwd, java.lang.Object] */
    public FirebaseMessaging(hp5 hp5, m9c m9c, m9c m9c2, mp5 mp5, m9c m9c3, qye qye) {
        hp5 hp52 = hp5;
        hp5.a();
        Context context = hp52.a;
        jv3 jv3 = new jv3(context);
        hp5.a();
        m9d m9d = new m9d(hp52.a);
        ? obj = new Object();
        obj.a = hp52;
        obj.b = jv3;
        obj.c = m9d;
        obj.d = m9c;
        obj.e = m9c2;
        obj.f = mp5;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new j5a("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new j5a("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j5a("Firebase-Messaging-File-Io", 0));
        l = m9c3;
        this.a = hp52;
        this.e = new lf6(this, qye);
        hp5.a();
        Context context2 = hp52.a;
        this.b = context2;
        lj5 lj5 = new lj5();
        this.h = jv3;
        this.c = obj;
        this.d = new zqd(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        hp5.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(lj5);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new op5(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new j5a("Firebase-Messaging-Topics-Io", 0));
        int i2 = unf.j;
        hsg.f(new tnf(context2, scheduledThreadPoolExecutor2, this, jv3, obj), scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new pp5(this, 0));
        scheduledThreadPoolExecutor.execute(new op5(this, 1));
    }

    public static void b(long j2, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new j5a("TAG", 0));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized xga c(Context context) {
        xga xga;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new xga(context);
                }
                xga = k;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return xga;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(hp5 hp5) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            Class<FirebaseMessaging> cls = FirebaseMessaging.class;
            hp5.a();
            firebaseMessaging = (FirebaseMessaging) hp5.d.a(cls);
            vzg.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        bxe e2 = e();
        if (!i(e2)) {
            return e2.a;
        }
        String f2 = jv3.f(this.a);
        zqd zqd = this.d;
        synchronized (zqd) {
            task = (Task) ((ts) zqd.c).get(f2);
            if (task == null) {
                kwd kwd = this.c;
                task = kwd.d(kwd.h(new Bundle(), jv3.f((hp5) kwd.a), "*")).l(this.g, new u00((Object) this, (Object) f2, (Object) e2, 10)).k((Executor) zqd.b, new pbb(11, zqd, f2));
                ((ts) zqd.c).put(f2, task);
            }
        }
        try {
            return (String) hsg.c(task);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String d() {
        hp5 hp5 = this.a;
        hp5.a();
        return "[DEFAULT]".equals(hp5.b) ? "" : hp5.c();
    }

    public final bxe e() {
        bxe a2;
        xga c2 = c(this.b);
        String d2 = d();
        String f2 = jv3.f(this.a);
        synchronized (c2) {
            a2 = bxe.a(((SharedPreferences) c2.b).getString(xga.e(d2, f2), (String) null));
        }
        return a2;
    }

    public final void f() {
        s7h s7h;
        int i2;
        m9d m9d = (m9d) this.c.c;
        if (m9d.c.g() >= 241100000) {
            m7h g2 = m7h.g(m9d.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (g2) {
                i2 = g2.c;
                g2.c = i2 + 1;
            }
            s7h = g2.h(new w6h(i2, 5, bundle, 1)).j(ep4.o, ekd.v0);
        } else {
            s7h = hsg.n(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        s7h.d(this.f, new pp5(this, 1));
    }

    public final boolean g() {
        Context context = this.b;
        ld8.R(context);
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        } else {
            hp5 hp5 = this.a;
            hp5.a();
            if (hp5.d.a(od.class) != null) {
                return true;
            }
            return n79.x() && l != null;
        }
    }

    public final synchronized void h(long j2) {
        b(j2, new nme(this, Math.min(Math.max(30, 2 * j2), j)));
        this.i = true;
    }

    public final boolean i(bxe bxe) {
        if (bxe != null) {
            return System.currentTimeMillis() > bxe.c + bxe.d || !this.h.d().equals(bxe.b);
        }
    }
}
