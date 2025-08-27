package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: ude  reason: default package */
public final class ude extends odg {
    public static final DecelerateInterpolator T0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator U0 = new AccelerateInterpolator();
    public static final sde V0 = new sde();
    public tde S0;

    public final ObjectAnimator S(ViewGroup viewGroup, View view, isf isf, isf isf2) {
        if (isf2 == null) {
            return null;
        }
        int[] iArr = (int[]) isf2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return cjf.l(view, isf2, iArr[0], iArr[1], this.S0.a(view, viewGroup), this.S0.b(view, viewGroup), translationX, translationY, T0, this);
    }

    public final ObjectAnimator T(ViewGroup viewGroup, View view, isf isf, isf isf2) {
        if (isf == null) {
            return null;
        }
        int[] iArr = (int[]) isf.a.get("android:slide:screenPosition");
        return cjf.l(view, isf, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.S0.a(view, viewGroup), this.S0.b(view, viewGroup), U0, this);
    }

    public final void f(isf isf) {
        odg.Q(isf);
        int[] iArr = new int[2];
        isf.b.getLocationOnScreen(iArr);
        isf.a.put("android:slide:screenPosition", iArr);
    }

    public final void i(isf isf) {
        odg.Q(isf);
        int[] iArr = new int[2];
        isf.b.getLocationOnScreen(iArr);
        isf.a.put("android:slide:screenPosition", iArr);
    }
}
