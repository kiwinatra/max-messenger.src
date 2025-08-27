package defpackage;

/* renamed from: f01  reason: default package */
public final class f01 implements g01 {
    public final long a;
    public final boolean b;

    public f01(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f01)) {
            return false;
        }
        f01 f01 = (f01) obj;
        return this.a == f01.a && this.b == f01.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        return tr1.m(sb, this.b, ")");
    }
}
