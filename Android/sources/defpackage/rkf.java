package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: rkf  reason: default package */
public final class rkf {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public rkf(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long c(long j) {
        long j2;
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            try {
                long j3 = this.c;
                if (j3 != -9223372036854775807L) {
                    long j4 = (j3 * 90000) / 1000000;
                    long j5 = j4 / 8589934592L;
                    long j6 = (j5 * 8589934592L) + j;
                    j2 = ((j5 + 1) * 8589934592L) + j;
                    if (j6 >= j4) {
                        j2 = j6;
                    }
                } else {
                    j2 = j;
                }
                long a2 = a((j2 * 1000000) / 90000);
                return a2;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean e() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == LongCompanionObject.MAX_VALUE ? 0 : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g(long r10, long r12, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.a     // Catch:{ all -> 0x0028 }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            defpackage.n79.n(r0)     // Catch:{ all -> 0x0028 }
            boolean r0 = r9.e()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r9)
            return
        L_0x001c:
            if (r14 == 0) goto L_0x002a
            java.lang.ThreadLocal r12 = r9.d     // Catch:{ all -> 0x0028 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0028 }
            r12.set(r10)     // Catch:{ all -> 0x0028 }
            goto L_0x007d
        L_0x0028:
            r10 = move-exception
            goto L_0x007f
        L_0x002a:
            r10 = 0
            r5 = r10
            r3 = r12
        L_0x002e:
            boolean r14 = r9.e()     // Catch:{ all -> 0x0028 }
            if (r14 != 0) goto L_0x007d
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x003c
            r9.wait()     // Catch:{ all -> 0x0028 }
            goto L_0x002e
        L_0x003c:
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0042
            r14 = r2
            goto L_0x0043
        L_0x0042:
            r14 = r1
        L_0x0043:
            defpackage.n79.n(r14)     // Catch:{ all -> 0x0028 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0028 }
            r9.wait(r3)     // Catch:{ all -> 0x0028 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0028 }
            long r3 = r3 - r7
            long r5 = r5 + r3
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x007a
            boolean r14 = r9.e()     // Catch:{ all -> 0x0028 }
            if (r14 == 0) goto L_0x005e
            goto L_0x007a
        L_0x005e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r10.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r11 = "TimestampAdjuster failed to initialize in "
            r10.append(r11)     // Catch:{ all -> 0x0028 }
            r10.append(r12)     // Catch:{ all -> 0x0028 }
            java.lang.String r11 = " milliseconds"
            r10.append(r11)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0028 }
            java.util.concurrent.TimeoutException r11 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0028 }
            r11.<init>(r10)     // Catch:{ all -> 0x0028 }
            throw r11     // Catch:{ all -> 0x0028 }
        L_0x007a:
            long r3 = r12 - r5
            goto L_0x002e
        L_0x007d:
            monitor-exit(r9)
            return
        L_0x007f:
            monitor-exit(r9)     // Catch:{ all -> 0x0028 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkf.g(long, long, boolean):void");
    }
}
