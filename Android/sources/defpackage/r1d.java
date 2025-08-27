package defpackage;

/* renamed from: r1d  reason: default package */
public final class r1d {
    public static final r1d b = new r1d(false);
    public final boolean a;

    public r1d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1d.class != obj.getClass()) {
            return false;
        }
        return this.a == ((r1d) obj).a;
    }

    public final int hashCode() {
        return this.a ^ true ? 1 : 0;
    }
}
