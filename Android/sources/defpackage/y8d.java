package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: y8d  reason: default package */
public abstract class y8d extends Drawable implements s8d, crf {
    public final Matrix A0 = new Matrix();
    public final Matrix B0 = new Matrix();
    public final Matrix C0 = new Matrix();
    public final Matrix D0 = new Matrix();
    public Matrix E0;
    public Matrix F0;
    public final Matrix G0 = new Matrix();
    public float H0 = c44.DEFAULT_ASPECT_RATIO;
    public boolean I0 = false;
    public boolean J0 = false;
    public boolean K0 = true;
    public drf L0;
    public final float[] X = new float[8];
    public float[] Y;
    public final RectF Z = new RectF();
    public final Drawable a;
    public boolean b = false;
    public boolean c = false;
    public float o = c44.DEFAULT_ASPECT_RATIO;
    public final Path v = new Path();
    public final RectF v0 = new RectF();
    public boolean w = true;
    public final RectF w0 = new RectF();
    public int x = 0;
    public final RectF x0 = new RectF();
    public final Path y = new Path();
    public RectF y0;
    public final float[] z = new float[8];
    public final Matrix z0 = new Matrix();

    public y8d(Drawable drawable) {
        this.a = drawable;
    }

    public final void a(boolean z2) {
        this.b = z2;
        this.K0 = true;
        invalidateSelf();
    }

    public final void b() {
        Arrays.fill(this.z, c44.DEFAULT_ASPECT_RATIO);
        this.c = false;
        this.K0 = true;
        invalidateSelf();
    }

