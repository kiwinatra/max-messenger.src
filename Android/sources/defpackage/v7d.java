package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.KProperty;
import one.me.android.root.RootController;

/* renamed from: v7d  reason: default package */
public final /* synthetic */ class v7d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ v7d(float f, oz1 oz1) {
        this.a = 0;
        this.c = f;
        this.b = oz1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.c;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RootController.z;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f2 != null) {
                    f = f2.floatValue();
                }
                View view = (View) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) f;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 1:
                View view2 = (View) obj;
                view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (f == c44.DEFAULT_ASPECT_RATIO) {
                    f = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= f) {
                    view2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            default:
                e44 e44 = (e44) obj;
                float abs = Math.abs((e44.y0 - f) - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e44.y0 += abs;
                Matrix matrix = e44.Y;
                RectF rectF = e44.x;
                matrix.postRotate(abs, rectF.centerX(), rectF.centerY());
                e44.X.set(matrix);
                asg asg = e44.b;
                if (asg != null) {
                    asg.b(matrix);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v7d(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }
}
