package defpackage;

/* renamed from: s1d  reason: default package */
public final class s1d {
    public static final s1d c = new s1d(0, false);
    public final int a;
    public final boolean b;

    public s1d(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1d.class != obj.getClass()) {
            return false;
        }
        s1d s1d = (s1d) obj;
        return this.a == s1d.a && this.b == s1d.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
