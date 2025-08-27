package defpackage;

/* renamed from: hb0  reason: default package */
public final class hb0 {
    public final jv7 a;
    public final ia0 b;

    public hb0(jv7 jv7, ia0 ia0) {
        if (jv7 != null) {
            this.a = jv7;
            if (ia0 != null) {
                this.b = ia0;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0 = (hb0) obj;
        return this.a.equals(hb0.a) && this.b.equals(hb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
