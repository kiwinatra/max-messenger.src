package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a1  reason: default package */
public final class a1 extends hi7 {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public a1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    public final void H(l1 l1Var, l1 l1Var2) {
        this.l.lazySet(l1Var, l1Var2);
    }

    public final void I(l1 l1Var, Thread thread) {
        this.k.lazySet(l1Var, thread);
    }

    public final boolean d(n1 n1Var, y0 y0Var, y0 y0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, y0Var, y0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == y0Var);
        return false;
    }

    public final boolean e(n1 n1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == obj);
        return false;
    }

    public final boolean f(n1 n1Var, l1 l1Var, l1 l1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, l1Var, l1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == l1Var);
        return false;
    }

    public final y0 p(n1 n1Var) {
        return (y0) this.n.getAndSet(n1Var, y0.d);
    }

    public final l1 q(n1 n1Var) {
        return (l1) this.m.getAndSet(n1Var, l1.c);
    }
}
