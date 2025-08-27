package defpackage;

/* renamed from: v2e  reason: default package */
public final class v2e extends j91 {
    public final long b;

    public v2e(long j) {
        super(15);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2e) && this.b == ((v2e) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("EditProfile(id="), this.b, ")");
    }
}
