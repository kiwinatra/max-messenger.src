package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: eh5  reason: default package */
public final class eh5 extends Drawable {
    public final Paint a = new Paint(2);
    public final Bitmap b;
    public int c = KotlinVersion.MAX_COMPONENT_VALUE;
    public final int d;
    public final int e;

    public eh5(Bitmap bitmap) {
        this.b = bitmap;
        if (bitmap != null) {
            this.d = bitmap.getWidth();
            this.e = this.b.getHeight();
            return;
        }
        this.e = 0;
        this.d = 0;
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.b, (Rect) null, getBounds(), this.a);
        }
    }

    public final int getAlpha() {
        return this.c;
    }

    public final int getIntrinsicHeight() {
        return this.e;
    }

    public final int getIntrinsicWidth() {
        return this.d;
    }

    public final int getMinimumHeight() {
        return this.e;
    }

    public final int getMinimumWidth() {
        return this.d;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.c = i;
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }
}
