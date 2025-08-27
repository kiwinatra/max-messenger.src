package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: fj9  reason: default package */
public final /* synthetic */ class fj9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z70 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fj9(z70 z70, int i, int i2) {
        this.a = i2;
        this.b = z70;
        this.c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z70 z70 = this.b;
                ViewGroup.LayoutParams layoutParams = z70.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = intValue;
                    z70.setLayoutParams(layoutParams);
                    z70.setArrowRotation(((((float) intValue) - ((float) z70.getCollapsedHeight())) / ((float) (this.c - z70.getCollapsedHeight()))) * 180.0f);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z70 z702 = this.b;
                ViewGroup.LayoutParams layoutParams2 = z702.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = intValue2;
                    z702.setLayoutParams(layoutParams2);
                    z702.setArrowRotation(((((float) intValue2) - ((float) z702.getCollapsedHeight())) / ((float) (this.c - z702.getCollapsedHeight()))) * 180.0f);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
