package defpackage;

/* renamed from: vn1  reason: default package */
public final class vn1 {
    public final boolean a;

    public vn1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn1) && this.a == ((vn1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("PromotionApproved(approved="), this.a, ")");
    }
}
