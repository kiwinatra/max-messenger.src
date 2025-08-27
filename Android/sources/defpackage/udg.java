package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: udg  reason: default package */
public final class udg implements xq {
    public static final /* synthetic */ int n = 0;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final q04 d;
    public final Lazy e;
    public int f = 0;
    public long g;
    public int h;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final xgd j;
    public volatile boolean k = false;
    public volatile boolean l = true;
    public final tdg m = new tdg(this);

    public udg(Application application, xgd xgd, Lazy lazy, Lazy lazy2, Lazy lazy3, q04 q04, Lazy lazy4) {
        this.j = xgd;
        this.c = lazy3;
        this.a = lazy;
        this.b = lazy2;
        this.d = q04;
        this.e = lazy4;
        application.registerActivityLifecycleCallbacks(new eh0(1, this));
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        z68.c("udg", "app enter background, time=" + iq.U(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + elapsedRealtime, new Object[0]);
        ((nd) this.b.getValue()).h(elapsedRealtime, "INTERACTIVE_SESSION");
        this.d.p0(EmptyCoroutineContext.INSTANCE, new sdg(this, 2));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((wq) it.next()).a();
        }
    }

    public final void b() {
        z68.c("udg", "app enter foreground, time = " + iq.U(Long.valueOf(System.currentTimeMillis())), new Object[0]);
        this.g = SystemClock.elapsedRealtime();
        this.d.p0(EmptyCoroutineContext.INSTANCE, new sdg(this, 0));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((wq) it.next()).c();
        }
    }

    public final boolean c() {
        return this.k && this.l;
    }
}
