package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gya  reason: default package */
public final class gya implements ScheduledFuture {
    public final Callable a;
    public final ExecutorService b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final CountDownLatch v = new CountDownLatch(1);
    public volatile Object w;
    public final AtomicReference x = new AtomicReference((Object) null);
    public ScheduledFuture y;

    public gya(Callable callable, ExecutorService executorService) {
        this.a = callable;
        this.b = executorService;
    }

    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.o;
        if (atomicBoolean.get()) {
            return false;
        }
        AtomicBoolean atomicBoolean2 = this.c;
        if (atomicBoolean2.get()) {
            return false;
        }
        atomicBoolean2.set(true);
        atomicBoolean.set(true);
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        scheduledFuture.cancel(z);
        this.v.countDown();
        return true;
    }

    public final int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.compareTo(delayed);
    }

    public final Object get() {
        if (!this.o.get()) {
            this.v.await();
        }
        Exception exc = (Exception) this.x.get();
        if (exc != null) {
            ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
            if (executionException == null) {
                executionException = new ExecutionException(exc);
            }
            throw executionException;
        } else if (!this.c.get()) {
            return this.w;
        } else {
            throw new CancellationException("Future is cancelled");
        }
    }

    public final long getDelay(TimeUnit timeUnit) {
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.c.get();
    }

    public final boolean isDone() {
        return this.o.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.o.get() || this.v.await(j, timeUnit)) {
            Exception exc = (Exception) this.x.get();
            if (exc == null) {
                return this.w;
            }
            ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
            if (executionException == null) {
                executionException = new ExecutionException(exc);
            }
            throw executionException;
        }
        throw new TimeoutException("No result for " + j + " " + timeUnit);
    }
}
