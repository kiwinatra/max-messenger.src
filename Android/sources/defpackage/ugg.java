package defpackage;

/* renamed from: ugg  reason: default package */
public final class ugg extends xgg {
    public final long a;

    public ugg(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugg) && this.a == ((ugg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Cancelled(requestId="), this.a, ")");
    }
}
