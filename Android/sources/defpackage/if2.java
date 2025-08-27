package defpackage;

/* renamed from: if2  reason: default package */
public final class if2 extends mf2 {
    public final long b;
    public final long c;

    public if2(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2 = (if2) obj;
        return this.b == if2.b && this.c == if2.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMessage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return wj6.m(sb, this.c, ")");
    }
}
