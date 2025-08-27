package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: j23  reason: default package */
public final /* synthetic */ class j23 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l23 b;

    public /* synthetic */ j23(l23 l23, int i) {
        this.a = i;
        this.b = l23;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        l23 l23 = this.b;
        l23.getClass();
        switch (i) {
            case 0:
                l23.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = l23.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}
