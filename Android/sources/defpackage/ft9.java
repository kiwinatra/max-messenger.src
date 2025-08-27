package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ft9  reason: default package */
public final class ft9 extends ct9 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public ft9(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        itf itf = new itf(callable);
        return new dt9(itf, this.b.schedule(itf, j, timeUnit));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        et9 et9 = new et9(runnable);
        return new dt9(et9, this.b.scheduleAtFixedRate(et9, j, j2, timeUnit));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        et9 et9 = new et9(runnable);
        return new dt9(et9, this.b.scheduleWithFixedDelay(et9, j, j2, timeUnit));
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        itf itf = new itf(Executors.callable(runnable, (Object) null));
        return new dt9(itf, this.b.schedule(itf, j, timeUnit));
    }
}
