package defpackage;

/* renamed from: pk9  reason: default package */
public final class pk9 implements qk9 {
    public final long a;

    public pk9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk9) && this.a == ((pk9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("SetRepliedMessage(messageId="), this.a, ")");
    }
}
