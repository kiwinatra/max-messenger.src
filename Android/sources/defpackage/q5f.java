package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: q5f  reason: default package */
public final /* synthetic */ class q5f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View o;

    public /* synthetic */ q5f(View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = viewGroup;
        this.b = z;
        this.c = view;
        this.o = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.b;
        View view = this.c;
        View view2 = this.o;
        View view3 = z ? view : view2;
        if (z) {
            view = view2;
        }
        int i = mhc.swipe_fade;
        ViewGroup viewGroup = this.a;
        f6e.A(viewGroup, view3, view, viewGroup.findViewById(i), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
