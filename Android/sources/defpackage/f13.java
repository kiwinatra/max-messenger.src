package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.math.MathKt;

/* renamed from: f13  reason: default package */
public final class f13 extends Drawable {
    public final Paint a;
    public float b = 360.0f;

    public f13() {
        Paint paint = new Paint();
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 2.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.a = paint;
    }

    public final void draw(Canvas canvas) {
        canvas.drawArc((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, -90.0f, this.b, false, this.a);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        float f = (float) 2;
        rect.inset(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
