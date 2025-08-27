package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vdd  reason: default package */
public final class vdd extends qb6 {
    public Matrix X;
    public final Matrix Y = new Matrix();
    public xdd v;
    public Float w;
    public PointF x;
    public int y;
    public int z;

    public vdd(Drawable drawable, xdd xdd) {
        super(drawable);
        this.v = xdd;
    }

    public final void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.X;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        q();
        if (this.X != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.X);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final Drawable o(Drawable drawable) {
        Drawable o = super.o(drawable);
        p();
        return o;
    }

    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.z = 0;
            this.y = 0;
            this.X = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.y = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.z = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.X = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            drawable.setBounds(bounds);
            this.X = null;
        } else if (this.v == ydd.s) {
            drawable.setBounds(bounds);
            this.X = null;
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.Y;
            matrix.reset();
            xdd xdd = this.v;
            PointF pointF = this.x;
            xdd.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.X = matrix;
        }
    }

    public final void q() {
        boolean z2;
        xdd xdd = this.v;
        if (xdd instanceof wdd) {
            Float valueOf = Float.valueOf(((wdd) xdd).j);
            z2 = !Intrinsics.areEqual((Object) valueOf, (Object) this.w);
            this.w = valueOf;
        } else {
            z2 = false;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.y != drawable.getIntrinsicWidth() || this.z != drawable.getIntrinsicHeight() || z2) {
                p();
            }
        }
    }

    public final void r(PointF pointF) {
        if (!hsg.k(this.x, pointF)) {
            if (pointF == null) {
                this.x = null;
            } else {
                if (this.x == null) {
                    this.x = new PointF();
                }
                this.x.set(pointF);
            }
            p();
            invalidateSelf();
        }
    }
}
