package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: vv7  reason: default package */
public final class vv7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv7 b;

    public /* synthetic */ vv7(wv7 wv7, int i) {
        this.a = i;
        this.b = wv7;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                wv7 wv7 = this.b;
                wv7.x();
                ye yeVar = wv7.Z;
                if (yeVar != null) {
                    yeVar.a((ue7) wv7.b);
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
                wv7 wv7 = this.b;
                wv7.z = (wv7.z + 1) % wv7.y.c.length;
                wv7.X = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
