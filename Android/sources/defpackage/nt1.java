package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;

/* renamed from: nt1  reason: default package */
public final /* synthetic */ class nt1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ pt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float o;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;

    public /* synthetic */ nt1(pt1 pt1, int i, int i2, float f, float f2, float f3, float f4) {
        this.a = pt1;
        this.b = i;
        this.c = i2;
        this.o = f;
        this.v = f2;
        this.w = f3;
        this.x = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        pt1 pt1 = this.a;
        pt1.w.setColor(((Integer) pt1.b.evaluate(animatedFraction, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue());
        FloatEvaluator floatEvaluator = pt1.c;
        pt1.x = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.o), Float.valueOf(this.v)).floatValue();
        pt1.y = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.w), Float.valueOf(this.x)).floatValue();
        pt1.invalidate();
    }
}
