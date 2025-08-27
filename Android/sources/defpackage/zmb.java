package defpackage;

/* renamed from: zmb  reason: default package */
public final class zmb {
    public static final zmb e = new zmb(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zmb(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmb)) {
            return false;
        }
        zmb zmb = (zmb) obj;
        return Float.compare(this.a, zmb.a) == 0 && Float.compare(this.b, zmb.b) == 0 && Float.compare(this.c, zmb.c) == 0 && Float.compare(this.d, zmb.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g63.c(g63.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PipBounds(maxLeftOffset=" + this.a + ", maxRightOffset=" + this.b + ", maxTopOffset=" + this.c + ", maxBottomOffset=" + this.d + ")";
    }
}
