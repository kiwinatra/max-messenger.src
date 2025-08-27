package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ska  reason: default package */
public final class ska extends AtomicReference implements cla, mq4, Runnable {
    public final cla a;
    public final long b;
    public final TimeUnit c;
    public final jfd o;
    public final qk3 v = null;
    public mq4 w;
    public volatile boolean x;

    public ska(btd btd, long j, TimeUnit timeUnit, jfd jfd) {
        this.a = btd;
        this.b = j;
        this.c = timeUnit;
        this.o = jfd;
    }

    public final void b() {
        this.a.b();
        this.o.dispose();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.x) {
            this.x = true;
            this.a.d(obj);
            mq4 mq4 = (mq4) get();
            if (mq4 != null) {
                mq4.dispose();
            }
            qq4.c(this, this.o.b(this, this.b, this.c));
            return;
        }
        qk3 qk3 = this.v;
        if (qk3 != null) {
            try {
                qk3.accept(obj);
            } catch (Throwable th) {
                hd8.Z(th);
                this.w.dispose();
                this.a.onError(th);
                this.o.dispose();
            }
        }
    }

    public final void dispose() {
        this.w.dispose();
        this.o.dispose();
    }

    public final boolean f() {
        return this.o.f();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.o.dispose();
    }

    public final void run() {
        this.x = false;
    }
}
