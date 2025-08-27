package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vt1  reason: default package */
public final /* synthetic */ class vt1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ xt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ vt1(xt1 xt1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) {
        this.a = xt1;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.v = i4;
        this.w = f;
        this.x = f2;
        this.y = i5;
        this.z = i6;
        this.X = i7;
        this.Y = i8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        xt1.b(this.a, this.b, this.c, this.o, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
