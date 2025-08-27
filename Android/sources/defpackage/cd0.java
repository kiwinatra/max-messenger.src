package defpackage;

/* renamed from: cd0  reason: default package */
public final class cd0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cd0.class != obj.getClass()) {
            return false;
        }
        cd0 cd0 = (cd0) obj;
        return Float.compare(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) + 16337;
    }
}
