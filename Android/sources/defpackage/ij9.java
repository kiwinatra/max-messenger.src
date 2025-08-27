package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: ij9  reason: default package */
public final class ij9 implements Animator.AnimatorListener {
    public final /* synthetic */ kj9 a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ z70 c;
    public final /* synthetic */ z70 o;
    public final /* synthetic */ mi9 v;
    public final /* synthetic */ pzc w;
    public final /* synthetic */ z70 x;
    public final /* synthetic */ ValueAnimator y;

    public ij9(kj9 kj9, pzc pzc, z70 z70, z70 z702, mi9 mi9, pzc pzc2, z70 z703, ValueAnimator valueAnimator) {
        this.a = kj9;
        this.b = pzc;
        this.c = z70;
        this.o = z702;
        this.v = mi9;
        this.w = pzc2;
        this.x = z703;
        this.y = valueAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        z70 z70 = this.o;
        z70.setHasTransientState(false);
        z70.b(this.v.b, true);
    }

    public final void onAnimationEnd(Animator animator) {
        kj9 kj9 = this.a;
        pzc pzc = this.b;
        kj9.h(pzc);
        this.c.setHasTransientState(false);
        kj9.u.remove(pzc);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        kj9 kj9 = this.a;
        kj9.getClass();
        this.x.setHasTransientState(true);
        kj9.u.put(this.w, this.y);
    }
}
