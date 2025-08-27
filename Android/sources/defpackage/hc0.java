package defpackage;

import android.util.Range;
import android.util.Size;

/* renamed from: hc0  reason: default package */
public final class hc0 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final vy4 b;
    public final Range c;
    public final je3 d;
    public final boolean e;

    public hc0(Size size, vy4 vy4, Range range, je3 je3, boolean z) {
        this.a = size;
        this.b = vy4;
        this.c = range;
        this.d = je3;
        this.e = z;
    }

    public final q13 a() {
        q13 q13 = new q13();
        q13.b = this.a;
        q13.c = this.b;
        q13.o = this.c;
        q13.v = this.d;
        q13.w = Boolean.valueOf(this.e);
        return q13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0 = (hc0) obj;
        if (this.a.equals(hc0.a) && this.b.equals(hc0.b) && this.c.equals(hc0.c)) {
            je3 je3 = hc0.d;
            je3 je32 = this.d;
            if (je32 != null ? je32.equals(je3) : je3 == null) {
                if (this.e == hc0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        je3 je3 = this.d;
        return (this.e ? 1231 : 1237) ^ ((hashCode ^ (je3 == null ? 0 : je3.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return tr1.m(sb, this.e, "}");
    }
}
