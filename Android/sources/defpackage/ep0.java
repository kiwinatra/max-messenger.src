package defpackage;

/* renamed from: ep0  reason: default package */
public final class ep0 implements fp0 {
    public final long a;

    public ep0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep0) && this.a == ((ep0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
