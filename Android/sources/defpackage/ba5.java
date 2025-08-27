package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ba5  reason: default package */
public final class ba5 extends AtomicInteger implements Runnable, mq4 {
    public final Runnable a;
    public final nq4 b;
    public volatile Thread c;

    public ba5(Runnable runnable, nq4 nq4) {
        this.a = runnable;
        this.b = nq4;
    }

    public final void dispose() {
        while (true) {
            int i = get();
            if (i < 2) {
                if (i == 0) {
                    if (compareAndSet(0, 4)) {
                        nq4 nq4 = this.b;
                        if (nq4 != null) {
                            nq4.c(this);
                            return;
                        }
                        return;
                    }
                } else if (compareAndSet(1, 3)) {
                    Thread thread = this.c;
                    if (thread != null) {
                        thread.interrupt();
                        this.c = null;
                    }
                    set(4);
                    nq4 nq42 = this.b;
                    if (nq42 != null) {
                        nq42.c(this);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean f() {
        return get() >= 2;
    }

    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.a.run();
                    this.c = null;
                    if (compareAndSet(1, 2)) {
                        nq4 nq4 = this.b;
                        if (nq4 != null) {
                            nq4.c(this);
                            return;
                        }
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } catch (Throwable th) {
                    this.c = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        nq4 nq42 = this.b;
                        if (nq42 != null) {
                            nq42.c(this);
                        }
                    }
                    throw th;
                }
            } else {
                this.c = null;
            }
        }
    }
}
