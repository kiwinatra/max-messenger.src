package defpackage;

import org.apache.http.HttpStatus;

/* renamed from: ej8  reason: default package */
public final class ej8 {
    public final double a = 120.0d;
    public final double b = 0.04d;
    public final double c = 0.04d;
    public final double d = 1000.0d;
    public final double e = 700.0d;
    public final int f = 500;
    public final int g = HttpStatus.SC_MULTIPLE_CHOICES;
    public final boolean h = true;
    public final boolean i = false;
    public final boolean j = false;
    public final boolean k = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej8)) {
            return false;
        }
        ej8 ej8 = (ej8) obj;
        return Double.compare(this.a, ej8.a) == 0 && Double.compare(this.b, ej8.b) == 0 && Double.compare(this.c, ej8.c) == 0 && Double.compare(this.d, ej8.d) == 0 && Double.compare(this.e, ej8.e) == 0 && this.f == ej8.f && this.g == ej8.g && this.h == ej8.h && this.i == ej8.i && this.j == ej8.j && this.k == ej8.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + g63.e(g63.e(g63.e(ryg.a(this.g, ryg.a(this.f, gsg.a(this.e, gsg.a(this.d, gsg.a(this.c, gsg.a(this.b, Double.hashCode(this.a) * 31)))))), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadNetworkCondition(rttThreshold=");
        sb.append(this.a);
        sb.append(", lostPacketsLimitForRttBelowLowBound=");
        sb.append(this.b);
        sb.append(", lostPacketsLimitForRttAboveLowBound=");
        sb.append(this.c);
        sb.append(", rttEnterLevel2Mode=");
        sb.append(this.d);
        sb.append(", rttLeaveLevel2Mode=");
        sb.append(this.e);
        sb.append(", videoBitrateLevel1K=");
        sb.append(this.f);
        sb.append(", videoBitrateLevel2K=");
        sb.append(this.g);
        sb.append(", preferHardwareVPXEncoder=");
        sb.append(this.h);
        sb.append(", limitFrameSize=");
        sb.append(this.i);
        sb.append(", limitBitrate=");
        sb.append(this.j);
        sb.append(", setTemporalLayers=");
        return tr1.m(sb, this.k, ")");
    }
}
