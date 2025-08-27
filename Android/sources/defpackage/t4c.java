package defpackage;

/* renamed from: t4c  reason: default package */
public final class t4c extends j91 {
    public final long b;

    public t4c(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4c) && this.b == ((t4c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("AddToFolder(chatId="), this.b, ")");
    }
}
