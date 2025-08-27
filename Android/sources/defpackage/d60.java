package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: d60  reason: default package */
public final class d60 implements gy9, d14 {
    public static final /* synthetic */ KProperty[] x = {rae.s(d60.class, "trackId", "getTrackId()J", 0)};
    public final /* synthetic */ jx3 a = e14.b();
    public final xy9 b;
    public b60 c;
    public boolean o;
    public final bl v;
    public pm7 w;

    public d60(xy9 xy9, long j, b60 b60) {
        this.b = xy9;
        this.c = b60;
        Delegates delegates = Delegates.INSTANCE;
        this.v = new bl(1, Long.valueOf(j), this);
    }

    public final CoroutineContext U() {
        return this.a.a;
    }

    public final void a(long j, jr8 jr8) {
        h(j, true);
    }

    public final long b() {
        return ((Number) this.v.getValue(this, x[0])).longValue();
    }

    public final void c(long j, jr8 jr8) {
        h(j, true);
    }

    public final void d(long j, jr8 jr8, long j2, jr8 jr82) {
        h(j2, true);
    }

    public final void e() {
        xy9 xy9 = this.b;
        synchronized (xy9.q) {
            xy9.q.remove(this);
        }
        pm7 pm7 = this.w;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.w = null;
        e14.c(this, (CancellationException) null);
        this.o = false;
    }

    public final void f(long j, jr8 jr8) {
        h(j, true);
    }

    public final void g(long j, jr8 jr8, long j2) {
        h(j, true);
    }

    public final void h(long j, boolean z) {
        if (b() == j) {
            int i = (b() > -1 ? 1 : (b() == -1 ? 0 : -1));
            xy9 xy9 = this.b;
            if (i == 0 || xy9.p(b())) {
                if (z && this.w == null) {
                    this.w = bs0.K(new ps5(xy9.v, new c60(this, (Continuation) null), 5), this);
                    return;
                }
                return;
            }
        }
        b60 b60 = this.c;
        if (b60 != null) {
            b60.a();
        }
        b60 b602 = this.c;
        if (b602 != null) {
            b602.b();
        }
        pm7 pm7 = this.w;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.w = null;
    }

    public final void i(long j, jr8 jr8) {
    }

    public final void k(long j, jr8 jr8) {
        b60 b60 = this.c;
        if (b60 != null) {
            b60.a();
        }
        h(j, true);
    }

    public final void l(long j, jr8 jr8) {
        h(j, true);
    }

    public final void m(long j, jr8 jr8) {
        if (b() == j) {
            h(j, true);
        }
    }

    public final void n(long j, jr8 jr8) {
        b60 b60 = this.c;
        if (b60 != null) {
            b60.a();
        }
        h(j, true);
    }
}
