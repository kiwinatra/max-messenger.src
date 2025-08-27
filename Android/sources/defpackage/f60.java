package defpackage;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: f60  reason: default package */
public final class f60 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ f60(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.o = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((g60) this.b).y0 = false;
                Function0 function0 = (Function0) this.o;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g60 g60 = (g60) this.b;
                g60.y0 = false;
                g60.setVisibility(8);
                g60.w0 = null;
                Function0 function0 = (Function0) this.c;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                ((xhd) this.b).x.put((rhd) this.c, (Object) null);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((g60) this.b).setVisibility(0);
                return;
            default:
                View view = (View) this.o;
                view.setVisibility(0);
                if (view.getTranslationY() == c44.DEFAULT_ASPECT_RATIO) {
                    view.setTranslationY(vo4.c().getDisplayMetrics().density * 4.0f);
                    return;
                }
                return;
        }
    }
}
