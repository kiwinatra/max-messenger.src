package defpackage;

import java.util.Iterator;

/* renamed from: e3h  reason: default package */
public final class e3h implements Iterator {
    public final Iterator a;

    public e3h(f3h f3h) {
        this.a = f3h.a.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
