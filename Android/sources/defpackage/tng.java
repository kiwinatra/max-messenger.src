package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: tng  reason: default package */
public final class tng extends ung {
    public final WindowInsetsAnimation e;

    public tng(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return this.e.getDurationMillis();
    }

    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    public final int c() {
        return this.e.getTypeMask();
    }

    public final void d(float f) {
        this.e.setFraction(f);
    }
}
