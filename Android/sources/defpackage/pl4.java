package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pl4  reason: default package */
public final class pl4 implements ScheduledExecutorService {
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public pl4(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new rl4(new cr0((Object) this, (Object) runnable, j, (Object) timeUnit, 2));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new rl4(new ml4(this, runnable, j, j2, timeUnit, 0));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new rl4(new ml4(this, runnable, j, j2, timeUnit, 1));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new rl4(new cr0((Object) this, (Object) callable, j, (Object) timeUnit, 3));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }
}
