package defpackage;

import java.util.Map;

/* renamed from: l2  reason: default package */
public abstract class l2 implements Map.Entry {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return cjf.n(getKey(), entry.getKey()) && cjf.n(getValue(), entry.getValue());
    }

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
