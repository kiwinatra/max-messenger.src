package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b1  reason: default package */
public final class b1 extends kr7 {
    public final AtomicReferenceFieldUpdater Z;
    public final AtomicReferenceFieldUpdater v0;
    public final AtomicReferenceFieldUpdater w0;
    public final AtomicReferenceFieldUpdater x0;
    public final AtomicReferenceFieldUpdater y0;

    public b1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(4);
        this.Z = atomicReferenceFieldUpdater;
        this.v0 = atomicReferenceFieldUpdater2;
        this.w0 = atomicReferenceFieldUpdater3;
        this.x0 = atomicReferenceFieldUpdater4;
        this.y0 = atomicReferenceFieldUpdater5;
    }

    public final void I(m1 m1Var, m1 m1Var2) {
        this.v0.lazySet(m1Var, m1Var2);
    }

    public final void J(m1 m1Var, Thread thread) {
        this.Z.lazySet(m1Var, thread);
    }

    public final boolean j(o1 o1Var, z0 z0Var, z0 z0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.x0;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, z0Var, z0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == z0Var);
        return false;
    }

    public final boolean k(o1 o1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.y0;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == obj);
        return false;
    }

    public final boolean l(o1 o1Var, m1 m1Var, m1 m1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.w0;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, m1Var, m1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == m1Var);
        return false;
    }
}
