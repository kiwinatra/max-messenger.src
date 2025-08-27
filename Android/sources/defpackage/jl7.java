package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: jl7  reason: default package */
public final class jl7 implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final kc3 c;
    public final ScheduledExecutorService o;
    public final ScheduledFuture v;
    public final ThreadFactory w;

    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, kc3] */
    public jl7(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new Object();
        this.w = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, ml7.e);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.o = scheduledExecutorService;
        this.v = scheduledFuture;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ll7 ll7 = (ll7) it.next();
                if (ll7.c > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(ll7)) {
                    this.c.b(ll7);
                }
            }
        }
    }
}
