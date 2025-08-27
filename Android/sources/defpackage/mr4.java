package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: mr4  reason: default package */
public final class mr4 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ mr4(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
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
                return;
            default:
                this.b.setVisibility(8);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setVisibility(0);
                return;
            default:
                return;
        }
    }
}
