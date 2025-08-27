package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ybc  reason: default package */
public final /* synthetic */ class ybc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ecc a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ float v;

    public /* synthetic */ ybc(ecc ecc, float f, float f2, float f3, float f4) {
        this.a = ecc;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.v = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ecc.b(this.a, this.b, this.c, this.o, this.v, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
