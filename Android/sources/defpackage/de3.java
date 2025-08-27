package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: de3  reason: default package */
public final class de3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(de3.class, "load$volatile");
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ ge3 f;
    private volatile /* synthetic */ int load$volatile;

    public de3(ge3 ge3, int i) {
        this.f = ge3;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    public final Object a(Object obj, Object obj2, yw6 yw6) {
        bpa bpa;
        Reference reference;
        int i;
        int hashCode = (obj.hashCode() * -1640531527) >>> this.b;
        boolean z = false;
        Reference reference2 = yw6;
        loop0:
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            yw6 yw62 = (yw6) atomicReferenceArray.get(hashCode);
            bpa = te8.c;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (yw62 == null) {
                if (obj2 != null) {
                    if (!z) {
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                return bpa;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    Reference reference3 = reference2;
                    if (reference2 == null) {
                        Reference weakReference = new WeakReference(obj, this.f.a);
                        obj.hashCode();
                        reference3 = weakReference;
                    }
                    Reference reference4 = reference3;
                    while (!atomicReferenceArray.compareAndSet(hashCode, (Object) null, reference4)) {
                        if (atomicReferenceArray.get(hashCode) != null) {
                            z = z2;
                            reference = reference4;
                        }
                    }
                    break loop0;
                }
                return null;
            }
            Object obj3 = yw62.get();
            if (!Intrinsics.areEqual(obj, obj3)) {
                if (obj3 == null) {
                    c(hashCode);
                }
                if (hashCode == 0) {
                    hashCode = this.a;
                }
                hashCode--;
                reference = reference2;
            } else if (z) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
            }
            reference2 = reference;
        }
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            Object obj4 = atomicReferenceArray2.get(hashCode);
            if (obj4 instanceof lf8) {
                return bpa;
            }
            while (true) {
                if (atomicReferenceArray2.compareAndSet(hashCode, obj4, obj2)) {
                    return obj4;
                }
                if (atomicReferenceArray2.get(hashCode) != obj4) {
                }
            }
        }
    }

    public final de3 b() {
        Object obj;
        while (true) {
            ge3 ge3 = this.f;
            de3 de3 = new de3(ge3, Integer.highestOneBit(RangesKt.coerceAtLeast(ge3.size(), 4)) * 4);
            int i = 0;
            while (true) {
                if (i >= this.a) {
                    return de3;
                }
                yw6 yw6 = (yw6) this.d.get(i);
                Object obj2 = yw6 != null ? yw6.get() : null;
                if (yw6 != null && obj2 == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj = atomicReferenceArray.get(i);
                    if (obj instanceof lf8) {
                        obj = ((lf8) obj).a;
                        break;
                    }
                    lf8 lf8 = obj == null ? te8.d : Intrinsics.areEqual(obj, (Object) Boolean.TRUE) ? te8.e : new lf8(obj);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(i, obj, lf8)) {
                            break;
                        } else if (atomicReferenceArray.get(i) != obj) {
                        }
                    }
                }
                if (obj2 == null || obj == null || de3.a(obj2, obj, yw6) != te8.c) {
                    i++;
                }
            }
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj != null && !(obj instanceof lf8)) {
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, obj, (Object) null)) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ge3.b;
                        ge3 ge3 = this.f;
                        ge3.getClass();
                        ge3.b.decrementAndGet(ge3);
                        return;
                    } else if (atomicReferenceArray.get(i) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }
}
