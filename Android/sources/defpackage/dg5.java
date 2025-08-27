package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.android.root.RootController;

/* renamed from: dg5  reason: default package */
public final class dg5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ dg5(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.o = obj;
        this.b = z;
        this.c = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                KProperty[] kPropertyArr = RootController.z;
                ((RootController) this.o).h0(this.b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        boolean z = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 0:
                if (!z) {
                    ((View) obj).setVisibility(4);
                    View view = (View) obj2;
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    return;
                }
                return;
            case 1:
                qr5 qr5 = (qr5) obj2;
                qr5.r = 0;
                qr5.l = null;
                er7 er7 = (er7) obj;
                if (er7 != null) {
                    ((iq) er7.b).R();
                    return;
                }
                return;
            case 2:
                if (!z) {
                    ((View) ((he) obj2).o).setVisibility(8);
                }
                ((ValueAnimator) obj).removeAllUpdateListeners();
                animator.removeAllListeners();
                return;
            default:
                KProperty[] kPropertyArr = RootController.z;
                ((RootController) obj2).h0(z);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        Object obj = this.c;
        Object obj2 = this.o;
        boolean z = this.b;
        switch (this.a) {
            case 0:
                if (z) {
                    ((View) obj).setVisibility(0);
                    View view = (View) obj2;
                    view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                    view.setVisibility(4);
                    return;
                }
                return;
            case 1:
                qr5 qr5 = (qr5) obj2;
                qr5.s.a(0, z);
                qr5.r = 2;
                qr5.l = animator;
                return;
            case 2:
                if (z) {
                    he heVar = (he) obj2;
                    if (heVar.b) {
                        ((View) heVar.o).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                oi1 oi1 = (oi1) obj;
                if (oi1 != null) {
                    oi1.b(z);
                }
                KProperty[] kPropertyArr = RootController.z;
                RootController rootController = (RootController) obj2;
                rootController.k0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                rootController.l0(z);
                return;
        }
    }

    public dg5(boolean z, View view, View view2) {
        this.a = 0;
        this.b = z;
        this.c = view;
        this.o = view2;
    }

    public dg5(oi1 oi1, boolean z, RootController rootController) {
        this.a = 3;
        this.c = oi1;
        this.b = z;
        this.o = rootController;
    }
}
