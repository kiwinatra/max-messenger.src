package defpackage;

/* renamed from: bpd  reason: default package */
public final class bpd {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpd) && this.a == ((bpd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Close(isAnimated="), this.a, ")");
    }
}
