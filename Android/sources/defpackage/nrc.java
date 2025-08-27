package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: nrc  reason: default package */
public final class nrc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qrc b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View o;
    public final /* synthetic */ src v;

    public /* synthetic */ nrc(src src, qrc qrc, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.v = src;
        this.b = qrc;
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
                qrc qrc = this.b;
                pzc pzc = qrc.a;
                src src = this.v;
                src.h(pzc);
                src.r.remove(qrc.a);
                src.x();
                return;
            default:
                this.c.setListener((Animator.AnimatorListener) null);
                View view2 = this.o;
                view2.setAlpha(1.0f);
                view2.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                qrc qrc2 = this.b;
                pzc pzc2 = qrc2.b;
                src src2 = this.v;
                src2.h(pzc2);
                src2.r.remove(qrc2.b);
                src2.x();
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
