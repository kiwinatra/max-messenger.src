package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* renamed from: hl0  reason: default package */
public abstract class hl0 extends FrameLayout {
    public static final gl0 x0 = new gl0(0);
    public il0 a;
    public final j4e b;
    public int c;
    public final float o;
    public final float v;
    public Rect v0;
    public final int w;
    public boolean w0;
    public final int x;
    public ColorStateList y;
    public PorterDuff.Mode z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: bh8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hl0(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = defpackage.fh8.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.tnc.SnackbarLayout
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            int r2 = defpackage.tnc.SnackbarLayout_elevation
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0026
            int r2 = defpackage.tnc.SnackbarLayout_elevation
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = defpackage.gag.a
            defpackage.v9g.s(r4, r2)
        L_0x0026:
            int r2 = defpackage.tnc.SnackbarLayout_animationMode
            int r2 = r1.getInt(r2, r0)
            r4.c = r2
            int r2 = defpackage.tnc.SnackbarLayout_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = defpackage.tnc.SnackbarLayout_shapeAppearanceOverlay
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0048
        L_0x003e:
            ypg r6 = defpackage.j4e.b(r5, r6, r0, r0)
            j4e r6 = r6.c()
            r4.b = r6
        L_0x0048:
            int r6 = defpackage.tnc.SnackbarLayout_backgroundOverlayColorAlpha
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.o = r6
            int r6 = defpackage.tnc.SnackbarLayout_backgroundTint
            android.content.res.ColorStateList r5 = defpackage.m5a.C(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            int r5 = defpackage.tnc.SnackbarLayout_backgroundTintMode
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = defpackage.ct.D(r5, r3)
            r4.setBackgroundTintMode(r5)
            int r5 = defpackage.tnc.SnackbarLayout_actionTextColorAlpha
            float r5 = r1.getFloat(r5, r2)
            r4.v = r5
            int r5 = defpackage.tnc.SnackbarLayout_android_maxWidth
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r4.w = r5
            int r5 = defpackage.tnc.SnackbarLayout_maxActionInlineWidth
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r4.x = r5
            r1.recycle()
            gl0 r5 = x0
            r4.setOnTouchListener(r5)
            r5 = 1
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00e3
            int r5 = defpackage.edc.colorSurface
            int r6 = defpackage.edc.colorOnSurface
            float r1 = r4.getBackgroundOverlayColorAlpha()
            int r5 = defpackage.ld9.A(r4, r5)
            int r6 = defpackage.ld9.A(r4, r6)
            int r5 = defpackage.ld9.K(r5, r1, r6)
            j4e r6 = r4.b
            if (r6 == 0) goto L_0x00bc
            gh5 r0 = defpackage.il0.v
            bh8 r0 = new bh8
            r0.<init>((defpackage.j4e) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.l(r5)
            goto L_0x00d7
        L_0x00bc:
            android.content.res.Resources r6 = r4.getResources()
            gh5 r1 = defpackage.il0.v
            int r1 = defpackage.iec.mtrl_snackbar_background_corner_radius
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00d7:
            android.content.res.ColorStateList r5 = r4.y
            if (r5 == 0) goto L_0x00de
            defpackage.ru4.h(r0, r5)
        L_0x00de:
            java.util.WeakHashMap r5 = defpackage.gag.a
            r4.setBackground(r0)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public void setBaseTransientBottomBar(il0 il0) {
        this.a = il0;
    }

    public float getActionTextColorAlpha() {
        return this.v;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.o;
    }

    public int getMaxInlineActionWidth() {
        return this.x;
    }

    public int getMaxWidth() {
        return this.w;
    }

    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        il0 il0 = this.a;
        if (!(il0 == null || (rootWindowInsets = il0.i.getRootWindowInsets()) == null)) {
            il0.q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            il0.f();
        }
        WeakHashMap weakHashMap = gag.a;
        t9g.c(this);
    }

    public final void onDetachedFromWindow() {
        boolean z2;
        super.onDetachedFromWindow();
        il0 il0 = this.a;
        if (il0 != null) {
            qpg l = qpg.l();
            fl0 fl0 = il0.u;
            synchronized (l.a) {
                z2 = true;
                if (!l.m(fl0)) {
                    ffe ffe = (ffe) l.o;
                    if (!((ffe == null || fl0 == null || ffe.a.get() != fl0) ? false : true)) {
                        z2 = false;
                    }
                }
            }
            if (z2) {
                il0.y.post(new dl0(il0, 1));
            }
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        il0 il0 = this.a;
        if (il0 != null && il0.s) {
            il0.e();
            il0.s = false;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.w;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.y == null)) {
            drawable = drawable.mutate();
            ru4.h(drawable, this.y);
            ru4.i(drawable, this.z);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            ru4.h(mutate, colorStateList);
            ru4.i(mutate, this.z);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            ru4.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.w0 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.v0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            il0 il0 = this.a;
            if (il0 != null) {
                gh5 gh5 = il0.v;
                il0.f();
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : x0);
        super.setOnClickListener(onClickListener);
    }
}
