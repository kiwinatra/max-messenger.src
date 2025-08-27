package defpackage;

/* renamed from: ild  reason: default package */
public final class ild implements lld {
    public final boolean a;

    public ild(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ild) && this.a == ((ild) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Show(openWithAnimation="), this.a, ")");
    }
}
