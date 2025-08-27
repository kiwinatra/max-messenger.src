package defpackage;

/* renamed from: e81  reason: default package */
public final class e81 implements f81 {
    public final boolean a;

    public e81(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e81) && this.a == ((e81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("End(isCallAccepted="), this.a, ")");
    }
}
