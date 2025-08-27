package defpackage;

/* renamed from: fgb  reason: default package */
public final class fgb implements hgb {
    public final long a;

    public fgb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgb) && this.a == ((fgb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
