package defpackage;

/* renamed from: ux1  reason: default package */
public final class ux1 {
    public final boolean a;

    public ux1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux1) && this.a == ((ux1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
