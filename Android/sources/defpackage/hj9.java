package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: hj9  reason: default package */
public final class hj9 implements Animator.AnimatorListener {
    public final /* synthetic */ kj9 a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ z70 c;
    public final /* synthetic */ mi9 o;
    public final /* synthetic */ pzc v;
    public final /* synthetic */ z70 w;
    public final /* synthetic */ ValueAnimator x;

    public hj9(kj9 kj9, pzc pzc, z70 z70, mi9 mi9, pzc pzc2, z70 z702, ValueAnimator valueAnimator) {
        this.a = kj9;
        this.b = pzc;
        this.c = z70;
        this.o = mi9;
        this.v = pzc2;
        this.w = z702;
        this.x = valueAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        kj9 kj9 = this.a;
        pzc pzc = this.b;
        kj9.h(pzc);
        z70 z70 = this.c;
        z70.setHasTransientState(false);
        z70.b(this.o.b, false);
        kj9.u.remove(pzc);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        kj9 kj9 = this.a;
        kj9.getClass();
        this.w.setHasTransientState(true);
        kj9.u.put(this.v, this.x);
    }
}
