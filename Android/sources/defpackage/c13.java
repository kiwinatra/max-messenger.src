package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c13  reason: default package */
public final class c13 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d13 b;

    public /* synthetic */ c13(d13 d13, int i) {
        this.a = i;
        this.b = d13;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                d13 d13 = this.b;
                d13.x();
                ye yeVar = d13.Z;
                if (yeVar != null) {
                    yeVar.a((ue7) d13.b);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                d13 d13 = this.b;
                d13.z = (d13.z + 4) % d13.y.c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
