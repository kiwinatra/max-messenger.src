package defpackage;

/* renamed from: a0c  reason: default package */
public final class a0c extends j91 {
    public final long b;

    public a0c(long j) {
        super(10);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0c) && this.b == ((a0c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("InviteByLink(id="), this.b, ")");
    }
}
