package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* renamed from: gkd  reason: default package */
public final class gkd extends FrameLayout implements phf {
    public final void onThemeChanged(k2b k2b) {
        View childAt = getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar != null) {
            iq.b0(progressBar, k2b.getIcon().h);
        }
    }
}
