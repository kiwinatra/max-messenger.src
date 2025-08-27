package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int L1 = hnc.Widget_Design_TextInputLayout;
    public static final int[][] M1 = {new int[]{16842919}, new int[0]};
    public AppCompatTextView A0;
    public int A1;
    public int B0;
    public int B1;
    public int C0;
    public int C1;
    public CharSequence D0;
    public boolean D1;
    public boolean E0;
    public final e53 E1;
    public AppCompatTextView F0;
    public boolean F1;
    public ColorStateList G0;
    public boolean G1;
    public int H0;
    public ValueAnimator H1;
    public gg5 I0;
    public boolean I1;
    public gg5 J0;
    public boolean J1;
    public ColorStateList K0;
    public boolean K1;
    public ColorStateList L0;
    public ColorStateList M0;
    public ColorStateList N0;
    public boolean O0;
    public CharSequence P0;
    public boolean Q0;
    public bh8 R0;
    public bh8 S0;
    public StateListDrawable T0;
    public boolean U0;
    public bh8 V0;
    public bh8 W0;
    public j4e X0;
    public boolean Y0;
    public final int Z0;
    public final FrameLayout a;
    public int a1;
    public final vke b;
    public int b1;
    public final o65 c;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public final Rect h1 = new Rect();
    public final Rect i1 = new Rect();
    public final RectF j1 = new RectF();
    public Typeface k1;
    public ColorDrawable l1;
    public int m1;
    public final LinkedHashSet n1 = new LinkedHashSet();
    public EditText o;
    public ColorDrawable o1;
    public int p1;
    public Drawable q1;
    public ColorStateList r1;
    public ColorStateList s1;
    public int t1;
    public int u1;
    public CharSequence v;
    public final bf7 v0 = new bf7(this);
    public int v1;
    public int w = -1;
    public boolean w0;
    public ColorStateList w1;
    public int x = -1;
    public int x0;
    public int x1;
    public int y = -1;
    public boolean y0;
    public int y1;
    public int z = -1;
    public qff z0 = new dre(29);
    public int z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            int r8 = defpackage.edc.textInputStyle
            int r9 = L1
            r1 = r17
            android.content.Context r1 = defpackage.fh8.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.w = r10
            r0.x = r10
            r0.y = r10
            r0.z = r10
            bf7 r1 = new bf7
            r1.<init>(r0)
            r0.v0 = r1
            dre r1 = new dre
            r2 = 29
            r1.<init>(r2)
            r0.z0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.h1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.i1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.j1 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.n1 = r1
            e53 r1 = new e53
            r1.<init>(r0)
            r0.E1 = r1
            r11 = 0
            r0.K1 = r11
            android.content.Context r12 = r16.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.a = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = defpackage.xg.a
            r1.W = r2
            r1.i(r11)
            r1.V = r2
            r1.i(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.l(r2)
            int[] r15 = defpackage.tnc.TextInputLayout
            int r1 = defpackage.tnc.TextInputLayout_counterTextAppearance
            int r2 = defpackage.tnc.TextInputLayout_counterOverflowTextAppearance
            int r3 = defpackage.tnc.TextInputLayout_errorTextAppearance
            int r4 = defpackage.tnc.TextInputLayout_helperTextTextAppearance
            int r5 = defpackage.tnc.TextInputLayout_hintTextAppearance
            int[] r6 = new int[]{r1, r2, r3, r4, r5}
            defpackage.vhf.a(r12, r7, r8, r9)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r8
            r5 = r9
            defpackage.vhf.b(r1, r2, r3, r4, r5, r6)
            g6d r1 = new g6d
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r9)
            r3 = 17
            r1.<init>((int) r3, (java.lang.Object) r12, (java.lang.Object) r2)
            vke r3 = new vke
            r3.<init>(r0, r1)
            r0.b = r3
            int r4 = defpackage.tnc.TextInputLayout_hintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.O0 = r4
            int r4 = defpackage.tnc.TextInputLayout_android_hint
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            int r4 = defpackage.tnc.TextInputLayout_hintAnimationEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.G1 = r4
            int r4 = defpackage.tnc.TextInputLayout_expandedHintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.F1 = r4
            int r4 = defpackage.tnc.TextInputLayout_android_minEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00db
            int r4 = defpackage.tnc.TextInputLayout_android_minEms
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00ec
        L_0x00db:
            int r4 = defpackage.tnc.TextInputLayout_android_minWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00ec
            int r4 = defpackage.tnc.TextInputLayout_android_minWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00ec:
            int r4 = defpackage.tnc.TextInputLayout_android_maxEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00fe
            int r4 = defpackage.tnc.TextInputLayout_android_maxEms
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x010f
        L_0x00fe:
            int r4 = defpackage.tnc.TextInputLayout_android_maxWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x010f
            int r4 = defpackage.tnc.TextInputLayout_android_maxWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMaxWidth(r4)
        L_0x010f:
            ypg r4 = defpackage.j4e.b(r12, r7, r8, r9)
            j4e r4 = r4.c()
            r0.X0 = r4
            android.content.res.Resources r4 = r12.getResources()
            int r5 = defpackage.iec.mtrl_textinput_box_label_cutout_padding
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.Z0 = r4
            int r4 = defpackage.tnc.TextInputLayout_boxCollapsedPaddingTop
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.b1 = r4
            int r4 = defpackage.tnc.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.iec.mtrl_textinput_box_stroke_width_default
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.d1 = r4
            int r4 = defpackage.tnc.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.iec.mtrl_textinput_box_stroke_width_focused
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.e1 = r4
            int r4 = r0.d1
            r0.c1 = r4
            int r4 = defpackage.tnc.TextInputLayout_boxCornerRadiusTopStart
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            int r6 = defpackage.tnc.TextInputLayout_boxCornerRadiusTopEnd
            float r6 = r2.getDimension(r6, r5)
            int r7 = defpackage.tnc.TextInputLayout_boxCornerRadiusBottomEnd
            float r7 = r2.getDimension(r7, r5)
            int r8 = defpackage.tnc.TextInputLayout_boxCornerRadiusBottomStart
            float r5 = r2.getDimension(r8, r5)
            j4e r8 = r0.X0
            ypg r8 = r8.e()
            r9 = 0
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x0181
            d0 r15 = new d0
            r15.<init>(r4)
            r8.e = r15
        L_0x0181:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x018c
            d0 r4 = new d0
            r4.<init>(r6)
            r8.f = r4
        L_0x018c:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0197
            d0 r4 = new d0
            r4.<init>(r7)
            r8.g = r4
        L_0x0197:
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x01a2
            d0 r4 = new d0
            r4.<init>(r5)
            r8.h = r4
        L_0x01a2:
            j4e r4 = r8.c()
            r0.X0 = r4
            int r4 = defpackage.tnc.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4)
            if (r4 == 0) goto L_0x0208
            int r5 = r4.getDefaultColor()
            r0.x1 = r5
            r0.g1 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01e9
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.y1 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.z1 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.A1 = r4
            goto L_0x0212
        L_0x01e9:
            int r4 = r0.x1
            r0.z1 = r4
            int r4 = defpackage.rdc.mtrl_filled_background_color
            android.content.res.ColorStateList r4 = defpackage.q8.j(r4, r12)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.y1 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.A1 = r4
            goto L_0x0212
        L_0x0208:
            r0.g1 = r11
            r0.x1 = r11
            r0.y1 = r11
            r0.z1 = r11
            r0.A1 = r11
        L_0x0212:
            int r4 = defpackage.tnc.TextInputLayout_android_textColorHint
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0224
            int r4 = defpackage.tnc.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.s1 = r4
            r0.r1 = r4
        L_0x0224:
            int r4 = defpackage.tnc.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4)
            int r5 = defpackage.tnc.TextInputLayout_boxStrokeColor
            int r5 = r2.getColor(r5, r11)
            r0.v1 = r5
            int r5 = defpackage.rdc.mtrl_textinput_default_box_stroke_color
            int r5 = defpackage.fw3.a(r12, r5)
            r0.t1 = r5
            int r5 = defpackage.rdc.mtrl_textinput_disabled_color
            int r5 = defpackage.fw3.a(r12, r5)
            r0.B1 = r5
            int r5 = defpackage.rdc.mtrl_textinput_hovered_box_stroke_color
            int r5 = defpackage.fw3.a(r12, r5)
            r0.u1 = r5
            if (r4 == 0) goto L_0x024f
            r0.setBoxStrokeColorStateList(r4)
        L_0x024f:
            int r4 = defpackage.tnc.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0260
            int r4 = defpackage.tnc.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0260:
            int r4 = defpackage.tnc.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r10)
            if (r4 == r10) goto L_0x0271
            int r4 = defpackage.tnc.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x0271:
            int r4 = defpackage.tnc.TextInputLayout_cursorColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.M0 = r4
            int r4 = defpackage.tnc.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.N0 = r4
            int r4 = defpackage.tnc.TextInputLayout_errorTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            int r5 = defpackage.tnc.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r2.getText(r5)
            int r6 = defpackage.tnc.TextInputLayout_errorAccessibilityLiveRegion
            int r6 = r2.getInt(r6, r13)
            int r7 = defpackage.tnc.TextInputLayout_errorEnabled
            boolean r7 = r2.getBoolean(r7, r11)
            int r8 = defpackage.tnc.TextInputLayout_helperTextTextAppearance
            int r8 = r2.getResourceId(r8, r11)
            int r9 = defpackage.tnc.TextInputLayout_helperTextEnabled
            boolean r9 = r2.getBoolean(r9, r11)
            int r12 = defpackage.tnc.TextInputLayout_helperText
            java.lang.CharSequence r12 = r2.getText(r12)
            int r15 = defpackage.tnc.TextInputLayout_placeholderTextAppearance
            int r15 = r2.getResourceId(r15, r11)
            int r13 = defpackage.tnc.TextInputLayout_placeholderText
            java.lang.CharSequence r13 = r2.getText(r13)
            int r10 = defpackage.tnc.TextInputLayout_counterEnabled
            boolean r10 = r2.getBoolean(r10, r11)
            int r11 = defpackage.tnc.TextInputLayout_counterMaxLength
            r18 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            int r11 = defpackage.tnc.TextInputLayout_counterTextAppearance
            r12 = 0
            int r11 = r2.getResourceId(r11, r12)
            r0.C0 = r11
            int r11 = defpackage.tnc.TextInputLayout_counterOverflowTextAppearance
            int r11 = r2.getResourceId(r11, r12)
            r0.B0 = r11
            int r11 = defpackage.tnc.TextInputLayout_boxBackgroundMode
            int r11 = r2.getInt(r11, r12)
            r0.setBoxBackgroundMode(r11)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.B0
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.C0
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            int r4 = defpackage.tnc.TextInputLayout_errorTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0310
            int r4 = defpackage.tnc.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setErrorTextColor(r4)
        L_0x0310:
            int r4 = defpackage.tnc.TextInputLayout_helperTextTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0321
            int r4 = defpackage.tnc.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setHelperTextColor(r4)
        L_0x0321:
            int r4 = defpackage.tnc.TextInputLayout_hintTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0332
            int r4 = defpackage.tnc.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setHintTextColor(r4)
        L_0x0332:
            int r4 = defpackage.tnc.TextInputLayout_counterTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0343
            int r4 = defpackage.tnc.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setCounterTextColor(r4)
        L_0x0343:
            int r4 = defpackage.tnc.TextInputLayout_counterOverflowTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0354
            int r4 = defpackage.tnc.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x0354:
            int r4 = defpackage.tnc.TextInputLayout_placeholderTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0365
            int r4 = defpackage.tnc.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r4 = r1.o(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0365:
            o65 r4 = new o65
            r4.<init>(r0, r1)
            r0.c = r4
            int r5 = defpackage.tnc.TextInputLayout_android_enabled
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.x()
            java.util.WeakHashMap r1 = defpackage.gag.a
            r1 = 2
            r0.setImportantForAccessibility(r1)
            defpackage.y9g.m(r0, r6)
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r18
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.o;
        if (!(editText instanceof AutoCompleteTextView) || q8.t(editText)) {
            return this.R0;
        }
        int A = ld9.A(this.o, edc.colorControlHighlight);
        int i = this.a1;
        int[][] iArr = M1;
        if (i == 2) {
            Context context = getContext();
            bh8 bh8 = this.R0;
            int z2 = ld9.z(edc.colorSurface, context, "TextInputLayout");
            bh8 bh82 = new bh8(bh8.a.a);
            int K = ld9.K(A, 0.1f, z2);
            bh82.l(new ColorStateList(iArr, new int[]{K, 0}));
            bh82.setTint(z2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{K, z2});
            bh8 bh83 = new bh8(bh8.a.a);
            bh83.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, bh82, bh83), bh8});
        } else if (i != 1) {
            return null;
        } else {
            bh8 bh84 = this.R0;
            int i2 = this.g1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{ld9.K(A, 0.1f, i2), i2}), bh84, bh84);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.T0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.T0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.T0.addState(new int[0], f(false));
        }
        return this.T0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.S0 == null) {
            this.S0 = f(true);
        }
        return this.S0;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.o == null) {
            if (getEndIconMode() != 3) {
                boolean z2 = editText instanceof TextInputEditText;
            }
            this.o = editText;
            int i = this.w;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.y);
            }
            int i2 = this.x;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.z);
            }
            this.U0 = false;
            i();
            setTextInputAccessibilityDelegate(new pff(this));
            Typeface typeface = this.o.getTypeface();
            e53 e53 = this.E1;
            boolean m = e53.m(typeface);
            boolean o2 = e53.o(typeface);
            if (m || o2) {
                e53.i(false);
            }
            float textSize = this.o.getTextSize();
            if (e53.l != textSize) {
                e53.l = textSize;
                e53.i(false);
            }
            float letterSpacing = this.o.getLetterSpacing();
            if (e53.g0 != letterSpacing) {
                e53.g0 = letterSpacing;
                e53.i(false);
            }
            int gravity = this.o.getGravity();
            e53.l((gravity & -113) | 48);
            if (e53.j != gravity) {
                e53.j = gravity;
                e53.i(false);
            }
            WeakHashMap weakHashMap = gag.a;
            this.C1 = editText.getMinimumHeight();
            this.o.addTextChangedListener(new off(this, editText));
            if (this.r1 == null) {
                this.r1 = this.o.getHintTextColors();
            }
            if (this.O0) {
                if (TextUtils.isEmpty(this.P0)) {
                    CharSequence hint = this.o.getHint();
                    this.v = hint;
                    setHint(hint);
                    this.o.setHint((CharSequence) null);
                }
                this.Q0 = true;
            }
            p();
            if (this.A0 != null) {
                n(this.o.getText());
            }
            r();
            this.v0.b();
            this.b.bringToFront();
            o65 o65 = this.c;
            o65.bringToFront();
            Iterator it = this.n1.iterator();
            while (it.hasNext()) {
                ((n65) it.next()).a(this);
            }
            o65.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.P0)) {
            this.P0 = charSequence;
            e53 e53 = this.E1;
            if (charSequence == null || !TextUtils.equals(e53.G, charSequence)) {
                e53.G = charSequence;
                e53.H = null;
                Bitmap bitmap = e53.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    e53.K = null;
                }
                e53.i(false);
            }
            if (!this.D1) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.E0 != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = this.F0;
                if (appCompatTextView != null) {
                    this.a.addView(appCompatTextView);
                    this.F0.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView2 = this.F0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                }
                this.F0 = null;
            }
            this.E0 = z2;
        }
    }

    public final void a(float f) {
        e53 e53 = this.E1;
        if (e53.b != f) {
            if (this.H1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.H1 = valueAnimator;
                valueAnimator.setInterpolator(ld8.o0(getContext(), edc.motionEasingEmphasizedInterpolator, xg.b));
                this.H1.setDuration((long) ld8.n0(edc.motionDurationMedium4, 167, getContext()));
                this.H1.addUpdateListener(new sk0(8, this));
            }
            this.H1.setFloatValues(new float[]{e53.b, f});
            this.H1.start();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        int i;
        int i2;
        bh8 bh8 = this.R0;
        if (bh8 != null) {
            j4e j4e = bh8.a.a;
            j4e j4e2 = this.X0;
            if (j4e != j4e2) {
                bh8.setShapeAppearanceModel(j4e2);
            }
            if (this.a1 == 2 && (i = this.c1) > -1 && (i2 = this.f1) != 0) {
                bh8 bh82 = this.R0;
                bh82.a.k = (float) i;
                bh82.invalidateSelf();
                bh82.n(ColorStateList.valueOf(i2));
            }
            int i3 = this.g1;
            if (this.a1 == 1) {
                i3 = w53.f(this.g1, ld9.y(edc.colorSurface, 0, getContext()));
            }
            this.g1 = i3;
            this.R0.l(ColorStateList.valueOf(i3));
            bh8 bh83 = this.V0;
            if (!(bh83 == null || this.W0 == null)) {
                if (this.c1 > -1 && this.f1 != 0) {
                    bh83.l(this.o.isFocused() ? ColorStateList.valueOf(this.t1) : ColorStateList.valueOf(this.f1));
                    this.W0.l(ColorStateList.valueOf(this.f1));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float e;
        if (!this.O0) {
            return 0;
        }
        int i = this.a1;
        e53 e53 = this.E1;
        if (i == 0) {
            e = e53.e();
        } else if (i != 2) {
            return 0;
        } else {
            e = e53.e() / 2.0f;
        }
        return (int) e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [odg, gg5, yrf] */
    public final gg5 d() {
        ? odg = new odg();
        odg.c = (long) ld8.n0(edc.motionDurationShort2, 87, getContext());
        odg.o = ld8.o0(getContext(), edc.motionEasingLinearInterpolator, xg.a);
        return odg;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.v != null) {
            boolean z2 = this.Q0;
            this.Q0 = false;
            CharSequence hint = editText.getHint();
            this.o.setHint(this.v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.o.setHint(hint);
                this.Q0 = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.o) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.J1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.J1 = false;
    }

    public final void draw(Canvas canvas) {
        bh8 bh8;
        super.draw(canvas);
        boolean z2 = this.O0;
        e53 e53 = this.E1;
        if (z2) {
            e53.d(canvas);
        }
        if (this.W0 != null && (bh8 = this.V0) != null) {
            bh8.draw(canvas);
            if (this.o.isFocused()) {
                Rect bounds = this.W0.getBounds();
                Rect bounds2 = this.V0.getBounds();
                float f = e53.b;
                int centerX = bounds2.centerX();
                bounds.left = xg.c(centerX, f, bounds2.left);
                bounds.right = xg.c(centerX, f, bounds2.right);
                this.W0.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.I1
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.I1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            e53 r3 = r4.E1
            if (r3 == 0) goto L_0x002f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.i(r2)
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            android.widget.EditText r3 = r4.o
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = defpackage.gag.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.I1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.O0 && !TextUtils.isEmpty(this.P0) && (this.R0 instanceof m54);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, j4e] */
    public final bh8 f(boolean z2) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(iec.mtrl_shape_corner_size_small_component);
        float f = z2 ? dimensionPixelOffset : c44.DEFAULT_ASPECT_RATIO;
        EditText editText = this.o;
        float popupElevation = editText instanceof eg8 ? ((eg8) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(iec.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(iec.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        ? obj5 = new Object();
        ? obj6 = new Object();
        ? obj7 = new Object();
        ? obj8 = new Object();
        d0 d0Var = new d0(f);
        d0 d0Var2 = new d0(f);
        d0 d0Var3 = new d0(dimensionPixelOffset);
        d0 d0Var4 = new d0(dimensionPixelOffset);
        ? obj9 = new Object();
        obj9.a = obj;
        obj9.b = obj2;
        obj9.c = obj3;
        obj9.d = obj4;
        obj9.e = d0Var;
        obj9.f = d0Var2;
        obj9.g = d0Var4;
        obj9.h = d0Var3;
        obj9.i = obj5;
        obj9.j = obj6;
        obj9.k = obj7;
        obj9.l = obj8;
        EditText editText2 = this.o;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof eg8 ? ((eg8) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = bh8.G0;
            dropDownBackgroundTintList = ColorStateList.valueOf(ld9.z(edc.colorSurface, context, bh8.class.getSimpleName()));
        }
        bh8 bh8 = new bh8();
        bh8.j(context);
        bh8.l(dropDownBackgroundTintList);
        bh8.k(popupElevation);
        bh8.setShapeAppearanceModel(obj9);
        ah8 ah8 = bh8.a;
        if (ah8.h == null) {
            ah8.h = new Rect();
        }
        bh8.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        bh8.invalidateSelf();
        return bh8;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.o.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public int getBaseline() {
        EditText editText = this.o;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return c() + getPaddingTop() + baseline;
    }

    public bh8 getBoxBackground() {
        int i = this.a1;
        if (i == 1 || i == 2) {
            return this.R0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.g1;
    }

    public int getBoxBackgroundMode() {
        return this.a1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.b1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean x2 = ct.x(this);
        RectF rectF = this.j1;
        return x2 ? this.X0.h.a(rectF) : this.X0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean x2 = ct.x(this);
        RectF rectF = this.j1;
        return x2 ? this.X0.g.a(rectF) : this.X0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean x2 = ct.x(this);
        RectF rectF = this.j1;
        return x2 ? this.X0.e.a(rectF) : this.X0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean x2 = ct.x(this);
        RectF rectF = this.j1;
        return x2 ? this.X0.f.a(rectF) : this.X0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.v1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.w1;
    }

    public int getBoxStrokeWidth() {
        return this.d1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.e1;
    }

    public int getCounterMaxLength() {
        return this.x0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.w0 || !this.y0 || (appCompatTextView = this.A0) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.L0;
    }

    public ColorStateList getCounterTextColor() {
        return this.K0;
    }

    public ColorStateList getCursorColor() {
        return this.M0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.N0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.r1;
    }

    public EditText getEditText() {
        return this.o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.x.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.x.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.y0;
    }

    public int getEndIconMode() {
        return this.c.z;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.z0;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.x;
    }

    public CharSequence getError() {
        bf7 bf7 = this.v0;
        if (bf7.q) {
            return bf7.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.v0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.v0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.v0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        bf7 bf7 = this.v0;
        if (bf7.x) {
            return bf7.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.v0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.O0) {
            return this.P0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.E1.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        e53 e53 = this.E1;
        return e53.f(e53.o);
    }

    public ColorStateList getHintTextColor() {
        return this.s1;
    }

    public qff getLengthCounter() {
        return this.z0;
    }

    public int getMaxEms() {
        return this.x;
    }

    public int getMaxWidth() {
        return this.z;
    }

    public int getMinEms() {
        return this.w;
    }

    public int getMinWidth() {
        return this.y;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.x.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.x.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.E0) {
            return this.D0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.H0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.G0;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public j4e getShapeAppearanceModel() {
        return this.X0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.o.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.o.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.x;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.y;
    }

    public CharSequence getSuffixText() {
        return this.c.B0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.C0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.C0;
    }

    public Typeface getTypeface() {
        return this.k1;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.o.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void i() {
        int i = this.a1;
        if (i == 0) {
            this.R0 = null;
            this.V0 = null;
            this.W0 = null;
        } else if (i == 1) {
            this.R0 = new bh8(this.X0);
            this.V0 = new bh8();
            this.W0 = new bh8();
        } else if (i == 2) {
            if (!this.O0 || (this.R0 instanceof m54)) {
                this.R0 = new bh8(this.X0);
            } else {
                j4e j4e = this.X0;
                int i2 = m54.I0;
                if (j4e == null) {
                    j4e = new j4e();
                }
                this.R0 = new m54(new l54(j4e, new RectF()));
            }
            this.V0 = null;
            this.W0 = null;
        } else {
            throw new IllegalArgumentException(wj6.l(new StringBuilder(), this.a1, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        s();
        x();
        if (this.a1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.b1 = getResources().getDimensionPixelSize(iec.material_font_2_0_box_collapsed_padding_top);
            } else if (m5a.K(getContext())) {
                this.b1 = getResources().getDimensionPixelSize(iec.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.o != null && this.a1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.o;
                WeakHashMap weakHashMap = gag.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_2_0_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_2_0_padding_bottom));
            } else if (m5a.K(getContext())) {
                EditText editText2 = this.o;
                WeakHashMap weakHashMap2 = gag.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_1_3_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.a1 != 0) {
            t();
        }
        EditText editText3 = this.o;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.a1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.o
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.o
            int r1 = r1.getGravity()
            e53 r2 = r12.E1
            java.lang.CharSequence r3 = r2.G
            boolean r3 = r2.b(r3)
            r2.I = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.h
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.j0
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.j1
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.j0
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x008a
            float r0 = r2.j0
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.j0
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.e()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.Z0
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.c1
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            bh8 r12 = r12.R0
            m54 r12 = (defpackage.m54) r12
            r12.getClass()
            float r0 = r10.left
            float r1 = r10.top
            float r2 = r10.right
            float r3 = r10.bottom
            r12.r(r0, r1, r2, r3)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(hnc.TextAppearance_AppCompat_Caption);
        textView.setTextColor(fw3.a(getContext(), rdc.design_error));
    }

    public final boolean m() {
        bf7 bf7 = this.v0;
        return bf7.o == 1 && bf7.r != null && !TextUtils.isEmpty(bf7.p);
    }

    public final void n(Editable editable) {
        ((dre) this.z0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.y0;
        int i = this.x0;
        String str = null;
        if (i == -1) {
            this.A0.setText(String.valueOf(length));
            this.A0.setContentDescription((CharSequence) null);
            this.y0 = false;
        } else {
            this.y0 = length > i;
            Context context = getContext();
            this.A0.setContentDescription(context.getString(this.y0 ? ymc.character_counter_overflowed_content_description : ymc.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.x0)}));
            if (z2 != this.y0) {
                o();
            }
            um0 c2 = um0.c();
            AppCompatTextView appCompatTextView = this.A0;
            String string = getContext().getString(ymc.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.x0)});
            if (string == null) {
                c2.getClass();
            } else {
                str = c2.d(string, c2.c).toString();
            }
            appCompatTextView.setText(str);
        }
        if (this.o != null && z2 != this.y0) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.A0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.y0 ? this.B0 : this.C0);
            if (!this.y0 && (colorStateList2 = this.K0) != null) {
                this.A0.setTextColor(colorStateList2);
            }
            if (this.y0 && (colorStateList = this.L0) != null) {
                this.A0.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E1.h(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        o65 o65 = this.c;
        o65.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.K1 = false;
        if (this.o != null && this.o.getMeasuredHeight() < (max = Math.max(o65.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.o.setMinimumHeight(max);
            z2 = true;
        }
        boolean q = q();
        if (z2 || q) {
            this.o.post(new mgd(28, this));
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.o;
        if (editText != null) {
            ThreadLocal threadLocal = im4.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.h1;
            rect.set(0, 0, width, height);
            im4.b(this, editText, rect);
            bh8 bh8 = this.V0;
            if (bh8 != null) {
                int i5 = rect.bottom;
                bh8.setBounds(rect.left, i5 - this.d1, rect.right, i5);
            }
            bh8 bh82 = this.W0;
            if (bh82 != null) {
                int i6 = rect.bottom;
                bh82.setBounds(rect.left, i6 - this.e1, rect.right, i6);
            }
            if (this.O0) {
                float textSize = this.o.getTextSize();
                e53 e53 = this.E1;
                if (e53.l != textSize) {
                    e53.l = textSize;
                    e53.i(false);
                }
                int gravity = this.o.getGravity();
                e53.l((gravity & -113) | 48);
                if (e53.j != gravity) {
                    e53.j = gravity;
                    e53.i(false);
                }
                if (this.o != null) {
                    boolean x2 = ct.x(this);
                    int i7 = rect.bottom;
                    Rect rect2 = this.i1;
                    rect2.bottom = i7;
                    int i8 = this.a1;
                    if (i8 == 1) {
                        rect2.left = g(rect.left, x2);
                        rect2.top = rect.top + this.b1;
                        rect2.right = h(rect.right, x2);
                    } else if (i8 != 2) {
                        rect2.left = g(rect.left, x2);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, x2);
                    } else {
                        rect2.left = this.o.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.o.getPaddingRight();
                    }
                    int i9 = rect2.left;
                    int i10 = rect2.top;
                    int i11 = rect2.right;
                    int i12 = rect2.bottom;
                    Rect rect3 = e53.h;
                    if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                        rect3.set(i9, i10, i11, i12);
                        e53.S = true;
                    }
                    if (this.o != null) {
                        TextPaint textPaint = e53.U;
                        textPaint.setTextSize(e53.l);
                        textPaint.setTypeface(e53.z);
                        textPaint.setLetterSpacing(e53.g0);
                        float f = -textPaint.ascent();
                        rect2.left = this.o.getCompoundPaddingLeft() + rect.left;
                        rect2.top = (this.a1 != 1 || this.o.getMinLines() > 1) ? rect.top + this.o.getCompoundPaddingTop() : (int) (((float) rect.centerY()) - (f / 2.0f));
                        rect2.right = rect.right - this.o.getCompoundPaddingRight();
                        int compoundPaddingBottom = (this.a1 != 1 || this.o.getMinLines() > 1) ? rect.bottom - this.o.getCompoundPaddingBottom() : (int) (((float) rect2.top) + f);
                        rect2.bottom = compoundPaddingBottom;
                        int i13 = rect2.left;
                        int i14 = rect2.top;
                        int i15 = rect2.right;
                        Rect rect4 = e53.g;
                        if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {
                            rect4.set(i13, i14, i15, compoundPaddingBottom);
                            e53.S = true;
                        }
                        e53.i(false);
                        if (e() && !this.D1) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.K1;
        o65 o65 = this.c;
        if (!z2) {
            o65.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.K1 = true;
        }
        if (!(this.F0 == null || (editText = this.o) == null)) {
            this.F0.setGravity(editText.getGravity());
            this.F0.setPadding(this.o.getCompoundPaddingLeft(), this.o.getCompoundPaddingTop(), this.o.getCompoundPaddingRight(), this.o.getCompoundPaddingBottom());
        }
        o65.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rff)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rff rff = (rff) parcelable;
        super.onRestoreInstanceState(rff.a);
        setError(rff.c);
        if (rff.o) {
            post(new haf(3, (Object) this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, j4e] */
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 != this.Y0) {
            m04 m04 = this.X0.e;
            RectF rectF = this.j1;
            float a2 = m04.a(rectF);
            float a3 = this.X0.f.a(rectF);
            float a4 = this.X0.h.a(rectF);
            float a5 = this.X0.g.a(rectF);
            j4e j4e = this.X0;
            b59 b59 = j4e.a;
            b59 b592 = j4e.b;
            b59 b593 = j4e.d;
            b59 b594 = j4e.c;
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            ? obj4 = new Object();
            ypg.d(b592);
            ypg.d(b59);
            ypg.d(b594);
            ypg.d(b593);
            d0 d0Var = new d0(a3);
            d0 d0Var2 = new d0(a2);
            d0 d0Var3 = new d0(a5);
            d0 d0Var4 = new d0(a4);
            ? obj5 = new Object();
            obj5.a = b592;
            obj5.b = b59;
            obj5.c = b593;
            obj5.d = b594;
            obj5.e = d0Var;
            obj5.f = d0Var2;
            obj5.g = d0Var4;
            obj5.h = d0Var3;
            obj5.i = obj;
            obj5.j = obj2;
            obj5.k = obj3;
            obj5.l = obj4;
            this.Y0 = z2;
            setShapeAppearanceModel(obj5);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rff, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.c = getError();
        }
        o65 o65 = this.c;
        zVar.o = o65.z != 0 && o65.x.o;
        return zVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.M0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue T = b59.T(edc.colorControlActivated, context);
            if (T != null) {
                int i = T.resourceId;
                if (i != 0) {
                    colorStateList2 = q8.j(i, context);
                } else {
                    int i2 = T.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.o;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.o.getTextCursorDrawable().mutate();
            if ((m() || (this.A0 != null && this.y0)) && (colorStateList = this.N0) != null) {
                colorStateList2 = colorStateList;
            }
            ru4.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            vke r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.o
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.l1
            if (r6 == 0) goto L_0x003b
            int r6 = r10.m1
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.l1 = r6
            r10.m1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.l1
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.o
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.l1
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.o
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.l1 = r2
        L_0x0076:
            r0 = r5
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            o65 r6 = r10.c
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.z
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.B0
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            androidx.appcompat.widget.AppCompatTextView r7 = r6.C0
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.o
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.c
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.z
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.x
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.o
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.o1
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.p1
            if (r8 == r7) goto L_0x00eb
            r10.p1 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.o
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r10 = r10.o1
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r10, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.o1 = r6
            r10.p1 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.o1
            if (r3 == r6) goto L_0x010d
            r10.q1 = r3
            android.widget.EditText r10 = r10.o
            r0 = r2[r1]
            r1 = r2[r5]
            r2 = r2[r4]
            r10.setCompoundDrawablesRelative(r0, r1, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.o1
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.o
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.o1
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.o
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.q1
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.o1 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.o;
        if (editText != null && this.a1 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = yu4.a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(ho.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.y0 || (appCompatTextView = this.A0) == null) {
                mutate.clearColorFilter();
                this.o.refreshDrawableState();
            } else {
                mutate.setColorFilter(ho.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.o;
        if (editText != null && this.R0 != null) {
            if ((this.U0 || editText.getBackground() == null) && this.a1 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.o;
                WeakHashMap weakHashMap = gag.a;
                editText2.setBackground(editTextBoxBackground);
                this.U0 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.g1 != i) {
            this.g1 = i;
            this.x1 = i;
            this.z1 = i;
            this.A1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(fw3.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.x1 = defaultColor;
        this.g1 = defaultColor;
        this.y1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.z1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.a1) {
            this.a1 = i;
            if (this.o != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.b1 = i;
    }

    public void setBoxCornerFamily(int i) {
        ypg e = this.X0.e();
        m04 m04 = this.X0.e;
        b59 i2 = o5a.i(i);
        e.a = i2;
        ypg.d(i2);
        e.e = m04;
        m04 m042 = this.X0.f;
        b59 i3 = o5a.i(i);
        e.b = i3;
        ypg.d(i3);
        e.f = m042;
        m04 m043 = this.X0.h;
        b59 i4 = o5a.i(i);
        e.d = i4;
        ypg.d(i4);
        e.h = m043;
        m04 m044 = this.X0.g;
        b59 i5 = o5a.i(i);
        e.c = i5;
        ypg.d(i5);
        e.g = m044;
        this.X0 = e.c();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.v1 != i) {
            this.v1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.t1 = colorStateList.getDefaultColor();
            this.B1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.u1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.v1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.v1 != colorStateList.getDefaultColor()) {
            this.v1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.w1 != colorStateList) {
            this.w1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.d1 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.e1 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.w0 != z2) {
            Editable editable = null;
            bf7 bf7 = this.v0;
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.A0 = appCompatTextView;
                appCompatTextView.setId(agc.textinput_counter);
                Typeface typeface = this.k1;
                if (typeface != null) {
                    this.A0.setTypeface(typeface);
                }
                this.A0.setMaxLines(1);
                bf7.a(this.A0, 2);
                ((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(iec.mtrl_textinput_counter_margin_start));
                o();
                if (this.A0 != null) {
                    EditText editText = this.o;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                bf7.g(this.A0, 2);
                this.A0 = null;
            }
            this.w0 = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.x0 != i) {
            if (i > 0) {
                this.x0 = i;
            } else {
                this.x0 = -1;
            }
            if (this.w0 && this.A0 != null) {
                EditText editText = this.o;
                n(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            if (m() || (this.A0 != null && this.y0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.r1 = colorStateList;
        this.s1 = colorStateList;
        if (this.o != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.c.x.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.c.x.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        o65 o65 = this.c;
        CharSequence text = i != 0 ? o65.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = o65.x;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        o65 o65 = this.c;
        Drawable D = i != 0 ? iq.D(o65.getContext(), i) : null;
        CheckableImageButton checkableImageButton = o65.x;
        checkableImageButton.setImageDrawable(D);
        if (D != null) {
            ColorStateList colorStateList = o65.w0;
            PorterDuff.Mode mode = o65.x0;
            TextInputLayout textInputLayout = o65.a;
            hd8.c(textInputLayout, checkableImageButton, colorStateList, mode);
            hd8.R(textInputLayout, checkableImageButton, o65.w0);
        }
    }

    public void setEndIconMinSize(int i) {
        o65 o65 = this.c;
        if (i < 0) {
            o65.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i != o65.y0) {
            o65.y0 = i;
            CheckableImageButton checkableImageButton = o65.x;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = o65.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o65 o65 = this.c;
        View.OnLongClickListener onLongClickListener = o65.A0;
        CheckableImageButton checkableImageButton = o65.x;
        checkableImageButton.setOnClickListener(onClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o65 o65 = this.c;
        o65.A0 = onLongClickListener;
        CheckableImageButton checkableImageButton = o65.x;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o65 o65 = this.c;
        o65.z0 = scaleType;
        o65.x.setScaleType(scaleType);
        o65.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o65 o65 = this.c;
        if (o65.w0 != colorStateList) {
            o65.w0 = colorStateList;
            hd8.c(o65.a, o65.x, colorStateList, o65.x0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o65 o65 = this.c;
        if (o65.x0 != mode) {
            o65.x0 = mode;
            hd8.c(o65.a, o65.x, o65.w0, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        bf7 bf7 = this.v0;
        if (!bf7.q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            bf7.c();
            bf7.p = charSequence;
            bf7.r.setText(charSequence);
            int i = bf7.n;
            if (i != 1) {
                bf7.o = 1;
            }
            bf7.i(i, bf7.o, bf7.h(bf7.r, charSequence));
            return;
        }
        bf7.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        bf7 bf7 = this.v0;
        bf7.t = i;
        AppCompatTextView appCompatTextView = bf7.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = gag.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        bf7 bf7 = this.v0;
        bf7.s = charSequence;
        AppCompatTextView appCompatTextView = bf7.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        bf7 bf7 = this.v0;
        if (bf7.q != z2) {
            bf7.c();
            TextInputLayout textInputLayout = bf7.h;
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(bf7.g, (AttributeSet) null);
                bf7.r = appCompatTextView;
                appCompatTextView.setId(agc.textinput_error);
                bf7.r.setTextAlignment(5);
                Typeface typeface = bf7.B;
                if (typeface != null) {
                    bf7.r.setTypeface(typeface);
                }
                int i = bf7.u;
                bf7.u = i;
                AppCompatTextView appCompatTextView2 = bf7.r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i);
                }
                ColorStateList colorStateList = bf7.v;
                bf7.v = colorStateList;
                AppCompatTextView appCompatTextView3 = bf7.r;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = bf7.s;
                bf7.s = charSequence;
                AppCompatTextView appCompatTextView4 = bf7.r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i2 = bf7.t;
                bf7.t = i2;
                AppCompatTextView appCompatTextView5 = bf7.r;
                if (appCompatTextView5 != null) {
                    WeakHashMap weakHashMap = gag.a;
                    appCompatTextView5.setAccessibilityLiveRegion(i2);
                }
                bf7.r.setVisibility(4);
                bf7.a(bf7.r, 0);
            } else {
                bf7.f();
                bf7.g(bf7.r, 0);
                bf7.r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            bf7.q = z2;
        }
    }

    public void setErrorIconDrawable(int i) {
        o65 o65 = this.c;
        o65.i(i != 0 ? iq.D(o65.getContext(), i) : null);
        hd8.R(o65.a, o65.c, o65.o);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o65 o65 = this.c;
        CheckableImageButton checkableImageButton = o65.c;
        View.OnLongClickListener onLongClickListener = o65.w;
        checkableImageButton.setOnClickListener(onClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o65 o65 = this.c;
        o65.w = onLongClickListener;
        CheckableImageButton checkableImageButton = o65.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o65 o65 = this.c;
        if (o65.o != colorStateList) {
            o65.o = colorStateList;
            hd8.c(o65.a, o65.c, colorStateList, o65.v);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o65 o65 = this.c;
        if (o65.v != mode) {
            o65.v = mode;
            hd8.c(o65.a, o65.c, o65.o, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        bf7 bf7 = this.v0;
        bf7.u = i;
        AppCompatTextView appCompatTextView = bf7.r;
        if (appCompatTextView != null) {
            bf7.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        bf7 bf7 = this.v0;
        bf7.v = colorStateList;
        AppCompatTextView appCompatTextView = bf7.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.F1 != z2) {
            this.F1 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        bf7 bf7 = this.v0;
        if (!isEmpty) {
            if (!bf7.x) {
                setHelperTextEnabled(true);
            }
            bf7.c();
            bf7.w = charSequence;
            bf7.y.setText(charSequence);
            int i = bf7.n;
            if (i != 2) {
                bf7.o = 2;
            }
            bf7.i(i, bf7.o, bf7.h(bf7.y, charSequence));
        } else if (bf7.x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        bf7 bf7 = this.v0;
        bf7.A = colorStateList;
        AppCompatTextView appCompatTextView = bf7.y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        bf7 bf7 = this.v0;
        if (bf7.x != z2) {
            bf7.c();
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(bf7.g, (AttributeSet) null);
                bf7.y = appCompatTextView;
                appCompatTextView.setId(agc.textinput_helper_text);
                bf7.y.setTextAlignment(5);
                Typeface typeface = bf7.B;
                if (typeface != null) {
                    bf7.y.setTypeface(typeface);
                }
                bf7.y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = bf7.y;
                WeakHashMap weakHashMap = gag.a;
                appCompatTextView2.setAccessibilityLiveRegion(1);
                int i = bf7.z;
                bf7.z = i;
                AppCompatTextView appCompatTextView3 = bf7.y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i);
                }
                ColorStateList colorStateList = bf7.A;
                bf7.A = colorStateList;
                AppCompatTextView appCompatTextView4 = bf7.y;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                bf7.a(bf7.y, 1);
                bf7.y.setAccessibilityDelegate(new af7(0, bf7));
            } else {
                bf7.c();
                int i2 = bf7.n;
                if (i2 == 2) {
                    bf7.o = 0;
                }
                bf7.i(i2, bf7.o, bf7.h(bf7.y, ""));
                bf7.g(bf7.y, 1);
                bf7.y = null;
                TextInputLayout textInputLayout = bf7.h;
                textInputLayout.r();
                textInputLayout.x();
            }
            bf7.x = z2;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        bf7 bf7 = this.v0;
        bf7.z = i;
        AppCompatTextView appCompatTextView = bf7.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.O0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.G1 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.O0) {
            this.O0 = z2;
            if (!z2) {
                this.Q0 = false;
                if (!TextUtils.isEmpty(this.P0) && TextUtils.isEmpty(this.o.getHint())) {
                    this.o.setHint(this.P0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.P0)) {
                        setHint(hint);
                    }
                    this.o.setHint((CharSequence) null);
                }
                this.Q0 = true;
            }
            if (this.o != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        e53 e53 = this.E1;
        e53.k(i);
        this.s1 = e53.o;
        if (this.o != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.s1 != colorStateList) {
            if (this.r1 == null) {
                e53 e53 = this.E1;
                if (e53.o != colorStateList) {
                    e53.o = colorStateList;
                    e53.i(false);
                }
            }
            this.s1 = colorStateList;
            if (this.o != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(qff qff) {
        this.z0 = qff;
    }

    public void setMaxEms(int i) {
        this.x = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.z = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.w = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.y = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        o65 o65 = this.c;
        o65.x.setContentDescription(i != 0 ? o65.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        o65 o65 = this.c;
        o65.x.setImageDrawable(i != 0 ? iq.D(o65.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        o65 o65 = this.c;
        if (z2 && o65.z != 1) {
            o65.g(1);
        } else if (!z2) {
            o65.g(0);
        } else {
            o65.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o65 o65 = this.c;
        o65.w0 = colorStateList;
        hd8.c(o65.a, o65.x, colorStateList, o65.x0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o65 o65 = this.c;
        o65.x0 = mode;
        hd8.c(o65.a, o65.x, o65.w0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.F0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.F0 = appCompatTextView;
            appCompatTextView.setId(agc.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.F0;
            WeakHashMap weakHashMap = gag.a;
            appCompatTextView2.setImportantForAccessibility(2);
            gg5 d = d();
            this.I0 = d;
            d.b = 67;
            this.J0 = d();
            setPlaceholderTextAppearance(this.H0);
            setPlaceholderTextColor(this.G0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.E0) {
                setPlaceholderTextEnabled(true);
            }
            this.D0 = charSequence;
        }
        EditText editText = this.o;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.H0 = i;
        AppCompatTextView appCompatTextView = this.F0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            AppCompatTextView appCompatTextView = this.F0;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        vke vke = this.b;
        vke.getClass();
        vke.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vke.b.setText(charSequence);
        vke.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(j4e j4e) {
        bh8 bh8 = this.R0;
        if (bh8 != null && bh8.a.a != j4e) {
            this.X0 = j4e;
            b();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.b.o.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? iq.D(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        vke vke = this.b;
        if (i < 0) {
            vke.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i != vke.x) {
            vke.x = i;
            CheckableImageButton checkableImageButton = vke.o;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        vke vke = this.b;
        View.OnLongClickListener onLongClickListener = vke.z;
        CheckableImageButton checkableImageButton = vke.o;
        checkableImageButton.setOnClickListener(onClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        vke vke = this.b;
        vke.z = onLongClickListener;
        CheckableImageButton checkableImageButton = vke.o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hd8.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        vke vke = this.b;
        vke.y = scaleType;
        vke.o.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        vke vke = this.b;
        if (vke.v != colorStateList) {
            vke.v = colorStateList;
            hd8.c(vke.a, vke.o, colorStateList, vke.w);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        vke vke = this.b;
        if (vke.w != mode) {
            vke.w = mode;
            hd8.c(vke.a, vke.o, vke.v, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        o65 o65 = this.c;
        o65.getClass();
        o65.B0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o65.C0.setText(charSequence);
        o65.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.C0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.C0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(pff pff) {
        EditText editText = this.o;
        if (editText != null) {
            gag.j(editText, pff);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.k1) {
            this.k1 = typeface;
            e53 e53 = this.E1;
            boolean m = e53.m(typeface);
            boolean o2 = e53.o(typeface);
            if (m || o2) {
                e53.i(false);
            }
            bf7 bf7 = this.v0;
            if (typeface != bf7.B) {
                bf7.B = typeface;
                AppCompatTextView appCompatTextView = bf7.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = bf7.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.A0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.a1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.o;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.o;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.r1;
        e53 e53 = this.E1;
        if (colorStateList2 != null) {
            e53.j(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.r1;
            e53.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.B1) : this.B1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.v0.r;
            e53.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.y0 && (appCompatTextView = this.A0) != null) {
            e53.j(appCompatTextView.getTextColors());
        } else if (!(!z5 || (colorStateList = this.s1) == null || e53.o == colorStateList)) {
            e53.o = colorStateList;
            e53.i(false);
        }
        o65 o65 = this.c;
        vke vke = this.b;
        if (z4 || !this.F1 || (isEnabled() && z5)) {
            if (z3 || this.D1) {
                ValueAnimator valueAnimator = this.H1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.H1.cancel();
                }
                if (!z2 || !this.G1) {
                    e53.p(1.0f);
                } else {
                    a(1.0f);
                }
                this.D1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.o;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                vke.v0 = false;
                vke.e();
                o65.D0 = false;
                o65.n();
            }
        } else if (z3 || !this.D1) {
            ValueAnimator valueAnimator2 = this.H1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.H1.cancel();
            }
            if (!z2 || !this.G1) {
                e53.p(c44.DEFAULT_ASPECT_RATIO);
            } else {
                a(c44.DEFAULT_ASPECT_RATIO);
            }
            if (e() && (!((m54) this.R0).H0.v.isEmpty()) && e()) {
                ((m54) this.R0).r(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            }
            this.D1 = true;
            AppCompatTextView appCompatTextView3 = this.F0;
            if (appCompatTextView3 != null && this.E0) {
                appCompatTextView3.setText((CharSequence) null);
                esf.a(this.a, this.J0);
                this.F0.setVisibility(4);
            }
            vke.v0 = true;
            vke.e();
            o65.D0 = true;
            o65.n();
        }
    }

    public final void v(Editable editable) {
        ((dre) this.z0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.D1) {
            AppCompatTextView appCompatTextView = this.F0;
            if (appCompatTextView != null && this.E0) {
                appCompatTextView.setText((CharSequence) null);
                esf.a(frameLayout, this.J0);
                this.F0.setVisibility(4);
            }
        } else if (this.F0 != null && this.E0 && !TextUtils.isEmpty(this.D0)) {
            this.F0.setText(this.D0);
            esf.a(frameLayout, this.I0);
            this.F0.setVisibility(0);
            this.F0.bringToFront();
            announceForAccessibility(this.D0);
        }
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.w1.getDefaultColor();
        int colorForState = this.w1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.w1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.f1 = colorForState2;
        } else if (z3) {
            this.f1 = colorForState;
        } else {
            this.f1 = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r7 = this;
            bh8 r0 = r7.R0
            if (r0 == 0) goto L_0x0128
            int r0 = r7.a1
            if (r0 != 0) goto L_0x000a
            goto L_0x0128
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.o
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r7.o
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r7.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r7.B1
            r7.f1 = r3
            goto L_0x007a
        L_0x003c:
            boolean r3 = r7.m()
            if (r3 == 0) goto L_0x0051
            android.content.res.ColorStateList r3 = r7.w1
            if (r3 == 0) goto L_0x004a
            r7.w(r0, r1)
            goto L_0x007a
        L_0x004a:
            int r3 = r7.getErrorCurrentTextColors()
            r7.f1 = r3
            goto L_0x007a
        L_0x0051:
            boolean r3 = r7.y0
            if (r3 == 0) goto L_0x0068
            androidx.appcompat.widget.AppCompatTextView r3 = r7.A0
            if (r3 == 0) goto L_0x0068
            android.content.res.ColorStateList r4 = r7.w1
            if (r4 == 0) goto L_0x0061
            r7.w(r0, r1)
            goto L_0x007a
        L_0x0061:
            int r3 = r3.getCurrentTextColor()
            r7.f1 = r3
            goto L_0x007a
        L_0x0068:
            if (r0 == 0) goto L_0x006f
            int r3 = r7.v1
            r7.f1 = r3
            goto L_0x007a
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            int r3 = r7.u1
            r7.f1 = r3
            goto L_0x007a
        L_0x0076:
            int r3 = r7.t1
            r7.f1 = r3
        L_0x007a:
            r7.p()
            o65 r3 = r7.c
            r3.l()
            com.google.android.material.internal.CheckableImageButton r4 = r3.c
            android.content.res.ColorStateList r5 = r3.o
            com.google.android.material.textfield.TextInputLayout r6 = r3.a
            defpackage.hd8.R(r6, r4, r5)
            android.content.res.ColorStateList r4 = r3.w0
            com.google.android.material.internal.CheckableImageButton r5 = r3.x
            defpackage.hd8.R(r6, r5, r4)
            p65 r4 = r3.b()
            boolean r4 = r4 instanceof defpackage.kx4
            if (r4 == 0) goto L_0x00c0
            boolean r4 = r6.m()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            defpackage.ru4.g(r3, r4)
            r5.setImageDrawable(r3)
            goto L_0x00c0
        L_0x00b9:
            android.content.res.ColorStateList r4 = r3.w0
            android.graphics.PorterDuff$Mode r3 = r3.x0
            defpackage.hd8.c(r6, r5, r4, r3)
        L_0x00c0:
            vke r3 = r7.b
            com.google.android.material.internal.CheckableImageButton r4 = r3.o
            android.content.res.ColorStateList r5 = r3.v
            com.google.android.material.textfield.TextInputLayout r3 = r3.a
            defpackage.hd8.R(r3, r4, r5)
            int r3 = r7.a1
            r4 = 2
            if (r3 != r4) goto L_0x0102
            int r3 = r7.c1
            if (r0 == 0) goto L_0x00df
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x00df
            int r4 = r7.e1
            r7.c1 = r4
            goto L_0x00e3
        L_0x00df:
            int r4 = r7.d1
            r7.c1 = r4
        L_0x00e3:
            int r4 = r7.c1
            if (r4 == r3) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x0102
            boolean r3 = r7.D1
            if (r3 != 0) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x00ff
            bh8 r3 = r7.R0
            m54 r3 = (defpackage.m54) r3
            r4 = 0
            r3.r(r4, r4, r4, r4)
        L_0x00ff:
            r7.j()
        L_0x0102:
            int r3 = r7.a1
            if (r3 != r2) goto L_0x0125
            boolean r2 = r7.isEnabled()
            if (r2 != 0) goto L_0x0111
            int r0 = r7.y1
            r7.g1 = r0
            goto L_0x0125
        L_0x0111:
            if (r1 == 0) goto L_0x011a
            if (r0 != 0) goto L_0x011a
            int r0 = r7.A1
            r7.g1 = r0
            goto L_0x0125
        L_0x011a:
            if (r0 == 0) goto L_0x0121
            int r0 = r7.z1
            r7.g1 = r0
            goto L_0x0125
        L_0x0121:
            int r0 = r7.x1
            r7.g1 = r0
        L_0x0125:
            r7.b()
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.x.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.x.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.x;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o65 o65 = this.c;
        CheckableImageButton checkableImageButton = o65.x;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = o65.w0;
            PorterDuff.Mode mode = o65.x0;
            TextInputLayout textInputLayout = o65.a;
            hd8.c(textInputLayout, checkableImageButton, colorStateList, mode);
            hd8.R(textInputLayout, checkableImageButton, o65.w0);
        }
    }
}
