package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class MaterialButton extends AppCompatButton implements Checkable, u4e {
    public static final int[] D0 = {16842911};
    public static final int[] E0 = {16842912};
    public static final int F0 = hnc.Widget_MaterialComponents_Button;
    public boolean A0;
    public boolean B0;
    public int C0;
    public final ng8 o;
    public final LinkedHashSet v = new LinkedHashSet();
    public String v0;
    public lg8 w;
    public int w0;
    public PorterDuff.Mode x;
    public int x0;
    public ColorStateList y;
    public int y0;
    public Drawable z;
    public int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r6 = defpackage.edc.materialButtonStyle
            int r7 = F0
            android.content.Context r10 = defpackage.fh8.a(r10, r11, r6, r7)
            r9.<init>(r10, r11, r6)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.v = r10
            r10 = 0
            r9.A0 = r10
            r9.B0 = r10
            android.content.Context r8 = r9.getContext()
            int[] r2 = defpackage.tnc.MaterialButton
            int[] r5 = new int[r10]
            r0 = r8
            r1 = r11
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            int r1 = defpackage.tnc.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r9.z0 = r1
            int r1 = defpackage.tnc.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = defpackage.ct.D(r1, r3)
            r9.x = r1
            android.content.Context r1 = r9.getContext()
            int r4 = defpackage.tnc.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = defpackage.m5a.C(r1, r0, r4)
            r9.y = r1
            android.content.Context r1 = r9.getContext()
            int r4 = defpackage.tnc.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = defpackage.m5a.E(r1, r0, r4)
            r9.z = r1
            int r1 = defpackage.tnc.MaterialButton_iconGravity
            r4 = 1
            int r1 = r0.getInteger(r1, r4)
            r9.C0 = r1
            int r1 = defpackage.tnc.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r9.w0 = r1
            ypg r11 = defpackage.j4e.b(r8, r11, r6, r7)
            j4e r11 = r11.c()
            ng8 r1 = new ng8
            r1.<init>(r9, r11)
            r9.o = r1
            int r11 = defpackage.tnc.MaterialButton_android_insetLeft
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.c = r11
            int r11 = defpackage.tnc.MaterialButton_android_insetRight
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.d = r11
            int r11 = defpackage.tnc.MaterialButton_android_insetTop
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.e = r11
            int r11 = defpackage.tnc.MaterialButton_android_insetBottom
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.f = r11
            int r11 = defpackage.tnc.MaterialButton_cornerRadius
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L_0x00d2
            int r11 = defpackage.tnc.MaterialButton_cornerRadius
            int r11 = r0.getDimensionPixelSize(r11, r2)
            r1.g = r11
            j4e r5 = r1.b
            float r11 = (float) r11
            ypg r5 = r5.e()
            d0 r6 = new d0
            r6.<init>(r11)
            r5.e = r6
            d0 r6 = new d0
            r6.<init>(r11)
            r5.f = r6
            d0 r6 = new d0
            r6.<init>(r11)
            r5.g = r6
            d0 r6 = new d0
            r6.<init>(r11)
            r5.h = r6
            j4e r11 = r5.c()
            r1.c(r11)
            r1.p = r4
        L_0x00d2:
            int r11 = defpackage.tnc.MaterialButton_strokeWidth
            int r11 = r0.getDimensionPixelSize(r11, r10)
            r1.h = r11
            int r11 = defpackage.tnc.MaterialButton_backgroundTintMode
            int r11 = r0.getInt(r11, r2)
            android.graphics.PorterDuff$Mode r11 = defpackage.ct.D(r11, r3)
            r1.i = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.tnc.MaterialButton_backgroundTint
            android.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2)
            r1.j = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.tnc.MaterialButton_strokeColor
            android.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2)
            r1.k = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.tnc.MaterialButton_rippleColor
            android.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2)
            r1.l = r11
            int r11 = defpackage.tnc.MaterialButton_android_checkable
            boolean r11 = r0.getBoolean(r11, r10)
            r1.q = r11
            int r11 = defpackage.tnc.MaterialButton_elevation
            int r11 = r0.getDimensionPixelSize(r11, r10)
            r1.t = r11
            int r11 = defpackage.tnc.MaterialButton_toggleCheckedStateOnClick
            boolean r11 = r0.getBoolean(r11, r4)
            r1.r = r11
            java.util.WeakHashMap r11 = defpackage.gag.a
            int r11 = r9.getPaddingStart()
            int r2 = r9.getPaddingTop()
            int r3 = r9.getPaddingEnd()
            int r5 = r9.getPaddingBottom()
            int r6 = defpackage.tnc.MaterialButton_android_background
            boolean r6 = r0.hasValue(r6)
            if (r6 == 0) goto L_0x0149
            r1.o = r4
            android.content.res.ColorStateList r6 = r1.j
            r9.setSupportBackgroundTintList(r6)
            android.graphics.PorterDuff$Mode r6 = r1.i
            r9.setSupportBackgroundTintMode(r6)
            goto L_0x014c
        L_0x0149:
            r1.e()
        L_0x014c:
            int r6 = r1.c
            int r11 = r11 + r6
            int r6 = r1.e
            int r2 = r2 + r6
            int r6 = r1.d
            int r3 = r3 + r6
            int r1 = r1.f
            int r5 = r5 + r1
            r9.setPaddingRelative(r11, r2, r3, r5)
            r0.recycle()
            int r11 = r9.z0
            r9.setCompoundDrawablePadding(r11)
            android.graphics.drawable.Drawable r11 = r9.z
            if (r11 == 0) goto L_0x0168
            r10 = r4
        L_0x0168:
            r9.e(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = c44.DEFAULT_ASPECT_RATIO;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    public final boolean b() {
        ng8 ng8 = this.o;
        return ng8 != null && ng8.q;
    }

    public final boolean c() {
        ng8 ng8 = this.o;
        return ng8 != null && !ng8.o;
    }

    public final void d() {
        int i = this.C0;
        boolean z2 = true;
        if (!(i == 1 || i == 2)) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.z, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 3 || i == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.z, (Drawable) null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.z, (Drawable) null, (Drawable) null);
        }
    }

    public final void e(boolean z2) {
        Drawable drawable = this.z;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.z = mutate;
            ru4.h(mutate, this.y);
            PorterDuff.Mode mode = this.x;
            if (mode != null) {
                ru4.i(this.z, mode);
            }
            int i = this.w0;
            if (i == 0) {
                i = this.z.getIntrinsicWidth();
            }
            int i2 = this.w0;
            if (i2 == 0) {
                i2 = this.z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.z;
            int i3 = this.x0;
            int i4 = this.y0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.z.setVisible(true, z2);
        }
        if (z2) {
            d();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.C0;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.z) || (((i5 == 3 || i5 == 4) && drawable5 != this.z) || ((i5 == 16 || i5 == 32) && drawable4 != this.z))) {
            d();
        }
    }

    public final void f(int i, int i2) {
        if (this.z != null && getLayout() != null) {
            int i3 = this.C0;
            boolean z2 = true;
            if ((i3 == 1 || i3 == 2) || i3 == 3 || i3 == 4) {
                this.y0 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.C0;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.x0 = 0;
                    e(false);
                    return;
                }
                int i5 = this.w0;
                if (i5 == 0) {
                    i5 = this.z.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = gag.a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i5) - this.z0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                boolean z3 = getLayoutDirection() == 1;
                if (this.C0 != 4) {
                    z2 = false;
                }
                if (z3 != z2) {
                    paddingEnd = -paddingEnd;
                }
                if (this.x0 != paddingEnd) {
                    this.x0 = paddingEnd;
                    e(false);
                }
            } else if (i3 == 16 || i3 == 32) {
                this.x0 = 0;
                if (i3 == 16) {
                    this.y0 = 0;
                    e(false);
                    return;
                }
                int i6 = this.w0;
                if (i6 == 0) {
                    i6 = this.z.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.z0) - getPaddingBottom()) / 2);
                if (this.y0 != max) {
                    this.y0 = max;
                    e(false);
                }
            }
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.v0)) {
            return this.v0;
        }
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.o.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.z;
    }

    public int getIconGravity() {
        return this.C0;
    }

    public int getIconPadding() {
        return this.z0;
    }

    public int getIconSize() {
        return this.w0;
    }

    public ColorStateList getIconTint() {
        return this.y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.x;
    }

    public int getInsetBottom() {
        return this.o.f;
    }

    public int getInsetTop() {
        return this.o.e;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.o.l;
        }
        return null;
    }

    public j4e getShapeAppearanceModel() {
        if (c()) {
            return this.o.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.o.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.o.h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.o.j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.o.i : super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.A0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            o5a.g0(this, this.o.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            View.mergeDrawableStates(onCreateDrawableState, D0);
        }
        if (this.A0) {
            View.mergeDrawableStates(onCreateDrawableState, E0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.A0);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(this.A0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mg8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mg8 mg8 = (mg8) parcelable;
        super.onRestoreInstanceState(mg8.a);
        setChecked(mg8.c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, mg8] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.A0;
        return zVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.o.r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.z != null) {
            if (this.z.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.v0 = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.b(false) != null) {
                ng8.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            ng8 ng8 = this.o;
            ng8.o = true;
            ColorStateList colorStateList = ng8.j;
            MaterialButton materialButton = ng8.a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(ng8.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? iq.D(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (c()) {
            this.o.q = z2;
        }
    }

    public void setChecked(boolean z2) {
        if (b() && isEnabled() && this.A0 != z2) {
            this.A0 = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.A0;
                if (!materialButtonToggleGroup.w) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (!this.B0) {
                this.B0 = true;
                Iterator it = this.v.iterator();
                if (!it.hasNext()) {
                    this.B0 = false;
                } else {
                    rae.w(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i) {
        if (c()) {
            ng8 ng8 = this.o;
            if (!ng8.p || ng8.g != i) {
                ng8.g = i;
                ng8.p = true;
                float f = (float) i;
                ypg e = ng8.b.e();
                e.e = new d0(f);
                e.f = new d0(f);
                e.g = new d0(f);
                e.h = new d0(f);
                ng8.c(e.c());
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (c()) {
            this.o.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.z != drawable) {
            this.z = drawable;
            e(true);
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? iq.D(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.w0 != i) {
            this.w0 = i;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.x != mode) {
            this.x = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(q8.j(i, getContext()));
    }

    public void setInsetBottom(int i) {
        ng8 ng8 = this.o;
        ng8.d(ng8.e, i);
    }

    public void setInsetTop(int i) {
        ng8 ng8 = this.o;
        ng8.d(i, ng8.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(lg8 lg8) {
        this.w = lg8;
    }

    public void setPressed(boolean z2) {
        lg8 lg8 = this.w;
        if (lg8 != null) {
            ((MaterialButtonToggleGroup) ((grg) lg8).b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.l != colorStateList) {
                ng8.l = colorStateList;
                MaterialButton materialButton = ng8.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ld8.r0(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (c()) {
            setRippleColor(q8.j(i, getContext()));
        }
    }

    public void setShapeAppearanceModel(j4e j4e) {
        if (c()) {
            this.o.c(j4e);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (c()) {
            ng8 ng8 = this.o;
            ng8.n = z2;
            ng8.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.k != colorStateList) {
                ng8.k = colorStateList;
                ng8.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (c()) {
            setStrokeColor(q8.j(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.h != i) {
                ng8.h = i;
                ng8.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.j != colorStateList) {
                ng8.j = colorStateList;
                if (ng8.b(false) != null) {
                    ru4.h(ng8.b(false), ng8.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            ng8 ng8 = this.o;
            if (ng8.i != mode) {
                ng8.i = mode;
                if (ng8.b(false) != null && ng8.i != null) {
                    ru4.i(ng8.b(false), ng8.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.o.r = z2;
    }

    public final void toggle() {
        setChecked(!this.A0);
    }
}
