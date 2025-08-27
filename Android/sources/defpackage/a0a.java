package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: a0a  reason: default package */
public final class a0a extends mrd implements xz9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(a0a.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public a0a(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : cvg.e;
    }

    public final Object d(Continuation continuation) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean z;
        int i2;
        while (true) {
            atomicIntegerFieldUpdater = mrd.g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            i = this.a;
            if (i3 > i) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i2, i));
            } else if (i3 <= 0) {
                z = true;
                break;
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                h.set(this, (Object) null);
                z = false;
                break;
            }
        }
        if (!z) {
            return Unit.INSTANCE;
        }
        if (z) {
            lw1 w = cvg.w(IntrinsicsKt.intercepted(continuation));
            try {
                zz9 zz9 = new zz9(this, w);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= i) {
                        if (andDecrement > 0) {
                            zz9.l(Unit.INSTANCE, this.b);
                            break;
                        } else if (b(zz9)) {
                            break;
                        }
                    }
                }
                Object t = w.t();
                if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    t = Unit.INSTANCE;
                }
                return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
            } catch (Throwable th) {
                w.B();
                throw th;
            }
        } else if (!z) {
            throw new IllegalStateException("unexpected".toString());
        } else {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
    }

    public final void e(Object obj) {
        while (Math.max(mrd.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            bpa bpa = cvg.e;
            if (obj2 != bpa) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bpa)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(n79.A(this));
        sb.append("[isLocked=");
        boolean z = false;
        if (Math.max(mrd.g.get(this), 0) == 0) {
            z = true;
        }
        sb.append(z);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
