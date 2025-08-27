package defpackage;

/* renamed from: w2e  reason: default package */
public final class w2e extends j91 {
    public final long b;

    public w2e(long j) {
        super(15);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2e) && this.b == ((w2e) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ProfileAvatars(id="), this.b, ")");
    }
}
