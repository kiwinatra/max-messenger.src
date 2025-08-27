package defpackage;

import android.animation.ValueAnimator;

/* renamed from: wxc  reason: default package */
public final /* synthetic */ class wxc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xxc b;

    public /* synthetic */ wxc(xxc xxc, int i) {
        this.a = i;
        this.b = xxc;
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
