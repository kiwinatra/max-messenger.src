package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: x8d  reason: default package */
public final class x8d extends qb6 implements s8d {
    public boolean A0 = false;
    public final Path B0 = new Path();
    public final Path C0 = new Path();
    public final RectF D0 = new RectF();
    public final float[] X = new float[8];
    public final Paint Y = new Paint(1);
    public boolean Z = false;
    public final int v = 1;
    public float v0 = c44.DEFAULT_ASPECT_RATIO;
    public final RectF w = new RectF();
    public int w0 = 0;
    public RectF x;
    public int x0 = 0;
    public Matrix y;
    public float y0 = c44.DEFAULT_ASPECT_RATIO;
    public final float[] z = new float[8];
    public boolean z0 = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x8d(Drawable drawable) {
        super(drawable);
        drawable.getClass();
    }

    public final void a(boolean z2) {
        this.Z = z2;
        p();
        invalidateSelf();
    }

    public final void b() {
        Arrays.fill(this.z, c44.DEFAULT_ASPECT_RATIO);
        p();
        invalidateSelf();
    }

    public final void c(float f, int i) {
        this.w0 = i;
        this.v0 = f;
        p();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.w;
        rectF.set(getBounds());
        int y2 = tr1.y(this.v);
        Path path = this.B0;
        Paint paint = this.Y;
        if (y2 == 0) {
            if (this.z0) {
                RectF rectF2 = this.x;
                if (rectF2 == null) {
                    this.x = new RectF(rectF);
                    this.y = new Matrix();
                } else {
                    rectF2.set(rectF);
                }
                RectF rectF3 = this.x;
                float f = this.v0;
                rectF3.inset(f, f);
                Matrix matrix = this.y;
                if (matrix != null) {
                    matrix.setRectToRect(rectF, this.x, Matrix.ScaleToFit.FILL);
                }
                int save = canvas.save();
                canvas.clipRect(rectF);
                canvas.concat(this.y);
                super.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                super.draw(canvas);
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.x0);
            paint.setStrokeWidth(c44.DEFAULT_ASPECT_RATIO);
            paint.setFilterBitmap(this.A0);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.Z) {
                float width = ((rectF.width() - rectF.height()) + this.v0) / 2.0f;
                float height = ((rectF.height() - rectF.width()) + this.v0) / 2.0f;
                if (width > c44.DEFAULT_ASPECT_RATIO) {
                    float f2 = rectF.left;
                    Canvas canvas2 = canvas;
                    Paint paint2 = paint;
                    canvas2.drawRect(f2, rectF.top, f2 + width, rectF.bottom, paint2);
                    float f3 = rectF.right;
                    canvas2.drawRect(f3 - width, rectF.top, f3, rectF.bottom, paint2);
                }
                if (height > c44.DEFAULT_ASPECT_RATIO) {
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    Canvas canvas3 = canvas;
                    Paint paint3 = paint;
                    canvas3.drawRect(f4, f5, rectF.right, f5 + height, paint3);
                    float f6 = rectF.left;
                    float f7 = rectF.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF.right, f7, paint3);
                }
            }
        } else if (y2 == 1) {
            int save2 = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.w0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.w0);
            paint.setStrokeWidth(this.v0);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.C0, paint);
        }
    }

    public final void e(boolean z2) {
        if (this.A0 != z2) {
            this.A0 = z2;
            invalidateSelf();
        }
    }

    public final void g() {
    }

    public final void i(float f) {
        this.y0 = f;
        p();
        invalidateSelf();
    }

    public final void k() {
        this.z0 = false;
        p();
        invalidateSelf();
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.z;
        if (fArr == null) {
            Arrays.fill(fArr2, c44.DEFAULT_ASPECT_RATIO);
        } else {
            cvg.m("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        p();
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }

    public final void p() {
        float[] fArr;
        Path path = this.B0;
        path.reset();
        Path path2 = this.C0;
        path2.reset();
        RectF rectF = this.D0;
        rectF.set(getBounds());
        float f = this.y0;
        rectF.inset(f, f);
        if (this.v == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z2 = this.Z;
        float[] fArr2 = this.z;
        if (z2) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = -this.y0;
        rectF.inset(f2, f2);
        float f3 = this.v0 / 2.0f;
        rectF.inset(f3, f3);
        if (this.Z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.X;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.y0) - (this.v0 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = (-this.v0) / 2.0f;
        rectF.inset(f4, f4);
    }
}
