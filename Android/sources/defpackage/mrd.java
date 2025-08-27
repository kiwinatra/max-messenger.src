package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: mrd  reason: default package */
public class mrd implements jrd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final ir0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<mrd> cls = mrd.class;
        Class<Object> cls2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public mrd(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(wj6.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        } else if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(wj6.h(i, "The number of acquired permits should be in 0..").toString());
        } else {
            ord ord = new ord(0, (ord) null, 2);
            this.head$volatile = ord;
            this.tail$volatile = ord;
            this._availablePermits$volatile = i - i2;
            this.b = new ir0(6, this);
        }
    }

    public final Object a(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        lw1 w = cvg.w(IntrinsicsKt.intercepted(continuationImpl));
        try {
            if (!b(w)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            w.l(Unit.INSTANCE, this.b);
                            break;
                        } else if (b(w)) {
                            break;
                        }
                    }
                }
            }
            Object t = w.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuationImpl);
            }
            if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                t = Unit.INSTANCE;
            }
            return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
        } catch (Throwable th) {
            w.B();
            throw th;
        }
    }

    public final boolean b(neg neg) {
        Object a2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ord ord = (ord) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        krd krd = krd.a;
        long j = andIncrement / ((long) nrd.f);
        loop0:
        while (true) {
            a2 = ae3.a(ord, j, krd);
            if (fqc.y(a2)) {
                break;
            }
            iod r = fqc.r(a2);
            while (true) {
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
        ord ord2 = (ord) fqc.r(a2);
        int i = (int) (andIncrement % ((long) nrd.f));
        AtomicReferenceArray atomicReferenceArray = ord2.v;
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, neg)) {
            if (atomicReferenceArray.get(i) != null) {
                bpa bpa = nrd.b;
                bpa bpa2 = nrd.c;
                while (!atomicReferenceArray.compareAndSet(i, bpa, bpa2)) {
                    if (atomicReferenceArray.get(i) != bpa) {
                        return false;
                    }
                }
                ((kw1) neg).l(Unit.INSTANCE, this.b);
                return true;
            }
        }
        neg.a(ord2, i);
        return true;
    }

    public final void c() {
        int i;
        Object a2;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2 || atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                ord ord = (ord) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j = andIncrement2 / ((long) nrd.f);
                lrd lrd = lrd.a;
                while (true) {
                    a2 = ae3.a(ord, j, lrd);
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
                ord ord2 = (ord) fqc.r(a2);
                ord2.a();
                int i3 = (ord2.c > j ? 1 : (ord2.c == j ? 0 : -1));
                z = false;
                if (i3 <= 0) {
                    int i4 = (int) (andIncrement2 % ((long) nrd.f));
                    bpa bpa = nrd.b;
                    AtomicReferenceArray atomicReferenceArray = ord2.v;
                    Object andSet = atomicReferenceArray.getAndSet(i4, bpa);
                    if (andSet == null) {
                        int i5 = nrd.a;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                bpa bpa2 = nrd.b;
                                bpa bpa3 = nrd.d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i4, bpa2, bpa3)) {
                                        if (atomicReferenceArray.get(i4) != bpa2) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                z = !z;
                                continue;
                            } else if (atomicReferenceArray.get(i4) == nrd.c) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    } else if (andSet == nrd.e) {
                        continue;
                    } else if (andSet instanceof kw1) {
                        kw1 kw1 = (kw1) andSet;
                        bpa f2 = kw1.f(Unit.INSTANCE, this.b);
                        if (f2 != null) {
                            kw1.v(f2);
                        } else {
                            continue;
                        }
                    } else if (andSet instanceof vpd) {
                        if (((upd) ((vpd) andSet)).g(this, Unit.INSTANCE) != 0) {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    z = true;
                    continue;
                }
            } else {
                return;
            }
        } while (!z);
    }
}
