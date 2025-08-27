package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ww5  reason: default package */
public final class ww5 extends AtomicInteger implements gx5, rye {
    public final eac a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public xw5 o;

    public ww5(eac eac) {
        this.a = eac;
    }

    public final void b() {
        this.o.cancel();
        this.o.z.b();
    }

    public final void cancel() {
        tye.a(this.b);
    }

    public final void d(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != tye.a) {
                ((wv5) this.a).f(this.o);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void e(rye rye) {
        AtomicReference atomicReference = this.b;
        AtomicLong atomicLong = this.c;
        if (tye.c(atomicReference, rye)) {
            long andSet = atomicLong.getAndSet(0);
            if (andSet != 0) {
                rye.g(andSet);
            }
        }
    }

    public final void g(long j) {
        tye.b(this.b, this.c, j);
    }

    public final void onError(Throwable th) {
        this.o.cancel();
        this.o.z.onError(th);
    }
}
