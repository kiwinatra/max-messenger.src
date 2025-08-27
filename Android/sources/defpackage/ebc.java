package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: ebc  reason: default package */
public final class ebc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ValueAnimator b;

    public /* synthetic */ ebc(ValueAnimator valueAnimator, int i) {
        this.a = i;
        this.b = valueAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeAllUpdateListeners();
                animator.removeAllListeners();
                return;
            default:
                super.onAnimationEnd(animator);
                this.b.removeAllUpdateListeners();
                animator.removeAllListeners();
                return;
        }
    }
}
