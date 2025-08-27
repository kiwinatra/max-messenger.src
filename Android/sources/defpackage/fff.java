package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: fff  reason: default package */
public final /* synthetic */ class fff implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hff b;

    public /* synthetic */ fff(hff hff, int i) {
        this.a = i;
        this.b = hff;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hff hff = this.b;
                FrameLayout frameLayout = hff.k;
                ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.width = intValue;
                }
                FrameLayout frameLayout2 = hff.k;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hff hff2 = this.b;
                FrameLayout frameLayout3 = hff2.k;
                ViewGroup.LayoutParams layoutParams2 = frameLayout3 != null ? frameLayout3.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = intValue2;
                }
                FrameLayout frameLayout4 = hff2.k;
                if (frameLayout4 != null) {
                    frameLayout4.setLayoutParams(layoutParams2);
                    return;
                }
                return;
        }
    }
}
