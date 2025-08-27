package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dt9  reason: default package */
public final class dt9 extends kr7 implements ScheduledFuture, zz7, Future {
    public final zz7 Z;
    public final ScheduledFuture v0;

    public dt9(n1 n1Var, ScheduledFuture scheduledFuture) {
        super(11);
        this.Z = n1Var;
        this.v0 = scheduledFuture;
    }

    public final boolean T(boolean z) {
        return this.Z.cancel(z);
    }

    public final boolean cancel(boolean z) {
        boolean T = T(z);
        if (T) {
            this.v0.cancel(z);
        }
        return T;
    }

    public final int compareTo(Object obj) {
        return this.v0.compareTo((Delayed) obj);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.Z.d(runnable, executor);
    }

    public final Object get() {
        return this.Z.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.v0.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.Z.isCancelled();
    }

    public final boolean isDone() {
        return this.Z.isDone();
    }

    public final Object q() {
        return this.Z;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.Z.get(j, timeUnit);
    }
}
