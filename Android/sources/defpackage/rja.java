package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rja  reason: default package */
public final class rja extends AtomicBoolean implements cla, mq4 {
    public final cla a;
    public final sja b;
    public final qja c;
    public mq4 o;

    public rja(cla cla, sja sja, qja qja) {
        this.a = cla;
        this.b = sja;
        this.c = qja;
    }

    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.D(this.c);
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.o, mq4)) {
            this.o = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        this.a.d(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r5 = this;
            mq4 r0 = r5.o
            r0.dispose()
            r0 = 0
            r1 = 1
            boolean r0 = r5.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0038
            sja r0 = r5.b
            qja r5 = r5.c
            monitor-enter(r0)
            qja r1 = r0.c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0034
            if (r1 == r5) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            long r1 = r5.b     // Catch:{ all -> 0x0030 }
            r3 = 1
            long r1 = r1 - r3
            r5.b = r1     // Catch:{ all -> 0x0030 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            boolean r1 = r5.c     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            r0.E(r5)     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r5 = move-exception
            goto L_0x0036
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rja.dispose():void");
    }

    public final boolean f() {
        return this.o.f();
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.D(this.c);
            this.a.onError(th);
            return;
        }
        n54.D(th);
    }
}
