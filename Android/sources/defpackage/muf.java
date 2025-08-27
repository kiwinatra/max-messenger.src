package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: muf  reason: default package */
public final class muf extends Drawable implements Animatable, phf {
    public float X;
    public float Y;
    public final haf Z = new haf(8, (Object) this);
    public final Function1 a;
    public final int b = 3;
    public final Paint c = new Paint(1);
    public int o = KotlinVersion.MAX_COMPONENT_VALUE;
    public final Rect v = new Rect();
    public boolean v0;
    public int w;
    public float w0;
    public int x;
    public float y;
    public float z;

    public muf(k2b k2b, Function1 function1) {
        this.a = function1;
        onThemeChanged(k2b);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                break;
            }
            int i3 = bounds.left;
            int i4 = this.w;
            int i5 = (i4 * i) + i3;
            Rect rect = this.v;
            rect.left = i5;
            int i6 = bounds.top;
            rect.top = i6;
            rect.right = i5 + i4;
            rect.bottom = i6 + this.x;
            float f = (float) 2;
            float sin = (((float) Math.sin((double) (this.w0 + ((float) ((i2 - i) + 1))))) + ((float) 1)) / f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            float f2 = this.y;
            float f3 = (((this.z - f2) * sin) + f2) / f;
            float f4 = this.X;
            float f5 = ((this.Y - f4) * sin) + f4;
            Paint paint = this.c;
            paint.setAlpha((int) (f5 * (((float) this.o) / 255.0f) * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
            canvas.drawCircle(exactCenterX, exactCenterY, f3, paint);
            i++;
        }
        if (this.v0) {
            this.w0 += 0.1f;
        }
    }

    public final int getAlpha() {
        return this.o;
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
        return this.v0;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.w = bounds.width() / this.b;
        int height = bounds.height();
        this.x = height;
        float min = (float) Math.min(this.w, height);
        this.y = 0.44f * min;
        this.z = min * 0.66f;
        this.X = 0.4f;
        this.Y = 1.0f;
        invalidateSelf();
    }

    public final void onThemeChanged(k2b k2b) {
        int intValue = ((Number) this.a.invoke(k2b)).intValue();
        int alpha = Color.alpha(intValue);
        Paint paint = this.c;
        if (intValue != paint.getColor() || this.o != alpha) {
            paint.setColor(intValue);
            setAlpha(alpha);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.c;
        if (!Intrinsics.areEqual((Object) colorFilter, (Object) paint.getColorFilter())) {
            paint.setColorFilter(colorFilter);
            invalidateSelf();
        }
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
        if (!this.v0) {
            this.v0 = true;
            scheduleSelf(this.Z, SystemClock.uptimeMillis() + 8);
        }
    }

    public final void stop() {
        if (this.v0) {
            this.v0 = false;
            unscheduleSelf(this.Z);
            this.w0 = c44.DEFAULT_ASPECT_RATIO;
        }
    }
}
