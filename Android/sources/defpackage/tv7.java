package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: tv7  reason: default package */
public final class tv7 extends qv4 {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    public final void a(Canvas canvas, Rect rect, float f2, boolean z, boolean z2) {
        this.b = (float) rect.width();
        nk0 nk0 = this.a;
        float f3 = (float) ((dw7) nk0).a;
        canvas.translate((((float) rect.width()) / 2.0f) + ((float) rect.left), Math.max(c44.DEFAULT_ASPECT_RATIO, (((float) rect.height()) - f3) / 2.0f) + (((float) rect.height()) / 2.0f) + ((float) rect.top));
        if (((dw7) nk0).j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f4 = this.b / 2.0f;
        float f5 = f3 / 2.0f;
        canvas.clipRect(-f4, -f5, f4, f5);
        this.e = ((dw7) nk0).a / 2 == ((dw7) nk0).b;
        this.c = ((float) ((dw7) nk0).a) * f2;
        this.d = ((float) Math.min(((dw7) nk0).a / 2, ((dw7) nk0).b)) * f2;
        if (z || z2) {
            if ((z && ((dw7) nk0).e == 2) || (z2 && ((dw7) nk0).f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((dw7) nk0).f != 3)) {
                canvas.translate(c44.DEFAULT_ASPECT_RATIO, ((1.0f - f2) * ((float) ((dw7) nk0).a)) / 2.0f);
            }
        }
        if (!z2 || ((dw7) nk0).f != 3) {
            this.f = 1.0f;
        } else {
            this.f = f2;
        }
    }

    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int l = ld9.l(i, i2);
        dw7 dw7 = (dw7) this.a;
        if (dw7.k > 0 && l != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(l);
            PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), c44.DEFAULT_ASPECT_RATIO);
            int i3 = dw7.k;
            h(canvas, paint, pointF, (PointF) null, (float) i3, (float) i3);
        }
    }

    public final void c(Canvas canvas, Paint paint, pv4 pv4, int i) {
        int l = ld9.l(pv4.c, i);
        float f2 = pv4.a;
        float f3 = pv4.b;
        int i2 = pv4.d;
        g(canvas, paint, f2, f3, l, i2, i2);
    }

    public final void d(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        g(canvas, paint, f2, f3, ld9.l(i, i2), i3, i3);
    }

    public final int e() {
        return ((dw7) this.a).a;
    }

    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        Paint paint2 = paint;
        float k = h88.k(f2, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        float k2 = h88.k(f3, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        float G = i8b.G(1.0f - this.f, 1.0f, k);
        float G2 = i8b.G(1.0f - this.f, 1.0f, k2);
        float k3 = 1.0f - h88.k(G2, 0.99f, 1.0f);
        float f4 = this.b;
        int k4 = (int) ((G * f4) + ((float) ((int) ((h88.k(G, c44.DEFAULT_ASPECT_RATIO, 0.01f) * ((float) i2)) / 0.01f))));
        int i4 = (int) ((G2 * f4) - ((float) ((int) ((k3 * ((float) i3)) / 0.01f))));
        float f5 = (-f4) / 2.0f;
        if (k4 <= i4) {
            float f6 = this.d;
            float f7 = ((float) k4) + f6;
            float f8 = ((float) i4) - f6;
            float f9 = f6 * 2.0f;
            paint2.setColor(i);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(this.c);
            if (f7 >= f8) {
                h(canvas, paint, new PointF(f7 + f5, c44.DEFAULT_ASPECT_RATIO), new PointF(f8 + f5, c44.DEFAULT_ASPECT_RATIO), f9, this.c);
                return;
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f8 + f5;
            canvas.drawLine(f10, c44.DEFAULT_ASPECT_RATIO, f11, c44.DEFAULT_ASPECT_RATIO, paint);
            if (!this.e && this.d > c44.DEFAULT_ASPECT_RATIO) {
                paint2.setStyle(Paint.Style.FILL);
                if (f7 > c44.DEFAULT_ASPECT_RATIO) {
                    h(canvas, paint, new PointF(f10, c44.DEFAULT_ASPECT_RATIO), (PointF) null, f9, this.c);
                }
                if (f8 < this.b) {
                    h(canvas, paint, new PointF(f11, c44.DEFAULT_ASPECT_RATIO), (PointF) null, f9, this.c);
                }
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f2, float f3) {
        float min = Math.min(f3, this.c);
        float f4 = f2 / 2.0f;
        float min2 = Math.min(f4, (this.d * min) / this.c);
        RectF rectF = new RectF((-f2) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
