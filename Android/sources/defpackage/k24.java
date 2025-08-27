package defpackage;

/* renamed from: k24  reason: default package */
public final class k24 implements m24 {
    public final long a;

    public k24(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k24) && this.a == ((k24) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
