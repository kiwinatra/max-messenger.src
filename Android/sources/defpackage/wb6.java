package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: wb6  reason: default package */
public abstract class wb6 extends kr7 implements Map {
    public abstract Map T();

    public final boolean U(Object obj) {
        irf irf = new irf(entrySet().iterator());
        if (obj == null) {
            while (irf.hasNext()) {
                if (irf.next() == null) {
                    return true;
                }
            }
        } else {
            while (irf.hasNext()) {
                if (obj.equals(irf.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void clear() {
        T().clear();
    }

    public boolean containsKey(Object obj) {
        return T().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return U(obj);
    }

    public Set entrySet() {
        return T().entrySet();
    }

    public Object get(Object obj) {
        return T().get(obj);
    }

    public boolean isEmpty() {
        return T().isEmpty();
    }

    public Set keySet() {
        return T().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return T().put(obj, obj2);
    }

    public final void putAll(Map map) {
        T().putAll(map);
    }

    public final Object remove(Object obj) {
        return T().remove(obj);
    }

    public int size() {
        return T().size();
    }

    public final Collection values() {
        return T().values();
    }
}
