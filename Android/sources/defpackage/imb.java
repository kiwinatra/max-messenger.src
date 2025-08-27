package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: imb  reason: default package */
public final /* synthetic */ class imb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ jmb o;

    public /* synthetic */ imb(PointF pointF, float f, float f2, jmb jmb) {
        this.a = pointF;
        this.b = f;
        this.c = f2;
        this.o = jmb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PointF pointF = this.a;
        float f = pointF.x;
        float f2 = i2a.f(this.b, f, floatValue, f);
        float f3 = pointF.y;
        float f4 = i2a.f(this.c, f3, floatValue, f3);
        jmb jmb = this.o;
        jmb.b.l(f2, f4);
        PointF pointF2 = ((c91) jmb.c).b;
        pointF2.x = f2;
        pointF2.y = f4;
    }
}
