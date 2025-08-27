package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: jg4  reason: default package */
public final class jg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg4 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View o;
    public final /* synthetic */ mg4 v;

    public /* synthetic */ jg4(mg4 mg4, kg4 kg4, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.v = mg4;
        this.b = kg4;
        this.c = viewPropertyAnimator;
        this.o = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener((Animator.AnimatorListener) null);
                View view = this.o;
                view.setAlpha(1.0f);
                view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                kg4 kg4 = this.b;
                pzc pzc = kg4.a;
                mg4 mg4 = this.v;
                mg4.h(pzc);
                mg4.r.remove(kg4.a);
                mg4.w();
                return;
            default:
                this.c.setListener((Animator.AnimatorListener) null);
                View view2 = this.o;
                view2.setAlpha(1.0f);
                view2.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                kg4 kg42 = this.b;
                pzc pzc2 = kg42.b;
                mg4 mg42 = this.v;
                mg42.h(pzc2);
                mg42.r.remove(kg42.b);
                mg42.w();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                pzc pzc = this.b.a;
                this.v.getClass();
                return;
            default:
                pzc pzc2 = this.b.b;
                this.v.getClass();
                return;
        }
    }
}
