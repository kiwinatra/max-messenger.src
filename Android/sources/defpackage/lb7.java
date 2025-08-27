package defpackage;

/* renamed from: lb7  reason: default package */
public final class lb7 extends q1 implements vga {
    public final double a;

    public lb7(double d) {
        this.a = d;
    }

    public final lb7 B() {
        return this;
    }

    public final String b() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        int g = ((q1) c1g).g();
        if (g == 0) {
            throw null;
        } else if (g != 4) {
            return false;
        } else {
            return this.a == c1g.r().a;
        }
    }

    public final int g() {
        return 4;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final lb7 r() {
        return this;
    }

    public final String toString() {
        return Double.toString(this.a);
    }
}
