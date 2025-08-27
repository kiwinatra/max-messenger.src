package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: htf  reason: default package */
public final class htf extends AtomicReference implements Runnable {
    public static final xvg c = new xvg(6);
    public static final xvg o = new xvg(6);
    public final Callable a;
    public final /* synthetic */ itf b;

    public htf(itf itf, Callable callable) {
        this.b = itf;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        kj7 kj7 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof kj7;
            xvg xvg = o;
            if (!z2 && runnable != xvg) {
                break;
            }
            if (z2) {
                kj7 = (kj7) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == xvg || compareAndSet(runnable, xvg)) {
                z = Thread.interrupted() || z;
                LockSupport.park(kj7);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            itf itf = this.b;
            boolean z = !itf.isDone();
            xvg xvg = c;
            if (z) {
                try {
                    obj = this.a.call();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, xvg)) {
                        a(currentThread);
                    }
                    if (z) {
                        itf.l((Object) null);
                    }
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, xvg)) {
                a(currentThread);
            }
            if (z) {
                itf.l(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof kj7) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder m = g63.m(str, ", ");
        m.append(this.a.toString());
        return m.toString();
    }
}
