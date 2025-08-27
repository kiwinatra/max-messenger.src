package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: wr5  reason: default package */
public final /* synthetic */ class wr5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yr5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;

    public /* synthetic */ wr5(yr5 yr5, int i, int i2, int i3, int i4) {
        this.a = yr5;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.v = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        yr5 yr5 = this.a;
        yr5.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = yr5.a;
        int i2 = i + ((int) (((float) (this.b - i)) * floatValue));
        int i3 = yr5.b;
        int i4 = i3 + ((int) (((float) (this.c - i3)) * floatValue));
        float f = yr5.c;
        float f2 = yr5.o;
        yr5.w.setLayoutParams(new FrameLayout.LayoutParams(i2, i4));
        yr5.w.setTranslationX((float) ((int) i2a.f((float) this.o, f, floatValue, f)));
        yr5.w.setTranslationY((float) ((int) i2a.f((float) this.v, f2, floatValue, f2)));
        yr5.invalidate();
    }
}
