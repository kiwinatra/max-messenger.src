package defpackage;

/* renamed from: s3  reason: default package */
public final class s3 {
    public final int a;
    public final int b;

    public s3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        s3Var.getClass();
        return this.a == s3Var.a && this.b == s3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + rae.h(this.a, Integer.hashCode(-16745729) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccentColors(themed=-16745729, red=");
        sb.append(this.a);
        sb.append(", secondary=");
        return wj6.l(sb, this.b, ")");
    }
}
