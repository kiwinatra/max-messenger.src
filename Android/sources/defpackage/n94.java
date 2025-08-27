package defpackage;

/* renamed from: n94  reason: default package */
public final class n94 extends ev0 {
    public final boolean m;

    public n94(boolean z) {
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n94) && this.m == ((n94) obj).m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Switch(isToggled="), this.m, ")");
    }
}
