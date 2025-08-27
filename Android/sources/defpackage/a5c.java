package defpackage;

/* renamed from: a5c  reason: default package */
public final class a5c extends j91 {
    public final long b;
    public final txb c;
    public final boolean d;

    public a5c(long j, txb txb, boolean z) {
        super(12);
        this.b = j;
        this.c = txb;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5c)) {
            return false;
        }
        a5c a5c = (a5c) obj;
        return this.b == a5c.b && this.c == a5c.c && this.d == a5c.d;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return Boolean.hashCode(this.d) + ((hashCode + (Long.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenCall(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", isVideo=");
        return tr1.m(sb, this.d, ")");
    }
}
