package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: nv4  reason: default package */
public final class nv4 extends Transition {
    public final xdd a;
    public final xdd b;
    public final PointF c = null;
    public final PointF o = null;

    public nv4(m58 m58, m58 m582) {
        this.a = m58;
        this.b = m582;
    }

    public static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof up6) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet b(m58 m58, m58 m582) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new nv4(m58, m582));
        return transitionSet;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (!(transitionValues == null || transitionValues2 == null)) {
            Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
            if (!(rect == null || rect2 == null)) {
                xdd xdd = this.a;
                xdd xdd2 = this.b;
                if (xdd == xdd2 && this.c == this.o) {
                    return null;
                }
                up6 up6 = (up6) transitionValues.view;
                wdd wdd = new wdd((m58) xdd, (m58) xdd2, rect, rect2);
                ((sp6) up6.getHierarchy()).h(wdd);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                ofFloat.addUpdateListener(new sk0(3, wdd));
                ofFloat.addListener(new wh(this, up6, false, 3));
                return ofFloat;
            }
        }
        return null;
    }
}
