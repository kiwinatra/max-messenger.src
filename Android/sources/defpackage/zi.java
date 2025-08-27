package defpackage;

/* renamed from: zi  reason: default package */
public final class zi {
    public final long a;
    public final int b;

    public zi(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj;
        return this.a == ziVar.a && this.b == ziVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Key(animojiId=" + this.a + ", size=" + this.b + ")";
    }
}
