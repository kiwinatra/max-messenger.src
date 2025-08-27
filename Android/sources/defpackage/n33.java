package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: n33  reason: default package */
public final class n33 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    public /* synthetic */ n33(int i) {
        this.a = i;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                animator.end();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                animator.removeAllListeners();
                return;
            case 2:
                animator.removeAllListeners();
                return;
            case 3:
                animator.removeAllListeners();
                return;
            case 4:
                animator.removeAllListeners();
                return;
            case 5:
                animator.removeAllListeners();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }
}
