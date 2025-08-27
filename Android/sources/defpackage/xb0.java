package defpackage;

/* renamed from: xb0  reason: default package */
public final class xb0 {
    public final yb0 a;
    public final int b;

    public xb0(yb0 yb0, int i) {
        if (yb0 != null) {
            this.a = yb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0 = (xb0) obj;
        return this.a.equals(xb0.a) && this.b == xb0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return wj6.l(sb, this.b, "}");
    }
}
