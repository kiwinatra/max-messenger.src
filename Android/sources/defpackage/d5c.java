package defpackage;

/* renamed from: d5c  reason: default package */
public final class d5c extends j91 {
    public final long b;

    public d5c(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5c) && this.b == ((d5c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Search(chatId="), this.b, ")");
    }
}
