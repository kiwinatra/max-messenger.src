package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ch8  reason: default package */
public final class ch8 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dh8 c;

    public ch8(dh8 dh8, boolean z, int i) {
        this.c = dh8;
        this.a = z;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        dh8 dh8 = this.c;
        dh8.b.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
        dh8.a(c44.DEFAULT_ASPECT_RATIO, this.a, this.b);
    }
}
