package defpackage;

/* renamed from: v41  reason: default package */
public final class v41 implements a51 {
    public final long a;

    public v41(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v41) && this.a == ((v41) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
