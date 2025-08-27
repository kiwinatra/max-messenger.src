package defpackage;

/* renamed from: hj8  reason: default package */
public final class hj8 {
    public final double a;
    public final double b;

    public hj8(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj8)) {
            return false;
        }
        hj8 hj8 = (hj8) obj;
        return Double.compare(this.a, hj8.a) == 0 && Double.compare(this.b, hj8.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NetworkState(roundTripTime=" + this.a + ", lostPacketsFraction=" + this.b + ")";
    }
}
