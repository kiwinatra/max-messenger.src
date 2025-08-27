package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* renamed from: itf  reason: default package */
public final class itf extends n1 implements RunnableFuture, g1 {
    public volatile htf y;

    public itf(Callable callable) {
        this.y = new htf(this, callable);
    }

    public final void b() {
        htf htf;
        Object obj = this.a;
        if ((obj instanceof t0) && ((t0) obj).a && (htf = this.y) != null) {
            xvg xvg = htf.o;
            xvg xvg2 = htf.c;
            Runnable runnable = (Runnable) htf.get();
            if (runnable instanceof Thread) {
                kj7 kj7 = new kj7(htf);
                kj7.a(kj7, Thread.currentThread());
                if (htf.compareAndSet(runnable, kj7)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) htf.getAndSet(xvg2)) == xvg) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.y = null;
    }

    public final boolean isCancelled() {
        return this.a instanceof t0;
    }

    public final String j() {
        htf htf = this.y;
        if (htf == null) {
            return super.j();
        }
        return "task=[" + htf + "]";
    }

    public final void run() {
        htf htf = this.y;
        if (htf != null) {
            htf.run();
        }
        this.y = null;
    }
}
