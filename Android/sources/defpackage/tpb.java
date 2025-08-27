package defpackage;

import android.os.Looper;

/* renamed from: tpb  reason: default package */
public final class tpb {
    public final rpb a;
    public final ed5 b;
    public final b7f c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public tpb(ed5 ed5, rpb rpb, ikf ikf, int i2, b7f b7f, Looper looper) {
        this.b = ed5;
        this.a = rpb;
        this.f = looper;
        this.c = b7f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[SYNTHETIC, Splitter:B:17:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.g     // Catch:{ all -> 0x0040 }
            defpackage.y64.j(r0)     // Catch:{ all -> 0x0040 }
            android.os.Looper r0 = r5.f     // Catch:{ all -> 0x0040 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0040 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            defpackage.y64.j(r0)     // Catch:{ all -> 0x0040 }
            b7f r0 = r5.c     // Catch:{ all -> 0x0040 }
            r0.getClass()     // Catch:{ all -> 0x0040 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r0 = r0 + r6
        L_0x0022:
            boolean r2 = r5.i     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0042
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0042
            b7f r2 = r5.c     // Catch:{ all -> 0x0040 }
            r2.getClass()     // Catch:{ all -> 0x0040 }
            r5.wait(r6)     // Catch:{ all -> 0x0040 }
            b7f r6 = r5.c     // Catch:{ all -> 0x0040 }
            r6.getClass()     // Catch:{ all -> 0x0040 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r6 = r0 - r6
            goto L_0x0022
        L_0x0040:
            r6 = move-exception
            goto L_0x004e
        L_0x0042:
            if (r2 == 0) goto L_0x0046
            monitor-exit(r5)
            return
        L_0x0046:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0040 }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x0040 }
            throw r6     // Catch:{ all -> 0x0040 }
        L_0x004e:
            monitor-exit(r5)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpb.a(long):void");
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        y64.j(!this.g);
        this.g = true;
        ed5 ed5 = this.b;
        synchronized (ed5) {
            if (!ed5.H0) {
                if (ed5.z.isAlive()) {
                    ed5.y.a(14, this).b();
                    return;
                }
            }
            b(false);
        }
    }
}
