package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fz  reason: default package */
public final class fz extends AtomicReference {
    public final boolean a(Throwable th) {
        if (p95.a(this, th)) {
            return true;
        }
        n54.D(th);
        return false;
    }

    public final void b() {
        Throwable d = p95.d(this);
        if (d != null && d != p95.a) {
            n54.D(d);
        }
    }

    public final void c(ya3 ya3) {
        Throwable d = p95.d(this);
        if (d == null) {
            ya3.b();
        } else if (d != p95.a) {
            ya3.onError(d);
        }
    }

    public final void d(cla cla) {
        Throwable d = p95.d(this);
        if (d == null) {
            cla.b();
        } else if (d != p95.a) {
            cla.onError(d);
        }
    }

    public final void e(pye pye) {
        Throwable d = p95.d(this);
        if (d == null) {
            pye.b();
        } else if (d != p95.a) {
            pye.onError(d);
        }
    }
}
