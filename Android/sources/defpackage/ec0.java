package defpackage;

/* renamed from: ec0  reason: default package */
public final class ec0 {
    public final long a;
    public final long b;
    public final long c;

    public ec0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0 = (ec0) obj;
        return this.a == ec0.a && this.b == ec0.b && this.c == ec0.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return wj6.m(sb, this.c, "}");
    }
}
