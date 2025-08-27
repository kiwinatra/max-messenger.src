package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: k23  reason: default package */
public final class k23 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l23 b;

    public /* synthetic */ k23(l23 l23, int i) {
        this.a = i;
        this.b = l23;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
