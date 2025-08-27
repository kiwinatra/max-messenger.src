package defpackage;

/* renamed from: cqc  reason: default package */
public final class cqc extends eqc {
    public final long a;
    public final long b;

    public cqc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqc)) {
            return false;
        }
        cqc cqc = (cqc) obj;
        return this.a == cqc.a && this.b == cqc.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return wj6.m(sb, this.b, ")");
    }
}
