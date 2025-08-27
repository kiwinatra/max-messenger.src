package defpackage;

/* renamed from: lq2  reason: default package */
public final class lq2 extends j91 {
    public final long b;

    public lq2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq2) && this.b == ((lq2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenChatAndUpdateBackstack(chatId="), this.b, ")");
    }
}
