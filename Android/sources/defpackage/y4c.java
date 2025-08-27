package defpackage;

/* renamed from: y4c  reason: default package */
public final class y4c extends j91 {
    public final long b;
    public final txb c;

    public y4c(long j, txb txb) {
        super(12);
        this.b = j;
        this.c = txb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4c)) {
            return false;
        }
        y4c y4c = (y4c) obj;
        return this.b == y4c.b && this.c == y4c.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
