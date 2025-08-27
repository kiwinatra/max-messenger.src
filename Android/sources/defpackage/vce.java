package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: vce  reason: default package */
public final class vce extends jfd {
    public final ScheduledExecutorService a;
    public final kc3 b = new Object();
    public volatile boolean c;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, kc3] */
    public vce(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        boolean z = this.c;
        p45 p45 = p45.a;
        if (z) {
            return p45;
        }
        Objects.requireNonNull(runnable, "run is null");
        oed oed = new oed(runnable, this.b);
        this.b.a(oed);
        if (j <= 0) {
            try {
                future = this.a.submit(oed);
            } catch (RejectedExecutionException e) {
                dispose();
                n54.D(e);
                return p45;
            }
        } else {
            future = this.a.schedule(oed, j, timeUnit);
        }
        oed.a(future);
        return oed;
    }

    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.b.dispose();
        }
    }

    public final boolean f() {
        return this.c;
    }
}
