package defpackage;

import android.view.WindowInsets;

/* renamed from: pz1  reason: default package */
public final class pz1 extends oz1 {
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
