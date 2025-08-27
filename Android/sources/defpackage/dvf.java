package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dvf  reason: default package */
public final class dvf extends AbstractExecutorService implements ScheduledExecutorService {
    public static dvf b;
    public final Handler a;

    public dvf(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.post(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.a.getLooper().getThread()) {
            runnable.run();
        } else {
            a(runnable);
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new jed(runnable, obj);
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        jed jed = new jed(runnable, (Object) null);
        this.a.postDelayed(jed, timeUnit.toMillis(j));
        return jed;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        runnable.getClass();
        jed jed = new jed(runnable, (Object) null);
        execute(jed);
        return jed;
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new jed(callable);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        jed jed = new jed(callable);
        this.a.postDelayed(jed, timeUnit.toMillis(j));
        return jed;
    }

    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        jed jed = new jed(runnable, obj);
        execute(jed);
        return jed;
    }

    public final Future submit(Callable callable) {
        callable.getClass();
        jed jed = new jed(callable);
        execute(jed);
        return jed;
    }
}
