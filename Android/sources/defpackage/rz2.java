package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: rz2  reason: default package */
public final class rz2 extends bh8 implements Drawable.Callback, cff {
    public static final int[] Q1 = {16842910};
    public static final ShapeDrawable R1 = new ShapeDrawable(new OvalShape());
    public int A1;
    public boolean B1;
    public int C1;
    public int D1 = KotlinVersion.MAX_COMPONENT_VALUE;
    public ColorFilter E1;
    public PorterDuffColorFilter F1;
    public ColorStateList G1;
    public ColorStateList H0;
    public PorterDuff.Mode H1 = PorterDuff.Mode.SRC_IN;
    public ColorStateList I0;
    public int[] I1;
    public float J0;
    public boolean J1;
    public float K0 = -1.0f;
    public ColorStateList K1;
    public ColorStateList L0;
    public WeakReference L1 = new WeakReference((Object) null);
    public float M0;
    public TextUtils.TruncateAt M1;
    public ColorStateList N0;
    public boolean N1;
    public CharSequence O0;
    public int O1;
    public boolean P0;
    public boolean P1;
    public Drawable Q0;
    public ColorStateList R0;
    public float S0;
    public boolean T0;
    public boolean U0;
    public Drawable V0;
    public RippleDrawable W0;
    public ColorStateList X0;
    public float Y0;
    public SpannableStringBuilder Z0;
    public boolean a1;
    public boolean b1;
    public Drawable c1;
    public ColorStateList d1;
    public pt9 e1;
    public pt9 f1;
    public float g1;
    public float h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public float m1;
    public float n1;
    public final Context o1;
    public final Paint p1 = new Paint(1);
    public final Paint.FontMetrics q1 = new Paint.FontMetrics();
    public final RectF r1 = new RectF();
    public final PointF s1 = new PointF();
    public final Path t1 = new Path();
    public final dff u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public int z1;

