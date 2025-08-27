package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: m8f  reason: default package */
public final class m8f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ n8f c;

    public m8f(n8f n8f, View view, View view2) {
        this.c = n8f;
        this.a = view;
        this.b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
