package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: p08  reason: default package */
public final class p08 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final yi6 b;

    public p08(yi6 yi6, List list) {
        list.getClass();
        this.a = list;
        this.b = yi6;
    }

    public final Object get(int i) {
        return this.b.apply(this.a.get(i));
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new o08(this, this.a.listIterator(i), 0);
    }

    public final Object remove(int i) {
        return this.b.apply(this.a.remove(i));
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}
