package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: d13  reason: default package */
public final class d13 extends fbf {
    public static final int[] v0 = {0, 1350, 2700, 4050};
    public static final int[] w0 = {667, 2017, 3367, 4717};
    public static final int[] x0 = {1000, 2350, 3700, 5050};
    public static final dz1 y0;
    public static final dz1 z0;
    public float X;
    public float Y;
    public ye Z = null;
    public ObjectAnimator v;
    public ObjectAnimator w;
    public final gh5 x;
    public final h13 y;
    public int z = 0;

    static {
        Class<Float> cls = Float.class;
        y0 = new dz1(cls, "animationFraction", 5);
        z0 = new dz1(cls, "completeEndFraction", 6);
    }

    public d13(h13 h13) {
        super(1);
        this.y = h13;
        this.x = new gh5();
    }

    public final void R() {
        this.z = 0;
        ((pv4) ((ArrayList) this.c).get(0)).c = this.y.c[0];
        this.Y = c44.DEFAULT_ASPECT_RATIO;
    }

    public final void Z(lk0 lk0) {
        this.Z = lk0;
    }

    public final void b0() {
        ObjectAnimator objectAnimator = this.w;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((ue7) this.b).isVisible()) {
                this.w.start();
            } else {
                x();
            }
        }
    }

    public final void d0() {
        if (this.v == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, y0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            this.v = ofFloat;
            ofFloat.setDuration(5400);
            this.v.setInterpolator((TimeInterpolator) null);
            this.v.setRepeatCount(-1);
            this.v.addListener(new c13(this, 0));
        }
        if (this.w == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, z0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            this.w = ofFloat2;
            ofFloat2.setDuration(333);
            this.w.setInterpolator(this.x);
            this.w.addListener(new c13(this, 1));
        }
        this.z = 0;
        ((pv4) ((ArrayList) this.c).get(0)).c = this.y.c[0];
        this.Y = c44.DEFAULT_ASPECT_RATIO;
        this.v.start();
    }

    public final void e0() {
        this.Z = null;
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
