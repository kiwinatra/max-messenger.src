package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mw5  reason: default package */
public final class mw5 extends wl0 implements gx5 {
    public final AtomicReference X = new AtomicReference();
    public Iterator Y;
    public int Z;
    public final pye a;
    public final zi6 b;
    public final int c;
    public final int o;
    public final AtomicLong v = new AtomicLong();
    public int v0;
    public rye w;
    public gbe x;
    public volatile boolean y;
    public volatile boolean z;

    public mw5(pye pye, zi6 zi6, int i) {
        this.a = pye;
        this.b = zi6;
        this.c = i;
        this.o = i - (i >> 2);
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            h();
        }
    }

    public final void cancel() {
        if (!this.z) {
            this.z = true;
            this.w.cancel();
            if (getAndIncrement() == 0) {
                this.x.clear();
            }
        }
    }

    public final void clear() {
        this.Y = null;
        this.x.clear();
    }

    public final void d(Object obj) {
        if (!this.y) {
            if (this.v0 != 0 || this.x.offer(obj)) {
                h();
            } else {
                onError(new QueueOverflowException());
            }
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.w, rye)) {
            this.w = rye;
            if (rye instanceof zac) {
                zac zac = (zac) rye;
                int p = zac.p(3);
                if (p == 1) {
                    this.v0 = p;
                    this.x = zac;
                    this.y = true;
                    this.a.e(this);
                    return;
                } else if (p == 2) {
                    this.v0 = p;
                    this.x = zac;
                    this.a.e(this);
                    rye.g((long) this.c);
                    return;
                }
            }
            this.x = new she(this.c);
            this.a.e(this);
            rye.g((long) this.c);
        }
    }

    public final boolean f(boolean z2, boolean z3, pye pye, gbe gbe) {
        if (this.z) {
            this.Y = null;
            gbe.clear();
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (((Throwable) this.X.get()) != null) {
                Throwable d = p95.d(this.X);
                this.Y = null;
                gbe.clear();
                pye.onError(d);
                return true;
            } else if (!z3) {
                return false;
            } else {
                pye.b();
                return true;
            }
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.v, j);
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0140, code lost:
        if (r6 == null) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r16.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            pye r2 = r1.a
            gbe r3 = r1.x
            int r0 = r1.v0
            r4 = 1
            r5 = 0
            if (r0 == r4) goto L_0x0015
            r0 = r4
            goto L_0x0016
        L_0x0015:
            r0 = r5
        L_0x0016:
            java.util.Iterator r6 = r1.Y
            r7 = r4
        L_0x0019:
            r8 = 0
            if (r6 != 0) goto L_0x0091
            boolean r9 = r1.y
            java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0073 }
            if (r10 != 0) goto L_0x0026
            r11 = r4
            goto L_0x0027
        L_0x0026:
            r11 = r5
        L_0x0027:
            boolean r9 = r1.f(r9, r11, r2, r3)
            if (r9 == 0) goto L_0x002e
            return
        L_0x002e:
            if (r10 == 0) goto L_0x0091
            zi6 r6 = r1.b     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x005b }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x005b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005b }
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x005b }
            if (r9 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0056
            int r6 = r1.Z
            int r6 = r6 + r4
            int r9 = r1.o
            if (r6 != r9) goto L_0x0054
            r1.Z = r5
            rye r9 = r1.w
            long r10 = (long) r6
            r9.g(r10)
            goto L_0x0056
        L_0x0054:
            r1.Z = r6
        L_0x0056:
            r6 = r8
            goto L_0x0019
        L_0x0058:
            r1.Y = r6
            goto L_0x0091
        L_0x005b:
            r0 = move-exception
            defpackage.hd8.Z(r0)
            rye r3 = r1.w
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.X
            defpackage.p95.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            java.lang.Throwable r0 = defpackage.p95.d(r0)
            r2.onError(r0)
            return
        L_0x0073:
            r0 = move-exception
            r4 = r0
            defpackage.hd8.Z(r4)
            rye r0 = r1.w
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            defpackage.p95.a(r0, r4)
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            java.lang.Throwable r0 = defpackage.p95.d(r0)
            r1.Y = r8
            r3.clear()
            r2.onError(r0)
            return
        L_0x0091:
            if (r6 == 0) goto L_0x0146
            java.util.concurrent.atomic.AtomicLong r9 = r1.v
            long r9 = r9.get()
            r13 = 0
        L_0x009b:
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0113
            boolean r15 = r1.y
            boolean r15 = r1.f(r15, r5, r2, r3)
            if (r15 == 0) goto L_0x00a8
            return
        L_0x00a8:
            java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "The iterator returned a null value"
            java.util.Objects.requireNonNull(r15, r11)     // Catch:{ all -> 0x00f9 }
            r2.d(r15)
            boolean r11 = r1.y
            boolean r11 = r1.f(r11, r5, r2, r3)
            if (r11 == 0) goto L_0x00bd
            return
        L_0x00bd:
            r11 = 1
            long r13 = r13 + r11
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x00de }
            if (r11 != 0) goto L_0x009b
            if (r0 == 0) goto L_0x00da
            int r6 = r1.Z
            int r6 = r6 + r4
            int r11 = r1.o
            if (r6 != r11) goto L_0x00d8
            r1.Z = r5
            rye r11 = r1.w
            long r4 = (long) r6
            r11.g(r4)
            goto L_0x00da
        L_0x00d8:
            r1.Z = r6
        L_0x00da:
            r1.Y = r8
            r6 = r8
            goto L_0x0113
        L_0x00de:
            r0 = move-exception
            r3 = r0
            defpackage.hd8.Z(r3)
            r1.Y = r8
            rye r0 = r1.w
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            defpackage.p95.a(r0, r3)
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            java.lang.Throwable r0 = defpackage.p95.d(r0)
            r2.onError(r0)
            return
        L_0x00f9:
            r0 = move-exception
            defpackage.hd8.Z(r0)
            r1.Y = r8
            rye r3 = r1.w
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.X
            defpackage.p95.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.X
            java.lang.Throwable r0 = defpackage.p95.d(r0)
            r2.onError(r0)
            return
        L_0x0113:
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x012b
            boolean r4 = r1.y
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0123
            if (r6 != 0) goto L_0x0123
            r5 = 1
            goto L_0x0124
        L_0x0123:
            r5 = 0
        L_0x0124:
            boolean r4 = r1.f(r4, r5, r2, r3)
            if (r4 == 0) goto L_0x012b
            return
        L_0x012b:
            r4 = 0
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            java.util.concurrent.atomic.AtomicLong r4 = r1.v
            long r8 = -r13
            r4.addAndGet(r8)
        L_0x0140:
            if (r6 != 0) goto L_0x0146
        L_0x0142:
            r4 = 1
            r5 = 0
            goto L_0x0019
        L_0x0146:
            int r4 = -r7
            int r7 = r1.addAndGet(r4)
            if (r7 != 0) goto L_0x0142
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw5.h():void");
    }

    public final boolean isEmpty() {
        return this.Y == null && this.x.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.y || !p95.a(this.X, th)) {
            n54.D(th);
            return;
        }
        this.y = true;
        h();
    }

    public final int p(int i) {
        return this.v0 == 1 ? 1 : 0;
    }

    public final Object poll() {
        Iterator it = this.Y;
        while (true) {
            if (it == null) {
                Object poll = this.x.poll();
                if (poll != null) {
                    it = ((Iterable) this.b.apply(poll)).iterator();
                    if (it.hasNext()) {
                        this.Y = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.Y = null;
        }
        return next;
    }
}
