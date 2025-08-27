package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: qb6  reason: default package */
public class qb6 extends Drawable implements Drawable.Callback, drf, crf, uu4 {
    public static final Matrix o = new Matrix();
    public Drawable a;
    public final ov6 b = new ov6();
    public drf c;

    public qb6(Drawable drawable) {
        this.a = drawable;
        cjf.P(drawable, this, this);
    }

    public void d(Matrix matrix) {
        n(matrix);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final Drawable f(Drawable drawable) {
        return o(drawable);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    public final Drawable getCurrent() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    public final void h(RectF rectF) {
        drf drf = this.c;
        if (drf != null) {
            drf.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public final Drawable j() {
        return this.a;
    }

    public final void l(drf drf) {
        this.c = drf;
    }

    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void n(Matrix matrix) {
        drf drf = this.c;
        if (drf != null) {
            drf.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable o(Drawable drawable) {
        ov6 ov6;
        Drawable drawable2 = this.a;
        cjf.P(drawable2, (Drawable.Callback) null, (drf) null);
        cjf.P(drawable, (Drawable.Callback) null, (drf) null);
        if (!(drawable == null || (ov6 = this.b) == null)) {
            ov6.a(drawable);
        }
        cjf.k(drawable, this);
        cjf.P(drawable, this, this);
        this.a = drawable;
        invalidateSelf();
        return drawable2;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.b.c = i;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ov6 ov6 = this.b;
        ov6.f = colorFilter;
        ov6.b = colorFilter != null;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setDither(boolean z) {
        this.b.d = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.b.e = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
