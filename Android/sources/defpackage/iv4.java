package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: iv4  reason: default package */
public final class iv4 extends Transition {
    public static final float[] o = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO};
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[8];

    public iv4(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
    }

    public final void captureStartValues(TransitionValues transitionValues) {
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof up6)) {
            return null;
        }
        up6 up6 = (up6) view;
        ((sp6) up6.getHierarchy()).n(b9d.b(this.a));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new hv4(this, up6));
        ofFloat.addListener(new wh(this, up6, false, 2));
        return ofFloat;
    }
}
