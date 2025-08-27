package defpackage;

/* renamed from: db9  reason: default package */
public final class db9 implements fb9 {
    public final long a;
    public final long b;

    public db9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db9)) {
            return false;
        }
        db9 db9 = (db9) obj;
        return this.a == db9.a && this.b == db9.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByRange(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return wj6.m(sb, this.b, ")");
    }
}
