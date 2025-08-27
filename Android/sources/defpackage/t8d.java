package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: t8d  reason: default package */
public final class t8d extends y8d {
    public static final /* synthetic */ int S0 = 0;
    public final Paint M0;
    public final Paint N0;
    public final Bitmap O0;
    public WeakReference P0;
    public boolean Q0;
    public RectF R0 = null;

    public t8d(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.M0 = paint2;
        Paint paint3 = new Paint(1);
        this.N0 = paint3;
        this.O0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.Q0 = false;
    }

    public final void draw(Canvas canvas) {
        Shader shader;
        if (tf6.X()) {
            tf6.e("RoundedBitmapDrawable#draw");
        }
        if (!h()) {
            super.draw(canvas);
            if (tf6.X()) {
                tf6.C();
                return;
            }
            return;
        }
        f();
        d();
        WeakReference weakReference = this.P0;
        Paint paint = this.M0;
        Bitmap bitmap = this.O0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.P0 = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.w = true;
            }
        }
        if (this.w && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.G0);
            this.w = false;
        }
        paint.setFilterBitmap(this.J0);
        int save = canvas.save();
        canvas.concat(this.D0);
        boolean z = this.Q0;
        Path path = this.v;
        if (z || this.R0 == null) {
            canvas.drawPath(path, paint);
        } else {
            int save2 = canvas.save();
            canvas.clipRect(this.R0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save2);
        }
        float f = this.o;
        if (f > c44.DEFAULT_ASPECT_RATIO) {
            Paint paint2 = this.N0;
            paint2.setStrokeWidth(f);
            paint2.setColor(cjf.H(this.x, paint.getAlpha()));
            canvas.drawPath(this.y, paint2);
        }
        canvas.restoreToCount(save);
        if (tf6.X()) {
            tf6.C();
        }
    }

    public final void f() {
        super.f();
        if (!this.Q0) {
            if (this.R0 == null) {
                this.R0 = new RectF();
            }
            this.G0.mapRect(this.R0, this.w0);
        }
    }

    public final void g() {
        this.Q0 = false;
    }

    public final boolean h() {
        return (this.b || this.c || this.o > c44.DEFAULT_ASPECT_RATIO) && this.O0 != null;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.M0;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.M0.setColorFilter(colorFilter);
    }
}
