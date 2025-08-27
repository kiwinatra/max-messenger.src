package defpackage;

import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: f8a  reason: default package */
public final class f8a extends CoordinatorLayout {
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
