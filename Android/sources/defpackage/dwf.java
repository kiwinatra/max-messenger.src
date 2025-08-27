package defpackage;

/* renamed from: dwf  reason: default package */
public final class dwf implements ewf {
    public final long a;

    public dwf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwf) && this.a == ((dwf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("MarkAsUnreadEvent(mark="), this.a, ")");
    }
}
