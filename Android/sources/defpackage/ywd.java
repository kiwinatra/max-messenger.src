package defpackage;

/* renamed from: ywd  reason: default package */
public final class ywd implements zwd {
    public final int a;

    public ywd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywd) && this.a == ((ywd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Room(id="), this.a, ")");
    }
}
