package defpackage;

/* renamed from: qy5  reason: default package */
public final class qy5 implements ty5 {
    public final boolean a;

    public qy5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy5) && this.a == ((qy5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Close(afterCreate="), this.a, ")");
    }
}
