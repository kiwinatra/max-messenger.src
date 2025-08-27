package defpackage;

/* renamed from: iqe  reason: default package */
public final class iqe implements kqe {
    public final boolean a;

    public iqe(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqe) && this.a == ((iqe) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
