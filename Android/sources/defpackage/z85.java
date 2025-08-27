package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* renamed from: z85  reason: default package */
public abstract class z85 extends a95 implements vk4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ AtomicIntegerFieldUpdater y;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<z85> cls = z85.class;
        Class<Object> cls2 = Object.class;
        w = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        x = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        y = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    public void B0(Runnable runnable) {
        C0();
        if (D0(runnable)) {
            Thread v0 = v0();
            if (Thread.currentThread() != v0) {
                LockSupport.unpark(v0);
                return;
            }
            return;
        }
        ef4.z.B0(runnable);
    }

    public final void C0() {
        x85 x85;
        y85 y85 = (y85) x.get(this);
        if (y85 != null && oif.b.get(y85) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (y85) {
                    try {
                        x85[] x85Arr = y85.a;
                        x85 = null;
                        x85 x852 = x85Arr != null ? x85Arr[0] : null;
                        if (x852 == null) {
                            continue;
                        } else {
                            if (nanoTime - x852.a >= 0 ? D0(x852) : false) {
                                x85 = y85.b(0);
                            }
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (x85 != null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:21:0x003f->B:24:0x004a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = w
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = y
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0012
            r2 = r4
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            if (r1 != 0) goto L_0x0027
        L_0x0018:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L_0x0020
            return r4
        L_0x0020:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0027:
            boolean r2 = r1 instanceof defpackage.x68
            if (r2 == 0) goto L_0x004e
            r2 = r1
            x68 r2 = (defpackage.x68) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L_0x004d
            if (r5 == r4) goto L_0x003b
            r0 = 2
            if (r5 == r0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return r3
        L_0x003b:
            x68 r2 = r2.c()
        L_0x003f:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x0046
            goto L_0x0000
        L_0x0046:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x003f
            goto L_0x0000
        L_0x004d:
            return r4
        L_0x004e:
            bpa r2 = defpackage.ryg.d
            if (r1 != r2) goto L_0x0053
            return r3
        L_0x0053:
            x68 r2 = new x68
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L_0x0063:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x006a
            return r4
        L_0x006a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x0063
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z85.D0(java.lang.Runnable):boolean");
    }

    public final boolean E0() {
        ArrayDeque arrayDeque = this.o;
        if (!(arrayDeque != null ? arrayDeque.isEmpty() : true)) {
            return false;
        }
        y85 y85 = (y85) x.get(this);
        if (y85 != null && oif.b.get(y85) != 0) {
            return false;
        }
        Object obj = w.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof x68) {
            long j = x68.f.get((x68) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == ryg.d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [y85, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[LOOP:0: B:10:0x0023->B:13:0x002e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F0(long r7, defpackage.x85 r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = y
            int r0 = r0.get(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = x
            r4 = 0
            if (r0 == 0) goto L_0x0014
            r0 = r2
            goto L_0x003a
        L_0x0014:
            java.lang.Object r0 = r3.get(r6)
            y85 r0 = (defpackage.y85) r0
            if (r0 != 0) goto L_0x0036
            y85 r5 = new y85
            r5.<init>()
            r5.c = r7
        L_0x0023:
            boolean r0 = r3.compareAndSet(r6, r4, r5)
            if (r0 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x0023
        L_0x0030:
            java.lang.Object r0 = r3.get(r6)
            y85 r0 = (defpackage.y85) r0
        L_0x0036:
            int r0 = r9.c(r7, r0, r6)
        L_0x003a:
            if (r0 == 0) goto L_0x0052
            if (r0 == r2) goto L_0x004e
            r6 = 2
            if (r0 != r6) goto L_0x0042
            goto L_0x0075
        L_0x0042:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x004e:
            r6.A0(r7, r9)
            goto L_0x0075
        L_0x0052:
            java.lang.Object r7 = r3.get(r6)
            y85 r7 = (defpackage.y85) r7
            if (r7 == 0) goto L_0x0066
            monitor-enter(r7)
            x85[] r8 = r7.a     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0061
            r4 = r8[r1]     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r7)
            goto L_0x0066
        L_0x0063:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L_0x0066:
            if (r4 != r9) goto L_0x0075
            java.lang.Thread r6 = r6.v0()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L_0x0075
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z85.F0(long, x85):void");
    }

    public pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return hi7.y(j, runnable, coroutineContext);
    }

    public final void o(long j, lw1 lw1) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j2 < DurationKt.MAX_MILLIS) {
            long nanoTime = System.nanoTime();
            v85 v85 = new v85(this, j2 + nanoTime, lw1);
            F0(nanoTime, v85);
            cvg.z(lw1, new aw1(2, v85));
        }
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        B0(runnable);
    }

    public void shutdown() {
        x85 b;
        ThreadLocal threadLocal = lif.a;
        lif.a.set((Object) null);
        y.set(this, 1);
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            bpa bpa = ryg.d;
            if (obj != null) {
                if (!(obj instanceof x68)) {
                    if (obj != bpa) {
                        x68 x68 = new x68(8, true);
                        x68.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x68)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((x68) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, bpa)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            break loop0;
        }
        do {
        } while (y0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            y85 y85 = (y85) x.get(this);
            if (y85 != null) {
                synchronized (y85) {
                    b = oif.b.get(y85) > 0 ? y85.b(0) : null;
                }
                if (b != null) {
                    A0(nanoTime, b);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[LOOP:1: B:13:0x002f->B:16:0x003a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long y0() {
        /*
            r10 = this;
            boolean r0 = r10.z0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            r10.C0()
        L_0x000c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = w
            java.lang.Object r3 = r0.get(r10)
            bpa r4 = defpackage.ryg.d
            r5 = 0
            if (r3 != 0) goto L_0x0019
        L_0x0017:
            r7 = r5
            goto L_0x0049
        L_0x0019:
            boolean r6 = r3 instanceof defpackage.x68
            if (r6 == 0) goto L_0x003d
            r6 = r3
            x68 r6 = (defpackage.x68) r6
            java.lang.Object r7 = r6.d()
            bpa r8 = defpackage.x68.g
            if (r7 == r8) goto L_0x002b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0049
        L_0x002b:
            x68 r6 = r6.c()
        L_0x002f:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L_0x0036
            goto L_0x000c
        L_0x0036:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L_0x002f
            goto L_0x000c
        L_0x003d:
            if (r3 != r4) goto L_0x0040
            goto L_0x0017
        L_0x0040:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto L_0x00b5
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0049:
            if (r7 == 0) goto L_0x004f
            r7.run()
            return r1
        L_0x004f:
            kotlin.collections.ArrayDeque r3 = r10.o
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L_0x005a
        L_0x0058:
            r8 = r6
            goto L_0x0062
        L_0x005a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0061
            goto L_0x0058
        L_0x0061:
            r8 = r1
        L_0x0062:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0067
            goto L_0x00b4
        L_0x0067:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x008f
            boolean r3 = r0 instanceof defpackage.x68
            if (r3 == 0) goto L_0x008b
            x68 r0 = (defpackage.x68) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.x68.f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto L_0x00b4
            goto L_0x008f
        L_0x008b:
            if (r0 != r4) goto L_0x00b4
        L_0x008d:
            r1 = r6
            goto L_0x00b4
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x
            java.lang.Object r10 = r0.get(r10)
            y85 r10 = (defpackage.y85) r10
            if (r10 == 0) goto L_0x008d
            monitor-enter(r10)
            x85[] r0 = r10.a     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            r3 = 0
            r5 = r0[r3]     // Catch:{ all -> 0x00b1 }
        L_0x00a1:
            monitor-exit(r10)
            if (r5 != 0) goto L_0x00a5
            goto L_0x008d
        L_0x00a5:
            long r3 = r5.a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            long r1 = kotlin.ranges.RangesKt.coerceAtLeast((long) r3, (long) r1)
            goto L_0x00b4
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00b4:
            return r1
        L_0x00b5:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L_0x0040
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z85.y0():long");
    }
}
