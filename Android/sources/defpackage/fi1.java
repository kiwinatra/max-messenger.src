package defpackage;

/* renamed from: fi1  reason: default package */
public final class fi1 extends ji1 {
    public final boolean b;

    public fi1(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi1) && this.b == ((fi1) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("ShareScreen(isEnabled="), this.b, ")");
    }
}
