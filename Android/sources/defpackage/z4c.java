package defpackage;

/* renamed from: z4c  reason: default package */
public final class z4c extends j91 {
    public final long b;

    public z4c(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4c) && this.b == ((z4c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("InviteByLink(chatId="), this.b, ")");
    }
}
