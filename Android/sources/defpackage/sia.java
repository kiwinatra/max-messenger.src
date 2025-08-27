package defpackage;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sia  reason: default package */
public final class sia extends AtomicInteger implements mq4, cla {
    public static final ria[] y0 = new ria[0];
    public static final ria[] z0 = new ria[0];
    public final AtomicReference X;
    public mq4 Y;
    public long Z;
    public final cla a;
    public final zi6 b;
    public final boolean c;
    public final int o;
    public final int v;
    public int v0;
    public volatile ebe w;
    public final ArrayDeque w0;
    public volatile boolean x;
    public int x0;
    public final fz y = new AtomicReference();
    public volatile boolean z;

    /* JADX WARNING: type inference failed for: r0v0, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public sia(cla cla, zi6 zi6, int i, int i2) {
        this.a = cla;
        this.b = zi6;
        this.c = false;
        this.o = i;
        this.v = i2;
        if (i != Integer.MAX_VALUE) {
            this.w0 = new ArrayDeque(i);
        }
        this.X = new AtomicReference(y0);
    }

    public final boolean a() {
        if (this.z) {
            return true;
        }
        Throwable th = (Throwable) this.y.get();
        if (this.c || th == null) {
            return false;
        }
        e();
        this.y.d(this.a);
        return true;
    }

    public final void b() {
        if (!this.x) {
            this.x = true;
            g();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.Y, mq4)) {
            this.Y = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.x) {
            try {
                Object apply = this.b.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                oka oka = (oka) apply;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.x0;
                            if (i == this.o) {
                                this.w0.offer(oka);
                                return;
                            }
                            this.x0 = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                j(oka);
            } catch (Throwable th2) {
                hd8.Z(th2);
                this.Y.dispose();
                onError(th2);
            }
        }
    }

    public final void dispose() {
        this.z = true;
        if (e()) {
            this.y.b();
        }
    }

    public final boolean e() {
        this.Y.dispose();
        AtomicReference atomicReference = this.X;
        ria[] riaArr = z0;
        ria[] riaArr2 = (ria[]) atomicReference.getAndSet(riaArr);
        if (riaArr2 == riaArr) {
            return false;
        }
        for (ria ria : riaArr2) {
            ria.getClass();
            qq4.a(ria);
        }
        return true;
    }

    public final boolean f() {
        return this.z;
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    public final void h() {
        int i;
        cla cla = this.a;
        int i2 = 1;
        while (!a()) {
            ebe ebe = this.w;
            int i3 = 0;
            if (ebe != null) {
                while (!a()) {
                    Object poll = ebe.poll();
                    if (poll != null) {
                        cla.d(poll);
                        i3++;
                    }
                }
                return;
            }
            if (i3 == 0) {
                boolean z2 = this.x;
                ebe ebe2 = this.w;
                ria[] riaArr = (ria[]) this.X.get();
                int length = riaArr.length;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.w0.size();
                    }
                } else {
                    i = 0;
                }
                if (!z2 || !((ebe2 == null || ebe2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        int min = Math.min(length - 1, this.v0);
                        int i4 = 0;
                        while (i4 < length) {
                            if (!a()) {
                                ria ria = riaArr[min];
                                gbe gbe = ria.c;
                                if (gbe != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = gbe.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            cla.d(poll2);
                                            if (a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            hd8.Z(th);
                                            qq4.a(ria);
                                            this.y.a(th);
                                            if (!a()) {
                                                i(ria);
                                                i3++;
                                                min++;
                                                if (min != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z3 = ria.b;
                                gbe gbe2 = ria.c;
                                if (z3 && (gbe2 == null || gbe2.isEmpty())) {
                                    i(ria);
                                    i3++;
                                }
                                min++;
                                if (min != length) {
                                    i4++;
                                }
                                min = 0;
                                i4++;
                            } else {
                                return;
                            }
                        }
                        this.v0 = min;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.o != Integer.MAX_VALUE) {
                        k(i3);
                    }
                } else {
                    this.y.d(this.a);
                    return;
                }
            } else if (this.o != Integer.MAX_VALUE) {
                k(i3);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ria[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ria} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.ria r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.X
            java.lang.Object r1 = r0.get()
            ria[] r1 = (defpackage.ria[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x000b:
            if (r4 >= r2) goto L_0x0015
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0015:
            r4 = -1
        L_0x0016:
            if (r4 >= 0) goto L_0x0019
            return
        L_0x0019:
            r5 = 1
            if (r2 != r5) goto L_0x001f
            ria[] r2 = y0
            goto L_0x002e
        L_0x001f:
            int r6 = r2 + -1
            ria[] r6 = new defpackage.ria[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x002e:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0035
            return
        L_0x0035:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x002e
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sia.i(ria):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ria[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (decrementAndGet() == 0) goto L_0x005d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.oka r7) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r7 instanceof defpackage.t2f
            r1 = 0
            if (r0 == 0) goto L_0x007e
            t2f r7 = (defpackage.t2f) r7
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            int r3 = r6.get()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r6.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x002a
            cla r3 = r6.a
            r3.d(r7)
            int r7 = r6.decrementAndGet()
            if (r7 != 0) goto L_0x004d
            goto L_0x005d
        L_0x002a:
            ebe r3 = r6.w
            if (r3 != 0) goto L_0x0043
            int r3 = r6.o
            if (r3 != r2) goto L_0x003a
            the r3 = new the
            int r4 = r6.v
            r3.<init>(r4)
            goto L_0x0041
        L_0x003a:
            she r3 = new she
            int r4 = r6.o
            r3.<init>(r4)
        L_0x0041:
            r6.w = r3
        L_0x0043:
            r3.offer(r7)
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L_0x004d
            goto L_0x00ad
        L_0x004d:
            r6.h()
            goto L_0x005d
        L_0x0051:
            r7 = move-exception
            defpackage.hd8.Z(r7)
            fz r3 = r6.y
            r3.a(r7)
            r6.g()
        L_0x005d:
            int r7 = r6.o
            if (r7 == r2) goto L_0x00ad
            monitor-enter(r6)
            java.util.ArrayDeque r7 = r6.w0     // Catch:{ all -> 0x0073 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x0073 }
            oka r7 = (defpackage.oka) r7     // Catch:{ all -> 0x0073 }
            if (r7 != 0) goto L_0x0075
            int r1 = r6.x0     // Catch:{ all -> 0x0073 }
            int r1 = r1 - r0
            r6.x0 = r1     // Catch:{ all -> 0x0073 }
            r1 = r0
            goto L_0x0075
        L_0x0073:
            r7 = move-exception
            goto L_0x007c
        L_0x0075:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0000
            r6.g()
            goto L_0x00ad
        L_0x007c:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            throw r7
        L_0x007e:
            ria r0 = new ria
            long r2 = r6.Z
            r4 = 1
            long r2 = r2 + r4
            r6.Z = r2
            r0.<init>(r6)
        L_0x008a:
            java.util.concurrent.atomic.AtomicReference r2 = r6.X
            java.lang.Object r3 = r2.get()
            ria[] r3 = (defpackage.ria[]) r3
            ria[] r4 = z0
            if (r3 != r4) goto L_0x009a
            defpackage.qq4.a(r0)
            goto L_0x00ad
        L_0x009a:
            int r4 = r3.length
            int r5 = r4 + 1
            ria[] r5 = new defpackage.ria[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00a4:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x00ae
            r7.a(r0)
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00a4
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sia.j(oka):void");
    }

    public final void k(int i) {
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                synchronized (this) {
                    try {
                        oka oka = (oka) this.w0.poll();
                        if (oka == null) {
                            this.x0--;
                        } else {
                            j(oka);
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.x) {
            n54.D(th);
        } else if (this.y.a(th)) {
            this.x = true;
            g();
        }
    }
}
