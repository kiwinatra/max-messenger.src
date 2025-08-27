package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: xng  reason: default package */
public class xng extends zng {
    public final WindowInsets.Builder c;

    public xng() {
        this.c = new WindowInsets.Builder();
    }

    public iog b() {
        a();
        iog g = iog.g((View) null, this.c.build());
        g.a.p(this.b);
        return g;
    }

    public void d(wh7 wh7) {
        this.c.setMandatorySystemGestureInsets(wh7.d());
    }

    public void e(wh7 wh7) {
        this.c.setSystemGestureInsets(wh7.d());
    }

    public void f(wh7 wh7) {
        this.c.setSystemWindowInsets(wh7.d());
    }

    public void g(wh7 wh7) {
        this.c.setTappableElementInsets(wh7.d());
    }

    public void i(wh7 wh7) {
        this.c.setStableInsets(wh7.d());
    }

    public xng(iog iog) {
        super(iog);
        WindowInsets.Builder builder;
        WindowInsets f = iog.f();
        if (f != null) {
            builder = new WindowInsets.Builder(f);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.c = builder;
    }
}
