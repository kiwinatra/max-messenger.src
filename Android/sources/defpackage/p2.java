package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: p2  reason: default package */
public abstract class p2 {
    public transient Set a;
    public transient o2 b;
    public transient Map c;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2) {
            return ((x1) this).a().equals(((x1) ((p2) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
