package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: mdg  reason: default package */
public final class mdg extends AnimatorListenerAdapter implements xrf {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean o = true;
    public final /* synthetic */ odg v;

    public mdg(odg odg, ViewGroup viewGroup, View view, View view2) {
        this.v = odg;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a(yrf yrf) {
    }

    public final void b() {
    }

    public final void c(yrf yrf) {
        yrf.D(this);
    }

    public final void f() {
    }

    public final void g(yrf yrf) {
        if (this.o) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(yfc.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.b);
        this.o = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.v.e();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            int i = yfc.save_overlay_view;
            View view2 = this.b;
            view.setTag(i, view2);
            this.a.getOverlay().add(view2);
            this.o = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            h();
        }
    }
}
