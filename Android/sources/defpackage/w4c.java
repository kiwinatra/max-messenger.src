package defpackage;

/* renamed from: w4c  reason: default package */
public final class w4c extends j91 {
    public final long b;
    public final ij2 c;

    public w4c(long j, ij2 ij2) {
        super(12);
        this.b = j;
        this.c = ij2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4c)) {
            return false;
        }
        w4c w4c = (w4c) obj;
        return this.b == w4c.b && this.c == w4c.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChatMembers(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
