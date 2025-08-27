package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: dog  reason: default package */
public class dog extends cog {
    public wh7 n = null;
    public wh7 o = null;
    public wh7 p = null;

    public dog(iog iog, WindowInsets windowInsets) {
        super(iog, windowInsets);
    }

    public wh7 g() {
        if (this.o == null) {
            this.o = wh7.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    public wh7 i() {
        if (this.n == null) {
            this.n = wh7.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    public wh7 k() {
        if (this.p == null) {
            this.p = wh7.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    public iog l(int i, int i2, int i3, int i4) {
        return iog.g((View) null, this.c.inset(i, i2, i3, i4));
    }
}
