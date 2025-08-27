package defpackage;

/* renamed from: dj5  reason: default package */
public final class dj5 {
    public final long a;
    public final long b;

    public dj5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj5)) {
            return false;
        }
        dj5 dj5 = (dj5) obj;
        return this.a == dj5.a && this.b == dj5.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsRemovedEntry(chatId=");
        sb.append(this.a);
        sb.append(", messageId=");
        return wj6.m(sb, this.b, ")");
    }
}
