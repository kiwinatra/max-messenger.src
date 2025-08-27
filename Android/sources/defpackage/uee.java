package defpackage;

import android.animation.ValueAnimator;

/* renamed from: uee  reason: default package */
public final /* synthetic */ class uee implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg7 b;

    public /* synthetic */ uee(lg7 lg7, int i) {
        this.a = i;
        this.b = lg7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oee oee = (oee) this.b;
                oee.F0.setTextColor(i8b.Y(floatValue, oee.F0.getCurrentTextColor()));
                return;
            default:
                ((oee) this.b).F0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
