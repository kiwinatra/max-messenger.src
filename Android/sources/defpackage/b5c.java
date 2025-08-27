package defpackage;

/* renamed from: b5c  reason: default package */
public final class b5c extends j91 {
    public final long b;
    public final txb c;

    public b5c(long j, txb txb) {
        super(12);
        this.b = j;
        this.c = txb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5c)) {
            return false;
        }
        b5c b5c = (b5c) obj;
        return this.b == b5c.b && this.c == b5c.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
