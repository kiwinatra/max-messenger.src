package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* renamed from: ef4  reason: default package */
public final class ef4 extends z85 implements Runnable {
    public static final long X;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ef4 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [ef4, z85, a95] */
    static {
        Long l;
        ? z85 = new z85();
        z = z85;
        z85.w0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        X = timeUnit.toNanos(l.longValue());
    }

    public final void A0(long j, x85 x85) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void B0(Runnable runnable) {
        if (debugStatus != 4) {
            super.B0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void G0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            z85.w.set(this, (Object) null);
            z85.x.set(this, (Object) null);
            notifyAll();
        }
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= DurationKt.MAX_MILLIS) {
            return jaa.a;
        }
        long nanoTime = System.nanoTime();
        w85 w85 = new w85(j2 + nanoTime, runnable);
        F0(nanoTime, w85);
        return w85;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        _thread = null;
        G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (E0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r7 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        r9 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        java.lang.Thread.interrupted();
        r11 = y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r11 != r7) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r15 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r9 != r7) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        r9 = X + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r6 = r9 - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r6 > 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        _thread = null;
        G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (E0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r11 = kotlin.ranges.RangesKt.coerceAtMost(r11, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        r9 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        if (r11 <= 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        r6 = debugStatus;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        if (r6 == 2) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        if (r6 != 3) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        if (r6 == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        _thread = null;
        G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0088, code lost:
        if (E0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008a, code lost:
        v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
        r7 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = defpackage.lif.a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch:{ all -> 0x004e }
            int r0 = debugStatus     // Catch:{ all -> 0x0098 }
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r5) goto L_0x0016
            if (r0 != r4) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r3
            goto L_0x0017
        L_0x0016:
            r0 = r6
        L_0x0017:
            if (r0 == 0) goto L_0x0029
            monitor-exit(r17)     // Catch:{ all -> 0x004e }
            _thread = r2
            r17.G0()
            boolean r0 = r17.E0()
            if (r0 != 0) goto L_0x0028
            r17.v0()
        L_0x0028:
            return
        L_0x0029:
            debugStatus = r6     // Catch:{ all -> 0x0098 }
            r17.notifyAll()     // Catch:{ all -> 0x0098 }
            monitor-exit(r17)     // Catch:{ all -> 0x004e }
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L_0x0035:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x004e }
            long r11 = r17.y0()     // Catch:{ all -> 0x004e }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L_0x006a
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004e }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            long r9 = X     // Catch:{ all -> 0x004e }
            long r9 = r9 + r15
            goto L_0x0050
        L_0x004e:
            r0 = move-exception
            goto L_0x009b
        L_0x0050:
            long r6 = r9 - r15
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0065
            _thread = r2
            r17.G0()
            boolean r0 = r17.E0()
            if (r0 != 0) goto L_0x0064
            r17.v0()
        L_0x0064:
            return
        L_0x0065:
            long r11 = kotlin.ranges.RangesKt.coerceAtMost((long) r11, (long) r6)     // Catch:{ all -> 0x004e }
            goto L_0x006f
        L_0x006a:
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x006f:
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0091
            int r6 = debugStatus     // Catch:{ all -> 0x004e }
            if (r6 == r5) goto L_0x007c
            if (r6 != r4) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r6 = r3
            goto L_0x007d
        L_0x007c:
            r6 = 1
        L_0x007d:
            if (r6 == 0) goto L_0x008e
            _thread = r2
            r17.G0()
            boolean r0 = r17.E0()
            if (r0 != 0) goto L_0x008d
            r17.v0()
        L_0x008d:
            return
        L_0x008e:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch:{ all -> 0x004e }
        L_0x0091:
            r6 = 1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0035
        L_0x0098:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x009b:
            _thread = r2
            r17.G0()
            boolean r2 = r17.E0()
            if (r2 != 0) goto L_0x00a9
            r17.v0()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef4.run():void");
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final String toString() {
        return "DefaultExecutor";
    }

    public final Thread v0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(z.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
