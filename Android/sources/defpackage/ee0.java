package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: ee0  reason: default package */
public final class ee0 extends Drawable implements phf {
    public final Drawable a;
    public final joa b;
    public final Function1 c;
    public final Function1 o;
    public final Paint v;
    public final Lazy w;

    public ee0(Drawable drawable, joa joa, k2b k2b, Function1 function1, Function1 function12) {
        Paint paint;
        this.a = drawable;
        this.b = joa;
        this.c = function1;
        this.o = function12;
        if (function12 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) function12.invoke(k2b)).intValue());
        } else {
            paint = null;
        }
        this.v = paint;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(17));
        this.w = lazy;
        if ((joa instanceof ioa) && paint != null) {
            t4e.a((Path) lazy.getValue(), getBounds());
        }
        if (function1 != null) {
            ru4.g(drawable, ((Number) function1.invoke(k2b)).intValue());
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.v;
        if (paint != null) {
            joa joa = this.b;
            if (joa instanceof goa) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
            } else if (joa instanceof ioa) {
                canvas.drawPath((Path) this.w.getValue(), paint);
            } else if (!Intrinsics.areEqual((Object) joa, (Object) hoa.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Drawable drawable = this.a;
        float width = ((float) drawable.getBounds().width()) / 2.0f;
        int save = canvas.save();
        canvas.translate(getBounds().exactCenterX() - width, getBounds().exactCenterY() - width);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        joa joa = this.b;
        boolean z = joa instanceof ioa;
        Drawable drawable = this.a;
        Paint paint = this.v;
        if (z) {
            t4e.a((Path) this.w.getValue(), rect);
        } else if (joa instanceof hoa) {
            int min = Math.min(rect.width(), rect.height());
            if (paint != null) {
                int i = OneMeAvatarView.E0;
                min = ct.p(min);
            }
            drawable.setBounds(0, 0, min, min);
        }
        int min2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            int i2 = OneMeAvatarView.E0;
            min2 = ct.p(min2);
        }
        drawable.setBounds(0, 0, min2, min2);
    }

    public final void onThemeChanged(k2b k2b) {
        Function1 function1;
        Paint paint = this.v;
        if (!(paint == null || (function1 = this.o) == null)) {
            paint.setColor(((Number) function1.invoke(k2b)).intValue());
        }
        Drawable drawable = this.a;
        Function1 function12 = this.c;
        if (function12 != null) {
            ru4.g(drawable, ((Number) function12.invoke(k2b)).intValue());
        }
        if (paint == null && function12 == null) {
            phf phf = drawable instanceof phf ? (phf) drawable : null;
            if (phf != null) {
                phf.onThemeChanged(k2b);
            }
        }
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
