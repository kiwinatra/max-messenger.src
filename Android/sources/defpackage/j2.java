package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: j2  reason: default package */
public final class j2 extends a2 implements ListIterator {
    public final /* synthetic */ k2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var) {
        super((i2) k2Var);
        this.v = k2Var;
    }

    public final void add(Object obj) {
        k2 k2Var = this.v;
        boolean isEmpty = k2Var.isEmpty();
        b().add(obj);
        k2Var.w.v++;
        if (isEmpty) {
            k2Var.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final Object previous() {
        return b().previous();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, int i) {
        super((i2) k2Var, ((List) k2Var.b).listIterator(i));
        this.v = k2Var;
    }
}
