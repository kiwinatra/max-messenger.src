package defpackage;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* renamed from: d5a  reason: default package */
public final /* synthetic */ class d5a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5a b;

    public /* synthetic */ d5a(h5a h5a, int i) {
        this.a = i;
        this.b = h5a;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h5a h5a = this.b;
                h5a.c.setScaleX(floatValue);
                h5a.c.setScaleY(floatValue);
                return;
            case 1:
                this.b.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                h5a h5a2 = this.b;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) h5a2.getContentView().getRootView().getLayoutParams();
                layoutParams.dimAmount = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6e.v(h5a2.getContentView()).updateViewLayout(h5a2.getContentView().getRootView(), layoutParams);
                return;
        }
    }
}
