package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: rm4  reason: default package */
public final class rm4 extends av4 {
    public static final qm4 z0 = new Object();
    public final qv4 Z;
    public final phe v0;
    public final ohe w0;
    public final pv4 x0;
    public boolean y0 = false;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, pv4] */
    public rm4(Context context, nk0 nk0, qv4 qv4) {
        super(context, nk0);
        this.Z = qv4;
        this.x0 = new Object();
        phe phe = new phe();
        this.v0 = phe;
        phe.a(1.0f);
        phe.b(50.0f);
        ohe ohe = new ohe(this, z0);
        this.w0 = ohe;
        ohe.m = phe;
        if (this.y != 1.0f) {
            this.y = 1.0f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            qv4 qv4 = this.Z;
            Rect bounds = getBounds();
            float b = b();
            ValueAnimator valueAnimator = this.o;
            boolean z = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.v;
            boolean z2 = valueAnimator2 != null && valueAnimator2.isRunning();
            qv4.a.a();
            qv4.a(canvas, bounds, b, z, z2);
            Paint paint = this.z;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            nk0 nk0 = this.b;
            int i = nk0.c[0];
            pv4 pv4 = this.x0;
            pv4.c = i;
            int i2 = nk0.g;
            if (i2 > 0) {
                if (!(this.Z instanceof tv7)) {
                    i2 = (int) ((h88.k(pv4.b, c44.DEFAULT_ASPECT_RATIO, 0.01f) * ((float) i2)) / 0.01f);
                }
                this.Z.d(canvas, paint, pv4.b, 1.0f, nk0.d, this.X, i2);
            } else {
                this.Z.d(canvas, paint, c44.DEFAULT_ASPECT_RATIO, 1.0f, nk0.d, this.X, 0);
            }
            this.Z.c(canvas, paint, pv4, this.X);
            this.Z.b(canvas, paint, nk0.c[0], this.X);
            canvas.restore();
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        vh vhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        vhVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == c44.DEFAULT_ASPECT_RATIO) {
            this.y0 = true;
        } else {
            this.y0 = false;
            this.v0.b(50.0f / f);
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.Z.e();
    }

    public final int getIntrinsicWidth() {
        return this.Z.f();
    }

    public final void jumpToCurrentState() {
        this.w0.f();
        this.x0.b = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        boolean z = this.y0;
        pv4 pv4 = this.x0;
        ohe ohe = this.w0;
        if (z) {
            ohe.f();
            pv4.b = ((float) i) / 10000.0f;
            invalidateSelf();
        } else {
            ohe.b = pv4.b * 10000.0f;
            ohe.c = true;
            ohe.a((float) i);
        }
        return true;
    }
}
