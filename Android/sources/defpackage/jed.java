package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jed  reason: default package */
public final class jed implements RunnableFuture, ScheduledFuture {
    public final FutureTask a;

    public jed(Callable callable) {
        this.a = new FutureTask(callable);
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        throw new UnsupportedOperationException();
    }

    public final Object get() {
        return this.a.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final void run() {
        this.a.run();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public jed(Runnable runnable, Object obj) {
        this.a = new FutureTask(runnable, obj);
    }
}
