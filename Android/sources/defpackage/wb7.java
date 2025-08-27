package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: wb7  reason: default package */
public abstract class wb7 implements Map, Serializable {
    public static final Map.Entry[] o = new Map.Entry[0];
    public transient dc7 a;
    public transient dc7 b;
    public transient kb7 c;

    public static cs a() {
        return new cs(4);
    }

    public static wb7 b(Map map) {
        if ((map instanceof wb7) && !(map instanceof SortedMap)) {
            wb7 wb7 = (wb7) map;
            if (!wb7.g()) {
                return wb7;
            }
        }
        Set entrySet = map.entrySet();
        cs csVar = new cs(entrySet instanceof Collection ? entrySet.size() : 4);
        csVar.I(entrySet);
        return csVar.h();
    }

    public abstract dc7 c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract dc7 d();

    public abstract kb7 e();

    public final boolean equals(Object obj) {
        return hd8.o(this, obj);
    }

    /* renamed from: f */
    public dc7 entrySet() {
        dc7 dc7 = this.a;
        if (dc7 != null) {
            return dc7;
        }
        dc7 c2 = c();
        this.a = c2;
        return c2;
    }

    public abstract boolean g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public dc7 keySet() {
        dc7 dc7 = this.b;
        if (dc7 != null) {
            return dc7;
        }
        dc7 d = d();
        this.b = d;
        return d;
    }

    public final int hashCode() {
        return ryg.B(entrySet());
    }

    /* renamed from: i */
    public kb7 values() {
        kb7 kb7 = this.c;
        if (kb7 != null) {
            return kb7;
        }
        kb7 e = e();
        this.c = e;
        return e;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        m5a.m(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
