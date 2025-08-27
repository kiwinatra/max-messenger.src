package defpackage;

/* renamed from: e49  reason: default package */
public final class e49 implements g49 {
    public final long a;

    public e49(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e49) && this.a == ((e49) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OnOwnerClicked(id="), this.a, ")");
    }
}
