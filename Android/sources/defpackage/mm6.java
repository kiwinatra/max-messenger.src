package defpackage;

/* renamed from: mm6  reason: default package */
public final class mm6 implements nm6 {
    public final float a;

    public mm6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm6) && Float.compare(this.a, ((mm6) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "UpdateCameraTranslation(translationY=" + this.a + ")";
    }
}
