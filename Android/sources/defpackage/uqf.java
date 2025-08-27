package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: uqf  reason: default package */
public final class uqf extends jfd {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean o;

    public final mq4 a(Runnable runnable) {
        return d(lfd.a(TimeUnit.MILLISECONDS), runnable);
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + lfd.a(TimeUnit.MILLISECONDS);
        return d(millis, new nme(runnable, this, millis));
    }

    public final mq4 d(long j, Runnable runnable) {
        boolean z = this.o;
        p45 p45 = p45.a;
        if (z) {
            return p45;
        }
        tqf tqf = new tqf(runnable, Long.valueOf(j), this.c.incrementAndGet());
        this.a.add(tqf);
        if (this.b.getAndIncrement() != 0) {
            return new o7(1, new vj6((Object) this, (Object) tqf, false, 25));
        }
        int i = 1;
        while (!this.o) {
            tqf tqf2 = (tqf) this.a.poll();
            if (tqf2 == null) {
                i = this.b.addAndGet(-i);
                if (i == 0) {
                    return p45;
                }
            } else if (!tqf2.o) {
                tqf2.a.run();
            }
        }
        this.a.clear();
        return p45;
    }

    public final void dispose() {
        this.o = true;
    }

    public final boolean f() {
        return this.o;
    }
}
