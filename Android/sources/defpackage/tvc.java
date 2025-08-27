package defpackage;

/* renamed from: tvc  reason: default package */
public final class tvc implements xvc {
    public final boolean a;

    public tvc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvc) && this.a == ((tvc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("OnTyping(isTyping="), this.a, ")");
    }
}
