package defpackage;

import java.io.Serializable;

/* renamed from: e5d  reason: default package */
public final class e5d extends f5b implements Serializable {
    public final f5b a;

    public e5d(f5b f5b) {
        f5b.getClass();
        this.a = f5b;
    }

    public final f5b b() {
        return this.a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e5d) {
            return this.a.equals(((e5d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
