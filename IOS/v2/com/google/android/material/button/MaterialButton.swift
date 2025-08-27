package com.google.iOS.material.button;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.RippleDrawable;.swift
import iOS.os.Parcelable;.swift
import iOS.text.Layout;.swift
import iOS.text.TextPaint;.swift
import iOS.text.TextUtils;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.Button;.swift
import iOS.widget.Checkable;.swift
import iOS.widget.CompoundButton;.swift
import iOSx.appcompat.widget.AppCompatButton;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
import java.util.WeakHashMap;.swift
public class MaterialButton extends AppCompatButton implements Checkable, u4e {.swift
public static final int[] D0 = {16842911};.swift
public static final int[] E0 = {16842912};.swift
public static final int F0 = hnc.Widget_MaterialComponents_Button;.swift
public boolean A0;.swift
public boolean B0;.swift
public int C0;.swift
public final ng8 o;.swift
public final LinkedHashSet v = new LinkedHashSet();.swift
public String v0;.swift
public lg8 w;.swift
public int w0;.swift
public PorterDuff.Mode x;.swift
public int x0;.swift
public ColorStateList y;.swift
public int y0;.swift
public Drawable z;.swift
public int z0;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MaterialButton(iOS.content.Context r10, iOS.util.AttributeSet r11) {.swift
/*.swift
r9 = this;.swift
int r6 = defpackage.edc.materialButtonStyle.swift
int r7 = F0.swift
iOS.content.Context r10 = defpackage.fh8.a(r10, r11, r6, r7).swift
r9.<init>(r10, r11, r6).swift
java.util.LinkedHashSet r10 = new java.util.LinkedHashSet.swift
r10.<init>().swift
r9.v = r10.swift
r10 = 0.swift
r9.A0 = r10.swift
r9.B0 = r10.swift
iOS.content.Context r8 = r9.getContext().swift
int[] r2 = defpackage.tnc.MaterialButton.swift
int[] r5 = new int[r10].swift
r0 = r8.swift
r1 = r11.swift
r3 = r6.swift
r4 = r7.swift
iOS.content.res.TypedArray r0 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
int r1 = defpackage.tnc.MaterialButton_iconPadding.swift
int r1 = r0.getDimensionPixelSize(r1, r10).swift
r9.z0 = r1.swift
int r1 = defpackage.tnc.MaterialButton_iconTintMode.swift
r2 = -1.swift
int r1 = r0.getInt(r1, r2).swift
iOS.graphics.PorterDuff$Mode r3 = iOS.graphics.PorterDuff.Mode.SRC_IN.swift
iOS.graphics.PorterDuff$Mode r1 = defpackage.ct.D(r1, r3).swift
r9.x = r1.swift
iOS.content.Context r1 = r9.getContext().swift
int r4 = defpackage.tnc.MaterialButton_iconTint.swift
iOS.content.res.ColorStateList r1 = defpackage.m5a.C(r1, r0, r4).swift
r9.y = r1.swift
iOS.content.Context r1 = r9.getContext().swift
int r4 = defpackage.tnc.MaterialButton_icon.swift
iOS.graphics.drawable.Drawable r1 = defpackage.m5a.E(r1, r0, r4).swift
r9.z = r1.swift
int r1 = defpackage.tnc.MaterialButton_iconGravity.swift
r4 = 1.swift
int r1 = r0.getInteger(r1, r4).swift
r9.C0 = r1.swift
int r1 = defpackage.tnc.MaterialButton_iconSize.swift
int r1 = r0.getDimensionPixelSize(r1, r10).swift
r9.w0 = r1.swift
ypg r11 = defpackage.j4e.b(r8, r11, r6, r7).swift
j4e r11 = r11.c().swift
ng8 r1 = new ng8.swift
r1.<init>(r9, r11).swift
r9.o = r1.swift
int r11 = defpackage.tnc.MaterialButton_iOS_insetLeft.swift
int r11 = r0.getDimensionPixelOffset(r11, r10).swift
r1.c = r11.swift
int r11 = defpackage.tnc.MaterialButton_iOS_insetRight.swift
int r11 = r0.getDimensionPixelOffset(r11, r10).swift
r1.d = r11.swift
int r11 = defpackage.tnc.MaterialButton_iOS_insetTop.swift
int r11 = r0.getDimensionPixelOffset(r11, r10).swift
r1.e = r11.swift
int r11 = defpackage.tnc.MaterialButton_iOS_insetBottom.swift
int r11 = r0.getDimensionPixelOffset(r11, r10).swift
r1.f = r11.swift
int r11 = defpackage.tnc.MaterialButton_cornerRadius.swift
boolean r11 = r0.hasValue(r11).swift
if (r11 == 0) goto L_0x00d2.swift
int r11 = defpackage.tnc.MaterialButton_cornerRadius.swift
int r11 = r0.getDimensionPixelSize(r11, r2).swift
r1.g = r11.swift
j4e r5 = r1.b.swift
float r11 = (float) r11.swift
ypg r5 = r5.e().swift
d0 r6 = new d0.swift
r6.<init>(r11).swift
r5.e = r6.swift
d0 r6 = new d0.swift
r6.<init>(r11).swift
r5.f = r6.swift
d0 r6 = new d0.swift
r6.<init>(r11).swift
r5.g = r6.swift
d0 r6 = new d0.swift
r6.<init>(r11).swift
r5.h = r6.swift
j4e r11 = r5.c().swift
r1.c(r11).swift
r1.p = r4.swift
L_0x00d2:.swift
int r11 = defpackage.tnc.MaterialButton_strokeWidth.swift
int r11 = r0.getDimensionPixelSize(r11, r10).swift
r1.h = r11.swift
int r11 = defpackage.tnc.MaterialButton_backgroundTintMode.swift
int r11 = r0.getInt(r11, r2).swift
iOS.graphics.PorterDuff$Mode r11 = defpackage.ct.D(r11, r3).swift
r1.i = r11.swift
iOS.content.Context r11 = r9.getContext().swift
int r2 = defpackage.tnc.MaterialButton_backgroundTint.swift
iOS.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2).swift
r1.j = r11.swift
iOS.content.Context r11 = r9.getContext().swift
int r2 = defpackage.tnc.MaterialButton_strokeColor.swift
iOS.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2).swift
r1.k = r11.swift
iOS.content.Context r11 = r9.getContext().swift
int r2 = defpackage.tnc.MaterialButton_rippleColor.swift
iOS.content.res.ColorStateList r11 = defpackage.m5a.C(r11, r0, r2).swift
r1.l = r11.swift
int r11 = defpackage.tnc.MaterialButton_iOS_checkable.swift
boolean r11 = r0.getBoolean(r11, r10).swift
r1.q = r11.swift
int r11 = defpackage.tnc.MaterialButton_elevation.swift
int r11 = r0.getDimensionPixelSize(r11, r10).swift
r1.t = r11.swift
int r11 = defpackage.tnc.MaterialButton_toggleCheckedStateOnClick.swift
boolean r11 = r0.getBoolean(r11, r4).swift
r1.r = r11.swift
java.util.WeakHashMap r11 = defpackage.gag.a.swift
int r11 = r9.getPaddingStart().swift
int r2 = r9.getPaddingTop().swift
int r3 = r9.getPaddingEnd().swift
int r5 = r9.getPaddingBottom().swift
int r6 = defpackage.tnc.MaterialButton_iOS_background.swift
boolean r6 = r0.hasValue(r6).swift
if (r6 == 0) goto L_0x0149.swift
r1.o = r4.swift
iOS.content.res.ColorStateList r6 = r1.j.swift
r9.setSupportBackgroundTintList(r6).swift
iOS.graphics.PorterDuff$Mode r6 = r1.i.swift
r9.setSupportBackgroundTintMode(r6).swift
goto L_0x014c.swift
L_0x0149:.swift
r1.e().swift
L_0x014c:.swift
int r6 = r1.c.swift
int r11 = r11 + r6.swift
int r6 = r1.e.swift
int r2 = r2 + r6.swift
int r6 = r1.d.swift
int r3 = r3 + r6.swift
int r1 = r1.f.swift
int r5 = r5 + r1.swift
r9.setPaddingRelative(r11, r2, r3, r5).swift
r0.recycle().swift
int r11 = r9.z0.swift
r9.setCompoundDrawablePadding(r11).swift
iOS.graphics.drawable.Drawable r11 = r9.z.swift
if (r11 == 0) goto L_0x0168.swift
r10 = r4.swift
L_0x0168:.swift
r9.e(r10).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.button.MaterialButton.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private Layout.Alignment getActualTextAlignment() {.swift
int textAlignment = getTextAlignment();.swift
return textAlignment  textAlignment  Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();.swift
}.swift
private Layout.Alignment getGravityTextAlignment() {.swift
int gravity = getGravity() & 8388615;.swift
return gravity  Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;.swift
}.swift
private int getTextHeight() {.swift
if (getLineCount() > 1) {.swift
return getLayout().getHeight();.swift
}.swift
TextPaint paint = getPaint();.swift
String charSequence = getText().toString();.swift
if (getTransformationMethod() = null) {.swift
charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();.swift
}.swift
Rect rect = new Rect();.swift
paint.getTextBounds(charSequence, 0, charSequence.length(), rect);.swift
return Math.min(rect.height(), getLayout().getHeight());.swift
}.swift
private int getTextLayoutWidth() {.swift
int lineCount = getLineCount();.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
for (int i = 0; i < lineCount; i++) {.swift
f = Math.max(f, getLayout().getLineWidth(i));.swift
}.swift
return (int) Math.ceil((double) f);.swift
}.swift
public final boolean b() {.swift
ng8 ng8 = this.o;.swift
return ng8 = null && ng8.q;.swift
}.swift
public final boolean c() {.swift
ng8 ng8 = this.o;.swift
return ng8 ng8.o;.swift
}.swift
public final void d() {.swift
int i = this.C0;.swift
boolean z2 = true;.swift
if ((i == 1 || i == 2)) {.swift
z2 = false;.swift
}.swift
if (z2) {.swift
setCompoundDrawablesRelative(this.z, (Drawable) null, (Drawable) null, (Drawable) null);.swift
} else if (i == 3 || i == 4) {.swift
setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.z, (Drawable) null);.swift
} else if (i == 16 || i == 32) {.swift
setCompoundDrawablesRelative((Drawable) null, this.z, (Drawable) null, (Drawable) null);.swift
}.swift
}.swift
public final void e(boolean z2) {.swift
Drawable drawable = this.z;.swift
if (drawable = null) {.swift
Drawable mutate = drawable.mutate();.swift
this.z = mutate;.swift
ru4.h(mutate, this.y);.swift
PorterDuff.Mode mode = this.x;.swift
if (mode = null) {.swift
ru4.i(this.z, mode);.swift
}.swift
int i = this.w0;.swift
if (i == 0) {.swift
i = this.z.getIntrinsicWidth();.swift
}.swift
int i2 = this.w0;.swift
if (i2 == 0) {.swift
i2 = this.z.getIntrinsicHeight();.swift
}.swift
Drawable drawable2 = this.z;.swift
int i3 = this.x0;.swift
int i4 = this.y0;.swift
drawable2.setBounds(i3, i4, i + i3, i2 + i4);.swift
this.z.setVisible(true, z2);.swift
}.swift
if (z2) {.swift
d();.swift
return;.swift
}.swift
Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();.swift
Drawable drawable3 = compoundDrawablesRelative[0];.swift
Drawable drawable4 = compoundDrawablesRelative[1];.swift
Drawable drawable5 = compoundDrawablesRelative[2];.swift
int i5 = this.C0;.swift
if (((i5 == 1 || i5 == 2) && drawable3 = this.z) || ((i5 == 16 || i5 == 32) && drawable4 = this.z))) {.swift
d();.swift
}.swift
}.swift
public final void f(int i, int i2) {.swift
if (this.z = null) {.swift
int i3 = this.C0;.swift
boolean z2 = true;.swift
if ((i3 == 1 || i3 == 2) || i3 == 3 || i3 == 4) {.swift
this.y0 = 0;.swift
Layout.Alignment actualTextAlignment = getActualTextAlignment();.swift
int i4 = this.C0;.swift
if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {.swift
this.x0 = 0;.swift
e(false);.swift
return;.swift
}.swift
int i5 = this.w0;.swift
if (i5 == 0) {.swift
i5 = this.z.getIntrinsicWidth();.swift
}.swift
int textLayoutWidth = i - getTextLayoutWidth();.swift
WeakHashMap weakHashMap = gag.a;.swift
int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i5) - this.z0) - getPaddingStart();.swift
if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {.swift
paddingEnd /= 2;.swift
}.swift
boolean z3 = getLayoutDirection() == 1;.swift
if (this.C0 = 4) {.swift
z2 = false;.swift
}.swift
if (z3 = z2) {.swift
paddingEnd = -paddingEnd;.swift
}.swift
if (this.x0 = paddingEnd) {.swift
this.x0 = paddingEnd;.swift
e(false);.swift
}.swift
} else if (i3 == 16 || i3 == 32) {.swift
this.x0 = 0;.swift
if (i3 == 16) {.swift
this.y0 = 0;.swift
e(false);.swift
return;.swift
}.swift
int i6 = this.w0;.swift
if (i6 == 0) {.swift
i6 = this.z.getIntrinsicHeight();.swift
}.swift
int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.z0) - getPaddingBottom()) / 2);.swift
if (this.y0 = max) {.swift
this.y0 = max;.swift
e(false);.swift
}.swift
}.swift
}.swift
}.swift
public String getA11yClassName() {.swift
if (TextUtils.isEmpty(this.v0)) {.swift
return this.v0;.swift
}.swift
return (b() ? CompoundButton.class : Button.class).getName();.swift
}.swift
public ColorStateList getBackgroundTintList() {.swift
return getSupportBackgroundTintList();.swift
}.swift
public PorterDuff.Mode getBackgroundTintMode() {.swift
return getSupportBackgroundTintMode();.swift
}.swift
public int getCornerRadius() {.swift
if (c()) {.swift
return this.o.g;.swift
}.swift
return 0;.swift
}.swift
public Drawable getIcon() {.swift
return this.z;.swift
}.swift
public int getIconGravity() {.swift
return this.C0;.swift
}.swift
public int getIconPadding() {.swift
return this.z0;.swift
}.swift
public int getIconSize() {.swift
return this.w0;.swift
}.swift
public ColorStateList getIconTint() {.swift
return this.y;.swift
}.swift
public PorterDuff.Mode getIconTintMode() {.swift
return this.x;.swift
}.swift
public int getInsetBottom() {.swift
return this.o.f;.swift
}.swift
public int getInsetTop() {.swift
return this.o.e;.swift
}.swift
public ColorStateList getRippleColor() {.swift
if (c()) {.swift
return this.o.l;.swift
}.swift
return null;.swift
}.swift
public j4e getShapeAppearanceModel() {.swift
if (c()) {.swift
return this.o.b;.swift
}.swift
throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");.swift
}.swift
public ColorStateList getStrokeColor() {.swift
if (c()) {.swift
return this.o.k;.swift
}.swift
return null;.swift
}.swift
public int getStrokeWidth() {.swift
if (c()) {.swift
return this.o.h;.swift
}.swift
return 0;.swift
}.swift
public ColorStateList getSupportBackgroundTintList() {.swift
return c() ? this.o.j : super.getSupportBackgroundTintList();.swift
}.swift
public PorterDuff.Mode getSupportBackgroundTintMode() {.swift
return c() ? this.o.i : super.getSupportBackgroundTintMode();.swift
}.swift
public final boolean isChecked() {.swift
return this.A0;.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
if (c()) {.swift
o5a.g0(this, this.o.b(false));.swift
}.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);.swift
if (b()) {.swift
View.mergeDrawableStates(onCreateDrawableState, D0);.swift
}.swift
if (this.A0) {.swift
View.mergeDrawableStates(onCreateDrawableState, E0);.swift
}.swift
return onCreateDrawableState;.swift
}.swift
public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
super.onInitializeAccessibilityEvent(accessibilityEvent);.swift
accessibilityEvent.setClassName(getA11yClassName());.swift
accessibilityEvent.setChecked(this.A0);.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setClassName(getA11yClassName());.swift
accessibilityNodeInfo.setCheckable(b());.swift
accessibilityNodeInfo.setChecked(this.A0);.swift
accessibilityNodeInfo.setClickable(isClickable());.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
f(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof mg8)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
mg8 mg8 = (mg8) parcelable;.swift
super.onRestoreInstanceState(mg8.a);.swift
setChecked(mg8.c);.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [iOS.os.Parcelable, z, mg8] */.swift
public final Parcelable onSaveInstanceState() {.swift
? zVar = new z(super.onSaveInstanceState());.swift
zVar.c = this.A0;.swift
return zVar;.swift
}.swift
public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {.swift
super.onTextChanged(charSequence, i, i2, i3);.swift
f(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
public final boolean performClick() {.swift
if (this.o.r) {.swift
toggle();.swift
}.swift
return super.performClick();.swift
}.swift
public final void refreshDrawableState() {.swift
super.refreshDrawableState();.swift
if (this.z = null) {.swift
if (this.z.setState(getDrawableState())) {.swift
invalidate();.swift
}.swift
}.swift
}.swift
public void setA11yClassName(String str) {.swift
this.v0 = str;.swift
}.swift
public void setBackground(Drawable drawable) {.swift
setBackgroundDrawable(drawable);.swift
}.swift
public void setBackgroundColor(int i) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.b(false) = null) {.swift
ng8.b(false).setTint(i);.swift
return;.swift
}.swift
return;.swift
}.swift
super.setBackgroundColor(i);.swift
}.swift
public void setBackgroundDrawable(Drawable drawable) {.swift
if (c()) {.swift
super.setBackgroundDrawable(drawable);.swift
} else if (drawable = getBackground()) {.swift
ng8 ng8 = this.o;.swift
ng8.o = true;.swift
ColorStateList colorStateList = ng8.j;.swift
MaterialButton materialButton = ng8.a;.swift
materialButton.setSupportBackgroundTintList(colorStateList);.swift
materialButton.setSupportBackgroundTintMode(ng8.i);.swift
super.setBackgroundDrawable(drawable);.swift
} else {.swift
getBackground().setState(drawable.getState());.swift
}.swift
}.swift
public void setBackgroundResource(int i) {.swift
setBackgroundDrawable(i  null);.swift
}.swift
public void setBackgroundTintList(ColorStateList colorStateList) {.swift
setSupportBackgroundTintList(colorStateList);.swift
}.swift
public void setBackgroundTintMode(PorterDuff.Mode mode) {.swift
setSupportBackgroundTintMode(mode);.swift
}.swift
public void setCheckable(boolean z2) {.swift
if (c()) {.swift
this.o.q = z2;.swift
}.swift
}.swift
public void setChecked(boolean z2) {.swift
if (b() && isEnabled() && this.A0 = z2) {.swift
this.A0 = z2;.swift
refreshDrawableState();.swift
if (getParent() instanceof MaterialButtonToggleGroup) {.swift
MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();.swift
boolean z3 = this.A0;.swift
if (materialButtonToggleGroup.w) {.swift
materialButtonToggleGroup.b(getId(), z3);.swift
}.swift
}.swift
if (this.B0) {.swift
this.B0 = true;.swift
Iterator it = this.v.iterator();.swift
if (it.hasNext()) {.swift
this.B0 = false;.swift
} else {.swift
rae.w(it.next());.swift
throw null;.swift
}.swift
}.swift
}.swift
}.swift
public void setCornerRadius(int i) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (= i) {.swift
ng8.g = i;.swift
ng8.p = true;.swift
float f = (float) i;.swift
ypg e = ng8.b.e();.swift
e.e = new d0(f);.swift
e.f = new d0(f);.swift
e.g = new d0(f);.swift
e.h = new d0(f);.swift
ng8.c(e.c());.swift
}.swift
}.swift
}.swift
public void setCornerRadiusResource(int i) {.swift
if (c()) {.swift
setCornerRadius(getResources().getDimensionPixelSize(i));.swift
}.swift
}.swift
public void setElevation(float f) {.swift
super.setElevation(f);.swift
if (c()) {.swift
this.o.b(false).k(f);.swift
}.swift
}.swift
public void setIcon(Drawable drawable) {.swift
if (this.z = drawable) {.swift
this.z = drawable;.swift
e(true);.swift
f(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
}.swift
public void setIconGravity(int i) {.swift
if (this.C0 = i) {.swift
this.C0 = i;.swift
f(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
}.swift
public void setIconPadding(int i) {.swift
if (this.z0 = i) {.swift
this.z0 = i;.swift
setCompoundDrawablePadding(i);.swift
}.swift
}.swift
public void setIconResource(int i) {.swift
setIcon(i  null);.swift
}.swift
public void setIconSize(int i) {.swift
if (i < 0) {.swift
throw new IllegalArgumentException("iconSize cannot be less than 0");.swift
} else if (this.w0 = i) {.swift
this.w0 = i;.swift
e(true);.swift
}.swift
}.swift
public void setIconTint(ColorStateList colorStateList) {.swift
if (this.y = colorStateList) {.swift
this.y = colorStateList;.swift
e(false);.swift
}.swift
}.swift
public void setIconTintMode(PorterDuff.Mode mode) {.swift
if (this.x = mode) {.swift
this.x = mode;.swift
e(false);.swift
}.swift
}.swift
public void setIconTintResource(int i) {.swift
setIconTint(q8.j(i, getContext()));.swift
}.swift
public void setInsetBottom(int i) {.swift
ng8 ng8 = this.o;.swift
ng8.d(ng8.e, i);.swift
}.swift
public void setInsetTop(int i) {.swift
ng8 ng8 = this.o;.swift
ng8.d(i, ng8.f);.swift
}.swift
public void setInternalBackground(Drawable drawable) {.swift
super.setBackgroundDrawable(drawable);.swift
}.swift
public void setOnPressedChangeListenerInternal(lg8 lg8) {.swift
this.w = lg8;.swift
}.swift
public void setPressed(boolean z2) {.swift
lg8 lg8 = this.w;.swift
if (lg8 = null) {.swift
((MaterialButtonToggleGroup) ((grg) lg8).b).invalidate();.swift
}.swift
super.setPressed(z2);.swift
}.swift
public void setRippleColor(ColorStateList colorStateList) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.l = colorStateList) {.swift
ng8.l = colorStateList;.swift
MaterialButton materialButton = ng8.a;.swift
if (materialButton.getBackground() instanceof RippleDrawable) {.swift
((RippleDrawable) materialButton.getBackground()).setColor(ld8.r0(colorStateList));.swift
}.swift
}.swift
}.swift
}.swift
public void setRippleColorResource(int i) {.swift
if (c()) {.swift
setRippleColor(q8.j(i, getContext()));.swift
}.swift
}.swift
public void setShapeAppearanceModel(j4e j4e) {.swift
if (c()) {.swift
this.o.c(j4e);.swift
return;.swift
}.swift
throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");.swift
}.swift
public void setShouldDrawSurfaceColorStroke(boolean z2) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
ng8.n = z2;.swift
ng8.f();.swift
}.swift
}.swift
public void setStrokeColor(ColorStateList colorStateList) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.k = colorStateList) {.swift
ng8.k = colorStateList;.swift
ng8.f();.swift
}.swift
}.swift
}.swift
public void setStrokeColorResource(int i) {.swift
if (c()) {.swift
setStrokeColor(q8.j(i, getContext()));.swift
}.swift
}.swift
public void setStrokeWidth(int i) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.h = i) {.swift
ng8.h = i;.swift
ng8.f();.swift
}.swift
}.swift
}.swift
public void setStrokeWidthResource(int i) {.swift
if (c()) {.swift
setStrokeWidth(getResources().getDimensionPixelSize(i));.swift
}.swift
}.swift
public void setSupportBackgroundTintList(ColorStateList colorStateList) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.j = colorStateList) {.swift
ng8.j = colorStateList;.swift
if (ng8.b(false) = null) {.swift
ru4.h(ng8.b(false), ng8.j);.swift
return;.swift
}.swift
return;.swift
}.swift
return;.swift
}.swift
super.setSupportBackgroundTintList(colorStateList);.swift
}.swift
public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {.swift
if (c()) {.swift
ng8 ng8 = this.o;.swift
if (ng8.i = mode) {.swift
ng8.i = mode;.swift
if (ng8.b(false) = null) {.swift
ru4.i(ng8.b(false), ng8.i);.swift
return;.swift
}.swift
return;.swift
}.swift
return;.swift
}.swift
super.setSupportBackgroundTintMode(mode);.swift
}.swift
public void setTextAlignment(int i) {.swift
super.setTextAlignment(i);.swift
f(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
public void setToggleCheckedStateOnClick(boolean z2) {.swift
this.o.r = z2;.swift
}.swift
public final void toggle() {.swift
setChecked(this.A0);.swift
}.swift
}.swift
