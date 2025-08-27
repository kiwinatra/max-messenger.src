package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: drc  reason: default package */
public final class drc extends Visibility {
    public static final PathInterpolator b = new PathInterpolator(0.9f, c44.DEFAULT_ASPECT_RATIO, 0.66f, 1.0f);
    public final Function0 a;

    public drc(oqc oqc) {
        this.a = oqc;
    }

    public final AnimatorSet a(View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        ry4 ry4 = ohe.r;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f}).setDuration(100);
        addListener(new arc(view, ry4, f));
        view.setScaleX(f2);
        Unit unit = Unit.INSTANCE;
        ry4 ry42 = ohe.s;
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f}).setDuration(100);
        addListener(new arc(view, ry42, f));
        view.setScaleY(f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(b);
        addListener(new crc(view, f2));
        ofFloat.addUpdateListener(new hg(view, 5));
        animatorSet.playTogether(new Animator[]{duration, duration2, ofFloat});
        animatorSet.addListener(new brc(z, this, view));
        return animatorSet;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, true);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, false);
    }
}
