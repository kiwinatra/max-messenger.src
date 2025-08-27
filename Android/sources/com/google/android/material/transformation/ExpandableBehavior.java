package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends tz3 {
    public int a = 0;

    public ExpandableBehavior() {
    }

    public abstract boolean f(View view, View view2);

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        sd5 sd5 = (sd5) view2;
        boolean z = ((jr5) sd5).A0.b;
        int i = 2;
        if (z) {
            int i2 = this.a;
            if (!(i2 == 0 || i2 == 2)) {
                return false;
            }
        } else if (this.a != 1) {
            return false;
        }
        if (z) {
            i = 1;
        }
        this.a = i;
        w((View) sd5, view, z, true);
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        sd5 sd5;
        boolean z;
        int i2;
        int i3 = 1;
        WeakHashMap weakHashMap = gag.a;
        if (!view.isLaidOut()) {
            List e = coordinatorLayout.e(view);
            int size = e.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    sd5 = null;
                    break;
                }
                View view2 = (View) e.get(i4);
                if (f(view, view2)) {
                    sd5 = (sd5) view2;
                    break;
                }
                i4++;
            }
            if (sd5 != null && (!(z = ((jr5) sd5).A0.b) ? this.a == 1 : (i2 = this.a) == 0 || i2 == 2)) {
                if (!z) {
                    i3 = 2;
                }
                this.a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new qd5(this, view, i3, sd5));
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
