package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: c14  reason: default package */
public final class c14 implements Executor, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater X;
    public static final bpa Y = new bpa(10, "NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater y;
    public static final /* synthetic */ AtomicLongFieldUpdater z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final xs6 v;
    public final xs6 w;
    public final s3d x;

    static {
        Class<c14> cls = c14.class;
        y = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        z = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        X = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [v68, xs6] */
    /* JADX WARNING: type inference failed for: r3v7, types: [v68, xs6] */
    public c14(long j, String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = str;
        if (i < 1) {
            throw new IllegalArgumentException(a81.j(i, "Core pool size ", " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(g63.h("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(a81.j(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.v = new v68();
            this.w = new v68();
            this.x = new s3d((i + 1) * 2);
            this.controlState$volatile = ((long) i) << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(wj6.j(j, "Idle worker keep alive time ", " must be positive").toString());
        }
    }

    public static /* synthetic */ void o(c14 c14, Runnable runnable, boolean z2, int i) {
        jq5 jq5 = jef.g;
        if ((i & 4) != 0) {
            z2 = false;
        }
        c14.n(runnable, jq5, z2);
    }

    public final void U(a14 a14, int i, int i2) {
        while (true) {
            long j = y.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c2 = a14.c();
                    while (true) {
                        if (c2 == Y) {
                            i3 = -1;
                            break;
                        } else if (c2 == null) {
                            i3 = 0;
                            break;
                        } else {
                            a14 a142 = (a14) c2;
                            int b2 = a142.b();
                            if (b2 != 0) {
                                i3 = b2;
                                break;
                            }
                            c2 = a142.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (y.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean V(long j) {
        int coerceAtLeast = RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        int i = this.a;
        if (coerceAtLeast < i) {
            int m = m();
            if (m == 1 && i > 1) {
                m();
            }
            if (m > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00af
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.a14
            r3 = 0
            if (r1 == 0) goto L_0x0018
            a14 r0 = (defpackage.a14) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            c14 r1 = r0.y
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r8)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            s3d r1 = r8.x
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = z     // Catch:{ all -> 0x00c1 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c1 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0076
            r1 = r2
        L_0x0037:
            s3d r5 = r8.x
            java.lang.Object r5 = r5.b(r1)
            a14 r5 = (defpackage.a14) r5
            if (r5 == r0) goto L_0x0071
        L_0x0041:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L_0x0052
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0041
        L_0x0052:
            spg r5 = r5.a
            xs6 r6 = r8.w
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.spg.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            ndf r7 = (defpackage.ndf) r7
            if (r7 == 0) goto L_0x0066
            r6.a(r7)
        L_0x0066:
            ndf r7 = r5.b()
            if (r7 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r6.a(r7)
            goto L_0x0066
        L_0x0071:
            if (r1 == r4) goto L_0x0076
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0076:
            xs6 r1 = r8.w
            r1.b()
            xs6 r1 = r8.v
            r1.b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            ndf r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00b0
        L_0x0088:
            xs6 r1 = r8.v
            java.lang.Object r1 = r1.d()
            ndf r1 = (defpackage.ndf) r1
            if (r1 != 0) goto L_0x00b0
            xs6 r1 = r8.w
            java.lang.Object r1 = r1.d()
            ndf r1 = (defpackage.ndf) r1
            if (r1 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00a3
            b14 r1 = defpackage.b14.v
            r0.h(r1)
        L_0x00a3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = y
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = z
            r0.set(r8, r1)
        L_0x00af:
            return
        L_0x00b0:
            r1.run()     // Catch:{ all -> 0x00b4 }
            goto L_0x0080
        L_0x00b4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0080
        L_0x00c1:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c14.close():void");
    }

    public final boolean e0() {
        bpa bpa;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = y;
            long j = atomicLongFieldUpdater.get(this);
            a14 a14 = (a14) this.x.b((int) (2097151 & j));
            if (a14 == null) {
                a14 = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
                Object c2 = a14.c();
                while (true) {
                    bpa = Y;
                    if (c2 == bpa) {
                        i = -1;
                        break;
                    } else if (c2 == null) {
                        i = 0;
                        break;
                    } else {
                        a14 a142 = (a14) c2;
                        i = a142.b();
                        if (i != 0) {
                            break;
                        }
                        c2 = a142.c();
                    }
                }
                if (i >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) i))) {
                        a14.g(bpa);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (a14 == null) {
                return false;
            }
            if (a14.z.compareAndSet(a14, -1, 0)) {
                LockSupport.unpark(a14);
                return true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        o(this, runnable, false, 6);
    }

    public final int m() {
        synchronized (this.x) {
            try {
                if (X.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = z;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i2 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.x.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a14 a14 = new a14(this, i2);
                this.x.c(i2, a14);
                if (i2 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i3 = coerceAtLeast + 1;
                    a14.start();
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, jq5 jq5, boolean z2) {
        ndf ndf;
        b14 b14;
        jef.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof ndf) {
            ndf = (ndf) runnable;
            ndf.a = nanoTime;
            ndf.b = jq5;
        } else {
            ndf = new zdf(runnable, nanoTime, jq5);
        }
        boolean z3 = false;
        boolean z4 = ndf.b.b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0;
        Thread currentThread = Thread.currentThread();
        a14 a14 = currentThread instanceof a14 ? (a14) currentThread : null;
        if (a14 == null || !Intrinsics.areEqual((Object) a14.y, (Object) this)) {
            a14 = null;
        }
        if (!(a14 == null || (b14 = a14.c) == b14.v || (ndf.b.b == 0 && b14 == b14.b))) {
            a14.x = true;
            spg spg = a14.a;
            if (z2) {
                ndf = spg.a(ndf);
            } else {
                spg.getClass();
                ndf ndf2 = (ndf) spg.b.getAndSet(spg, ndf);
                ndf = ndf2 == null ? null : spg.a(ndf2);
            }
        }
        if (ndf != null) {
            if (!(ndf.b.b == 1 ? this.w.a(ndf) : this.v.a(ndf))) {
                throw new RejectedExecutionException(wj6.n(new StringBuilder(), this.o, " was terminated"));
            }
        }
        if (z2 && a14 != null) {
            z3 = true;
        }
        if (z4) {
            if (!z3 && !e0() && !V(addAndGet)) {
                e0();
            }
        } else if (!z3 && !e0() && !V(atomicLongFieldUpdater.get(this))) {
            e0();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s3d s3d = this.x;
        int a2 = s3d.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a2; i6++) {
            a14 a14 = (a14) s3d.b(i6);
            if (a14 != null) {
                spg spg = a14.a;
                spg.getClass();
                int i7 = spg.b.get(spg) != null ? (spg.c.get(spg) - spg.d.get(spg)) + 1 : spg.c.get(spg) - spg.d.get(spg);
                int ordinal = a14.c.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i5++;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        long j = z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.o);
        sb4.append('@');
        sb4.append(n79.A(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        g63.o(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        g63.o(sb4, i2, ", parked = ", i3, ", dormant = ");
        g63.o(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.v.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.w.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
