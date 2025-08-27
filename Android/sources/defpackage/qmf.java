package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: qmf  reason: default package */
public final class qmf extends Drawable implements phf {
    public final Function0 a;
    public final wmf b;
    public final vmf c;
    public final ShapeDrawable o;
    public final Path v;
    public final Paint w;

    public qmf(Function0 function0, wmf wmf, vmf vmf) {
        this.a = function0;
        this.b = wmf;
        this.c = vmf;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = vo4.c().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.o = shapeDrawable;
        this.v = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.w = paint;
    }

    public final void draw(Canvas canvas) {
        this.o.draw(canvas);
        canvas.drawPath(this.v, this.w);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        float roundToInt;
        float roundToInt2;
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        wmf wmf = this.b;
        int ordinal = wmf.ordinal();
        if (ordinal == 0) {
            rect2.top = g63.b((float) 8, vo4.c().getDisplayMetrics().density, rect.top);
        } else if (ordinal == 1) {
            rect2.bottom = a81.e((float) 8, vo4.c().getDisplayMetrics().density, rect.bottom);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.setBounds(rect2);
        Path path = this.v;
        path.reset();
        int ordinal2 = wmf.ordinal();
        vmf vmf = this.c;
        if (ordinal2 == 0) {
            int roundToInt3 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
            int roundToInt4 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            int ordinal3 = vmf.ordinal();
            if (ordinal3 == 0) {
                roundToInt = (((float) roundToInt3) / 2.0f) + ((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal3 == 1) {
                roundToInt = ((float) rect.width()) / 2.0f;
            } else if (ordinal3 == 2) {
                roundToInt = (((float) rect.width()) - (((float) roundToInt3) / 2.0f)) - ((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f = roundToInt;
            float f2 = ((float) roundToInt3) / 2.0f;
            float f3 = ((float) rect.top) + ((float) roundToInt4);
            path.moveTo(f + f2, f3);
            float f4 = (float) rect.top;
            path.cubicTo(f, f4, f, f4, f - f2, f3);
        } else if (ordinal2 == 1) {
            int roundToInt5 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
            int roundToInt6 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            int ordinal4 = vmf.ordinal();
            if (ordinal4 == 0) {
                roundToInt2 = (((float) roundToInt5) / 2.0f) + ((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal4 == 1) {
                roundToInt2 = ((float) rect.width()) / 2.0f;
            } else if (ordinal4 == 2) {
                roundToInt2 = (((float) rect.width()) - (((float) roundToInt5) / 2.0f)) - ((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f5 = roundToInt2;
            float f6 = ((float) roundToInt5) / 2.0f;
            float f7 = ((float) rect.bottom) - ((float) roundToInt6);
            path.moveTo(f5 - f6, f7);
            float f8 = (float) rect.bottom;
            path.cubicTo(f5, f8, f5, f8, f5 + f6, f7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onThemeChanged(k2b k2b) {
        Paint paint = this.o.getPaint();
        Function0 function0 = this.a;
        paint.setColor(((Number) function0.invoke()).intValue());
        this.w.setColor(((Number) function0.invoke()).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
