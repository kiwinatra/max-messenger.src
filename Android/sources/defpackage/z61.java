package defpackage;

/* renamed from: z61  reason: default package */
public final class z61 implements a71 {
    public final long a;

    public z61(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && this.a == ((z61) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
