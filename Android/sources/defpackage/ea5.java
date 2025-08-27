package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ea5  reason: default package */
public final class ea5 extends lfd {
    public final boolean c;
    public final boolean d = false;
    public final Executor e;

    public ea5(Executor executor, boolean z) {
        this.e = executor;
        this.c = z;
    }

    public final jfd b() {
        return new ca5(this.e, this.c, this.d);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [mq4, j0, java.util.concurrent.Callable] */
    public final mq4 c(Runnable runnable) {
        Executor executor = this.e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                ? j0Var = new j0(runnable, z2);
                j0Var.a(((ExecutorService) executor).submit(j0Var));
                return j0Var;
            } else if (z2) {
                ba5 ba5 = new ba5(runnable, (nq4) null);
                executor.execute(ba5);
                return ba5;
            } else {
                aa5 aa5 = new aa5(runnable);
                executor.execute(aa5);
                return aa5;
            }
        } catch (RejectedExecutionException e2) {
            n54.D(e2);
            return p45.a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [mq4, j0, java.util.concurrent.Callable] */
    public final mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.e;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ? j0Var = new j0(runnable, this.c);
                j0Var.a(((ScheduledExecutorService) executor).schedule(j0Var, j, timeUnit));
                return j0Var;
            } catch (RejectedExecutionException e2) {
                n54.D(e2);
                return p45.a;
            }
        } else {
            z95 z95 = new z95(runnable);
            mq4 d2 = da5.a.d(new uj6((Object) this, (Object) z95, false, 6), j, timeUnit);
            mw1 mw1 = z95.a;
            mw1.getClass();
            qq4.c(mw1, d2);
            return z95;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mq4 e(java.lang.Runnable r10, long r11, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r9 = this;
            java.util.concurrent.Executor r0 = r9.e
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = "run is null"
            java.util.Objects.requireNonNull(r10, r1)
            ged r1 = new ged     // Catch:{ RejectedExecutionException -> 0x0021 }
            boolean r9 = r9.c     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.<init>(r10, r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r2 = r0
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2     // Catch:{ RejectedExecutionException -> 0x0021 }
            r3 = r1
            r4 = r11
            r6 = r13
            r8 = r15
            java.util.concurrent.ScheduledFuture r9 = r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.a(r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            return r1
        L_0x0021:
            r9 = move-exception
            defpackage.n54.D(r9)
            p45 r9 = defpackage.p45.a
            return r9
        L_0x0028:
            mq4 r9 = super.e(r10, r11, r13, r15)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea5.e(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):mq4");
    }
}
