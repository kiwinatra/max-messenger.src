package defpackage;

/* renamed from: d49  reason: default package */
public final class d49 implements g49 {
    public final int a;

    public d49(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d49) && this.a == ((d49) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("OnMemberListActionClicked(id="), this.a, ")");
    }
}
