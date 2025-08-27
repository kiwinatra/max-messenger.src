package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: c7a  reason: default package */
public final class c7a implements t9d {
    public final Map a;

    public c7a(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c7a.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c7a) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "NetworkStatusNotification{networkStatus=" + this.a + '}';
    }
}
