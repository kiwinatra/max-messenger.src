package defpackage;

/* renamed from: h7e  reason: default package */
public final class h7e implements lz7 {
    public final int a;
    public final int b = uva.d;
    public final long c;

    public h7e(int i) {
        this.a = i;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7e) && this.a == ((h7e) obj).a;
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int i() {
        return this.b;
    }

    public final String toString() {
        return wj6.l(new StringBuilder("ShimmerMemberListItem(pos="), this.a, ")");
    }
}
