package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: yw4  reason: default package */
public final class yw4 extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public boolean b;

    public yw4(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public final void a(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final void b(float f, float f2) {
        ru4.e(this.a, f, f2);
    }

    public final void c(int i, int i2, int i3, int i4) {
        ru4.f(this.a, i, i2, i3, i4);
    }

    public final boolean d(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.a.setVisible(z, z2);
    }

    public final void draw(Canvas canvas) {
        if (this.b) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public final int[] getState() {
        return this.a.getState();
    }

    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.a.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.a.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public final void setHotspot(float f, float f2) {
        if (this.b) {
            b(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            c(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.b) {
            return this.a.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i) {
        ru4.g(this.a, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        ru4.h(this.a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        ru4.i(this.a, mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return d(z, z2);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
