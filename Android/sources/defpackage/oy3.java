package defpackage;

/* renamed from: oy3  reason: default package */
public final class oy3 implements ry3 {
    public final int a;

    public oy3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy3) && this.a == ((oy3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Seeking(progress="), this.a, ")");
    }
}
