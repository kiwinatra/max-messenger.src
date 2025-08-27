package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: r5f  reason: default package */
public final class r5f implements Animator.AnimatorListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View o;

    public r5f(View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = viewGroup;
        this.b = z;
        this.c = view;
        this.o = view2;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.b ? this.c : this.o;
        ViewGroup viewGroup = this.a;
        viewGroup.addView(kv0.p(viewGroup.getContext(), (Integer) null), viewGroup.indexOfChild(view));
    }
}
