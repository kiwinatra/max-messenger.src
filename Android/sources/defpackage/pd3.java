package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pd3  reason: default package */
public final class pd3 extends lfd {
    public static final nd3 d;
    public static final hbd e;
    public static final int f;
    public static final od3 g;
    public final AtomicReference c;

    /* JADX WARNING: type inference failed for: r0v3, types: [c9a, od3] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f = availableProcessors;
        ? c9a = new c9a(new hbd("RxComputationShutdown"));
        g = c9a;
        c9a.dispose();
        hbd hbd = new hbd("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = hbd;
        nd3 nd3 = new nd3(0, hbd);
        d = nd3;
        for (od3 dispose : nd3.b) {
            dispose.dispose();
        }
    }

    public pd3() {
        AtomicReference atomicReference;
        nd3 nd3 = d;
        this.c = new AtomicReference(nd3);
        nd3 nd32 = new nd3(f, e);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(nd3, nd32)) {
                return;
            }
        } while (atomicReference.get() == nd3);
        for (od3 dispose : nd32.b) {
            dispose.dispose();
        }
    }

    public final jfd b() {
        return new md3(((nd3) this.c.get()).a());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mq4, j0, java.util.concurrent.Callable] */
    public final mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        od3 a = ((nd3) this.c.get()).a();
        a.getClass();
        Objects.requireNonNull(runnable, "run is null");
        ? j0Var = new j0(runnable, true);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(j0Var);
            } catch (RejectedExecutionException e2) {
                n54.D(e2);
                return p45.a;
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(j0Var, j, timeUnit);
        }
        j0Var.a(future);
        return j0Var;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mq4 e(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
        /*
            r10 = this;
            r0 = r11
            r2 = r12
            r1 = r10
            java.util.concurrent.atomic.AtomicReference r1 = r1.c
            java.lang.Object r1 = r1.get()
            nd3 r1 = (defpackage.nd3) r1
            od3 r1 = r1.a()
            r1.getClass()
            java.lang.String r4 = "run is null"
            java.util.Objects.requireNonNull(r11, r4)
            r4 = 0
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            p45 r7 = defpackage.p45.a
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.a
            if (r6 > 0) goto L_0x003f
            ii7 r6 = new ii7
            r6.<init>(r11, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            java.util.concurrent.Future r0 = r1.submit(r6)     // Catch:{ RejectedExecutionException -> 0x003a }
            goto L_0x0035
        L_0x002f:
            r8 = r16
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r6, r12, r8)     // Catch:{ RejectedExecutionException -> 0x003a }
        L_0x0035:
            r6.a(r0)     // Catch:{ RejectedExecutionException -> 0x003a }
            r7 = r6
            goto L_0x005a
        L_0x003a:
            r0 = move-exception
            defpackage.n54.D(r0)
            goto L_0x005a
        L_0x003f:
            r8 = r16
            ged r9 = new ged
            r4 = 1
            r9.<init>(r11, r4)
            r0 = r1
            r1 = r9
            r2 = r12
            r4 = r14
            r6 = r16
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r9.a(r0)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r7 = r9
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            defpackage.n54.D(r0)
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd3.e(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):mq4");
    }
}
