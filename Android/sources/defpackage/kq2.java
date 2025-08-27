package defpackage;

/* renamed from: kq2  reason: default package */
public final class kq2 extends j91 {
    public final long b;

    public kq2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq2) && this.b == ((kq2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenChangeChannelTypeAndUpdateBackstack(chatId="), this.b, ")");
    }
}
