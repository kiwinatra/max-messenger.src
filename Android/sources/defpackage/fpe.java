package defpackage;

/* renamed from: fpe  reason: default package */
public final class fpe {
    public final boolean a;

    public fpe(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpe) && this.a == ((fpe) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
