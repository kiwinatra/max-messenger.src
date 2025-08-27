package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: je7  reason: default package */
public final class je7 implements ValueAnimator.AnimatorUpdateListener {
    public final View a;
    public final int b;

    public je7(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.offsetTopAndBottom(((int) (floatValue * ((float) (-this.b)))) - view.getTop());
    }
}
