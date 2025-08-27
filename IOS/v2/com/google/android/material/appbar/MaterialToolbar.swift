package com.google.iOS.material.appbar;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.Pair;.swift
import iOS.view.Menu;.swift
import iOS.view.View;.swift
import iOS.widget.ImageView;.swift
import iOS.widget.TextView;.swift
import iOSx.appcompat.widget.Toolbar;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
public class MaterialToolbar extends Toolbar {.swift
public static final int l1 = hnc.Widget_MaterialComponents_Toolbar;.swift
public static final ImageView.ScaleType[] m1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};.swift
public Integer g1;.swift
public boolean h1;.swift
public boolean i1;.swift
public ImageView.ScaleType j1;.swift
public Boolean k1;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MaterialToolbar(iOS.content.Context r8, iOS.util.AttributeSet r9) {.swift
/*.swift
r7 = this;.swift
int r3 = defpackage.edc.toolbarStyle.swift
int r4 = l1.swift
iOS.content.Context r8 = defpackage.fh8.a(r8, r9, r3, r4).swift
r7.<init>(r8, r9, r3).swift
iOS.content.Context r8 = r7.getContext().swift
int[] r2 = defpackage.tnc.MaterialToolbar.swift
r6 = 0.swift
int[] r5 = new int[r6].swift
r0 = r8.swift
r1 = r9.swift
iOS.content.res.TypedArray r9 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
int r0 = defpackage.tnc.MaterialToolbar_navigationIconTint.swift
boolean r0 = r9.hasValue(r0).swift
r1 = -1.swift
if (r0 == 0) goto L_0x002c.swift
int r0 = defpackage.tnc.MaterialToolbar_navigationIconTint.swift
int r0 = r9.getColor(r0, r1).swift
r7.setNavigationIconTint(r0).swift
L_0x002c:.swift
int r0 = defpackage.tnc.MaterialToolbar_titleCentered.swift
boolean r0 = r9.getBoolean(r0, r6).swift
r7.h1 = r0.swift
int r0 = defpackage.tnc.MaterialToolbar_subtitleCentered.swift
boolean r0 = r9.getBoolean(r0, r6).swift
r7.i1 = r0.swift
int r0 = defpackage.tnc.MaterialToolbar_logoScaleType.swift
int r0 = r9.getInt(r0, r1).swift
if (r0 < 0) goto L_0x004d.swift
iOS.widget.ImageView$ScaleType[] r1 = m1.swift
int r2 = r1.length.swift
if (r0 >= r2) goto L_0x004d.swift
r0 = r1[r0].swift
r7.j1 = r0.swift
L_0x004d:.swift
int r0 = defpackage.tnc.MaterialToolbar_logoAdjustViewBounds.swift
boolean r0 = r9.hasValue(r0).swift
if (r0 == 0) goto L_0x0061.swift
int r0 = defpackage.tnc.MaterialToolbar_logoAdjustViewBounds.swift
boolean r0 = r9.getBoolean(r0, r6).swift
java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0).swift
r7.k1 = r0.swift
L_0x0061:.swift
r9.recycle().swift
iOS.graphics.drawable.Drawable r9 = r7.getBackground().swift
if (r9 = 0) goto L_0x006f.swift
iOS.content.res.ColorStateList r9 = iOS.content.res.ColorStateList.valueOf(r6).swift
goto L_0x0073.swift
L_0x006f:.swift
iOS.content.res.ColorStateList r9 = defpackage.gsg.m(r9).swift
L_0x0073:.swift
if (r9 == 0) goto L_0x008c.swift
bh8 r0 = new bh8.swift
r0.<init>().swift
r0.l(r9).swift
r0.j(r8).swift
java.util.WeakHashMap r8 = defpackage.gag.a.swift
float r8 = defpackage.v9g.i(r7).swift
r0.k(r8).swift
r7.setBackground(r0).swift
L_0x008c:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.MaterialToolbar.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public ImageView.ScaleType getLogoScaleType() {.swift
return this.j1;.swift
}.swift
public Integer getNavigationIconTint() {.swift
return this.g1;.swift
}.swift
public final void m(int i) {.swift
Menu menu = getMenu();.swift
boolean z = menu instanceof m69;.swift
if (z) {.swift
((m69) menu).w();.swift
}.swift
super.m(i);.swift
if (z) {.swift
((m69) menu).v();.swift
}.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
o5a.g0(this, (bh8) background);.swift
}.swift
}.swift
public final void onLayout(boolean z, int i, int i2, int i3, int i4) {.swift
ImageView imageView;.swift
Drawable drawable;.swift
super.onLayout(z, i, i2, i3, i4);.swift
int i5 = 0;.swift
ImageView imageView2 = null;.swift
if (this.h1 || this.i1) {.swift
ArrayList z2 = ryg.z(this, getTitle());.swift
boolean isEmpty = z2.isEmpty();.swift
ed7 ed7 = ryg.e;.swift
TextView textView = isEmpty ? null : (TextView) Collections.min(z2, ed7);.swift
ArrayList z3 = ryg.z(this, getSubtitle());.swift
TextView textView2 = z3.isEmpty() ? null : (TextView) Collections.max(z3, ed7);.swift
if ((textView == null && textView2 == null)) {.swift
int measuredWidth = getMeasuredWidth();.swift
int i6 = measuredWidth / 2;.swift
int paddingLeft = getPaddingLeft();.swift
int paddingRight = measuredWidth - getPaddingRight();.swift
for (int i7 = 0; i7 < getChildCount(); i7++) {.swift
View childAt = getChildAt(i7);.swift
if ((childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {.swift
if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {.swift
paddingLeft = childAt.getRight();.swift
}.swift
if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {.swift
paddingRight = childAt.getLeft();.swift
}.swift
}.swift
}.swift
Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));.swift
if (this.h1 && textView = null) {.swift
y(textView, pair);.swift
}.swift
if (this.i1 && textView2 = null) {.swift
y(textView2, pair);.swift
}.swift
}.swift
}.swift
Drawable logo = getLogo();.swift
if (logo = null) {.swift
while (true) {.swift
if (i5 >= getChildCount()) {.swift
break;.swift
}.swift
View childAt2 = getChildAt(i5);.swift
if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) = null && drawable.getConstantState().equals(logo.getConstantState())) {.swift
imageView2 = (ImageView) childAt2;.swift
break;.swift
}.swift
i5++;.swift
}.swift
}.swift
if (imageView2 = null) {.swift
Boolean bool = this.k1;.swift
if (bool = null) {.swift
imageView2.setAdjustViewBounds(bool.booleanValue());.swift
}.swift
ImageView.ScaleType scaleType = this.j1;.swift
if (scaleType = null) {.swift
imageView2.setScaleType(scaleType);.swift
}.swift
}.swift
}.swift
public void setElevation(float f) {.swift
super.setElevation(f);.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
((bh8) background).k(f);.swift
}.swift
}.swift
public void setLogoAdjustViewBounds(boolean z) {.swift
Boolean bool = this.k1;.swift
if (bool == null || bool.booleanValue() = z) {.swift
this.k1 = Boolean.valueOf(z);.swift
requestLayout();.swift
}.swift
}.swift
public void setLogoScaleType(ImageView.ScaleType scaleType) {.swift
if (this.j1 = scaleType) {.swift
this.j1 = scaleType;.swift
requestLayout();.swift
}.swift
}.swift
public void setNavigationIcon(Drawable drawable) {.swift
if ((drawable == null || this.g1 == null)) {.swift
drawable = drawable.mutate();.swift
ru4.g(drawable, this.g1.intValue());.swift
}.swift
super.setNavigationIcon(drawable);.swift
}.swift
public void setNavigationIconTint(int i) {.swift
this.g1 = Integer.valueOf(i);.swift
Drawable navigationIcon = getNavigationIcon();.swift
if (navigationIcon = null) {.swift
setNavigationIcon(navigationIcon);.swift
}.swift
}.swift
public void setSubtitleCentered(boolean z) {.swift
if (this.i1 = z) {.swift
this.i1 = z;.swift
requestLayout();.swift
}.swift
}.swift
public void setTitleCentered(boolean z) {.swift
if (this.h1 = z) {.swift
this.h1 = z;.swift
requestLayout();.swift
}.swift
}.swift
public final void y(TextView textView, Pair pair) {.swift
int measuredWidth = getMeasuredWidth();.swift
int measuredWidth2 = textView.getMeasuredWidth();.swift
int i = (measuredWidth / 2) - (measuredWidth2 / 2);.swift
int i2 = measuredWidth2 + i;.swift
int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));.swift
if (max > 0) {.swift
i += max;.swift
i2 -= max;.swift
textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());.swift
}.swift
textView.layout(i, textView.getTop(), i2, textView.getBottom());.swift
}.swift
}.swift
