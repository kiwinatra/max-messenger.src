package defpackage;

import android.animation.ValueAnimator;

/* renamed from: bl0  reason: default package */
public final class bl0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ il0 b;

    public /* synthetic */ bl0(il0 il0, int i, byte b2) {
        this.a = i;
        this.b = il0;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        il0 il0 = this.b;
        switch (this.a) {
            case 0:
                il0.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                il0.i.setScaleX(floatValue);
                il0.i.setScaleY(floatValue);
                return;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                gh5 gh5 = il0.v;
                il0.i.setTranslationY((float) intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                gh5 gh52 = il0.v;
                il0.i.setTranslationY((float) intValue2);
                return;
        }
    }

    public bl0(il0 il0, int i) {
        this.a = 2;
        this.b = il0;
    }
}
