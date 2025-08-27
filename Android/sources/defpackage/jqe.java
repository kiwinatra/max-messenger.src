package defpackage;

/* renamed from: jqe  reason: default package */
public final class jqe implements kqe {
    public final lqe a;

    public jqe(lqe lqe) {
        this.a = lqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqe) && this.a == ((jqe) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypeChange(newType=" + this.a + ")";
    }
}
