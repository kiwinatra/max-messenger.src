package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wv7  reason: default package */
public final class wv7 extends fbf {
    public static final int[] v0 = {533, 567, 850, 750};
    public static final int[] w0 = {1267, 1000, 333, 0};
    public static final dz1 x0 = new dz1(Float.class, "animationFraction", 9);
    public boolean X;
    public float Y;
    public ye Z = null;
    public ObjectAnimator v;
    public ObjectAnimator w;
    public final Interpolator[] x;
    public final dw7 y;
    public int z = 0;

    public wv7(Context context, dw7 dw7) {
        super(2);
        this.y = dw7;
        this.x = new Interpolator[]{AnimationUtils.loadInterpolator(context, pcc.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, pcc.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, pcc.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, pcc.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void R() {
        g0();
    }

    public final void Z(lk0 lk0) {
        this.Z = lk0;
    }

    public final void b0() {
        ObjectAnimator objectAnimator = this.w;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            x();
            if (((ue7) this.b).isVisible()) {
                this.w.setFloatValues(new float[]{this.Y, 1.0f});
                this.w.setDuration((long) ((1.0f - this.Y) * 1800.0f));
                this.w.start();
            }
        }
    }

    public final void d0() {
        ObjectAnimator objectAnimator = this.v;
        dz1 dz1 = x0;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, dz1, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            this.v = ofFloat;
            ofFloat.setDuration(1800);
            this.v.setInterpolator((TimeInterpolator) null);
            this.v.setRepeatCount(-1);
            this.v.addListener(new vv7(this, 0));
        }
        if (this.w == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, dz1, new float[]{1.0f});
            this.w = ofFloat2;
            ofFloat2.setDuration(1800);
            this.w.setInterpolator((TimeInterpolator) null);
            this.w.addListener(new vv7(this, 1));
        }
        g0();
        this.v.start();
    }

    public final void e0() {
        this.Z = null;
    }

    public final void g0() {
        this.z = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((pv4) it.next()).c = this.y.c[0];
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
