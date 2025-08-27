package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jsf  reason: default package */
public final class jsf extends AnimatorListenerAdapter implements xrf {
    public final View a;
    public final View b;
    public int[] c;
    public float o;
    public float v;
    public final float w;
    public final float x;
    public boolean y;

    public jsf(View view, View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.w = f;
        this.x = f2;
        int[] iArr = (int[]) view2.getTag(yfc.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(yfc.transition_position, (Object) null);
        }
    }

    public final void a(yrf yrf) {
    }

    public final void b() {
        if (this.c == null) {
            this.c = new int[2];
        }
        int[] iArr = this.c;
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(yfc.transition_position, this.c);
        this.o = view.getTranslationX();
        this.v = view.getTranslationY();
        view.setTranslationX(this.w);
        view.setTranslationY(this.x);
    }

    public final void c(yrf yrf) {
        e(yrf);
    }

    public final void e(yrf yrf) {
        if (!this.y) {
            this.a.setTag(yfc.transition_position, (Object) null);
        }
    }

    public final void f() {
        float f = this.o;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.v);
    }

    public final void g(yrf yrf) {
        this.y = true;
        float f = this.w;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.x);
    }

    public final void onAnimationCancel(Animator animator) {
        this.y = true;
        float f = this.w;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.x);
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            float f = this.w;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.x);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
