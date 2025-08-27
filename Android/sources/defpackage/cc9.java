package defpackage;

import android.animation.Animator;

/* renamed from: cc9  reason: default package */
public final class cc9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc9 b;

    public /* synthetic */ cc9(dc9 dc9, int i) {
        this.a = i;
        this.b = dc9;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.y.setAlpha(1.0f);
                return;
            case 1:
                return;
            case 2:
                this.b.y.setAlpha(1.0f);
                return;
            case 3:
                return;
            case 4:
                this.b.y.setAlpha(1.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                dc9 dc9 = this.b;
                dc9.y.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                dc9.y.setVisibility(0);
                return;
            case 2:
                return;
            case 3:
                dc9 dc92 = this.b;
                dc92.y.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                dc92.y.setVisibility(0);
                dc92.b.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                return;
            case 4:
                return;
            case 5:
                dc9 dc93 = this.b;
                dc93.c.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                dc93.b.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                dc93.y.setVisibility(0);
                return;
            default:
                this.b.y.setVisibility(4);
                return;
        }
    }
}
