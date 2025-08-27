package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c2  reason: default package */
public class c2 extends ayd {
    public final Map a;
    public final /* synthetic */ x1 b;

    public c2(x1 x1Var, Map map) {
        this.b = x1Var;
        map.getClass();
        this.a = map;
    }

    public final void clear() {
        Iterator it = iterator();
        while (true) {
            a2 a2Var = (a2) it;
            if (a2Var.hasNext()) {
                a2Var.next();
                a2Var.remove();
            } else {
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.a.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new a2(this, this.a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.b.v -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    public final int size() {
        return this.a.size();
    }
}
