package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: vhd  reason: default package */
public final class vhd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public vhd(ohd ohd, float f) {
        this.a = ohd;
        this.b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.setTranslationY(floatValue);
        float f = this.b;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (f != c44.DEFAULT_ASPECT_RATIO) {
            f2 = 1.0f - f;
        }
        if (valueAnimator.getAnimatedFraction() >= f2) {
            view.setAlpha(((float) 1) - valueAnimator.getAnimatedFraction());
        }
    }
}
