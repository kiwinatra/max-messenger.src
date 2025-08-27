package defpackage;

import java.util.Set;

/* renamed from: cc0  reason: default package */
public final class cc0 {
    public final long a;
    public final long b;
    public final Set c;

    public cc0(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0 = (cc0) obj;
        return this.a == cc0.a && this.b == cc0.b && this.c.equals(cc0.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
