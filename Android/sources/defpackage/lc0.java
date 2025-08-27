package defpackage;

/* renamed from: lc0  reason: default package */
public final class lc0 {
    public final int a = 0;
    public final s3f b;

    public lc0(s3f s3f) {
        if (s3f != null) {
            this.b = s3f;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lc0)) {
            return false;
        }
        lc0 lc0 = (lc0) obj;
        return this.a == lc0.a && this.b.equals(lc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Event{eventCode=" + this.a + ", surfaceOutput=" + this.b + "}";
    }
}
