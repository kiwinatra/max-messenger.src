package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bc0  reason: default package */
public final class bc0 {
    public final lzf a;
    public final Map b;

    public bc0(lzf lzf, HashMap hashMap) {
        this.a = lzf;
        this.b = hashMap;
    }

    public final long a(tub tub, long j, int i) {
        long a2 = j - this.a.a();
        cc0 cc0 = (cc0) this.b.get(tub);
        long j2 = cc0.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j2 > 1 ? j2 : 2) * ((long) i2))))), a2), cc0.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0 = (bc0) obj;
        return this.a.equals(bc0.a) && this.b.equals(bc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
