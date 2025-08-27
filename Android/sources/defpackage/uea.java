package defpackage;

/* renamed from: uea  reason: default package */
public final class uea {
    public final long a;
    public final long b;

    public uea(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uea)) {
            return false;
        }
        uea uea = (uea) obj;
        return this.a == uea.a && this.b == uea.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationReadMarkDb(chatServerId=");
        sb.append(this.a);
        sb.append(", mark=");
        return wj6.m(sb, this.b, ")");
    }
}
