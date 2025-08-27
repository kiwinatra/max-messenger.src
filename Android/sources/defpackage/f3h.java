package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: f3h  reason: default package */
public final class f3h extends AbstractList implements RandomAccess, c1h {
    public final c1h a;

    public f3h(c1h c1h) {
        this.a = c1h;
    }

    public final c1h a() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((b1h) this.a).get(i);
    }

    public final List i() {
        return this.a.i();
    }

    public final Iterator iterator() {
        return new e3h(this);
    }

    public final void j(fzg fzg) {
        throw new UnsupportedOperationException();
    }

    public final Object k(int i) {
        return this.a.k(i);
    }

    public final ListIterator listIterator(int i) {
        return new d3h(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
