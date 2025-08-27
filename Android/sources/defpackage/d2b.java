package defpackage;

/* renamed from: d2b  reason: default package */
public final class d2b {
    public final float a;
    public final int b;

    public d2b(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2b)) {
            return false;
        }
        d2b d2b = (d2b) obj;
        d2b.getClass();
        return Float.compare(this.a, d2b.a) == 0 && Float.compare(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO) == 0 && this.b == d2b.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + g63.c(g63.c(Integer.hashCode(-16745729) * 31, this.a, 31), c44.DEFAULT_ASPECT_RATIO, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorConfig(color=-16745729, topCorners=");
        sb.append(this.a);
        sb.append(", bottomCorners=0.0, height=");
        return wj6.l(sb, this.b, ")");
    }
}
