package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: uhd  reason: default package */
public final class uhd implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ xhd b;
    public final /* synthetic */ rhd c;
    public final /* synthetic */ xhd o;
    public final /* synthetic */ ohd v;

    public uhd(ohd ohd, xhd xhd, rhd rhd, xhd xhd2, ohd ohd2) {
        this.a = ohd;
        this.b = xhd;
        this.c = rhd;
        this.o = xhd2;
        this.v = ohd2;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.b.y.put(this.c, (Object) null);
        this.o.removeView(this.v);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.b.y.put(this.c, (Object) null);
        this.o.removeView(this.v);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
