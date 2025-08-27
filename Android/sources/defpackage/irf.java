package defpackage;

import java.util.Iterator;

/* renamed from: irf  reason: default package */
public abstract class irf implements Iterator {
    public final Iterator a;

    public irf(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return a(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
