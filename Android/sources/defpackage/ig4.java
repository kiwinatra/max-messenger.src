package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ig4  reason: default package */
public final class ig4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View o;
    public final /* synthetic */ int v;
    public final /* synthetic */ ViewPropertyAnimator w;
    public final /* synthetic */ bbe x;

    public /* synthetic */ ig4(bbe bbe, pzc pzc, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, int i3) {
        this.a = i3;
        this.x = bbe;
        this.b = pzc;
        this.c = i;
        this.o = view;
        this.v = i2;
        this.w = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i = this.c;
                View view = this.o;
                if (i != 0) {
                    view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                }
                if (this.v != 0) {
                    view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
                return;
            default:
                int i2 = this.c;
                View view2 = this.o;
                if (i2 != 0) {
                    view2.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                }
                if (this.v != 0) {
                    view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.w.setListener((Animator.AnimatorListener) null);
                mg4 mg4 = (mg4) this.x;
                pzc pzc = this.b;
                mg4.h(pzc);
                mg4.p.remove(pzc);
                mg4.w();
                return;
            default:
                this.w.setListener((Animator.AnimatorListener) null);
                src src = (src) this.x;
                pzc pzc2 = this.b;
                src.h(pzc2);
                src.p.remove(pzc2);
                src.x();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((mg4) this.x).getClass();
                return;
            default:
                ((src) this.x).getClass();
                return;
        }
    }
}
