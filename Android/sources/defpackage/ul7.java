package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: ul7  reason: default package */
public final class ul7 implements Animator.AnimatorListener {
    public float X;
    public boolean Y = false;
    public boolean Z = false;
    public final float a;
    public final float b;
    public final float c;
    public final float o;
    public final pzc v;
    public float v0;
    public final int w;
    public final /* synthetic */ int w0;
    public final ValueAnimator x;
    public final /* synthetic */ pzc x0;
    public boolean y;
    public final /* synthetic */ yl7 y0;
    public float z;

    public ul7(yl7 yl7, pzc pzc, int i, float f, float f2, float f3, float f4, int i2, pzc pzc2) {
        this.y0 = yl7;
        this.w0 = i2;
        this.x0 = pzc2;
        this.w = i;
        this.v = pzc;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.o = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        this.x = ofFloat;
        ofFloat.addUpdateListener(new sk0(5, this));
        ofFloat.setTarget(pzc.a);
        ofFloat.addListener(this);
        this.v0 = c44.DEFAULT_ASPECT_RATIO;
    }

    public final void a(Animator animator) {
        if (!this.Z) {
            this.v.J(true);
        }
        this.Z = true;
    }

    public final void onAnimationCancel(Animator animator) {
        this.v0 = 1.0f;
    }

    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.Y) {
            int i = this.w0;
            pzc pzc = this.x0;
            yl7 yl7 = this.y0;
            if (i <= 0) {
                yl7.v0.a(yl7.A0, pzc);
            } else {
                yl7.a.add(pzc.a);
                this.y = true;
                if (i > 0) {
                    yl7.A0.post(new vj6(yl7, this, i));
                }
            }
            View view = yl7.F0;
            View view2 = pzc.a;
            if (view == view2) {
                yl7.r(view2);
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
