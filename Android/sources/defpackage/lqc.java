package defpackage;

import android.animation.Animator;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: lqc  reason: default package */
public final class lqc implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lqc(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                ((RecordControlsWidget) this.c).s0().setTranslationY(this.b);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                nqc nqc = (nqc) this.c;
                nqc.a = true;
                nqc.o = this.b;
                return;
            default:
                return;
        }
    }
}
