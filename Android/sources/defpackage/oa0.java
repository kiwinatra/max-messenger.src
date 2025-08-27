package defpackage;

/* renamed from: oa0  reason: default package */
public final class oa0 {
    public final nb0 a;
    public final nb0 b;

    public oa0(nb0 nb0, nb0 nb02) {
        this.a = nb0;
        this.b = nb02;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0 = (oa0) obj;
        return this.a.equals(oa0.a) && this.b.equals(oa0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
