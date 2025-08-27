package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: qng  reason: default package */
public final class qng implements View.OnApplyWindowInsetsListener {
    public final n22 a;
    public iog b;

    public qng(View view, n22 n22) {
        iog iog;
        this.a = n22;
        WeakHashMap weakHashMap = gag.a;
        iog a2 = w9g.a(view);
        if (a2 != null) {
            iog = (Build.VERSION.SDK_INT >= 30 ? new yng(a2) : new xng(a2)).b();
        } else {
            iog = null;
        }
        this.b = iog;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        fog fog;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.b = iog.g(view, windowInsets);
            return rng.i(view, windowInsets);
        }
        iog g = iog.g(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = gag.a;
            this.b = w9g.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return rng.i(view, windowInsets);
        }
        n22 j = rng.j(view);
        if (j != null && Objects.equals((WindowInsets) j.b, windowInsets2)) {
            return rng.i(view, windowInsets);
        }
        iog iog = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            fog = g.a;
            if (i > 256) {
                break;
            }
            if (!fog.f(i).equals(iog.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return rng.i(view, windowInsets);
        }
        iog iog2 = this.b;
        vng vng = new vng(i2, (i2 & 8) != 0 ? fog.f(8).d > iog2.a.f(8).d ? rng.e : rng.f : rng.g, 160);
        vng.a.d(c44.DEFAULT_ASPECT_RATIO);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f}).setDuration(vng.a.a());
        wh7 f = fog.f(i2);
        wh7 f2 = iog2.a.f(i2);
        int min = Math.min(f.a, f2.a);
        int i3 = f.b;
        int i4 = f2.b;
        int min2 = Math.min(i3, i4);
        int i5 = f.c;
        int i6 = f2.c;
        int min3 = Math.min(i5, i6);
        ValueAnimator valueAnimator = duration;
        int i7 = f.d;
        int i8 = i2;
        int i9 = f2.d;
        h0h h0h = new h0h(wh7.b(min, min2, min3, Math.min(i7, i9)), wh7.b(Math.max(f.a, f2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        rng.f(view2, vng, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new png(vng, g, iog2, i8, view));
        valueAnimator2.addListener(new wh(8, vng, view2));
        u3b.a(view2, new iqg(view2, vng, h0h, valueAnimator2));
        this.b = g;
        return rng.i(view, windowInsets);
    }
}
