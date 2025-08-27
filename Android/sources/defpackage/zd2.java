package defpackage;

/* renamed from: zd2  reason: default package */
public final class zd2 implements fe2 {
    public final long a;

    public zd2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd2) && this.a == ((zd2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Add(messageId="), this.a, ")");
    }
}
