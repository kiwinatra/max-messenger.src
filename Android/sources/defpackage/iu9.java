package defpackage;

/* renamed from: iu9  reason: default package */
public abstract class iu9 {
    public static final float a = 1.0f;

    static {
        a(c44.DEFAULT_ASPECT_RATIO);
        a(1.0f);
    }

    public static void a(float f) {
        if (c44.DEFAULT_ASPECT_RATIO > f || f > 1.0f) {
            throw new IllegalArgumentException("Gain must be in range of 0f and 1f");
        }
    }
}
