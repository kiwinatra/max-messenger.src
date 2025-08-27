package defpackage;

import java.io.Serializable;

/* renamed from: s58  reason: default package */
public final class s58 implements Serializable {
    public static final s58 x = new s58(1.401298464324817E-45d, 1.401298464324817E-45d, 0.0d, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
    public final double a;
    public final double b;
    public final double c;
    public final float o;
    public final float v;
    public final float w;

    public s58(double d, double d2, double d3, float f, float f2, float f3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.o = f;
        this.v = f2;
        this.w = f3;
    }

    public final boolean a() {
        return (this.a == 1.401298464324817E-45d || this.b == 1.401298464324817E-45d) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s58.class != obj.getClass()) {
            return false;
        }
        s58 s58 = (s58) obj;
        if (Double.compare(s58.a, this.a) == 0 && Double.compare(s58.b, this.b) == 0 && Double.compare(s58.c, this.c) == 0 && Float.compare(s58.o, this.o) == 0 && Float.compare(s58.v, this.v) == 0) {
            return Float.compare(s58.w, this.w) == 0;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i = ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31;
        float f = this.o;
        int i2 = 0;
        int floatToIntBits = (i + (f != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.v;
        int floatToIntBits2 = (floatToIntBits + (f2 != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.w;
        if (f3 != c44.DEFAULT_ASPECT_RATIO) {
            i2 = Float.floatToIntBits(f3);
        }
        return floatToIntBits2 + i2;
    }

    public final String toString() {
        return "LocationData{latitude=" + this.a + ", longitude=" + this.b + ", altitude=" + this.c + ", accuracy=" + this.o + ", bearing=" + this.v + ", speed=" + this.w + "}";
    }

    public s58(double d, double d2) {
        this.a = d;
        this.b = d2;
        this.c = 0.0d;
        this.o = c44.DEFAULT_ASPECT_RATIO;
        this.v = c44.DEFAULT_ASPECT_RATIO;
        this.w = c44.DEFAULT_ASPECT_RATIO;
    }
}
