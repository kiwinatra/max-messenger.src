package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.text.StaticLayout;
import android.view.View;

/* renamed from: i56  reason: default package */
public final class i56 {
    public final float a;
    public final float b;
    public final Object c;

    public i56(View view, int i, int i2, float f, float f2) {
        this.c = view;
        this.a = f;
        this.b = f2;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        animatorSet.setStartDelay((long) 1000);
        animatorSet.setTarget(view);
        ((AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i)).setTarget(view);
        animatorSet.addListener(new eg5(view));
        a();
    }

    public void a() {
        View view = (View) this.c;
        view.setPivotX(this.a * ((float) view.getMeasuredWidth()));
        view.setPivotY(this.b * ((float) view.getMeasuredHeight()));
    }

    public i56(StaticLayout staticLayout, float f, float f2) {
        this.c = staticLayout;
        this.a = f;
        this.b = f2;
    }
}
