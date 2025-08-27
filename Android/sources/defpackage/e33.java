package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: e33  reason: default package */
public final class e33 extends Transition {
    public final Rect a;
    public final boolean b;

    public e33(Rect rect, boolean z) {
        this.a = rect;
        this.b = z;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
    }

    public final void captureStartValues(TransitionValues transitionValues) {
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof up6)) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new bn(2, this, transitionValues));
        ofFloat.addListener(new wh(this, transitionValues, false, 1));
        return ofFloat;
    }
}
