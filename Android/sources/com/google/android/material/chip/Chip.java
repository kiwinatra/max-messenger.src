package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

public class Chip extends AppCompatCheckBox implements qz2, u4e, yg8 {
    public static final int J0 = hnc.Widget_MaterialComponents_Chip_Action;
    public static final Rect K0 = new Rect();
    public static final int[] L0 = {16842913};
    public static final int[] M0 = {16842911};
    public boolean A0;
    public int B0;
    public int C0;
    public CharSequence D0;
    public final pz2 E0;
    public boolean F0;
    public final Rect G0 = new Rect();
    public final RectF H0 = new RectF();
    public final oz2 I0 = new oz2(0, this);
    public rz2 v;
    public xg8 v0;
    public InsetDrawable w;
    public boolean w0;
    public RippleDrawable x;
    public boolean x0;
    public View.OnClickListener y;
    public boolean y0;
    public CompoundButton.OnCheckedChangeListener z;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            int r8 = defpackage.edc.chipStyle
            int r9 = J0
            android.content.Context r14 = defpackage.fh8.a(r14, r15, r8, r9)
            r13.<init>(r14, r15, r8)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            r13.G0 = r14
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>()
            r13.H0 = r14
            oz2 r14 = new oz2
            r14.<init>(r0, r13)
            r13.I0 = r14
            android.content.Context r14 = r13.getContext()
            r10 = 8388627(0x800013, float:1.175497E-38)
            if (r15 != 0) goto L_0x002c
            goto L_0x007a
        L_0x002c:
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "background"
            r15.getAttributeValue(r2, r3)
            java.lang.String r3 = "drawableLeft"
            java.lang.String r3 = r15.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x038d
            java.lang.String r3 = "drawableStart"
            java.lang.String r3 = r15.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x0385
            java.lang.String r3 = "drawableEnd"
            java.lang.String r3 = r15.getAttributeValue(r2, r3)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r3 != 0) goto L_0x037f
            java.lang.String r3 = "drawableRight"
            java.lang.String r3 = r15.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x0379
            java.lang.String r3 = "singleLine"
            boolean r3 = r15.getAttributeBooleanValue(r2, r3, r1)
            if (r3 == 0) goto L_0x0371
            java.lang.String r3 = "lines"
            int r3 = r15.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0371
            java.lang.String r3 = "minLines"
            int r3 = r15.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0371
            java.lang.String r3 = "maxLines"
            int r3 = r15.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0371
            java.lang.String r3 = "gravity"
            r15.getAttributeIntValue(r2, r3, r10)
        L_0x007a:
            rz2 r11 = new rz2
            r11.<init>(r14, r15, r8, r9)
            int[] r4 = defpackage.tnc.Chip
            int[] r7 = new int[r0]
            android.content.Context r2 = r11.o1
            r3 = r15
            r5 = r8
            r6 = r9
            android.content.res.TypedArray r2 = defpackage.vhf.d(r2, r3, r4, r5, r6, r7)
            int r3 = defpackage.tnc.Chip_shapeAppearance
            boolean r3 = r2.hasValue(r3)
            r11.P1 = r3
            int r3 = defpackage.tnc.Chip_chipSurfaceColor
            android.content.Context r4 = r11.o1
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3)
            android.content.res.ColorStateList r5 = r11.H0
            if (r5 == r3) goto L_0x00a9
            r11.H0 = r3
            int[] r3 = r11.getState()
            r11.onStateChange(r3)
        L_0x00a9:
            int r3 = defpackage.tnc.Chip_chipBackgroundColor
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3)
            android.content.res.ColorStateList r5 = r11.I0
            if (r5 == r3) goto L_0x00bc
            r11.I0 = r3
            int[] r3 = r11.getState()
            r11.onStateChange(r3)
        L_0x00bc:
            int r3 = defpackage.tnc.Chip_chipMinHeight
            r5 = 0
            float r3 = r2.getDimension(r3, r5)
            float r6 = r11.J0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            r11.J0 = r3
            r11.invalidateSelf()
            r11.y()
        L_0x00d1:
            int r3 = defpackage.tnc.Chip_chipCornerRadius
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x00e2
            int r3 = defpackage.tnc.Chip_chipCornerRadius
            float r3 = r2.getDimension(r3, r5)
            r11.E(r3)
        L_0x00e2:
            int r3 = defpackage.tnc.Chip_chipStrokeColor
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3)
            r11.J(r3)
            int r3 = defpackage.tnc.Chip_chipStrokeWidth
            float r3 = r2.getDimension(r3, r5)
            r11.K(r3)
            int r3 = defpackage.tnc.Chip_rippleColor
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3)
            r11.T(r3)
            int r3 = defpackage.tnc.Chip_android_text
            java.lang.CharSequence r3 = r2.getText(r3)
            if (r3 != 0) goto L_0x0107
            java.lang.String r3 = ""
        L_0x0107:
            java.lang.CharSequence r6 = r11.O0
            boolean r6 = android.text.TextUtils.equals(r6, r3)
            dff r7 = r11.u1
            if (r6 != 0) goto L_0x011b
            r11.O0 = r3
            r7.e = r1
            r11.invalidateSelf()
            r11.y()
        L_0x011b:
            int r3 = defpackage.tnc.Chip_android_textAppearance
            boolean r6 = r2.hasValue(r3)
            if (r6 == 0) goto L_0x012f
            int r3 = r2.getResourceId(r3, r0)
            if (r3 == 0) goto L_0x012f
            vef r6 = new vef
            r6.<init>(r4, r3)
            goto L_0x0130
        L_0x012f:
            r6 = 0
        L_0x0130:
            int r3 = defpackage.tnc.Chip_android_textSize
            float r12 = r6.k
            float r3 = r2.getDimension(r3, r12)
            r6.k = r3
            r7.c(r6, r4)
            int r3 = defpackage.tnc.Chip_android_ellipsize
            int r3 = r2.getInt(r3, r0)
            if (r3 == r1) goto L_0x0156
            r6 = 2
            if (r3 == r6) goto L_0x0151
            r6 = 3
            if (r3 == r6) goto L_0x014c
            goto L_0x015a
        L_0x014c:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r11.M1 = r3
            goto L_0x015a
        L_0x0151:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
            r11.M1 = r3
            goto L_0x015a
        L_0x0156:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.START
            r11.M1 = r3
        L_0x015a:
            int r3 = defpackage.tnc.Chip_chipIconVisible
            boolean r3 = r2.getBoolean(r3, r0)
            r11.I(r3)
            java.lang.String r3 = "http://schemas.android.com/apk/res-auto"
            if (r15 == 0) goto L_0x0180
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r15.getAttributeValue(r3, r6)
            if (r6 == 0) goto L_0x0180
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r15.getAttributeValue(r3, r6)
            if (r6 != 0) goto L_0x0180
            int r6 = defpackage.tnc.Chip_chipIconEnabled
            boolean r6 = r2.getBoolean(r6, r0)
            r11.I(r6)
        L_0x0180:
            int r6 = defpackage.tnc.Chip_chipIcon
            android.graphics.drawable.Drawable r6 = defpackage.m5a.E(r4, r2, r6)
            r11.F(r6)
            int r6 = defpackage.tnc.Chip_chipIconTint
            boolean r6 = r2.hasValue(r6)
            if (r6 == 0) goto L_0x019a
            int r6 = defpackage.tnc.Chip_chipIconTint
            android.content.res.ColorStateList r6 = defpackage.m5a.C(r4, r2, r6)
            r11.H(r6)
        L_0x019a:
            int r6 = defpackage.tnc.Chip_chipIconSize
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r2.getDimension(r6, r7)
            r11.G(r6)
            int r6 = defpackage.tnc.Chip_closeIconVisible
            boolean r6 = r2.getBoolean(r6, r0)
            r11.Q(r6)
            if (r15 == 0) goto L_0x01c9
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r15.getAttributeValue(r3, r6)
            if (r6 == 0) goto L_0x01c9
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r15.getAttributeValue(r3, r6)
            if (r6 != 0) goto L_0x01c9
            int r6 = defpackage.tnc.Chip_closeIconEnabled
            boolean r6 = r2.getBoolean(r6, r0)
            r11.Q(r6)
        L_0x01c9:
            int r6 = defpackage.tnc.Chip_closeIcon
            android.graphics.drawable.Drawable r6 = defpackage.m5a.E(r4, r2, r6)
            r11.L(r6)
            int r6 = defpackage.tnc.Chip_closeIconTint
            android.content.res.ColorStateList r6 = defpackage.m5a.C(r4, r2, r6)
            r11.P(r6)
            int r6 = defpackage.tnc.Chip_closeIconSize
            float r6 = r2.getDimension(r6, r5)
            r11.N(r6)
            int r6 = defpackage.tnc.Chip_android_checkable
            boolean r6 = r2.getBoolean(r6, r0)
            r11.A(r6)
            int r6 = defpackage.tnc.Chip_checkedIconVisible
            boolean r6 = r2.getBoolean(r6, r0)
            r11.D(r6)
            if (r15 == 0) goto L_0x0211
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r15.getAttributeValue(r3, r6)
            if (r6 == 0) goto L_0x0211
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r3 = r15.getAttributeValue(r3, r6)
            if (r3 != 0) goto L_0x0211
            int r3 = defpackage.tnc.Chip_checkedIconEnabled
            boolean r3 = r2.getBoolean(r3, r0)
            r11.D(r3)
        L_0x0211:
            int r3 = defpackage.tnc.Chip_checkedIcon
            android.graphics.drawable.Drawable r3 = defpackage.m5a.E(r4, r2, r3)
            r11.B(r3)
            int r3 = defpackage.tnc.Chip_checkedIconTint
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x022b
            int r3 = defpackage.tnc.Chip_checkedIconTint
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3)
            r11.C(r3)
        L_0x022b:
            int r3 = defpackage.tnc.Chip_showMotionSpec
            pt9 r3 = defpackage.pt9.a(r4, r2, r3)
            r11.e1 = r3
            int r3 = defpackage.tnc.Chip_hideMotionSpec
            pt9 r3 = defpackage.pt9.a(r4, r2, r3)
            r11.f1 = r3
            int r3 = defpackage.tnc.Chip_chipStartPadding
            float r3 = r2.getDimension(r3, r5)
            float r4 = r11.g1
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x024f
            r11.g1 = r3
            r11.invalidateSelf()
            r11.y()
        L_0x024f:
            int r3 = defpackage.tnc.Chip_iconStartPadding
            float r3 = r2.getDimension(r3, r5)
            r11.S(r3)
            int r3 = defpackage.tnc.Chip_iconEndPadding
            float r3 = r2.getDimension(r3, r5)
            r11.R(r3)
            int r3 = defpackage.tnc.Chip_textStartPadding
            float r3 = r2.getDimension(r3, r5)
            float r4 = r11.j1
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0275
            r11.j1 = r3
            r11.invalidateSelf()
            r11.y()
        L_0x0275:
            int r3 = defpackage.tnc.Chip_textEndPadding
            float r3 = r2.getDimension(r3, r5)
            float r4 = r11.k1
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0289
            r11.k1 = r3
            r11.invalidateSelf()
            r11.y()
        L_0x0289:
            int r3 = defpackage.tnc.Chip_closeIconStartPadding
            float r3 = r2.getDimension(r3, r5)
            r11.O(r3)
            int r3 = defpackage.tnc.Chip_closeIconEndPadding
            float r3 = r2.getDimension(r3, r5)
            r11.M(r3)
            int r3 = defpackage.tnc.Chip_chipEndPadding
            float r3 = r2.getDimension(r3, r5)
            float r4 = r11.n1
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x02af
            r11.n1 = r3
            r11.invalidateSelf()
            r11.y()
        L_0x02af:
            int r3 = defpackage.tnc.Chip_android_maxWidth
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r2.getDimensionPixelSize(r3, r4)
            r11.O1 = r3
            r2.recycle()
            int[] r12 = defpackage.tnc.Chip
            int[] r7 = new int[r0]
            defpackage.vhf.a(r14, r15, r8, r9)
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r8
            r6 = r9
            defpackage.vhf.b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r2 = r14.obtainStyledAttributes(r15, r12, r8, r9)
            int r3 = defpackage.tnc.Chip_ensureMinTouchTargetSize
            boolean r3 = r2.getBoolean(r3, r0)
            r13.A0 = r3
            android.content.Context r3 = r13.getContext()
            r4 = 48
            float r3 = defpackage.ct.j(r4, r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            int r4 = defpackage.tnc.Chip_chipMinTouchTargetSize
            float r3 = r2.getDimension(r4, r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            r13.C0 = r3
            r2.recycle()
            r13.setChipDrawable(r11)
            java.util.WeakHashMap r2 = defpackage.gag.a
            float r2 = defpackage.v9g.i(r13)
            r11.k(r2)
            int[] r12 = defpackage.tnc.Chip
            int[] r7 = new int[r0]
            defpackage.vhf.a(r14, r15, r8, r9)
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r8
            r6 = r9
            defpackage.vhf.b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r14 = r14.obtainStyledAttributes(r15, r12, r8, r9)
            int r15 = defpackage.tnc.Chip_shapeAppearance
            boolean r15 = r14.hasValue(r15)
            r14.recycle()
            pz2 r14 = new pz2
            r14.<init>(r13, r13)
            r13.E0 = r14
            r13.g()
            if (r15 != 0) goto L_0x0335
            a42 r14 = new a42
            r14.<init>(r13, r1)
            r13.setOutlineProvider(r14)
        L_0x0335:
            boolean r14 = r13.w0
            r13.setChecked(r14)
            java.lang.CharSequence r14 = r11.O0
            r13.setText(r14)
            android.text.TextUtils$TruncateAt r14 = r11.M1
            r13.setEllipsize(r14)
            r13.j()
            rz2 r14 = r13.v
            boolean r14 = r14.N1
            if (r14 != 0) goto L_0x0353
            r13.setLines(r1)
            r13.setHorizontallyScrolling(r1)
        L_0x0353:
            r13.setGravity(r10)
            r13.i()
            boolean r14 = r13.A0
            if (r14 == 0) goto L_0x0362
            int r14 = r13.C0
            r13.setMinHeight(r14)
        L_0x0362:
            int r14 = r13.getLayoutDirection()
            r13.B0 = r14
            zy2 r14 = new zy2
            r14.<init>(r1, r13)
            super.setOnCheckedChangeListener(r14)
            return
        L_0x0371:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Chip does not support multi-line text"
            r13.<init>(r14)
            throw r13
        L_0x0379:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>(r4)
            throw r13
        L_0x037f:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>(r4)
            throw r13
        L_0x0385:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Please set start drawable using R.attr#chipIcon."
            r13.<init>(r14)
            throw r13
        L_0x038d:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Please set left drawable using R.attr#chipIcon."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.H0;
        rectF.setEmpty();
        if (e() && this.y != null) {
            rz2 rz2 = this.v;
            Rect bounds = rz2.getBounds();
            rectF.setEmpty();
            if (rz2.W()) {
                float f = rz2.n1 + rz2.m1 + rz2.Y0 + rz2.l1 + rz2.k1;
                if (su4.a(rz2) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.G0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private vef getTextAppearance() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.u1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.y0 != z2) {
            this.y0 = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.x0 != z2) {
            this.x0 = z2;
            refreshDrawableState();
        }
    }

    public final void d(int i) {
        this.C0 = i;
        int i2 = 0;
        if (!this.A0) {
            InsetDrawable insetDrawable = this.w;
            if (insetDrawable == null) {
                h();
            } else if (insetDrawable != null) {
                this.w = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        } else {
            int max = Math.max(0, i - ((int) this.v.J0));
            int max2 = Math.max(0, i - this.v.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i3 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i2 = max / 2;
                }
                int i4 = i2;
                if (this.w != null) {
                    Rect rect = new Rect();
                    this.w.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        h();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.w = new InsetDrawable(this.v, i3, i4, i3, i4);
                h();
                return;
            }
            InsetDrawable insetDrawable2 = this.w;
            if (insetDrawable2 == null) {
                h();
            } else if (insetDrawable2 != null) {
                this.w = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.F0 ? super.dispatchHoverEvent(motionEvent) : this.E0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.F0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        pz2 pz2 = this.E0;
        pz2.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && pz2.q(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = pz2.l;
                    if (i4 != Integer.MIN_VALUE) {
                        boolean s = pz2.s(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = pz2.q(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = pz2.q(1, (Rect) null);
            }
        }
        if (i == 0 || pz2.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        rz2 rz2 = this.v;
        boolean z2 = false;
        if (rz2 != null && rz2.x(rz2.V0)) {
            rz2 rz22 = this.v;
            int isEnabled = isEnabled();
            if (this.z0) {
                isEnabled++;
            }
            if (this.y0) {
                isEnabled++;
            }
            if (this.x0) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.z0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.y0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.x0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(rz22.I1, iArr)) {
                rz22.I1 = iArr;
                if (rz22.W()) {
                    z2 = rz22.z(rz22.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final boolean e() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            Drawable drawable = rz2.V0;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof pqg) {
                ((qqg) ((pqg) drawable)).getClass();
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        rz2 rz2 = this.v;
        return rz2 != null && rz2.a1;
    }

    public final void g() {
        rz2 rz2;
        if (!e() || (rz2 = this.v) == null || !rz2.U0 || this.y == null) {
            gag.j(this, (v3) null);
            this.F0 = false;
            return;
        }
        gag.j(this, this.E0);
        this.F0 = true;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.D0)) {
            return this.D0;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).y.a) ? "android.widget.Button" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.w;
        return insetDrawable == null ? this.v : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.c1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.d1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.I0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        rz2 rz2 = this.v;
        return rz2 != null ? Math.max(c44.DEFAULT_ASPECT_RATIO, rz2.v()) : c44.DEFAULT_ASPECT_RATIO;
    }

    public Drawable getChipDrawable() {
        return this.v;
    }

    public float getChipEndPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.n1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        rz2 rz2 = this.v;
        if (rz2 == null || (drawable = rz2.Q0) == null) {
            return null;
        }
        if (!(drawable instanceof pqg)) {
            return drawable;
        }
        ((qqg) ((pqg) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.S0 : c44.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getChipIconTint() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.R0;
        }
        return null;
    }

    public float getChipMinHeight() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.J0 : c44.DEFAULT_ASPECT_RATIO;
    }

    public float getChipStartPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.g1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getChipStrokeColor() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.L0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.M0 : c44.DEFAULT_ASPECT_RATIO;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        rz2 rz2 = this.v;
        if (rz2 == null || (drawable = rz2.V0) == null) {
            return null;
        }
        if (!(drawable instanceof pqg)) {
            return drawable;
        }
        ((qqg) ((pqg) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.Z0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.m1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public float getCloseIconSize() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.Y0 : c44.DEFAULT_ASPECT_RATIO;
    }

    public float getCloseIconStartPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.l1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getCloseIconTint() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.X0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.M1;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.F0) {
            pz2 pz2 = this.E0;
            if (pz2.l == 1 || pz2.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public pt9 getHideMotionSpec() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.f1;
        }
        return null;
    }

    public float getIconEndPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.i1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public float getIconStartPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.h1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getRippleColor() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.N0;
        }
        return null;
    }

    public j4e getShapeAppearanceModel() {
        return this.v.a.a;
    }

    public pt9 getShowMotionSpec() {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            return rz2.e1;
        }
        return null;
    }

    public float getTextEndPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.k1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public float getTextStartPadding() {
        rz2 rz2 = this.v;
        return rz2 != null ? rz2.j1 : c44.DEFAULT_ASPECT_RATIO;
    }

    public final void h() {
        this.x = new RippleDrawable(ld8.r0(this.v.N0), getBackgroundDrawable(), (Drawable) null);
        rz2 rz2 = this.v;
        if (rz2.J1) {
            rz2.J1 = false;
            rz2.K1 = null;
            rz2.onStateChange(rz2.getState());
        }
        RippleDrawable rippleDrawable = this.x;
        WeakHashMap weakHashMap = gag.a;
        setBackground(rippleDrawable);
        i();
    }

    public final void i() {
        rz2 rz2;
        if (!TextUtils.isEmpty(getText()) && (rz2 = this.v) != null) {
            int u = (int) (rz2.u() + rz2.n1 + rz2.k1);
            rz2 rz22 = this.v;
            int t = (int) (rz22.t() + rz22.g1 + rz22.j1);
            if (this.w != null) {
                Rect rect = new Rect();
                this.w.getPadding(rect);
                t += rect.left;
                u += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = gag.a;
            setPaddingRelative(t, paddingTop, u, paddingBottom);
        }
    }

    public final void j() {
        TextPaint paint = getPaint();
        rz2 rz2 = this.v;
        if (rz2 != null) {
            paint.drawableState = rz2.getState();
        }
        vef textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.I0);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5a.g0(this, this.v);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L0);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, M0);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.F0) {
            pz2 pz2 = this.E0;
            int i2 = pz2.l;
            if (i2 != Integer.MIN_VALUE) {
                pz2.j(i2);
            }
            if (z2) {
                pz2.q(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.c) {
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i3);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i3).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        }
                        i++;
                    }
                    i3++;
                }
            }
            i = -1;
            Object tag = getTag(agc.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.a(isChecked(), i2, 1, i, 1).a);
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.B0 != i) {
            this.B0 = i;
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.x0
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = r3
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.x0
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.y
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.F0
            if (r0 == 0) goto L_0x0043
            pz2 r0 = r5.E0
            r0.x(r3, r3)
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.D0 = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.x) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.x) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.A(z2);
        }
    }

    public void setCheckableResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.A(rz2.o1.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z2) {
        rz2 rz2 = this.v;
        if (rz2 == null) {
            this.w0 = z2;
        } else if (rz2.a1) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.B(iq.D(rz2.o1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.C(q8.j(i, rz2.o1));
        }
    }

    public void setCheckedIconVisible(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.D(rz2.o1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.I0 != colorStateList) {
            rz2.I0 = colorStateList;
            rz2.onStateChange(rz2.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList j;
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.I0 != (j = q8.j(i, rz2.o1))) {
            rz2.I0 = j;
            rz2.onStateChange(rz2.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.E(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(rz2 rz2) {
        rz2 rz22 = this.v;
        if (rz22 != rz2) {
            if (rz22 != null) {
                rz22.L1 = new WeakReference((Object) null);
            }
            this.v = rz2;
            rz2.N1 = false;
            rz2.L1 = new WeakReference(this);
            d(this.C0);
        }
    }

    public void setChipEndPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.n1 != f) {
            rz2.n1 = f;
            rz2.invalidateSelf();
            rz2.y();
        }
    }

    public void setChipEndPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float dimension = rz2.o1.getResources().getDimension(i);
            if (rz2.n1 != dimension) {
                rz2.n1 = dimension;
                rz2.invalidateSelf();
                rz2.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.F(iq.D(rz2.o1, i));
        }
    }

    public void setChipIconSize(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.G(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.H(q8.j(i, rz2.o1));
        }
    }

    public void setChipIconVisible(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.I(rz2.o1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.J0 != f) {
            rz2.J0 = f;
            rz2.invalidateSelf();
            rz2.y();
        }
    }

    public void setChipMinHeightResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float dimension = rz2.o1.getResources().getDimension(i);
            if (rz2.J0 != dimension) {
                rz2.J0 = dimension;
                rz2.invalidateSelf();
                rz2.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.g1 != f) {
            rz2.g1 = f;
            rz2.invalidateSelf();
            rz2.y();
        }
    }

    public void setChipStartPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float dimension = rz2.o1.getResources().getDimension(i);
            if (rz2.g1 != dimension) {
                rz2.g1 = dimension;
                rz2.invalidateSelf();
                rz2.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.J(q8.j(i, rz2.o1));
        }
    }

    public void setChipStrokeWidth(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.K(rz2.o1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.L(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.Z0 != charSequence) {
            um0 c = um0.c();
            rz2.Z0 = c.d(charSequence, c.c);
            rz2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.M(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.L(iq.D(rz2.o1, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.N(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.O(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.P(q8.j(i, rz2.o1));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.k(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.v != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                rz2 rz2 = this.v;
                if (rz2 != null) {
                    rz2.M1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.A0 = z2;
        d(this.C0);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(pt9 pt9) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.f1 = pt9;
        }
    }

    public void setHideMotionSpecResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.f1 = pt9.b(i, rz2.o1);
        }
    }

    public void setIconEndPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.R(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.S(rz2.o1.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(xg8 xg8) {
        this.v0 = xg8;
    }

    public void setLayoutDirection(int i) {
        if (this.v != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.O1 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.y = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.T(colorStateList);
        }
        if (!this.v.J1) {
            h();
        }
    }

    public void setRippleColorResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.T(q8.j(i, rz2.o1));
            if (!this.v.J1) {
                h();
            }
        }
    }

    public void setShapeAppearanceModel(j4e j4e) {
        this.v.setShapeAppearanceModel(j4e);
    }

    public void setShowMotionSpec(pt9 pt9) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.e1 = pt9;
        }
    }

    public void setShowMotionSpecResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.e1 = pt9.b(i, rz2.o1);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(rz2.N1 ? null : charSequence, bufferType);
            rz2 rz22 = this.v;
            if (rz22 != null && !TextUtils.equals(rz22.O0, charSequence)) {
                rz22.O0 = charSequence;
                rz22.u1.e = true;
                rz22.invalidateSelf();
                rz22.y();
            }
        }
    }

    public void setTextAppearance(vef vef) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.u1.c(vef, rz2.o1);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.k1 != f) {
            rz2.k1 = f;
            rz2.invalidateSelf();
            rz2.y();
        }
    }

    public void setTextEndPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float dimension = rz2.o1.getResources().getDimension(i);
            if (rz2.k1 != dimension) {
                rz2.k1 = dimension;
                rz2.invalidateSelf();
                rz2.y();
            }
        }
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            dff dff = rz2.u1;
            vef vef = dff.g;
            if (vef != null) {
                vef.k = applyDimension;
                dff.a.setTextSize(applyDimension);
                rz2.a();
            }
        }
        j();
    }

    public void setTextStartPadding(float f) {
        rz2 rz2 = this.v;
        if (rz2 != null && rz2.j1 != f) {
            rz2.j1 = f;
            rz2.invalidateSelf();
            rz2.y();
        }
    }

    public void setTextStartPaddingResource(int i) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            float dimension = rz2.o1.getResources().getDimension(i);
            if (rz2.j1 != dimension) {
                rz2.j1 = dimension;
                rz2.invalidateSelf();
                rz2.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.Q(z2);
        }
        g();
    }

    public void setCheckedIconVisible(boolean z2) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.D(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        rz2 rz2 = this.v;
        if (rz2 != null) {
            rz2.I(z2);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rz2 rz2 = this.v;
        if (rz2 != null) {
            Context context2 = rz2.o1;
            rz2.u1.c(new vef(context2, i), context2);
        }
        j();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        rz2 rz2 = this.v;
        if (rz2 != null) {
            Context context = rz2.o1;
            rz2.u1.c(new vef(context, i), context);
        }
        j();
    }
}
