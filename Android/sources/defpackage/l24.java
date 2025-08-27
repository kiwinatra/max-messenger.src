package defpackage;

/* renamed from: l24  reason: default package */
public final class l24 implements m24 {
    public final long a;
    public final long b;

    public l24(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l24)) {
            return false;
        }
        l24 l24 = (l24) obj;
        return this.a == l24.a && this.b == l24.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(requestId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return wj6.m(sb, this.b, ")");
    }
}
