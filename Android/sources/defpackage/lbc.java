package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: lbc  reason: default package */
public final /* synthetic */ class lbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ pk4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ IntEvaluator c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ lbc(pk4 pk4, boolean z2, IntEvaluator intEvaluator, int i, int i2, int i3, int i4, int i5, int i6, View view) {
        this.a = pk4;
        this.b = z2;
        this.c = intEvaluator;
        this.o = i;
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.X = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        pk4 pk4 = this.a;
        b4a b4a = (b4a) pk4.a;
        View view = (View) b4a.c;
        boolean z2 = this.b;
        if (view != null) {
            if (!b4a.Y0) {
                z6 z6Var = new z6(11, (Object) b4a);
                npg npg = b4a.W0;
                ImageView imageView = b4a.G0;
                he heVar = b4a.V0.y;
                View[] viewArr = {b4a.K0, b4a.H0};
                ValueAnimator valueAnimator2 = (ValueAnimator) npg.c;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                    npg.c = ofFloat;
                    ofFloat.addUpdateListener(new cbc(imageView, z2, viewArr));
                    ((ValueAnimator) npg.c).addListener(z6Var);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ValueAnimator valueAnimator3 = (ValueAnimator) npg.c;
                    View view2 = (View) heVar.c;
                    if (z2) {
                        view2.setRotation(c44.DEFAULT_ASPECT_RATIO);
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                    ofFloat2.addUpdateListener(new x81(new View[]{view2}, z2, 1));
                    ofFloat2.addListener(new n33(5));
                    animatorSet.playTogether(new Animator[]{valueAnimator3, ofFloat2});
                    animatorSet.setDuration(200);
                    animatorSet.start();
                }
            }
            b4a.Y0 = true;
        }
        Float f = (Float) valueAnimator.getAnimatedValue();
        float floatValue = f.floatValue();
        Integer valueOf = Integer.valueOf(this.o);
        Integer valueOf2 = Integer.valueOf(this.v);
        IntEvaluator intEvaluator = this.c;
        Integer evaluate = intEvaluator.evaluate(floatValue, valueOf, valueOf2);
        Integer evaluate2 = intEvaluator.evaluate(f.floatValue(), Integer.valueOf(this.w), Integer.valueOf(this.x));
        Integer evaluate3 = intEvaluator.evaluate(f.floatValue(), Integer.valueOf(this.y), Integer.valueOf(this.z));
        View view3 = this.X;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        layoutParams.width = evaluate2.intValue();
        layoutParams.height = evaluate3.intValue();
        view3.setLayoutParams(layoutParams);
        view3.setTranslationY((float) evaluate.intValue());
        ((ok8) ((mbc) pk4.d)).v(f, z2);
    }
}
