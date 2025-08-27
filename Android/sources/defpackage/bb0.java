package defpackage;

/* renamed from: bb0  reason: default package */
public final class bb0 {
    public final qb0 a;
    public final int b;

    public bb0(qb0 qb0, int i) {
        if (qb0 != null) {
            this.a = qb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb0)) {
            return false;
        }
        bb0 bb0 = (bb0) obj;
        return this.a.equals(bb0.a) && this.b == bb0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return wj6.l(sb, this.b, "}");
    }
}
