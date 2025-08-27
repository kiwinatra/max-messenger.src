package defpackage;

import android.animation.ValueAnimator;

/* renamed from: k7e  reason: default package */
public final /* synthetic */ class k7e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7e b;

    public /* synthetic */ k7e(o7e o7e, int i) {
        this.a = i;
        this.b = o7e;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                this.b.invalidateSelf();
                return;
        }
    }
}
