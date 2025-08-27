package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: kbg  reason: default package */
public abstract class kbg extends tz3 {
    public lbg a;
    public int b = 0;

    public kbg() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new lbg(view);
        }
        lbg lbg = this.a;
        View view2 = lbg.a;
        lbg.b = view2.getTop();
        lbg.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int w() {
        lbg lbg = this.a;
        if (lbg != null) {
            return lbg.d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.k(view, i);
    }

    public boolean y(int i) {
        lbg lbg = this.a;
        if (lbg != null) {
            return lbg.b(i);
        }
        this.b = i;
        return false;
    }

    public kbg(int i) {
    }
}
