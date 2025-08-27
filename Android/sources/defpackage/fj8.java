package defpackage;

import androidx.work.WorkRequest;

/* renamed from: fj8  reason: default package */
public final class fj8 {
    public final double a = 90.0d;
    public final double b = 0.02d;
    public final double c = 700.0d;
    public final double d = 0.02d;
    public final long e = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj8)) {
            return false;
        }
        fj8 fj8 = (fj8) obj;
        return Double.compare(this.a, fj8.a) == 0 && Double.compare(this.b, fj8.b) == 0 && Double.compare(this.c, fj8.c) == 0 && Double.compare(this.d, fj8.d) == 0 && this.e == fj8.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + gsg.a(this.d, gsg.a(this.c, gsg.a(this.b, Double.hashCode(this.a) * 31)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodNetworkCondition(rttLowBound=");
        sb.append(this.a);
        sb.append(", lostPacketsLimitForRttLowBound=");
        sb.append(this.b);
        sb.append(", rttHighBound=");
        sb.append(this.c);
        sb.append(", lostPacketsLimitForRttHighBound=");
        sb.append(this.d);
        sb.append(", recoveryTimeoutMs=");
        return wj6.m(sb, this.e, ")");
    }
}
