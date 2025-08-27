package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.io.ConstantsKt;

/* renamed from: the  reason: default package */
public final class the implements ebe {
    public static final Object X = new Object();
    public static final int z = Integer.getInteger("jctools.spsc.max.lookahead.step", ConstantsKt.DEFAULT_BLOCK_SIZE).intValue();
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int o;
    public AtomicReferenceArray v;
    public final int w;
    public AtomicReferenceArray x;
    public final AtomicLong y = new AtomicLong();

    public the(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.v = atomicReferenceArray;
        this.o = i2;
        this.b = Math.min(numberOfLeadingZeros / 4, z);
        this.x = atomicReferenceArray;
        this.w = i2;
        this.c = (long) (numberOfLeadingZeros - 2);
        atomicLong.lazySet(0);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.a.get() == this.y.get();
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.v;
            AtomicLong atomicLong = this.a;
            long j = atomicLong.get();
            int i = this.o;
            int i2 = ((int) j) & i;
            if (j < this.c) {
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.b) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.c = j2 - 1;
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j3);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.v = atomicReferenceArray2;
            this.c = (j + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, X);
            atomicLong.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.x;
        AtomicLong atomicLong = this.y;
        long j = atomicLong.get();
        int i = this.w;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z2 = obj == X;
        if (obj != null && !z2) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            atomicLong.lazySet(j + 1);
            return obj;
        } else if (!z2) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.x = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i2);
            if (obj2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                atomicLong.lazySet(j + 1);
            }
            return obj2;
        }
    }
}
