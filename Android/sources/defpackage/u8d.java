package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: u8d  reason: default package */
public final class u8d extends Drawable {
    public final Bitmap a;
    public final int b = 160;
    public final int c = 119;
    public final Paint d = new Paint(3);
    public final BitmapShader e;
    public final Matrix f = new Matrix();
    public final Rect g = new Rect();
    public final RectF h = new RectF();
    public boolean i = true;
    public final int j;
    public final int k;

    public u8d(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            int i2 = this.b;
            this.j = bitmap.getScaledWidth(i2);
            this.k = bitmap.getScaledHeight(i2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.k = -1;
        this.j = -1;
        this.e = null;
    }

    public final void a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, rect2, 0);
    }

    public final void b() {
        if (this.i) {
            a(this.c, this.j, this.k, getBounds(), this.g);
            RectF rectF = this.h;
            rectF.set(this.g);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                Matrix matrix = this.f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(width / ((float) bitmap.getWidth()), rectF.height() / ((float) bitmap.getHeight()));
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.i = false;
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            b();
            Paint paint = this.d;
            if (paint.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.g, paint);
            } else {
                canvas.drawRoundRect(this.h, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
            }
        }
    }

    public final int getAlpha() {
        return this.d.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.k;
    }

    public final int getIntrinsicWidth() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getOpacity() {
        /*
            r3 = this;
            int r0 = r3.c
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L_0x001c
            android.graphics.Bitmap r0 = r3.a
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L_0x001c
            android.graphics.Paint r3 = r3.d
            int r3 = r3.getAlpha()
            r0 = 255(0xff, float:3.57E-43)
            if (r3 < r0) goto L_0x001c
            r2 = -1
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8d.getOpacity():int");
    }

    public final void getOutline(Outline outline) {
        b();
        outline.setRoundRect(this.g, c44.DEFAULT_ASPECT_RATIO);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    public final void setAlpha(int i2) {
        Paint paint = this.d;
        if (i2 != paint.getAlpha()) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }
}
