package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x85  reason: default package */
public abstract class x85 implements Runnable, Comparable, pq4 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public x85(long j) {
        this.a = j;
    }

    public final oif b() {
        Object obj = this._heap;
        if (obj instanceof oif) {
            return (oif) obj;
        }
        return null;
    }

    public final int c(long j, y85 y85, z85 z85) {
        synchronized (this) {
            if (this._heap == ryg.c) {
                return 2;
            }
            synchronized (y85) {
                try {
                    x85[] x85Arr = y85.a;
                    x85 x85 = x85Arr != null ? x85Arr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z85.w;
                    z85.getClass();
                    if (z85.y.get(z85) != 0) {
                        return 1;
                    }
                    if (x85 == null) {
                        y85.c = j;
                    } else {
                        long j2 = x85.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - y85.c > 0) {
                            y85.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = y85.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    y85.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        int i = ((this.a - ((x85) obj).a) > 0 ? 1 : ((this.a - ((x85) obj).a) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public final void d(y85 y85) {
        if (this._heap != ryg.c) {
            this._heap = y85;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3._heap     // Catch:{ all -> 0x0010 }
            bpa r1 = defpackage.ryg.c     // Catch:{ all -> 0x0010 }
            if (r0 != r1) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            boolean r2 = r0 instanceof defpackage.y85     // Catch:{ all -> 0x0010 }
            if (r2 == 0) goto L_0x0012
            y85 r0 = (defpackage.y85) r0     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r0 = move-exception
            goto L_0x002d
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0027
            monitor-enter(r0)     // Catch:{ all -> 0x0010 }
            oif r2 = r3.b()     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            int r2 = r3.b     // Catch:{ all -> 0x0024 }
            r0.b(r2)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x0027:
            r3._heap = r1     // Catch:{ all -> 0x0010 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0010 }
            monitor-exit(r3)
            return
        L_0x002d:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x85.dispose():void");
    }

    public String toString() {
        return i2a.j(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
