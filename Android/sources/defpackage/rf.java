package defpackage;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function2;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rf  reason: default package */
public final /* synthetic */ class rf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rf(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((OneMeButton) this.c).setTranslationY(floatValue);
                ((OneMeButton) this.o).setTranslationY((-this.b) + floatValue);
                return;
            case 1:
                orb.d((orb) this.c, (Function2) this.o, this.b, valueAnimator);
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i0b i0b = (i0b) ((e6f) this.c);
                boolean z = true;
                if ((((z0b) i0b.a.o).v.a & 1) == 0) {
                    z = false;
                }
                c1b c1b = i0b.b;
                c1b.offsetTopAndBottom(intValue - (z ? c1b.getBottom() : c1b.getTop()));
                ((Function2) this.o).invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(this.b));
                return;
        }
    }
}
