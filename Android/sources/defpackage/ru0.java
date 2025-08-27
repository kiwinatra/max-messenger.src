package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: ru0  reason: default package */
public class ru0 implements x02 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z;
    public static final /* synthetic */ AtomicLongFieldUpdater o;
    public static final /* synthetic */ AtomicLongFieldUpdater v;
    public static final /* synthetic */ AtomicLongFieldUpdater w;
    public static final /* synthetic */ AtomicLongFieldUpdater x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ AtomicReferenceFieldUpdater z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final Function1 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final ir0 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Class<ru0> cls = ru0.class;
        o = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        v = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        w = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        x = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        X = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        Y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        Z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public ru0(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
        if (i >= 0) {
            f22 f22 = tu0.a;
            this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? (long) i : LongCompanionObject.MAX_VALUE : 0;
            this.completedExpandBuffersAndPauseFlag$volatile = w.get(this);
            f22 f222 = new f22(0, (f22) null, this, 3);
            this.sendSegment$volatile = f222;
            this.receiveSegment$volatile = f222;
            this.bufferEndSegment$volatile = z() ? tu0.a : f222;
            this.c = function1 != null ? new ir0(1, this) : null;
            this._closeCause$volatile = tu0.s;
            return;
        }
        throw new IllegalArgumentException(a81.j(i, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object C(defpackage.ru0 r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof defpackage.pu0
            if (r0 == 0) goto L_0x0014
            r0 = r14
            pu0 r0 = (defpackage.pu0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.c = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            pu0 r0 = new pu0
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r14)
            e22 r14 = (defpackage.e22) r14
            java.lang.Object r13 = r14.a
            goto L_0x009c
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = z
            java.lang.Object r14 = r14.get(r13)
            f22 r14 = (defpackage.f22) r14
        L_0x0043:
            boolean r1 = r13.x()
            if (r1 == 0) goto L_0x0053
            java.lang.Throwable r13 = r13.n()
            c22 r14 = new c22
            r14.<init>(r13)
            goto L_0x00a2
        L_0x0053:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = v
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.tu0.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0070
            f22 r1 = r13.m(r7, r14)
            if (r1 != 0) goto L_0x006f
            goto L_0x0043
        L_0x006f:
            r14 = r1
        L_0x0070:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.H(r8, r9, r10, r12)
            bpa r7 = defpackage.tu0.m
            if (r1 == r7) goto L_0x00a3
            bpa r7 = defpackage.tu0.o
            if (r1 != r7) goto L_0x008d
            long r7 = r13.q()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0043
            r14.a()
            goto L_0x0043
        L_0x008d:
            bpa r7 = defpackage.tu0.n
            if (r1 != r7) goto L_0x009e
            r6.c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x009c
            return r0
        L_0x009c:
            r14 = r13
            goto L_0x00a2
        L_0x009e:
            r14.a()
            r14 = r1
        L_0x00a2:
            return r14
        L_0x00a3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.C(ru0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final f22 a(ru0 ru0, long j, f22 f22) {
        Object a2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        ru0.getClass();
        f22 f222 = tu0.a;
        su0 su0 = su0.a;
        loop0:
        while (true) {
            a2 = ae3.a(f22, j, su0);
            if (fqc.y(a2)) {
                break;
            }
            iod r = fqc.r(a2);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
                iod iod = (iod) atomicReferenceFieldUpdater.get(ru0);
                if (iod.c >= r.c) {
                    break loop0;
                } else if (r.j()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(ru0, iod, r)) {
                        if (atomicReferenceFieldUpdater.get(ru0) != iod) {
                            if (r.f()) {
                                r.e();
                            }
                        }
                    }
                    if (iod.f()) {
                        iod.e();
                    }
                }
            }
        }
        boolean y2 = fqc.y(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = v;
        if (y2) {
            ru0.u();
            if (f22.c * ((long) tu0.b) >= atomicLongFieldUpdater2.get(ru0)) {
                return null;
            }
            f22.a();
            return null;
        }
        f22 f223 = (f22) fqc.r(a2);
        long j4 = f223.c;
        if (j4 <= j) {
            return f223;
        }
        long j5 = ((long) tu0.b) * j4;
        do {
            atomicLongFieldUpdater = o;
            j2 = atomicLongFieldUpdater.get(ru0);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(ru0, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
        if (j4 * ((long) tu0.b) >= atomicLongFieldUpdater2.get(ru0)) {
            return null;
        }
        f223.a();
        return null;
    }

    public static final void d(ru0 ru0, Object obj, lw1 lw1) {
        Function1 function1 = ru0.b;
        if (function1 != null) {
            iq.o(function1, obj, lw1.v);
        }
        Throwable o2 = ru0.o();
        Result.Companion companion = Result.Companion;
        lw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(o2)));
    }

    public static final int f(ru0 ru0, f22 f22, int i, Object obj, long j, Object obj2, boolean z2) {
        ru0.getClass();
        f22.n(i, obj);
        if (z2) {
            return ru0.I(f22, i, obj, j, obj2, z2);
        }
        Object l = f22.l(i);
        if (l == null) {
            if (ru0.g(j)) {
                if (f22.k(i, (Object) null, tu0.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (f22.k(i, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof neg) {
            f22.n(i, (Object) null);
            if (ru0.F(l, obj)) {
                f22.o(i, tu0.i);
                return 0;
            }
            bpa bpa = tu0.k;
            if (f22.w.getAndSet((i * 2) + 1, bpa) != bpa) {
                f22.m(i, true);
            }
            return 5;
        }
        return ru0.I(f22, i, obj, j, obj2, z2);
    }

    public static void v(ru0 ru0) {
        ru0.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = x;
        if ((atomicLongFieldUpdater.addAndGet(ru0, 1) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(ru0) & 4611686018427387904L) != 0);
        }
    }

    public final void A(long j, f22 f22) {
        f22 f222;
        f22 f223;
        while (f22.c < j && (f223 = (f22) f22.c()) != null) {
            f22 = f223;
        }
        while (true) {
            if (!f22.d() || (f222 = (f22) f22.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
                    iod iod = (iod) atomicReferenceFieldUpdater.get(this);
                    if (iod.c < f22.c) {
                        if (!f22.j()) {
                            continue;
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, iod, f22)) {
                            if (atomicReferenceFieldUpdater.get(this) != iod) {
                                if (f22.f()) {
                                    f22.e();
                                }
                            }
                        }
                        if (iod.f()) {
                            iod.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            f22 = f222;
        }
    }

    public final Object B(Object obj, Continuation continuation) {
        UndeliveredElementException p;
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        Function1 function1 = this.b;
        if (function1 == null || (p = iq.p(function1, obj, (UndeliveredElementException) null)) == null) {
            Throwable o2 = o();
            Result.Companion companion = Result.Companion;
            lw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(o2)));
        } else {
            ExceptionsKt.addSuppressed(p, o());
            Result.Companion companion2 = Result.Companion;
            lw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(p)));
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(defpackage.f22 r17, int r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            r7 = 1
            boolean r2 = r1 instanceof defpackage.qu0
            if (r2 == 0) goto L_0x0019
            r2 = r1
            qu0 r2 = (defpackage.qu0) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.c = r3
        L_0x0017:
            r8 = r2
            goto L_0x001f
        L_0x0019:
            qu0 r2 = new qu0
            r2.<init>(r0, r1)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r1 = r8.a
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.c
            if (r2 == 0) goto L_0x0038
            if (r2 != r7) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0135
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r1)
            r8.getClass()
            r8.getClass()
            r8.c = r7
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            lw1 r10 = defpackage.cvg.w(r1)
            vtc r11 = new vtc     // Catch:{ all -> 0x007e }
            r11.<init>(r10)     // Catch:{ all -> 0x007e }
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r11
            java.lang.Object r1 = r1.H(r2, r3, r4, r6)     // Catch:{ all -> 0x007e }
            bpa r2 = defpackage.tu0.m     // Catch:{ all -> 0x007e }
            if (r1 != r2) goto L_0x006a
            r2 = r17
            r3 = r18
            r11.a(r2, r3)     // Catch:{ all -> 0x007e }
            goto L_0x0125
        L_0x006a:
            r2 = r17
            bpa r3 = defpackage.tu0.o     // Catch:{ all -> 0x007e }
            kotlin.jvm.functions.Function1 r13 = r0.b
            if (r1 != r3) goto L_0x0112
            long r3 = r16.q()     // Catch:{ all -> 0x007e }
            int r1 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0081
            r17.a()     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            goto L_0x013a
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = z     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x007e }
            f22 r1 = (defpackage.f22) r1     // Catch:{ all -> 0x007e }
        L_0x0089:
            boolean r2 = r16.x()     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x00a8
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x007e }
            java.lang.Throwable r0 = r16.n()     // Catch:{ all -> 0x007e }
            c22 r1 = new c22     // Catch:{ all -> 0x007e }
            r1.<init>(r0)     // Catch:{ all -> 0x007e }
            e22 r0 = new e22     // Catch:{ all -> 0x007e }
            r0.<init>(r1)     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x007e }
            r10.resumeWith(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0125
        L_0x00a8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = v     // Catch:{ all -> 0x007e }
            long r14 = r2.getAndIncrement(r0)     // Catch:{ all -> 0x007e }
            int r2 = defpackage.tu0.b     // Catch:{ all -> 0x007e }
            long r2 = (long) r2     // Catch:{ all -> 0x007e }
            long r4 = r14 / r2
            long r2 = r14 % r2
            int r6 = (int) r2     // Catch:{ all -> 0x007e }
            long r2 = r1.c     // Catch:{ all -> 0x007e }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00c5
            f22 r2 = r0.m(r4, r1)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x00c3
            goto L_0x0089
        L_0x00c3:
            r4 = r2
            goto L_0x00c6
        L_0x00c5:
            r4 = r1
        L_0x00c6:
            r1 = r16
            r2 = r4
            r3 = r6
            r12 = r4
            r4 = r14
            r7 = r6
            r6 = r11
            java.lang.Object r1 = r1.H(r2, r3, r4, r6)     // Catch:{ all -> 0x007e }
            bpa r2 = defpackage.tu0.m     // Catch:{ all -> 0x007e }
            if (r1 != r2) goto L_0x00da
            r11.a(r12, r7)     // Catch:{ all -> 0x007e }
            goto L_0x0125
        L_0x00da:
            bpa r2 = defpackage.tu0.o     // Catch:{ all -> 0x007e }
            if (r1 != r2) goto L_0x00ec
            long r1 = r16.q()     // Catch:{ all -> 0x007e }
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e9
            r12.a()     // Catch:{ all -> 0x007e }
        L_0x00e9:
            r1 = r12
            r7 = 1
            goto L_0x0089
        L_0x00ec:
            bpa r2 = defpackage.tu0.n     // Catch:{ all -> 0x007e }
            if (r1 == r2) goto L_0x0106
            r12.a()     // Catch:{ all -> 0x007e }
            e22 r2 = new e22     // Catch:{ all -> 0x007e }
            r2.<init>(r1)     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0101
            mu0 r12 = new mu0     // Catch:{ all -> 0x007e }
            r1 = 1
            r12.<init>(r1, r0)     // Catch:{ all -> 0x007e }
            goto L_0x0102
        L_0x0101:
            r12 = 0
        L_0x0102:
            r10.l(r2, r12)     // Catch:{ all -> 0x007e }
            goto L_0x0125
        L_0x0106:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007e }
            r0.<init>(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0112:
            r17.a()     // Catch:{ all -> 0x007e }
            e22 r2 = new e22     // Catch:{ all -> 0x007e }
            r2.<init>(r1)     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0123
            mu0 r12 = new mu0     // Catch:{ all -> 0x007e }
            r1 = 1
            r12.<init>(r1, r0)     // Catch:{ all -> 0x007e }
            goto L_0x0102
        L_0x0123:
            r12 = 0
            goto L_0x0102
        L_0x0125:
            java.lang.Object r1 = r10.t()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L_0x0132
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L_0x0132:
            if (r1 != r9) goto L_0x0135
            return r9
        L_0x0135:
            e22 r1 = (defpackage.e22) r1
            java.lang.Object r0 = r1.a
            return r0
        L_0x013a:
            r10.B()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.D(f22, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(neg neg, boolean z2) {
        Throwable th;
        if (neg instanceof kw1) {
            Continuation continuation = (Continuation) neg;
            Result.Companion companion = Result.Companion;
            if (z2) {
                th = n();
                if (th == null) {
                    th = new NoSuchElementException("Channel was closed");
                }
            } else {
                th = o();
            }
            continuation.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
        } else if (neg instanceof vtc) {
            lw1 lw1 = ((vtc) neg).a;
            Result.Companion companion2 = Result.Companion;
            lw1.resumeWith(Result.m23constructorimpl(new e22(new c22(n()))));
        } else if (neg instanceof lu0) {
            lu0 lu0 = (lu0) neg;
            lw1 lw12 = lu0.b;
            lu0.b = null;
            lu0.a = tu0.l;
            Throwable n = lu0.c.n();
            if (n == null) {
                Result.Companion companion3 = Result.Companion;
                lw12.resumeWith(Result.m23constructorimpl(Boolean.FALSE));
                return;
            }
            Result.Companion companion4 = Result.Companion;
            lw12.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(n)));
        } else if (neg instanceof vpd) {
            ((upd) ((vpd) neg)).g(this, tu0.l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + neg).toString());
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof vpd) {
            return ((upd) ((vpd) obj)).g(this, obj2) == 0;
        }
        boolean z2 = obj instanceof vtc;
        Function1 function1 = this.b;
        Function3 function3 = null;
        if (z2) {
            lw1 lw1 = ((vtc) obj).a;
            e22 e22 = new e22(obj2);
            if (function1 != null) {
                function3 = new mu0(1, this);
            }
            return tu0.a(lw1, e22, function3);
        } else if (obj instanceof lu0) {
            lu0 lu0 = (lu0) obj;
            lw1 lw12 = lu0.b;
            lu0.b = null;
            lu0.a = obj2;
            Boolean bool = Boolean.TRUE;
            Function1 function12 = lu0.c.b;
            if (function12 != null) {
                function3 = new ju0(0, function12, obj2);
            }
            return tu0.a(lw12, bool, function3);
        } else if (obj instanceof kw1) {
            kw1 kw1 = (kw1) obj;
            if (function1 != null) {
                function3 = new mu0(0, this);
            }
            return tu0.a(kw1, obj2, function3);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final boolean G(Object obj, f22 f22, int i) {
        jtf jtf;
        if (obj instanceof kw1) {
            return tu0.a((kw1) obj, Unit.INSTANCE, (Function3) null);
        }
        if (obj instanceof vpd) {
            int g = ((upd) obj).g(this, Unit.INSTANCE);
            if (g == 0) {
                jtf = jtf.a;
            } else if (g == 1) {
                jtf = jtf.b;
            } else if (g == 2) {
                jtf = jtf.c;
            } else if (g == 3) {
                jtf = jtf.o;
            } else {
                throw new IllegalStateException(("Unexpected internal result: " + g).toString());
            }
            if (jtf == jtf.b) {
                f22.n(i, (Object) null);
            }
            return jtf == jtf.a;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object H(f22 f22, int i, long j, Object obj) {
        Object l = f22.l(i);
        AtomicReferenceArray atomicReferenceArray = f22.w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (l == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return tu0.n;
                }
                if (f22.k(i, l, obj)) {
                    l();
                    return tu0.m;
                }
            }
        } else if (l == tu0.d && f22.k(i, l, tu0.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            f22.n(i, (Object) null);
            return obj2;
        }
        while (true) {
            Object l2 = f22.l(i);
            if (l2 == null || l2 == tu0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (f22.k(i, l2, tu0.h)) {
                        l();
                        return tu0.o;
                    }
                } else if (obj == null) {
                    return tu0.n;
                } else {
                    if (f22.k(i, l2, obj)) {
                        l();
                        return tu0.m;
                    }
                }
            } else if (l2 != tu0.d) {
                bpa bpa = tu0.j;
                if (l2 == bpa) {
                    return tu0.o;
                }
                if (l2 == tu0.h) {
                    return tu0.o;
                }
                if (l2 == tu0.l) {
                    l();
                    return tu0.o;
                } else if (l2 != tu0.g && f22.k(i, l2, tu0.f)) {
                    boolean z2 = l2 instanceof oeg;
                    if (z2) {
                        l2 = ((oeg) l2).a;
                    }
                    if (G(l2, f22, i)) {
                        f22.o(i, tu0.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        f22.n(i, (Object) null);
                        return obj3;
                    }
                    f22.o(i, bpa);
                    f22.i();
                    if (z2) {
                        l();
                    }
                    return tu0.o;
                }
            } else if (f22.k(i, l2, tu0.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                f22.n(i, (Object) null);
                return obj4;
            }
        }
    }

    public final int I(f22 f22, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object l = f22.l(i);
            if (l == null) {
                if (!g(j) || z2) {
                    if (z2) {
                        if (f22.k(i, (Object) null, tu0.j)) {
                            f22.i();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (f22.k(i, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (f22.k(i, (Object) null, tu0.d)) {
                    return 1;
                }
            } else if (l != tu0.e) {
                bpa bpa = tu0.k;
                if (l == bpa) {
                    f22.n(i, (Object) null);
                    return 5;
                } else if (l == tu0.h) {
                    f22.n(i, (Object) null);
                    return 5;
                } else if (l == tu0.l) {
                    f22.n(i, (Object) null);
                    u();
                    return 4;
                } else {
                    f22.n(i, (Object) null);
                    if (l instanceof oeg) {
                        l = ((oeg) l).a;
                    }
                    if (F(l, obj)) {
                        f22.o(i, tu0.i);
                        return 0;
                    } else if (f22.w.getAndSet((i * 2) + 1, bpa) == bpa) {
                        return 5;
                    } else {
                        f22.m(i, true);
                        return 5;
                    }
                }
            } else if (f22.k(i, l, tu0.d)) {
                return 1;
            }
        }
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (!z()) {
            do {
                atomicLongFieldUpdater = w;
            } while (atomicLongFieldUpdater.get(this) <= j);
            int i = tu0.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = x;
                if (i2 < i) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (j4 != (atomicLongFieldUpdater2.get(this) & DurationKt.MAX_MILLIS) || j4 != atomicLongFieldUpdater.get(this)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    do {
                        j2 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & DurationKt.MAX_MILLIS)));
                    while (true) {
                        long j5 = atomicLongFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater2.get(this);
                        long j7 = j6 & DurationKt.MAX_MILLIS;
                        boolean z2 = (j6 & 4611686018427387904L) != 0;
                        if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                            break;
                        } else if (!z2) {
                            atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                        }
                    }
                    do {
                        j3 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & DurationKt.MAX_MILLIS));
                    return;
                }
            }
        }
    }

    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    public final m7f c() {
        return new m7f(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(nu0.a, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(ou0.a, 3), this.c);
    }

    public final Object e() {
        f22 f22;
        AtomicLongFieldUpdater atomicLongFieldUpdater = v;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = o.get(this);
        if (w(j2, true)) {
            return new c22(n());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        Object obj = e22.b;
        if (i >= 0) {
            return obj;
        }
        bpa bpa = tu0.k;
        f22 f222 = (f22) z.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = (long) tu0.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (f222.c != j4) {
                f22 m = m(j4, f222);
                if (m == null) {
                    continue;
                } else {
                    f22 = m;
                }
            } else {
                f22 = f222;
            }
            Object H = H(f22, i2, andIncrement, bpa);
            if (H == tu0.m) {
                neg neg = bpa instanceof neg ? (neg) bpa : null;
                if (neg != null) {
                    neg.a(f22, i2);
                }
                J(andIncrement);
                f22.i();
            } else if (H == tu0.o) {
                if (andIncrement < q()) {
                    f22.a();
                }
                f222 = f22;
            } else if (H != tu0.n) {
                f22.a();
                obj = H;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new c22(n());
    }

    public final boolean g(long j) {
        return j < w.get(this) || j < v.get(this) + ((long) this.a);
    }

    public final Object h(Continuation continuation) {
        return C(this, continuation);
    }

    public final boolean i(Throwable th, boolean z2) {
        boolean z3;
        Object obj;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                f22 f22 = tu0.a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (((long) 1) << 60) + (j5 & 1152921504606846975L)));
        }
        bpa bpa = tu0.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, bpa, th)) {
                if (atomicReferenceFieldUpdater.get(this) != bpa) {
                    z3 = false;
                    break;
                }
            } else {
                z3 = true;
                break;
            }
        }
        if (z2) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = (long) 2;
                } else if (i != 1) {
                    break;
                } else {
                    j2 = j & 1152921504606846975L;
                    j3 = (long) 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        u();
        if (z3) {
            loop4:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Z;
                obj = atomicReferenceFieldUpdater2.get(this);
                bpa bpa2 = obj == null ? tu0.q : tu0.r;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, bpa2)) {
                        break loop4;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
            }
            if (obj != null) {
                Function1 function1 = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1);
                ((Function1) obj).invoke(n());
            }
        }
        return z3;
    }

    public final lu0 iterator() {
        return new lu0(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r1 = (defpackage.f22) ((defpackage.be3) defpackage.be3.b.get(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.f22 j(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = y
            java.lang.Object r1 = r1.get(r12)
            f22 r1 = (defpackage.f22) r1
            long r2 = r1.c
            r4 = r0
            f22 r4 = (defpackage.f22) r4
            long r4 = r4.c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = z
            java.lang.Object r1 = r1.get(r12)
            f22 r1 = (defpackage.f22) r1
            long r2 = r1.c
            r4 = r0
            f22 r4 = (defpackage.f22) r4
            long r4 = r4.c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            be3 r0 = (defpackage.be3) r0
        L_0x0030:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.be3.a
            java.lang.Object r1 = r1.get(r0)
            bpa r2 = defpackage.ae3.a
            r3 = 0
            if (r1 != r2) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            be3 r1 = (defpackage.be3) r1
            if (r1 != 0) goto L_0x0131
        L_0x0043:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.be3.a
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L_0x0129
        L_0x004b:
            f22 r0 = (defpackage.f22) r0
            boolean r1 = r12.y()
            r2 = -1
            r4 = 1
            if (r1 == 0) goto L_0x00a3
            r1 = r0
        L_0x0056:
            int r5 = defpackage.tu0.b
            int r5 = r5 - r4
        L_0x0059:
            r6 = -1
            if (r2 >= r5) goto L_0x008f
            int r8 = defpackage.tu0.b
            long r8 = (long) r8
            long r10 = r1.c
            long r10 = r10 * r8
            long r8 = (long) r5
            long r10 = r10 + r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = v
            long r8 = r8.get(r12)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0071
        L_0x006f:
            r10 = r6
            goto L_0x009c
        L_0x0071:
            java.lang.Object r8 = r1.l(r5)
            if (r8 == 0) goto L_0x0081
            bpa r9 = defpackage.tu0.e
            if (r8 != r9) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            bpa r9 = defpackage.tu0.d
            if (r8 != r9) goto L_0x008c
            goto L_0x009c
        L_0x0081:
            bpa r9 = defpackage.tu0.l
            boolean r8 = r1.k(r5, r8, r9)
            if (r8 == 0) goto L_0x0071
            r1.i()
        L_0x008c:
            int r5 = r5 + -1
            goto L_0x0059
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.be3.b
            java.lang.Object r1 = r5.get(r1)
            be3 r1 = (defpackage.be3) r1
            f22 r1 = (defpackage.f22) r1
            if (r1 != 0) goto L_0x0056
            goto L_0x006f
        L_0x009c:
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a3
            r12.k(r10)
        L_0x00a3:
            r1 = r0
        L_0x00a4:
            if (r1 == 0) goto L_0x0107
            int r5 = defpackage.tu0.b
            int r5 = r5 - r4
        L_0x00a9:
            if (r2 >= r5) goto L_0x00fc
            int r6 = defpackage.tu0.b
            long r6 = (long) r6
            long r8 = r1.c
            long r8 = r8 * r6
            long r6 = (long) r5
            long r8 = r8 + r6
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0107
        L_0x00b7:
            java.lang.Object r6 = r1.l(r5)
            if (r6 == 0) goto L_0x00ee
            bpa r7 = defpackage.tu0.e
            if (r6 != r7) goto L_0x00c2
            goto L_0x00ee
        L_0x00c2:
            boolean r7 = r6 instanceof defpackage.oeg
            if (r7 == 0) goto L_0x00da
            bpa r7 = defpackage.tu0.l
            boolean r7 = r1.k(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            oeg r6 = (defpackage.oeg) r6
            neg r6 = r6.a
            java.lang.Object r3 = defpackage.i8b.L(r3, r6)
            r1.m(r5, r4)
            goto L_0x00f9
        L_0x00da:
            boolean r7 = r6 instanceof defpackage.neg
            if (r7 == 0) goto L_0x00f9
            bpa r7 = defpackage.tu0.l
            boolean r7 = r1.k(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r3 = defpackage.i8b.L(r3, r6)
            r1.m(r5, r4)
            goto L_0x00f9
        L_0x00ee:
            bpa r7 = defpackage.tu0.l
            boolean r6 = r1.k(r5, r6, r7)
            if (r6 == 0) goto L_0x00b7
            r1.i()
        L_0x00f9:
            int r5 = r5 + -1
            goto L_0x00a9
        L_0x00fc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.be3.b
            java.lang.Object r1 = r5.get(r1)
            be3 r1 = (defpackage.be3) r1
            f22 r1 = (defpackage.f22) r1
            goto L_0x00a4
        L_0x0107:
            if (r3 == 0) goto L_0x0128
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x0113
            neg r3 = (defpackage.neg) r3
            r12.E(r3, r4)
            goto L_0x0128
        L_0x0113:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r4
        L_0x011a:
            if (r2 >= r13) goto L_0x0128
            java.lang.Object r14 = r3.get(r13)
            neg r14 = (defpackage.neg) r14
            r12.E(r14, r4)
            int r13 = r13 + -1
            goto L_0x011a
        L_0x0128:
            return r0
        L_0x0129:
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0030
        L_0x0131:
            r0 = r1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.j(long):f22");
    }

    public final void k(long j) {
        UndeliveredElementException p;
        f22 f22 = (f22) z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.a) + j2, w.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    long j3 = (long) tu0.b;
                    long j4 = j2 / j3;
                    int i = (int) (j2 % j3);
                    if (f22.c != j4) {
                        f22 m = m(j4, f22);
                        if (m == null) {
                            continue;
                        } else {
                            f22 = m;
                        }
                    }
                    Object H = H(f22, i, j2, (Object) null);
                    if (H != tu0.o) {
                        f22.a();
                        Function1 function1 = this.b;
                        if (!(function1 == null || (p = iq.p(function1, H, (UndeliveredElementException) null)) == null)) {
                            throw p;
                        }
                    } else if (j2 < q()) {
                        f22.a();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void l() {
        Object a2;
        if (!z()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            f22 f22 = (f22) atomicReferenceFieldUpdater.get(this);
            loop0:
            while (true) {
                long andIncrement = w.getAndIncrement(this);
                long j = andIncrement / ((long) tu0.b);
                if (q() <= andIncrement) {
                    if (f22.c < j && f22.c() != null) {
                        A(j, f22);
                    }
                    v(this);
                    return;
                }
                if (f22.c != j) {
                    su0 su0 = su0.a;
                    while (true) {
                        a2 = ae3.a(f22, j, su0);
                        if (fqc.y(a2)) {
                            break;
                        }
                        iod r = fqc.r(a2);
                        while (true) {
                            iod iod = (iod) atomicReferenceFieldUpdater.get(this);
                            if (iod.c >= r.c) {
                                break;
                            } else if (r.j()) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, iod, r)) {
                                    if (atomicReferenceFieldUpdater.get(this) != iod) {
                                        if (r.f()) {
                                            r.e();
                                        }
                                    }
                                }
                                if (iod.f()) {
                                    iod.e();
                                }
                            }
                        }
                    }
                    f22 f222 = null;
                    if (fqc.y(a2)) {
                        u();
                        A(j, f22);
                        v(this);
                    } else {
                        f22 f223 = (f22) fqc.r(a2);
                        long j2 = f223.c;
                        if (j2 > j) {
                            long j3 = (long) tu0.b;
                            if (w.compareAndSet(this, andIncrement + 1, j2 * j3)) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater = x;
                                if ((atomicLongFieldUpdater.addAndGet(this, (j2 * j3) - andIncrement) & 4611686018427387904L) != 0) {
                                    do {
                                    } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                                }
                            } else {
                                v(this);
                            }
                        } else {
                            f222 = f223;
                        }
                    }
                    if (f222 == null) {
                        continue;
                    } else {
                        f22 = f222;
                    }
                }
                int i = (int) (andIncrement % ((long) tu0.b));
                Object l = f22.l(i);
                boolean z2 = l instanceof neg;
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = v;
                if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !f22.k(i, l, tu0.g)) {
                    while (true) {
                        Object l2 = f22.l(i);
                        if (!(l2 instanceof neg)) {
                            if (l2 != tu0.j) {
                                if (l2 != null) {
                                    if (l2 == tu0.d || l2 == tu0.h || l2 == tu0.i || l2 == tu0.k || l2 == tu0.l) {
                                        break loop0;
                                    } else if (l2 != tu0.f) {
                                        throw new IllegalStateException(("Unexpected cell state: " + l2).toString());
                                    }
                                } else if (f22.k(i, l2, tu0.e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (f22.k(i, l2, new oeg((neg) l2))) {
                                break loop0;
                            }
                        } else if (f22.k(i, l2, tu0.g)) {
                            if (G(l2, f22, i)) {
                                f22.o(i, tu0.d);
                                break;
                            } else {
                                f22.o(i, tu0.j);
                                f22.i();
                            }
                        }
                    }
                } else if (G(l, f22, i)) {
                    f22.o(i, tu0.d);
                    break;
                } else {
                    f22.o(i, tu0.j);
                    f22.i();
                }
                v(this);
            }
            v(this);
        }
    }

    public final f22 m(long j, f22 f22) {
        Object a2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        f22 f222 = tu0.a;
        su0 su0 = su0.a;
        loop0:
        while (true) {
            a2 = ae3.a(f22, j, su0);
            if (fqc.y(a2)) {
                break;
            }
            iod r = fqc.r(a2);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
                iod iod = (iod) atomicReferenceFieldUpdater.get(this);
                if (iod.c >= r.c) {
                    break loop0;
                } else if (r.j()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, iod, r)) {
                        if (atomicReferenceFieldUpdater.get(this) != iod) {
                            if (r.f()) {
                                r.e();
                            }
                        }
                    }
                    if (iod.f()) {
                        iod.e();
                    }
                }
            }
        }
        if (fqc.y(a2)) {
            u();
            if (f22.c * ((long) tu0.b) >= q()) {
                return null;
            }
            f22.a();
            return null;
        }
        f22 f223 = (f22) fqc.r(a2);
        boolean z2 = z();
        long j3 = f223.c;
        if (!z2 && j <= w.get(this) / ((long) tu0.b)) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X;
                iod iod2 = (iod) atomicReferenceFieldUpdater2.get(this);
                if (iod2.c >= j3 || !f223.j()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, iod2, f223)) {
                    if (atomicReferenceFieldUpdater2.get(this) != iod2) {
                        if (f223.f()) {
                            f223.e();
                        }
                    }
                }
                if (iod2.f()) {
                    iod2.e();
                }
            }
        }
        if (j3 <= j) {
            return f223;
        }
        long j4 = ((long) tu0.b) * j3;
        do {
            atomicLongFieldUpdater = v;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4 || atomicLongFieldUpdater.compareAndSet(this, j2, j4)) {
            }
            atomicLongFieldUpdater = v;
            j2 = atomicLongFieldUpdater.get(this);
            break;
        } while (atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (j3 * ((long) tu0.b) >= q()) {
            return null;
        }
        f223.a();
        return null;
    }

    public final Throwable n() {
        return (Throwable) Y.get(this);
    }

    public final Throwable o() {
        Throwable n = n();
        return n == null ? new IllegalStateException("Channel was closed") : n;
    }

    public final boolean p(Throwable th) {
        return i(th, false);
    }

    public final long q() {
        return o.get(this) & 1152921504606846975L;
    }

    public final void r(hw2 hw2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = Z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, hw2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            bpa bpa = tu0.q;
            if (obj == bpa) {
                bpa bpa2 = tu0.r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, bpa, bpa2)) {
                        hw2.invoke(n());
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != bpa) {
                    }
                }
            } else if (obj == tu0.r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    public Object s(Object obj) {
        f22 f22;
        f22 f222;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = w(j, false) ? false : !g(j & 1152921504606846975L);
        d22 d22 = e22.b;
        if (z2) {
            return d22;
        }
        bpa bpa = tu0.j;
        f22 f223 = (f22) y.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean w2 = w(andIncrement, false);
            int i = tu0.b;
            long j3 = (long) i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (f223.c != j4) {
                f22 a2 = a(this, j4, f223);
                if (a2 != null) {
                    f22 = a2;
                } else if (w2) {
                    return new c22(o());
                }
            } else {
                f22 = f223;
            }
            f22 f224 = f22;
            int i3 = i2;
            int i4 = i;
            int f = f(this, f22, i2, obj, j2, bpa, w2);
            if (f != 0) {
                if (f == 1) {
                    break;
                } else if (f != 2) {
                    if (f == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (f != 4) {
                        if (f == 5) {
                            f224.a();
                        }
                        f223 = f224;
                    } else {
                        if (j2 < v.get(this)) {
                            f224.a();
                        }
                        return new c22(o());
                    }
                } else if (w2) {
                    f224.i();
                    return new c22(o());
                } else {
                    neg neg = bpa instanceof neg ? (neg) bpa : null;
                    if (neg != null) {
                        f222 = f224;
                        neg.a(f222, i3 + i4);
                    } else {
                        f222 = f224;
                    }
                    f222.i();
                    return d22;
                }
            } else {
                f224.a();
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        d(r0, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object t(java.lang.Object r26, kotlin.coroutines.Continuation r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = y
            java.lang.Object r1 = r10.get(r0)
            f22 r1 = (defpackage.f22) r1
        L_0x000c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = o
            long r2 = r11.getAndIncrement(r0)
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r2 & r12
            r8 = 0
            boolean r16 = r0.w(r2, r8)
            int r7 = defpackage.tu0.b
            long r2 = (long) r7
            long r4 = r14 / r2
            long r2 = r14 % r2
            int r6 = (int) r2
            long r2 = r1.c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0042
            f22 r2 = a(r0, r4, r1)
            if (r2 != 0) goto L_0x0040
            if (r16 == 0) goto L_0x000c
            java.lang.Object r0 = r25.B(r26, r27)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01fa
            goto L_0x01fc
        L_0x0040:
            r5 = r2
            goto L_0x0043
        L_0x0042:
            r5 = r1
        L_0x0043:
            r17 = 0
            r1 = r25
            r2 = r5
            r3 = r6
            r4 = r26
            r19 = r5
            r18 = r6
            r5 = r14
            r20 = r7
            r7 = r17
            r8 = r16
            int r1 = f(r1, r2, r3, r4, r5, r7, r8)
            if (r1 == 0) goto L_0x01f5
            r8 = 1
            if (r1 == r8) goto L_0x01fa
            r7 = 2
            if (r1 == r7) goto L_0x01e3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = v
            r6 = 5
            r4 = 4
            r3 = 3
            if (r1 == r3) goto L_0x008b
            if (r1 == r4) goto L_0x0074
            if (r1 == r6) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r19.a()
        L_0x0071:
            r1 = r19
            goto L_0x000c
        L_0x0074:
            long r1 = r5.get(r0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x007f
            r19.a()
        L_0x007f:
            java.lang.Object r0 = r25.B(r26, r27)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01fa
            goto L_0x01fc
        L_0x008b:
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r27)
            lw1 r2 = defpackage.cvg.w(r1)
            r16 = 0
            r1 = r25
            r17 = r2
            r2 = r19
            r3 = r18
            r12 = r4
            r4 = r26
            r13 = r5
            r5 = r14
            r12 = r7
            r7 = r17
            r12 = r8
            r8 = r16
            int r1 = f(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x012f }
            if (r1 == 0) goto L_0x01b2
            if (r1 == r12) goto L_0x01a7
            r2 = 2
            if (r1 == r2) goto L_0x019d
            r2 = 4
            if (r1 == r2) goto L_0x018f
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x0183
            r19.a()     // Catch:{ all -> 0x012f }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ all -> 0x012f }
            f22 r1 = (defpackage.f22) r1     // Catch:{ all -> 0x012f }
        L_0x00c4:
            long r2 = r11.getAndIncrement(r0)     // Catch:{ all -> 0x012f }
            r18 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r22 = r2 & r18
            r10 = 0
            boolean r16 = r0.w(r2, r10)     // Catch:{ all -> 0x012f }
            int r8 = defpackage.tu0.b     // Catch:{ all -> 0x012f }
            long r2 = (long) r8     // Catch:{ all -> 0x012f }
            long r4 = r22 / r2
            long r2 = r22 % r2
            int r7 = (int) r2     // Catch:{ all -> 0x012f }
            long r2 = r1.c     // Catch:{ all -> 0x012f }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00fe
            f22 r2 = a(r0, r4, r1)     // Catch:{ all -> 0x00fa }
            if (r2 != 0) goto L_0x00f6
            if (r16 == 0) goto L_0x00c4
            r5 = r17
            d(r0, r9, r5)     // Catch:{ all -> 0x00f2 }
            r1 = r5
            goto L_0x01c2
        L_0x00f2:
            r0 = move-exception
        L_0x00f3:
            r1 = r5
            goto L_0x01df
        L_0x00f6:
            r5 = r17
            r6 = r2
            goto L_0x0101
        L_0x00fa:
            r0 = move-exception
            r5 = r17
            goto L_0x00f3
        L_0x00fe:
            r5 = r17
            r6 = r1
        L_0x0101:
            r1 = r25
            r2 = r6
            r3 = r7
            r4 = r26
            r17 = r5
            r20 = r6
            r5 = r22
            r21 = r7
            r7 = r17
            r24 = r8
            r8 = r16
            int r1 = f(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x012f }
            if (r1 == 0) goto L_0x0173
            if (r1 == r12) goto L_0x0165
            r2 = 2
            if (r1 == r2) goto L_0x0155
            r3 = 3
            if (r1 == r3) goto L_0x0146
            r4 = 4
            if (r1 == r4) goto L_0x0134
            if (r1 == r15) goto L_0x0129
            goto L_0x012c
        L_0x0129:
            r20.a()     // Catch:{ all -> 0x012f }
        L_0x012c:
            r1 = r20
            goto L_0x00c4
        L_0x012f:
            r0 = move-exception
            r1 = r17
            goto L_0x01df
        L_0x0134:
            long r1 = r13.get(r0)     // Catch:{ all -> 0x012f }
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x013f
            r20.a()     // Catch:{ all -> 0x012f }
        L_0x013f:
            r1 = r17
        L_0x0141:
            d(r0, r9, r1)     // Catch:{ all -> 0x0152 }
            goto L_0x01c2
        L_0x0146:
            r1 = r17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0152 }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x0152 }
            r0.<init>(r2)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            goto L_0x01df
        L_0x0155:
            r1 = r17
            if (r16 == 0) goto L_0x015d
            r20.i()     // Catch:{ all -> 0x0152 }
            goto L_0x0141
        L_0x015d:
            int r7 = r21 + r24
            r2 = r20
            r1.a(r2, r7)     // Catch:{ all -> 0x0152 }
            goto L_0x01c2
        L_0x0165:
            r1 = r17
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0152 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0152 }
        L_0x016f:
            r1.resumeWith(r0)     // Catch:{ all -> 0x0152 }
            goto L_0x01c2
        L_0x0173:
            r1 = r17
            r2 = r20
            r2.a()     // Catch:{ all -> 0x0152 }
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0152 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0152 }
            goto L_0x016f
        L_0x0183:
            r1 = r17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0152 }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x0152 }
            r0.<init>(r2)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x018f:
            r1 = r17
            long r2 = r13.get(r0)     // Catch:{ all -> 0x0152 }
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            r19.a()     // Catch:{ all -> 0x0152 }
            goto L_0x0141
        L_0x019d:
            r1 = r17
            int r6 = r18 + r20
            r2 = r19
            r1.a(r2, r6)     // Catch:{ all -> 0x0152 }
            goto L_0x01c2
        L_0x01a7:
            r1 = r17
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0152 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0152 }
            goto L_0x016f
        L_0x01b2:
            r1 = r17
            r2 = r19
            r2.a()     // Catch:{ all -> 0x0152 }
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0152 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0152 }
            goto L_0x016f
        L_0x01c2:
            java.lang.Object r0 = r1.t()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01cf
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r27)
        L_0x01cf:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01d8:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01fa
            goto L_0x01fc
        L_0x01df:
            r1.B()
            throw r0
        L_0x01e3:
            r2 = r19
            if (r16 == 0) goto L_0x01fa
            r2.i()
            java.lang.Object r0 = r25.B(r26, r27)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01fa
            goto L_0x01fc
        L_0x01f5:
            r2 = r19
            r2.a()
        L_0x01fa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.t(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [be3] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b0, code lost:
        r3 = r3.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b7, code lost:
        if (r3 != null) goto L_0x01d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = o
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 2
            r4 = 3
            if (r2 == r3) goto L_0x001e
            if (r2 == r4) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.a
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            f22[] r2 = new defpackage.f22[r4]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = z
            java.lang.Object r4 = r4.get(r0)
            r6 = 0
            r2[r6] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = y
            java.lang.Object r4 = r4.get(r0)
            r7 = 1
            r2[r7] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X
            java.lang.Object r4 = r4.get(r0)
            r2[r3] = r4
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r2.next()
            r8 = r4
            f22 r8 = (defpackage.f22) r8
            f22 r9 = defpackage.tu0.a
            if (r8 == r9) goto L_0x006b
            r3.add(r4)
            goto L_0x006b
        L_0x0080:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d4
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0095
            goto L_0x00af
        L_0x0095:
            r4 = r3
            f22 r4 = (defpackage.f22) r4
            long r8 = r4.c
        L_0x009a:
            java.lang.Object r4 = r2.next()
            r10 = r4
            f22 r10 = (defpackage.f22) r10
            long r10 = r10.c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a9
            r3 = r4
            r8 = r10
        L_0x00a9:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009a
        L_0x00af:
            f22 r3 = (defpackage.f22) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = v
            long r10 = r2.get(r0)
            long r12 = r16.q()
        L_0x00bb:
            int r0 = defpackage.tu0.b
            r2 = r6
        L_0x00be:
            if (r2 >= r0) goto L_0x01b0
            long r8 = r3.c
            int r4 = defpackage.tu0.b
            long r14 = (long) r4
            long r8 = r8 * r14
            long r14 = (long) r2
            long r8 = r8 + r14
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x00d0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x01b9
        L_0x00d0:
            java.lang.Object r14 = r3.l(r2)
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r3.w
            int r6 = r2 * 2
            java.lang.Object r6 = r15.get(r6)
            boolean r15 = r14 instanceof defpackage.kw1
            if (r15 == 0) goto L_0x00f6
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ea
            if (r4 < 0) goto L_0x00ea
            java.lang.String r4 = "receive"
            goto L_0x017a
        L_0x00ea:
            if (r4 >= 0) goto L_0x00f2
            if (r8 < 0) goto L_0x00f2
            java.lang.String r4 = "send"
            goto L_0x017a
        L_0x00f2:
            java.lang.String r4 = "cont"
            goto L_0x017a
        L_0x00f6:
            boolean r15 = r14 instanceof defpackage.vpd
            if (r15 == 0) goto L_0x0110
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0104
            if (r4 < 0) goto L_0x0104
            java.lang.String r4 = "onReceive"
            goto L_0x017a
        L_0x0104:
            if (r4 >= 0) goto L_0x010c
            if (r8 < 0) goto L_0x010c
            java.lang.String r4 = "onSend"
            goto L_0x017a
        L_0x010c:
            java.lang.String r4 = "select"
            goto L_0x017a
        L_0x0110:
            boolean r4 = r14 instanceof defpackage.vtc
            if (r4 == 0) goto L_0x0117
            java.lang.String r4 = "receiveCatching"
            goto L_0x017a
        L_0x0117:
            boolean r4 = r14 instanceof defpackage.oeg
            if (r4 == 0) goto L_0x012f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r4.<init>(r8)
            r4.append(r14)
            r8 = 41
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L_0x017a
        L_0x012f:
            bpa r4 = defpackage.tu0.f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x0178
            bpa r4 = defpackage.tu0.g
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0140
            goto L_0x0178
        L_0x0140:
            if (r14 == 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.i
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.h
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.k
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.j
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x01ab
            bpa r4 = defpackage.tu0.l
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0173
            goto L_0x01ab
        L_0x0173:
            java.lang.String r4 = r14.toString()
            goto L_0x017a
        L_0x0178:
            java.lang.String r4 = "resuming_sender"
        L_0x017a:
            if (r6 == 0) goto L_0x0199
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r4)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r4 = "),"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r1.append(r4)
            goto L_0x01ab
        L_0x0199:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.append(r4)
        L_0x01ab:
            int r2 = r2 + 1
            r6 = 0
            goto L_0x00be
        L_0x01b0:
            be3 r0 = r3.c()
            r3 = r0
            f22 r3 = (defpackage.f22) r3
            if (r3 != 0) goto L_0x01d1
        L_0x01b9:
            char r0 = kotlin.text.StringsKt.last(r1)
            if (r0 != r5) goto L_0x01c7
            int r0 = r1.length()
            int r0 = r0 - r7
            r1.deleteCharAt(r0)
        L_0x01c7:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x01d1:
            r6 = 0
            goto L_0x00bb
        L_0x01d4:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.toString():java.lang.String");
    }

    public final boolean u() {
        return w(o.get(this), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        r0 = (defpackage.f22) ((defpackage.be3) defpackage.be3.b.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(long r19, boolean r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = 60
            long r0 = r19 >> r0
            int r0 = (int) r0
            r7 = 0
            if (r0 == 0) goto L_0x0199
            r8 = 1
            if (r0 == r8) goto L_0x0199
            r1 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = v
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r1) goto L_0x010a
            r1 = 3
            if (r0 != r1) goto L_0x00fa
            long r0 = r19 & r2
            f22 r0 = r6.j(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0023:
            int r4 = defpackage.tu0.b
            int r4 = r4 - r8
        L_0x0026:
            r5 = -1
            if (r5 >= r4) goto L_0x00c6
            int r10 = defpackage.tu0.b
            long r10 = (long) r10
            long r12 = r0.c
            long r12 = r12 * r10
            long r10 = (long) r4
            long r12 = r12 + r10
        L_0x0031:
            java.lang.Object r10 = r0.l(r4)
            bpa r11 = defpackage.tu0.i
            if (r10 == r11) goto L_0x00d2
            bpa r11 = defpackage.tu0.d
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r0.w
            kotlin.jvm.functions.Function1 r15 = r6.b
            if (r10 != r11) goto L_0x0064
            long r16 = r9.get(r6)
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d2
            bpa r11 = defpackage.tu0.l
            boolean r10 = r0.k(r4, r10, r11)
            if (r10 == 0) goto L_0x0031
            if (r15 == 0) goto L_0x005d
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r2 = defpackage.iq.p(r15, r5, r2)
        L_0x005d:
            r0.n(r4, r1)
            r0.i()
            goto L_0x00c2
        L_0x0064:
            bpa r11 = defpackage.tu0.e
            if (r10 == r11) goto L_0x00b7
            if (r10 != 0) goto L_0x006b
            goto L_0x00b7
        L_0x006b:
            boolean r11 = r10 instanceof defpackage.neg
            if (r11 != 0) goto L_0x0080
            boolean r11 = r10 instanceof defpackage.oeg
            if (r11 == 0) goto L_0x0074
            goto L_0x0080
        L_0x0074:
            bpa r11 = defpackage.tu0.g
            if (r10 == r11) goto L_0x00d2
            bpa r14 = defpackage.tu0.f
            if (r10 != r14) goto L_0x007d
            goto L_0x00d2
        L_0x007d:
            if (r10 == r11) goto L_0x0031
            goto L_0x00c2
        L_0x0080:
            long r16 = r9.get(r6)
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d2
            boolean r11 = r10 instanceof defpackage.oeg
            if (r11 == 0) goto L_0x0092
            r11 = r10
            oeg r11 = (defpackage.oeg) r11
            neg r11 = r11.a
            goto L_0x0095
        L_0x0092:
            r11 = r10
            neg r11 = (defpackage.neg) r11
        L_0x0095:
            bpa r5 = defpackage.tu0.l
            boolean r5 = r0.k(r4, r10, r5)
            if (r5 == 0) goto L_0x00b4
            if (r15 == 0) goto L_0x00a9
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r2 = defpackage.iq.p(r15, r5, r2)
        L_0x00a9:
            java.lang.Object r3 = defpackage.i8b.L(r3, r11)
            r0.n(r4, r1)
            r0.i()
            goto L_0x00c2
        L_0x00b4:
            r5 = -1
            goto L_0x0031
        L_0x00b7:
            bpa r5 = defpackage.tu0.l
            boolean r5 = r0.k(r4, r10, r5)
            if (r5 == 0) goto L_0x00b4
            r0.i()
        L_0x00c2:
            int r4 = r4 + -1
            goto L_0x0026
        L_0x00c6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.be3.b
            java.lang.Object r0 = r4.get(r0)
            be3 r0 = (defpackage.be3) r0
            f22 r0 = (defpackage.f22) r0
            if (r0 != 0) goto L_0x0023
        L_0x00d2:
            if (r3 == 0) goto L_0x00f4
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x00de
            neg r3 = (defpackage.neg) r3
            r6.E(r3, r7)
            goto L_0x00f4
        L_0x00de:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            int r0 = r0 - r8
            r1 = -1
        L_0x00e6:
            if (r1 >= r0) goto L_0x00f4
            java.lang.Object r4 = r3.get(r0)
            neg r4 = (defpackage.neg) r4
            r6.E(r4, r7)
            int r0 = r0 + -1
            goto L_0x00e6
        L_0x00f4:
            if (r2 != 0) goto L_0x00f9
        L_0x00f6:
            r7 = r8
            goto L_0x0199
        L_0x00f9:
            throw r2
        L_0x00fa:
            java.lang.String r1 = "unexpected close status: "
            java.lang.String r0 = defpackage.wj6.h(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x010a:
            long r0 = r19 & r2
            r6.j(r0)
            if (r21 == 0) goto L_0x00f6
        L_0x0111:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = z
            java.lang.Object r1 = r0.get(r6)
            f22 r1 = (defpackage.f22) r1
            long r2 = r9.get(r6)
            long r4 = r18.q()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0126
            goto L_0x0143
        L_0x0126:
            int r4 = defpackage.tu0.b
            long r4 = (long) r4
            long r10 = r2 / r4
            long r12 = r1.c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0144
            f22 r1 = r6.m(r10, r1)
            if (r1 != 0) goto L_0x0144
            java.lang.Object r0 = r0.get(r6)
            f22 r0 = (defpackage.f22) r0
            long r0 = r0.c
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0111
        L_0x0143:
            goto L_0x00f6
        L_0x0144:
            r1.a()
            long r4 = r2 % r4
            int r0 = (int) r4
        L_0x014a:
            java.lang.Object r4 = r1.l(r0)
            if (r4 == 0) goto L_0x0181
            bpa r5 = defpackage.tu0.e
            if (r4 != r5) goto L_0x0155
            goto L_0x0181
        L_0x0155:
            bpa r0 = defpackage.tu0.d
            if (r4 != r0) goto L_0x015a
            goto L_0x0199
        L_0x015a:
            bpa r0 = defpackage.tu0.j
            if (r4 != r0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            bpa r0 = defpackage.tu0.l
            if (r4 != r0) goto L_0x0164
            goto L_0x018c
        L_0x0164:
            bpa r0 = defpackage.tu0.i
            if (r4 != r0) goto L_0x0169
            goto L_0x018c
        L_0x0169:
            bpa r0 = defpackage.tu0.h
            if (r4 != r0) goto L_0x016e
            goto L_0x018c
        L_0x016e:
            bpa r0 = defpackage.tu0.g
            if (r4 != r0) goto L_0x0173
            goto L_0x0199
        L_0x0173:
            bpa r0 = defpackage.tu0.f
            if (r4 != r0) goto L_0x0178
            goto L_0x018c
        L_0x0178:
            long r0 = r9.get(r6)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            goto L_0x0199
        L_0x0181:
            bpa r5 = defpackage.tu0.h
            boolean r4 = r1.k(r0, r4, r5)
            if (r4 == 0) goto L_0x014a
            r18.l()
        L_0x018c:
            r0 = 1
            long r4 = r2 + r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = v
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L_0x0111
        L_0x0199:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(o.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = w.get(this);
        return j == 0 || j == LongCompanionObject.MAX_VALUE;
    }
}
