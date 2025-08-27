package defpackage;

/* renamed from: qz6  reason: default package */
public final class qz6 extends tz6 {
    public final boolean a;

    public qz6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz6) && this.a == ((qz6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Missing(isMissing="), this.a, ")");
    }
}
