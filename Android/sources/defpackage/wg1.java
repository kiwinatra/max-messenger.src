package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: wg1  reason: default package */
public final class wg1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ View w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ uh y;

    public /* synthetic */ wg1(uh uhVar, View view, boolean z, View view2, boolean z2, View view3, boolean z3, int i) {
        this.a = i;
        this.y = uhVar;
        this.b = view;
        this.c = z;
        this.o = view2;
        this.v = z2;
        this.w = view3;
        this.x = z3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                xg1.o((xg1) this.y, this.o, this.v);
                return;
            default:
                gk1.o((gk1) this.y, this.o, this.v);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xg1.o((xg1) this.y, this.b, this.c);
                return;
            default:
                gk1.o((gk1) this.y, this.b, this.c);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                View view = this.w;
                mi1 mi1 = view instanceof mi1 ? (mi1) view : null;
                if (mi1 != null) {
                    mi1.g(this.x);
                    return;
                }
                return;
            default:
                View view2 = this.w;
                oi1 oi1 = view2 instanceof oi1 ? (oi1) view2 : null;
                if (oi1 != null) {
                    oi1.b(this.x);
                    return;
                }
                return;
        }
    }
}
