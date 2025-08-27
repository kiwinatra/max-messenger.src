package defpackage;

/* renamed from: ea1  reason: default package */
public final class ea1 extends ka1 {
    public final p0g a;

    public ea1(p0g p0g) {
        this.a = p0g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea1) && this.a == ((ea1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(state=" + this.a + ")";
    }
}
