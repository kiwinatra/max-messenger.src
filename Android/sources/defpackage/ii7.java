package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ii7  reason: default package */
public final class ii7 implements Callable, mq4 {
    public static final FutureTask w = new FutureTask(m58.d, (Object) null);
    public final Runnable a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final ExecutorService o;
    public Thread v;

    public ii7(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.a = runnable;
        this.o = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == w) {
                future.cancel(this.v != Thread.currentThread());
                return;
            }
            while (true) {
                if (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final Object call() {
        this.v = Thread.currentThread();
        try {
            this.a.run();
            this.v = null;
            Future submit = this.o.submit(this);
            loop0:
            while (true) {
                AtomicReference atomicReference = this.b;
                Future future = (Future) atomicReference.get();
                if (future == w) {
                    submit.cancel(this.v != Thread.currentThread());
                } else {
                    while (true) {
                        if (atomicReference.compareAndSet(future, submit)) {
                            break loop0;
                        } else if (atomicReference.get() != future) {
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            this.v = null;
            n54.D(th);
            throw th;
        }
    }

    public final void dispose() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = w;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z = false;
        if (!(future == null || future == futureTask)) {
            future.cancel(this.v != Thread.currentThread());
        }
        Future future2 = (Future) this.b.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.v != Thread.currentThread()) {
                z = true;
            }
            future2.cancel(z);
        }
    }

    public final boolean f() {
        return this.c.get() == w;
    }
}
