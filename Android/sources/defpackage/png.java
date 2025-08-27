package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: png  reason: default package */
public final class png implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ vng a;
    public final /* synthetic */ iog b;
    public final /* synthetic */ iog c;
    public final /* synthetic */ int o;
    public final /* synthetic */ View v;

    public png(vng vng, iog iog, iog iog2, int i, View view) {
        this.a = vng;
        this.b = iog;
        this.c = iog2;
        this.o = i;
        this.v = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        vng vng;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        vng vng2 = this.a;
        vng2.a.d(animatedFraction);
        float b2 = vng2.a.b();
        PathInterpolator pathInterpolator = rng.e;
        int i = Build.VERSION.SDK_INT;
        iog iog = this.b;
        xng yng = i >= 30 ? new yng(iog) : new xng(iog);
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.o & i2) == 0) {
                yng.c(i2, iog.a.f(i2));
                f = b2;
                vng = vng2;
            } else {
                wh7 f2 = iog.a.f(i2);
                wh7 f3 = this.c.a.f(i2);
                float f4 = 1.0f - b2;
                int i3 = (int) (((double) (((float) (f2.a - f3.a)) * f4)) + 0.5d);
                int i4 = (int) (((double) (((float) (f2.b - f3.b)) * f4)) + 0.5d);
                f = b2;
                int i5 = (int) (((double) (((float) (f2.c - f3.c)) * f4)) + 0.5d);
                vng = vng2;
                int i6 = (int) (((double) (((float) (f2.d - f3.d)) * f4)) + 0.5d);
                int max = Math.max(0, f2.a - i3);
                int max2 = Math.max(0, f2.b - i4);
                int max3 = Math.max(0, f2.c - i5);
                int max4 = Math.max(0, f2.d - i6);
                if (!(max == i3 && max2 == i4 && max3 == i5 && max4 == i6)) {
                    f2 = wh7.b(max, max2, max3, max4);
                }
                yng.c(i2, f2);
            }
            i2 <<= 1;
            b2 = f;
            vng2 = vng;
        }
        rng.g(this.v, yng.b(), Collections.singletonList(vng2));
    }
}
