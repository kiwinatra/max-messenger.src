package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final e4 j;

    public BaseTransientBottomBar$Behavior() {
        e4 e4Var = new e4(3, false);
        this.g = Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, 0.1f), 1.0f);
        this.h = Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, 0.6f), 1.0f);
        this.e = 0;
        this.j = e4Var;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e4 e4Var = this.j;
        e4Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                qpg.l().u((fl0) e4Var.b);
            }
        } else if (coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            qpg.l().r((fl0) e4Var.b);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    public final boolean w(View view) {
        this.j.getClass();
        return view instanceof hl0;
    }
}
