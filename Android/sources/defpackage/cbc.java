package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: cbc  reason: default package */
public final /* synthetic */ class cbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View[] c;

    public /* synthetic */ cbc(View view, boolean z, View[] viewArr) {
        this.a = view;
        this.b = z;
        this.c = viewArr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        boolean z = this.b;
        float floatValue = f.floatValue();
        if (z) {
            floatValue = 1.0f - floatValue;
        }
        this.a.setAlpha(floatValue);
        for (View view : this.c) {
            float floatValue2 = f.floatValue();
            if (!z) {
                floatValue2 = 1.0f - floatValue2;
            }
            view.setAlpha(floatValue2);
        }
    }
}
