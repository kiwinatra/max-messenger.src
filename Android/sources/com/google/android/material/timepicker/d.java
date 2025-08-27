package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ClockHandView a;

    public /* synthetic */ d(ClockHandView clockHandView) {
        this.a = clockHandView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = ClockHandView.H0;
        ClockHandView clockHandView = this.a;
        clockHandView.getClass();
        clockHandView.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }
}
