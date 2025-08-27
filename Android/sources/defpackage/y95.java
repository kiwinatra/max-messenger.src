package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: y95  reason: default package */
public final class y95 extends x95 implements vk4 {
    public final Executor b;

    public y95(Executor executor) {
        this.b = executor;
        Method method = zd3.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = zd3.a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                kv0.n(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new oq4(scheduledFuture) : ef4.z.U(j, runnable, coroutineContext);
    }

    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y95) && ((y95) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    public final void o(long j, lw1 lw1) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new vj6(17, (Object) this, (Object) lw1), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                kv0.n(lw1.v, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            cvg.z(lw1, new aw1(0, scheduledFuture));
        } else {
            ef4.z.o(j, lw1);
        }
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            kv0.n(coroutineContext, cancellationException);
            dq4.c.p0(coroutineContext, runnable);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
