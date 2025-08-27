package defpackage;

/* renamed from: a8c  reason: default package */
public final class a8c {
    public final int a;
    public final boolean b;

    public a8c(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a8c.class != obj.getClass()) {
            return false;
        }
        a8c a8c = (a8c) obj;
        return this.a == a8c.a && this.b == a8c.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
