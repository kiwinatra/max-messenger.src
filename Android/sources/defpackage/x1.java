package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: x1  reason: default package */
public abstract class x1 extends p2 implements Serializable {
    public final transient Map o;
    public transient int v;

    public x1(Map map) {
        if (map.isEmpty()) {
            this.o = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        b2 c = c();
        this.c = c;
        return c;
    }

    public final void b() {
        Map map = this.o;
        for (Collection clear : map.values()) {
            clear.clear();
        }
        map.clear();
        this.v = 0;
    }

    public b2 c() {
        return new b2(this, this.o);
    }

    public abstract Collection d();

    public c2 e() {
        return new c2(this, this.o);
    }

    public final List f(Object obj) {
        Collection collection = (Collection) this.o.get(obj);
        if (collection == null) {
            collection = d();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new k2(this, obj, list, (i2) null) : new k2(this, obj, list, (i2) null);
    }

    public final boolean g(Object obj, Object obj2) {
        Map map = this.o;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection d = d();
            if (d.add(obj2)) {
                this.v++;
                map.put(obj, d);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.v++;
            return true;
        }
    }

    public final o2 h() {
        o2 o2Var = this.b;
        if (o2Var != null) {
            return o2Var;
        }
        o2 o2Var2 = new o2(0, this);
        this.b = o2Var2;
        return o2Var2;
    }
}
