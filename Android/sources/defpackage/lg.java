package defpackage;

import android.animation.ValueAnimator;

/* renamed from: lg  reason: default package */
public final /* synthetic */ class lg implements ValueAnimator.DurationScaleChangeListener {
    public final /* synthetic */ fj a;

    public /* synthetic */ lg(fj fjVar) {
        this.a = fjVar;
    }

    public final void onChanged(float f) {
        ((ng) this.a.c).g = f;
    }
}
