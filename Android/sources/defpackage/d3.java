package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: d3  reason: default package */
public final class d3 extends hd8 {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public d3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    public final void P(f3 f3Var, f3 f3Var2) {
        this.g.lazySet(f3Var, f3Var2);
    }

    public final void Q(f3 f3Var, Thread thread) {
        this.f.lazySet(f3Var, thread);
    }

    public final boolean g(g3 g3Var, c3 c3Var, c3 c3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(g3Var, c3Var, c3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g3Var) == c3Var);
        return false;
    }

    public final boolean h(g3 g3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(g3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g3Var) == obj);
        return false;
    }

    public final boolean i(g3 g3Var, f3 f3Var, f3 f3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(g3Var, f3Var, f3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g3Var) == f3Var);
        return false;
    }
}
