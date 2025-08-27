package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hg4  reason: default package */
public final class hg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator o;
    public final /* synthetic */ bbe v;

    public /* synthetic */ hg4(bbe bbe, pzc pzc, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.v = bbe;
        this.b = pzc;
        this.o = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.o.setListener((Animator.AnimatorListener) null);
                this.c.setAlpha(1.0f);
                mg4 mg4 = (mg4) this.v;
                pzc pzc = this.b;
                mg4.h(pzc);
                mg4.q.remove(pzc);
                mg4.w();
                return;
            case 1:
                this.o.setListener((Animator.AnimatorListener) null);
                mg4 mg42 = (mg4) this.v;
                pzc pzc2 = this.b;
                mg42.g(pzc2);
                mg42.o.remove(pzc2);
                mg42.w();
                return;
            default:
                this.o.setListener((Animator.AnimatorListener) null);
                this.c.setAlpha(1.0f);
                src src = (src) this.v;
                pzc pzc3 = this.b;
                src.h(pzc3);
                src.q.remove(pzc3);
                src.x();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((mg4) this.v).getClass();
                return;
            case 1:
                ((mg4) this.v).getClass();
                return;
            default:
                ((src) this.v).getClass();
                return;
        }
    }

    public hg4(mg4 mg4, pzc pzc, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.v = mg4;
        this.b = pzc;
        this.c = view;
        this.o = viewPropertyAnimator;
    }
}
