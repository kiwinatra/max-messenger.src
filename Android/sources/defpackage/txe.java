package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: txe  reason: default package */
public final class txe extends AtomicInteger implements gx5, rye {
    public final pye a;
    public final fz b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference o = new AtomicReference();
    public final AtomicBoolean v = new AtomicBoolean();
    public volatile boolean w;

    /* JADX WARNING: type inference failed for: r1v1, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public txe(pye pye) {
        this.a = pye;
    }

    public final void b() {
        this.w = true;
        pye pye = this.a;
        fz fzVar = this.b;
        if (getAndIncrement() == 0) {
            fzVar.e(pye);
        }
    }

    public final void cancel() {
        if (!this.w) {
            tye.a(this.o);
        }
    }

    public final void d(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            pye pye = this.a;
            pye.d(obj);
            if (decrementAndGet() != 0) {
                this.b.e(pye);
            }
        }
    }

    public final void e(rye rye) {
        if (this.v.compareAndSet(false, true)) {
            this.a.e(this);
            AtomicReference atomicReference = this.o;
            AtomicLong atomicLong = this.c;
            if (tye.c(atomicReference, rye)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    rye.g(andSet);
                    return;
                }
                return;
            }
            return;
        }
        rye.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void g(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(wj6.i(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        tye.b(this.o, this.c, j);
    }

    public final void onError(Throwable th) {
        this.w = true;
        pye pye = this.a;
        fz fzVar = this.b;
        if (fzVar.a(th) && getAndIncrement() == 0) {
            fzVar.e(pye);
        }
    }
}
