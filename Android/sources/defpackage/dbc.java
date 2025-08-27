package defpackage;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.Chronometer;

/* renamed from: dbc  reason: default package */
public final /* synthetic */ class dbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Chronometer X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ IntEvaluator c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ View w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ View z;

    public /* synthetic */ dbc(boolean z2, View view, IntEvaluator intEvaluator, int i, int i2, View view2, int i3, int i4, View view3, Chronometer chronometer, boolean z3) {
        this.a = z2;
        this.b = view;
        this.c = intEvaluator;
        this.o = i;
        this.v = i2;
        this.w = view2;
        this.x = i3;
        this.y = i4;
        this.z = view3;
        this.X = chronometer;
        this.Y = z3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        boolean z2 = this.a;
        View view = this.b;
        IntEvaluator intEvaluator = this.c;
        int i = this.o;
        int i2 = this.v;
        View view2 = this.w;
        int i3 = this.x;
        int i4 = this.y;
        View view3 = this.z;
        Chronometer chronometer = this.X;
        if (z2) {
            view.setTranslationY((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i), Integer.valueOf(i2)).intValue());
            view2.setTranslationY((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i3), Integer.valueOf(i4)).intValue());
            view3.setTranslationY((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i3), Integer.valueOf(i4)).intValue());
            chronometer.setTranslationY((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i4), Integer.valueOf(i3)).intValue());
        } else {
            view.setTranslationX((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i), Integer.valueOf(i2)).intValue());
            view2.setTranslationX((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i3), Integer.valueOf(i4)).intValue());
            view3.setTranslationX((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i3), Integer.valueOf(i4)).intValue());
            chronometer.setTranslationX((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i4), Integer.valueOf(i3)).intValue());
        }
        boolean z3 = this.Y;
        view.setAlpha(npg.G(f, z3));
        view2.setAlpha(npg.G(f, z3));
        view3.setAlpha(npg.G(f, z3));
        chronometer.setAlpha(npg.G(f, !z3));
    }
}
