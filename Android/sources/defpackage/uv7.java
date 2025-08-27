package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: uv7  reason: default package */
public final class uv7 extends fbf {
    public static final dz1 Y = new dz1(Float.class, "animationFraction", 8);
    public float X;
    public ObjectAnimator v;
    public final gh5 w;
    public final dw7 x;
    public int y = 1;
    public boolean z;

    public uv7(dw7 dw7) {
        super(3);
        this.x = dw7;
        this.w = new gh5();
    }

    public final void R() {
        g0();
    }

    public final void Z(lk0 lk0) {
    }

    public final void b0() {
    }

    public final void d0() {
        if (this.v == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Y, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            this.v = ofFloat;
            ofFloat.setDuration(333);
            this.v.setInterpolator((TimeInterpolator) null);
            this.v.setRepeatCount(-1);
            this.v.addListener(new z6(8, (Object) this));
        }
        g0();
        this.v.start();
    }

    public final void e0() {
    }

    public final void g0() {
        this.z = true;
        this.y = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            pv4 pv4 = (pv4) it.next();
            dw7 dw7 = this.x;
            pv4.c = dw7.c[0];
            pv4.d = dw7.g / 2;
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
