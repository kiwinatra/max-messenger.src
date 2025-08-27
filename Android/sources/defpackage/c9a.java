package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: c9a  reason: default package */
public class c9a extends jfd {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;

    public c9a(ThreadFactory threadFactory) {
        boolean z = rfd.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(rfd.a);
        this.a = scheduledThreadPoolExecutor;
    }

    public final mq4 a(Runnable runnable) {
        return b(runnable, 0, (TimeUnit) null);
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? p45.a : d(runnable, j, timeUnit, (nq4) null);
    }

    public final oed d(Runnable runnable, long j, TimeUnit timeUnit, nq4 nq4) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        oed oed = new oed(runnable, nq4);
        if (nq4 != null && !nq4.a(oed)) {
            return oed;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(oed);
            } catch (RejectedExecutionException e) {
                if (nq4 != null) {
                    nq4.b(oed);
                }
                n54.D(e);
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(oed, j, timeUnit);
        }
        oed.a(future);
        return oed;
    }

    public final void dispose() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    public final boolean f() {
        return this.b;
    }
}
