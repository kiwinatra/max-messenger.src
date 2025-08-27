package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: fe0  reason: default package */
public final class fe0 extends Drawable {
    public final Drawable a;
    public final int b;
    public final boolean c = false;
    public final Paint d;

    public fe0(Drawable drawable, int i) {
        this.a = drawable;
        this.b = i;
        Paint paint = new Paint(1);
        paint.setColor(i);
        this.d = paint;
    }

    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        boolean z = this.c;
        Paint paint = this.d;
        if (z) {
            canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) width, (float) height, paint);
        } else {
            float f = ((float) width) / 2.0f;
            canvas.drawCircle(f, f, f, paint);
        }
        this.a.draw(canvas);
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final Drawable mutate() {
        return new fe0(this.a.mutate(), this.b);
    }

    public final void onBoundsChange(Rect rect) {
        int width = (rect.width() / 2) / 2;
        int centerX = rect.centerX() - width;
        int centerX2 = rect.centerX() + width;
        int height = (rect.height() / 2) / 2;
        this.a.setBounds(new Rect(centerX, rect.centerY() - height, centerX2, rect.centerY() + height));
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
