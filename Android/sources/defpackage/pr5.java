package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: pr5  reason: default package */
public abstract class pr5 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float b;
    public float c;
    public final /* synthetic */ qr5 o;

    public pr5(sr5 sr5) {
        this.o = sr5;
    }

    public abstract float a();

    public final void onAnimationEnd(Animator animator) {
        float f = (float) ((int) this.c);
        bh8 bh8 = this.o.b;
        if (bh8 != null) {
            bh8.k(f);
        }
        this.a = false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.a;
        qr5 qr5 = this.o;
        if (!z) {
            bh8 bh8 = qr5.b;
            this.b = bh8 == null ? c44.DEFAULT_ASPECT_RATIO : bh8.a.n;
            this.c = a();
            this.a = true;
        }
        float f = this.b;
        float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.c - f)) + f));
        bh8 bh82 = qr5.b;
        if (bh82 != null) {
            bh82.k(animatedFraction);
        }
    }
}
