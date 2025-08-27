package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: x81  reason: default package */
public final /* synthetic */ class x81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x81(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                CallIndicatorWidget.d0((CallIndicatorWidget) this.c, this.b);
                return;
            default:
                Float f = (Float) valueAnimator.getAnimatedValue();
                for (View alpha : (View[]) this.c) {
                    alpha.setAlpha(this.b ? f.floatValue() : 1.0f - f.floatValue());
                }
                return;
        }
    }
}