    public rz2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j(context);
        this.o1 = context;
        dff dff = new dff(this);
        this.u1 = dff;
        this.O0 = "";
        dff.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q1;
        setState(iArr);
        if (!Arrays.equals(this.I1, iArr)) {
            this.I1 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.N1 = true;
        R1.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.a1 != z) {
            this.a1 = z;
            float t = t();
            if (!z && this.B1) {
                this.B1 = false;
            }
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.c1 != drawable) {
            float t = t();
            this.c1 = drawable;
            float t2 = t();
            X(this.c1);
            r(this.c1);
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.d1 != colorStateList) {
            this.d1 = colorStateList;
            if (this.b1 && (drawable = this.c1) != null && this.a1) {
                ru4.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.b1 != z) {
            boolean U = U();
            this.b1 = z;
            boolean U2 = U();
            if (U != U2) {
                if (U2) {
                    r(this.c1);
                } else {
                    X(this.c1);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f) {
        if (this.K0 != f) {
            this.K0 = f;
            ypg e = this.a.a.e();
            e.e = new d0(f);
            e.f = new d0(f);
            e.g = new d0(f);
            e.h = new d0(f);
            setShapeAppearanceModel(e.c());
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.Q0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof pqg) {
            ((qqg) ((pqg) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float t = t();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.Q0 = drawable3;
            float t2 = t();
            X(drawable2);
            if (V()) {
                r(this.Q0);
            }
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.S0 != f) {
            float t = t();
            this.S0 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.T0 = true;
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            if (V()) {
                ru4.h(this.Q0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.P0 != z) {
            boolean V = V();
            this.P0 = z;
            boolean V2 = V();
            if (V != V2) {
                if (V2) {
                    r(this.Q0);
                } else {
                    X(this.Q0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            if (this.P1) {
                n(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.M0 != f) {
            this.M0 = f;
            this.p1.setStrokeWidth(f);
            if (this.P1) {
                this.a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.V0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof pqg) {
            ((qqg) ((pqg) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u = u();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.V0 = drawable3;
            this.W0 = new RippleDrawable(ld8.r0(this.N0), this.V0, R1);
            float u2 = u();
            X(drawable2);
            if (W()) {
                r(this.V0);
            }
            invalidateSelf();
            if (u != u2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.m1 != f) {
            this.m1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.Y0 != f) {
            this.Y0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.l1 != f) {
            this.l1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.X0 != colorStateList) {
            this.X0 = colorStateList;
            if (W()) {
                ru4.h(this.V0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.U0 != z) {
            boolean W = W();
            this.U0 = z;
            boolean W2 = W();
            if (W != W2) {
                if (W2) {
                    r(this.V0);
                } else {
                    X(this.V0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.i1 != f) {
            float t = t();
            this.i1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.h1 != f) {
            float t = t();
            this.h1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            this.K1 = this.J1 ? ld8.r0(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.b1 && this.c1 != null && this.B1;
    }

    public final boolean V() {
        return this.P0 && this.Q0 != null;
    }

    public final boolean W() {
        return this.U0 && this.V0 != null;
    }

    public final void a() {
        y();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.D1) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            boolean z = this.P1;
            Paint paint = this.p1;
            RectF rectF3 = this.r1;
            if (!z) {
                paint.setColor(this.v1);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (!this.P1) {
                paint.setColor(this.w1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.E1;
                if (colorFilter == null) {
                    colorFilter = this.F1;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (this.P1) {
                super.draw(canvas);
            }
            if (this.M0 > c44.DEFAULT_ASPECT_RATIO && !this.P1) {
                paint.setColor(this.y1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.P1) {
                    ColorFilter colorFilter2 = this.E1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.F1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f = this.M0 / 2.0f;
                rectF3.set(((float) bounds.left) + f, ((float) bounds.top) + f, ((float) bounds.right) - f, ((float) bounds.bottom) - f);
                float f2 = this.K0 - (this.M0 / 2.0f);
                canvas2.drawRoundRect(rectF3, f2, f2, paint);
            }
            paint.setColor(this.z1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.P1) {
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.t1;
                ah8 ah8 = this.a;
                this.A0.d(ah8.a, ah8.j, rectF4, this.z0, path);
                f(canvas, paint, path, this.a.a, h());
            }
            if (V()) {
                s(bounds, rectF3);
                float f3 = rectF3.left;
                float f4 = rectF3.top;
                canvas2.translate(f3, f4);
                this.Q0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.Q0.draw(canvas2);
                canvas2.translate(-f3, -f4);
            }
            if (U()) {
                s(bounds, rectF3);
                float f5 = rectF3.left;
                float f6 = rectF3.top;
                canvas2.translate(f5, f6);
                this.c1.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.c1.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (!this.N1 || this.O0 == null) {
                rectF = rectF3;
                i3 = saveLayerAlpha;
                i2 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.s1;
                pointF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.O0;
                dff dff = this.u1;
                if (charSequence != null) {
                    float t = t() + this.g1 + this.j1;
                    if (su4.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + t;
                    } else {
                        pointF.x = ((float) bounds.right) - t;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = dff.a;
                    Paint.FontMetrics fontMetrics = this.q1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.O0 != null) {
                    float t2 = t() + this.g1 + this.j1;
                    float u = u() + this.n1 + this.k1;
                    if (su4.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + t2;
                        rectF3.right = ((float) bounds.right) - u;
                    } else {
                        rectF3.left = ((float) bounds.left) + u;
                        rectF3.right = ((float) bounds.right) - t2;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                vef vef = dff.g;
                TextPaint textPaint2 = dff.a;
                if (vef != null) {
                    textPaint2.drawableState = getState();
                    dff.g.e(this.o1, textPaint2, dff.b);
                }
                textPaint2.setTextAlign(align);
                boolean z2 = Math.round(dff.a(this.O0.toString())) > Math.round(rectF3.width());
                if (z2) {
                    i5 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence2 = this.O0;
                if (z2 && this.M1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.M1);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i3 = saveLayerAlpha;
                float f7 = pointF.x;
                i2 = 0;
                float f8 = pointF.y;
                i4 = 255;
                canvas.drawText(charSequence3, 0, length, f7, f8, textPaint2);
                if (z2) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (W()) {
                rectF.setEmpty();
                if (W()) {
                    float f9 = this.n1 + this.m1;
                    if (su4.a(this) == 0) {
                        float f10 = ((float) bounds.right) - f9;
                        rectF2 = rectF;
                        rectF2.right = f10;
                        rectF2.left = f10 - this.Y0;
                    } else {
                        rectF2 = rectF;
                        float f11 = ((float) bounds.left) + f9;
                        rectF2.left = f11;
                        rectF2.right = f11 + this.Y0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f12 = this.Y0;
                    float f13 = exactCenterY - (f12 / 2.0f);
                    rectF2.top = f13;
                    rectF2.bottom = f13 + f12;
                } else {
                    rectF2 = rectF;
                }
                float f14 = rectF2.left;
                float f15 = rectF2.top;
                canvas2.translate(f14, f15);
                this.V0.setBounds(i2, i2, (int) rectF2.width(), (int) rectF2.height());
                this.W0.setBounds(this.V0.getBounds());
                this.W0.jumpToCurrentState();
                this.W0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.D1 < i4) {
                canvas2.restoreToCount(i3);
            }
        }
    }

    public final int getAlpha() {
        return this.D1;
    }

    public final ColorFilter getColorFilter() {
        return this.E1;
    }

    public final int getIntrinsicHeight() {
        return (int) this.J0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.u1.a(this.O0.toString()) + t() + this.g1 + this.j1 + this.k1 + this.n1), this.O1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.P1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.K0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J0, this.K0);
        }
        outline.setAlpha(((float) this.D1) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = (r0 = r1.u1.g).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.H0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.I0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.L0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            boolean r0 = r1.J1
            if (r0 == 0) goto L_0x0024
            android.content.res.ColorStateList r0 = r1.K1
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
        L_0x0024:
            dff r0 = r1.u1
            vef r0 = r0.g
            if (r0 == 0) goto L_0x0035
            android.content.res.ColorStateList r0 = r0.j
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0035
            goto L_0x005d
        L_0x0035:
            boolean r0 = r1.b1
            if (r0 == 0) goto L_0x0042
            android.graphics.drawable.Drawable r0 = r1.c1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.a1
            if (r0 == 0) goto L_0x0042
            goto L_0x005d
        L_0x0042:
            android.graphics.drawable.Drawable r0 = r1.Q0
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r1.c1
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r1 = r1.G1
            boolean r1 = w(r1)
            if (r1 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r1 = 0
            goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz2.isStateful():boolean");
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            onLayoutDirectionChanged |= su4.b(this.Q0, i);
        }
        if (U()) {
            onLayoutDirectionChanged |= su4.b(this.c1, i);
        }
        if (W()) {
            onLayoutDirectionChanged |= su4.b(this.V0, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (V()) {
            onLevelChange |= this.Q0.setLevel(i);
        }
        if (U()) {
            onLevelChange |= this.c1.setLevel(i);
        }
        if (W()) {
            onLevelChange |= this.V0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.P1) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.I1);
    }

    public final void r(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            su4.b(drawable, su4.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.V0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.I1);
                }
                ru4.h(drawable, this.X0);
                return;
            }
            Drawable drawable2 = this.Q0;
            if (drawable == drawable2 && this.T0) {
                ru4.h(drawable2, this.R0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.g1 + this.h1;
            Drawable drawable = this.B1 ? this.c1 : this.Q0;
            float f2 = this.S0;
            if (f2 <= c44.DEFAULT_ASPECT_RATIO && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (su4.a(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.B1 ? this.c1 : this.Q0;
            float f5 = this.S0;
            if (f5 <= c44.DEFAULT_ASPECT_RATIO && drawable2 != null) {
                f5 = (float) Math.ceil((double) ct.j(24, this.o1));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.D1 != i) {
            this.D1 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.E1 != colorFilter) {
            this.E1 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.G1 != colorStateList) {
            this.G1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.H1 != mode) {
            this.H1 = mode;
            ColorStateList colorStateList = this.G1;
            this.F1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.Q0.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.c1.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.V0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        float f = this.h1;
        Drawable drawable = this.B1 ? this.c1 : this.Q0;
        float f2 = this.S0;
        if (f2 <= c44.DEFAULT_ASPECT_RATIO && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.i1;
    }

    public final float u() {
        return W() ? this.l1 + this.Y0 + this.m1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.P1 ? this.a.a.e.a(h()) : this.K0;
    }

    public final void y() {
        qz2 qz2 = (qz2) this.L1.get();
        if (qz2 != null) {
            Chip chip = (Chip) qz2;
            chip.d(chip.C0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.H0;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.v1) : 0);
        boolean z3 = true;
        if (this.v1 != d) {
            this.v1 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.I0;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.w1) : 0);
        if (this.w1 != d2) {
            this.w1 = d2;
            onStateChange = true;
        }
        int f = w53.f(d2, d);
        if ((this.x1 != f) || (this.a.c == null)) {
            this.x1 = f;
            l(ColorStateList.valueOf(f));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.L0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.y1) : 0;
        if (this.y1 != colorForState) {
            this.y1 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.K1 == null || !ld8.w0(iArr)) ? 0 : this.K1.getColorForState(iArr, this.z1);
        if (this.z1 != colorForState2) {
            this.z1 = colorForState2;
            if (this.J1) {
                onStateChange = true;
            }
        }
        vef vef = this.u1.g;
        int colorForState3 = (vef == null || (colorStateList = vef.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.A1);
        if (this.A1 != colorForState3) {
            this.A1 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] != 16842912) {
                    i++;
                } else if (this.a1) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.B1 == z || this.c1 == null) {
            z2 = false;
        } else {
            float t = t();
            this.B1 = z;
            if (t != t()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.G1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.C1) : 0;
        if (this.C1 != colorForState4) {
            this.C1 = colorForState4;
            ColorStateList colorStateList6 = this.G1;
            PorterDuff.Mode mode = this.H1;
            this.F1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z3 = onStateChange;
        }
        if (x(this.Q0)) {
            z3 |= this.Q0.setState(iArr);
        }
        if (x(this.c1)) {
            z3 |= this.c1.setState(iArr);
        }
        if (x(this.V0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.V0.setState(iArr3);
        }
        if (x(this.W0)) {
            z3 |= this.W0.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return z3;
    }
}
