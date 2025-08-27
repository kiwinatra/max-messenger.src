package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: y1  reason: default package */
public final class y1 implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator o = hm7.a;
    public final /* synthetic */ x1 v;

    public y1(x1 x1Var) {
        this.v = x1Var;
        this.a = x1Var.o.entrySet().iterator();
    }

    public final Object a(Object obj, Object obj2) {
        return obj2;
    }

    public final boolean hasNext() {
        return this.a.hasNext() || this.o.hasNext();
    }

    public final Object next() {
        if (!this.o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.o = collection.iterator();
        }
        return this.o.next();
    }

    public final void remove() {
        this.o.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        x1 x1Var = this.v;
        x1Var.v--;
    }
}
