package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: b2  reason: default package */
public class b2 extends AbstractMap {
    public transient z1 a;
    public transient o2 b;
    public final transient Map c;
    public final /* synthetic */ x1 o;

    public b2(x1 x1Var, Map map) {
        this.o = x1Var;
        this.c = map;
    }

    public final mb7 a(Map.Entry entry) {
        Object key = entry.getKey();
        x1 x1Var = this.o;
        x1Var.getClass();
        List list = (List) ((Collection) entry.getValue());
        return new mb7(key, list instanceof RandomAccess ? new k2(x1Var, key, list, (i2) null) : new k2(x1Var, key, list, (i2) null));
    }

    public final void clear() {
        x1 x1Var = this.o;
        if (this.c == x1Var.o) {
            x1Var.b();
            return;
        }
        a2 a2Var = new a2(this);
        while (a2Var.hasNext()) {
            a2Var.next();
            a2Var.remove();
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Set entrySet() {
        z1 z1Var = this.a;
        if (z1Var != null) {
            return z1Var;
        }
        z1 z1Var2 = new z1(this);
        this.a = z1Var2;
        return z1Var2;
    }

    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        x1 x1Var = this.o;
        x1Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new k2(x1Var, obj, list, (i2) null) : new k2(x1Var, obj, list, (i2) null);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public Set keySet() {
        x1 x1Var = this.o;
        Set set = x1Var.a;
        if (set != null) {
            return set;
        }
        c2 e = x1Var.e();
        x1Var.a = e;
        return e;
    }

    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        x1 x1Var = this.o;
        Collection d = x1Var.d();
        d.addAll(collection);
        x1Var.v -= collection.size();
        collection.clear();
        return d;
    }

    public final int size() {
        return this.c.size();
    }

    public final String toString() {
        return this.c.toString();
    }

    public final Collection values() {
        o2 o2Var = this.b;
        if (o2Var != null) {
            return o2Var;
        }
        o2 o2Var2 = new o2(this);
        this.b = o2Var2;
        return o2Var2;
    }
}
