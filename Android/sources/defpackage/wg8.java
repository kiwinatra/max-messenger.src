package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: wg8  reason: default package */
public final class wg8 extends AppCompatCheckBox {
    public static final int K0 = hnc.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] L0 = {edc.state_indeterminate};
    public static final int[] M0;
    public static final int[][] N0;
    public static final int O0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList A0;
    public ColorStateList B0;
    public PorterDuff.Mode C0;
    public int D0;
    public int[] E0;
    public boolean F0;
    public CharSequence G0;
    public CompoundButton.OnCheckedChangeListener H0;
    public final ag I0 = ag.a(qfc.mtrl_checkbox_button_checked_unchecked, getContext());
    public final ug8 J0 = new ug8(this, 0);
    public final LinkedHashSet v = new LinkedHashSet();
    public boolean v0;
    public final LinkedHashSet w = new LinkedHashSet();
    public CharSequence w0;
    public ColorStateList x;
    public Drawable x0;
    public boolean y;
    public Drawable y0;
    public boolean z;
    public boolean z0;

    static {
        int i = edc.state_error;
        M0 = new int[]{i};
        N0 = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wg8(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            int r6 = defpackage.edc.checkboxStyle
            int r7 = K0
            android.content.Context r12 = defpackage.fh8.a(r12, r13, r6, r7)
            r11.<init>(r12, r13, r6)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.v = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.w = r12
            android.content.Context r12 = r11.getContext()
            int r0 = defpackage.qfc.mtrl_checkbox_button_checked_unchecked
            ag r12 = defpackage.ag.a(r0, r12)
            r11.I0 = r12
            ug8 r12 = new ug8
            r0 = 0
            r12.<init>(r11, r0)
            r11.J0 = r12
            android.content.Context r12 = r11.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.kd3.a(r11)
            r11.x0 = r0
            android.content.res.ColorStateList r0 = r11.getSuperButtonTintList()
            r11.A0 = r0
            r8 = 0
            r11.setSupportButtonTintList(r8)
            int[] r9 = defpackage.tnc.MaterialCheckBox
            r10 = 0
            int[] r5 = new int[r10]
            defpackage.vhf.a(r12, r13, r6, r7)
            r0 = r12
            r1 = r13
            r2 = r9
            r3 = r6
            r4 = r7
            defpackage.vhf.b(r0, r1, r2, r3, r4, r5)
            g6d r0 = new g6d
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r9, r6, r7)
            r1 = 17
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r13)
            int r1 = defpackage.tnc.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r1 = r0.q(r1)
            r11.y0 = r1
            android.graphics.drawable.Drawable r1 = r11.x0
            r2 = 1
            if (r1 == 0) goto L_0x009c
            int r1 = defpackage.edc.isMaterial3Theme
            boolean r1 = defpackage.b59.U(r1, r12, r10)
            if (r1 == 0) goto L_0x009c
            int r1 = defpackage.tnc.MaterialCheckBox_android_button
            int r1 = r13.getResourceId(r1, r10)
            int r3 = defpackage.tnc.MaterialCheckBox_buttonCompat
            int r3 = r13.getResourceId(r3, r10)
            int r4 = O0
            if (r1 != r4) goto L_0x009c
            if (r3 != 0) goto L_0x009c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r8)
            int r1 = defpackage.qfc.mtrl_checkbox_button
            android.graphics.drawable.Drawable r1 = defpackage.iq.D(r12, r1)
            r11.x0 = r1
            r11.z0 = r2
            android.graphics.drawable.Drawable r1 = r11.y0
            if (r1 != 0) goto L_0x009c
            int r1 = defpackage.qfc.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r1 = defpackage.iq.D(r12, r1)
            r11.y0 = r1
        L_0x009c:
            int r1 = defpackage.tnc.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r12 = defpackage.m5a.B(r12, r0, r1)
            r11.B0 = r12
            int r12 = defpackage.tnc.MaterialCheckBox_buttonIconTintMode
            r1 = -1
            int r12 = r13.getInt(r12, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r12 = defpackage.ct.D(r12, r1)
            r11.C0 = r12
            int r12 = defpackage.tnc.MaterialCheckBox_useMaterialThemeColors
            boolean r12 = r13.getBoolean(r12, r10)
            r11.y = r12
            int r12 = defpackage.tnc.MaterialCheckBox_centerIfNoTextEnabled
            boolean r12 = r13.getBoolean(r12, r2)
            r11.z = r12
            int r12 = defpackage.tnc.MaterialCheckBox_errorShown
            boolean r12 = r13.getBoolean(r12, r10)
            r11.v0 = r12
            int r12 = defpackage.tnc.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r12 = r13.getText(r12)
            r11.w0 = r12
            int r12 = defpackage.tnc.MaterialCheckBox_checkedState
            boolean r12 = r13.hasValue(r12)
            if (r12 == 0) goto L_0x00e4
            int r12 = defpackage.tnc.MaterialCheckBox_checkedState
            int r12 = r13.getInt(r12, r10)
            r11.setCheckedState(r12)
        L_0x00e4:
            r0.x()
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg8.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.D0;
        return i == 1 ? getResources().getString(ymc.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(ymc.mtrl_checkbox_state_description_unchecked) : getResources().getString(ymc.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.x == null) {
            int A = ld9.A(this, edc.colorControlActivated);
            int A2 = ld9.A(this, edc.colorError);
            int A3 = ld9.A(this, edc.colorSurface);
            int A4 = ld9.A(this, edc.colorOnSurface);
            this.x = new ColorStateList(N0, new int[]{ld9.K(A3, 1.0f, A2), ld9.K(A3, 1.0f, A), ld9.K(A3, 0.54f, A4), ld9.K(A3, 0.38f, A4), ld9.K(A3, 0.38f, A4)});
        }
        return this.x;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.A0;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.x0;
        ColorStateList colorStateList3 = this.A0;
        PorterDuff.Mode b = jd3.b(this);
        Drawable drawable2 = null;
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b != null) {
                ru4.i(drawable, b);
            }
        }
        this.x0 = drawable;
        Drawable drawable3 = this.y0;
        ColorStateList colorStateList4 = this.B0;
        PorterDuff.Mode mode = this.C0;
        if (drawable3 != null) {
            if (colorStateList4 != null) {
                drawable3 = drawable3.mutate();
                if (mode != null) {
                    ru4.i(drawable3, mode);
                }
            }
            drawable2 = drawable3;
        }
        this.y0 = drawable2;
        if (this.z0) {
            ag agVar = this.I0;
            if (agVar != null) {
                ug8 ug8 = this.J0;
                agVar.c(ug8);
                agVar.b(ug8);
            }
            Drawable drawable4 = this.x0;
            if ((drawable4 instanceof AnimatedStateListDrawable) && agVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(agc.checked, agc.unchecked, agVar, false);
                ((AnimatedStateListDrawable) this.x0).addTransition(agc.indeterminate, agc.unchecked, agVar, false);
            }
        }
        Drawable drawable5 = this.x0;
        if (!(drawable5 == null || (colorStateList2 = this.A0) == null)) {
            ru4.h(drawable5, colorStateList2);
        }
        Drawable drawable6 = this.y0;
        if (!(drawable6 == null || (colorStateList = this.B0) == null)) {
            ru4.h(drawable6, colorStateList);
        }
        Drawable drawable7 = this.x0;
        Drawable drawable8 = this.y0;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f >= ((float) drawable7.getIntrinsicWidth()) / ((float) drawable7.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.x0;
    }

    public Drawable getButtonIconDrawable() {
        return this.y0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.B0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.C0;
    }

    public ColorStateList getButtonTintList() {
        return this.A0;
    }

    public int getCheckedState() {
        return this.D0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.w0;
    }

    public final boolean isChecked() {
        return this.D0 == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y && this.A0 == null && this.B0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, L0);
        }
        if (this.v0) {
            View.mergeDrawableStates(onCreateDrawableState, M0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.E0 = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.z || !TextUtils.isEmpty(getText()) || (a = kd3.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * (ct.x(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, c44.DEFAULT_ASPECT_RATIO);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            ru4.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.v0) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.w0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof vg8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vg8 vg8 = (vg8) parcelable;
        super.onRestoreInstanceState(vg8.getSuperState());
        setCheckedState(vg8.a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, vg8] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(iq.D(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.y0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(iq.D(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.z = z2;
    }

    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.D0 != i) {
            this.D0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.F0) {
                this.F0 = true;
                LinkedHashSet linkedHashSet = this.w;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        rae.w(it.next());
                        throw null;
                    }
                }
                if (!(this.D0 == 2 || (onCheckedChangeListener = this.H0) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.F0 = false;
            }
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.w0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.v0 != z2) {
            this.v0 = z2;
            refreshDrawableState();
            Iterator it = this.v.iterator();
            if (it.hasNext()) {
                rae.w(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.H0 = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.G0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.y = z2;
        if (z2) {
            jd3.c(this, getMaterialThemeColorsTintList());
        } else {
            jd3.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.x0 = drawable;
        this.z0 = false;
        b();
    }
}
