package defpackage;

/* renamed from: xzb  reason: default package */
public final class xzb extends j91 {
    public final long b;
    public final gzb c;

    public xzb(long j, gzb gzb) {
        super(10);
        this.b = j;
        this.c = gzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzb)) {
            return false;
        }
        xzb xzb = (xzb) obj;
        return this.b == xzb.b && this.c == xzb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
