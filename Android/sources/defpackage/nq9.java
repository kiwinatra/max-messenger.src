package defpackage;

import android.animation.ValueAnimator;

/* renamed from: nq9  reason: default package */
public final /* synthetic */ class nq9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oq9 b;

    public /* synthetic */ nq9(oq9 oq9, int i) {
        this.a = i;
        this.b = oq9;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                oq9 oq9 = this.b;
                oq9.a(oq9.y);
                oq9.invalidateSelf();
                return;
        }
    }
}
