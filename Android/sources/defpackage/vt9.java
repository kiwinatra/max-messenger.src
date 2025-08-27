package defpackage;

/* renamed from: vt9  reason: default package */
public final class vt9 {
    public final long a;

    public vt9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt9) && this.a == ((vt9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("MovieId(id="), this.a, ")");
    }
}
