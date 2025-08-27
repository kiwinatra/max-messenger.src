package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: x77  reason: default package */
public final class x77 implements t9d {
    public final Map a;

    public x77(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x77.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((x77) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
