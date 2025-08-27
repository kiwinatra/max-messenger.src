package defpackage;

/* renamed from: b8c  reason: default package */
public final class b8c {
    public final int a;
    public final boolean b;

    public b8c(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b8c.class != obj.getClass()) {
            return false;
        }
        b8c b8c = (b8c) obj;
        return this.a == b8c.a && this.b == b8c.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
