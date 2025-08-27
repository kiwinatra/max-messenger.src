package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

/* renamed from: ol4  reason: default package */
public final class ol4 implements ScheduledExecutorService, ExecutorService {
    public final ExecutorService a;
    public final Lazy b;

    public ol4(ExecutorService executorService, Lazy lazy) {
        this.a = executorService;
        this.b = lazy;
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

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        gya gya = new gya(callable, this.a);
        gya.y = ((ScheduledExecutorService) this.b.getValue()).schedule(new fya(gya, 1), j, timeUnit);
        return gya;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gya gya = new gya(Executors.callable(runnable), this.a);
        gya.y = ((ScheduledExecutorService) this.b.getValue()).scheduleWithFixedDelay(new fya(gya, 0), j, j2, timeUnit);
        return gya;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gya gya = new gya(Executors.callable(runnable), this.a);
        gya.y = ((ScheduledExecutorService) this.b.getValue()).scheduleWithFixedDelay(new fya(gya, 0), j, j2, timeUnit);
        return gya;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        gya gya = new gya(Executors.callable(runnable), this.a);
        gya.y = ((ScheduledExecutorService) this.b.getValue()).schedule(new fya(gya, 1), j, timeUnit);
        return gya;
    }
}
