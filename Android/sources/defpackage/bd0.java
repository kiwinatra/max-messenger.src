package defpackage;

/* renamed from: bd0  reason: default package */
public final class bd0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd0.class != obj.getClass()) {
            return false;
        }
        bd0 bd0 = (bd0) obj;
        return Float.compare(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) + 16337;
    }
}
