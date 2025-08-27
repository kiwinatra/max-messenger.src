package defpackage;

/* renamed from: u7b  reason: default package */
public final class u7b {
    public final Object a;
    public final Object b;

    public u7b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u7b.class != obj.getClass()) {
            return false;
        }
        u7b u7b = (u7b) obj;
        Object obj2 = u7b.a;
        Object obj3 = this.a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = u7b.b;
        Object obj5 = this.b;
        return obj5 != null ? obj5.equals(obj4) : obj4 == null;
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Pair{first=" + this.a + ", second=" + this.b + '}';
    }
}
