package defpackage;

/* renamed from: jq2  reason: default package */
public final class jq2 extends j91 {
    public final long b;

    public jq2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq2) && this.b == ((jq2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(chatId="), this.b, ")");
    }
}
