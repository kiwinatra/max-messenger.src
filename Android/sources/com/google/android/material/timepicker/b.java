package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.H0.w0) - clockFaceView.P0;
        if (height != clockFaceView.F0) {
            clockFaceView.F0 = height;
            clockFaceView.L();
            int i = clockFaceView.F0;
            ClockHandView clockHandView = clockFaceView.H0;
            clockHandView.F0 = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
