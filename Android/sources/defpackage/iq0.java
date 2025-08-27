package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import kotlin.Lazy;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;

/* renamed from: iq0  reason: default package */
public final class iq0 {
    public final int a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Path h = new Path();
    public final int i;
    public final RectF j;
    public final RectF k;
    public final float[] l;
    public float m;
    public final kac n;

    public iq0(int i2, Context context, kac kac) {
        int i3 = i2;
        kac kac2 = kac;
        this.i = i3;
        this.n = kac2;
        ro4 b2 = ro4.b();
        int i4 = b2.k;
        this.a = i4;
        int i5 = b2.G;
        this.d = i4;
        int i6 = b2.d;
        this.e = i6;
        this.f = i4;
        this.g = fw3.a(context, lad.q);
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(k0.p);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(k0.x);
        paint2.setStrokeWidth((float) b2.b);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        if (i3 == 1) {
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) kac2;
            this.j = new RectF(rangeSeekBarView.b(c44.DEFAULT_ASPECT_RATIO) - ((float) i4), c44.DEFAULT_ASPECT_RATIO, rangeSeekBarView.b(c44.DEFAULT_ASPECT_RATIO), (float) i5);
            float f2 = (float) i6;
            this.l = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
        } else {
            RangeSeekBarView rangeSeekBarView2 = (RangeSeekBarView) kac2;
            this.j = new RectF(rangeSeekBarView2.b(1.0f), c44.DEFAULT_ASPECT_RATIO, rangeSeekBarView2.b(1.0f) + ((float) i4), (float) i5);
            float f3 = (float) i6;
            this.l = new float[]{f3, f3, 0.0f, 0.0f, 0.0f, 0.0f, f3, f3};
        }
        RectF rectF = this.j;
        float f4 = (float) i4;
        this.k = new RectF(rectF.left - f4, rectF.top, rectF.right + f4, rectF.bottom);
    }

    public final void a(Canvas canvas) {
        Path path = this.h;
        path.reset();
        RectF rectF = this.j;
        path.addRoundRect(rectF, this.l, Path.Direction.CW);
        Paint paint = this.b;
        int i2 = this.i;
        int i3 = this.g;
        int i4 = this.e;
        if (i2 == 0) {
            paint.setShadowLayer((float) i4, -1.0f, c44.DEFAULT_ASPECT_RATIO, i3);
        } else {
            paint.setShadowLayer((float) i4, 1.0f, c44.DEFAULT_ASPECT_RATIO, i3);
        }
        canvas.drawPath(path, paint);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f2 = ((float) this.f) / 2.0f;
        canvas.drawLine(centerX, centerY - f2, rectF.centerX(), rectF.centerY() + f2, this.c);
    }

    public final float b() {
        RectF rectF = this.j;
        int i2 = this.i;
        kac kac = this.n;
        if (i2 == 0) {
            return ((RangeSeekBarView) kac).c(rectF.right);
        }
        return ((RangeSeekBarView) kac).c(rectF.left);
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        kac kac = this.n;
        if (action == 0) {
            this.m = ((RangeSeekBarView) kac).b(b()) - motionEvent.getX();
        } else if (action == 2) {
            e(((RangeSeekBarView) kac).c(motionEvent.getX() + this.m));
        }
    }

    public final void d() {
        RectF rectF = this.j;
        RectF rectF2 = this.k;
        int i2 = this.i;
        int i3 = this.d;
        if (i2 == 0) {
            rectF2.set(rectF.left - ((float) i3), rectF.top, rectF.right, rectF.bottom);
        } else {
            rectF2.set(rectF.left, rectF.top, rectF.right + ((float) i3), rectF.bottom);
        }
    }

    public final void e(float f2) {
        int i2 = this.i;
        int i3 = this.d;
        kac kac = this.n;
        float b2 = i2 == 0 ? ((RangeSeekBarView) kac).b(f2) - ((float) this.a) : ((RangeSeekBarView) kac).b(f2);
        float f3 = b2 - ((float) i3);
        RectF rectF = this.j;
        rectF.offsetTo(b2, rectF.top);
        RectF rectF2 = this.k;
        rectF2.offsetTo(f3, rectF2.top);
    }
}
