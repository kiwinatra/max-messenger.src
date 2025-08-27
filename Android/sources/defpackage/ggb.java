package defpackage;

/* renamed from: ggb  reason: default package */
public final class ggb implements hgb {
    public final long a;

    public ggb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggb) && this.a == ((ggb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Success(requestId="), this.a, ")");
    }
}
