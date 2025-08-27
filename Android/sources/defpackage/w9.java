package defpackage;

/* renamed from: w9  reason: default package */
public final class w9 {
    public final long a;
    public final long b;

    public w9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return this.a == w9Var.a && this.b == w9Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
