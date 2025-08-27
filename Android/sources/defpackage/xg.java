package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: xg  reason: default package */
public abstract class xg {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final gh5 b = new gh5();
    public static final fh5 c = new fh5(0);
    public static final fh5 d = new fh5(1);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return i2a.f(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * ((float) (i2 - i))) + i;
    }
}
