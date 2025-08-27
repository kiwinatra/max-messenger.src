package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SmoothSnapAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public int o = -1;
    public boolean p;

    public SmoothSnapAppBarLayoutBehavior() {
    }

    /* renamed from: H */
    public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        int i3 = this.o;
        if (i3 != -1) {
            u(coordinatorLayout, appBarLayout, view2, i3);
            this.p = true;
        }
        this.o = i2;
        return super.t(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    /* renamed from: I */
    public final void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        if (this.p) {
            this.p = false;
        } else if (this.o != -1) {
            this.o = -1;
            super.u(coordinatorLayout, appBarLayout, view, 0);
        }
    }

    public SmoothSnapAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
