package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: a14  reason: default package */
public final class a14 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(a14.class, "workerCtl$volatile");
    public final spg a = new spg();
    public final Ref.ObjectRef b = new Ref.ObjectRef();
    public b14 c = b14.o;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker = c14.Y;
    public long o;
    public long v;
    public int w;
    private volatile /* synthetic */ int workerCtl$volatile;
    public boolean x;
    public final /* synthetic */ c14 y;

    public a14(c14 c14, int i) {
        this.y = c14;
        setDaemon(true);
        setContextClassLoader(c14.getClass().getClassLoader());
        int nanoTime = (int) System.nanoTime();
        this.w = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final ndf a(boolean z2) {
        ndf e;
        ndf e2;
        c14 c14;
        long j;
        b14 b14 = this.c;
        b14 b142 = b14.a;
        ndf ndf = null;
        spg spg = this.a;
        boolean z3 = true;
        c14 c142 = this.y;
        if (b14 != b142) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c14.z;
            do {
                c14 = this.y;
                j = atomicLongFieldUpdater.get(c14);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    spg.getClass();
                    loop1:
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = spg.b;
                        ndf ndf2 = (ndf) atomicReferenceFieldUpdater.get(spg);
                        if (ndf2 != null && ndf2.b.b == 1) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(spg, ndf2, (Object) null)) {
                                    ndf = ndf2;
                                    break loop1;
                                } else if (atomicReferenceFieldUpdater.get(spg) != ndf2) {
                                }
                            }
                        }
                    }
                    int i = spg.d.get(spg);
                    int i2 = spg.c.get(spg);
                    while (true) {
                        if (i != i2 && spg.e.get(spg) != 0) {
                            i2--;
                            ndf c2 = spg.c(i2, true);
                            if (c2 != null) {
                                ndf = c2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (ndf != null) {
                        return ndf;
                    }
                    ndf ndf3 = (ndf) c142.w.d();
                    return ndf3 == null ? i(1) : ndf3;
                }
            } while (!c14.z.compareAndSet(c14, j, j - 4398046511104L));
            this.c = b14.a;
        }
        if (z2) {
            if (d(c142.a * 2) != 0) {
                z3 = false;
            }
            if (z3 && (e2 = e()) != null) {
                return e2;
            }
            spg.getClass();
            ndf ndf4 = (ndf) spg.b.getAndSet(spg, (Object) null);
            if (ndf4 == null) {
                ndf4 = spg.b();
            }
            if (ndf4 != null) {
                return ndf4;
            }
            if (!z3 && (e = e()) != null) {
                return e;
            }
        } else {
            ndf e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.w;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.w = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final ndf e() {
        int d = d(2);
        c14 c14 = this.y;
        if (d == 0) {
            ndf ndf = (ndf) c14.v.d();
            return ndf != null ? ndf : (ndf) c14.w.d();
        }
        ndf ndf2 = (ndf) c14.w.d();
        return ndf2 != null ? ndf2 : (ndf) c14.v.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.o);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b14 b14) {
        b14 b142 = this.c;
        boolean z2 = b142 == b14.a;
        if (z2) {
            c14.z.addAndGet(this.y, 4398046511104L);
        }
        if (b142 != b14) {
            this.c = b14;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ndf i(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.c14.z
            c14 r3 = r0.y
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L_0x0016
            return r5
        L_0x0016:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0020:
            if (r10 >= r2) goto L_0x00e7
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L_0x0027
            r6 = r15
        L_0x0027:
            s3d r4 = r3.x
            java.lang.Object r4 = r4.b(r6)
            a14 r4 = (defpackage.a14) r4
            if (r4 == 0) goto L_0x00dd
            if (r4 == r0) goto L_0x00dd
            r7 = 3
            spg r4 = r4.a
            if (r1 != r7) goto L_0x003d
            ndf r7 = r4.b()
            goto L_0x0069
        L_0x003d:
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.spg.d
            int r7 = r7.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.spg.c
            int r8 = r8.get(r4)
            if (r1 != r15) goto L_0x0050
            r9 = r15
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r7 == r8) goto L_0x005d
            if (r9 == 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.spg.e
            int r13 = r13.get(r4)
            if (r13 != 0) goto L_0x005f
        L_0x005d:
            r7 = r5
            goto L_0x0069
        L_0x005f:
            int r13 = r7 + 1
            ndf r7 = r4.c(r7, r9)
            if (r7 != 0) goto L_0x0069
            r7 = r13
            goto L_0x0051
        L_0x0069:
            kotlin.jvm.internal.Ref$ObjectRef r13 = r0.b
            if (r7 == 0) goto L_0x0076
            r13.element = r7
            r19 = r6
        L_0x0071:
            r6 = -1
        L_0x0073:
            r8 = -1
            goto L_0x00b9
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.spg.b
            java.lang.Object r14 = r7.get(r4)
            ndf r14 = (defpackage.ndf) r14
            r18 = -2
            if (r14 != 0) goto L_0x0089
        L_0x0082:
            r21 = r18
            r19 = r6
            r6 = r21
            goto L_0x0073
        L_0x0089:
            jq5 r8 = r14.b
            int r8 = r8.b
            if (r8 != r15) goto L_0x0091
            r8 = r15
            goto L_0x0092
        L_0x0091:
            r8 = 2
        L_0x0092:
            r8 = r8 & r1
            if (r8 != 0) goto L_0x0096
            goto L_0x0082
        L_0x0096:
            p9a r8 = defpackage.jef.f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r19 = r6
            long r5 = r14.a
            long r8 = r8 - r5
            long r5 = defpackage.jef.b
            int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r20 >= 0) goto L_0x00af
            long r4 = r5 - r8
            r6 = r4
            r5 = 0
            goto L_0x0073
        L_0x00af:
            r5 = 0
            boolean r6 = r7.compareAndSet(r4, r14, r5)
            if (r6 == 0) goto L_0x00cf
            r13.element = r14
            goto L_0x0071
        L_0x00b9:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            T r0 = r13.element
            ndf r0 = (defpackage.ndf) r0
            r13.element = r5
            return r0
        L_0x00c4:
            r16 = 0
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00df
            long r11 = java.lang.Math.min(r11, r6)
            goto L_0x00df
        L_0x00cf:
            r8 = -1
            r16 = 0
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto L_0x00af
            r6 = r19
            r5 = 0
            goto L_0x0076
        L_0x00dd:
            r19 = r6
        L_0x00df:
            int r10 = r10 + 1
            r6 = r19
            r4 = 2
            r5 = 0
            goto L_0x0020
        L_0x00e7:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 0
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r11 = r16
        L_0x00f5:
            r0.v = r11
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.i(int):ndf");
    }

    public final void run() {
        b14 b14;
        b14 b142;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z2;
        boolean z3 = false;
        loop0:
        while (true) {
            boolean z4 = z3;
            while (true) {
                c14 c14 = this.y;
                c14.getClass();
                if (c14.X.get(c14) == 0 && this.c != (b14 = b14.v)) {
                    ndf a2 = a(this.x);
                    long j = -2097152;
                    if (a2 != null) {
                        this.v = 0;
                        int i = a2.b.b;
                        this.o = 0;
                        if (this.c == b14.c) {
                            this.c = b14.b;
                        }
                        c14 c142 = this.y;
                        if (i != 0 && h(b14.b) && !c142.e0() && !c142.V(c14.z.get(c142))) {
                            c142.e0();
                        }
                        c142.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (i != 0) {
                            c14.z.addAndGet(c142, -2097152);
                            if (this.c != b14) {
                                this.c = b14.o;
                            }
                        }
                    } else {
                        this.x = z3;
                        if (this.v != 0) {
                            if (z4) {
                                h(b14.c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.v);
                                this.v = 0;
                                break;
                            }
                            z4 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            bpa bpa = c14.Y;
                            if (obj != bpa ? true : z3) {
                                z.set(this, -1);
                                while (this.nextParkedWorker != c14.Y) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = z;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c14 c143 = this.y;
                                    c143.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c14.X;
                                    if (atomicIntegerFieldUpdater3.get(c143) != 0 || this.c == (b142 = b14.v)) {
                                        break;
                                    }
                                    h(b14.c);
                                    Thread.interrupted();
                                    if (this.o == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.o = System.nanoTime() + this.y.c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.y.c);
                                    if (System.nanoTime() - this.o >= 0) {
                                        this.o = 0;
                                        c14 c144 = this.y;
                                        synchronized (c144.x) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(c144) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c14.z;
                                                    if (((int) (atomicLongFieldUpdater.get(c144) & 2097151)) > c144.a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            z2 = false;
                                                            f(0);
                                                            c144.U(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(c144) & 2097151);
                                                            if (andDecrement != i2) {
                                                                a14 a14 = (a14) c144.x.b(andDecrement);
                                                                c144.x.c(i2, a14);
                                                                a14.f(i2);
                                                                c144.U(a14, andDecrement, i2);
                                                            }
                                                            c144.x.c(andDecrement, (a14) null);
                                                            Unit unit = Unit.INSTANCE;
                                                            this.c = b142;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z3 = z2;
                                    }
                                    z2 = false;
                                    z3 = z2;
                                }
                            } else {
                                c14 c145 = this.y;
                                c145.getClass();
                                if (this.nextParkedWorker == bpa) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c14.y;
                                        long j2 = atomicLongFieldUpdater2.get(c145);
                                        int i3 = this.indexInArray;
                                        this.nextParkedWorker = c145.x.b((int) (j2 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(c145, j2, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & j) | ((long) i3))) {
                                            break;
                                        }
                                        j = -2097152;
                                    }
                                }
                            }
                            z3 = z3;
                        }
                    }
                }
            }
        }
        h(b14.v);
    }
}
