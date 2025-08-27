package ru.ok.messages.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class AboveBottomSheetBehavior extends tz3 {
    @Keep
    public AboveBottomSheetBehavior() {
    }

    public final boolean f(View view, View view2) {
        return ((wz3) view2.getLayoutParams()).a instanceof BottomSheetBehavior;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            return false;
        }
        view2.getContext();
        ro4 b = ro4.b();
        float y = view2.getY();
        if (1 == hd8.K(coordinatorLayout.getContext())) {
            View view3 = null;
            float f = 0.0f;
            float f2 = Float.MAX_VALUE;
            View view4 = null;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0 && !(childAt instanceof ProgressBar)) {
                    float y2 = childAt.getY();
                    float height = ((float) childAt.getHeight()) + y2;
                    if (height > f) {
                        view3 = childAt;
                        f = height;
                    }
                    if (y2 < f2) {
                        view4 = childAt;
                        f2 = y2;
                    }
                }
            }
            if (view3 == null || view4 == null) {
                return false;
            }
            float f3 = (float) b.q;
            float f4 = f + f3;
            float f5 = (f - f2) + f3;
            if (y >= f4) {
                view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            } else if (y < f5) {
                view.setTranslationY(f5 - f4);
            } else {
                view.setTranslationY(y - f4);
            }
        } else {
            int width = coordinatorLayout.getWidth();
            float height2 = (float) coordinatorLayout.getHeight();
            float b2 = (float) vo4.b((int) 61.0f);
            if (height2 - y <= b2) {
                return false;
            }
            view.setTranslationX((float) (((double) (-(((float) width) / 4.0f))) * Math.min(1.0d, 1.1d - ((double) ((y + b2) / height2)))));
        }
        return true;
    }

    @Keep
    public AboveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
