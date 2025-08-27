package defpackage;

/* renamed from: wgg  reason: default package */
public final class wgg extends xgg {
    public final long a;

    public wgg(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgg) && this.a == ((wgg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
