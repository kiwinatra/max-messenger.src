package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vn2  reason: default package */
public final class vn2 extends FrameLayout {
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getId() != lra.b) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE);
        int measuredHeight = findViewById(lra.o).getMeasuredHeight();
        int measuredHeight2 = findViewById(lra.l).getMeasuredHeight();
        int i5 = Build.VERSION.SDK_INT;
        int stableInsetBottom = i5 >= 30 ? getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).bottom : getRootWindowInsets().getStableInsetBottom();
        super.measureChildWithMargins(view, i, i2, makeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + (i5 >= 30 ? getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).top : getRootWindowInsets().getStableInsetTop()) + stableInsetBottom));
    }
}
