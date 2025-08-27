package defpackage;

/* renamed from: ac0  reason: default package */
public final class ac0 {
    public final long a;
    public final long b;
    public final aa0 c;

    public ac0(long j, long j2, aa0 aa0) {
        this.a = j;
        this.b = j2;
        this.c = aa0;
    }

    public static ac0 a(long j, long j2, aa0 aa0) {
        boolean z = false;
        bs0.m("duration must be positive value.", j >= 0);
        if (j2 >= 0) {
            z = true;
        }
        bs0.m("bytes must be positive value.", z);
        return new ac0(j, j2, aa0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0 = (ac0) obj;
        return this.a == ac0.a && this.b == ac0.b && this.c.equals(ac0.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
