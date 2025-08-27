package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: n1g  reason: default package */
public abstract class n1g extends Drawable {
    public Drawable a;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.a(drawable, theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.e(drawable, f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.f(drawable, i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