    public final void c(float f, int i) {
        if (this.x != i || this.o != f) {
            this.x = i;
            this.o = f;
            this.K0 = true;
            invalidateSelf();
        }
    }

    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public final void d() {
        if (this.K0) {
            Path path = this.y;
            path.reset();
            RectF rectF = this.Z;
            float f = this.o;
            rectF.inset(f / 2.0f, f / 2.0f);
            boolean z2 = this.b;
            float[] fArr = this.X;
            float[] fArr2 = this.z;
            if (z2) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (fArr2[i] + this.H0) - (this.o / 2.0f);
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = this.o;
            rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
            Path path2 = this.v;
            path2.reset();
            float f3 = this.H0 + (this.I0 ? this.o : c44.DEFAULT_ASPECT_RATIO);
            rectF.inset(f3, f3);
            if (this.b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else if (this.I0) {
                if (this.Y == null) {
                    this.Y = new float[8];
                }
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    this.Y[i2] = fArr2[i2] - this.o;
                }
                path2.addRoundRect(rectF, this.Y, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.K0 = false;
        }
    }

    public void draw(Canvas canvas) {
        if (tf6.X()) {
            tf6.e("RoundedDrawable#draw");
        }
        this.a.draw(canvas);
        if (tf6.X()) {
            tf6.C();
        }
    }

    public final void e(boolean z2) {
        if (this.J0 != z2) {
            this.J0 = z2;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (((r4 == null && r7 == null) ? true : (r4 == null || r7 == null) ? false : r4.equals(r7)) == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r8 = this;
            drf r0 = r8.L0
            android.graphics.Matrix r1 = r8.B0
            android.graphics.RectF r2 = r8.Z
            if (r0 == 0) goto L_0x0011
            r0.d(r1)
            drf r0 = r8.L0
            r0.h(r2)
            goto L_0x001b
        L_0x0011:
            r1.reset()
            android.graphics.Rect r0 = r8.getBounds()
            r2.set(r0)
        L_0x001b:
            android.graphics.RectF r0 = r8.w0
            android.graphics.drawable.Drawable r3 = r8.a
            int r4 = r3.getIntrinsicWidth()
            float r4 = (float) r4
            int r5 = r3.getIntrinsicHeight()
            float r5 = (float) r5
            r6 = 0
            r0.set(r6, r6, r4, r5)
            android.graphics.RectF r4 = r8.x0
            android.graphics.Rect r3 = r3.getBounds()
            r4.set(r3)
            android.graphics.Matrix r3 = r8.z0
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.FILL
            r3.setRectToRect(r0, r4, r5)
            boolean r0 = r8.I0
            if (r0 == 0) goto L_0x006a
            android.graphics.RectF r0 = r8.y0
            if (r0 != 0) goto L_0x004d
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2)
            r8.y0 = r0
            goto L_0x0050
        L_0x004d:
            r0.set(r2)
        L_0x0050:
            android.graphics.RectF r0 = r8.y0
            float r4 = r8.o
            r0.inset(r4, r4)
            android.graphics.Matrix r0 = r8.E0
            if (r0 != 0) goto L_0x0062
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r8.E0 = r0
        L_0x0062:
            android.graphics.Matrix r0 = r8.E0
            android.graphics.RectF r4 = r8.y0
            r0.setRectToRect(r2, r4, r5)
            goto L_0x0071
        L_0x006a:
            android.graphics.Matrix r0 = r8.E0
            if (r0 == 0) goto L_0x0071
            r0.reset()
        L_0x0071:
            android.graphics.Matrix r0 = r8.C0
            boolean r4 = r1.equals(r0)
            android.graphics.Matrix r5 = r8.A0
            r6 = 1
            if (r4 == 0) goto L_0x009b
            boolean r4 = r3.equals(r5)
            if (r4 == 0) goto L_0x009b
            android.graphics.Matrix r4 = r8.E0
            if (r4 == 0) goto L_0x00df
            android.graphics.Matrix r7 = r8.F0
            if (r4 != 0) goto L_0x008e
            if (r7 != 0) goto L_0x008e
            r4 = r6
            goto L_0x0099
        L_0x008e:
            if (r4 == 0) goto L_0x0098
            if (r7 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            boolean r4 = r4.equals(r7)
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            if (r4 != 0) goto L_0x00df
        L_0x009b:
            r8.w = r6
            android.graphics.Matrix r4 = r8.D0
            r1.invert(r4)
            android.graphics.Matrix r4 = r8.G0
            r4.set(r1)
            boolean r7 = r8.I0
            if (r7 == 0) goto L_0x00b2
            android.graphics.Matrix r7 = r8.E0
            if (r7 == 0) goto L_0x00b2
            r4.postConcat(r7)
        L_0x00b2:
            r4.preConcat(r3)
            r0.set(r1)
            r5.set(r3)
            boolean r0 = r8.I0
            if (r0 == 0) goto L_0x00d8
            android.graphics.Matrix r0 = r8.F0
            if (r0 != 0) goto L_0x00d2
            android.graphics.Matrix r0 = r8.E0
            if (r0 != 0) goto L_0x00c9
            r0 = 0
            goto L_0x00cf
        L_0x00c9:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>(r0)
            r0 = r1
        L_0x00cf:
            r8.F0 = r0
            goto L_0x00df
        L_0x00d2:
            android.graphics.Matrix r1 = r8.E0
            r0.set(r1)
            goto L_0x00df
        L_0x00d8:
            android.graphics.Matrix r0 = r8.F0
            if (r0 == 0) goto L_0x00df
            r0.reset()
        L_0x00df:
            android.graphics.RectF r0 = r8.v0
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L_0x00ec
            r8.K0 = r6
            r0.set(r2)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8d.f():void");
    }

    public void g() {
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final void i(float f) {
        if (this.H0 != f) {
            this.H0 = f;
            this.K0 = true;
            invalidateSelf();
        }
    }

    public final void k() {
        if (this.I0) {
            this.I0 = false;
            this.K0 = true;
            invalidateSelf();
        }
    }

    public final void l(drf drf) {
        this.L0 = drf;
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.z;
        if (fArr == null) {
            Arrays.fill(fArr2, c44.DEFAULT_ASPECT_RATIO);
            this.c = false;
        } else {
            cvg.m("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > c44.DEFAULT_ASPECT_RATIO;
            }
        }
        this.K0 = true;
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
