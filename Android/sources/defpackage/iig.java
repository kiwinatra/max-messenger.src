package defpackage;

/* renamed from: iig  reason: default package */
public final class iig implements tig {
    public final boolean a;

    public iig(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iig) && this.a == ((iig) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("CloseScreen(isFromBridge="), this.a, ")");
    }
}
