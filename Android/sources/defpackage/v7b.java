package defpackage;

import java.util.Objects;

/* renamed from: v7b  reason: default package */
public final class v7b {
    public final Object a;
    public final Object b;

    public v7b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v7b)) {
            return false;
        }
        v7b v7b = (v7b) obj;
        return Objects.equals(v7b.a, this.a) && Objects.equals(v7b.b, this.b);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
