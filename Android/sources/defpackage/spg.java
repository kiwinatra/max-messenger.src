package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.uuid.Uuid;

/* renamed from: spg  reason: default package */
public final class spg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public final AtomicReferenceArray a = new AtomicReferenceArray(Uuid.SIZE_BITS);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<spg> cls = spg.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public final ndf a(ndf ndf) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return ndf;
        }
        if (ndf.b.b == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, ndf);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final ndf b() {
        ndf ndf;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ndf = (ndf) this.a.getAndSet(i2, (Object) null)) != null) {
                if (ndf.b.b == 1) {
                    e.decrementAndGet(this);
                }
                return ndf;
            }
        }
    }

    public final ndf c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        ndf ndf = (ndf) atomicReferenceArray.get(i2);
        if (ndf != null) {
            boolean z2 = true;
            if (ndf.b.b != 1) {
                z2 = false;
            }
            if (z2 == z) {
                while (!atomicReferenceArray.compareAndSet(i2, ndf, (Object) null)) {
                    if (atomicReferenceArray.get(i2) != ndf) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return ndf;
            }
        }
        return null;
    }
}
