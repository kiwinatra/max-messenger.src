package defpackage;

/* renamed from: j8e  reason: default package */
public final class j8e implements dk9 {
    public final long a;

    public j8e(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8e) && this.a == ((j8e) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ShowEditMessage(messageId="), this.a, ")");
    }
}
