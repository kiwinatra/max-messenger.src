package defpackage;

/* renamed from: oj5  reason: default package */
public final class oj5 {
    public final long a;
    public final long b;

    public oj5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj5)) {
            return false;
        }
        oj5 oj5 = (oj5) obj;
        return this.a == oj5.a && this.b == oj5.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmNotificationHistoryDb(chatServerId=");
        sb.append(this.a);
        sb.append(", lastNotifyMessageId=");
        return wj6.m(sb, this.b, ")");
    }
}
