package defpackage;

import android.animation.Animator;

/* renamed from: gff  reason: default package */
public final class gff implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hff b;

    public /* synthetic */ gff(hff hff, int i) {
        this.a = i;
        this.b = hff;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.l.setVisibility(8);
                return;
            case 1:
                hff hff = this.b;
                hff.l.setAdapter(hff.o);
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
            case 1:
                return;
            default:
                this.b.l.setVisibility(0);
                return;
        }
    }
}
