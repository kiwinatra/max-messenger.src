package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: lee  reason: default package */
public final class lee extends Drawable implements Animatable, phf {
    public final Function1 a;
    public final Integer[] b = {3, 1, 2};
    public final Paint c = new Paint(1);
    public final RectF o = new RectF();
    public int v;
    public int w;
    public final tj7 x = new tj7(27, this);
    public boolean y;
    public float z;

    public lee(k2b k2b, gl1 gl1) {
        this.a = gl1;
        onThemeChanged(k2b);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float height = ((float) bounds.height()) / 2.0f;
        int i = this.v;
        Integer[] numArr = this.b;
        float f = (float) 2;
        float width = (((float) bounds.width()) / 2.0f) - ((float) ((((numArr.length - 1) * MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)) + (i * numArr.length)) / 2));
        int length = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int intValue = numArr[i2].intValue();
            RectF rectF = this.o;
            float roundToInt = ((float) ((MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) + this.v) * i3)) + width;
            rectF.left = roundToInt;
            int i5 = this.w;
            rectF.top = height - ((float) (i5 / 2));
            rectF.right = roundToInt + ((float) this.v);
            rectF.bottom = ((float) (i5 / 2)) + height;
            float height2 = rectF.height() * Math.max(0.3f, (((float) Math.sin((double) (this.z + ((float) ((numArr.length - intValue) + 1))))) + ((float) 1)) / f);
            canvas.drawRoundRect(rectF.left, height - height2, rectF.right, height + height2, vo4.c().getDisplayMetrics().density * 4.0f, vo4.c().getDisplayMetrics().density * 4.0f, this.c);
            i2++;
            i3 = i4;
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.y;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int roundToInt = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        Integer[] numArr = this.b;
        this.v = (int) (((float) ((width - ((numArr.length - 1) * roundToInt)) / numArr.length)) * 0.5f);
        this.w = (int) (((float) bounds.height()) * 0.3f);
        invalidateSelf();
    }

    public final void onThemeChanged(k2b k2b) {
        this.c.setColor(((Number) this.a.invoke(l2b.a)).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (z2) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z2, z3);
    }

    public final void start() {
        if (!this.y) {
            this.y = true;
            scheduleSelf(this.x, SystemClock.uptimeMillis() + 3);
        }
    }

    public final void stop() {
        if (this.y) {
            this.y = false;
            unscheduleSelf(this.x);
        }
    }
}
