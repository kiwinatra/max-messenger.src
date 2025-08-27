package defpackage;

/* renamed from: qzd  reason: default package */
public final class qzd implements tzd {
    public final long a;

    public qzd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzd) && this.a == ((qzd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
