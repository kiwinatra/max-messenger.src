package defpackage;

/* renamed from: clg  reason: default package */
public final class clg extends ehg {
    public final boolean a;

    public clg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clg) && this.a == ((clg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("ShowBackButton(isVisible="), this.a, ")");
    }
}
