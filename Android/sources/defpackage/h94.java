package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: h94  reason: default package */
public final class h94 extends Drawable implements u97 {
    public int A0;
    public long B0;
    public final Paint X = new Paint(1);
    public final Matrix Y = new Matrix();
    public final Rect Z = new Rect();
    public String a;
    public int b;
    public int c;
    public int o;
    public xdd v;
    public final RectF v0 = new RectF();
    public HashMap w = new HashMap();
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public final int z = 80;
    public int z0;

    public h94() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i) {
        String j = tr1.j(str, ": ");
        Paint paint = this.X;
        float measureText = paint.measureText(j);
        float measureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.z0;
        int i3 = this.A0;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) (i3 + this.y0 + 8), paint);
        paint.setColor(-1);
        canvas.drawText(j, (float) this.z0, (float) this.A0, paint);
        paint.setColor(i);
        canvas.drawText(str2, ((float) this.z0) + measureText, (float) this.A0, paint);
        this.A0 += this.y0;
    }

    public final void b() {
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.w = new HashMap();
        this.x = -1;
        this.y = -1;
        this.a = "none";
        invalidateSelf();
        this.B0 = -1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        Paint paint = this.X;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        Paint paint2 = paint;
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        paint.setStyle(style);
        paint.setStrokeWidth(c44.DEFAULT_ASPECT_RATIO);
        paint.setColor(-1);
        this.z0 = this.w0;
        this.A0 = this.x0;
        a(canvas2, "ID", this.a, -1);
        int width = bounds.width();
        int height = bounds.height();
        Locale locale = Locale.US;
        a(canvas2, "D", width + "x" + height, -1);
        if (bounds.height() > 0) {
            a(canvas2, "DAR", String.valueOf(Float.valueOf(((float) bounds.width()) / ((float) bounds.height()))), -1);
        }
        int i = this.b;
        int i2 = this.c;
        xdd xdd = this.v;
        int width2 = getBounds().width();
        int height2 = getBounds().height();
        int i3 = -65536;
        if (width2 > 0 && height2 > 0 && i > 0 && i2 > 0) {
            if (xdd != null) {
                Rect rect = this.Z;
                rect.top = 0;
                rect.left = 0;
                rect.right = width2;
                rect.bottom = height2;
                Matrix matrix = this.Y;
                matrix.reset();
                xdd.a(matrix, this.Z, i, i2, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                RectF rectF = this.v0;
                rectF.top = c44.DEFAULT_ASPECT_RATIO;
                rectF.left = c44.DEFAULT_ASPECT_RATIO;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                matrix.mapRect(rectF);
                width2 = Math.min(width2, (int) rectF.width());
                height2 = Math.min(height2, (int) rectF.height());
            }
            float f = (float) width2;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height2;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width2);
            int abs2 = Math.abs(i2 - height2);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                i3 = -16711936;
            } else if (f7 < f3 && ((float) abs2) < f6) {
                i3 = -256;
            }
        }
        int i4 = this.b;
        int i5 = this.c;
        a(canvas2, "I", i4 + "x" + i5, i3);
        int i6 = this.c;
        if (i6 > 0) {
            a(canvas2, "IAR", String.valueOf(Float.valueOf(((float) this.b) / ((float) i6))), -1);
        }
        a(canvas2, "I", (this.o / 1024) + " KiB", -1);
        int i7 = this.x;
        if (i7 > 0) {
            a(canvas2, "anim", g63.h("f ", i7, this.y, ", l "), -1);
        }
        xdd xdd2 = this.v;
        if (xdd2 != null) {
            a(canvas2, "scale", String.valueOf(xdd2), -1);
        }
        long j = this.B0;
        if (j >= 0) {
            a(canvas2, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.w.entrySet()) {
            a(canvas2, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.X.setTextSize((float) min);
        int i = min + 8;
        this.y0 = i;
        int i2 = this.z;
        if (i2 == 80) {
            this.y0 = i * -1;
        }
        this.w0 = rect.left + 10;
        this.x0 = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
