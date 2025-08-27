package defpackage;

/* renamed from: cxb  reason: default package */
public final class cxb extends hxb {
    public final long b;

    public cxb(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxb) && this.b == ((cxb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(id="), this.b, ")");
    }
}
