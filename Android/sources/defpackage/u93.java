package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: u93  reason: default package */
public final class u93 extends f5b implements Serializable {
    public final Comparator a;

    public u93(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u93) {
            return this.a.equals(((u93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
