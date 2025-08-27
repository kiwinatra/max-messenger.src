package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: r8d  reason: default package */
public abstract class r8d extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - a) * ((double) f2)) + ((double) f));
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
