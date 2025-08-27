package defpackage;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: kbc  reason: default package */
public final /* synthetic */ class kbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ he a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ IntEvaluator c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ boolean w;

    public /* synthetic */ kbc(he heVar, boolean z, IntEvaluator intEvaluator, int i, int i2, boolean z2) {
        this.a = heVar;
        this.b = z;
        this.c = intEvaluator;
        this.o = i;
        this.v = i2;
        this.w = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        he heVar = this.a;
        heVar.getClass();
        Float f = (Float) valueAnimator.getAnimatedValue();
        boolean z = this.b;
        IntEvaluator intEvaluator = this.c;
        int i = this.o;
        int i2 = this.v;
        View view = (View) heVar.o;
        if (z) {
            view.setTranslationY((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i), Integer.valueOf(i2)).intValue());
        } else {
            view.setTranslationX((float) intEvaluator.evaluate(f.floatValue(), Integer.valueOf(i), Integer.valueOf(i2)).intValue());
        }
        view.setAlpha(npg.G(f, this.w));
    }
}
