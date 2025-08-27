package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* renamed from: drb  reason: default package */
public final class drb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ drb(Function0 function0, FrameLayout frameLayout, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = frameLayout;
        this.o = function02;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((nrb) this.o).requestLayout();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((orb) this.c).requestLayout();
                ((Function0) this.o).invoke();
                return;
            default:
                ((f6f) this.c).requestLayout();
                ((Function0) this.o).invoke();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nrb nrb = (nrb) this.o;
                nrb.requestLayout();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                nrb.w = null;
                return;
            case 1:
                orb orb = (orb) this.c;
                orb.requestLayout();
                ((Function0) this.o).invoke();
                orb.v = null;
                return;
            default:
                f6f f6f = (f6f) this.c;
                f6f.requestLayout();
                ((Function0) this.o).invoke();
                f6f.c = null;
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((Function0) this.b).invoke();
                return;
            default:
                ((Function0) this.b).invoke();
                return;
        }
    }

    public drb(nrb nrb, Runnable runnable, Runnable runnable2) {
        this.a = 0;
        this.o = nrb;
        this.b = runnable;
        this.c = runnable2;
    }
}
