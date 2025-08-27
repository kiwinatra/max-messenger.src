package defpackage;

/* renamed from: bqc  reason: default package */
public final class bqc extends eqc {
    public final long a;
    public final long b;

    public bqc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqc)) {
            return false;
        }
        bqc bqc = (bqc) obj;
        return this.a == bqc.a && this.b == bqc.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedDownload(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return wj6.m(sb, this.b, ")");
    }
}
