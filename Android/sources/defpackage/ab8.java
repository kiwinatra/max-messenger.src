package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ab8  reason: default package */
public abstract class ab8 implements Interpolator {
    public final float[] a;
    public final float b;

    public ab8(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= c44.DEFAULT_ASPECT_RATIO) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float f4 = fArr[min];
        return i2a.f(fArr[min + 1], f4, f3, f4);
    }
}
