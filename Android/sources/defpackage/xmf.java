package defpackage;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: xmf  reason: default package */
public final class xmf implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Function0 x;

    public xmf(View view, int i, String str, float f, float f2, boolean z, float f3, Function0 function0) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.o = f2;
        this.v = z;
        this.w = f3;
        this.x = function0;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.v ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        Function0 function0 = this.x;
        if (function0 != null) {
            function0.invoke();
        }
        view.setTag(dad.M0, (Object) null);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.o);
        view.setVisibility(this.v ? 0 : 8);
        view.setTranslationY(this.w);
        Function0 function0 = this.x;
        if (function0 != null) {
            function0.invoke();
        }
        view.setTag(dad.M0, (Object) null);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = dad.M0;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
