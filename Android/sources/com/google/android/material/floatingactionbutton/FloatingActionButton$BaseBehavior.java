package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.jr5;
import java.util.List;
import java.util.WeakHashMap;

public class FloatingActionButton$BaseBehavior<T extends jr5> extends tz3 {
    public Rect a;
    public final boolean b;

    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }

    public final boolean e(Rect rect, View view) {
        jr5 jr5 = (jr5) view;
        int left = jr5.getLeft();
        Rect rect2 = jr5.x0;
        rect.set(left + rect2.left, jr5.getTop() + rect2.top, jr5.getRight() - rect2.right, jr5.getBottom() - rect2.bottom);
        return true;
    }

    public final void g(wz3 wz3) {
        if (wz3.h == 0) {
            wz3.h = 80;
        }
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        jr5 jr5 = (jr5) view;
        if (view2 instanceof AppBarLayout) {
            w(coordinatorLayout, (AppBarLayout) view2, jr5);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof wz3 ? ((wz3) layoutParams).a instanceof BottomSheetBehavior : false) {
                x(view2, jr5);
            }
        }
        return false;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        jr5 jr5 = (jr5) view;
        List e = coordinatorLayout.e(jr5);
        int size = e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) e.get(i3);
            if (!(view2 instanceof AppBarLayout)) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof wz3 ? ((wz3) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, jr5)) {
                    break;
                }
            } else if (w(coordinatorLayout, (AppBarLayout) view2, jr5)) {
                break;
            }
        }
        coordinatorLayout.k(jr5, i);
        Rect rect = jr5.x0;
        if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
            wz3 wz3 = (wz3) jr5.getLayoutParams();
            int i4 = jr5.getRight() >= coordinatorLayout.getWidth() - wz3.rightMargin ? rect.right : jr5.getLeft() <= wz3.leftMargin ? -rect.left : 0;
            if (jr5.getBottom() >= coordinatorLayout.getHeight() - wz3.bottomMargin) {
                i2 = rect.bottom;
            } else if (jr5.getTop() <= wz3.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                WeakHashMap weakHashMap = gag.a;
                jr5.offsetTopAndBottom(i2);
            }
            if (i4 != 0) {
                WeakHashMap weakHashMap2 = gag.a;
                jr5.offsetLeftAndRight(i4);
            }
        }
        return true;
    }

    public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, jr5 jr5) {
        if (!(this.b && ((wz3) jr5.getLayoutParams()).f == appBarLayout.getId() && jr5.getUserSetVisibility() == 0)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        ThreadLocal threadLocal = im4.a;
        rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
        im4.b(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
            jr5.d((gf) null, false);
        } else {
            jr5.f((gf) null, false);
        }
        return true;
    }

    public final boolean x(View view, jr5 jr5) {
        if (!(this.b && ((wz3) jr5.getLayoutParams()).f == view.getId() && jr5.getUserSetVisibility() == 0)) {
            return false;
        }
        if (view.getTop() < (jr5.getHeight() / 2) + ((wz3) jr5.getLayoutParams()).topMargin) {
            jr5.d((gf) null, false);
        } else {
            jr5.f((gf) null, false);
        }
        return true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.FloatingActionButton_Behavior_Layout);
        this.b = obtainStyledAttributes.getBoolean(tnc.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        obtainStyledAttributes.recycle();
    }
}
