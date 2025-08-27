package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: v8d  reason: default package */
public final class v8d extends Drawable implements s8d {
    public boolean X = false;
    public final Path Y = new Path();
    public final Path Z = new Path();
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public float[] c;
    public final Paint o = new Paint(1);
    public boolean v = false;
    public final int v0 = 0;
    public float w = c44.DEFAULT_ASPECT_RATIO;
    public final RectF w0 = new RectF();
    public float x = c44.DEFAULT_ASPECT_RATIO;
    public int x0 = KotlinVersion.MAX_COMPONENT_VALUE;
    public int y = 0;
    public boolean z = false;

    public v8d(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    public final void a(boolean z2) {
        this.v = z2;
        d();
        invalidateSelf();
    }

    public final void b() {
        Arrays.fill(this.a, c44.DEFAULT_ASPECT_RATIO);
        d();
        invalidateSelf();
    }

    public final void c(float f, int i) {
        if (this.y != i) {
            this.y = i;
            invalidateSelf();
        }
        if (this.w != f) {
            this.w = f;
            d();
            invalidateSelf();
        }
    }

    public final void d() {
        float[] fArr;
        float[] fArr2;
        Path path = this.Y;
        path.reset();
        Path path2 = this.Z;
        path2.reset();
        RectF rectF = this.w0;
        rectF.set(getBounds());
        float f = this.w;
        rectF.inset(f / 2.0f, f / 2.0f);
        boolean z2 = this.v;
        int i = 0;
        float[] fArr3 = this.a;
        if (z2) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.b;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (fArr3[i2] + this.x) - (this.w / 2.0f);
                i2++;
            }
            path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = this.w;
        rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.x + (this.z ? this.w : c44.DEFAULT_ASPECT_RATIO);
        rectF.inset(f3, f3);
        if (this.v) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else if (this.z) {
            if (this.c == null) {
                this.c = new float[8];
            }
            while (true) {
                fArr = this.c;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = fArr3[i] - this.w;
                i++;
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.o;
        paint.setColor(cjf.H(this.v0, this.x0));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.X);
        canvas.drawPath(this.Y, paint);
        if (this.w != c44.DEFAULT_ASPECT_RATIO) {
            paint.setColor(cjf.H(this.y, this.x0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.w);
            canvas.drawPath(this.Z, paint);
        }
    }

    public final void e(boolean z2) {
        if (this.X != z2) {
            this.X = z2;
            invalidateSelf();
        }
    }

    public final void g() {
    }

    public final int getAlpha() {
        return this.x0;
    }

    public final int getOpacity() {
        int H = cjf.H(this.v0, this.x0) >>> 24;
        if (H != 0) {
            return H != 255 ? -3 : -1;
        }
        return -2;
    }

    public final void i(float f) {
        if (this.x != f) {
            this.x = f;
            d();
            invalidateSelf();
        }
    }

    public final void k() {
        if (this.z) {
            this.z = false;
            d();
            invalidateSelf();
        }
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, c44.DEFAULT_ASPECT_RATIO);
        } else {
            cvg.m("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        d();
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d();
    }

    public final void setAlpha(int i) {
        if (i != this.x0) {
            this.x0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
