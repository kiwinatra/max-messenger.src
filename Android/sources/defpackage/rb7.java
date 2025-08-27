package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: rb7  reason: default package */
public final class rb7 extends tb7 {
    public final transient tb7 c;

    public rb7(tb7 tb7) {
        this.c = tb7;
    }

    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    public final Object get(int i) {
        tb7 tb7 = this.c;
        b0h.g(i, tb7.size());
        return tb7.get((tb7.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        tb7 tb7 = this.c;
        int lastIndexOf = tb7.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (tb7.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean l() {
        return this.c.l();
    }

    public final int lastIndexOf(Object obj) {
        tb7 tb7 = this.c;
        int indexOf = tb7.indexOf(obj);
        if (indexOf >= 0) {
            return (tb7.size() - 1) - indexOf;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int size() {
        return this.c.size();
    }

    public final tb7 w() {
        return this.c;
    }

    /* renamed from: y */
    public final tb7 subList(int i, int i2) {
        tb7 tb7 = this.c;
        b0h.j(i, i2, tb7.size());
        return tb7.subList(tb7.size() - i2, tb7.size() - i).w();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
