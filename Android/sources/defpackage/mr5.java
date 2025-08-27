package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: mr5  reason: default package */
public final class mr5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ Matrix y;
    public final /* synthetic */ qr5 z;

    public mr5(qr5 qr5, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.z = qr5;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.o = f4;
        this.v = f5;
        this.w = f6;
        this.x = f7;
        this.y = matrix;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qr5 qr5 = this.z;
        qr5.s.setAlpha(xg.b(this.a, this.b, c44.DEFAULT_ASPECT_RATIO, 0.2f, floatValue));
        jr5 jr5 = qr5.s;
        float f = this.c;
        float f2 = this.o;
        jr5.setScaleX(xg.a(f, f2, floatValue));
        qr5.s.setScaleY(xg.a(this.v, f2, floatValue));
        float f3 = this.w;
        float f4 = this.x;
        qr5.p = xg.a(f3, f4, floatValue);
        float a2 = xg.a(f3, f4, floatValue);
        Matrix matrix = this.y;
        qr5.a(a2, matrix);
        qr5.s.setImageMatrix(matrix);
    }
}
