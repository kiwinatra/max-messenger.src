package defpackage;

/* renamed from: ghb  reason: default package */
public final class ghb {
    public final boolean a;

    public ghb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghb) && this.a == ((ghb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("OnlineStatus(isOnline="), this.a, ")");
    }
}
