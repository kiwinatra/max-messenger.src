package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import kotlin.Lazy;
import kotlin.math.MathKt;

/* renamed from: vg1  reason: default package */
public final /* synthetic */ class vg1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ObjectAnimator a;
    public final /* synthetic */ xg1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View o;
    public final /* synthetic */ PointF v;
    public final /* synthetic */ mi1 w;

    public /* synthetic */ vg1(ObjectAnimator objectAnimator, xg1 xg1, boolean z, View view, PointF pointF, mi1 mi1) {
        this.a = objectAnimator;
        this.b = xg1;
        this.c = z;
        this.o = view;
        this.v = pointF;
        this.w = mi1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        xg1 xg1 = this.b;
        long j = xg1.o;
        ObjectAnimator objectAnimator = this.a;
        objectAnimator.setDuration(j);
        boolean z = this.c;
        float animatedFraction = z ? objectAnimator.getAnimatedFraction() : ((float) 1) - objectAnimator.getAnimatedFraction();
        View view = this.o;
        int width = view.getWidth();
        int height = view.getHeight();
        PointF pointF = this.v;
        float f = pointF.x;
        float f2 = ((float) 1) - animatedFraction;
        float f3 = pointF.y * f2;
        float min = Math.min(f, f * f2);
        float min2 = Math.min(pointF.y, f3);
        float f4 = ((float) width) * animatedFraction;
        float f5 = ((float) height) * animatedFraction;
        float f6 = pointF.x;
        Lazy lazy = xg1.Y;
        ((c91) ((b91) lazy.getValue())).getClass();
        float max = Math.max(f6 + ((float) MathKt.roundToInt(((float) 118) * vo4.c().getDisplayMetrics().density)), f4);
        float f7 = pointF.y;
        ((c91) ((b91) lazy.getValue())).getClass();
        RectF rectF = new RectF(min, min2, max, Math.max(f7 + ((float) MathKt.roundToInt(((float) 174) * vo4.c().getDisplayMetrics().density)), f5));
        mi1 mi1 = this.w;
        if (mi1 != null) {
            mi1.e(rectF, z);
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        kne.i(view, rect, vo4.c().getDisplayMetrics().density * 20.0f);
    }
}
