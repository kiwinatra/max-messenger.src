package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: jq0  reason: default package */
public final class jq0 extends Drawable {
    public final j09 a = k4e.a;
    public final Paint b;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final zf g = new zf(this, 1);
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = true;
    public j4e o;
    public ColorStateList p;

    public jq0(j4e j4e) {
        this.o = j4e;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void draw(Canvas canvas) {
        boolean z = this.n;
        Paint paint = this.b;
        Rect rect = this.d;
        if (z) {
            copyBounds(rect);
            float height = this.h / ((float) rect.height());
            paint.setShader(new LinearGradient(c44.DEFAULT_ASPECT_RATIO, (float) rect.top, c44.DEFAULT_ASPECT_RATIO, (float) rect.bottom, new int[]{w53.f(this.i, this.m), w53.f(this.j, this.m), w53.f(w53.h(this.j, 0), this.m), w53.f(w53.h(this.l, 0), this.m), w53.f(this.l, this.m), w53.f(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        m04 m04 = this.o.e;
        RectF rectF2 = this.f;
        rectF2.set(getBounds());
        float min = Math.min(m04.a(rectF2), rectF.width() / 2.0f);
        j4e j4e = this.o;
        rectF2.set(getBounds());
        if (j4e.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    public final int getOpacity() {
        return this.h > c44.DEFAULT_ASPECT_RATIO ? -3 : -2;
    }

    public final void getOutline(Outline outline) {
        j4e j4e = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (j4e.d(rectF)) {
            m04 m04 = this.o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), m04.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        j4e j4e2 = this.o;
        Path path = this.c;
        this.a.d(j4e2, 1.0f, rectF2, (b8d) null, path);
        if (Build.VERSION.SDK_INT >= 30) {
            xu4.a(outline, path);
            return;
        }
        try {
            wu4.a(outline, path);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean getPadding(Rect rect) {
        j4e j4e = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (!j4e.d(rectF)) {
            return true;
        }
        int round = Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.m)) == this.m)) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    public final void setAlpha(int i2) {
        this.b.setAlpha(i2);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
