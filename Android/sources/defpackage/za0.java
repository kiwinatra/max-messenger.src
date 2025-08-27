package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: za0  reason: default package */
public final class za0 {
    public final String a;
    public final List b;

    public za0(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0 = (za0) obj;
        return this.a.equals(za0.a) && this.b.equals(za0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        return tr1.l(sb, this.b, "}");
    }
}
