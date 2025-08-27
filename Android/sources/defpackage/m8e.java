package defpackage;

/* renamed from: m8e  reason: default package */
public final class m8e implements dk9 {
    public final long a;

    public m8e(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8e) && this.a == ((m8e) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ShowReply(messageId="), this.a, ")");
    }
}
