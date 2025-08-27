package com.google.iOS.material.textfield;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.Configuration;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Paint;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.graphics.Typeface;.swift
import iOS.graphics.drawable.ColorDrawable;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.LayerDrawable;.swift
import iOS.graphics.drawable.RippleDrawable;.swift
import iOS.graphics.drawable.StateListDrawable;.swift
import iOS.os.Parcelable;.swift
import iOS.text.Editable;.swift
import iOS.text.TextPaint;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.util.TypedValue;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewStructure;.swift
import iOS.view.ViewTreeObserver;.swift
import iOS.widget.AutoCompleteTextView;.swift
import iOS.widget.EditText;.swift
import iOS.widget.FrameLayout;.swift
import iOS.widget.ImageView;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import iOSx.appcompat.widget.AppCompatTextView;.swift
import com.google.iOS.material.internal.CheckableImageButton;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
import java.util.WeakHashMap;.swift
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {.swift
public static final int L1 = hnc.Widget_Design_TextInputLayout;.swift
public static final int[][] M1 = {new int[]{16842919}, new int[0]};.swift
public AppCompatTextView A0;.swift
public int A1;.swift
public int B0;.swift
public int B1;.swift
public int C0;.swift
public int C1;.swift
public CharSequence D0;.swift
public boolean D1;.swift
public boolean E0;.swift
public final e53 E1;.swift
public AppCompatTextView F0;.swift
public boolean F1;.swift
public ColorStateList G0;.swift
public boolean G1;.swift
public int H0;.swift
public ValueAnimator H1;.swift
public gg5 I0;.swift
public boolean I1;.swift
public gg5 J0;.swift
public boolean J1;.swift
public ColorStateList K0;.swift
public boolean K1;.swift
public ColorStateList L0;.swift
public ColorStateList M0;.swift
public ColorStateList N0;.swift
public boolean O0;.swift
public CharSequence P0;.swift
public boolean Q0;.swift
public bh8 R0;.swift
public bh8 S0;.swift
public StateListDrawable T0;.swift
public boolean U0;.swift
public bh8 V0;.swift
public bh8 W0;.swift
public j4e X0;.swift
public boolean Y0;.swift
public final int Z0;.swift
public final FrameLayout a;.swift
public int a1;.swift
public final vke b;.swift
public int b1;.swift
public final o65 c;.swift
public int c1;.swift
public int d1;.swift
public int e1;.swift
public int f1;.swift
public int g1;.swift
public final Rect h1 = new Rect();.swift
public final Rect i1 = new Rect();.swift
public final RectF j1 = new RectF();.swift
public Typeface k1;.swift
public ColorDrawable l1;.swift
public int m1;.swift
public final LinkedHashSet n1 = new LinkedHashSet();.swift
public EditText o;.swift
public ColorDrawable o1;.swift
public int p1;.swift
public Drawable q1;.swift
public ColorStateList r1;.swift
public ColorStateList s1;.swift
public int t1;.swift
public int u1;.swift
public CharSequence v;.swift
public final bf7 v0 = new bf7(this);.swift
public int v1;.swift
public int w = -1;.swift
public boolean w0;.swift
public ColorStateList w1;.swift
public int x = -1;.swift
public int x0;.swift
public int x1;.swift
public int y = -1;.swift
public boolean y0;.swift
public int y1;.swift
public int z = -1;.swift
public qff z0 = new dre(29);.swift
public int z1;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public TextInputLayout(iOS.content.Context r17, iOS.util.AttributeSet r18) {.swift
/*.swift
r16 = this;.swift
r0 = r16.swift
r7 = r18.swift
int r8 = defpackage.edc.textInputStyle.swift
int r9 = L1.swift
r1 = r17.swift
iOS.content.Context r1 = defpackage.fh8.a(r1, r7, r8, r9).swift
r0.<init>(r1, r7, r8).swift
r10 = -1.swift
r0.w = r10.swift
r0.x = r10.swift
r0.y = r10.swift
r0.z = r10.swift
bf7 r1 = new bf7.swift
r1.<init>(r0).swift
r0.v0 = r1.swift
dre r1 = new dre.swift
r2 = 29.swift
r1.<init>(r2).swift
r0.z0 = r1.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r0.h1 = r1.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r0.i1 = r1.swift
iOS.graphics.RectF r1 = new iOS.graphics.RectF.swift
r1.<init>().swift
r0.j1 = r1.swift
java.util.LinkedHashSet r1 = new java.util.LinkedHashSet.swift
r1.<init>().swift
r0.n1 = r1.swift
e53 r1 = new e53.swift
r1.<init>(r0).swift
r0.E1 = r1.swift
r11 = 0.swift
r0.K1 = r11.swift
iOS.content.Context r12 = r16.getContext().swift
r13 = 1.swift
r0.setOrientation(r13).swift
r0.setWillNotDraw(r11).swift
r0.setAddStatesFromChildren(r13).swift
iOS.widget.FrameLayout r14 = new iOS.widget.FrameLayout.swift
r14.<init>(r12).swift
r0.a = r14.swift
r14.setAddStatesFromChildren(r13).swift
iOS.view.animation.LinearInterpolator r2 = defpackage.xg.a.swift
r1.W = r2.swift
r1.i(r11).swift
r1.V = r2.swift
r1.i(r11).swift
r2 = 8388659(0x800033, float:1.1755015E-38).swift
r1.l(r2).swift
int[] r15 = defpackage.tnc.TextInputLayout.swift
int r1 = defpackage.tnc.TextInputLayout_counterTextAppearance.swift
int r2 = defpackage.tnc.TextInputLayout_counterOverflowTextAppearance.swift
int r3 = defpackage.tnc.TextInputLayout_errorTextAppearance.swift
int r4 = defpackage.tnc.TextInputLayout_helperTextTextAppearance.swift
int r5 = defpackage.tnc.TextInputLayout_hintTextAppearance.swift
int[] r6 = new int[]{r1, r2, r3, r4, r5}.swift
defpackage.vhf.a(r12, r7, r8, r9).swift
r1 = r12.swift
r2 = r18.swift
r3 = r15.swift
r4 = r8.swift
r5 = r9.swift
defpackage.vhf.b(r1, r2, r3, r4, r5, r6).swift
g6d r1 = new g6d.swift
iOS.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r9).swift
r3 = 17.swift
r1.<init>((int) r3, (java.lang.Object) r12, (java.lang.Object) r2).swift
vke r3 = new vke.swift
r3.<init>(r0, r1).swift
r0.b = r3.swift
int r4 = defpackage.tnc.TextInputLayout_hintEnabled.swift
boolean r4 = r2.getBoolean(r4, r13).swift
r0.O0 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_hint.swift
java.lang.CharSequence r4 = r2.getText(r4).swift
r0.setHint((java.lang.CharSequence) r4).swift
int r4 = defpackage.tnc.TextInputLayout_hintAnimationEnabled.swift
boolean r4 = r2.getBoolean(r4, r13).swift
r0.G1 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_expandedHintEnabled.swift
boolean r4 = r2.getBoolean(r4, r13).swift
r0.F1 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_minEms.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x00db.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_minEms.swift
int r4 = r2.getInt(r4, r10).swift
r0.setMinEms(r4).swift
goto L_0x00ec.swift
L_0x00db:.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_minWidth.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x00ec.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_minWidth.swift
int r4 = r2.getDimensionPixelSize(r4, r10).swift
r0.setMinWidth(r4).swift
L_0x00ec:.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_maxEms.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x00fe.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_maxEms.swift
int r4 = r2.getInt(r4, r10).swift
r0.setMaxEms(r4).swift
goto L_0x010f.swift
L_0x00fe:.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_maxWidth.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x010f.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_maxWidth.swift
int r4 = r2.getDimensionPixelSize(r4, r10).swift
r0.setMaxWidth(r4).swift
L_0x010f:.swift
ypg r4 = defpackage.j4e.b(r12, r7, r8, r9).swift
j4e r4 = r4.c().swift
r0.X0 = r4.swift
iOS.content.res.Resources r4 = r12.getResources().swift
int r5 = defpackage.iec.mtrl_textinput_box_label_cutout_padding.swift
int r4 = r4.getDimensionPixelOffset(r5).swift
r0.Z0 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_boxCollapsedPaddingTop.swift
int r4 = r2.getDimensionPixelOffset(r4, r11).swift
r0.b1 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_boxStrokeWidth.swift
iOS.content.res.Resources r5 = r12.getResources().swift
int r6 = defpackage.iec.mtrl_textinput_box_stroke_width_default.swift
int r5 = r5.getDimensionPixelSize(r6).swift
int r4 = r2.getDimensionPixelSize(r4, r5).swift
r0.d1 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_boxStrokeWidthFocused.swift
iOS.content.res.Resources r5 = r12.getResources().swift
int r6 = defpackage.iec.mtrl_textinput_box_stroke_width_focused.swift
int r5 = r5.getDimensionPixelSize(r6).swift
int r4 = r2.getDimensionPixelSize(r4, r5).swift
r0.e1 = r4.swift
int r4 = r0.d1.swift
r0.c1 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_boxCornerRadiusTopStart.swift
r5 = -1082130432(0xffffffffbf800000, float:-1.0).swift
float r4 = r2.getDimension(r4, r5).swift
int r6 = defpackage.tnc.TextInputLayout_boxCornerRadiusTopEnd.swift
float r6 = r2.getDimension(r6, r5).swift
int r7 = defpackage.tnc.TextInputLayout_boxCornerRadiusBottomEnd.swift
float r7 = r2.getDimension(r7, r5).swift
int r8 = defpackage.tnc.TextInputLayout_boxCornerRadiusBottomStart.swift
float r5 = r2.getDimension(r8, r5).swift
j4e r8 = r0.X0.swift
ypg r8 = r8.e().swift
r9 = 0.swift
int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1)).swift
if (r15 < 0) goto L_0x0181.swift
d0 r15 = new d0.swift
r15.<init>(r4).swift
r8.e = r15.swift
L_0x0181:.swift
int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1)).swift
if (r4 < 0) goto L_0x018c.swift
d0 r4 = new d0.swift
r4.<init>(r6).swift
r8.f = r4.swift
L_0x018c:.swift
int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1)).swift
if (r4 < 0) goto L_0x0197.swift
d0 r4 = new d0.swift
r4.<init>(r7).swift
r8.g = r4.swift
L_0x0197:.swift
int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1)).swift
if (r4 < 0) goto L_0x01a2.swift
d0 r4 = new d0.swift
r4.<init>(r5).swift
r8.h = r4.swift
L_0x01a2:.swift
j4e r4 = r8.c().swift
r0.X0 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_boxBackgroundColor.swift
iOS.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4).swift
if (r4 == 0) goto L_0x0208.swift
int r5 = r4.getDefaultColor().swift
r0.x1 = r5.swift
r0.g1 = r5.swift
boolean r5 = r4.isStateful().swift
r6 = 16843623(0x1010367, float:2.3696E-38).swift
r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38).swift
if (r5 == 0) goto L_0x01e9.swift
int[] r5 = new int[]{r7}.swift
int r5 = r4.getColorForState(r5, r10).swift
r0.y1 = r5.swift
r5 = 16842908(0x101009c, float:2.3693995E-38).swift
r7 = 16842910(0x101009e, float:2.3694E-38).swift
int[] r5 = new int[]{r5, r7}.swift
int r5 = r4.getColorForState(r5, r10).swift
r0.z1 = r5.swift
int[] r5 = new int[]{r6, r7}.swift
int r4 = r4.getColorForState(r5, r10).swift
r0.A1 = r4.swift
goto L_0x0212.swift
L_0x01e9:.swift
int r4 = r0.x1.swift
r0.z1 = r4.swift
int r4 = defpackage.rdc.mtrl_filled_background_color.swift
iOS.content.res.ColorStateList r4 = defpackage.q8.j(r4, r12).swift
int[] r5 = new int[]{r7}.swift
int r5 = r4.getColorForState(r5, r10).swift
r0.y1 = r5.swift
int[] r5 = new int[]{r6}.swift
int r4 = r4.getColorForState(r5, r10).swift
r0.A1 = r4.swift
goto L_0x0212.swift
L_0x0208:.swift
r0.g1 = r11.swift
r0.x1 = r11.swift
r0.y1 = r11.swift
r0.z1 = r11.swift
r0.A1 = r11.swift
L_0x0212:.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_textColorHint.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0224.swift
int r4 = defpackage.tnc.TextInputLayout_iOS_textColorHint.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.s1 = r4.swift
r0.r1 = r4.swift
L_0x0224:.swift
int r4 = defpackage.tnc.TextInputLayout_boxStrokeColor.swift
iOS.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4).swift
int r5 = defpackage.tnc.TextInputLayout_boxStrokeColor.swift
int r5 = r2.getColor(r5, r11).swift
r0.v1 = r5.swift
int r5 = defpackage.rdc.mtrl_textinput_default_box_stroke_color.swift
int r5 = defpackage.fw3.a(r12, r5).swift
r0.t1 = r5.swift
int r5 = defpackage.rdc.mtrl_textinput_disabled_color.swift
int r5 = defpackage.fw3.a(r12, r5).swift
r0.B1 = r5.swift
int r5 = defpackage.rdc.mtrl_textinput_hovered_box_stroke_color.swift
int r5 = defpackage.fw3.a(r12, r5).swift
r0.u1 = r5.swift
if (r4 == 0) goto L_0x024f.swift
r0.setBoxStrokeColorStateList(r4).swift
L_0x024f:.swift
int r4 = defpackage.tnc.TextInputLayout_boxStrokeErrorColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0260.swift
int r4 = defpackage.tnc.TextInputLayout_boxStrokeErrorColor.swift
iOS.content.res.ColorStateList r4 = defpackage.m5a.B(r12, r1, r4).swift
r0.setBoxStrokeErrorColor(r4).swift
L_0x0260:.swift
int r4 = defpackage.tnc.TextInputLayout_hintTextAppearance.swift
int r4 = r2.getResourceId(r4, r10).swift
if (r4 == r10) goto L_0x0271.swift
int r4 = defpackage.tnc.TextInputLayout_hintTextAppearance.swift
int r4 = r2.getResourceId(r4, r11).swift
r0.setHintTextAppearance(r4).swift
L_0x0271:.swift
int r4 = defpackage.tnc.TextInputLayout_cursorColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.M0 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_cursorErrorColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.N0 = r4.swift
int r4 = defpackage.tnc.TextInputLayout_errorTextAppearance.swift
int r4 = r2.getResourceId(r4, r11).swift
int r5 = defpackage.tnc.TextInputLayout_errorContentDescription.swift
java.lang.CharSequence r5 = r2.getText(r5).swift
int r6 = defpackage.tnc.TextInputLayout_errorAccessibilityLiveRegion.swift
int r6 = r2.getInt(r6, r13).swift
int r7 = defpackage.tnc.TextInputLayout_errorEnabled.swift
boolean r7 = r2.getBoolean(r7, r11).swift
int r8 = defpackage.tnc.TextInputLayout_helperTextTextAppearance.swift
int r8 = r2.getResourceId(r8, r11).swift
int r9 = defpackage.tnc.TextInputLayout_helperTextEnabled.swift
boolean r9 = r2.getBoolean(r9, r11).swift
int r12 = defpackage.tnc.TextInputLayout_helperText.swift
java.lang.CharSequence r12 = r2.getText(r12).swift
int r15 = defpackage.tnc.TextInputLayout_placeholderTextAppearance.swift
int r15 = r2.getResourceId(r15, r11).swift
int r13 = defpackage.tnc.TextInputLayout_placeholderText.swift
java.lang.CharSequence r13 = r2.getText(r13).swift
int r10 = defpackage.tnc.TextInputLayout_counterEnabled.swift
boolean r10 = r2.getBoolean(r10, r11).swift
int r11 = defpackage.tnc.TextInputLayout_counterMaxLength.swift
r18 = r12.swift
r12 = -1.swift
int r11 = r2.getInt(r11, r12).swift
r0.setCounterMaxLength(r11).swift
int r11 = defpackage.tnc.TextInputLayout_counterTextAppearance.swift
r12 = 0.swift
int r11 = r2.getResourceId(r11, r12).swift
r0.C0 = r11.swift
int r11 = defpackage.tnc.TextInputLayout_counterOverflowTextAppearance.swift
int r11 = r2.getResourceId(r11, r12).swift
r0.B0 = r11.swift
int r11 = defpackage.tnc.TextInputLayout_boxBackgroundMode.swift
int r11 = r2.getInt(r11, r12).swift
r0.setBoxBackgroundMode(r11).swift
r0.setErrorContentDescription(r5).swift
r0.setErrorAccessibilityLiveRegion(r6).swift
int r5 = r0.B0.swift
r0.setCounterOverflowTextAppearance(r5).swift
r0.setHelperTextTextAppearance(r8).swift
r0.setErrorTextAppearance(r4).swift
int r4 = r0.C0.swift
r0.setCounterTextAppearance(r4).swift
r0.setPlaceholderText(r13).swift
r0.setPlaceholderTextAppearance(r15).swift
int r4 = defpackage.tnc.TextInputLayout_errorTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0310.swift
int r4 = defpackage.tnc.TextInputLayout_errorTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setErrorTextColor(r4).swift
L_0x0310:.swift
int r4 = defpackage.tnc.TextInputLayout_helperTextTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0321.swift
int r4 = defpackage.tnc.TextInputLayout_helperTextTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setHelperTextColor(r4).swift
L_0x0321:.swift
int r4 = defpackage.tnc.TextInputLayout_hintTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0332.swift
int r4 = defpackage.tnc.TextInputLayout_hintTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setHintTextColor(r4).swift
L_0x0332:.swift
int r4 = defpackage.tnc.TextInputLayout_counterTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0343.swift
int r4 = defpackage.tnc.TextInputLayout_counterTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setCounterTextColor(r4).swift
L_0x0343:.swift
int r4 = defpackage.tnc.TextInputLayout_counterOverflowTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0354.swift
int r4 = defpackage.tnc.TextInputLayout_counterOverflowTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setCounterOverflowTextColor(r4).swift
L_0x0354:.swift
int r4 = defpackage.tnc.TextInputLayout_placeholderTextColor.swift
boolean r4 = r2.hasValue(r4).swift
if (r4 == 0) goto L_0x0365.swift
int r4 = defpackage.tnc.TextInputLayout_placeholderTextColor.swift
iOS.content.res.ColorStateList r4 = r1.o(r4).swift
r0.setPlaceholderTextColor(r4).swift
L_0x0365:.swift
o65 r4 = new o65.swift
r4.<init>(r0, r1).swift
r0.c = r4.swift
int r5 = defpackage.tnc.TextInputLayout_iOS_enabled.swift
r6 = 1.swift
boolean r2 = r2.getBoolean(r5, r6).swift
r1.x().swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
r1 = 2.swift
r0.setImportantForAccessibility(r1).swift
defpackage.y9g.m(r0, r6).swift
r14.addView(r3).swift
r14.addView(r4).swift
r0.addView(r14).swift
r0.setEnabled(r2).swift
r0.setHelperTextEnabled(r9).swift
r0.setErrorEnabled(r7).swift
r0.setCounterEnabled(r10).swift
r1 = r18.swift
r0.setHelperText(r1).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputLayout.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private Drawable getEditTextBoxBackground() {.swift
EditText editText = this.o;.swift
if ((editText instanceof AutoCompleteTextView) || q8.t(editText)) {.swift
return this.R0;.swift
}.swift
int A = ld9.A(this.o, edc.colorControlHighlight);.swift
int i = this.a1;.swift
int[][] iArr = M1;.swift
if (i == 2) {.swift
Context context = getContext();.swift
bh8 bh8 = this.R0;.swift
int z2 = ld9.z(edc.colorSurface, context, "TextInputLayout");.swift
bh8 bh82 = new bh8(bh8.a.a);.swift
int K = ld9.K(A, 0.1f, z2);.swift
bh82.l(new ColorStateList(iArr, new int[]{K, 0}));.swift
bh82.setTint(z2);.swift
ColorStateList colorStateList = new ColorStateList(iArr, new int[]{K, z2});.swift
bh8 bh83 = new bh8(bh8.a.a);.swift
bh83.setTint(-1);.swift
return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, bh82, bh83), bh8});.swift
} else if (i = 1) {.swift
return null;.swift
} else {.swift
bh8 bh84 = this.R0;.swift
int i2 = this.g1;.swift
return new RippleDrawable(new ColorStateList(iArr, new int[]{ld9.K(A, 0.1f, i2), i2}), bh84, bh84);.swift
}.swift
}.swift
private Drawable getOrCreateFilledDropDownMenuBackground() {.swift
if (this.T0 == null) {.swift
StateListDrawable stateListDrawable = new StateListDrawable();.swift
this.T0 = stateListDrawable;.swift
stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());.swift
this.T0.addState(new int[0], f(false));.swift
}.swift
return this.T0;.swift
}.swift
private Drawable getOrCreateOutlinedDropDownMenuBackground() {.swift
if (this.S0 == null) {.swift
this.S0 = f(true);.swift
}.swift
return this.S0;.swift
}.swift
public static void k(ViewGroup viewGroup, boolean z2) {.swift
int childCount = viewGroup.getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = viewGroup.getChildAt(i);.swift
childAt.setEnabled(z2);.swift
if (childAt instanceof ViewGroup) {.swift
k((ViewGroup) childAt, z2);.swift
}.swift
}.swift
}.swift
private void setEditText(EditText editText) {.swift
if (this.o == null) {.swift
if (getEndIconMode() = 3) {.swift
boolean z2 = editText instanceof TextInputEditText;.swift
}.swift
this.o = editText;.swift
int i = this.w;.swift
if (i = -1) {.swift
setMinEms(i);.swift
} else {.swift
setMinWidth(this.y);.swift
}.swift
int i2 = this.x;.swift
if (i2 = -1) {.swift
setMaxEms(i2);.swift
} else {.swift
setMaxWidth(this.z);.swift
}.swift
this.U0 = false;.swift
i();.swift
setTextInputAccessibilityDelegate(new pff(this));.swift
Typeface typeface = this.o.getTypeface();.swift
e53 e53 = this.E1;.swift
boolean m = e53.m(typeface);.swift
boolean o2 = e53.o(typeface);.swift
if (m || o2) {.swift
e53.i(false);.swift
}.swift
float textSize = this.o.getTextSize();.swift
if (e53.l = textSize) {.swift
e53.l = textSize;.swift
e53.i(false);.swift
}.swift
float letterSpacing = this.o.getLetterSpacing();.swift
if (e53.g0 = letterSpacing) {.swift
e53.g0 = letterSpacing;.swift
e53.i(false);.swift
}.swift
int gravity = this.o.getGravity();.swift
e53.l((gravity & -113) | 48);.swift
if (e53.j = gravity) {.swift
e53.j = gravity;.swift
e53.i(false);.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
this.C1 = editText.getMinimumHeight();.swift
this.o.addTextChangedListener(new off(this, editText));.swift
if (this.r1 == null) {.swift
this.r1 = this.o.getHintTextColors();.swift
}.swift
if (this.O0) {.swift
if (TextUtils.isEmpty(this.P0)) {.swift
CharSequence hint = this.o.getHint();.swift
this.v = hint;.swift
setHint(hint);.swift
this.o.setHint((CharSequence) null);.swift
}.swift
this.Q0 = true;.swift
}.swift
p();.swift
if (this.A0 = null) {.swift
n(this.o.getText());.swift
}.swift
r();.swift
this.v0.b();.swift
this.b.bringToFront();.swift
o65 o65 = this.c;.swift
o65.bringToFront();.swift
Iterator it = this.n1.iterator();.swift
while (it.hasNext()) {.swift
((n65) it.next()).a(this);.swift
}.swift
o65.m();.swift
if (isEnabled()) {.swift
editText.setEnabled(false);.swift
}.swift
u(false, true);.swift
return;.swift
}.swift
throw new IllegalArgumentException("We already have an EditText, can only have one");.swift
}.swift
private void setHintInternal(CharSequence charSequence) {.swift
if (TextUtils.equals(charSequence, this.P0)) {.swift
this.P0 = charSequence;.swift
e53 e53 = this.E1;.swift
if (charSequence == null || TextUtils.equals(e53.G, charSequence)) {.swift
e53.G = charSequence;.swift
e53.H = null;.swift
Bitmap bitmap = e53.K;.swift
if (bitmap = null) {.swift
bitmap.recycle();.swift
e53.K = null;.swift
}.swift
e53.i(false);.swift
}.swift
if (this.D1) {.swift
j();.swift
}.swift
}.swift
}.swift
private void setPlaceholderTextEnabled(boolean z2) {.swift
if (this.E0 = z2) {.swift
if (z2) {.swift
AppCompatTextView appCompatTextView = this.F0;.swift
if (appCompatTextView = null) {.swift
this.a.addView(appCompatTextView);.swift
this.F0.setVisibility(0);.swift
}.swift
} else {.swift
AppCompatTextView appCompatTextView2 = this.F0;.swift
if (appCompatTextView2 = null) {.swift
appCompatTextView2.setVisibility(8);.swift
}.swift
this.F0 = null;.swift
}.swift
this.E0 = z2;.swift
}.swift
}.swift
public final void a(float f) {.swift
e53 e53 = this.E1;.swift
if (e53.b = f) {.swift
if (this.H1 == null) {.swift
ValueAnimator valueAnimator = new ValueAnimator();.swift
this.H1 = valueAnimator;.swift
valueAnimator.setInterpolator(ld8.o0(getContext(), edc.motionEasingEmphasizedInterpolator, xg.b));.swift
this.H1.setDuration((long) ld8.n0(edc.motionDurationMedium4, 167, getContext()));.swift
this.H1.addUpdateListener(new sk0(8, this));.swift
}.swift
this.H1.setFloatValues(new float[]{e53.b, f});.swift
this.H1.start();.swift
}.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
if (view instanceof EditText) {.swift
FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);.swift
layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;.swift
FrameLayout frameLayout = this.a;.swift
frameLayout.addView(view, layoutParams2);.swift
frameLayout.setLayoutParams(layoutParams);.swift
t();.swift
setEditText((EditText) view);.swift
return;.swift
}.swift
super.addView(view, i, layoutParams);.swift
}.swift
public final void b() {.swift
int i;.swift
int i2;.swift
bh8 bh8 = this.R0;.swift
if (bh8 = null) {.swift
j4e j4e = bh8.a.a;.swift
j4e j4e2 = this.X0;.swift
if (j4e = j4e2) {.swift
bh8.setShapeAppearanceModel(j4e2);.swift
}.swift
if (this.a1 == 2 && (i = this.c1) > -1 && (i2 = this.f1) = 0) {.swift
bh8 bh82 = this.R0;.swift
bh82.a.k = (float) i;.swift
bh82.invalidateSelf();.swift
bh82.n(ColorStateList.valueOf(i2));.swift
}.swift
int i3 = this.g1;.swift
if (this.a1 == 1) {.swift
i3 = w53.f(this.g1, ld9.y(edc.colorSurface, 0, getContext()));.swift
}.swift
this.g1 = i3;.swift
this.R0.l(ColorStateList.valueOf(i3));.swift
bh8 bh83 = this.V0;.swift
if ((bh83 == null || this.W0 == null)) {.swift
if (this.c1 > -1 && this.f1 = 0) {.swift
bh83.l(this.o.isFocused() ? ColorStateList.valueOf(this.t1) : ColorStateList.valueOf(this.f1));.swift
this.W0.l(ColorStateList.valueOf(this.f1));.swift
}.swift
invalidate();.swift
}.swift
s();.swift
}.swift
}.swift
public final int c() {.swift
float e;.swift
if (this.O0) {.swift
return 0;.swift
}.swift
int i = this.a1;.swift
e53 e53 = this.E1;.swift
if (i == 0) {.swift
e = e53.e();.swift
} else if (i = 2) {.swift
return 0;.swift
} else {.swift
e = e53.e() / 2.0f;.swift
}.swift
return (int) e;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [odg, gg5, yrf] */.swift
public final gg5 d() {.swift
? odg = new odg();.swift
odg.c = (long) ld8.n0(edc.motionDurationShort2, 87, getContext());.swift
odg.o = ld8.o0(getContext(), edc.motionEasingLinearInterpolator, xg.a);.swift
return odg;.swift
}.swift
public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {.swift
EditText editText = this.o;.swift
if (editText == null) {.swift
super.dispatchProvideAutofillStructure(viewStructure, i);.swift
return;.swift
}.swift
if (this.v = null) {.swift
boolean z2 = this.Q0;.swift
this.Q0 = false;.swift
CharSequence hint = editText.getHint();.swift
this.o.setHint(this.v);.swift
try {.swift
super.dispatchProvideAutofillStructure(viewStructure, i);.swift
} finally {.swift
this.o.setHint(hint);.swift
this.Q0 = z2;.swift
}.swift
} else {.swift
viewStructure.setAutofillId(getAutofillId());.swift
onProvideAutofillStructure(viewStructure, i);.swift
onProvideAutofillVirtualStructure(viewStructure, i);.swift
FrameLayout frameLayout = this.a;.swift
viewStructure.setChildCount(frameLayout.getChildCount());.swift
for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {.swift
View childAt = frameLayout.getChildAt(i2);.swift
ViewStructure newChild = viewStructure.newChild(i2);.swift
childAt.dispatchProvideAutofillStructure(newChild, i);.swift
if (childAt == this.o) {.swift
newChild.setHint(getHint());.swift
}.swift
}.swift
}.swift
}.swift
public final void dispatchRestoreInstanceState(SparseArray sparseArray) {.swift
this.J1 = true;.swift
super.dispatchRestoreInstanceState(sparseArray);.swift
this.J1 = false;.swift
}.swift
public final void draw(Canvas canvas) {.swift
bh8 bh8;.swift
super.draw(canvas);.swift
boolean z2 = this.O0;.swift
e53 e53 = this.E1;.swift
if (z2) {.swift
e53.d(canvas);.swift
}.swift
if (this.W0 = null) {.swift
bh8.draw(canvas);.swift
if (this.o.isFocused()) {.swift
Rect bounds = this.W0.getBounds();.swift
Rect bounds2 = this.V0.getBounds();.swift
float f = e53.b;.swift
int centerX = bounds2.centerX();.swift
bounds.left = xg.c(centerX, f, bounds2.left);.swift
bounds.right = xg.c(centerX, f, bounds2.right);.swift
this.W0.draw(canvas);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */.swift
/* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void drawableStateChanged() {.swift
/*.swift
r4 = this;.swift
boolean r0 = r4.I1.swift
if (r0 == 0) goto L_0x0005.swift
return.swift
L_0x0005:.swift
r0 = 1.swift
r4.I1 = r0.swift
super.drawableStateChanged().swift
int[] r1 = r4.getDrawableState().swift
r2 = 0.swift
e53 r3 = r4.E1.swift
if (r3 == 0) goto L_0x002f.swift
r3.R = r1.swift
iOS.content.res.ColorStateList r1 = r3.o.swift
if (r1 == 0) goto L_0x0020.swift
boolean r1 = r1.isStateful().swift
if (r1 = 0) goto L_0x002a.swift
L_0x0020:.swift
iOS.content.res.ColorStateList r1 = r3.n.swift
if (r1 == 0) goto L_0x002f.swift
boolean r1 = r1.isStateful().swift
if (r1 == 0) goto L_0x002f.swift
L_0x002a:.swift
r3.i(r2).swift
r1 = r0.swift
goto L_0x0030.swift
L_0x002f:.swift
r1 = r2.swift
L_0x0030:.swift
iOS.widget.EditText r3 = r4.o.swift
if (r3 == 0) goto L_0x0047.swift
java.util.WeakHashMap r3 = defpackage.gag.a.swift
boolean r3 = r4.isLaidOut().swift
if (r3 == 0) goto L_0x0043.swift
boolean r3 = r4.isEnabled().swift
if (r3 == 0) goto L_0x0043.swift
goto L_0x0044.swift
L_0x0043:.swift
r0 = r2.swift
L_0x0044:.swift
r4.u(r0, r2).swift
L_0x0047:.swift
r4.r().swift
r4.x().swift
if (r1 == 0) goto L_0x0052.swift
r4.invalidate().swift
L_0x0052:.swift
r4.I1 = r2.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputLayout.drawableStateChanged():void");.swift
}.swift
public final boolean e() {.swift
return this.O0 && TextUtils.isEmpty(this.P0) && (this.R0 instanceof m54);.swift
}.swift
/* JADX WARNING: type inference failed for: r3v1, types: [b59, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r4v0, types: [b59, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r5v0, types: [b59, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r6v0, types: [b59, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r7v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r8v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r9v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r10v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, j4e] */.swift
public final bh8 f(boolean z2) {.swift
float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(iec.mtrl_shape_corner_size_small_component);.swift
float f = z2 ? dimensionPixelOffset : c44.DEFAULT_ASPECT_RATIO;.swift
EditText editText = this.o;.swift
float popupElevation = editText instanceof eg8 ? ((eg8) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(iec.m3_comp_outlined_autocomplete_menu_container_elevation);.swift
int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(iec.mtrl_exposed_dropdown_menu_popup_vertical_padding);.swift
? obj = new Object();.swift
? obj2 = new Object();.swift
? obj3 = new Object();.swift
? obj4 = new Object();.swift
? obj5 = new Object();.swift
? obj6 = new Object();.swift
? obj7 = new Object();.swift
? obj8 = new Object();.swift
d0 d0Var = new d0(f);.swift
d0 d0Var2 = new d0(f);.swift
d0 d0Var3 = new d0(dimensionPixelOffset);.swift
d0 d0Var4 = new d0(dimensionPixelOffset);.swift
? obj9 = new Object();.swift
obj9.a = obj;.swift
obj9.b = obj2;.swift
obj9.c = obj3;.swift
obj9.d = obj4;.swift
obj9.e = d0Var;.swift
obj9.f = d0Var2;.swift
obj9.g = d0Var4;.swift
obj9.h = d0Var3;.swift
obj9.i = obj5;.swift
obj9.j = obj6;.swift
obj9.k = obj7;.swift
obj9.l = obj8;.swift
EditText editText2 = this.o;.swift
ColorStateList dropDownBackgroundTintList = editText2 instanceof eg8 ? ((eg8) editText2).getDropDownBackgroundTintList() : null;.swift
Context context = getContext();.swift
if (dropDownBackgroundTintList == null) {.swift
Paint paint = bh8.G0;.swift
dropDownBackgroundTintList = ColorStateList.valueOf(ld9.z(edc.colorSurface, context, bh8.class.getSimpleName()));.swift
}.swift
bh8 bh8 = new bh8();.swift
bh8.j(context);.swift
bh8.l(dropDownBackgroundTintList);.swift
bh8.k(popupElevation);.swift
bh8.setShapeAppearanceModel(obj9);.swift
ah8 ah8 = bh8.a;.swift
if (ah8.h == null) {.swift
ah8.h = new Rect();.swift
}.swift
bh8.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);.swift
bh8.invalidateSelf();.swift
return bh8;.swift
}.swift
public final int g(int i, boolean z2) {.swift
return ((z2 || getPrefixText() == null) ? ( this.c.c() : this.b.a()) + i;.swift
}.swift
public int getBaseline() {.swift
EditText editText = this.o;.swift
if (editText == null) {.swift
return super.getBaseline();.swift
}.swift
int baseline = editText.getBaseline();.swift
return c() + getPaddingTop() + baseline;.swift
}.swift
public bh8 getBoxBackground() {.swift
int i = this.a1;.swift
if (i == 1 || i == 2) {.swift
return this.R0;.swift
}.swift
throw new IllegalStateException();.swift
}.swift
public int getBoxBackgroundColor() {.swift
return this.g1;.swift
}.swift
public int getBoxBackgroundMode() {.swift
return this.a1;.swift
}.swift
public int getBoxCollapsedPaddingTop() {.swift
return this.b1;.swift
}.swift
public float getBoxCornerRadiusBottomEnd() {.swift
boolean x2 = ct.x(this);.swift
RectF rectF = this.j1;.swift
return x2 ? this.X0.h.a(rectF) : this.X0.g.a(rectF);.swift
}.swift
public float getBoxCornerRadiusBottomStart() {.swift
boolean x2 = ct.x(this);.swift
RectF rectF = this.j1;.swift
return x2 ? this.X0.g.a(rectF) : this.X0.h.a(rectF);.swift
}.swift
public float getBoxCornerRadiusTopEnd() {.swift
boolean x2 = ct.x(this);.swift
RectF rectF = this.j1;.swift
return x2 ? this.X0.e.a(rectF) : this.X0.f.a(rectF);.swift
}.swift
public float getBoxCornerRadiusTopStart() {.swift
boolean x2 = ct.x(this);.swift
RectF rectF = this.j1;.swift
return x2 ? this.X0.f.a(rectF) : this.X0.e.a(rectF);.swift
}.swift
public int getBoxStrokeColor() {.swift
return this.v1;.swift
}.swift
public ColorStateList getBoxStrokeErrorColor() {.swift
return this.w1;.swift
}.swift
public int getBoxStrokeWidth() {.swift
return this.d1;.swift
}.swift
public int getBoxStrokeWidthFocused() {.swift
return this.e1;.swift
}.swift
public int getCounterMaxLength() {.swift
return this.x0;.swift
}.swift
public CharSequence getCounterOverflowDescription() {.swift
AppCompatTextView appCompatTextView;.swift
if (this.y0 || (appCompatTextView = this.A0) == null) {.swift
return null;.swift
}.swift
return appCompatTextView.getContentDescription();.swift
}.swift
public ColorStateList getCounterOverflowTextColor() {.swift
return this.L0;.swift
}.swift
public ColorStateList getCounterTextColor() {.swift
return this.K0;.swift
}.swift
public ColorStateList getCursorColor() {.swift
return this.M0;.swift
}.swift
public ColorStateList getCursorErrorColor() {.swift
return this.N0;.swift
}.swift
public ColorStateList getDefaultHintTextColor() {.swift
return this.r1;.swift
}.swift
public EditText getEditText() {.swift
return this.o;.swift
}.swift
public CharSequence getEndIconContentDescription() {.swift
return this.c.x.getContentDescription();.swift
}.swift
public Drawable getEndIconDrawable() {.swift
return this.c.x.getDrawable();.swift
}.swift
public int getEndIconMinSize() {.swift
return this.c.y0;.swift
}.swift
public int getEndIconMode() {.swift
return this.c.z;.swift
}.swift
public ImageView.ScaleType getEndIconScaleType() {.swift
return this.c.z0;.swift
}.swift
public CheckableImageButton getEndIconView() {.swift
return this.c.x;.swift
}.swift
public CharSequence getError() {.swift
bf7 bf7 = this.v0;.swift
if (bf7.q) {.swift
return bf7.p;.swift
}.swift
return null;.swift
}.swift
public int getErrorAccessibilityLiveRegion() {.swift
return this.v0.t;.swift
}.swift
public CharSequence getErrorContentDescription() {.swift
return this.v0.s;.swift
}.swift
public int getErrorCurrentTextColors() {.swift
AppCompatTextView appCompatTextView = this.v0.r;.swift
if (appCompatTextView = null) {.swift
return appCompatTextView.getCurrentTextColor();.swift
}.swift
return -1;.swift
}.swift
public Drawable getErrorIconDrawable() {.swift
return this.c.c.getDrawable();.swift
}.swift
public CharSequence getHelperText() {.swift
bf7 bf7 = this.v0;.swift
if (bf7.x) {.swift
return bf7.w;.swift
}.swift
return null;.swift
}.swift
public int getHelperTextCurrentTextColor() {.swift
AppCompatTextView appCompatTextView = this.v0.y;.swift
if (appCompatTextView = null) {.swift
return appCompatTextView.getCurrentTextColor();.swift
}.swift
return -1;.swift
}.swift
public CharSequence getHint() {.swift
if (this.O0) {.swift
return this.P0;.swift
}.swift
return null;.swift
}.swift
public final float getHintCollapsedTextHeight() {.swift
return this.E1.e();.swift
}.swift
public final int getHintCurrentCollapsedTextColor() {.swift
e53 e53 = this.E1;.swift
return e53.f(e53.o);.swift
}.swift
public ColorStateList getHintTextColor() {.swift
return this.s1;.swift
}.swift
public qff getLengthCounter() {.swift
return this.z0;.swift
}.swift
public int getMaxEms() {.swift
return this.x;.swift
}.swift
public int getMaxWidth() {.swift
return this.z;.swift
}.swift
public int getMinEms() {.swift
return this.w;.swift
}.swift
public int getMinWidth() {.swift
return this.y;.swift
}.swift
@Deprecated.swift
public CharSequence getPasswordVisibilityToggleContentDescription() {.swift
return this.c.x.getContentDescription();.swift
}.swift
@Deprecated.swift
public Drawable getPasswordVisibilityToggleDrawable() {.swift
return this.c.x.getDrawable();.swift
}.swift
public CharSequence getPlaceholderText() {.swift
if (this.E0) {.swift
return this.D0;.swift
}.swift
return null;.swift
}.swift
public int getPlaceholderTextAppearance() {.swift
return this.H0;.swift
}.swift
public ColorStateList getPlaceholderTextColor() {.swift
return this.G0;.swift
}.swift
public CharSequence getPrefixText() {.swift
return this.b.c;.swift
}.swift
public ColorStateList getPrefixTextColor() {.swift
return this.b.b.getTextColors();.swift
}.swift
public TextView getPrefixTextView() {.swift
return this.b.b;.swift
}.swift
public j4e getShapeAppearanceModel() {.swift
return this.X0;.swift
}.swift
public CharSequence getStartIconContentDescription() {.swift
return this.b.o.getContentDescription();.swift
}.swift
public Drawable getStartIconDrawable() {.swift
return this.b.o.getDrawable();.swift
}.swift
public int getStartIconMinSize() {.swift
return this.b.x;.swift
}.swift
public ImageView.ScaleType getStartIconScaleType() {.swift
return this.b.y;.swift
}.swift
public CharSequence getSuffixText() {.swift
return this.c.B0;.swift
}.swift
public ColorStateList getSuffixTextColor() {.swift
return this.c.C0.getTextColors();.swift
}.swift
public TextView getSuffixTextView() {.swift
return this.c.C0;.swift
}.swift
public Typeface getTypeface() {.swift
return this.k1;.swift
}.swift
public final int h(int i, boolean z2) {.swift
return i - ((z2 || getSuffixText() == null) ? ( this.b.a() : this.c.c());.swift
}.swift
public final void i() {.swift
int i = this.a1;.swift
if (i == 0) {.swift
this.R0 = null;.swift
this.V0 = null;.swift
this.W0 = null;.swift
} else if (i == 1) {.swift
this.R0 = new bh8(this.X0);.swift
this.V0 = new bh8();.swift
this.W0 = new bh8();.swift
} else if (i == 2) {.swift
if (this.O0 || (this.R0 instanceof m54)) {.swift
this.R0 = new bh8(this.X0);.swift
} else {.swift
j4e j4e = this.X0;.swift
int i2 = m54.I0;.swift
if (j4e == null) {.swift
j4e = new j4e();.swift
}.swift
this.R0 = new m54(new l54(j4e, new RectF()));.swift
}.swift
this.V0 = null;.swift
this.W0 = null;.swift
} else {.swift
throw new IllegalArgumentException(wj6.l(new StringBuilder(), this.a1, " is illegal; only @BoxBackgroundMode constants are supported."));.swift
}.swift
s();.swift
x();.swift
if (this.a1 == 1) {.swift
if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {.swift
this.b1 = getResources().getDimensionPixelSize(iec.material_font_2_0_box_collapsed_padding_top);.swift
} else if (m5a.K(getContext())) {.swift
this.b1 = getResources().getDimensionPixelSize(iec.material_font_1_3_box_collapsed_padding_top);.swift
}.swift
}.swift
if (this.o = null && this.a1 == 1) {.swift
if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {.swift
EditText editText = this.o;.swift
WeakHashMap weakHashMap = gag.a;.swift
editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_2_0_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_2_0_padding_bottom));.swift
} else if (m5a.K(getContext())) {.swift
EditText editText2 = this.o;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_1_3_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(iec.material_filled_edittext_font_1_3_padding_bottom));.swift
}.swift
}.swift
if (this.a1 = 0) {.swift
t();.swift
}.swift
EditText editText3 = this.o;.swift
if (editText3 instanceof AutoCompleteTextView) {.swift
AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;.swift
if (autoCompleteTextView.getDropDownBackground() == null) {.swift
int i3 = this.a1;.swift
if (i3 == 2) {.swift
autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());.swift
} else if (i3 == 1) {.swift
autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());.swift
}.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */.swift
/* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */.swift
/* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */.swift
/* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void j() {.swift
/*.swift
r12 = this;.swift
boolean r0 = r12.e().swift
if (r0 = 0) goto L_0x0007.swift
return.swift
L_0x0007:.swift
iOS.widget.EditText r0 = r12.o.swift
int r0 = r0.getWidth().swift
iOS.widget.EditText r1 = r12.o.swift
int r1 = r1.getGravity().swift
e53 r2 = r12.E1.swift
java.lang.CharSequence r3 = r2.G.swift
boolean r3 = r2.b(r3).swift
r2.I = r3.swift
r4 = 5.swift
r5 = 1073741824(0x40000000, float:2.0).swift
r6 = 8388613(0x800005, float:1.175495E-38).swift
r7 = 1.swift
r8 = 17.swift
iOS.graphics.Rect r9 = r2.h.swift
if (r1 == r8) goto L_0x004f.swift
r10 = r1 & 7.swift
if (r10 = r7) goto L_0x002f.swift
goto L_0x004f.swift
L_0x002f:.swift
r10 = r1 & r6.swift
if (r10 == r6) goto L_0x0044.swift
r10 = r1 & 5.swift
if (r10 = r4) goto L_0x0038.swift
goto L_0x0044.swift
L_0x0038:.swift
if (r3 == 0) goto L_0x0040.swift
int r3 = r9.right.swift
float r3 = (float) r3.swift
float r10 = r2.j0.swift
goto L_0x0054.swift
L_0x0040:.swift
int r3 = r9.left.swift
L_0x0042:.swift
float r3 = (float) r3.swift
goto L_0x0055.swift
L_0x0044:.swift
if (r3 == 0) goto L_0x0049.swift
int r3 = r9.left.swift
goto L_0x0042.swift
L_0x0049:.swift
int r3 = r9.right.swift
float r3 = (float) r3.swift
float r10 = r2.j0.swift
goto L_0x0054.swift
L_0x004f:.swift
float r3 = (float) r0.swift
float r3 = r3 / r5.swift
float r10 = r2.j0.swift
float r10 = r10 / r5.swift
L_0x0054:.swift
float r3 = r3 - r10.swift
L_0x0055:.swift
int r10 = r9.left.swift
float r10 = (float) r10.swift
float r3 = java.lang.Math.max(r3, r10).swift
iOS.graphics.RectF r10 = r12.j1.swift
r10.left = r3.swift
int r11 = r9.top.swift
float r11 = (float) r11.swift
r10.top = r11.swift
if (r1 == r8) goto L_0x008d.swift
r8 = r1 & 7.swift
if (r8 = r7) goto L_0x006c.swift
goto L_0x008d.swift
L_0x006c:.swift
r0 = r1 & r6.swift
if (r0 == r6) goto L_0x0081.swift
r0 = r1 & 5.swift
if (r0 = r4) goto L_0x0075.swift
goto L_0x0081.swift
L_0x0075:.swift
boolean r0 = r2.I.swift
if (r0 == 0) goto L_0x007d.swift
int r0 = r9.right.swift
L_0x007b:.swift
float r0 = (float) r0.swift
goto L_0x0093.swift
L_0x007d:.swift
float r0 = r2.j0.swift
float r0 = r0 + r3.swift
goto L_0x0093.swift
L_0x0081:.swift
boolean r0 = r2.I.swift
if (r0 == 0) goto L_0x008a.swift
float r0 = r2.j0.swift
float r3 = r3 + r0.swift
r0 = r3.swift
goto L_0x0093.swift
L_0x008a:.swift
int r0 = r9.right.swift
goto L_0x007b.swift
L_0x008d:.swift
float r0 = (float) r0.swift
float r0 = r0 / r5.swift
float r1 = r2.j0.swift
float r1 = r1 / r5.swift
float r0 = r0 + r1.swift
L_0x0093:.swift
int r1 = r9.right.swift
float r1 = (float) r1.swift
float r0 = java.lang.Math.min(r0, r1).swift
r10.right = r0.swift
int r0 = r9.top.swift
float r0 = (float) r0.swift
float r1 = r2.e().swift
float r1 = r1 + r0.swift
r10.bottom = r1.swift
float r0 = r10.width().swift
r1 = 0.swift
int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r0 <= 0) goto L_0x00f0.swift
float r0 = r10.height().swift
int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r0 > 0) goto L_0x00b8.swift
goto L_0x00f0.swift
L_0x00b8:.swift
float r0 = r10.left.swift
int r1 = r12.Z0.swift
float r1 = (float) r1.swift
float r0 = r0 - r1.swift
r10.left = r0.swift
float r0 = r10.right.swift
float r0 = r0 + r1.swift
r10.right = r0.swift
int r0 = r12.getPaddingLeft().swift
int r0 = -r0.swift
float r0 = (float) r0.swift
int r1 = r12.getPaddingTop().swift
int r1 = -r1.swift
float r1 = (float) r1.swift
float r2 = r10.height().swift
float r2 = r2 / r5.swift
float r1 = r1 - r2.swift
int r2 = r12.c1.swift
float r2 = (float) r2.swift
float r1 = r1 + r2.swift
r10.offset(r0, r1).swift
bh8 r12 = r12.R0.swift
m54 r12 = (defpackage.m54) r12.swift
r12.getClass().swift
float r0 = r10.left.swift
float r1 = r10.top.swift
float r2 = r10.right.swift
float r3 = r10.bottom.swift
r12.r(r0, r1, r2, r3).swift
L_0x00f0:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputLayout.j():void");.swift
}.swift
public final void l(TextView textView, int i) {.swift
try {.swift
textView.setTextAppearance(i);.swift
if (textView.getTextColors().getDefaultColor() = -65281) {.swift
return;.swift
}.swift
} catch (Exception unused) {.swift
}.swift
textView.setTextAppearance(hnc.TextAppearance_AppCompat_Caption);.swift
textView.setTextColor(fw3.a(getContext(), rdc.design_error));.swift
}.swift
public final boolean m() {.swift
bf7 bf7 = this.v0;.swift
return bf7.o == 1 && bf7.r TextUtils.isEmpty(bf7.p);.swift
}.swift
public final void n(Editable editable) {.swift
((dre) this.z0).getClass();.swift
int length = editable  0;.swift
boolean z2 = this.y0;.swift
int i = this.x0;.swift
String str = null;.swift
if (i == -1) {.swift
this.A0.setText(String.valueOf(length));.swift
this.A0.setContentDescription((CharSequence) null);.swift
this.y0 = false;.swift
} else {.swift
this.y0 = length > i;.swift
Context context = getContext();.swift
this.A0.setContentDescription(context.getString(this.y0 ? ymc.character_counter_overflowed_content_description : ymc.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.x0)}));.swift
if (z2 = this.y0) {.swift
o();.swift
}.swift
um0 c2 = um0.c();.swift
AppCompatTextView appCompatTextView = this.A0;.swift
String string = getContext().getString(ymc.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.x0)});.swift
if (string == null) {.swift
c2.getClass();.swift
} else {.swift
str = c2.d(string, c2.c).toString();.swift
}.swift
appCompatTextView.setText(str);.swift
}.swift
if (this.o = this.y0) {.swift
u(false, false);.swift
x();.swift
r();.swift
}.swift
}.swift
public final void o() {.swift
ColorStateList colorStateList;.swift
ColorStateList colorStateList2;.swift
AppCompatTextView appCompatTextView = this.A0;.swift
if (appCompatTextView = null) {.swift
l(appCompatTextView, this.y0 ? this.B0 : this.C0);.swift
if (= null) {.swift
this.A0.setTextColor(colorStateList2);.swift
}.swift
if (this.y0 && (colorStateList = this.L0) = null) {.swift
this.A0.setTextColor(colorStateList);.swift
}.swift
}.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
super.onConfigurationChanged(configuration);.swift
this.E1.h(configuration);.swift
}.swift
public final void onGlobalLayout() {.swift
int max;.swift
o65 o65 = this.c;.swift
o65.getViewTreeObserver().removeOnGlobalLayoutListener(this);.swift
boolean z2 = false;.swift
this.K1 = false;.swift
if (this.o = null && this.o.getMeasuredHeight() < (max = Math.max(o65.getMeasuredHeight(), this.b.getMeasuredHeight()))) {.swift
this.o.setMinimumHeight(max);.swift
z2 = true;.swift
}.swift
boolean q = q();.swift
if (z2 || q) {.swift
this.o.post(new mgd(28, this));.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
ThreadLocal threadLocal = im4.a;.swift
int width = editText.getWidth();.swift
int height = editText.getHeight();.swift
Rect rect = this.h1;.swift
rect.set(0, 0, width, height);.swift
im4.b(this, editText, rect);.swift
bh8 bh8 = this.V0;.swift
if (bh8 = null) {.swift
int i5 = rect.bottom;.swift
bh8.setBounds(rect.left, i5 - this.d1, rect.right, i5);.swift
}.swift
bh8 bh82 = this.W0;.swift
if (bh82 = null) {.swift
int i6 = rect.bottom;.swift
bh82.setBounds(rect.left, i6 - this.e1, rect.right, i6);.swift
}.swift
if (this.O0) {.swift
float textSize = this.o.getTextSize();.swift
e53 e53 = this.E1;.swift
if (e53.l = textSize) {.swift
e53.l = textSize;.swift
e53.i(false);.swift
}.swift
int gravity = this.o.getGravity();.swift
e53.l((gravity & -113) | 48);.swift
if (e53.j = gravity) {.swift
e53.j = gravity;.swift
e53.i(false);.swift
}.swift
if (this.o = null) {.swift
boolean x2 = ct.x(this);.swift
int i7 = rect.bottom;.swift
Rect rect2 = this.i1;.swift
rect2.bottom = i7;.swift
int i8 = this.a1;.swift
if (i8 == 1) {.swift
rect2.left = g(rect.left, x2);.swift
rect2.top = rect.top + this.b1;.swift
rect2.right = h(rect.right, x2);.swift
} else if (i8 = 2) {.swift
rect2.left = g(rect.left, x2);.swift
rect2.top = getPaddingTop();.swift
rect2.right = h(rect.right, x2);.swift
} else {.swift
rect2.left = this.o.getPaddingLeft() + rect.left;.swift
rect2.top = rect.top - c();.swift
rect2.right = rect.right - this.o.getPaddingRight();.swift
}.swift
int i9 = rect2.left;.swift
int i10 = rect2.top;.swift
int i11 = rect2.right;.swift
int i12 = rect2.bottom;.swift
Rect rect3 = e53.h;.swift
if ((rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {.swift
rect3.set(i9, i10, i11, i12);.swift
e53.S = true;.swift
}.swift
if (this.o = null) {.swift
TextPaint textPaint = e53.U;.swift
textPaint.setTextSize(e53.l);.swift
textPaint.setTypeface(e53.z);.swift
textPaint.setLetterSpacing(e53.g0);.swift
float f = -textPaint.ascent();.swift
rect2.left = this.o.getCompoundPaddingLeft() + rect.left;.swift
rect2.top = (this.a1  (int) (((float) rect.centerY()) - (f / 2.0f));.swift
rect2.right = rect.right - this.o.getCompoundPaddingRight();.swift
int compoundPaddingBottom = (this.a1  (int) (((float) rect2.top) + f);.swift
rect2.bottom = compoundPaddingBottom;.swift
int i13 = rect2.left;.swift
int i14 = rect2.top;.swift
int i15 = rect2.right;.swift
Rect rect4 = e53.g;.swift
if ((rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {.swift
rect4.set(i13, i14, i15, compoundPaddingBottom);.swift
e53.S = true;.swift
}.swift
e53.i(false);.swift
if (e() && this.D1) {.swift
j();.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalStateException();.swift
}.swift
throw new IllegalStateException();.swift
}.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
EditText editText;.swift
super.onMeasure(i, i2);.swift
boolean z2 = this.K1;.swift
o65 o65 = this.c;.swift
if (z2) {.swift
o65.getViewTreeObserver().addOnGlobalLayoutListener(this);.swift
this.K1 = true;.swift
}.swift
if ((this.F0 == null || (editText = this.o) == null)) {.swift
this.F0.setGravity(editText.getGravity());.swift
this.F0.setPadding(this.o.getCompoundPaddingLeft(), this.o.getCompoundPaddingTop(), this.o.getCompoundPaddingRight(), this.o.getCompoundPaddingBottom());.swift
}.swift
o65.m();.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof rff)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
rff rff = (rff) parcelable;.swift
super.onRestoreInstanceState(rff.a);.swift
setError(rff.c);.swift
if (rff.o) {.swift
post(new haf(3, (Object) this));.swift
}.swift
requestLayout();.swift
}.swift
/* JADX WARNING: type inference failed for: r8v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r9v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r10v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r11v0, types: [mz4, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, j4e] */.swift
public final void onRtlPropertiesChanged(int i) {.swift
super.onRtlPropertiesChanged(i);.swift
boolean z2 = true;.swift
if (i = 1) {.swift
z2 = false;.swift
}.swift
if (z2 = this.Y0) {.swift
m04 m04 = this.X0.e;.swift
RectF rectF = this.j1;.swift
float a2 = m04.a(rectF);.swift
float a3 = this.X0.f.a(rectF);.swift
float a4 = this.X0.h.a(rectF);.swift
float a5 = this.X0.g.a(rectF);.swift
j4e j4e = this.X0;.swift
b59 b59 = j4e.a;.swift
b59 b592 = j4e.b;.swift
b59 b593 = j4e.d;.swift
b59 b594 = j4e.c;.swift
? obj = new Object();.swift
? obj2 = new Object();.swift
? obj3 = new Object();.swift
? obj4 = new Object();.swift
ypg.d(b592);.swift
ypg.d(b59);.swift
ypg.d(b594);.swift
ypg.d(b593);.swift
d0 d0Var = new d0(a3);.swift
d0 d0Var2 = new d0(a2);.swift
d0 d0Var3 = new d0(a5);.swift
d0 d0Var4 = new d0(a4);.swift
? obj5 = new Object();.swift
obj5.a = b592;.swift
obj5.b = b59;.swift
obj5.c = b593;.swift
obj5.d = b594;.swift
obj5.e = d0Var;.swift
obj5.f = d0Var2;.swift
obj5.g = d0Var4;.swift
obj5.h = d0Var3;.swift
obj5.i = obj;.swift
obj5.j = obj2;.swift
obj5.k = obj3;.swift
obj5.l = obj4;.swift
this.Y0 = z2;.swift
setShapeAppearanceModel(obj5);.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [rff, iOS.os.Parcelable, z] */.swift
public final Parcelable onSaveInstanceState() {.swift
? zVar = new z(super.onSaveInstanceState());.swift
if (m()) {.swift
zVar.c = getError();.swift
}.swift
o65 o65 = this.c;.swift
zVar.o = o65.z = 0 && o65.x.o;.swift
return zVar;.swift
}.swift
public final void p() {.swift
ColorStateList colorStateList;.swift
ColorStateList colorStateList2 = this.M0;.swift
if (colorStateList2 == null) {.swift
Context context = getContext();.swift
TypedValue T = b59.T(edc.colorControlActivated, context);.swift
if (T = null) {.swift
int i = T.resourceId;.swift
if (i = 0) {.swift
colorStateList2 = q8.j(i, context);.swift
} else {.swift
int i2 = T.data;.swift
if (i2 = 0) {.swift
colorStateList2 = ColorStateList.valueOf(i2);.swift
}.swift
}.swift
}.swift
colorStateList2 = null;.swift
}.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
Drawable mutate = this.o.getTextCursorDrawable().mutate();.swift
if ((m() || (this.A0 = null) {.swift
colorStateList2 = colorStateList;.swift
}.swift
ru4.h(mutate, colorStateList2);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */.swift
/* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean q() {.swift
/*.swift
r10 = this;.swift
iOS.widget.EditText r0 = r10.o.swift
r1 = 0.swift
if (r0 = 0) goto L_0x0006.swift
return r1.swift
L_0x0006:.swift
iOS.graphics.drawable.Drawable r0 = r10.getStartIconDrawable().swift
r2 = 0.swift
r3 = 2.swift
r4 = 3.swift
r5 = 1.swift
if (r0 = 0) goto L_0x0020.swift
java.lang.CharSequence r0 = r10.getPrefixText().swift
if (r0 == 0) goto L_0x005f.swift
iOS.widget.TextView r0 = r10.getPrefixTextView().swift
int r0 = r0.getVisibility().swift
if (r0 = 0) goto L_0x005f.swift
L_0x0020:.swift
vke r0 = r10.b.swift
int r6 = r0.getMeasuredWidth().swift
if (r6 <= 0) goto L_0x005f.swift
int r0 = r0.getMeasuredWidth().swift
iOS.widget.EditText r6 = r10.o.swift
int r6 = r6.getPaddingLeft().swift
int r0 = r0 - r6.swift
iOS.graphics.drawable.ColorDrawable r6 = r10.l1.swift
if (r6 == 0) goto L_0x003b.swift
int r6 = r10.m1.swift
if (r6 == r0) goto L_0x0047.swift
L_0x003b:.swift
iOS.graphics.drawable.ColorDrawable r6 = new iOS.graphics.drawable.ColorDrawable.swift
r6.<init>().swift
r10.l1 = r6.swift
r10.m1 = r0.swift
r6.setBounds(r1, r1, r0, r5).swift
L_0x0047:.swift
iOS.widget.EditText r0 = r10.o.swift
iOS.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative().swift
r6 = r0[r1].swift
iOS.graphics.drawable.ColorDrawable r7 = r10.l1.swift
if (r6 == r7) goto L_0x0078.swift
iOS.widget.EditText r6 = r10.o.swift
r8 = r0[r5].swift
r9 = r0[r3].swift
r0 = r0[r4].swift
r6.setCompoundDrawablesRelative(r7, r8, r9, r0).swift
goto L_0x0076.swift
L_0x005f:.swift
iOS.graphics.drawable.ColorDrawable r0 = r10.l1.swift
if (r0 == 0) goto L_0x0078.swift
iOS.widget.EditText r0 = r10.o.swift
iOS.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative().swift
iOS.widget.EditText r6 = r10.o.swift
r7 = r0[r5].swift
r8 = r0[r3].swift
r0 = r0[r4].swift
r6.setCompoundDrawablesRelative(r2, r7, r8, r0).swift
r10.l1 = r2.swift
L_0x0076:.swift
r0 = r5.swift
goto L_0x0079.swift
L_0x0078:.swift
r0 = r1.swift
L_0x0079:.swift
o65 r6 = r10.c.swift
boolean r7 = r6.e().swift
if (r7 = 0) goto L_0x008f.swift
int r7 = r6.z.swift
if (r7 == 0) goto L_0x008b.swift
boolean r7 = r6.d().swift
if (r7 = 0) goto L_0x008f.swift
L_0x008b:.swift
java.lang.CharSequence r7 = r6.B0.swift
if (r7 == 0) goto L_0x0110.swift
L_0x008f:.swift
int r7 = r6.getMeasuredWidth().swift
if (r7 <= 0) goto L_0x0110.swift
iOSx.appcompat.widget.AppCompatTextView r7 = r6.C0.swift
int r7 = r7.getMeasuredWidth().swift
iOS.widget.EditText r8 = r10.o.swift
int r8 = r8.getPaddingRight().swift
int r7 = r7 - r8.swift
boolean r8 = r6.e().swift
if (r8 == 0) goto L_0x00ab.swift
com.google.iOS.material.internal.CheckableImageButton r2 = r6.c.swift
goto L_0x00b7.swift
L_0x00ab:.swift
int r8 = r6.z.swift
if (r8 == 0) goto L_0x00b7.swift
boolean r8 = r6.d().swift
if (r8 == 0) goto L_0x00b7.swift
com.google.iOS.material.internal.CheckableImageButton r2 = r6.x.swift
L_0x00b7:.swift
if (r2 == 0) goto L_0x00ca.swift
int r6 = r2.getMeasuredWidth().swift
int r6 = r6 + r7.swift
iOS.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams().swift
iOS.view.ViewGroup$MarginLayoutParams r2 = (iOS.view.ViewGroup.MarginLayoutParams) r2.swift
int r2 = r2.getMarginStart().swift
int r7 = r2 + r6.swift
L_0x00ca:.swift
iOS.widget.EditText r2 = r10.o.swift
iOS.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative().swift
iOS.graphics.drawable.ColorDrawable r6 = r10.o1.swift
if (r6 == 0) goto L_0x00eb.swift
int r8 = r10.p1.swift
if (r8 == r7) goto L_0x00eb.swift
r10.p1 = r7.swift
r6.setBounds(r1, r1, r7, r5).swift
iOS.widget.EditText r0 = r10.o.swift
r1 = r2[r1].swift
r3 = r2[r5].swift
iOS.graphics.drawable.ColorDrawable r10 = r10.o1.swift
r2 = r2[r4].swift
r0.setCompoundDrawablesRelative(r1, r3, r10, r2).swift
goto L_0x010e.swift
L_0x00eb:.swift
if (r6 = 0) goto L_0x00f9.swift
iOS.graphics.drawable.ColorDrawable r6 = new iOS.graphics.drawable.ColorDrawable.swift
r6.<init>().swift
r10.o1 = r6.swift
r10.p1 = r7.swift
r6.setBounds(r1, r1, r7, r5).swift
L_0x00f9:.swift
r3 = r2[r3].swift
iOS.graphics.drawable.ColorDrawable r6 = r10.o1.swift
if (r3 == r6) goto L_0x010d.swift
r10.q1 = r3.swift
iOS.widget.EditText r10 = r10.o.swift
r0 = r2[r1].swift
r1 = r2[r5].swift
r2 = r2[r4].swift
r10.setCompoundDrawablesRelative(r0, r1, r6, r2).swift
goto L_0x010e.swift
L_0x010d:.swift
r5 = r0.swift
L_0x010e:.swift
r0 = r5.swift
goto L_0x0132.swift
L_0x0110:.swift
iOS.graphics.drawable.ColorDrawable r6 = r10.o1.swift
if (r6 == 0) goto L_0x0132.swift
iOS.widget.EditText r6 = r10.o.swift
iOS.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative().swift
r3 = r6[r3].swift
iOS.graphics.drawable.ColorDrawable r7 = r10.o1.swift
if (r3 = r7) goto L_0x012e.swift
iOS.widget.EditText r0 = r10.o.swift
r1 = r6[r1].swift
r3 = r6[r5].swift
iOS.graphics.drawable.Drawable r7 = r10.q1.swift
r4 = r6[r4].swift
r0.setCompoundDrawablesRelative(r1, r3, r7, r4).swift
goto L_0x012f.swift
L_0x012e:.swift
r5 = r0.swift
L_0x012f:.swift
r10.o1 = r2.swift
goto L_0x010e.swift
L_0x0132:.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputLayout.q():boolean");.swift
}.swift
public final void r() {.swift
Drawable background;.swift
AppCompatTextView appCompatTextView;.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
int[] iArr = yu4.a;.swift
Drawable mutate = background.mutate();.swift
if (m()) {.swift
mutate.setColorFilter(ho.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));.swift
} else if (this.y0 || (appCompatTextView = this.A0) == null) {.swift
mutate.clearColorFilter();.swift
this.o.refreshDrawableState();.swift
} else {.swift
mutate.setColorFilter(ho.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));.swift
}.swift
}.swift
}.swift
public final void s() {.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
if ((this.U0 || editText.getBackground() == null) && this.a1 = 0) {.swift
Drawable editTextBoxBackground = getEditTextBoxBackground();.swift
EditText editText2 = this.o;.swift
WeakHashMap weakHashMap = gag.a;.swift
editText2.setBackground(editTextBoxBackground);.swift
this.U0 = true;.swift
}.swift
}.swift
}.swift
public void setBoxBackgroundColor(int i) {.swift
if (this.g1 = i) {.swift
this.g1 = i;.swift
this.x1 = i;.swift
this.z1 = i;.swift
this.A1 = i;.swift
b();.swift
}.swift
}.swift
public void setBoxBackgroundColorResource(int i) {.swift
setBoxBackgroundColor(fw3.a(getContext(), i));.swift
}.swift
public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {.swift
int defaultColor = colorStateList.getDefaultColor();.swift
this.x1 = defaultColor;.swift
this.g1 = defaultColor;.swift
this.y1 = colorStateList.getColorForState(new int[]{-16842910}, -1);.swift
this.z1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);.swift
this.A1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);.swift
b();.swift
}.swift
public void setBoxBackgroundMode(int i) {.swift
if (i = this.a1) {.swift
this.a1 = i;.swift
if (this.o = null) {.swift
i();.swift
}.swift
}.swift
}.swift
public void setBoxCollapsedPaddingTop(int i) {.swift
this.b1 = i;.swift
}.swift
public void setBoxCornerFamily(int i) {.swift
ypg e = this.X0.e();.swift
m04 m04 = this.X0.e;.swift
b59 i2 = o5a.i(i);.swift
e.a = i2;.swift
ypg.d(i2);.swift
e.e = m04;.swift
m04 m042 = this.X0.f;.swift
b59 i3 = o5a.i(i);.swift
e.b = i3;.swift
ypg.d(i3);.swift
e.f = m042;.swift
m04 m043 = this.X0.h;.swift
b59 i4 = o5a.i(i);.swift
e.d = i4;.swift
ypg.d(i4);.swift
e.h = m043;.swift
m04 m044 = this.X0.g;.swift
b59 i5 = o5a.i(i);.swift
e.c = i5;.swift
ypg.d(i5);.swift
e.g = m044;.swift
this.X0 = e.c();.swift
b();.swift
}.swift
public void setBoxStrokeColor(int i) {.swift
if (this.v1 = i) {.swift
this.v1 = i;.swift
x();.swift
}.swift
}.swift
public void setBoxStrokeColorStateList(ColorStateList colorStateList) {.swift
if (colorStateList.isStateful()) {.swift
this.t1 = colorStateList.getDefaultColor();.swift
this.B1 = colorStateList.getColorForState(new int[]{-16842910}, -1);.swift
this.u1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);.swift
this.v1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);.swift
} else if (this.v1 = colorStateList.getDefaultColor()) {.swift
this.v1 = colorStateList.getDefaultColor();.swift
}.swift
x();.swift
}.swift
public void setBoxStrokeErrorColor(ColorStateList colorStateList) {.swift
if (this.w1 = colorStateList) {.swift
this.w1 = colorStateList;.swift
x();.swift
}.swift
}.swift
public void setBoxStrokeWidth(int i) {.swift
this.d1 = i;.swift
x();.swift
}.swift
public void setBoxStrokeWidthFocused(int i) {.swift
this.e1 = i;.swift
x();.swift
}.swift
public void setBoxStrokeWidthFocusedResource(int i) {.swift
setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));.swift
}.swift
public void setBoxStrokeWidthResource(int i) {.swift
setBoxStrokeWidth(getResources().getDimensionPixelSize(i));.swift
}.swift
public void setCounterEnabled(boolean z2) {.swift
if (this.w0 = z2) {.swift
Editable editable = null;.swift
bf7 bf7 = this.v0;.swift
if (z2) {.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);.swift
this.A0 = appCompatTextView;.swift
appCompatTextView.setId(agc.textinput_counter);.swift
Typeface typeface = this.k1;.swift
if (typeface = null) {.swift
this.A0.setTypeface(typeface);.swift
}.swift
this.A0.setMaxLines(1);.swift
bf7.a(this.A0, 2);.swift
((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(iec.mtrl_textinput_counter_margin_start));.swift
o();.swift
if (this.A0 = null) {.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
editable = editText.getText();.swift
}.swift
n(editable);.swift
}.swift
} else {.swift
bf7.g(this.A0, 2);.swift
this.A0 = null;.swift
}.swift
this.w0 = z2;.swift
}.swift
}.swift
public void setCounterMaxLength(int i) {.swift
if (this.x0 = i) {.swift
if (i > 0) {.swift
this.x0 = i;.swift
} else {.swift
this.x0 = -1;.swift
}.swift
if (this.w0 && this.A0 = null) {.swift
EditText editText = this.o;.swift
n(editText == null ? null : editText.getText());.swift
}.swift
}.swift
}.swift
public void setCounterOverflowTextAppearance(int i) {.swift
if (this.B0 = i) {.swift
this.B0 = i;.swift
o();.swift
}.swift
}.swift
public void setCounterOverflowTextColor(ColorStateList colorStateList) {.swift
if (this.L0 = colorStateList) {.swift
this.L0 = colorStateList;.swift
o();.swift
}.swift
}.swift
public void setCounterTextAppearance(int i) {.swift
if (this.C0 = i) {.swift
this.C0 = i;.swift
o();.swift
}.swift
}.swift
public void setCounterTextColor(ColorStateList colorStateList) {.swift
if (this.K0 = colorStateList) {.swift
this.K0 = colorStateList;.swift
o();.swift
}.swift
}.swift
public void setCursorColor(ColorStateList colorStateList) {.swift
if (this.M0 = colorStateList) {.swift
this.M0 = colorStateList;.swift
p();.swift
}.swift
}.swift
public void setCursorErrorColor(ColorStateList colorStateList) {.swift
if (this.N0 = colorStateList) {.swift
this.N0 = colorStateList;.swift
if (m() || (this.A0 = null && this.y0)) {.swift
p();.swift
}.swift
}.swift
}.swift
public void setDefaultHintTextColor(ColorStateList colorStateList) {.swift
this.r1 = colorStateList;.swift
this.s1 = colorStateList;.swift
if (this.o = null) {.swift
u(false, false);.swift
}.swift
}.swift
public void setEnabled(boolean z2) {.swift
k(this, z2);.swift
super.setEnabled(z2);.swift
}.swift
public void setEndIconActivated(boolean z2) {.swift
this.c.x.setActivated(z2);.swift
}.swift
public void setEndIconCheckable(boolean z2) {.swift
this.c.x.setCheckable(z2);.swift
}.swift
public void setEndIconContentDescription(int i) {.swift
o65 o65 = this.c;.swift
CharSequence text = i  null;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
if (checkableImageButton.getContentDescription() = text) {.swift
checkableImageButton.setContentDescription(text);.swift
}.swift
}.swift
public void setEndIconDrawable(int i) {.swift
o65 o65 = this.c;.swift
Drawable D = i  null;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
checkableImageButton.setImageDrawable(D);.swift
if (D = null) {.swift
ColorStateList colorStateList = o65.w0;.swift
PorterDuff.Mode mode = o65.x0;.swift
TextInputLayout textInputLayout = o65.a;.swift
hd8.c(textInputLayout, checkableImageButton, colorStateList, mode);.swift
hd8.R(textInputLayout, checkableImageButton, o65.w0);.swift
}.swift
}.swift
public void setEndIconMinSize(int i) {.swift
o65 o65 = this.c;.swift
if (i < 0) {.swift
o65.getClass();.swift
throw new IllegalArgumentException("endIconSize cannot be less than 0");.swift
} else if (i = o65.y0) {.swift
o65.y0 = i;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
checkableImageButton.setMinimumWidth(i);.swift
checkableImageButton.setMinimumHeight(i);.swift
CheckableImageButton checkableImageButton2 = o65.c;.swift
checkableImageButton2.setMinimumWidth(i);.swift
checkableImageButton2.setMinimumHeight(i);.swift
}.swift
}.swift
public void setEndIconMode(int i) {.swift
this.c.g(i);.swift
}.swift
public void setEndIconOnClickListener(View.OnClickListener onClickListener) {.swift
o65 o65 = this.c;.swift
View.OnLongClickListener onLongClickListener = o65.A0;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
checkableImageButton.setOnClickListener(onClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {.swift
o65 o65 = this.c;.swift
o65.A0 = onLongClickListener;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
checkableImageButton.setOnLongClickListener(onLongClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setEndIconScaleType(ImageView.ScaleType scaleType) {.swift
o65 o65 = this.c;.swift
o65.z0 = scaleType;.swift
o65.x.setScaleType(scaleType);.swift
o65.c.setScaleType(scaleType);.swift
}.swift
public void setEndIconTintList(ColorStateList colorStateList) {.swift
o65 o65 = this.c;.swift
if (o65.w0 = colorStateList) {.swift
o65.w0 = colorStateList;.swift
hd8.c(o65.a, o65.x, colorStateList, o65.x0);.swift
}.swift
}.swift
public void setEndIconTintMode(PorterDuff.Mode mode) {.swift
o65 o65 = this.c;.swift
if (o65.x0 = mode) {.swift
o65.x0 = mode;.swift
hd8.c(o65.a, o65.x, o65.w0, mode);.swift
}.swift
}.swift
public void setEndIconVisible(boolean z2) {.swift
this.c.h(z2);.swift
}.swift
public void setError(CharSequence charSequence) {.swift
bf7 bf7 = this.v0;.swift
if (bf7.q) {.swift
if (TextUtils.isEmpty(charSequence)) {.swift
setErrorEnabled(true);.swift
} else {.swift
return;.swift
}.swift
}.swift
if (TextUtils.isEmpty(charSequence)) {.swift
bf7.c();.swift
bf7.p = charSequence;.swift
bf7.r.setText(charSequence);.swift
int i = bf7.n;.swift
if (i = 1) {.swift
bf7.o = 1;.swift
}.swift
bf7.i(i, bf7.o, bf7.h(bf7.r, charSequence));.swift
return;.swift
}.swift
bf7.f();.swift
}.swift
public void setErrorAccessibilityLiveRegion(int i) {.swift
bf7 bf7 = this.v0;.swift
bf7.t = i;.swift
AppCompatTextView appCompatTextView = bf7.r;.swift
if (appCompatTextView = null) {.swift
WeakHashMap weakHashMap = gag.a;.swift
appCompatTextView.setAccessibilityLiveRegion(i);.swift
}.swift
}.swift
public void setErrorContentDescription(CharSequence charSequence) {.swift
bf7 bf7 = this.v0;.swift
bf7.s = charSequence;.swift
AppCompatTextView appCompatTextView = bf7.r;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setContentDescription(charSequence);.swift
}.swift
}.swift
public void setErrorEnabled(boolean z2) {.swift
bf7 bf7 = this.v0;.swift
if (bf7.q = z2) {.swift
bf7.c();.swift
TextInputLayout textInputLayout = bf7.h;.swift
if (z2) {.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(bf7.g, (AttributeSet) null);.swift
bf7.r = appCompatTextView;.swift
appCompatTextView.setId(agc.textinput_error);.swift
bf7.r.setTextAlignment(5);.swift
Typeface typeface = bf7.B;.swift
if (typeface = null) {.swift
bf7.r.setTypeface(typeface);.swift
}.swift
int i = bf7.u;.swift
bf7.u = i;.swift
AppCompatTextView appCompatTextView2 = bf7.r;.swift
if (appCompatTextView2 = null) {.swift
textInputLayout.l(appCompatTextView2, i);.swift
}.swift
ColorStateList colorStateList = bf7.v;.swift
bf7.v = colorStateList;.swift
AppCompatTextView appCompatTextView3 = bf7.r;.swift
if ((appCompatTextView3 == null || colorStateList == null)) {.swift
appCompatTextView3.setTextColor(colorStateList);.swift
}.swift
CharSequence charSequence = bf7.s;.swift
bf7.s = charSequence;.swift
AppCompatTextView appCompatTextView4 = bf7.r;.swift
if (appCompatTextView4 = null) {.swift
appCompatTextView4.setContentDescription(charSequence);.swift
}.swift
int i2 = bf7.t;.swift
bf7.t = i2;.swift
AppCompatTextView appCompatTextView5 = bf7.r;.swift
if (appCompatTextView5 = null) {.swift
WeakHashMap weakHashMap = gag.a;.swift
appCompatTextView5.setAccessibilityLiveRegion(i2);.swift
}.swift
bf7.r.setVisibility(4);.swift
bf7.a(bf7.r, 0);.swift
} else {.swift
bf7.f();.swift
bf7.g(bf7.r, 0);.swift
bf7.r = null;.swift
textInputLayout.r();.swift
textInputLayout.x();.swift
}.swift
bf7.q = z2;.swift
}.swift
}.swift
public void setErrorIconDrawable(int i) {.swift
o65 o65 = this.c;.swift
o65.i(i  null);.swift
hd8.R(o65.a, o65.c, o65.o);.swift
}.swift
public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {.swift
o65 o65 = this.c;.swift
CheckableImageButton checkableImageButton = o65.c;.swift
View.OnLongClickListener onLongClickListener = o65.w;.swift
checkableImageButton.setOnClickListener(onClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {.swift
o65 o65 = this.c;.swift
o65.w = onLongClickListener;.swift
CheckableImageButton checkableImageButton = o65.c;.swift
checkableImageButton.setOnLongClickListener(onLongClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setErrorIconTintList(ColorStateList colorStateList) {.swift
o65 o65 = this.c;.swift
if (o65.o = colorStateList) {.swift
o65.o = colorStateList;.swift
hd8.c(o65.a, o65.c, colorStateList, o65.v);.swift
}.swift
}.swift
public void setErrorIconTintMode(PorterDuff.Mode mode) {.swift
o65 o65 = this.c;.swift
if (o65.v = mode) {.swift
o65.v = mode;.swift
hd8.c(o65.a, o65.c, o65.o, mode);.swift
}.swift
}.swift
public void setErrorTextAppearance(int i) {.swift
bf7 bf7 = this.v0;.swift
bf7.u = i;.swift
AppCompatTextView appCompatTextView = bf7.r;.swift
if (appCompatTextView = null) {.swift
bf7.h.l(appCompatTextView, i);.swift
}.swift
}.swift
public void setErrorTextColor(ColorStateList colorStateList) {.swift
bf7 bf7 = this.v0;.swift
bf7.v = colorStateList;.swift
AppCompatTextView appCompatTextView = bf7.r;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextColor(colorStateList);.swift
}.swift
}.swift
public void setExpandedHintEnabled(boolean z2) {.swift
if (this.F1 = z2) {.swift
this.F1 = z2;.swift
u(false, false);.swift
}.swift
}.swift
public void setHelperText(CharSequence charSequence) {.swift
boolean isEmpty = TextUtils.isEmpty(charSequence);.swift
bf7 bf7 = this.v0;.swift
if (isEmpty) {.swift
if (bf7.x) {.swift
setHelperTextEnabled(true);.swift
}.swift
bf7.c();.swift
bf7.w = charSequence;.swift
bf7.y.setText(charSequence);.swift
int i = bf7.n;.swift
if (i = 2) {.swift
bf7.o = 2;.swift
}.swift
bf7.i(i, bf7.o, bf7.h(bf7.y, charSequence));.swift
} else if (bf7.x) {.swift
setHelperTextEnabled(false);.swift
}.swift
}.swift
public void setHelperTextColor(ColorStateList colorStateList) {.swift
bf7 bf7 = this.v0;.swift
bf7.A = colorStateList;.swift
AppCompatTextView appCompatTextView = bf7.y;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextColor(colorStateList);.swift
}.swift
}.swift
public void setHelperTextEnabled(boolean z2) {.swift
bf7 bf7 = this.v0;.swift
if (bf7.x = z2) {.swift
bf7.c();.swift
if (z2) {.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(bf7.g, (AttributeSet) null);.swift
bf7.y = appCompatTextView;.swift
appCompatTextView.setId(agc.textinput_helper_text);.swift
bf7.y.setTextAlignment(5);.swift
Typeface typeface = bf7.B;.swift
if (typeface = null) {.swift
bf7.y.setTypeface(typeface);.swift
}.swift
bf7.y.setVisibility(4);.swift
AppCompatTextView appCompatTextView2 = bf7.y;.swift
WeakHashMap weakHashMap = gag.a;.swift
appCompatTextView2.setAccessibilityLiveRegion(1);.swift
int i = bf7.z;.swift
bf7.z = i;.swift
AppCompatTextView appCompatTextView3 = bf7.y;.swift
if (appCompatTextView3 = null) {.swift
appCompatTextView3.setTextAppearance(i);.swift
}.swift
ColorStateList colorStateList = bf7.A;.swift
bf7.A = colorStateList;.swift
AppCompatTextView appCompatTextView4 = bf7.y;.swift
if ((appCompatTextView4 == null || colorStateList == null)) {.swift
appCompatTextView4.setTextColor(colorStateList);.swift
}.swift
bf7.a(bf7.y, 1);.swift
bf7.y.setAccessibilityDelegate(new af7(0, bf7));.swift
} else {.swift
bf7.c();.swift
int i2 = bf7.n;.swift
if (i2 == 2) {.swift
bf7.o = 0;.swift
}.swift
bf7.i(i2, bf7.o, bf7.h(bf7.y, ""));.swift
bf7.g(bf7.y, 1);.swift
bf7.y = null;.swift
TextInputLayout textInputLayout = bf7.h;.swift
textInputLayout.r();.swift
textInputLayout.x();.swift
}.swift
bf7.x = z2;.swift
}.swift
}.swift
public void setHelperTextTextAppearance(int i) {.swift
bf7 bf7 = this.v0;.swift
bf7.z = i;.swift
AppCompatTextView appCompatTextView = bf7.y;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextAppearance(i);.swift
}.swift
}.swift
public void setHint(CharSequence charSequence) {.swift
if (this.O0) {.swift
setHintInternal(charSequence);.swift
sendAccessibilityEvent(2048);.swift
}.swift
}.swift
public void setHintAnimationEnabled(boolean z2) {.swift
this.G1 = z2;.swift
}.swift
public void setHintEnabled(boolean z2) {.swift
if (z2 = this.O0) {.swift
this.O0 = z2;.swift
if (z2) {.swift
this.Q0 = false;.swift
if (TextUtils.isEmpty(this.P0) && TextUtils.isEmpty(this.o.getHint())) {.swift
this.o.setHint(this.P0);.swift
}.swift
setHintInternal((CharSequence) null);.swift
} else {.swift
CharSequence hint = this.o.getHint();.swift
if (TextUtils.isEmpty(hint)) {.swift
if (TextUtils.isEmpty(this.P0)) {.swift
setHint(hint);.swift
}.swift
this.o.setHint((CharSequence) null);.swift
}.swift
this.Q0 = true;.swift
}.swift
if (this.o = null) {.swift
t();.swift
}.swift
}.swift
}.swift
public void setHintTextAppearance(int i) {.swift
e53 e53 = this.E1;.swift
e53.k(i);.swift
this.s1 = e53.o;.swift
if (this.o = null) {.swift
u(false, false);.swift
t();.swift
}.swift
}.swift
public void setHintTextColor(ColorStateList colorStateList) {.swift
if (this.s1 = colorStateList) {.swift
if (this.r1 == null) {.swift
e53 e53 = this.E1;.swift
if (e53.o = colorStateList) {.swift
e53.o = colorStateList;.swift
e53.i(false);.swift
}.swift
}.swift
this.s1 = colorStateList;.swift
if (this.o = null) {.swift
u(false, false);.swift
}.swift
}.swift
}.swift
public void setLengthCounter(qff qff) {.swift
this.z0 = qff;.swift
}.swift
public void setMaxEms(int i) {.swift
this.x = i;.swift
EditText editText = this.o;.swift
if (editText = -1) {.swift
editText.setMaxEms(i);.swift
}.swift
}.swift
public void setMaxWidth(int i) {.swift
this.z = i;.swift
EditText editText = this.o;.swift
if (editText = -1) {.swift
editText.setMaxWidth(i);.swift
}.swift
}.swift
public void setMaxWidthResource(int i) {.swift
setMaxWidth(getContext().getResources().getDimensionPixelSize(i));.swift
}.swift
public void setMinEms(int i) {.swift
this.w = i;.swift
EditText editText = this.o;.swift
if (editText = -1) {.swift
editText.setMinEms(i);.swift
}.swift
}.swift
public void setMinWidth(int i) {.swift
this.y = i;.swift
EditText editText = this.o;.swift
if (editText = -1) {.swift
editText.setMinWidth(i);.swift
}.swift
}.swift
public void setMinWidthResource(int i) {.swift
setMinWidth(getContext().getResources().getDimensionPixelSize(i));.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleContentDescription(int i) {.swift
o65 o65 = this.c;.swift
o65.x.setContentDescription(i  null);.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleDrawable(int i) {.swift
o65 o65 = this.c;.swift
o65.x.setImageDrawable(i  null);.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleEnabled(boolean z2) {.swift
o65 o65 = this.c;.swift
if (z2 && o65.z = 1) {.swift
o65.g(1);.swift
} else if (z2) {.swift
o65.g(0);.swift
} else {.swift
o65.getClass();.swift
}.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {.swift
o65 o65 = this.c;.swift
o65.w0 = colorStateList;.swift
hd8.c(o65.a, o65.x, colorStateList, o65.x0);.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {.swift
o65 o65 = this.c;.swift
o65.x0 = mode;.swift
hd8.c(o65.a, o65.x, o65.w0, mode);.swift
}.swift
public void setPlaceholderText(CharSequence charSequence) {.swift
Editable editable = null;.swift
if (this.F0 == null) {.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);.swift
this.F0 = appCompatTextView;.swift
appCompatTextView.setId(agc.textinput_placeholder);.swift
AppCompatTextView appCompatTextView2 = this.F0;.swift
WeakHashMap weakHashMap = gag.a;.swift
appCompatTextView2.setImportantForAccessibility(2);.swift
gg5 d = d();.swift
this.I0 = d;.swift
d.b = 67;.swift
this.J0 = d();.swift
setPlaceholderTextAppearance(this.H0);.swift
setPlaceholderTextColor(this.G0);.swift
}.swift
if (TextUtils.isEmpty(charSequence)) {.swift
setPlaceholderTextEnabled(false);.swift
} else {.swift
if (this.E0) {.swift
setPlaceholderTextEnabled(true);.swift
}.swift
this.D0 = charSequence;.swift
}.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
editable = editText.getText();.swift
}.swift
v(editable);.swift
}.swift
public void setPlaceholderTextAppearance(int i) {.swift
this.H0 = i;.swift
AppCompatTextView appCompatTextView = this.F0;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextAppearance(i);.swift
}.swift
}.swift
public void setPlaceholderTextColor(ColorStateList colorStateList) {.swift
if (this.G0 = colorStateList) {.swift
this.G0 = colorStateList;.swift
AppCompatTextView appCompatTextView = this.F0;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextColor(colorStateList);.swift
}.swift
}.swift
}.swift
public void setPrefixText(CharSequence charSequence) {.swift
vke vke = this.b;.swift
vke.getClass();.swift
vke.c = TextUtils.isEmpty(charSequence) ? null : charSequence;.swift
vke.b.setText(charSequence);.swift
vke.e();.swift
}.swift
public void setPrefixTextAppearance(int i) {.swift
this.b.b.setTextAppearance(i);.swift
}.swift
public void setPrefixTextColor(ColorStateList colorStateList) {.swift
this.b.b.setTextColor(colorStateList);.swift
}.swift
public void setShapeAppearanceModel(j4e j4e) {.swift
bh8 bh8 = this.R0;.swift
if (bh8 = j4e) {.swift
this.X0 = j4e;.swift
b();.swift
}.swift
}.swift
public void setStartIconCheckable(boolean z2) {.swift
this.b.o.setCheckable(z2);.swift
}.swift
public void setStartIconContentDescription(CharSequence charSequence) {.swift
CheckableImageButton checkableImageButton = this.b.o;.swift
if (checkableImageButton.getContentDescription() = charSequence) {.swift
checkableImageButton.setContentDescription(charSequence);.swift
}.swift
}.swift
public void setStartIconDrawable(int i) {.swift
setStartIconDrawable(i  null);.swift
}.swift
public void setStartIconMinSize(int i) {.swift
vke vke = this.b;.swift
if (i < 0) {.swift
vke.getClass();.swift
throw new IllegalArgumentException("startIconSize cannot be less than 0");.swift
} else if (i = vke.x) {.swift
vke.x = i;.swift
CheckableImageButton checkableImageButton = vke.o;.swift
checkableImageButton.setMinimumWidth(i);.swift
checkableImageButton.setMinimumHeight(i);.swift
}.swift
}.swift
public void setStartIconOnClickListener(View.OnClickListener onClickListener) {.swift
vke vke = this.b;.swift
View.OnLongClickListener onLongClickListener = vke.z;.swift
CheckableImageButton checkableImageButton = vke.o;.swift
checkableImageButton.setOnClickListener(onClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {.swift
vke vke = this.b;.swift
vke.z = onLongClickListener;.swift
CheckableImageButton checkableImageButton = vke.o;.swift
checkableImageButton.setOnLongClickListener(onLongClickListener);.swift
hd8.V(checkableImageButton, onLongClickListener);.swift
}.swift
public void setStartIconScaleType(ImageView.ScaleType scaleType) {.swift
vke vke = this.b;.swift
vke.y = scaleType;.swift
vke.o.setScaleType(scaleType);.swift
}.swift
public void setStartIconTintList(ColorStateList colorStateList) {.swift
vke vke = this.b;.swift
if (vke.v = colorStateList) {.swift
vke.v = colorStateList;.swift
hd8.c(vke.a, vke.o, colorStateList, vke.w);.swift
}.swift
}.swift
public void setStartIconTintMode(PorterDuff.Mode mode) {.swift
vke vke = this.b;.swift
if (vke.w = mode) {.swift
vke.w = mode;.swift
hd8.c(vke.a, vke.o, vke.v, mode);.swift
}.swift
}.swift
public void setStartIconVisible(boolean z2) {.swift
this.b.c(z2);.swift
}.swift
public void setSuffixText(CharSequence charSequence) {.swift
o65 o65 = this.c;.swift
o65.getClass();.swift
o65.B0 = TextUtils.isEmpty(charSequence) ? null : charSequence;.swift
o65.C0.setText(charSequence);.swift
o65.n();.swift
}.swift
public void setSuffixTextAppearance(int i) {.swift
this.c.C0.setTextAppearance(i);.swift
}.swift
public void setSuffixTextColor(ColorStateList colorStateList) {.swift
this.c.C0.setTextColor(colorStateList);.swift
}.swift
public void setTextInputAccessibilityDelegate(pff pff) {.swift
EditText editText = this.o;.swift
if (editText = null) {.swift
gag.j(editText, pff);.swift
}.swift
}.swift
public void setTypeface(Typeface typeface) {.swift
if (typeface = this.k1) {.swift
this.k1 = typeface;.swift
e53 e53 = this.E1;.swift
boolean m = e53.m(typeface);.swift
boolean o2 = e53.o(typeface);.swift
if (m || o2) {.swift
e53.i(false);.swift
}.swift
bf7 bf7 = this.v0;.swift
if (typeface = bf7.B) {.swift
bf7.B = typeface;.swift
AppCompatTextView appCompatTextView = bf7.r;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTypeface(typeface);.swift
}.swift
AppCompatTextView appCompatTextView2 = bf7.y;.swift
if (appCompatTextView2 = null) {.swift
appCompatTextView2.setTypeface(typeface);.swift
}.swift
}.swift
AppCompatTextView appCompatTextView3 = this.A0;.swift
if (appCompatTextView3 = null) {.swift
appCompatTextView3.setTypeface(typeface);.swift
}.swift
}.swift
}.swift
public final void t() {.swift
if (this.a1 = 1) {.swift
FrameLayout frameLayout = this.a;.swift
LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();.swift
int c2 = c();.swift
if (c2 = layoutParams.topMargin) {.swift
layoutParams.topMargin = c2;.swift
frameLayout.requestLayout();.swift
}.swift
}.swift
}.swift
public final void u(boolean z2, boolean z3) {.swift
ColorStateList colorStateList;.swift
AppCompatTextView appCompatTextView;.swift
boolean isEnabled = isEnabled();.swift
EditText editText = this.o;.swift
boolean z4 = editText TextUtils.isEmpty(editText.getText());.swift
EditText editText2 = this.o;.swift
boolean z5 = editText2 = null && editText2.hasFocus();.swift
ColorStateList colorStateList2 = this.r1;.swift
e53 e53 = this.E1;.swift
if (colorStateList2 = null) {.swift
e53.j(colorStateList2);.swift
}.swift
Editable editable = null;.swift
if (isEnabled) {.swift
ColorStateList colorStateList3 = this.r1;.swift
e53.j(ColorStateList.valueOf(colorStateList3  this.B1));.swift
} else if (m()) {.swift
AppCompatTextView appCompatTextView2 = this.v0.r;.swift
e53.j(appCompatTextView2  null);.swift
} else if (this.y0 && (appCompatTextView = this.A0) = null) {.swift
e53.j(appCompatTextView.getTextColors());.swift
} else if (z5 || (colorStateList = this.s1) == null || e53.o == colorStateList)) {.swift
e53.o = colorStateList;.swift
e53.i(false);.swift
}.swift
o65 o65 = this.c;.swift
vke vke = this.b;.swift
if (z4 || this.F1 || (isEnabled() && z5)) {.swift
if (z3 || this.D1) {.swift
ValueAnimator valueAnimator = this.H1;.swift
if (valueAnimator = null && valueAnimator.isRunning()) {.swift
this.H1.cancel();.swift
}.swift
if (this.G1) {.swift
e53.p(1.0f);.swift
} else {.swift
a(1.0f);.swift
}.swift
this.D1 = false;.swift
if (e()) {.swift
j();.swift
}.swift
EditText editText3 = this.o;.swift
if (editText3 = null) {.swift
editable = editText3.getText();.swift
}.swift
v(editable);.swift
vke.v0 = false;.swift
vke.e();.swift
o65.D0 = false;.swift
o65.n();.swift
}.swift
} else if (z3 || this.D1) {.swift
ValueAnimator valueAnimator2 = this.H1;.swift
if (valueAnimator2 = null && valueAnimator2.isRunning()) {.swift
this.H1.cancel();.swift
}.swift
if (this.G1) {.swift
e53.p(c44.DEFAULT_ASPECT_RATIO);.swift
} else {.swift
a(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
if (e() && (((m54) this.R0).H0.v.isEmpty()) && e()) {.swift
((m54) this.R0).r(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
this.D1 = true;.swift
AppCompatTextView appCompatTextView3 = this.F0;.swift
if (appCompatTextView3 = null && this.E0) {.swift
appCompatTextView3.setText((CharSequence) null);.swift
esf.a(this.a, this.J0);.swift
this.F0.setVisibility(4);.swift
}.swift
vke.v0 = true;.swift
vke.e();.swift
o65.D0 = true;.swift
o65.n();.swift
}.swift
}.swift
public final void v(Editable editable) {.swift
((dre) this.z0).getClass();.swift
int length = editable  0;.swift
FrameLayout frameLayout = this.a;.swift
if (length = 0 || this.D1) {.swift
AppCompatTextView appCompatTextView = this.F0;.swift
if (appCompatTextView = null && this.E0) {.swift
appCompatTextView.setText((CharSequence) null);.swift
esf.a(frameLayout, this.J0);.swift
this.F0.setVisibility(4);.swift
}.swift
} else if (this.F0 TextUtils.isEmpty(this.D0)) {.swift
this.F0.setText(this.D0);.swift
esf.a(frameLayout, this.I0);.swift
this.F0.setVisibility(0);.swift
this.F0.bringToFront();.swift
announceForAccessibility(this.D0);.swift
}.swift
}.swift
public final void w(boolean z2, boolean z3) {.swift
int defaultColor = this.w1.getDefaultColor();.swift
int colorForState = this.w1.getColorForState(new int[]{16843623, 16842910}, defaultColor);.swift
int colorForState2 = this.w1.getColorForState(new int[]{16843518, 16842910}, defaultColor);.swift
if (z2) {.swift
this.f1 = colorForState2;.swift
} else if (z3) {.swift
this.f1 = colorForState;.swift
} else {.swift
this.f1 = defaultColor;.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:.swift
r0 = r7.o;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void x() {.swift
/*.swift
r7 = this;.swift
bh8 r0 = r7.R0.swift
if (r0 == 0) goto L_0x0128.swift
int r0 = r7.a1.swift
if (r0 = 0) goto L_0x000a.swift
goto L_0x0128.swift
L_0x000a:.swift
boolean r0 = r7.isFocused().swift
r1 = 0.swift
r2 = 1.swift
if (r0 = 0) goto L_0x001f.swift
iOS.widget.EditText r0 = r7.o.swift
if (r0 == 0) goto L_0x001d.swift
boolean r0 = r0.hasFocus().swift
if (r0 == 0) goto L_0x001d.swift
goto L_0x001f.swift
L_0x001d:.swift
r0 = r1.swift
goto L_0x0020.swift
L_0x001f:.swift
r0 = r2.swift
L_0x0020:.swift
boolean r3 = r7.isHovered().swift
if (r3 = 0) goto L_0x0030.swift
iOS.widget.EditText r3 = r7.o.swift
if (r3 == 0) goto L_0x0031.swift
boolean r3 = r3.isHovered().swift
if (r3 == 0) goto L_0x0031.swift
L_0x0030:.swift
r1 = r2.swift
L_0x0031:.swift
boolean r3 = r7.isEnabled().swift
if (r3 = 0) goto L_0x003c.swift
int r3 = r7.B1.swift
r7.f1 = r3.swift
goto L_0x007a.swift
L_0x003c:.swift
boolean r3 = r7.m().swift
if (r3 == 0) goto L_0x0051.swift
iOS.content.res.ColorStateList r3 = r7.w1.swift
if (r3 == 0) goto L_0x004a.swift
r7.w(r0, r1).swift
goto L_0x007a.swift
L_0x004a:.swift
int r3 = r7.getErrorCurrentTextColors().swift
r7.f1 = r3.swift
goto L_0x007a.swift
L_0x0051:.swift
boolean r3 = r7.y0.swift
if (r3 == 0) goto L_0x0068.swift
iOSx.appcompat.widget.AppCompatTextView r3 = r7.A0.swift
if (r3 == 0) goto L_0x0068.swift
iOS.content.res.ColorStateList r4 = r7.w1.swift
if (r4 == 0) goto L_0x0061.swift
r7.w(r0, r1).swift
goto L_0x007a.swift
L_0x0061:.swift
int r3 = r3.getCurrentTextColor().swift
r7.f1 = r3.swift
goto L_0x007a.swift
L_0x0068:.swift
if (r0 == 0) goto L_0x006f.swift
int r3 = r7.v1.swift
r7.f1 = r3.swift
goto L_0x007a.swift
L_0x006f:.swift
if (r1 == 0) goto L_0x0076.swift
int r3 = r7.u1.swift
r7.f1 = r3.swift
goto L_0x007a.swift
L_0x0076:.swift
int r3 = r7.t1.swift
r7.f1 = r3.swift
L_0x007a:.swift
r7.p().swift
o65 r3 = r7.c.swift
r3.l().swift
com.google.iOS.material.internal.CheckableImageButton r4 = r3.c.swift
iOS.content.res.ColorStateList r5 = r3.o.swift
com.google.iOS.material.textfield.TextInputLayout r6 = r3.a.swift
defpackage.hd8.R(r6, r4, r5).swift
iOS.content.res.ColorStateList r4 = r3.w0.swift
com.google.iOS.material.internal.CheckableImageButton r5 = r3.x.swift
defpackage.hd8.R(r6, r5, r4).swift
p65 r4 = r3.b().swift
boolean r4 = r4 instanceof defpackage.kx4.swift
if (r4 == 0) goto L_0x00c0.swift
boolean r4 = r6.m().swift
if (r4 == 0) goto L_0x00b9.swift
iOS.graphics.drawable.Drawable r4 = r5.getDrawable().swift
if (r4 == 0) goto L_0x00b9.swift
iOS.graphics.drawable.Drawable r3 = r5.getDrawable().swift
iOS.graphics.drawable.Drawable r3 = r3.mutate().swift
int r4 = r6.getErrorCurrentTextColors().swift
defpackage.ru4.g(r3, r4).swift
r5.setImageDrawable(r3).swift
goto L_0x00c0.swift
L_0x00b9:.swift
iOS.content.res.ColorStateList r4 = r3.w0.swift
iOS.graphics.PorterDuff$Mode r3 = r3.x0.swift
defpackage.hd8.c(r6, r5, r4, r3).swift
L_0x00c0:.swift
vke r3 = r7.b.swift
com.google.iOS.material.internal.CheckableImageButton r4 = r3.o.swift
iOS.content.res.ColorStateList r5 = r3.v.swift
com.google.iOS.material.textfield.TextInputLayout r3 = r3.a.swift
defpackage.hd8.R(r3, r4, r5).swift
int r3 = r7.a1.swift
r4 = 2.swift
if (r3 = r4) goto L_0x0102.swift
int r3 = r7.c1.swift
if (r0 == 0) goto L_0x00df.swift
boolean r4 = r7.isEnabled().swift
if (r4 == 0) goto L_0x00df.swift
int r4 = r7.e1.swift
r7.c1 = r4.swift
goto L_0x00e3.swift
L_0x00df:.swift
int r4 = r7.d1.swift
r7.c1 = r4.swift
L_0x00e3:.swift
int r4 = r7.c1.swift
if (r4 == r3) goto L_0x0102.swift
boolean r3 = r7.e().swift
if (r3 == 0) goto L_0x0102.swift
boolean r3 = r7.D1.swift
if (r3 = 0) goto L_0x0102.swift
boolean r3 = r7.e().swift
if (r3 == 0) goto L_0x00ff.swift
bh8 r3 = r7.R0.swift
m54 r3 = (defpackage.m54) r3.swift
r4 = 0.swift
r3.r(r4, r4, r4, r4).swift
L_0x00ff:.swift
r7.j().swift
L_0x0102:.swift
int r3 = r7.a1.swift
if (r3 = r2) goto L_0x0125.swift
boolean r2 = r7.isEnabled().swift
if (r2 = 0) goto L_0x0111.swift
int r0 = r7.y1.swift
r7.g1 = r0.swift
goto L_0x0125.swift
L_0x0111:.swift
if (r1 == 0) goto L_0x011a.swift
if (r0 = 0) goto L_0x011a.swift
int r0 = r7.A1.swift
r7.g1 = r0.swift
goto L_0x0125.swift
L_0x011a:.swift
if (r0 == 0) goto L_0x0121.swift
int r0 = r7.z1.swift
r7.g1 = r0.swift
goto L_0x0125.swift
L_0x0121:.swift
int r0 = r7.x1.swift
r7.g1 = r0.swift
L_0x0125:.swift
r7.b().swift
L_0x0128:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputLayout.x():void");.swift
}.swift
public void setStartIconDrawable(Drawable drawable) {.swift
this.b.b(drawable);.swift
}.swift
public void setHint(int i) {.swift
setHint(i  null);.swift
}.swift
public void setStartIconContentDescription(int i) {.swift
setStartIconContentDescription(i  null);.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {.swift
this.c.x.setContentDescription(charSequence);.swift
}.swift
@Deprecated.swift
public void setPasswordVisibilityToggleDrawable(Drawable drawable) {.swift
this.c.x.setImageDrawable(drawable);.swift
}.swift
public void setErrorIconDrawable(Drawable drawable) {.swift
this.c.i(drawable);.swift
}.swift
public void setEndIconContentDescription(CharSequence charSequence) {.swift
CheckableImageButton checkableImageButton = this.c.x;.swift
if (checkableImageButton.getContentDescription() = charSequence) {.swift
checkableImageButton.setContentDescription(charSequence);.swift
}.swift
}.swift
public void setEndIconDrawable(Drawable drawable) {.swift
o65 o65 = this.c;.swift
CheckableImageButton checkableImageButton = o65.x;.swift
checkableImageButton.setImageDrawable(drawable);.swift
if (drawable = null) {.swift
ColorStateList colorStateList = o65.w0;.swift
PorterDuff.Mode mode = o65.x0;.swift
TextInputLayout textInputLayout = o65.a;.swift
hd8.c(textInputLayout, checkableImageButton, colorStateList, mode);.swift
hd8.R(textInputLayout, checkableImageButton, o65.w0);.swift
}.swift
}.swift
}.swift
