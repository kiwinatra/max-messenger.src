package defpackage;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: ah  reason: default package */
public final class ah implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function1 w;

    public ah(View view, int i, String str, float f, float f2, boolean z, Function1 function1) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.o = f2;
        this.v = z;
        this.w = function1;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setAlpha(this.o);
        boolean z = false;
        view.setVisibility(this.v ? 0 : 8);
        Function1 function1 = this.w;
        if (function1 != null) {
            if (view.getVisibility() == 0) {
                z = true;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        view.setTag(qqa.b, (Object) null);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.o);
        boolean z = false;
        view.setVisibility(this.v ? 0 : 8);
        Function1 function1 = this.w;
        if (function1 != null) {
            if (view.getVisibility() == 0) {
                z = true;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        view.setTag(qqa.b, (Object) null);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = qqa.b;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
