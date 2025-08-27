package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: mk5  reason: default package */
public final class mk5 {
    public final String a;
    public final Map b;

    public mk5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static mk5 a(String str) {
        return new mk5(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk5)) {
            return false;
        }
        mk5 mk5 = (mk5) obj;
        return this.a.equals(mk5.a) && this.b.equals(mk5.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
