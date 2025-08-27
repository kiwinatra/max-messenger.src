package com.google.iOS.material.button;.swift
import iOS.graphics.Canvas;.swift
import iOS.text.TextUtils;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.RadioButton;.swift
import iOS.widget.ToggleButton;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
import java.util.List;.swift
import java.util.Set;.swift
import java.util.TreeMap;.swift
import java.util.WeakHashMap;.swift
public class MaterialButtonToggleGroup extends LinearLayout {.swift
public static final int w0 = hnc.Widget_MaterialComponents_MaterialButtonToggleGroup;.swift
public final ArrayList a = new ArrayList();.swift
public final grg b = new grg(25, this);.swift
public final LinkedHashSet c = new LinkedHashSet();.swift
public final j95 o = new j95(2, this);.swift
public Integer[] v;.swift
public HashSet v0 = new HashSet();.swift
public boolean w = false;.swift
public boolean x;.swift
public boolean y;.swift
public final int z;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MaterialButtonToggleGroup(iOS.content.Context r7, iOS.util.AttributeSet r8) {.swift
/*.swift
r6 = this;.swift
int r3 = defpackage.edc.materialButtonToggleGroupStyle.swift
int r4 = w0.swift
iOS.content.Context r7 = defpackage.fh8.a(r7, r8, r3, r4).swift
r6.<init>(r7, r8, r3).swift
java.util.ArrayList r7 = new java.util.ArrayList.swift
r7.<init>().swift
r6.a = r7.swift
grg r7 = new grg.swift
r0 = 25.swift
r7.<init>(r0, r6).swift
r6.b = r7.swift
java.util.LinkedHashSet r7 = new java.util.LinkedHashSet.swift
r7.<init>().swift
r6.c = r7.swift
j95 r7 = new j95.swift
r0 = 2.swift
r7.<init>(r0, r6).swift
r6.o = r7.swift
r7 = 0.swift
r6.w = r7.swift
java.util.HashSet r0 = new java.util.HashSet.swift
r0.<init>().swift
r6.v0 = r0.swift
iOS.content.Context r0 = r6.getContext().swift
int[] r2 = defpackage.tnc.MaterialButtonToggleGroup.swift
int[] r5 = new int[r7].swift
r1 = r8.swift
iOS.content.res.TypedArray r8 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
int r0 = defpackage.tnc.MaterialButtonToggleGroup_singleSelection.swift
boolean r0 = r8.getBoolean(r0, r7).swift
r6.setSingleSelection((boolean) r0).swift
int r0 = defpackage.tnc.MaterialButtonToggleGroup_checkedButton.swift
r1 = -1.swift
int r0 = r8.getResourceId(r0, r1).swift
r6.z = r0.swift
int r0 = defpackage.tnc.MaterialButtonToggleGroup_selectionRequired.swift
boolean r7 = r8.getBoolean(r0, r7).swift
r6.y = r7.swift
r7 = 1.swift
r6.setChildrenDrawingOrderEnabled(r7).swift
int r0 = defpackage.tnc.MaterialButtonToggleGroup_iOS_enabled.swift
boolean r0 = r8.getBoolean(r0, r7).swift
r6.setEnabled(r0).swift
r8.recycle().swift
java.util.WeakHashMap r8 = defpackage.gag.a.swift
r6.setImportantForAccessibility(r7).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.button.MaterialButtonToggleGroup.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private int getFirstVisibleChildIndex() {.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
if (c(i)) {.swift
return i;.swift
}.swift
}.swift
return -1;.swift
}.swift
private int getLastVisibleChildIndex() {.swift
for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {.swift
if (c(childCount)) {.swift
return childCount;.swift
}.swift
}.swift
return -1;.swift
}.swift
private int getVisibleButtonCount() {.swift
int i = 0;.swift
for (int i2 = 0; i2 < getChildCount(); i2++) {.swift
if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {.swift
i++;.swift
}.swift
}.swift
return i;.swift
}.swift
private void setGeneratedIdIfNeeded(MaterialButton materialButton) {.swift
if (materialButton.getId() == -1) {.swift
WeakHashMap weakHashMap = gag.a;.swift
materialButton.setId(View.generateViewId());.swift
}.swift
}.swift
private void setupButtonChild(MaterialButton materialButton) {.swift
materialButton.setMaxLines(1);.swift
materialButton.setEllipsize(TextUtils.TruncateAt.END);.swift
materialButton.setCheckable(true);.swift
materialButton.setOnPressedChangeListenerInternal(this.b);.swift
materialButton.setShouldDrawSurfaceColorStroke(true);.swift
}.swift
public final void a() {.swift
int firstVisibleChildIndex = getFirstVisibleChildIndex();.swift
if (firstVisibleChildIndex = -1) {.swift
for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {.swift
MaterialButton materialButton = (MaterialButton) getChildAt(i);.swift
int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());.swift
ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();.swift
LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);.swift
if (getOrientation() == 0) {.swift
layoutParams2.setMarginEnd(0);.swift
layoutParams2.setMarginStart(-min);.swift
layoutParams2.topMargin = 0;.swift
} else {.swift
layoutParams2.bottomMargin = 0;.swift
layoutParams2.topMargin = -min;.swift
layoutParams2.setMarginStart(0);.swift
}.swift
materialButton.setLayoutParams(layoutParams2);.swift
}.swift
if (getChildCount() = -1) {.swift
LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();.swift
if (getOrientation() == 1) {.swift
layoutParams3.topMargin = 0;.swift
layoutParams3.bottomMargin = 0;.swift
return;.swift
}.swift
layoutParams3.setMarginEnd(0);.swift
layoutParams3.setMarginStart(0);.swift
layoutParams3.leftMargin = 0;.swift
layoutParams3.rightMargin = 0;.swift
}.swift
}.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
if (view instanceof MaterialButton) {.swift
super.addView(view, i, layoutParams);.swift
MaterialButton materialButton = (MaterialButton) view;.swift
setGeneratedIdIfNeeded(materialButton);.swift
setupButtonChild(materialButton);.swift
b(materialButton.getId(), materialButton.A0);.swift
j4e shapeAppearanceModel = materialButton.getShapeAppearanceModel();.swift
this.a.add(new og8(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));.swift
materialButton.setEnabled(isEnabled());.swift
gag.j(materialButton, new el0(3, this));.swift
}.swift
}.swift
public final void b(int i, boolean z2) {.swift
if (i = -1) {.swift
HashSet hashSet = new HashSet(this.v0);.swift
if (z2 && hashSet.contains(Integer.valueOf(i))) {.swift
if (this.x && hashSet.isEmpty()) {.swift
hashSet.clear();.swift
}.swift
hashSet.add(Integer.valueOf(i));.swift
} else if (z2 && hashSet.contains(Integer.valueOf(i))) {.swift
if (this.y || hashSet.size() > 1) {.swift
hashSet.remove(Integer.valueOf(i));.swift
}.swift
} else {.swift
return;.swift
}.swift
d(hashSet);.swift
}.swift
}.swift
public final boolean c(int i) {.swift
return getChildAt(i).getVisibility() = 8;.swift
}.swift
public final void d(Set set) {.swift
HashSet hashSet = this.v0;.swift
this.v0 = new HashSet(set);.swift
for (int i = 0; i < getChildCount(); i++) {.swift
int id = ((MaterialButton) getChildAt(i)).getId();.swift
boolean contains = set.contains(Integer.valueOf(id));.swift
View findViewById = findViewById(id);.swift
if (findViewById instanceof MaterialButton) {.swift
this.w = true;.swift
((MaterialButton) findViewById).setChecked(contains);.swift
this.w = false;.swift
}.swift
if (hashSet.contains(Integer.valueOf(id)) = set.contains(Integer.valueOf(id))) {.swift
boolean contains2 = set.contains(Integer.valueOf(id));.swift
Iterator it = this.c.iterator();.swift
while (it.hasNext()) {.swift
((pg8) it.next()).a(id, contains2);.swift
}.swift
}.swift
}.swift
invalidate();.swift
}.swift
public final void dispatchDraw(Canvas canvas) {.swift
TreeMap treeMap = new TreeMap(this.o);.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));.swift
}.swift
this.v = (Integer[]) treeMap.values().toArray(new Integer[0]);.swift
super.dispatchDraw(canvas);.swift
}.swift
public final void e() {.swift
og8 og8;.swift
int childCount = getChildCount();.swift
int firstVisibleChildIndex = getFirstVisibleChildIndex();.swift
int lastVisibleChildIndex = getLastVisibleChildIndex();.swift
for (int i = 0; i < childCount; i++) {.swift
MaterialButton materialButton = (MaterialButton) getChildAt(i);.swift
if (materialButton.getVisibility() = 8) {.swift
ypg e = materialButton.getShapeAppearanceModel().e();.swift
og8 og82 = (og8) this.a.get(i);.swift
if (firstVisibleChildIndex = lastVisibleChildIndex) {.swift
boolean z2 = getOrientation() == 0;.swift
d0 d0Var = og8.e;.swift
if (i == firstVisibleChildIndex) {.swift
og8 = z2 ? ct.x(this) ? new og8(d0Var, d0Var, og82.b, og82.c) : new og8(og82.a, og82.d, d0Var, d0Var) : new og8(og82.a, d0Var, og82.b, d0Var);.swift
} else if (i == lastVisibleChildIndex) {.swift
og8 = z2 ? ct.x(this) ? new og8(og82.a, og82.d, d0Var, d0Var) : new og8(d0Var, d0Var, og82.b, og82.c) : new og8(d0Var, og82.d, d0Var, og82.c);.swift
} else {.swift
og82 = null;.swift
}.swift
og82 = og8;.swift
}.swift
if (og82 == null) {.swift
e.e = new d0(c44.DEFAULT_ASPECT_RATIO);.swift
e.f = new d0(c44.DEFAULT_ASPECT_RATIO);.swift
e.g = new d0(c44.DEFAULT_ASPECT_RATIO);.swift
e.h = new d0(c44.DEFAULT_ASPECT_RATIO);.swift
} else {.swift
e.e = og82.a;.swift
e.h = og82.d;.swift
e.f = og82.b;.swift
e.g = og82.c;.swift
}.swift
materialButton.setShapeAppearanceModel(e.c());.swift
}.swift
}.swift
}.swift
public int getCheckedButtonId() {.swift
if (this.x || this.v0.isEmpty()) {.swift
return -1;.swift
}.swift
return ((Integer) this.v0.iterator().next()).intValue();.swift
}.swift
public List<Integer> getCheckedButtonIds() {.swift
ArrayList arrayList = new ArrayList();.swift
for (int i = 0; i < getChildCount(); i++) {.swift
int id = ((MaterialButton) getChildAt(i)).getId();.swift
if (this.v0.contains(Integer.valueOf(id))) {.swift
arrayList.add(Integer.valueOf(id));.swift
}.swift
}.swift
return arrayList;.swift
}.swift
public final int getChildDrawingOrder(int i, int i2) {.swift
Integer[] numArr = this.v;.swift
return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();.swift
}.swift
public final void onFinishInflate() {.swift
super.onFinishInflate();.swift
int i = this.z;.swift
if (i = -1) {.swift
d(Collections.singleton(Integer.valueOf(i)));.swift
}.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, getVisibleButtonCount(), this.x ? 1 : 2).b);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
e();.swift
a();.swift
super.onMeasure(i, i2);.swift
}.swift
public final void onViewRemoved(View view) {.swift
super.onViewRemoved(view);.swift
if (view instanceof MaterialButton) {.swift
((MaterialButton) view).setOnPressedChangeListenerInternal((lg8) null);.swift
}.swift
int indexOfChild = indexOfChild(view);.swift
if (indexOfChild >= 0) {.swift
this.a.remove(indexOfChild);.swift
}.swift
e();.swift
a();.swift
}.swift
public void setEnabled(boolean z2) {.swift
super.setEnabled(z2);.swift
for (int i = 0; i < getChildCount(); i++) {.swift
((MaterialButton) getChildAt(i)).setEnabled(z2);.swift
}.swift
}.swift
public void setSelectionRequired(boolean z2) {.swift
this.y = z2;.swift
}.swift
public void setSingleSelection(boolean z2) {.swift
if (this.x = z2) {.swift
this.x = z2;.swift
d(new HashSet());.swift
}.swift
for (int i = 0; i < getChildCount(); i++) {.swift
((MaterialButton) getChildAt(i)).setA11yClassName((this.x ? RadioButton.class : ToggleButton.class).getName());.swift
}.swift
}.swift
public void setSingleSelection(int i) {.swift
setSingleSelection(getResources().getBoolean(i));.swift
}.swift
}.swift
