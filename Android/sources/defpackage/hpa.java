package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import one.me.rlottie.RLottie;

/* renamed from: hpa  reason: default package */
public final class hpa implements RLottie.WorkQueue {
    public final Lazy a;

    public hpa(q4 q4Var) {
        this.a = q4Var.h(aua.class);
    }

    public final void post(Runnable runnable) {
        ((aua) this.a.getValue()).c().submit(runnable);
    }

    public final void post(Runnable runnable, long j) {
        ((ScheduledExecutorService) ((aua) this.a.getValue()).m.getValue()).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
