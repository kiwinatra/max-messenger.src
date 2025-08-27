package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fx5  reason: default package */
public final class fx5 extends AtomicReference implements gx5, rye, Runnable {
    public final pye a;
    public final jfd b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();
    public final boolean v;
    public eac w;

    public fx5(pye pye, jfd jfd, eac eac, boolean z) {
        this.a = pye;
        this.b = jfd;
        this.w = eac;
        this.v = !z;
    }

    public final void a(long j, rye rye) {
        if (this.v || Thread.currentThread() == get()) {
            rye.g(j);
            return;
        }
        this.b.a(new ex5(j, rye));
    }

    public final void b() {
        this.a.b();
        this.b.dispose();
    }

    public final void cancel() {
        tye.a(this.c);
        this.b.dispose();
    }

    public final void d(Object obj) {
        this.a.d(obj);
    }

    public final void e(rye rye) {
        if (tye.c(this.c, rye)) {
            long andSet = this.o.getAndSet(0);
            if (andSet != 0) {
                a(andSet, rye);
            }
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            AtomicReference atomicReference = this.c;
            rye rye = (rye) atomicReference.get();
            if (rye != null) {
                a(j, rye);
                return;
            }
            AtomicLong atomicLong = this.o;
            h88.c(atomicLong, j);
            rye rye2 = (rye) atomicReference.get();
            if (rye2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, rye2);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.b.dispose();
    }

    public final void run() {
        lazySet(Thread.currentThread());
        eac eac = this.w;
        this.w = null;
        ((wv5) eac).f(this);
    }
}
