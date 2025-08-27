package defpackage;

/* renamed from: ia0  reason: default package */
public final class ia0 {
    public final String a;
    public final ab0 b;

    public ia0(String str, ab0 ab0) {
        if (str != null) {
            this.a = str;
            if (ab0 != null) {
                this.b = ab0;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0 = (ia0) obj;
        return this.a.equals(ia0.a) && this.b.equals(ia0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
