package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: bog  reason: default package */
public abstract class bog extends aog {
    public wh7 m = null;

    public bog(iog iog, WindowInsets windowInsets) {
        super(iog, windowInsets);
    }

    public iog b() {
        return iog.g((View) null, this.c.consumeStableInsets());
    }

    public iog c() {
        return iog.g((View) null, this.c.consumeSystemWindowInsets());
    }

    public final wh7 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = wh7.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    public boolean m() {
        return this.c.isConsumed();
    }
}
