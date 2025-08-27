package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bla  reason: default package */
public final class bla extends AtomicBoolean implements cla, mq4 {
    public final cla a;
    public final lfd b;
    public mq4 c;

    public bla(cla cla, ea5 ea5) {
        this.a = cla;
        this.b = ea5;
    }

    public final void b() {
        if (!get()) {
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.c, mq4)) {
            this.c = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!get()) {
            this.a.d(obj);
        }
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.c(new tj7(15, this));
        }
    }

    public final boolean f() {
        return get();
    }

    public final void onError(Throwable th) {
        if (get()) {
            n54.D(th);
        } else {
            this.a.onError(th);
        }
    }
}
