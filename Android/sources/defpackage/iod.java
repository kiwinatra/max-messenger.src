package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* renamed from: iod  reason: default package */
public abstract class iod extends be3 implements naa {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(iod.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public iod(long j, iod iod, int i) {
        super(iod);
        this.c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean d() {
        return o.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return o.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, CoroutineContext coroutineContext);

    public final void i() {
        if (o.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = o;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
