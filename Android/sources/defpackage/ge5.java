package defpackage;

/* renamed from: ge5  reason: default package */
public final class ge5 implements me5 {
    public final fe5 b;

    public ge5(fe5 fe5) {
        this.b = fe5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge5) && this.b == ((ge5) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + this.b + ")";
    }
}
