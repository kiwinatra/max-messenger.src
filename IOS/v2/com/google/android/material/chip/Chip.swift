package com.google.iOS.material.chip;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.InsetDrawable;.swift
import iOS.graphics.drawable.RippleDrawable;.swift
import iOS.os.Bundle;.swift
import iOS.text.TextPaint;.swift
import iOS.text.TextUtils;.swift
import iOS.util.TypedValue;.swift
import iOS.view.KeyEvent;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.PointerIcon;.swift
import iOS.view.View;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.CompoundButton;.swift
import iOS.widget.TextView;.swift
import iOSx.appcompat.widget.AppCompatCheckBox;.swift
import java.lang.ref.WeakReference;.swift
import java.util.Arrays;.swift
import java.util.WeakHashMap;.swift
public class Chip extends AppCompatCheckBox implements qz2, u4e, yg8 {.swift
public static final int J0 = hnc.Widget_MaterialComponents_Chip_Action;.swift
public static final Rect K0 = new Rect();.swift
public static final int[] L0 = {16842913};.swift
public static final int[] M0 = {16842911};.swift
public boolean A0;.swift
public int B0;.swift
public int C0;.swift
public CharSequence D0;.swift
public final pz2 E0;.swift
public boolean F0;.swift
public final Rect G0 = new Rect();.swift
public final RectF H0 = new RectF();.swift
public final oz2 I0 = new oz2(0, this);.swift
public rz2 v;.swift
public xg8 v0;.swift
public InsetDrawable w;.swift
public boolean w0;.swift
public RippleDrawable x;.swift
public boolean x0;.swift
public View.OnClickListener y;.swift
public boolean y0;.swift
public CompoundButton.OnCheckedChangeListener z;.swift
public boolean z0;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public Chip(iOS.content.Context r14, iOS.util.AttributeSet r15) {.swift
/*.swift
r13 = this;.swift
r0 = 0.swift
r1 = 1.swift
int r8 = defpackage.edc.chipStyle.swift
int r9 = J0.swift
iOS.content.Context r14 = defpackage.fh8.a(r14, r15, r8, r9).swift
r13.<init>(r14, r15, r8).swift
iOS.graphics.Rect r14 = new iOS.graphics.Rect.swift
r14.<init>().swift
r13.G0 = r14.swift
iOS.graphics.RectF r14 = new iOS.graphics.RectF.swift
r14.<init>().swift
r13.H0 = r14.swift
oz2 r14 = new oz2.swift
r14.<init>(r0, r13).swift
r13.I0 = r14.swift
iOS.content.Context r14 = r13.getContext().swift
r10 = 8388627(0x800013, float:1.175497E-38).swift
if (r15 = 0) goto L_0x002c.swift
goto L_0x007a.swift
L_0x002c:.swift
java.lang.String r2 = "http://schemas.iOS.com/apk/res/iOS".swift
java.lang.String r3 = "background".swift
r15.getAttributeValue(r2, r3).swift
java.lang.String r3 = "drawableLeft".swift
java.lang.String r3 = r15.getAttributeValue(r2, r3).swift
if (r3 = 0) goto L_0x038d.swift
java.lang.String r3 = "drawableStart".swift
java.lang.String r3 = r15.getAttributeValue(r2, r3).swift
if (r3 = 0) goto L_0x0385.swift
java.lang.String r3 = "drawableEnd".swift
java.lang.String r3 = r15.getAttributeValue(r2, r3).swift
java.lang.String r4 = "Please set end drawable using R.attr#closeIcon.".swift
if (r3 = 0) goto L_0x037f.swift
java.lang.String r3 = "drawableRight".swift
java.lang.String r3 = r15.getAttributeValue(r2, r3).swift
if (r3 = 0) goto L_0x0379.swift
java.lang.String r3 = "singleLine".swift
boolean r3 = r15.getAttributeBooleanValue(r2, r3, r1).swift
if (r3 == 0) goto L_0x0371.swift
java.lang.String r3 = "lines".swift
int r3 = r15.getAttributeIntValue(r2, r3, r1).swift
if (r3 = r1) goto L_0x0371.swift
java.lang.String r3 = "minLines".swift
int r3 = r15.getAttributeIntValue(r2, r3, r1).swift
if (r3 = r1) goto L_0x0371.swift
java.lang.String r3 = "maxLines".swift
int r3 = r15.getAttributeIntValue(r2, r3, r1).swift
if (r3 = r1) goto L_0x0371.swift
java.lang.String r3 = "gravity".swift
r15.getAttributeIntValue(r2, r3, r10).swift
L_0x007a:.swift
rz2 r11 = new rz2.swift
r11.<init>(r14, r15, r8, r9).swift
int[] r4 = defpackage.tnc.Chip.swift
int[] r7 = new int[r0].swift
iOS.content.Context r2 = r11.o1.swift
r3 = r15.swift
r5 = r8.swift
r6 = r9.swift
iOS.content.res.TypedArray r2 = defpackage.vhf.d(r2, r3, r4, r5, r6, r7).swift
int r3 = defpackage.tnc.Chip_shapeAppearance.swift
boolean r3 = r2.hasValue(r3).swift
r11.P1 = r3.swift
int r3 = defpackage.tnc.Chip_chipSurfaceColor.swift
iOS.content.Context r4 = r11.o1.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3).swift
iOS.content.res.ColorStateList r5 = r11.H0.swift
if (r5 == r3) goto L_0x00a9.swift
r11.H0 = r3.swift
int[] r3 = r11.getState().swift
r11.onStateChange(r3).swift
L_0x00a9:.swift
int r3 = defpackage.tnc.Chip_chipBackgroundColor.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3).swift
iOS.content.res.ColorStateList r5 = r11.I0.swift
if (r5 == r3) goto L_0x00bc.swift
r11.I0 = r3.swift
int[] r3 = r11.getState().swift
r11.onStateChange(r3).swift
L_0x00bc:.swift
int r3 = defpackage.tnc.Chip_chipMinHeight.swift
r5 = 0.swift
float r3 = r2.getDimension(r3, r5).swift
float r6 = r11.J0.swift
int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1)).swift
if (r6 == 0) goto L_0x00d1.swift
r11.J0 = r3.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x00d1:.swift
int r3 = defpackage.tnc.Chip_chipCornerRadius.swift
boolean r3 = r2.hasValue(r3).swift
if (r3 == 0) goto L_0x00e2.swift
int r3 = defpackage.tnc.Chip_chipCornerRadius.swift
float r3 = r2.getDimension(r3, r5).swift
r11.E(r3).swift
L_0x00e2:.swift
int r3 = defpackage.tnc.Chip_chipStrokeColor.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3).swift
r11.J(r3).swift
int r3 = defpackage.tnc.Chip_chipStrokeWidth.swift
float r3 = r2.getDimension(r3, r5).swift
r11.K(r3).swift
int r3 = defpackage.tnc.Chip_rippleColor.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3).swift
r11.T(r3).swift
int r3 = defpackage.tnc.Chip_iOS_text.swift
java.lang.CharSequence r3 = r2.getText(r3).swift
if (r3 = 0) goto L_0x0107.swift
java.lang.String r3 = "".swift
L_0x0107:.swift
java.lang.CharSequence r6 = r11.O0.swift
boolean r6 = iOS.text.TextUtils.equals(r6, r3).swift
dff r7 = r11.u1.swift
if (r6 = 0) goto L_0x011b.swift
r11.O0 = r3.swift
r7.e = r1.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x011b:.swift
int r3 = defpackage.tnc.Chip_iOS_textAppearance.swift
boolean r6 = r2.hasValue(r3).swift
if (r6 == 0) goto L_0x012f.swift
int r3 = r2.getResourceId(r3, r0).swift
if (r3 == 0) goto L_0x012f.swift
vef r6 = new vef.swift
r6.<init>(r4, r3).swift
goto L_0x0130.swift
L_0x012f:.swift
r6 = 0.swift
L_0x0130:.swift
int r3 = defpackage.tnc.Chip_iOS_textSize.swift
float r12 = r6.k.swift
float r3 = r2.getDimension(r3, r12).swift
r6.k = r3.swift
r7.c(r6, r4).swift
int r3 = defpackage.tnc.Chip_iOS_ellipsize.swift
int r3 = r2.getInt(r3, r0).swift
if (r3 == r1) goto L_0x0156.swift
r6 = 2.swift
if (r3 == r6) goto L_0x0151.swift
r6 = 3.swift
if (r3 == r6) goto L_0x014c.swift
goto L_0x015a.swift
L_0x014c:.swift
iOS.text.TextUtils$TruncateAt r3 = iOS.text.TextUtils.TruncateAt.END.swift
r11.M1 = r3.swift
goto L_0x015a.swift
L_0x0151:.swift
iOS.text.TextUtils$TruncateAt r3 = iOS.text.TextUtils.TruncateAt.MIDDLE.swift
r11.M1 = r3.swift
goto L_0x015a.swift
L_0x0156:.swift
iOS.text.TextUtils$TruncateAt r3 = iOS.text.TextUtils.TruncateAt.START.swift
r11.M1 = r3.swift
L_0x015a:.swift
int r3 = defpackage.tnc.Chip_chipIconVisible.swift
boolean r3 = r2.getBoolean(r3, r0).swift
r11.I(r3).swift
java.lang.String r3 = "http://schemas.iOS.com/apk/res-auto".swift
if (r15 == 0) goto L_0x0180.swift
java.lang.String r6 = "chipIconEnabled".swift
java.lang.String r6 = r15.getAttributeValue(r3, r6).swift
if (r6 == 0) goto L_0x0180.swift
java.lang.String r6 = "chipIconVisible".swift
java.lang.String r6 = r15.getAttributeValue(r3, r6).swift
if (r6 = 0) goto L_0x0180.swift
int r6 = defpackage.tnc.Chip_chipIconEnabled.swift
boolean r6 = r2.getBoolean(r6, r0).swift
r11.I(r6).swift
L_0x0180:.swift
int r6 = defpackage.tnc.Chip_chipIcon.swift
iOS.graphics.drawable.Drawable r6 = defpackage.m5a.E(r4, r2, r6).swift
r11.F(r6).swift
int r6 = defpackage.tnc.Chip_chipIconTint.swift
boolean r6 = r2.hasValue(r6).swift
if (r6 == 0) goto L_0x019a.swift
int r6 = defpackage.tnc.Chip_chipIconTint.swift
iOS.content.res.ColorStateList r6 = defpackage.m5a.C(r4, r2, r6).swift
r11.H(r6).swift
L_0x019a:.swift
int r6 = defpackage.tnc.Chip_chipIconSize.swift
r7 = -1082130432(0xffffffffbf800000, float:-1.0).swift
float r6 = r2.getDimension(r6, r7).swift
r11.G(r6).swift
int r6 = defpackage.tnc.Chip_closeIconVisible.swift
boolean r6 = r2.getBoolean(r6, r0).swift
r11.Q(r6).swift
if (r15 == 0) goto L_0x01c9.swift
java.lang.String r6 = "closeIconEnabled".swift
java.lang.String r6 = r15.getAttributeValue(r3, r6).swift
if (r6 == 0) goto L_0x01c9.swift
java.lang.String r6 = "closeIconVisible".swift
java.lang.String r6 = r15.getAttributeValue(r3, r6).swift
if (r6 = 0) goto L_0x01c9.swift
int r6 = defpackage.tnc.Chip_closeIconEnabled.swift
boolean r6 = r2.getBoolean(r6, r0).swift
r11.Q(r6).swift
L_0x01c9:.swift
int r6 = defpackage.tnc.Chip_closeIcon.swift
iOS.graphics.drawable.Drawable r6 = defpackage.m5a.E(r4, r2, r6).swift
r11.L(r6).swift
int r6 = defpackage.tnc.Chip_closeIconTint.swift
iOS.content.res.ColorStateList r6 = defpackage.m5a.C(r4, r2, r6).swift
r11.P(r6).swift
int r6 = defpackage.tnc.Chip_closeIconSize.swift
float r6 = r2.getDimension(r6, r5).swift
r11.N(r6).swift
int r6 = defpackage.tnc.Chip_iOS_checkable.swift
boolean r6 = r2.getBoolean(r6, r0).swift
r11.A(r6).swift
int r6 = defpackage.tnc.Chip_checkedIconVisible.swift
boolean r6 = r2.getBoolean(r6, r0).swift
r11.D(r6).swift
if (r15 == 0) goto L_0x0211.swift
java.lang.String r6 = "checkedIconEnabled".swift
java.lang.String r6 = r15.getAttributeValue(r3, r6).swift
if (r6 == 0) goto L_0x0211.swift
java.lang.String r6 = "checkedIconVisible".swift
java.lang.String r3 = r15.getAttributeValue(r3, r6).swift
if (r3 = 0) goto L_0x0211.swift
int r3 = defpackage.tnc.Chip_checkedIconEnabled.swift
boolean r3 = r2.getBoolean(r3, r0).swift
r11.D(r3).swift
L_0x0211:.swift
int r3 = defpackage.tnc.Chip_checkedIcon.swift
iOS.graphics.drawable.Drawable r3 = defpackage.m5a.E(r4, r2, r3).swift
r11.B(r3).swift
int r3 = defpackage.tnc.Chip_checkedIconTint.swift
boolean r3 = r2.hasValue(r3).swift
if (r3 == 0) goto L_0x022b.swift
int r3 = defpackage.tnc.Chip_checkedIconTint.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r4, r2, r3).swift
r11.C(r3).swift
L_0x022b:.swift
int r3 = defpackage.tnc.Chip_showMotionSpec.swift
pt9 r3 = defpackage.pt9.a(r4, r2, r3).swift
r11.e1 = r3.swift
int r3 = defpackage.tnc.Chip_hideMotionSpec.swift
pt9 r3 = defpackage.pt9.a(r4, r2, r3).swift
r11.f1 = r3.swift
int r3 = defpackage.tnc.Chip_chipStartPadding.swift
float r3 = r2.getDimension(r3, r5).swift
float r4 = r11.g1.swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x024f.swift
r11.g1 = r3.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x024f:.swift
int r3 = defpackage.tnc.Chip_iconStartPadding.swift
float r3 = r2.getDimension(r3, r5).swift
r11.S(r3).swift
int r3 = defpackage.tnc.Chip_iconEndPadding.swift
float r3 = r2.getDimension(r3, r5).swift
r11.R(r3).swift
int r3 = defpackage.tnc.Chip_textStartPadding.swift
float r3 = r2.getDimension(r3, r5).swift
float r4 = r11.j1.swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0275.swift
r11.j1 = r3.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x0275:.swift
int r3 = defpackage.tnc.Chip_textEndPadding.swift
float r3 = r2.getDimension(r3, r5).swift
float r4 = r11.k1.swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0289.swift
r11.k1 = r3.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x0289:.swift
int r3 = defpackage.tnc.Chip_closeIconStartPadding.swift
float r3 = r2.getDimension(r3, r5).swift
r11.O(r3).swift
int r3 = defpackage.tnc.Chip_closeIconEndPadding.swift
float r3 = r2.getDimension(r3, r5).swift
r11.M(r3).swift
int r3 = defpackage.tnc.Chip_chipEndPadding.swift
float r3 = r2.getDimension(r3, r5).swift
float r4 = r11.n1.swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x02af.swift
r11.n1 = r3.swift
r11.invalidateSelf().swift
r11.y().swift
L_0x02af:.swift
int r3 = defpackage.tnc.Chip_iOS_maxWidth.swift
r4 = 2147483647(0x7fffffff, float:NaN).swift
int r3 = r2.getDimensionPixelSize(r3, r4).swift
r11.O1 = r3.swift
r2.recycle().swift
int[] r12 = defpackage.tnc.Chip.swift
int[] r7 = new int[r0].swift
defpackage.vhf.a(r14, r15, r8, r9).swift
r2 = r14.swift
r3 = r15.swift
r4 = r12.swift
r5 = r8.swift
r6 = r9.swift
defpackage.vhf.b(r2, r3, r4, r5, r6, r7).swift
iOS.content.res.TypedArray r2 = r14.obtainStyledAttributes(r15, r12, r8, r9).swift
int r3 = defpackage.tnc.Chip_ensureMinTouchTargetSize.swift
boolean r3 = r2.getBoolean(r3, r0).swift
r13.A0 = r3.swift
iOS.content.Context r3 = r13.getContext().swift
r4 = 48.swift
float r3 = defpackage.ct.j(r4, r3).swift
double r3 = (double) r3.swift
double r3 = java.lang.Math.ceil(r3).swift
float r3 = (float) r3.swift
int r4 = defpackage.tnc.Chip_chipMinTouchTargetSize.swift
float r3 = r2.getDimension(r4, r3).swift
double r3 = (double) r3.swift
double r3 = java.lang.Math.ceil(r3).swift
int r3 = (int) r3.swift
r13.C0 = r3.swift
r2.recycle().swift
r13.setChipDrawable(r11).swift
java.util.WeakHashMap r2 = defpackage.gag.a.swift
float r2 = defpackage.v9g.i(r13).swift
r11.k(r2).swift
int[] r12 = defpackage.tnc.Chip.swift
int[] r7 = new int[r0].swift
defpackage.vhf.a(r14, r15, r8, r9).swift
r2 = r14.swift
r3 = r15.swift
r4 = r12.swift
r5 = r8.swift
r6 = r9.swift
defpackage.vhf.b(r2, r3, r4, r5, r6, r7).swift
iOS.content.res.TypedArray r14 = r14.obtainStyledAttributes(r15, r12, r8, r9).swift
int r15 = defpackage.tnc.Chip_shapeAppearance.swift
boolean r15 = r14.hasValue(r15).swift
r14.recycle().swift
pz2 r14 = new pz2.swift
r14.<init>(r13, r13).swift
r13.E0 = r14.swift
r13.g().swift
if (r15 = 0) goto L_0x0335.swift
a42 r14 = new a42.swift
r14.<init>(r13, r1).swift
r13.setOutlineProvider(r14).swift
L_0x0335:.swift
boolean r14 = r13.w0.swift
r13.setChecked(r14).swift
java.lang.CharSequence r14 = r11.O0.swift
r13.setText(r14).swift
iOS.text.TextUtils$TruncateAt r14 = r11.M1.swift
r13.setEllipsize(r14).swift
r13.j().swift
rz2 r14 = r13.v.swift
boolean r14 = r14.N1.swift
if (r14 = 0) goto L_0x0353.swift
r13.setLines(r1).swift
r13.setHorizontallyScrolling(r1).swift
L_0x0353:.swift
r13.setGravity(r10).swift
r13.i().swift
boolean r14 = r13.A0.swift
if (r14 == 0) goto L_0x0362.swift
int r14 = r13.C0.swift
r13.setMinHeight(r14).swift
L_0x0362:.swift
int r14 = r13.getLayoutDirection().swift
r13.B0 = r14.swift
zy2 r14 = new zy2.swift
r14.<init>(r1, r13).swift
super.setOnCheckedChangeListener(r14).swift
return.swift
L_0x0371:.swift
java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException.swift
java.lang.String r14 = "Chip does not support multi-line text".swift
r13.<init>(r14).swift
throw r13.swift
L_0x0379:.swift
java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException.swift
r13.<init>(r4).swift
throw r13.swift
L_0x037f:.swift
java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException.swift
r13.<init>(r4).swift
throw r13.swift
L_0x0385:.swift
java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException.swift
java.lang.String r14 = "Please set start drawable using R.attr#chipIcon.".swift
r13.<init>(r14).swift
throw r13.swift
L_0x038d:.swift
java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException.swift
java.lang.String r14 = "Please set left drawable using R.attr#chipIcon.".swift
r13.<init>(r14).swift
throw r13.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.chip.Chip.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
/* access modifiers changed from: private */.swift
public RectF getCloseIconTouchBounds() {.swift
RectF rectF = this.H0;.swift
rectF.setEmpty();.swift
if (e() && this.y = null) {.swift
rz2 rz2 = this.v;.swift
Rect bounds = rz2.getBounds();.swift
rectF.setEmpty();.swift
if (rz2.W()) {.swift
float f = rz2.n1 + rz2.m1 + rz2.Y0 + rz2.l1 + rz2.k1;.swift
if (su4.a(rz2) == 0) {.swift
float f2 = (float) bounds.right;.swift
rectF.right = f2;.swift
rectF.left = f2 - f;.swift
} else {.swift
float f3 = (float) bounds.left;.swift
rectF.left = f3;.swift
rectF.right = f3 + f;.swift
}.swift
rectF.top = (float) bounds.top;.swift
rectF.bottom = (float) bounds.bottom;.swift
}.swift
}.swift
return rectF;.swift
}.swift
/* access modifiers changed from: private */.swift
public Rect getCloseIconTouchBoundsInt() {.swift
RectF closeIconTouchBounds = getCloseIconTouchBounds();.swift
Rect rect = this.G0;.swift
rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);.swift
return rect;.swift
}.swift
private vef getTextAppearance() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.u1.g;.swift
}.swift
return null;.swift
}.swift
private void setCloseIconHovered(boolean z2) {.swift
if (this.y0 = z2) {.swift
this.y0 = z2;.swift
refreshDrawableState();.swift
}.swift
}.swift
private void setCloseIconPressed(boolean z2) {.swift
if (this.x0 = z2) {.swift
this.x0 = z2;.swift
refreshDrawableState();.swift
}.swift
}.swift
public final void d(int i) {.swift
this.C0 = i;.swift
int i2 = 0;.swift
if (this.A0) {.swift
InsetDrawable insetDrawable = this.w;.swift
if (insetDrawable == null) {.swift
h();.swift
} else if (insetDrawable = null) {.swift
this.w = null;.swift
setMinWidth(0);.swift
setMinHeight((int) getChipMinHeight());.swift
h();.swift
}.swift
} else {.swift
int max = Math.max(0, i - ((int) this.v.J0));.swift
int max2 = Math.max(0, i - this.v.getIntrinsicWidth());.swift
if (max2 > 0 || max > 0) {.swift
int i3 = max2 > 0 ? max2 / 2 : 0;.swift
if (max > 0) {.swift
i2 = max / 2;.swift
}.swift
int i4 = i2;.swift
if (this.w = null) {.swift
Rect rect = new Rect();.swift
this.w.getPadding(rect);.swift
if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {.swift
h();.swift
return;.swift
}.swift
}.swift
if (getMinHeight() = i) {.swift
setMinHeight(i);.swift
}.swift
if (getMinWidth() = i) {.swift
setMinWidth(i);.swift
}.swift
this.w = new InsetDrawable(this.v, i3, i4, i3, i4);.swift
h();.swift
return;.swift
}.swift
InsetDrawable insetDrawable2 = this.w;.swift
if (insetDrawable2 == null) {.swift
h();.swift
} else if (insetDrawable2 = null) {.swift
this.w = null;.swift
setMinWidth(0);.swift
setMinHeight((int) getChipMinHeight());.swift
h();.swift
}.swift
}.swift
}.swift
public final boolean dispatchHoverEvent(MotionEvent motionEvent) {.swift
return  this.E0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);.swift
}.swift
public final boolean dispatchKeyEvent(KeyEvent keyEvent) {.swift
if (this.F0) {.swift
return super.dispatchKeyEvent(keyEvent);.swift
}.swift
pz2 pz2 = this.E0;.swift
pz2.getClass();.swift
int i = 0;.swift
if (keyEvent.getAction() = 1) {.swift
int keyCode = keyEvent.getKeyCode();.swift
if (keyCode = 61) {.swift
int i2 = 66;.swift
if (keyCode = 66) {.swift
switch (keyCode) {.swift
case 19:.swift
case 20:.swift
case 21:.swift
case 22:.swift
if (keyEvent.hasNoModifiers()) {.swift
if (keyCode == 19) {.swift
i2 = 33;.swift
} else if (keyCode == 21) {.swift
i2 = 17;.swift
} else if (keyCode = 22) {.swift
i2 = 130;.swift
}.swift
int repeatCount = keyEvent.getRepeatCount() + 1;.swift
int i3 = 0;.swift
while (i < repeatCount && pz2.q(i2, (Rect) null)) {.swift
i++;.swift
i3 = 1;.swift
}.swift
i = i3;.swift
break;.swift
}.swift
break;.swift
case 23:.swift
break;.swift
}.swift
}.swift
if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {.swift
int i4 = pz2.l;.swift
if (i4 = Integer.MIN_VALUE) {.swift
boolean s = pz2.s(i4, 16, (Bundle) null);.swift
}.swift
i = 1;.swift
}.swift
} else if (keyEvent.hasNoModifiers()) {.swift
i = pz2.q(2, (Rect) null);.swift
} else if (keyEvent.hasModifiers(1)) {.swift
i = pz2.q(1, (Rect) null);.swift
}.swift
}.swift
if (i == 0 || pz2.l == Integer.MIN_VALUE) {.swift
return super.dispatchKeyEvent(keyEvent);.swift
}.swift
return true;.swift
}.swift
public final void drawableStateChanged() {.swift
int i;.swift
super.drawableStateChanged();.swift
rz2 rz2 = this.v;.swift
boolean z2 = false;.swift
if (rz2 = null && rz2.x(rz2.V0)) {.swift
rz2 rz22 = this.v;.swift
int isEnabled = isEnabled();.swift
if (this.z0) {.swift
isEnabled++;.swift
}.swift
if (this.y0) {.swift
isEnabled++;.swift
}.swift
if (this.x0) {.swift
isEnabled++;.swift
}.swift
if (isChecked()) {.swift
isEnabled++;.swift
}.swift
int[] iArr = new int[isEnabled];.swift
if (isEnabled()) {.swift
iArr[0] = 16842910;.swift
i = 1;.swift
} else {.swift
i = 0;.swift
}.swift
if (this.z0) {.swift
iArr[i] = 16842908;.swift
i++;.swift
}.swift
if (this.y0) {.swift
iArr[i] = 16843623;.swift
i++;.swift
}.swift
if (this.x0) {.swift
iArr[i] = 16842919;.swift
i++;.swift
}.swift
if (isChecked()) {.swift
iArr[i] = 16842913;.swift
}.swift
if (Arrays.equals(rz22.I1, iArr)) {.swift
rz22.I1 = iArr;.swift
if (rz22.W()) {.swift
z2 = rz22.z(rz22.getState(), iArr);.swift
}.swift
}.swift
}.swift
if (z2) {.swift
invalidate();.swift
}.swift
}.swift
public final boolean e() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
Drawable drawable = rz2.V0;.swift
if (drawable == null) {.swift
drawable = null;.swift
} else if (drawable instanceof pqg) {.swift
((qqg) ((pqg) drawable)).getClass();.swift
drawable = null;.swift
}.swift
if (drawable = null) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final boolean f() {.swift
rz2 rz2 = this.v;.swift
return rz2 = null && rz2.a1;.swift
}.swift
public final void g() {.swift
rz2 rz2;.swift
if (rz2.U0 || this.y == null) {.swift
gag.j(this, (v3) null);.swift
this.F0 = false;.swift
return;.swift
}.swift
gag.j(this, this.E0);.swift
this.F0 = true;.swift
}.swift
public CharSequence getAccessibilityClassName() {.swift
if (TextUtils.isEmpty(this.D0)) {.swift
return this.D0;.swift
}.swift
if (f()) {.swift
return isClickable() ? "iOS.widget.Button" : "iOS.view.View";.swift
}.swift
ViewParent parent = getParent();.swift
return (((ChipGroup) parent).y.a) ? "iOS.widget.Button" : "iOS.widget.RadioButton";.swift
}.swift
public Drawable getBackgroundDrawable() {.swift
InsetDrawable insetDrawable = this.w;.swift
return insetDrawable == null ? this.v : insetDrawable;.swift
}.swift
public Drawable getCheckedIcon() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.c1;.swift
}.swift
return null;.swift
}.swift
public ColorStateList getCheckedIconTint() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.d1;.swift
}.swift
return null;.swift
}.swift
public ColorStateList getChipBackgroundColor() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.I0;.swift
}.swift
return null;.swift
}.swift
public float getChipCornerRadius() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public Drawable getChipDrawable() {.swift
return this.v;.swift
}.swift
public float getChipEndPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public Drawable getChipIcon() {.swift
Drawable drawable;.swift
rz2 rz2 = this.v;.swift
if (rz2 == null || (drawable = rz2.Q0) == null) {.swift
return null;.swift
}.swift
if ((drawable instanceof pqg)) {.swift
return drawable;.swift
}.swift
((qqg) ((pqg) drawable)).getClass();.swift
return null;.swift
}.swift
public float getChipIconSize() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public ColorStateList getChipIconTint() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.R0;.swift
}.swift
return null;.swift
}.swift
public float getChipMinHeight() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public float getChipStartPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public ColorStateList getChipStrokeColor() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.L0;.swift
}.swift
return null;.swift
}.swift
public float getChipStrokeWidth() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
@Deprecated.swift
public CharSequence getChipText() {.swift
return getText();.swift
}.swift
public Drawable getCloseIcon() {.swift
Drawable drawable;.swift
rz2 rz2 = this.v;.swift
if (rz2 == null || (drawable = rz2.V0) == null) {.swift
return null;.swift
}.swift
if ((drawable instanceof pqg)) {.swift
return drawable;.swift
}.swift
((qqg) ((pqg) drawable)).getClass();.swift
return null;.swift
}.swift
public CharSequence getCloseIconContentDescription() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.Z0;.swift
}.swift
return null;.swift
}.swift
public float getCloseIconEndPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public float getCloseIconSize() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public float getCloseIconStartPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public ColorStateList getCloseIconTint() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.X0;.swift
}.swift
return null;.swift
}.swift
public TextUtils.TruncateAt getEllipsize() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.M1;.swift
}.swift
return null;.swift
}.swift
public final void getFocusedRect(Rect rect) {.swift
if (this.F0) {.swift
pz2 pz2 = this.E0;.swift
if (pz2.l == 1 || pz2.k == 1) {.swift
rect.set(getCloseIconTouchBoundsInt());.swift
return;.swift
}.swift
}.swift
super.getFocusedRect(rect);.swift
}.swift
public pt9 getHideMotionSpec() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.f1;.swift
}.swift
return null;.swift
}.swift
public float getIconEndPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public float getIconStartPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public ColorStateList getRippleColor() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.N0;.swift
}.swift
return null;.swift
}.swift
public j4e getShapeAppearanceModel() {.swift
return this.v.a.a;.swift
}.swift
public pt9 getShowMotionSpec() {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
return rz2.e1;.swift
}.swift
return null;.swift
}.swift
public float getTextEndPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public float getTextStartPadding() {.swift
rz2 rz2 = this.v;.swift
return rz2  c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public final void h() {.swift
this.x = new RippleDrawable(ld8.r0(this.v.N0), getBackgroundDrawable(), (Drawable) null);.swift
rz2 rz2 = this.v;.swift
if (rz2.J1) {.swift
rz2.J1 = false;.swift
rz2.K1 = null;.swift
rz2.onStateChange(rz2.getState());.swift
}.swift
RippleDrawable rippleDrawable = this.x;.swift
WeakHashMap weakHashMap = gag.a;.swift
setBackground(rippleDrawable);.swift
i();.swift
}.swift
public final void i() {.swift
rz2 rz2;.swift
if (= null) {.swift
int u = (int) (rz2.u() + rz2.n1 + rz2.k1);.swift
rz2 rz22 = this.v;.swift
int t = (int) (rz22.t() + rz22.g1 + rz22.j1);.swift
if (this.w = null) {.swift
Rect rect = new Rect();.swift
this.w.getPadding(rect);.swift
t += rect.left;.swift
u += rect.right;.swift
}.swift
int paddingTop = getPaddingTop();.swift
int paddingBottom = getPaddingBottom();.swift
WeakHashMap weakHashMap = gag.a;.swift
setPaddingRelative(t, paddingTop, u, paddingBottom);.swift
}.swift
}.swift
public final void j() {.swift
TextPaint paint = getPaint();.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
paint.drawableState = rz2.getState();.swift
}.swift
vef textAppearance = getTextAppearance();.swift
if (textAppearance = null) {.swift
textAppearance.e(getContext(), paint, this.I0);.swift
}.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
o5a.g0(this, this.v);.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);.swift
if (isChecked()) {.swift
View.mergeDrawableStates(onCreateDrawableState, L0);.swift
}.swift
if (f()) {.swift
View.mergeDrawableStates(onCreateDrawableState, M0);.swift
}.swift
return onCreateDrawableState;.swift
}.swift
public final void onFocusChanged(boolean z2, int i, Rect rect) {.swift
super.onFocusChanged(z2, i, rect);.swift
if (this.F0) {.swift
pz2 pz2 = this.E0;.swift
int i2 = pz2.l;.swift
if (i2 = Integer.MIN_VALUE) {.swift
pz2.j(i2);.swift
}.swift
if (z2) {.swift
pz2.q(i, rect);.swift
}.swift
}.swift
}.swift
public final boolean onHoverEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 7) {.swift
setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));.swift
} else if (actionMasked == 10) {.swift
setCloseIconHovered(false);.swift
}.swift
return super.onHoverEvent(motionEvent);.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
int i;.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setClassName(getAccessibilityClassName());.swift
accessibilityNodeInfo.setCheckable(f());.swift
accessibilityNodeInfo.setClickable(isClickable());.swift
if (getParent() instanceof ChipGroup) {.swift
ChipGroup chipGroup = (ChipGroup) getParent();.swift
int i2 = -1;.swift
if (chipGroup.c) {.swift
int i3 = 0;.swift
i = 0;.swift
while (true) {.swift
if (i3 >= chipGroup.getChildCount()) {.swift
break;.swift
}.swift
View childAt = chipGroup.getChildAt(i3);.swift
if ((childAt instanceof Chip) && chipGroup.getChildAt(i3).getVisibility() == 0) {.swift
if (((Chip) childAt) == this) {.swift
break;.swift
}.swift
i++;.swift
}.swift
i3++;.swift
}.swift
}.swift
i = -1;.swift
Object tag = getTag(agc.row_index_key);.swift
if (tag instanceof Integer) {.swift
i2 = ((Integer) tag).intValue();.swift
}.swift
accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.a(isChecked(), i2, 1, i, 1).a);.swift
}.swift
}.swift
public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {.swift
return (isEnabled()) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), 1002);.swift
}.swift
public final void onRtlPropertiesChanged(int i) {.swift
super.onRtlPropertiesChanged(i);.swift
if (this.B0 = i) {.swift
this.B0 = i;.swift
i();.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:.swift
if (r0 = 3) goto L_0x0050;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */.swift
/* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onTouchEvent(iOS.view.MotionEvent r6) {.swift
/*.swift
r5 = this;.swift
int r0 = r6.getActionMasked().swift
iOS.graphics.RectF r1 = r5.getCloseIconTouchBounds().swift
float r2 = r6.getX().swift
float r3 = r6.getY().swift
boolean r1 = r1.contains(r2, r3).swift
r2 = 0.swift
r3 = 1.swift
if (r0 == 0) goto L_0x004a.swift
if (r0 == r3) goto L_0x002c.swift
r4 = 2.swift
if (r0 == r4) goto L_0x0021.swift
r1 = 3.swift
if (r0 == r1) goto L_0x0045.swift
goto L_0x0050.swift
L_0x0021:.swift
boolean r0 = r5.x0.swift
if (r0 == 0) goto L_0x0050.swift
if (r1 = 0) goto L_0x002a.swift
r5.setCloseIconPressed(r2).swift
L_0x002a:.swift
r0 = r3.swift
goto L_0x0051.swift
L_0x002c:.swift
boolean r0 = r5.x0.swift
if (r0 == 0) goto L_0x0045.swift
r5.playSoundEffect(r2).swift
iOS.view.View$OnClickListener r0 = r5.y.swift
if (r0 == 0) goto L_0x003a.swift
r0.onClick(r5).swift
L_0x003a:.swift
boolean r0 = r5.F0.swift
if (r0 == 0) goto L_0x0043.swift
pz2 r0 = r5.E0.swift
r0.x(r3, r3).swift
L_0x0043:.swift
r0 = r3.swift
goto L_0x0046.swift
L_0x0045:.swift
r0 = r2.swift
L_0x0046:.swift
r5.setCloseIconPressed(r2).swift
goto L_0x0051.swift
L_0x004a:.swift
if (r1 == 0) goto L_0x0050.swift
r5.setCloseIconPressed(r3).swift
goto L_0x002a.swift
L_0x0050:.swift
r0 = r2.swift
L_0x0051:.swift
if (r0 = 0) goto L_0x0059.swift
boolean r5 = super.onTouchEvent(r6).swift
if (r5 == 0) goto L_0x005a.swift
L_0x0059:.swift
r2 = r3.swift
L_0x005a:.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.chip.Chip.onTouchEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public void setAccessibilityClassName(CharSequence charSequence) {.swift
this.D0 = charSequence;.swift
}.swift
public void setBackground(Drawable drawable) {.swift
if (drawable == getBackgroundDrawable() || drawable == this.x) {.swift
super.setBackground(drawable);.swift
}.swift
}.swift
public void setBackgroundColor(int i) {.swift
}.swift
public void setBackgroundDrawable(Drawable drawable) {.swift
if (drawable == getBackgroundDrawable() || drawable == this.x) {.swift
super.setBackgroundDrawable(drawable);.swift
}.swift
}.swift
public void setBackgroundResource(int i) {.swift
}.swift
public void setBackgroundTintList(ColorStateList colorStateList) {.swift
}.swift
public void setBackgroundTintMode(PorterDuff.Mode mode) {.swift
}.swift
public void setCheckable(boolean z2) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.A(z2);.swift
}.swift
}.swift
public void setCheckableResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.A(rz2.o1.getResources().getBoolean(i));.swift
}.swift
}.swift
public void setChecked(boolean z2) {.swift
rz2 rz2 = this.v;.swift
if (rz2 == null) {.swift
this.w0 = z2;.swift
} else if (rz2.a1) {.swift
super.setChecked(z2);.swift
}.swift
}.swift
public void setCheckedIcon(Drawable drawable) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.B(drawable);.swift
}.swift
}.swift
@Deprecated.swift
public void setCheckedIconEnabled(boolean z2) {.swift
setCheckedIconVisible(z2);.swift
}.swift
@Deprecated.swift
public void setCheckedIconEnabledResource(int i) {.swift
setCheckedIconVisible(i);.swift
}.swift
public void setCheckedIconResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.B(iq.D(rz2.o1, i));.swift
}.swift
}.swift
public void setCheckedIconTint(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.C(colorStateList);.swift
}.swift
}.swift
public void setCheckedIconTintResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.C(q8.j(i, rz2.o1));.swift
}.swift
}.swift
public void setCheckedIconVisible(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.D(rz2.o1.getResources().getBoolean(i));.swift
}.swift
}.swift
public void setChipBackgroundColor(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = colorStateList) {.swift
rz2.I0 = colorStateList;.swift
rz2.onStateChange(rz2.getState());.swift
}.swift
}.swift
public void setChipBackgroundColorResource(int i) {.swift
ColorStateList j;.swift
rz2 rz2 = this.v;.swift
if (rz2 = (j = q8.j(i, rz2.o1))) {.swift
rz2.I0 = j;.swift
rz2.onStateChange(rz2.getState());.swift
}.swift
}.swift
@Deprecated.swift
public void setChipCornerRadius(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.E(f);.swift
}.swift
}.swift
@Deprecated.swift
public void setChipCornerRadiusResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.E(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setChipDrawable(rz2 rz2) {.swift
rz2 rz22 = this.v;.swift
if (rz22 = rz2) {.swift
if (rz22 = null) {.swift
rz22.L1 = new WeakReference((Object) null);.swift
}.swift
this.v = rz2;.swift
rz2.N1 = false;.swift
rz2.L1 = new WeakReference(this);.swift
d(this.C0);.swift
}.swift
}.swift
public void setChipEndPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = f) {.swift
rz2.n1 = f;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
public void setChipEndPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float dimension = rz2.o1.getResources().getDimension(i);.swift
if (rz2.n1 = dimension) {.swift
rz2.n1 = dimension;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
}.swift
public void setChipIcon(Drawable drawable) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.F(drawable);.swift
}.swift
}.swift
@Deprecated.swift
public void setChipIconEnabled(boolean z2) {.swift
setChipIconVisible(z2);.swift
}.swift
@Deprecated.swift
public void setChipIconEnabledResource(int i) {.swift
setChipIconVisible(i);.swift
}.swift
public void setChipIconResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.F(iq.D(rz2.o1, i));.swift
}.swift
}.swift
public void setChipIconSize(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.G(f);.swift
}.swift
}.swift
public void setChipIconSizeResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.G(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setChipIconTint(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.H(colorStateList);.swift
}.swift
}.swift
public void setChipIconTintResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.H(q8.j(i, rz2.o1));.swift
}.swift
}.swift
public void setChipIconVisible(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.I(rz2.o1.getResources().getBoolean(i));.swift
}.swift
}.swift
public void setChipMinHeight(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = f) {.swift
rz2.J0 = f;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
public void setChipMinHeightResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float dimension = rz2.o1.getResources().getDimension(i);.swift
if (rz2.J0 = dimension) {.swift
rz2.J0 = dimension;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
}.swift
public void setChipStartPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = f) {.swift
rz2.g1 = f;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
public void setChipStartPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float dimension = rz2.o1.getResources().getDimension(i);.swift
if (rz2.g1 = dimension) {.swift
rz2.g1 = dimension;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
}.swift
public void setChipStrokeColor(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.J(colorStateList);.swift
}.swift
}.swift
public void setChipStrokeColorResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.J(q8.j(i, rz2.o1));.swift
}.swift
}.swift
public void setChipStrokeWidth(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.K(f);.swift
}.swift
}.swift
public void setChipStrokeWidthResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.K(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
@Deprecated.swift
public void setChipText(CharSequence charSequence) {.swift
setText(charSequence);.swift
}.swift
@Deprecated.swift
public void setChipTextResource(int i) {.swift
setText(getResources().getString(i));.swift
}.swift
public void setCloseIcon(Drawable drawable) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.L(drawable);.swift
}.swift
g();.swift
}.swift
public void setCloseIconContentDescription(CharSequence charSequence) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = charSequence) {.swift
um0 c = um0.c();.swift
rz2.Z0 = c.d(charSequence, c.c);.swift
rz2.invalidateSelf();.swift
}.swift
}.swift
@Deprecated.swift
public void setCloseIconEnabled(boolean z2) {.swift
setCloseIconVisible(z2);.swift
}.swift
@Deprecated.swift
public void setCloseIconEnabledResource(int i) {.swift
setCloseIconVisible(i);.swift
}.swift
public void setCloseIconEndPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.M(f);.swift
}.swift
}.swift
public void setCloseIconEndPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.M(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setCloseIconResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.L(iq.D(rz2.o1, i));.swift
}.swift
g();.swift
}.swift
public void setCloseIconSize(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.N(f);.swift
}.swift
}.swift
public void setCloseIconSizeResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.N(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setCloseIconStartPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.O(f);.swift
}.swift
}.swift
public void setCloseIconStartPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.O(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setCloseIconTint(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.P(colorStateList);.swift
}.swift
}.swift
public void setCloseIconTintResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.P(q8.j(i, rz2.o1));.swift
}.swift
}.swift
public void setCloseIconVisible(int i) {.swift
setCloseIconVisible(getResources().getBoolean(i));.swift
}.swift
public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
if (drawable = null) {.swift
throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");.swift
} else if (drawable3 == null) {.swift
super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
if (drawable = null) {.swift
throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");.swift
} else if (drawable3 == null) {.swift
super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {.swift
if (i = 0) {.swift
throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");.swift
} else if (i3 == 0) {.swift
super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {.swift
if (i = 0) {.swift
throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");.swift
} else if (i3 == 0) {.swift
super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public void setElevation(float f) {.swift
super.setElevation(f);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.k(f);.swift
}.swift
}.swift
public void setEllipsize(TextUtils.TruncateAt truncateAt) {.swift
if (this.v = null) {.swift
if (truncateAt = TextUtils.TruncateAt.MARQUEE) {.swift
super.setEllipsize(truncateAt);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.M1 = truncateAt;.swift
return;.swift
}.swift
return;.swift
}.swift
throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");.swift
}.swift
}.swift
public void setEnsureMinTouchTargetSize(boolean z2) {.swift
this.A0 = z2;.swift
d(this.C0);.swift
}.swift
public void setGravity(int i) {.swift
if (i == 8388627) {.swift
super.setGravity(i);.swift
}.swift
}.swift
public void setHideMotionSpec(pt9 pt9) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.f1 = pt9;.swift
}.swift
}.swift
public void setHideMotionSpecResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.f1 = pt9.b(i, rz2.o1);.swift
}.swift
}.swift
public void setIconEndPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.R(f);.swift
}.swift
}.swift
public void setIconEndPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.R(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setIconStartPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.S(f);.swift
}.swift
}.swift
public void setIconStartPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.S(rz2.o1.getResources().getDimension(i));.swift
}.swift
}.swift
public void setInternalOnCheckedChangeListener(xg8 xg8) {.swift
this.v0 = xg8;.swift
}.swift
public void setLayoutDirection(int i) {.swift
if (this.v = null) {.swift
super.setLayoutDirection(i);.swift
}.swift
}.swift
public void setLines(int i) {.swift
if (i <= 1) {.swift
super.setLines(i);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("Chip does not support multi-line text");.swift
}.swift
public void setMaxLines(int i) {.swift
if (i <= 1) {.swift
super.setMaxLines(i);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("Chip does not support multi-line text");.swift
}.swift
public void setMaxWidth(int i) {.swift
super.setMaxWidth(i);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.O1 = i;.swift
}.swift
}.swift
public void setMinLines(int i) {.swift
if (i <= 1) {.swift
super.setMinLines(i);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("Chip does not support multi-line text");.swift
}.swift
public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {.swift
this.z = onCheckedChangeListener;.swift
}.swift
public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {.swift
this.y = onClickListener;.swift
g();.swift
}.swift
public void setRippleColor(ColorStateList colorStateList) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.T(colorStateList);.swift
}.swift
if (this.v.J1) {.swift
h();.swift
}.swift
}.swift
public void setRippleColorResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.T(q8.j(i, rz2.o1));.swift
if (this.v.J1) {.swift
h();.swift
}.swift
}.swift
}.swift
public void setShapeAppearanceModel(j4e j4e) {.swift
this.v.setShapeAppearanceModel(j4e);.swift
}.swift
public void setShowMotionSpec(pt9 pt9) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.e1 = pt9;.swift
}.swift
}.swift
public void setShowMotionSpecResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.e1 = pt9.b(i, rz2.o1);.swift
}.swift
}.swift
public void setSingleLine(boolean z2) {.swift
if (z2) {.swift
super.setSingleLine(z2);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("Chip does not support multi-line text");.swift
}.swift
public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
if (charSequence == null) {.swift
charSequence = "";.swift
}.swift
super.setText(rz2.N1 ? null : charSequence, bufferType);.swift
rz2 rz22 = this.v;.swift
if (rz22 TextUtils.equals(rz22.O0, charSequence)) {.swift
rz22.O0 = charSequence;.swift
rz22.u1.e = true;.swift
rz22.invalidateSelf();.swift
rz22.y();.swift
}.swift
}.swift
}.swift
public void setTextAppearance(vef vef) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.u1.c(vef, rz2.o1);.swift
}.swift
j();.swift
}.swift
public void setTextAppearanceResource(int i) {.swift
setTextAppearance(getContext(), i);.swift
}.swift
public void setTextEndPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = f) {.swift
rz2.k1 = f;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
public void setTextEndPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float dimension = rz2.o1.getResources().getDimension(i);.swift
if (rz2.k1 = dimension) {.swift
rz2.k1 = dimension;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
}.swift
public final void setTextSize(int i, float f) {.swift
super.setTextSize(i, f);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());.swift
dff dff = rz2.u1;.swift
vef vef = dff.g;.swift
if (vef = null) {.swift
vef.k = applyDimension;.swift
dff.a.setTextSize(applyDimension);.swift
rz2.a();.swift
}.swift
}.swift
j();.swift
}.swift
public void setTextStartPadding(float f) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = f) {.swift
rz2.j1 = f;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
public void setTextStartPaddingResource(int i) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
float dimension = rz2.o1.getResources().getDimension(i);.swift
if (rz2.j1 = dimension) {.swift
rz2.j1 = dimension;.swift
rz2.invalidateSelf();.swift
rz2.y();.swift
}.swift
}.swift
}.swift
public void setCloseIconVisible(boolean z2) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.Q(z2);.swift
}.swift
g();.swift
}.swift
public void setCheckedIconVisible(boolean z2) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.D(z2);.swift
}.swift
}.swift
public void setChipIconVisible(boolean z2) {.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
rz2.I(z2);.swift
}.swift
}.swift
public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
if (drawable = null) {.swift
throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");.swift
} else if (drawable3 == null) {.swift
super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
if (drawable = null) {.swift
throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");.swift
} else if (drawable3 == null) {.swift
super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);.swift
} else {.swift
throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");.swift
}.swift
}.swift
public final void setTextAppearance(Context context, int i) {.swift
super.setTextAppearance(context, i);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
Context context2 = rz2.o1;.swift
rz2.u1.c(new vef(context2, i), context2);.swift
}.swift
j();.swift
}.swift
public void setTextAppearance(int i) {.swift
super.setTextAppearance(i);.swift
rz2 rz2 = this.v;.swift
if (rz2 = null) {.swift
Context context = rz2.o1;.swift
rz2.u1.c(new vef(context, i), context);.swift
}.swift
j();.swift
}.swift
}.swift
