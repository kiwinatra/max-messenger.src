package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: t1h  reason: default package */
public final class t1h extends LinkedHashMap {
    public static final t1h b;
    public boolean a = true;

    static {
        t1h t1h = new t1h();
        b = t1h;
        t1h.a = false;
    }

    public static t1h a() {
        return b;
    }

    public static int j(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = y0h.a;
            int i = r1;
            for (byte b2 : (byte[]) obj) {
                i = (i * 31) + b2;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof z3h)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        k();
        super.clear();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, t1h] */
    public final t1h e() {
        if (isEmpty()) {
            return new t1h();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.a = true;
        return linkedHashMap;
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void h() {
        this.a = false;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += j(entry.getValue()) ^ j(entry.getKey());
        }
        return i;
    }

    public final boolean i() {
        return this.a;
    }

    public final void k() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        k();
        Charset charset = y0h.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        k();
        for (Object next : map.keySet()) {
            Charset charset = y0h.a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        k();
        return super.remove(obj);
    }
}
