package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gg5  reason: default package */
public final class gg5 extends odg {
    public gg5(int i) {
        if ((i & -4) == 0) {
            this.Q0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float V(defpackage.isf r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.HashMap r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg5.V(isf, float):float");
    }

    public final ObjectAnimator S(ViewGroup viewGroup, View view, isf isf, isf isf2) {
        dz1 dz1 = tcg.a;
        return U(view, V(isf, c44.DEFAULT_ASPECT_RATIO), 1.0f);
    }

    public final ObjectAnimator T(ViewGroup viewGroup, View view, isf isf, isf isf2) {
        dz1 dz1 = tcg.a;
        ObjectAnimator U = U(view, V(isf, 1.0f), c44.DEFAULT_ASPECT_RATIO);
        if (U == null) {
            view.setTransitionAlpha(V(isf2, 1.0f));
        }
        return U;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        dz1 dz1 = tcg.a;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, tcg.a, new float[]{f2});
        fg5 fg5 = new fg5(view);
        ofFloat.addListener(fg5);
        s().a(fg5);
        return ofFloat;
    }

    public final void i(isf isf) {
        odg.Q(isf);
        int i = yfc.transition_pause_alpha;
        View view = isf.b;
        Float f = (Float) view.getTag(i);
        if (f == null) {
            if (view.getVisibility() == 0) {
                dz1 dz1 = tcg.a;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
            }
        }
        isf.a.put("android:fade:transitionAlpha", f);
    }
}
