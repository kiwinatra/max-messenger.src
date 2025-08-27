package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends tz3 {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public final /* bridge */ /* synthetic */ boolean e(Rect rect, View view) {
        wj6.t(view);
        throw null;
    }

    public final void g(wz3 wz3) {
        if (wz3.h == 0) {
            wz3.h = 80;
        }
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        wj6.t(view);
        throw null;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        wj6.t(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.ExtendedFloatingActionButton_Behavior_Layout);
        obtainStyledAttributes.getBoolean(tnc.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
        obtainStyledAttributes.getBoolean(tnc.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
        obtainStyledAttributes.recycle();
    }
}
