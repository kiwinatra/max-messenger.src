package defpackage;

/* renamed from: a77  reason: default package */
public final class a77 {
    public final int a;

    public a77(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a77)) {
            return false;
        }
        a77 a77 = (a77) obj;
        a77.getClass();
        return this.a == a77.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Integer.hashCode(-16745729) * 31);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("IconLocalTabbarColors(active=-16745729, inactive="), this.a, ")");
    }
}
