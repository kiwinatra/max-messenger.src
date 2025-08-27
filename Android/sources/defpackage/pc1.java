package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: pc1  reason: default package */
public final class pc1 extends xbg {
    public final ViewPager2 a;
    public final ViewStub b;
    public final t11 c;
    public final xc1 d;
    public final Function1 e;
    public final Function0 f;
    public boolean g = true;
    public int h;
    public boolean i;

    public pc1(ViewPager2 viewPager2, ViewStub viewStub, t11 t11, xc1 xc1, zg1 zg1, yg1 yg1) {
        this.a = viewPager2;
        this.b = viewStub;
        this.c = t11;
        this.d = xc1;
        this.e = zg1;
        this.f = yg1;
    }

    public final void a(int i2) {
        this.g = i2 == 0;
    }

    public final void b(int i2, float f2, int i3) {
        int i4 = i2;
        if (f2 == c44.DEFAULT_ASPECT_RATIO) {
            this.h = i4;
        }
        int j = this.d.j() - 1;
        int i5 = this.h;
        boolean z = false;
        ViewStub viewStub = this.b;
        t11 t11 = this.c;
        if (j == i5) {
            if (!y7e.I(viewStub)) {
                y7e.C(viewStub, t11, (Function0) null);
            }
            if (this.h > i4) {
                z = true;
            }
            float f3 = z ? 1.0f - f2 : f2;
            double d2 = (double) f3;
            if (0.1d > d2 || d2 > 0.6d) {
                if (0.6d <= d2 && d2 <= 0.99d && !this.i) {
                    this.i = true;
                    int i6 = Build.VERSION.SDK_INT;
                    ViewPager2 viewPager2 = this.a;
                    if (i6 >= 30) {
                        b0h.K(viewPager2, qw6.GESTURE_START);
                    }
                    int i7 = this.h;
                    viewPager2.e(z ? i7 - 1 : i7 + 1, true);
                } else if (viewStub.getParent() == null) {
                    t11.setVisibility(8);
                }
            } else if (t11.getVisibility() != 0) {
                y7e.k(this.c, true, 0, (Function1) null, 6);
            }
            t11.setTranslationY((((Number) this.f.invoke()).floatValue() - ((float) i3)) + (vo4.c().getDisplayMetrics().density * -50.0f));
            int i8 = t11.c;
            float f4 = (((float) (t11.w - i8)) * f3) + ((float) i8);
            int i9 = t11.a;
            float f5 = (((float) (t11.o - i9)) * f3) + ((float) i9);
            int i10 = t11.b;
            float f6 = (((float) (t11.v - i10)) * f3) + ((float) i10);
            int roundToInt = MathKt.roundToInt(f4);
            u11 u11 = t11.y;
            u11.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            ViewGroup.LayoutParams layoutParams = u11.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = MathKt.roundToInt(f5);
                layoutParams.height = MathKt.roundToInt(f6);
                u11.setLayoutParams(layoutParams);
                t11.x.setAlpha(RangesKt.coerceAtMost(f3 * 3.0f, 1.0f));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (y7e.I(viewStub)) {
            t11.setVisibility(8);
        }
        this.i = false;
    }

    public final void c(int i2) {
        wc1 wc1;
        vag vag;
        ViewPager2 viewPager2 = this.a;
        boolean z = viewPager2.D0;
        z68.c("CallModeScrollTag", "viewpager position changed position=" + i2 + " isUserInputEnabled=" + z, new Object[0]);
        if (!(!z || (wc1 = (wc1) this.d.I(i2)) == null || (vag = wc1.a) == null || vag == vag.c)) {
            this.e.invoke(vag);
        }
        viewPager2.setUserInputEnabled(true);
    }
}
