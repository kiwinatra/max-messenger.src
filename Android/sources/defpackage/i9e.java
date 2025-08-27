package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: i9e  reason: default package */
public final class i9e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9e b;

    public /* synthetic */ i9e(l9e l9e, int i) {
        this.a = i;
        this.b = l9e;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                l9e l9e = this.b;
                l9e.g1 = false;
                l9e.invalidate();
                return;
            default:
                l9e l9e2 = this.b;
                l9e2.o = (((l9e2.d1 - l9e2.j1) * l9e2.b1) / l9e2.e1) + l9e2.b;
                l9e2.g1 = false;
                l9e2.n1 = true;
                l9e2.invalidate();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l9e l9e = this.b;
                l9e.g1 = false;
                l9e.invalidate();
                l9e.getClass();
                return;
            default:
                l9e l9e2 = this.b;
                l9e2.o = (((l9e2.d1 - l9e2.j1) * l9e2.b1) / l9e2.e1) + l9e2.b;
                l9e2.g1 = false;
                l9e2.n1 = true;
                l9e2.invalidate();
                l9e2.getClass();
                return;
        }
    }
}
