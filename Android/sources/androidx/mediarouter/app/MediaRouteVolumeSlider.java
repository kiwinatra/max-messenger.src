package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.KotlinVersion;

class MediaRouteVolumeSlider extends AppCompatSeekBar {
    public final float b;
    public boolean c;
    public Drawable o;
    public int v;
    public int w;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hdc.seekBarStyle);
        this.b = zw8.d(context);
    }

    public final void a(int i, int i2) {
        if (this.v != i) {
            if (Color.alpha(i) != 255) {
                Integer.toHexString(i);
            }
            this.v = i;
        }
        if (this.w != i2) {
            if (Color.alpha(i2) != 255) {
                Integer.toHexString(i2);
            }
            this.w = i2;
        }
    }

    public final void b(boolean z) {
        if (this.c != z) {
            this.c = z;
            super.setThumb(z ? null : this.o);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? KotlinVersion.MAX_COMPONENT_VALUE : (int) (this.b * 255.0f);
        Drawable drawable = this.o;
        int i2 = this.v;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.o.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.w, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.v, mode);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.o = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
