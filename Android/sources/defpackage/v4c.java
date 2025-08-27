package defpackage;

/* renamed from: v4c  reason: default package */
public final class v4c extends j91 {
    public final long b;

    public v4c(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4c) && this.b == ((v4c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChatAttaches(chatId="), this.b, ")");
    }
}
