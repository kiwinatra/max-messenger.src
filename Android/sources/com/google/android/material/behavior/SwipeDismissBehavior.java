package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

public class SwipeDismissBehavior<V extends View> extends tz3 {
    public kag a;
    public wie b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public final float f = 0.5f;
    public float g = c44.DEFAULT_ASPECT_RATIO;
    public float h = 0.5f;
    public final v5f i = new v5f(this);

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new kag(coordinatorLayout.getContext(), coordinatorLayout, this.i);
        }
        return !this.d && this.a.q(motionEvent);
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = gag.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            gag.h(view, 1048576);
            gag.e(view, 0);
            if (w(view)) {
                gag.i(view, a4.j, new nob((Object) this));
            }
        }
        return false;
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.k(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
