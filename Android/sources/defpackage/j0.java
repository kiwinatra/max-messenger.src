package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j0  reason: default package */
public abstract class j0 extends AtomicReference implements mq4 {
    public static final FutureTask o;
    public static final FutureTask v;
    public final Runnable a;
    public final boolean b;
    public Thread c;

    static {
        xvg xvg = m58.d;
        o = new FutureTask(xvg, (Object) null);
        v = new FutureTask(xvg, (Object) null);
    }

    public j0(Runnable runnable, boolean z) {
        this.a = runnable;
        this.b = z;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != o) {
                if (future2 == v) {
                    if (this.c == Thread.currentThread()) {
                        future.cancel(false);
                        return;
                    } else {
                        future.cancel(this.b);
                        return;
                    }
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future != o && future != (futureTask = v) && compareAndSet(future, futureTask) && future != null) {
            if (this.c == Thread.currentThread()) {
                future.cancel(false);
            } else {
                future.cancel(this.b);
            }
        }
    }

    public final boolean f() {
        Future future = (Future) get();
        return future == o || future == v;
    }

    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == o) {
            str = "Finished";
        } else if (future == v) {
            str = "Disposed";
        } else if (this.c != null) {
            str = "Running on " + this.c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
