package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;

/* renamed from: i3b  reason: default package */
public final /* synthetic */ class i3b implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ i3b(float f, LinearInterpolator linearInterpolator) {
        this.a = f;
        this.b = linearInterpolator;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), this.a});
        ofFloat.setInterpolator(this.b);
        return ofFloat;
    }
}
