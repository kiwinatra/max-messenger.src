package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: k2  reason: default package */
public class k2 extends i2 implements List {
    public final /* synthetic */ x1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k2(x1 x1Var, Object obj, List list, i2 i2Var) {
        super(x1Var, obj, list, i2Var);
        this.w = x1Var;
    }

    public final void add(int i, Object obj) {
        d();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.w.v++;
        if (isEmpty) {
            b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.w.v += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final Object get(int i) {
        d();
        return ((List) this.b).get(i);
    }

    public final int indexOf(Object obj) {
        d();
        return ((List) this.b).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        d();
        return new j2(this);
    }

    public final Object remove(int i) {
        d();
        Object remove = ((List) this.b).remove(i);
        x1 x1Var = this.w;
        x1Var.v--;
        e();
        return remove;
    }

    public final Object set(int i, Object obj) {
        d();
        return ((List) this.b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        d();
        List subList = ((List) this.b).subList(i, i2);
        i2 i2Var = this.c;
        if (i2Var == null) {
            i2Var = this;
        }
        x1 x1Var = this.w;
        x1Var.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.a;
        return z ? new k2(x1Var, obj, subList, i2Var) : new k2(x1Var, obj, subList, i2Var);
    }

    public final ListIterator listIterator(int i) {
        d();
        return new j2(this, i);
    }
}
