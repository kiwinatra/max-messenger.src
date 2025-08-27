package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ied  reason: default package */
public final class ied extends la5 implements ScheduledExecutorService {
    public final ScheduledExecutorService Y;

    public ied(ScheduledExecutorService scheduledExecutorService, zta zta, iz1 iz1) {
        super(scheduledExecutorService, zta, iz1);
        this.Y = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.Y.schedule(i(runnable, b()), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.Y.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.Y.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.Y.schedule(h(callable, b()), j, timeUnit);
    }
}
