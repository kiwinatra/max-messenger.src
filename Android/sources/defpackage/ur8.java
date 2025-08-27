package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: ur8  reason: default package */
public final /* synthetic */ class ur8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr8 b;

    public /* synthetic */ ur8(xr8 xr8, int i) {
        this.a = i;
        this.b = xr8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = this.b.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MediaKeyboardWidget d = this.b.d();
                if (d != null && (view = d.getView()) != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue2;
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                return;
        }
    }
}
