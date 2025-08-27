package defpackage;

/* renamed from: dwc  reason: default package */
public final class dwc implements gwc {
    public final boolean a;

    public dwc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwc) && this.a == ((dwc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Pause(isForced="), this.a, ")");
    }
}
