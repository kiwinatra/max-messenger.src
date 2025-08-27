package defpackage;

import android.animation.ValueAnimator;

/* renamed from: x5f  reason: default package */
public final /* synthetic */ class x5f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6f b;

    public /* synthetic */ x5f(a6f a6f, int i) {
        this.a = i;
        this.b = a6f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.b.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
