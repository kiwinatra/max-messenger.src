package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: fg5  reason: default package */
public final class fg5 extends AnimatorListenerAdapter implements xrf {
    public final View a;
    public boolean b = false;

    public fg5(View view) {
        this.a = view;
    }

    public final void a(yrf yrf) {
    }

    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            dz1 dz1 = tcg.a;
            f = view.getTransitionAlpha();
        } else {
            f = c44.DEFAULT_ASPECT_RATIO;
        }
        view.setTag(yfc.transition_pause_alpha, Float.valueOf(f));
    }

    public final void c(yrf yrf) {
    }

    public final void d(yrf yrf) {
    }

    public final void f() {
        this.a.setTag(yfc.transition_pause_alpha, (Object) null);
    }

    public final void g(yrf yrf) {
    }

    public final void onAnimationCancel(Animator animator) {
        dz1 dz1 = tcg.a;
        this.a.setTransitionAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z) {
            dz1 dz1 = tcg.a;
            view.setTransitionAlpha(1.0f);
        }
    }
}
