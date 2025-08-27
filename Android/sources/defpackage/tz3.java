package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ok.messages.views.widgets.AlwaysNestedScrollingViewBehavior;

/* renamed from: tz3  reason: default package */
public abstract class tz3 {
    public boolean e(Rect rect, View view) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public void g(wz3 wz3) {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void j() {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void r(View view, Parcelable parcelable) {
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return this instanceof AlwaysNestedScrollingViewBehavior;
        }
        return false;
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}
