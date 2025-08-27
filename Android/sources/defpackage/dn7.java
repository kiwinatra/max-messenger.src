package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dn7  reason: default package */
public abstract class dn7 extends u68 implements pq4, oe7 {
    public qn7 o;

    public final x9a b() {
        return null;
    }

    public final void dispose() {
        qn7 qn7 = this.o;
        if (qn7 == null) {
            qn7 = null;
        }
        qn7.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qn7.a;
            Object obj = atomicReferenceFieldUpdater.get(qn7);
            if (obj instanceof dn7) {
                if (obj == this) {
                    m45 m45 = ld9.j;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(qn7, obj, m45)) {
                            if (atomicReferenceFieldUpdater.get(qn7) != obj) {
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((obj instanceof oe7) && ((oe7) obj).b() != null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u68.a;
                    Object obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof o1d) {
                        u68 u68 = ((o1d) obj2).a;
                        return;
                    } else if (obj2 == this) {
                        u68 u682 = (u68) obj2;
                        return;
                    } else {
                        u68 u683 = (u68) obj2;
                        u683.getClass();
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u68.c;
                        o1d o1d = (o1d) atomicReferenceFieldUpdater3.get(u683);
                        if (o1d == null) {
                            o1d = new o1d(u683);
                            atomicReferenceFieldUpdater3.set(u683, o1d);
                        }
                        while (true) {
                            if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, o1d)) {
                                u683.d();
                                return;
                            } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public abstract boolean h();

    public abstract void i(Throwable th);

    public final boolean isActive() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(n79.A(this));
        sb.append("[job@");
        qn7 qn7 = this.o;
        if (qn7 == null) {
            qn7 = null;
        }
        sb.append(n79.A(qn7));
        sb.append(']');
        return sb.toString();
    }
}
