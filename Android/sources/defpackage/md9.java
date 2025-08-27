package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.KotlinVersion;

/* renamed from: md9  reason: default package */
public final class md9 extends Drawable {
    public static int b = 0;
    public static boolean c = true;
    public static long d = SystemClock.elapsedRealtime();
    public final Drawable a;

    public md9(boolean z) {
        Drawable E = iq.E(nad.O, z ? -1 : fw3.a(ym.v, lad.o), ym.v);
        this.a = E;
        E.setBounds(0, 0, E.getIntrinsicWidth(), E.getIntrinsicHeight());
    }

    public final void draw(Canvas canvas) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - d;
        if (j > 30) {
            d = elapsedRealtime;
            if (c) {
                b = (int) ((((double) j) * 0.2d) + ((double) b));
            } else {
                b = (int) (((double) b) - (((double) j) * 0.2d));
            }
            if (b < 100) {
                b = 100;
                c = true;
            }
            if (b > 255) {
                b = KotlinVersion.MAX_COMPONENT_VALUE;
                c = false;
            }
        }
        int i = b;
        Drawable drawable = this.a;
        drawable.setAlpha(i);
        drawable.draw(canvas);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.a.getMinimumHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
