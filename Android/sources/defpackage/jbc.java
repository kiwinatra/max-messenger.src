package defpackage;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jbc  reason: default package */
public final /* synthetic */ class jbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ jbc(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
        this.v = obj3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                Float f = (Float) valueAnimator.getAnimatedValue();
                int i = (f.floatValue() > 0.5f ? 1 : (f.floatValue() == 0.5f ? 0 : -1));
                ImageView imageView = (ImageView) this.o;
                IntEvaluator intEvaluator = (IntEvaluator) this.v;
                if (i >= 0) {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                    if (atomicBoolean.get()) {
                        atomicBoolean.set(false);
                        imageView.setY(c44.DEFAULT_ASPECT_RATIO);
                        imageView.setImageResource(this.b);
                    }
                    imageView.setAlpha((f.floatValue() - 0.5f) * 2.0f);
                    imageView.setTranslationY((float) intEvaluator.evaluate((f.floatValue() - 0.5f) * 2.0f, 0, 0).intValue());
                    return;
                }
                imageView.setAlpha(1.0f - (f.floatValue() * 2.0f));
                imageView.setTranslationY((float) intEvaluator.evaluate(f.floatValue() * 2.0f, 0, Integer.valueOf(imageView.getMeasuredHeight())).intValue());
                return;
            default:
                ((SideSheetBehavior) this.c).a.a0((ViewGroup.MarginLayoutParams) this.o, xg.c(this.b, valueAnimator.getAnimatedFraction(), 0));
                ((View) this.v).requestLayout();
                return;
        }
    }
}
