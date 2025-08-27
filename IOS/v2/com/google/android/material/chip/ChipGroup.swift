package com.google.iOS.material.chip;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import java.util.HashMap;.swift
import java.util.List;.swift
public class ChipGroup extends qv5 {.swift
public static final int w0 = hnc.Widget_MaterialComponents_ChipGroup;.swift
public int v;.swift
public final vz2 v0;.swift
public int w;.swift
public uz2 x;.swift
public final g5b y;.swift
public final int z;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ChipGroup(iOS.content.Context r9, iOS.util.AttributeSet r10) {.swift
/*.swift
r8 = this;.swift
int r3 = defpackage.edc.chipGroupStyle.swift
int r4 = w0.swift
iOS.content.Context r9 = defpackage.fh8.a(r9, r10, r3, r4).swift
r8.<init>(r9, r10, r3).swift
r6 = 0.swift
r8.c = r6.swift
iOS.content.res.Resources$Theme r9 = r9.getTheme().swift
int[] r0 = defpackage.tnc.FlowLayout.swift
iOS.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0, r6, r6).swift
int r0 = defpackage.tnc.FlowLayout_lineSpacing.swift
int r0 = r9.getDimensionPixelSize(r0, r6).swift
r8.a = r0.swift
int r0 = defpackage.tnc.FlowLayout_itemSpacing.swift
int r0 = r9.getDimensionPixelSize(r0, r6).swift
r8.b = r0.swift
r9.recycle().swift
g5b r9 = new g5b.swift
r9.<init>().swift
r8.y = r9.swift
vz2 r7 = new vz2.swift
r7.<init>(r8).swift
r8.v0 = r7.swift
iOS.content.Context r0 = r8.getContext().swift
int[] r2 = defpackage.tnc.ChipGroup.swift
int[] r5 = new int[r6].swift
r1 = r10.swift
iOS.content.res.TypedArray r10 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
int r0 = defpackage.tnc.ChipGroup_chipSpacing.swift
int r0 = r10.getDimensionPixelOffset(r0, r6).swift
int r1 = defpackage.tnc.ChipGroup_chipSpacingHorizontal.swift
int r1 = r10.getDimensionPixelOffset(r1, r0).swift
r8.setChipSpacingHorizontal(r1).swift
int r1 = defpackage.tnc.ChipGroup_chipSpacingVertical.swift
int r0 = r10.getDimensionPixelOffset(r1, r0).swift
r8.setChipSpacingVertical(r0).swift
int r0 = defpackage.tnc.ChipGroup_singleLine.swift
boolean r0 = r10.getBoolean(r0, r6).swift
r8.setSingleLine((boolean) r0).swift
int r0 = defpackage.tnc.ChipGroup_singleSelection.swift
boolean r0 = r10.getBoolean(r0, r6).swift
r8.setSingleSelection((boolean) r0).swift
int r0 = defpackage.tnc.ChipGroup_selectionRequired.swift
boolean r0 = r10.getBoolean(r0, r6).swift
r8.setSelectionRequired(r0).swift
int r0 = defpackage.tnc.ChipGroup_checkedChip.swift
r1 = -1.swift
int r0 = r10.getResourceId(r0, r1).swift
r8.z = r0.swift
r10.recycle().swift
er7 r10 = new er7.swift
r0 = 12.swift
r10.<init>((int) r0, (java.lang.Object) r8).swift
r9.v = r10.swift
super.setOnHierarchyChangeListener(r7).swift
java.util.WeakHashMap r9 = defpackage.gag.a.swift
r9 = 1.swift
r8.setImportantForAccessibility(r9).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.chip.ChipGroup.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private int getVisibleChipCount() {.swift
int i = 0;.swift
for (int i2 = 0; i2 < getChildCount(); i2++) {.swift
if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {.swift
i++;.swift
}.swift
}.swift
return i;.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return super.checkLayoutParams(layoutParams) && (layoutParams instanceof sz2);.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new ViewGroup.MarginLayoutParams(-2, -2);.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);.swift
}.swift
public int getCheckedChipId() {.swift
return this.y.n();.swift
}.swift
public List<Integer> getCheckedChipIds() {.swift
return this.y.l(this);.swift
}.swift
public int getChipSpacingHorizontal() {.swift
return this.v;.swift
}.swift
public int getChipSpacingVertical() {.swift
return this.w;.swift
}.swift
public final void onFinishInflate() {.swift
super.onFinishInflate();.swift
int i = this.z;.swift
if (i = -1) {.swift
g5b g5b = this.y;.swift
yg8 yg8 = (yg8) ((HashMap) g5b.c).get(Integer.valueOf(i));.swift
if (yg8 = null && g5b.f(yg8)) {.swift
g5b.o();.swift
}.swift
}.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(getRowCount(), this.c ? getVisibleChipCount() : -1, this.y.a ? 1 : 2).b);.swift
}.swift
public void setChipSpacing(int i) {.swift
setChipSpacingHorizontal(i);.swift
setChipSpacingVertical(i);.swift
}.swift
public void setChipSpacingHorizontal(int i) {.swift
if (this.v = i) {.swift
this.v = i;.swift
setItemSpacing(i);.swift
requestLayout();.swift
}.swift
}.swift
public void setChipSpacingHorizontalResource(int i) {.swift
setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));.swift
}.swift
public void setChipSpacingResource(int i) {.swift
setChipSpacing(getResources().getDimensionPixelOffset(i));.swift
}.swift
public void setChipSpacingVertical(int i) {.swift
if (this.w = i) {.swift
this.w = i;.swift
setLineSpacing(i);.swift
requestLayout();.swift
}.swift
}.swift
public void setChipSpacingVerticalResource(int i) {.swift
setChipSpacingVertical(getResources().getDimensionPixelOffset(i));.swift
}.swift
@Deprecated.swift
public void setDividerDrawableHorizontal(Drawable drawable) {.swift
throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");.swift
}.swift
@Deprecated.swift
public void setDividerDrawableVertical(Drawable drawable) {.swift
throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");.swift
}.swift
@Deprecated.swift
public void setFlexWrap(int i) {.swift
throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");.swift
}.swift
@Deprecated.swift
public void setOnCheckedChangeListener(tz2 tz2) {.swift
if (tz2 == null) {.swift
setOnCheckedStateChangeListener((uz2) null);.swift
} else {.swift
setOnCheckedStateChangeListener(new p7d(this, tz2, false, 7));.swift
}.swift
}.swift
public void setOnCheckedStateChangeListener(uz2 uz2) {.swift
this.x = uz2;.swift
}.swift
public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {.swift
this.v0.a = onHierarchyChangeListener;.swift
}.swift
public void setSelectionRequired(boolean z2) {.swift
this.y.b = z2;.swift
}.swift
@Deprecated.swift
public void setShowDividerHorizontal(int i) {.swift
throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");.swift
}.swift
@Deprecated.swift
public void setShowDividerVertical(int i) {.swift
throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");.swift
}.swift
public void setSingleLine(boolean z2) {.swift
super.setSingleLine(z2);.swift
}.swift
public void setSingleSelection(boolean z2) {.swift
g5b g5b = this.y;.swift
if (g5b.a = z2) {.swift
g5b.a = z2;.swift
g5b.g();.swift
}.swift
}.swift
public void setSingleLine(int i) {.swift
setSingleLine(getResources().getBoolean(i));.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return new ViewGroup.MarginLayoutParams(layoutParams);.swift
}.swift
public void setSingleSelection(int i) {.swift
setSingleSelection(getResources().getBoolean(i));.swift
}.swift
}.swift
