package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: sk0  reason: default package */
public final class sk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0 wk0 = (wk0) obj;
                Iterator it = wk0.x0.iterator();
                while (it.hasNext()) {
                    rmf rmf = (rmf) it.next();
                    rmf.W0 = 1.2f;
                    rmf.U0 = floatValue;
                    rmf.V0 = floatValue;
                    rmf.X0 = xg.b(c44.DEFAULT_ASPECT_RATIO, 1.0f, 0.19f, 1.0f, floatValue);
                    rmf.invalidateSelf();
                }
                WeakHashMap weakHashMap = gag.a;
                wk0.postInvalidateOnAnimation();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh8 bh8 = ((BottomSheetBehavior) obj).i;
                if (bh8 != null) {
                    ah8 ah8 = bh8.a;
                    if (ah8.j != floatValue2) {
                        ah8.j = floatValue2;
                        bh8.v = true;
                        bh8.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((i53) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                ((wdd) obj).j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                jh5 jh5 = (jh5) obj;
                jh5.c.setAlpha(floatValue3);
                jh5.o.setAlpha(floatValue3);
                jh5.B0.invalidate();
                return;
            case 5:
                ((ul7) obj).v0 = valueAnimator.getAnimatedFraction();
                return;
            case 6:
                l9e l9e = (l9e) obj;
                l9e.d1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9e.o = (((l9e.d1 - l9e.j1) * l9e.b1) / l9e.e1) + l9e.b;
                l9e.invalidate();
                l9e.getClass();
                return;
            case 7:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) obj).E1.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
