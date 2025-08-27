package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: yxg  reason: default package */
public abstract class yxg implements Map, Serializable {
    public transient eyg a;
    public transient hyg b;
    public transient jyg c;

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        jyg jyg = this.c;
        if (jyg == null) {
            kyg kyg = (kyg) this;
            jyg jyg2 = new jyg(kyg.v, 1, kyg.w);
            this.c = jyg2;
            jyg = jyg2;
        }
        return jyg.contains(obj);
    }

    public final Set entrySet() {
        eyg eyg = this.a;
        if (eyg != null) {
            return eyg;
        }
        kyg kyg = (kyg) this;
        eyg eyg2 = new eyg(kyg, kyg.v, kyg.w);
        this.a = eyg2;
        return eyg2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        eyg eyg = this.a;
        if (eyg == null) {
            kyg kyg = (kyg) this;
            eyg eyg2 = new eyg(kyg, kyg.v, kyg.w);
            this.a = eyg2;
            eyg = eyg2;
        }
        Iterator it = eyg.iterator();
        int i = 0;
        while (true) {
            nxg nxg = (nxg) it;
            if (!nxg.hasNext()) {
                return i;
            }
            Object next = nxg.next();
            i += next != null ? next.hashCode() : 0;
        }
    }

    public final boolean isEmpty() {
        return ((kyg) this).size() == 0;
    }

    public final Set keySet() {
        hyg hyg = this.b;
        if (hyg != null) {
            return hyg;
        }
        kyg kyg = (kyg) this;
        hyg hyg2 = new hyg(kyg, new jyg(kyg.v, 0, kyg.w));
        this.b = hyg2;
        return hyg2;
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
        int size = ((kyg) this).size();
        if (size >= 0) {
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
        throw new IllegalArgumentException(wj6.h(size, "size cannot be negative but was: "));
    }

    public final Collection values() {
        jyg jyg = this.c;
        if (jyg != null) {
            return jyg;
        }
        kyg kyg = (kyg) this;
        jyg jyg2 = new jyg(kyg.v, 1, kyg.w);
        this.c = jyg2;
        return jyg2;
    }
}
