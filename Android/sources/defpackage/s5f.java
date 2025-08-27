package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: s5f  reason: default package */
public final class s5f extends uh {
    public s5f() {
        super(200, true);
    }

    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO}) : ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new q5f(view, view2, viewGroup, z));
        ofFloat.addListener(new r5f(view2, view, viewGroup, z));
        ofFloat.addListener(new uf(10, viewGroup));
        return ofFloat;
    }

    public final void n(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
