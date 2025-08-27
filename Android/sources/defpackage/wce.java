package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wce  reason: default package */
public final class wce extends lfd {
    public static final hbd d = new hbd("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public wce() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z = rfd.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(rfd.a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    public final jfd b() {
        return new vce((ScheduledExecutorService) this.c.get());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mq4, j0, java.util.concurrent.Callable] */
    public final mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        ? j0Var = new j0(runnable, true);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        AtomicReference atomicReference = this.c;
        if (i <= 0) {
            try {
                future = ((ScheduledExecutorService) atomicReference.get()).submit(j0Var);
            } catch (RejectedExecutionException e2) {
                n54.D(e2);
                return p45.a;
            }
        } else {
            future = ((ScheduledExecutorService) atomicReference.get()).schedule(j0Var, j, timeUnit);
        }
        j0Var.a(future);
        return j0Var;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mq4 e(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
        /*
            r10 = this;
            r0 = r11
            r2 = r12
            java.lang.String r1 = "run is null"
            java.util.Objects.requireNonNull(r11, r1)
            r4 = 0
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            p45 r7 = defpackage.p45.a
            r6 = r10
            java.util.concurrent.atomic.AtomicReference r6 = r6.c
            if (r1 > 0) goto L_0x0036
            java.lang.Object r1 = r6.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            ii7 r6 = new ii7
            r6.<init>(r11, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            java.util.concurrent.Future r0 = r1.submit(r6)     // Catch:{ RejectedExecutionException -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r0 = move-exception
            goto L_0x0032
        L_0x0028:
            r8 = r16
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r6, r12, r8)     // Catch:{ RejectedExecutionException -> 0x0026 }
        L_0x002e:
            r6.a(r0)     // Catch:{ RejectedExecutionException -> 0x0026 }
            return r6
        L_0x0032:
            defpackage.n54.D(r0)
            return r7
        L_0x0036:
            r8 = r16
            ged r9 = new ged
            r1 = 1
            r9.<init>(r11, r1)
            java.lang.Object r0 = r6.get()     // Catch:{ RejectedExecutionException -> 0x0051 }
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch:{ RejectedExecutionException -> 0x0051 }
            r1 = r9
            r2 = r12
            r4 = r14
            r6 = r16
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch:{ RejectedExecutionException -> 0x0051 }
            r9.a(r0)     // Catch:{ RejectedExecutionException -> 0x0051 }
            return r9
        L_0x0051:
            r0 = move-exception
            defpackage.n54.D(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wce.e(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):mq4");
    }
}
