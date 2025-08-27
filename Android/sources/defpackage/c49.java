package defpackage;

/* renamed from: c49  reason: default package */
public final class c49 implements g49 {
    public final long a;

    public c49(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c49) && this.a == ((c49) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OnMemberClicked(id="), this.a, ")");
    }
}
