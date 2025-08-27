package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ml7  reason: default package */
public final class ml7 extends lfd {
    public static final hbd d;
    public static final hbd e;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
    public static final TimeUnit g = TimeUnit.SECONDS;
    public static final ll7 h;
    public static final boolean i = Boolean.getBoolean("rx3.io-scheduled-release");
    public static final jl7 j;
    public final AtomicReference c;

    static {
        ll7 ll7 = new ll7(new hbd("RxCachedThreadSchedulerShutdown"));
        h = ll7;
        ll7.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        hbd hbd = new hbd("RxCachedThreadScheduler", max, false);
        d = hbd;
        e = new hbd("RxCachedWorkerPoolEvictor", max, false);
        jl7 jl7 = new jl7(0, (TimeUnit) null, hbd);
        j = jl7;
        jl7.c.dispose();
        ScheduledFuture scheduledFuture = jl7.v;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = jl7.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public ml7() {
        AtomicReference atomicReference;
        jl7 jl7 = j;
        this.c = new AtomicReference(jl7);
        jl7 jl72 = new jl7(f, g, d);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(jl7, jl72)) {
                return;
            }
        } while (atomicReference.get() == jl7);
        jl72.c.dispose();
        ScheduledFuture scheduledFuture = jl72.v;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = jl72.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final jfd b() {
        return new kl7((jl7) this.c.get());
    }
}
