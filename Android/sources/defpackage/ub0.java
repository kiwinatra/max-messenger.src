package defpackage;

/* renamed from: ub0  reason: default package */
public final class ub0 {
    public final ez4 a;
    public final ez4 b;
    public final int c;
    public final int d;

    public ub0(ez4 ez4, ez4 ez42, int i, int i2) {
        this.a = ez4;
        this.b = ez42;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0 = (ub0) obj;
        return this.a.equals(ub0.a) && this.b.equals(ub0.b) && this.c == ub0.c && this.d == ub0.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return wj6.l(sb, this.d, "}");
    }
}
