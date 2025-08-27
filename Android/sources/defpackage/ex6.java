package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ex6  reason: default package */
public abstract class ex6 extends kbg {
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public int e = 0;
    public int f;

    public ex6() {
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout A;
        iog lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (A = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = gag.a;
            if (A.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = A.getTotalScrollRange() + size;
        int measuredHeight = A.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.l(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : IntCompanionObject.MIN_VALUE));
        return true;
    }

    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout A = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.e(view));
        if (A != null) {
            wz3 wz3 = (wz3) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + wz3.leftMargin;
            int bottom = A.getBottom() + wz3.topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - wz3.rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, ((A.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - wz3.bottomMargin);
            iog lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = gag.a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            int i2 = wz3.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            int i3 = i2;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.d;
            Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
            int z = z(A);
            view.layout(rect2.left, rect2.top - z, rect2.right, rect2.bottom - z);
            this.e = rect2.top - A.getBottom();
            return;
        }
        View view2 = view;
        coordinatorLayout.k(view, i);
        this.e = 0;
    }

    public final int z(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        boolean z = view instanceof AppBarLayout;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (z) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            tz3 tz3 = ((wz3) appBarLayout.getLayoutParams()).a;
            int z2 = tz3 instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) tz3).z() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + z2 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = (((float) z2) / ((float) i)) + 1.0f;
            }
        }
        int i2 = this.f;
        return h88.l((int) (f2 * ((float) i2)), 0, i2);
    }

    public ex6(int i) {
        super(0);
    }
}
