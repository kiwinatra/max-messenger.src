package defpackage;

/* renamed from: mj8  reason: default package */
public final class mj8 implements vj8 {
    public final boolean a;

    public mj8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj8) && this.a == ((mj8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Close(withClear="), this.a, ")");
    }
}
