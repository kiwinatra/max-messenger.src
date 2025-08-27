package defpackage;

import android.content.Context;
import android.graphics.Color;
import kotlin.KotlinVersion;

/* renamed from: x05  reason: default package */
public final class x05 {
    public static final int f = ((int) Math.round(5.1000000000000005d));
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public x05(Context context) {
        boolean U = b59.U(edc.elevationOverlayEnabled, context, false);
        int y = ld9.y(edc.elevationOverlayColor, 0, context);
        int y2 = ld9.y(edc.elevationOverlayAccentColor, 0, context);
        int y3 = ld9.y(edc.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = U;
        this.b = y;
        this.c = y2;
        this.d = y3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || w53.h(i, KotlinVersion.MAX_COMPONENT_VALUE) != this.d) {
            return i;
        }
        float f3 = this.e;
        float min = (f3 <= c44.DEFAULT_ASPECT_RATIO || f2 <= c44.DEFAULT_ASPECT_RATIO) ? 0.0f : Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int K = ld9.K(w53.h(i, KotlinVersion.MAX_COMPONENT_VALUE), min, this.b);
        if (min > c44.DEFAULT_ASPECT_RATIO && (i2 = this.c) != 0) {
            K = w53.f(w53.h(i2, f), K);
        }
        return w53.h(K, alpha);
    }
}
