package defpackage;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: i0  reason: default package */
public abstract class i0 {
    public Map a;
    public int b = 1;
    public boolean c = false;
    public Object d = null;
    public Throwable e = null;
    public float f = c44.DEFAULT_ASPECT_RATIO;
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (h() != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.g.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.c     // Catch:{ all -> 0x0008 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            r3 = 0
            return r3
        L_0x0008:
            r0 = move-exception
            goto L_0x002c
        L_0x000a:
            r0 = 1
            r3.c = r0     // Catch:{ all -> 0x0008 }
            java.lang.Object r1 = r3.d     // Catch:{ all -> 0x0008 }
            r2 = 0
            r3.d = r2     // Catch:{ all -> 0x0008 }
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            if (r1 == 0) goto L_0x0018
            r3.b(r1)
        L_0x0018:
            boolean r1 = r3.h()
            if (r1 != 0) goto L_0x0021
            r3.i()
        L_0x0021:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.g     // Catch:{ all -> 0x0029 }
            r1.clear()     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.a():boolean");
    }

    public void b(Object obj) {
    }

    public final synchronized Throwable c() {
        return this.e;
    }

    public final synchronized float d() {
        return this.f;
    }

    public synchronized Object e() {
        return this.d;
    }

    public synchronized boolean f() {
        return this.d != null;
    }

    public final synchronized boolean g() {
        return this.c;
    }

    public final synchronized boolean h() {
        boolean z;
        z = true;
        if (this.b == 1) {
            z = false;
        }
        return z;
    }

    public final void i() {
        boolean z;
        synchronized (this) {
            z = this.b == 3;
        }
        boolean n = n();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new h0(this, z, (r74) pair.first, n));
        }
    }

    public final boolean j(Throwable th, Map map) {
        boolean z;
        synchronized (this) {
            if (!this.c) {
                z = true;
                if (this.b == 1) {
                    this.b = 3;
                    this.e = th;
                    this.a = map;
                }
            }
            z = false;
        }
        if (z) {
            i();
        }
        return z;
    }

    public final boolean k(float f2) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.c) {
                if (this.b == 1) {
                    if (f2 >= this.f) {
                        this.f = f2;
                        z = true;
                    }
                }
            }
        }
        if (z) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new uj6((Object) this, (Object) (r74) pair.first, false, 1));
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        if (r3 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0037, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0038, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x003a, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x003d, code lost:
        return r1;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0031=Splitter:B:27:0x0031, B:21:0x0026=Splitter:B:21:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(java.lang.Object r3, boolean r4, java.util.Map r5) {
        /*
            r2 = this;
            r2.a = r5
            r5 = 0
            monitor-enter(r2)     // Catch:{ all -> 0x0040 }
            boolean r0 = r2.c     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0031
            int r0 = r2.b     // Catch:{ all -> 0x0018 }
            r1 = 1
            if (r0 == r1) goto L_0x000e
            goto L_0x0031
        L_0x000e:
            if (r4 == 0) goto L_0x001a
            r4 = 2
            r2.b = r4     // Catch:{ all -> 0x0018 }
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f = r4     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x003e
        L_0x001a:
            java.lang.Object r4 = r2.d     // Catch:{ all -> 0x0018 }
            if (r4 == r3) goto L_0x0025
            r2.d = r3     // Catch:{ all -> 0x0022 }
            r3 = r4
            goto L_0x0026
        L_0x0022:
            r3 = move-exception
            r5 = r4
            goto L_0x003e
        L_0x0025:
            r3 = r5
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0038
            r2.b(r3)
            goto L_0x0038
        L_0x002d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L_0x003e
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0037
            r2.b(r3)
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r2.i()
        L_0x003d:
            return r1
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r3 = move-exception
            if (r5 == 0) goto L_0x0046
            r2.b(r5)
        L_0x0046:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.l(java.lang.Object, boolean, java.util.Map):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        if (r4.b != 3) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        r6.execute(new defpackage.h0(r4, r1, r5, n()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.r74 r5, java.util.concurrent.Executor r6) {
        /*
            r4 = this;
            r6.getClass()
            monitor-enter(r4)
            boolean r0 = r4.c     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x004e
        L_0x000c:
            int r0 = r4.b     // Catch:{ all -> 0x000a }
            r1 = 1
            if (r0 != r1) goto L_0x001a
            java.util.concurrent.ConcurrentLinkedQueue r0 = r4.g     // Catch:{ all -> 0x000a }
            android.util.Pair r2 = android.util.Pair.create(r5, r6)     // Catch:{ all -> 0x000a }
            r0.add(r2)     // Catch:{ all -> 0x000a }
        L_0x001a:
            boolean r0 = r4.f()     // Catch:{ all -> 0x000a }
            r2 = 0
            if (r0 != 0) goto L_0x0030
            boolean r0 = r4.h()     // Catch:{ all -> 0x000a }
            if (r0 != 0) goto L_0x0030
            boolean r0 = r4.n()     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x004d
            monitor-enter(r4)
            int r0 = r4.b     // Catch:{ all -> 0x004a }
            r3 = 3
            if (r0 != r3) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            monitor-exit(r4)
            boolean r0 = r4.n()
            h0 r2 = new h0
            r2.<init>(r4, r1, r5, r0)
            r6.execute(r2)
            goto L_0x004d
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            throw r5
        L_0x004d:
            return
        L_0x004e:
            monitor-exit(r4)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.m(r74, java.util.concurrent.Executor):void");
    }

    public final synchronized boolean n() {
        return g() && !h();
    }
}
