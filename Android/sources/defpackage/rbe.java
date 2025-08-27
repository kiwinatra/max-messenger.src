package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rbe  reason: default package */
public final class rbe extends AtomicReference implements cla, mq4 {
    public final gce a;
    public final lbe b;
    public boolean c;

    public rbe(gce gce, lbe lbe) {
        this.a = gce;
        this.b = lbe;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.b.l(new ui8((AtomicReference) this, this.a));
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.e(this, mq4)) {
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        ((mq4) get()).dispose();
        b();
    }

    public final void dispose() {
        qq4.a(this);
    }

    public final boolean f() {
        return qq4.b((mq4) get());
    }

    public final void onError(Throwable th) {
        if (this.c) {
            n54.D(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }
}
