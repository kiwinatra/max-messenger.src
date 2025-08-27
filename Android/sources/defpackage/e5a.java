package defpackage;

import android.animation.Animator;

/* renamed from: e5a  reason: default package */
public final class e5a implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5a b;

    public /* synthetic */ e5a(h5a h5a, int i) {
        this.a = i;
        this.b = h5a;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
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
            default:
                h5a h5a = this.b;
                h5a.c.setScaleX(0.5f);
                h5a.c.setScaleY(0.5f);
                return;
        }
    }
}
