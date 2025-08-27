package defpackage;

import android.animation.ValueAnimator;

/* renamed from: g5a  reason: default package */
public final class g5a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5a b;

    public /* synthetic */ g5a(h5a h5a, int i) {
        this.a = i;
        this.b = h5a;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h5a h5a = this.b;
                h5a.c.setScaleX(floatValue);
                h5a.c.setScaleY(floatValue);
                return;
        }
    }
}
