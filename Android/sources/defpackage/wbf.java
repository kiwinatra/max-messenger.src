package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.random.Random;

/* renamed from: wbf  reason: default package */
public final class wbf implements pbf {
    public static final String q = pbf.class.getName();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile CountDownLatch b;
    public final AtomicLong c = new AtomicLong(0);
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final m95 i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public volatile Lazy n;
    public final Lazy o;
    public final Lazy p;

    public wbf(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, m95 m95, Lazy lazy5, Lazy lazy6, Lazy lazy7, ybf ybf, Lazy lazy8, hxd hxd, Lazy lazy9) {
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy3;
        this.h = lazy4;
        this.i = m95;
        this.j = lazy5;
        this.k = lazy6;
        this.l = lazy7;
        this.m = lazy8;
        this.p = lazy9;
        this.o = LazyKt.lazy(new a2d(8, lazy5));
        this.n = LazyKt.lazy(new a2d(9, lazy5));
        ((jxd) hxd).d.add(this);
        ybf.r = this;
    }

    public static void a(wbf wbf, qm qmVar) {
        wbf.getClass();
        String str = q;
        String name = qmVar.getClass().getName();
        long j2 = qmVar.a;
        z68.c(str, "onTaskSuccess: %s, requestId: %s", name, Long.valueOf(j2));
        boolean z = qmVar instanceof j88;
        Lazy lazy = wbf.k;
        Lazy lazy2 = wbf.m;
        if (z) {
            zbf zbf = (zbf) lazy2.getValue();
            AtomicLong atomicLong = zbf.g;
            ((fn4) zbf.d.get()).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            rvd.A((jqg) lazy.getValue());
        }
        if (qmVar instanceof hdb) {
            ((eef) wbf.e.getValue()).d(j2);
        }
        if (qmVar instanceof cw9) {
            rvd.A((jqg) lazy.getValue());
        }
        a33 a33 = ((ltb) ((jtb) wbf.f.getValue())).a;
        a33.getClass();
        if (a33.g.getBoolean("app.forceConnection", false) && qmVar.r().U()) {
            z68.c(str, "onTaskSuccess: set force connection to false after success tam task", new Object[0]);
            a33.w(false);
        }
        if (qmVar.r().U()) {
            ((fn4) wbf.g.getValue()).getClass();
            a33.k("app.lastSuccessfulRequestTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        ((zbf) lazy2.getValue()).f();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [jk3, java.lang.Object] */
    public final long b(qm qmVar, lcf lcf, boolean z) {
        String str = q;
        z68.c(str, "executeTask: " + qmVar.getClass().getName() + " isRetry=" + z, new Object[0]);
        ((zbf) this.m.getValue()).e();
        if (qmVar instanceof l98) {
            this.b = new CountDownLatch(1);
        }
        ? obj = new Object();
        obj.c = this;
        obj.a = qmVar;
        obj.b = lcf;
        ((ExecutorService) this.o.getValue()).execute(new bt8(this, qmVar, z, obj, lcf));
        return qmVar.a;
    }

    public final void c(int i2) {
        if (i2 == 2) {
            lwd lwd = new lwd(((ltb) ((jtb) this.f.getValue())).a.n(), 0);
            b(lwd, lwd, false);
        }
    }

    public final long d(fbf fbf) {
        long currentTimeMillis = System.currentTimeMillis();
        vbf vbf = (vbf) this.a.get(fbf.getClass().getName());
        if (vbf == null) {
            return currentTimeMillis;
        }
        gbf P = fbf.P();
        long j2 = vbf.b;
        return P.a(vbf.a, j2, Random.Default.nextFloat() * 0.2f);
    }

    public final void e(boolean z) {
        xvd xvd;
        AtomicLong atomicLong = this.c;
        ((fn4) this.g.getValue()).getClass();
        atomicLong.set(SystemClock.elapsedRealtime());
        if (z) {
            this.a.clear();
            Lazy lazy = this.m;
            if (lazy.isInitialized() && (xvd = (xvd) ((zbf) lazy.getValue()).f.get()) != null) {
                xvd.i.set(0);
                xvd.h.set(0);
                z68.c(xvd.a, "resetConnectionTimeout", new Object[0]);
            }
        }
    }

    public final void f(qm qmVar, qaf qaf) {
        String str = q;
        n9f n9f = qaf.v;
        String name = qmVar.getClass().getName();
        long j2 = qmVar.a;
        z68.h(str, n9f, "onTaskFailed: %s, requestId: %s, error %s", name, Long.valueOf(j2), qaf);
        String str2 = qaf.b;
        if ("proto.ver".equals(str2)) {
            z68.c(str, "got version error: mark current version as deprecated, close connection", new Object[0]);
            xvd xvd = (xvd) ((zbf) this.m.getValue()).f.get();
            if (xvd != null) {
                xvd.m(false);
            }
            ((sv0) this.h.getValue()).c(new js3(2));
        }
        if (qmVar instanceof hdb) {
            ((eef) this.e.getValue()).c(j2);
            if ("proto.payload".equals(str2)) {
                hdb hdb = (hdb) qmVar;
                try {
                    hdb.c();
                } catch (Throwable th) {
                    ((uta) this.i).c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + hdb.getId() + " type " + hdb.getType(), th), true);
                }
            }
            ((bef) this.l.getValue()).a();
        }
        if ((qmVar instanceof l98) && this.b != null) {
            z68.a(str, "countDownSyncLogoutLatch");
            this.b.countDown();
        }
    }
}
