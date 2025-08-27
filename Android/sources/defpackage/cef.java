package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import kotlin.Unit;

/* renamed from: cef  reason: default package */
public final class cef {
    public boolean a;
    public mdf b;
    public final ArrayList c = new ArrayList();
    public boolean d;
    public final fef e;
    public final String f;

    public cef(fef fef, String str) {
        this.e = fef;
        this.f = str;
    }

    public final void a() {
        byte[] bArr = u0g.a;
        synchronized (this.e) {
            try {
                if (b()) {
                    this.e.e(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        mdf mdf = this.b;
        if (mdf != null && mdf.d) {
            this.d = true;
        }
        ArrayList arrayList = this.c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((mdf) arrayList.get(size)).d) {
                mdf mdf2 = (mdf) arrayList.get(size);
                if (fef.i.isLoggable(Level.FINE)) {
                    cjf.c(mdf2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.mdf r3, long r4) {
        /*
            r2 = this;
            fef r0 = r2.e
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0038
            boolean r4 = r3.d     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0021
            fef r4 = defpackage.fef.h     // Catch:{ all -> 0x001d }
            java.util.logging.Logger r4 = defpackage.fef.i     // Catch:{ all -> 0x001d }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x001d }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            defpackage.cjf.c(r3, r2, r4)     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r2 = move-exception
            goto L_0x0048
        L_0x001f:
            monitor-exit(r0)
            return
        L_0x0021:
            fef r4 = defpackage.fef.h     // Catch:{ all -> 0x001d }
            java.util.logging.Logger r4 = defpackage.fef.i     // Catch:{ all -> 0x001d }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x001d }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0032
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            defpackage.cjf.c(r3, r2, r4)     // Catch:{ all -> 0x001d }
        L_0x0032:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x001d }
            r2.<init>()     // Catch:{ all -> 0x001d }
            throw r2     // Catch:{ all -> 0x001d }
        L_0x0038:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0044
            fef r3 = r2.e     // Catch:{ all -> 0x001d }
            r3.e(r2)     // Catch:{ all -> 0x001d }
        L_0x0044:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return
        L_0x0048:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.c(mdf, long):void");
    }

    public final boolean d(mdf mdf, long j, boolean z) {
        cef cef = mdf.a;
        if (cef != this) {
            if (cef == null) {
                mdf.a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.e.g.getClass();
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.c;
        int indexOf = arrayList.indexOf(mdf);
        if (indexOf != -1) {
            if (mdf.b <= j2) {
                if (fef.i.isLoggable(Level.FINE)) {
                    cjf.c(mdf, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        mdf.b = j2;
        if (fef.i.isLoggable(Level.FINE)) {
            cjf.c(mdf, this, z ? "run again after ".concat(cjf.v(j2 - nanoTime)) : "scheduled after ".concat(cjf.v(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((mdf) it.next()).b - nanoTime > j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, mdf);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = u0g.a;
        synchronized (this.e) {
            try {
                this.a = true;
                if (b()) {
                    this.e.e(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f;
    }
}
