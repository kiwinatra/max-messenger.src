package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import kotlin.jvm.functions.Function0;

/* renamed from: xh  reason: default package */
public final class xh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Animator b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ xh(AnimatorSet animatorSet, Function0 function0, int i) {
        this.a = i;
        this.b = animatorSet;
        this.c = function0;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeListener(this);
                this.c.invoke();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.removeListener(this);
                this.c.invoke();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
