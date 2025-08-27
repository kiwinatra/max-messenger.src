package defpackage;

/* renamed from: b0c  reason: default package */
public final class b0c extends j91 {
    public final long b;

    public b0c(long j) {
        super(10);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0c) && this.b == ((b0c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenChat(chatId="), this.b, ")");
    }
}
