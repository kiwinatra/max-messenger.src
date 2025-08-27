package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ldg  reason: default package */
public final class ldg extends AnimatorListenerAdapter implements xrf {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean o;
    public boolean v;
    public boolean w = false;

    public ldg(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.o = true;
        h(true);
    }

    public final void a(yrf yrf) {
    }

    public final void b() {
        h(false);
        if (!this.w) {
            dz1 dz1 = tcg.a;
            this.a.setTransitionVisibility(this.b);
        }
    }

    public final void c(yrf yrf) {
        yrf.D(this);
    }

    public final void f() {
        h(true);
        if (!this.w) {
            dz1 dz1 = tcg.a;
            this.a.setTransitionVisibility(0);
        }
    }

    public final void g(yrf yrf) {
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (this.o && this.v != z && (viewGroup = this.c) != null) {
            this.v = z;
            nag.b(viewGroup, z);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.w = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.w) {
            dz1 dz1 = tcg.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            dz1 dz1 = tcg.a;
            this.a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.w) {
                dz1 dz1 = tcg.a;
                this.a.setTransitionVisibility(this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }
}
