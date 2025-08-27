package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: brc  reason: default package */
public final class brc implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ drc b;
    public final /* synthetic */ View c;

    public brc(boolean z, drc drc, View view) {
        this.a = z;
        this.b = drc;
        this.c = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean booleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (booleanValue) {
                nqc nqc = view instanceof nqc ? (nqc) view : null;
                if (nqc == null || !nqc.b()) {
                    return;
                }
            }
            b0h.K(view, qw6.CONFIRM);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
