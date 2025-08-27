package defpackage;

/* renamed from: wa0  reason: default package */
public final class wa0 {
    public static final wa0 c = new wa0(yb0.j, 0);
    public final yb0 a;
    public final int b;

    public wa0(yb0 yb0, int i) {
        if (yb0 != null) {
            this.a = yb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0 = (wa0) obj;
        return this.a.equals(wa0.a) && this.b == wa0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return wj6.l(sb, this.b, "}");
    }
}
