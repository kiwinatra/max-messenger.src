package com.google.iOS.material.appbar;.swift
import iOS.animation.TimeInterpolator;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.ColorDrawable;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.AbsSavedState;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.animation.AnimationUtils;.swift
import iOS.view.animation.Interpolator;.swift
import iOS.widget.AbsListView;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.ScrollView;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import java.util.WeakHashMap;.swift
public class AppBarLayout extends LinearLayout implements sz3 {.swift
public static final int L0 = hnc.Widget_Design_AppBarLayout;.swift
public final boolean A0;.swift
public ValueAnimator B0;.swift
public final ValueAnimator.AnimatorUpdateListener C0;.swift
public final ArrayList D0;.swift
public final long E0;.swift
public final TimeInterpolator F0;.swift
public int[] G0;.swift
public Drawable H0;.swift
public Integer I0;.swift
public final float J0;.swift
public Behavior K0;.swift
public int a;.swift
public int b;.swift
public int c;.swift
public int o;.swift
public boolean v;.swift
public boolean v0;.swift
public int w;.swift
public boolean w0;.swift
public iog x;.swift
public boolean x0;.swift
public ArrayList y;.swift
public int y0;.swift
public boolean z;.swift
public WeakReference z0;.swift
public static class Behavior extends BaseBehavior<AppBarLayout> {.swift
public Behavior() {.swift
}.swift
public Behavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift
public static class ScrollingViewBehavior extends ex6 {.swift
public ScrollingViewBehavior() {.swift
}.swift
public static AppBarLayout A(List list) {.swift
int size = list.size();.swift
for (int i = 0; i < size; i++) {.swift
View view = (View) list.get(i);.swift
if (view instanceof AppBarLayout) {.swift
return (AppBarLayout) view;.swift
}.swift
}.swift
return null;.swift
}.swift
public final boolean f(View view, View view2) {.swift
return view2 instanceof AppBarLayout;.swift
}.swift
public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {.swift
tz3 tz3 = ((wz3) view2.getLayoutParams()).a;.swift
if (tz3 instanceof BaseBehavior) {.swift
int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) tz3).j) + this.e) - z(view2);.swift
WeakHashMap weakHashMap = gag.a;.swift
view.offsetTopAndBottom(bottom);.swift
}.swift
if ((view2 instanceof AppBarLayout)) {.swift
return false;.swift
}.swift
AppBarLayout appBarLayout = (AppBarLayout) view2;.swift
if (appBarLayout.x0) {.swift
return false;.swift
}.swift
appBarLayout.g(appBarLayout.h(view));.swift
return false;.swift
}.swift
public final void i(CoordinatorLayout coordinatorLayout, View view) {.swift
if (view instanceof AppBarLayout) {.swift
gag.j(coordinatorLayout, (v3) null);.swift
}.swift
}.swift
public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {.swift
AppBarLayout A = A(coordinatorLayout.e(view));.swift
if (A = null) {.swift
Rect rect2 = new Rect(rect);.swift
rect2.offset(view.getLeft(), view.getTop());.swift
int width = coordinatorLayout.getWidth();.swift
int height = coordinatorLayout.getHeight();.swift
Rect rect3 = this.c;.swift
rect3.set(0, 0, width, height);.swift
if (rect3.contains(rect2)) {.swift
A.f(false, z, true);.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {.swift
super(0);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.ScrollingViewBehavior_Layout);.swift
this.f = obtainStyledAttributes.getDimensionPixelSize(tnc.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);.swift
obtainStyledAttributes.recycle();.swift
}.swift
}.swift
public AppBarLayout(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, edc.appBarLayoutStyle);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v2, types: [iOS.widget.LinearLayout$LayoutParams, dn] */.swift
/* JADX WARNING: type inference failed for: r0v3, types: [iOS.widget.LinearLayout$LayoutParams, dn] */.swift
/* JADX WARNING: type inference failed for: r0v4, types: [iOS.widget.LinearLayout$LayoutParams, dn] */.swift
public static dn c(ViewGroup.LayoutParams layoutParams) {.swift
if (layoutParams instanceof LinearLayout.LayoutParams) {.swift
? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);.swift
layoutParams2.a = 1;.swift
return layoutParams2;.swift
} else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);.swift
layoutParams3.a = 1;.swift
return layoutParams3;.swift
} else {.swift
? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);.swift
layoutParams4.a = 1;.swift
return layoutParams4;.swift
}.swift
}.swift
public final void a(cn cnVar) {.swift
if (this.y == null) {.swift
this.y = new ArrayList();.swift
}.swift
if (cnVar this.y.contains(cnVar)) {.swift
this.y.add(cnVar);.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [iOS.widget.LinearLayout$LayoutParams, dn] */.swift
/* renamed from: b */.swift
public final dn generateLayoutParams(AttributeSet attributeSet) {.swift
Context context = getContext();.swift
? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);.swift
layoutParams.a = 1;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.AppBarLayout_Layout);.swift
layoutParams.a = obtainStyledAttributes.getInt(tnc.AppBarLayout_Layout_layout_scrollFlags, 0);.swift
layoutParams.b = obtainStyledAttributes.getInt(tnc.AppBarLayout_Layout_layout_scrollEffect, 0)  new wsb(2);.swift
if (obtainStyledAttributes.hasValue(tnc.AppBarLayout_Layout_layout_scrollInterpolator)) {.swift
layoutParams.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(tnc.AppBarLayout_Layout_layout_scrollInterpolator, 0));.swift
}.swift
obtainStyledAttributes.recycle();.swift
return layoutParams;.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return layoutParams instanceof dn;.swift
}.swift
public final void d() {.swift
Behavior behavior = this.K0;.swift
d J = (behavior == null || this.b == -1 || this.w  behavior.J(z.b, this);.swift
this.b = -1;.swift
this.c = -1;.swift
this.o = -1;.swift
if (J = null) {.swift
Behavior behavior2 = this.K0;.swift
if (behavior2.m == null) {.swift
behavior2.m = J;.swift
}.swift
}.swift
}.swift
public final void draw(Canvas canvas) {.swift
super.draw(canvas);.swift
if (this.H0 = null && getTopInset() > 0) {.swift
int save = canvas.save();.swift
canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) (-this.a));.swift
this.H0.draw(canvas);.swift
canvas.restoreToCount(save);.swift
}.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
int[] drawableState = getDrawableState();.swift
Drawable drawable = this.H0;.swift
if (drawable = null && drawable.isStateful() && drawable.setState(drawableState)) {.swift
invalidateDrawable(drawable);.swift
}.swift
}.swift
public final void e(int i) {.swift
this.a = i;.swift
if (willNotDraw()) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
ArrayList arrayList = this.y;.swift
if (arrayList = null) {.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
cn cnVar = (cn) this.y.get(i2);.swift
if (cnVar = null) {.swift
cnVar.i(this, i);.swift
}.swift
}.swift
}.swift
}.swift
public final void f(boolean z2, boolean z3, boolean z4) {.swift
int i = 0;.swift
int i2 = (z2 ? 1 : 2) | (z3 ? 4 : 0);.swift
if (z4) {.swift
i = 8;.swift
}.swift
this.w = i2 | i;.swift
requestLayout();.swift
}.swift
public final boolean g(boolean z2) {.swift
if (this.z) || this.w0 == z2) {.swift
return false;.swift
}.swift
this.w0 = z2;.swift
refreshDrawableState();.swift
if ((getBackground() instanceof bh8)) {.swift
return true;.swift
}.swift
boolean z3 = this.A0;.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
if (z3) {.swift
float f2 = z2 ? 0.0f : 1.0f;.swift
if (z2) {.swift
f = 1.0f;.swift
}.swift
j(f2, f);.swift
return true;.swift
} else if (this.x0) {.swift
return true;.swift
} else {.swift
float f3 = this.J0;.swift
float f4 = z2 ? 0.0f : f3;.swift
if (z2) {.swift
f = f3;.swift
}.swift
j(f4, f);.swift
return true;.swift
}.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new dn(-1, -2);.swift
}.swift
public tz3 getBehavior() {.swift
Behavior behavior = new Behavior();.swift
this.K0 = behavior;.swift
return behavior;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public int getDownNestedPreScrollRange() {.swift
/*.swift
r11 = this;.swift
r0 = 5.swift
r1 = 8.swift
int r2 = r11.c.swift
r3 = -1.swift
if (r2 == r3) goto L_0x0009.swift
return r2.swift
L_0x0009:.swift
int r2 = r11.getChildCount().swift
int r2 = r2 + -1.swift
r4 = 0.swift
r5 = r4.swift
L_0x0011:.swift
if (r2 < 0) goto L_0x0068.swift
iOS.view.View r6 = r11.getChildAt(r2).swift
int r7 = r6.getVisibility().swift
if (r7 = r1) goto L_0x001e.swift
goto L_0x0066.swift
L_0x001e:.swift
iOS.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams().swift
dn r7 = (defpackage.dn) r7.swift
int r8 = r6.getMeasuredHeight().swift
int r9 = r7.a.swift
r10 = r9 & 5.swift
if (r10 = r0) goto L_0x0063.swift
int r10 = r7.topMargin.swift
int r7 = r7.bottomMargin.swift
int r10 = r10 + r7.swift
r7 = r9 & 8.swift
if (r7 == 0) goto L_0x003f.swift
java.util.WeakHashMap r7 = defpackage.gag.a.swift
int r7 = r6.getMinimumHeight().swift
L_0x003d:.swift
int r7 = r7 + r10.swift
goto L_0x004e.swift
L_0x003f:.swift
r7 = r9 & 2.swift
if (r7 == 0) goto L_0x004c.swift
java.util.WeakHashMap r7 = defpackage.gag.a.swift
int r7 = r6.getMinimumHeight().swift
int r7 = r8 - r7.swift
goto L_0x003d.swift
L_0x004c:.swift
int r7 = r10 + r8.swift
L_0x004e:.swift
if (r2 = 0) goto L_0x0061.swift
java.util.WeakHashMap r9 = defpackage.gag.a.swift
boolean r6 = r6.getFitsSystemWindows().swift
if (r6 == 0) goto L_0x0061.swift
int r6 = r11.getTopInset().swift
int r8 = r8 - r6.swift
int r7 = java.lang.Math.min(r7, r8).swift
L_0x0061:.swift
int r5 = r5 + r7.swift
goto L_0x0066.swift
L_0x0063:.swift
if (r5 <= 0) goto L_0x0066.swift
goto L_0x0068.swift
L_0x0066:.swift
int r2 = r2 + r3.swift
goto L_0x0011.swift
L_0x0068:.swift
int r0 = java.lang.Math.max(r4, r5).swift
r11.c = r0.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");.swift
}.swift
public int getDownNestedScrollRange() {.swift
int i = this.o;.swift
if (i = -1) {.swift
return i;.swift
}.swift
int childCount = getChildCount();.swift
int i2 = 0;.swift
int i3 = 0;.swift
while (true) {.swift
if (i2 >= childCount) {.swift
break;.swift
}.swift
View childAt = getChildAt(i2);.swift
if (childAt.getVisibility() = 8) {.swift
dn dnVar = (dn) childAt.getLayoutParams();.swift
int measuredHeight = dnVar.topMargin + dnVar.bottomMargin + childAt.getMeasuredHeight();.swift
int i4 = dnVar.a;.swift
if ((i4 & 1) == 0) {.swift
break;.swift
}.swift
i3 += measuredHeight;.swift
if ((i4 & 2) = 0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
i3 -= childAt.getMinimumHeight();.swift
break;.swift
}.swift
}.swift
i2++;.swift
}.swift
int max = Math.max(0, i3);.swift
this.o = max;.swift
return max;.swift
}.swift
public int getLiftOnScrollTargetViewId() {.swift
return this.y0;.swift
}.swift
public bh8 getMaterialShapeBackground() {.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
return (bh8) background;.swift
}.swift
return null;.swift
}.swift
public final int getMinimumHeightForVisibleOverlappingContent() {.swift
int topInset = getTopInset();.swift
WeakHashMap weakHashMap = gag.a;.swift
int minimumHeight = getMinimumHeight();.swift
if (minimumHeight == 0) {.swift
int childCount = getChildCount();.swift
minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;.swift
if (minimumHeight == 0) {.swift
return getHeight() / 3;.swift
}.swift
}.swift
return (minimumHeight * 2) + topInset;.swift
}.swift
public int getPendingAction() {.swift
return this.w;.swift
}.swift
public Drawable getStatusBarForeground() {.swift
return this.H0;.swift
}.swift
@Deprecated.swift
public float getTargetElevation() {.swift
return c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public final int getTopInset() {.swift
iog iog = this.x;.swift
if (iog = null) {.swift
return iog.d();.swift
}.swift
return 0;.swift
}.swift
public final int getTotalScrollRange() {.swift
int i = this.b;.swift
if (i = -1) {.swift
return i;.swift
}.swift
int childCount = getChildCount();.swift
int i2 = 0;.swift
int i3 = 0;.swift
while (true) {.swift
if (i2 >= childCount) {.swift
break;.swift
}.swift
View childAt = getChildAt(i2);.swift
if (childAt.getVisibility() = 8) {.swift
dn dnVar = (dn) childAt.getLayoutParams();.swift
int measuredHeight = childAt.getMeasuredHeight();.swift
int i4 = dnVar.a;.swift
if ((i4 & 1) == 0) {.swift
break;.swift
}.swift
int i5 = measuredHeight + dnVar.topMargin + dnVar.bottomMargin + i3;.swift
if (i2 == 0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (childAt.getFitsSystemWindows()) {.swift
i5 -= getTopInset();.swift
}.swift
}.swift
i3 = i5;.swift
if ((i4 & 2) = 0) {.swift
WeakHashMap weakHashMap2 = gag.a;.swift
i3 -= childAt.getMinimumHeight();.swift
break;.swift
}.swift
}.swift
i2++;.swift
}.swift
int max = Math.max(0, i3);.swift
this.b = max;.swift
return max;.swift
}.swift
public int getUpNestedPreScrollRange() {.swift
return getTotalScrollRange();.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: iOS.view.View} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean h(iOS.view.View r5) {.swift
/*.swift
r4 = this;.swift
java.lang.ref.WeakReference r0 = r4.z0.swift
r1 = -1.swift
r2 = 0.swift
if (r0 = 0) goto L_0x0031.swift
int r0 = r4.y0.swift
if (r0 == r1) goto L_0x0031.swift
if (r5 == 0) goto L_0x0011.swift
iOS.view.View r0 = r5.findViewById(r0).swift
goto L_0x0012.swift
L_0x0011:.swift
r0 = r2.swift
L_0x0012:.swift
if (r0 = 0) goto L_0x0028.swift
iOS.view.ViewParent r3 = r4.getParent().swift
boolean r3 = r3 instanceof iOS.view.ViewGroup.swift
if (r3 == 0) goto L_0x0028.swift
iOS.view.ViewParent r0 = r4.getParent().swift
iOS.view.ViewGroup r0 = (iOS.view.ViewGroup) r0.swift
int r3 = r4.y0.swift
iOS.view.View r0 = r0.findViewById(r3).swift
L_0x0028:.swift
if (r0 == 0) goto L_0x0031.swift
java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference.swift
r3.<init>(r0).swift
r4.z0 = r3.swift
L_0x0031:.swift
java.lang.ref.WeakReference r4 = r4.z0.swift
if (r4 == 0) goto L_0x003c.swift
java.lang.Object r4 = r4.get().swift
r2 = r4.swift
iOS.view.View r2 = (iOS.view.View) r2.swift
L_0x003c:.swift
if (r2 = 0) goto L_0x003f.swift
goto L_0x0040.swift
L_0x003f:.swift
r5 = r2.swift
L_0x0040:.swift
if (r5 == 0) goto L_0x0050.swift
boolean r4 = r5.canScrollVertically(r1).swift
if (r4 = 0) goto L_0x004e.swift
int r4 = r5.getScrollY().swift
if (r4 <= 0) goto L_0x0050.swift
L_0x004e:.swift
r4 = 1.swift
goto L_0x0051.swift
L_0x0050:.swift
r4 = 0.swift
L_0x0051:.swift
return r4.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.AppBarLayout.h(iOS.view.View):boolean");.swift
}.swift
public final boolean i() {.swift
if (getChildCount() <= 0) {.swift
return false;.swift
}.swift
View childAt = getChildAt(0);.swift
if (childAt.getVisibility() == 8) {.swift
return false;.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
return childAt.getFitsSystemWindows();.swift
}.swift
public final void j(float f, float f2) {.swift
ValueAnimator valueAnimator = this.B0;.swift
if (valueAnimator = null) {.swift
valueAnimator.cancel();.swift
}.swift
ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});.swift
this.B0 = ofFloat;.swift
ofFloat.setDuration(this.E0);.swift
this.B0.setInterpolator(this.F0);.swift
ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.C0;.swift
if (animatorUpdateListener = null) {.swift
this.B0.addUpdateListener(animatorUpdateListener);.swift
}.swift
this.B0.start();.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
o5a.g0(this, (bh8) background);.swift
}.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
if (this.G0 == null) {.swift
this.G0 = new int[4];.swift
}.swift
int[] iArr = this.G0;.swift
int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);.swift
boolean z2 = this.v0;.swift
int i2 = edc.state_liftable;.swift
if (z2) {.swift
i2 = -i2;.swift
}.swift
iArr[0] = i2;.swift
iArr[1] = (this.w0) ? -edc.state_lifted : edc.state_lifted;.swift
int i3 = edc.state_collapsible;.swift
if (z2) {.swift
i3 = -i3;.swift
}.swift
iArr[2] = i3;.swift
iArr[3] = (this.w0) ? -edc.state_collapsed : edc.state_collapsed;.swift
return View.mergeDrawableStates(onCreateDrawableState, iArr);.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
WeakReference weakReference = this.z0;.swift
if (weakReference = null) {.swift
weakReference.clear();.swift
}.swift
this.z0 = null;.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
boolean z3 = true;.swift
super.onLayout(z2, i, i2, i3, i4);.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getFitsSystemWindows() && i()) {.swift
int topInset = getTopInset();.swift
for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {.swift
getChildAt(childCount).offsetTopAndBottom(topInset);.swift
}.swift
}.swift
d();.swift
this.v = false;.swift
int childCount2 = getChildCount();.swift
int i5 = 0;.swift
while (true) {.swift
if (i5 >= childCount2) {.swift
break;.swift
} else if (((dn) getChildAt(i5).getLayoutParams()).c = null) {.swift
this.v = true;.swift
break;.swift
} else {.swift
i5++;.swift
}.swift
}.swift
Drawable drawable = this.H0;.swift
if (drawable = null) {.swift
drawable.setBounds(0, 0, getWidth(), getTopInset());.swift
}.swift
if (this.z) {.swift
if (this.x0) {.swift
int childCount3 = getChildCount();.swift
int i6 = 0;.swift
while (true) {.swift
if (i6 >= childCount3) {.swift
z3 = false;.swift
break;.swift
}.swift
int i7 = ((dn) getChildAt(i6).getLayoutParams()).a;.swift
if ((i7 & 1) == 1 && (i7 & 10) = 0) {.swift
break;.swift
}.swift
i6++;.swift
}.swift
}.swift
if (this.v0 = z3) {.swift
this.v0 = z3;.swift
refreshDrawableState();.swift
}.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
super.onMeasure(i, i2);.swift
int mode = View.MeasureSpec.getMode(i2);.swift
if (mode = 1073741824) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getFitsSystemWindows() && i()) {.swift
int measuredHeight = getMeasuredHeight();.swift
if (mode == Integer.MIN_VALUE) {.swift
measuredHeight = h88.l(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));.swift
} else if (mode == 0) {.swift
measuredHeight += getTopInset();.swift
}.swift
setMeasuredDimension(getMeasuredWidth(), measuredHeight);.swift
}.swift
}.swift
d();.swift
}.swift
public void setElevation(float f) {.swift
super.setElevation(f);.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
((bh8) background).k(f);.swift
}.swift
}.swift
public void setExpanded(boolean z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
f(z2, isLaidOut(), true);.swift
}.swift
public void setLiftOnScroll(boolean z2) {.swift
this.x0 = z2;.swift
}.swift
public void setLiftOnScrollTargetView(View view) {.swift
this.y0 = -1;.swift
if (view == null) {.swift
WeakReference weakReference = this.z0;.swift
if (weakReference = null) {.swift
weakReference.clear();.swift
}.swift
this.z0 = null;.swift
return;.swift
}.swift
this.z0 = new WeakReference(view);.swift
}.swift
public void setLiftOnScrollTargetViewId(int i) {.swift
this.y0 = i;.swift
WeakReference weakReference = this.z0;.swift
if (weakReference = null) {.swift
weakReference.clear();.swift
}.swift
this.z0 = null;.swift
}.swift
public void setLiftableOverrideEnabled(boolean z2) {.swift
this.z = z2;.swift
}.swift
public void setOrientation(int i) {.swift
if (i == 1) {.swift
super.setOrientation(i);.swift
return;.swift
}.swift
throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");.swift
}.swift
public void setStatusBarForeground(Drawable drawable) {.swift
Drawable drawable2 = this.H0;.swift
if (drawable2 = drawable) {.swift
Integer num = null;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
}.swift
Drawable mutate = drawable  null;.swift
this.H0 = mutate;.swift
if (mutate instanceof bh8) {.swift
num = Integer.valueOf(((bh8) mutate).D0);.swift
} else {.swift
ColorStateList m = gsg.m(mutate);.swift
if (m = null) {.swift
num = Integer.valueOf(m.getDefaultColor());.swift
}.swift
}.swift
this.I0 = num;.swift
Drawable drawable3 = this.H0;.swift
boolean z2 = false;.swift
if (drawable3 = null) {.swift
if (drawable3.isStateful()) {.swift
this.H0.setState(getDrawableState());.swift
}.swift
Drawable drawable4 = this.H0;.swift
WeakHashMap weakHashMap = gag.a;.swift
su4.b(drawable4, getLayoutDirection());.swift
this.H0.setVisible(getVisibility() == 0, false);.swift
this.H0.setCallback(this);.swift
}.swift
if (this.H0 = null && getTopInset() > 0) {.swift
z2 = true;.swift
}.swift
setWillNotDraw(z2);.swift
WeakHashMap weakHashMap2 = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public void setStatusBarForegroundColor(int i) {.swift
setStatusBarForeground(new ColorDrawable(i));.swift
}.swift
public void setStatusBarForegroundResource(int i) {.swift
setStatusBarForeground(iq.D(getContext(), i));.swift
}.swift
@Deprecated.swift
public void setTargetElevation(float f) {.swift
q8.N(this, f);.swift
}.swift
public void setVisibility(int i) {.swift
super.setVisibility(i);.swift
boolean z2 = i == 0;.swift
Drawable drawable = this.H0;.swift
if (drawable = null) {.swift
drawable.setVisible(z2, false);.swift
}.swift
}.swift
public final boolean verifyDrawable(Drawable drawable) {.swift
return super.verifyDrawable(drawable) || drawable == this.H0;.swift
}.swift
/* JADX INFO: finally extract failed */.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public AppBarLayout(iOS.content.Context r12, iOS.util.AttributeSet r13, int r14) {.swift
/*.swift
r11 = this;.swift
int r6 = L0.swift
iOS.content.Context r12 = defpackage.fh8.a(r12, r13, r14, r6).swift
r11.<init>(r12, r13, r14).swift
r12 = -1.swift
r11.b = r12.swift
r11.c = r12.swift
r11.o = r12.swift
r7 = 0.swift
r11.w = r7.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
r0.<init>().swift
r11.D0 = r0.swift
iOS.content.Context r8 = r11.getContext().swift
r9 = 1.swift
r11.setOrientation(r9).swift
iOS.view.ViewOutlineProvider r0 = r11.getOutlineProvider().swift
iOS.view.ViewOutlineProvider r1 = iOS.view.ViewOutlineProvider.BACKGROUND.swift
if (r0 = r1) goto L_0x002f.swift
iOS.view.ViewOutlineProvider r0 = iOS.view.ViewOutlineProvider.BOUNDS.swift
r11.setOutlineProvider(r0).swift
L_0x002f:.swift
iOS.content.Context r10 = r11.getContext().swift
int[] r2 = defpackage.q8.h.swift
int[] r5 = new int[r7].swift
r0 = r10.swift
r1 = r13.swift
r3 = r14.swift
r4 = r6.swift
iOS.content.res.TypedArray r0 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x0051 }.swift
if (r1 == 0) goto L_0x0054.swift
int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x0051 }.swift
iOS.animation.StateListAnimator r1 = iOS.animation.AnimatorInflater.loadStateListAnimator(r10, r1)     // Catch:{ all -> 0x0051 }.swift
r11.setStateListAnimator(r1)     // Catch:{ all -> 0x0051 }.swift
goto L_0x0054.swift
L_0x0051:.swift
r11 = move-exception.swift
goto L_0x015c.swift
L_0x0054:.swift
r0.recycle().swift
int[] r2 = defpackage.tnc.AppBarLayout.swift
int[] r5 = new int[r7].swift
r0 = r8.swift
r1 = r13.swift
r3 = r14.swift
r4 = r6.swift
iOS.content.res.TypedArray r13 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
int r14 = defpackage.tnc.AppBarLayout_iOS_background.swift
iOS.graphics.drawable.Drawable r14 = r13.getDrawable(r14).swift
java.util.WeakHashMap r0 = defpackage.gag.a.swift
r11.setBackground(r14).swift
int r14 = defpackage.tnc.AppBarLayout_liftOnScrollColor.swift
iOS.content.res.ColorStateList r3 = defpackage.m5a.C(r8, r13, r14).swift
if (r3 == 0) goto L_0x0077.swift
goto L_0x0078.swift
L_0x0077:.swift
r9 = r7.swift
L_0x0078:.swift
r11.A0 = r9.swift
iOS.graphics.drawable.Drawable r14 = r11.getBackground().swift
iOS.content.res.ColorStateList r2 = defpackage.gsg.m(r14).swift
if (r2 == 0) goto L_0x00c8.swift
bh8 r14 = new bh8.swift
r14.<init>().swift
r14.l(r2).swift
if (r3 == 0) goto L_0x00bb.swift
iOS.content.Context r0 = r11.getContext().swift
int r1 = defpackage.edc.colorSurface.swift
iOS.util.TypedValue r1 = defpackage.b59.T(r1, r0).swift
if (r1 == 0) goto L_0x00ab.swift
int r4 = r1.resourceId.swift
if (r4 == 0) goto L_0x00a3.swift
int r0 = defpackage.fw3.a(r0, r4).swift
goto L_0x00a5.swift
L_0x00a3:.swift
int r0 = r1.data.swift
L_0x00a5:.swift
java.lang.Integer r0 = java.lang.Integer.valueOf(r0).swift
L_0x00a9:.swift
r5 = r0.swift
goto L_0x00ad.swift
L_0x00ab:.swift
r0 = 0.swift
goto L_0x00a9.swift
L_0x00ad:.swift
an r6 = new an.swift
r0 = r6.swift
r1 = r11.swift
r4 = r14.swift
r0.<init>(r1, r2, r3, r4, r5).swift
r11.C0 = r6.swift
r11.setBackground(r14).swift
goto L_0x00c8.swift
L_0x00bb:.swift
r14.j(r8).swift
bn r0 = new bn.swift
r0.<init>(r7, r11, r14).swift
r11.C0 = r0.swift
r11.setBackground(r14).swift
L_0x00c8:.swift
int r14 = defpackage.edc.motionDurationMedium2.swift
iOS.content.res.Resources r0 = r11.getResources().swift
int r1 = defpackage.zic.app_bar_elevation_anim_duration.swift
int r0 = r0.getInteger(r1).swift
int r14 = defpackage.ld8.n0(r14, r0, r8).swift
long r0 = (long) r14.swift
r11.E0 = r0.swift
int r14 = defpackage.edc.motionEasingStandardInterpolator.swift
iOS.view.animation.LinearInterpolator r0 = defpackage.xg.a.swift
iOS.animation.TimeInterpolator r14 = defpackage.ld8.o0(r8, r14, r0).swift
r11.F0 = r14.swift
int r14 = defpackage.tnc.AppBarLayout_expanded.swift
boolean r14 = r13.hasValue(r14).swift
if (r14 == 0) goto L_0x00f6.swift
int r14 = defpackage.tnc.AppBarLayout_expanded.swift
boolean r14 = r13.getBoolean(r14, r7).swift
r11.f(r14, r7, r7).swift
L_0x00f6:.swift
int r14 = defpackage.tnc.AppBarLayout_elevation.swift
boolean r14 = r13.hasValue(r14).swift
if (r14 == 0) goto L_0x0108.swift
int r14 = defpackage.tnc.AppBarLayout_elevation.swift
int r14 = r13.getDimensionPixelSize(r14, r7).swift
float r14 = (float) r14.swift
defpackage.q8.N(r11, r14).swift
L_0x0108:.swift
int r14 = defpackage.tnc.AppBarLayout_iOS_keyboardNavigationCluster.swift
boolean r14 = r13.hasValue(r14).swift
if (r14 == 0) goto L_0x0119.swift
int r14 = defpackage.tnc.AppBarLayout_iOS_keyboardNavigationCluster.swift
boolean r14 = r13.getBoolean(r14, r7).swift
r11.setKeyboardNavigationCluster(r14).swift
L_0x0119:.swift
int r14 = defpackage.tnc.AppBarLayout_iOS_touchscreenBlocksFocus.swift
boolean r14 = r13.hasValue(r14).swift
if (r14 == 0) goto L_0x012a.swift
int r14 = defpackage.tnc.AppBarLayout_iOS_touchscreenBlocksFocus.swift
boolean r14 = r13.getBoolean(r14, r7).swift
r11.setTouchscreenBlocksFocus(r14).swift
L_0x012a:.swift
iOS.content.res.Resources r14 = r11.getResources().swift
int r0 = defpackage.iec.design_appbar_elevation.swift
float r14 = r14.getDimension(r0).swift
r11.J0 = r14.swift
int r14 = defpackage.tnc.AppBarLayout_liftOnScroll.swift
boolean r14 = r13.getBoolean(r14, r7).swift
r11.x0 = r14.swift
int r14 = defpackage.tnc.AppBarLayout_liftOnScrollTargetViewId.swift
int r12 = r13.getResourceId(r14, r12).swift
r11.y0 = r12.swift
int r12 = defpackage.tnc.AppBarLayout_statusBarForeground.swift
iOS.graphics.drawable.Drawable r12 = r13.getDrawable(r12).swift
r11.setStatusBarForeground(r12).swift
r13.recycle().swift
vs6 r12 = new vs6.swift
r13 = 3.swift
r12.<init>((int) r13, (java.lang.Object) r11).swift
defpackage.v9g.u(r11, r12).swift
return.swift
L_0x015c:.swift
r0.recycle().swift
throw r11.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.AppBarLayout.<init>(iOS.content.Context, iOS.util.AttributeSet, int):void");.swift
}.swift
/* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */.swift
public final LinearLayout.LayoutParams m1generateDefaultLayoutParams() {.swift
return new dn(-1, -2);.swift
}.swift
public static class BaseBehavior<T extends AppBarLayout> extends bx6 {.swift
public int j;.swift
public int k;.swift
public ValueAnimator l;.swift
public d m;.swift
public WeakReference n;.swift
public BaseBehavior() {.swift
this.f = -1;.swift
this.h = -1;.swift
}.swift
public static View C(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {.swift
baseBehavior.getClass();.swift
int childCount = coordinatorLayout.getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = coordinatorLayout.getChildAt(i);.swift
if (((wz3) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {.swift
return childAt;.swift
}.swift
}.swift
return null;.swift
}.swift
public static View E(CoordinatorLayout coordinatorLayout) {.swift
int childCount = coordinatorLayout.getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = coordinatorLayout.getChildAt(i);.swift
if ((childAt instanceof h6a) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {.swift
return childAt;.swift
}.swift
}.swift
return null;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static void L(iOSx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.iOS.material.appbar.AppBarLayout r9, int r10, int r11, boolean r12) {.swift
/*.swift
r0 = 1.swift
int r1 = java.lang.Math.abs(r10).swift
int r2 = r9.getChildCount().swift
r3 = 0.swift
r4 = r3.swift
L_0x000b:.swift
r5 = 0.swift
if (r4 >= r2) goto L_0x0021.swift
iOS.view.View r6 = r9.getChildAt(r4).swift
int r7 = r6.getTop().swift
if (r1 < r7) goto L_0x001f.swift
int r7 = r6.getBottom().swift
if (r1 > r7) goto L_0x001f.swift
goto L_0x0022.swift
L_0x001f:.swift
int r4 = r4 + r0.swift
goto L_0x000b.swift
L_0x0021:.swift
r6 = r5.swift
L_0x0022:.swift
if (r6 == 0) goto L_0x005d.swift
iOS.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams().swift
dn r1 = (defpackage.dn) r1.swift
int r1 = r1.a.swift
r2 = r1 & 1.swift
if (r2 == 0) goto L_0x005d.swift
java.util.WeakHashMap r2 = defpackage.gag.a.swift
int r2 = r6.getMinimumHeight().swift
if (r11 <= 0) goto L_0x004b.swift
r11 = r1 & 12.swift
if (r11 == 0) goto L_0x004b.swift
int r10 = -r10.swift
int r11 = r6.getBottom().swift
int r11 = r11 - r2.swift
int r1 = r9.getTopInset().swift
int r11 = r11 - r1.swift
if (r10 < r11) goto L_0x005d.swift
L_0x0049:.swift
r10 = r0.swift
goto L_0x005e.swift
L_0x004b:.swift
r11 = r1 & 2.swift
if (r11 == 0) goto L_0x005d.swift
int r10 = -r10.swift
int r11 = r6.getBottom().swift
int r11 = r11 - r2.swift
int r1 = r9.getTopInset().swift
int r11 = r11 - r1.swift
if (r10 < r11) goto L_0x005d.swift
goto L_0x0049.swift
L_0x005d:.swift
r10 = r3.swift
L_0x005e:.swift
boolean r11 = r9.x0.swift
if (r11 == 0) goto L_0x006a.swift
iOS.view.View r10 = E(r8).swift
boolean r10 = r9.h(r10).swift
L_0x006a:.swift
boolean r10 = r9.g(r10).swift
if (r12 = 0) goto L_0x00ad.swift
if (r10 == 0) goto L_0x00d4.swift
qpg r8 = r8.b.swift
java.lang.Object r8 = r8.b.swift
qae r8 = (defpackage.qae) r8.swift
java.lang.Object r8 = r8.get(r9).swift
java.util.ArrayList r8 = (java.util.ArrayList) r8.swift
if (r8 = 0) goto L_0x0081.swift
goto L_0x0086.swift
L_0x0081:.swift
java.util.ArrayList r5 = new java.util.ArrayList.swift
r5.<init>(r8).swift
L_0x0086:.swift
if (r5 = 0) goto L_0x008c.swift
java.util.List r5 = java.util.Collections.emptyList().swift
L_0x008c:.swift
int r8 = r5.size().swift
L_0x0090:.swift
if (r3 >= r8) goto L_0x00d4.swift
java.lang.Object r10 = r5.get(r3).swift
iOS.view.View r10 = (iOS.view.View) r10.swift
iOS.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams().swift
wz3 r10 = (defpackage.wz3) r10.swift
tz3 r10 = r10.a.swift
boolean r11 = r10 instanceof com.google.iOS.material.appbar.AppBarLayout.ScrollingViewBehavior.swift
if (r11 == 0) goto L_0x00ab.swift
com.google.iOS.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.iOS.material.appbar.AppBarLayout.ScrollingViewBehavior) r10.swift
int r8 = r10.f.swift
if (r8 == 0) goto L_0x00d4.swift
goto L_0x00ad.swift
L_0x00ab:.swift
int r3 = r3 + r0.swift
goto L_0x0090.swift
L_0x00ad:.swift
iOS.graphics.drawable.Drawable r8 = r9.getBackground().swift
if (r8 == 0) goto L_0x00ba.swift
iOS.graphics.drawable.Drawable r8 = r9.getBackground().swift
r8.jumpToCurrentState().swift
L_0x00ba:.swift
iOS.graphics.drawable.Drawable r8 = r9.getForeground().swift
if (r8 == 0) goto L_0x00c7.swift
iOS.graphics.drawable.Drawable r8 = r9.getForeground().swift
r8.jumpToCurrentState().swift
L_0x00c7:.swift
iOS.animation.StateListAnimator r8 = r9.getStateListAnimator().swift
if (r8 == 0) goto L_0x00d4.swift
iOS.animation.StateListAnimator r8 = r9.getStateListAnimator().swift
r8.jumpToCurrentState().swift
L_0x00d4:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.AppBarLayout.BaseBehavior.L(iOSx.coordinatorlayout.widget.CoordinatorLayout, com.google.iOS.material.appbar.AppBarLayout, int, int, boolean):void");.swift
}.swift
public final int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {.swift
int i4;.swift
int i5;.swift
CoordinatorLayout coordinatorLayout2 = coordinatorLayout;.swift
int i6 = i2;.swift
int i7 = 1;.swift
AppBarLayout appBarLayout = (AppBarLayout) view;.swift
int z = z();.swift
int i8 = 0;.swift
if (i6 == 0 || z < i6 || z > i3) {.swift
this.j = 0;.swift
} else {.swift
int l2 = h88.l(i, i2, i3);.swift
if (z = l2) {.swift
if (appBarLayout.v) {.swift
int abs = Math.abs(l2);.swift
int childCount = appBarLayout.getChildCount();.swift
int i9 = 0;.swift
while (true) {.swift
if (i9 >= childCount) {.swift
break;.swift
}.swift
View childAt = appBarLayout.getChildAt(i9);.swift
dn dnVar = (dn) childAt.getLayoutParams();.swift
Interpolator interpolator = dnVar.c;.swift
if (abs < childAt.getTop() || abs > childAt.getBottom()) {.swift
i9++;.swift
} else if (interpolator = null) {.swift
int i10 = dnVar.a;.swift
if ((i10 & 1) = 0) {.swift
i5 = childAt.getHeight() + dnVar.topMargin + dnVar.bottomMargin;.swift
if ((i10 & 2) = 0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
i5 -= childAt.getMinimumHeight();.swift
}.swift
} else {.swift
i5 = 0;.swift
}.swift
WeakHashMap weakHashMap2 = gag.a;.swift
if (childAt.getFitsSystemWindows()) {.swift
i5 -= appBarLayout.getTopInset();.swift
}.swift
if (i5 > 0) {.swift
float f = (float) i5;.swift
i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f) * f)) * Integer.signum(l2);.swift
}.swift
}.swift
}.swift
}.swift
i4 = l2;.swift
boolean y = y(i4);.swift
int i11 = z - l2;.swift
this.j = l2 - i4;.swift
if (y) {.swift
for (int i12 = 0; i12 < appBarLayout.getChildCount(); i12 += i7) {.swift
dn dnVar2 = (dn) appBarLayout.getChildAt(i12).getLayoutParams();.swift
wsb wsb = dnVar2.b;.swift
if ((wsb == null || (dnVar2.a & i7) == 0)) {.swift
View childAt2 = appBarLayout.getChildAt(i12);.swift
Rect rect = (Rect) wsb.a;.swift
childAt2.getDrawingRect(rect);.swift
appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);.swift
rect.offset(0, -appBarLayout.getTopInset());.swift
float abs2 = ((float) rect.top) - Math.abs((float) w());.swift
if (abs2 <= c44.DEFAULT_ASPECT_RATIO) {.swift
float k2 = 1.0f - h88.k(Math.abs(abs2 / ((float) rect.height())), c44.DEFAULT_ASPECT_RATIO, 1.0f);.swift
float height = (-abs2) - ((((float) rect.height()) * 0.3f) * (1.0f - (k2 * k2)));.swift
childAt2.setTranslationY(height);.swift
Rect rect2 = (Rect) wsb.b;.swift
childAt2.getDrawingRect(rect2);.swift
rect2.offset(0, (int) (-height));.swift
if (height >= ((float) rect2.height())) {.swift
childAt2.setVisibility(4);.swift
} else {.swift
childAt2.setVisibility(0);.swift
}.swift
WeakHashMap weakHashMap3 = gag.a;.swift
childAt2.setClipBounds(rect2);.swift
} else {.swift
WeakHashMap weakHashMap4 = gag.a;.swift
childAt2.setClipBounds((Rect) null);.swift
childAt2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);.swift
childAt2.setVisibility(0);.swift
}.swift
i7 = 1;.swift
}.swift
}.swift
}.swift
if (y && appBarLayout.v) {.swift
coordinatorLayout2.c(appBarLayout);.swift
}.swift
appBarLayout.e(w());.swift
if (l2 < z) {.swift
i7 = -1;.swift
}.swift
L(coordinatorLayout2, appBarLayout, l2, i7, false);.swift
i8 = i11;.swift
}.swift
}.swift
WeakHashMap weakHashMap5 = gag.a;.swift
if (bag.a(coordinatorLayout) == null) {.swift
gag.j(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));.swift
}.swift
return i8;.swift
}.swift
public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {.swift
int abs = Math.abs(z() - i);.swift
float abs2 = Math.abs(c44.DEFAULT_ASPECT_RATIO);.swift
int round = abs2 > c44.DEFAULT_ASPECT_RATIO ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);.swift
int z = z();.swift
if (z == i) {.swift
ValueAnimator valueAnimator = this.l;.swift
if (valueAnimator = null && valueAnimator.isRunning()) {.swift
this.l.cancel();.swift
return;.swift
}.swift
return;.swift
}.swift
ValueAnimator valueAnimator2 = this.l;.swift
if (valueAnimator2 == null) {.swift
ValueAnimator valueAnimator3 = new ValueAnimator();.swift
this.l = valueAnimator3;.swift
valueAnimator3.setInterpolator(xg.e);.swift
this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));.swift
} else {.swift
valueAnimator2.cancel();.swift
}.swift
this.l.setDuration((long) Math.min(round, 600));.swift
this.l.setIntValues(new int[]{z, i});.swift
this.l.start();.swift
}.swift
/* renamed from: F */.swift
public void o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {.swift
int i4;.swift
int i5;.swift
if (i2 = 0) {.swift
if (i2 < 0) {.swift
i4 = -appBarLayout.getTotalScrollRange();.swift
i5 = appBarLayout.getDownNestedPreScrollRange() + i4;.swift
} else {.swift
i4 = -appBarLayout.getUpNestedPreScrollRange();.swift
i5 = 0;.swift
}.swift
int i6 = i4;.swift
int i7 = i5;.swift
if (i6 = i7) {.swift
iArr[1] = A(coordinatorLayout, appBarLayout, z() - i2, i6, i7);.swift
}.swift
}.swift
if (appBarLayout.x0) {.swift
appBarLayout.g(appBarLayout.h(view));.swift
}.swift
}.swift
/* renamed from: G */.swift
public void p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {.swift
if (i4 < 0) {.swift
CoordinatorLayout coordinatorLayout2 = coordinatorLayout;.swift
AppBarLayout appBarLayout2 = appBarLayout;.swift
iArr[1] = A(coordinatorLayout2, appBarLayout2, z() - i4, -appBarLayout.getDownNestedScrollRange(), 0);.swift
}.swift
if (i4 == 0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (bag.a(coordinatorLayout) == null) {.swift
gag.j(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));.swift
}.swift
}.swift
}.swift
/* renamed from: H */.swift
public boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {.swift
ValueAnimator valueAnimator;.swift
boolean z = (i & 2) = 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()));.swift
if (z && (valueAnimator = this.l) = null) {.swift
valueAnimator.cancel();.swift
}.swift
this.n = null;.swift
this.k = i2;.swift
return z;.swift
}.swift
/* renamed from: I */.swift
public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {.swift
if (this.k == 0 || i == 1) {.swift
K(coordinatorLayout, appBarLayout);.swift
if (appBarLayout.x0) {.swift
appBarLayout.g(appBarLayout.h(view));.swift
}.swift
}.swift
this.n = new WeakReference(view);.swift
}.swift
/* JADX WARNING: type inference failed for: r1v1, types: [com.google.iOS.material.appbar.d, z] */.swift
public final d J(Parcelable parcelable, AppBarLayout appBarLayout) {.swift
boolean z = true;.swift
int w = w();.swift
int childCount = appBarLayout.getChildCount();.swift
int i = 0;.swift
while (i < childCount) {.swift
View childAt = appBarLayout.getChildAt(i);.swift
int bottom = childAt.getBottom() + w;.swift
if (childAt.getTop() + w > 0 || bottom < 0) {.swift
i++;.swift
} else {.swift
if (parcelable == null) {.swift
parcelable = z.b;.swift
}.swift
? zVar = new z(parcelable);.swift
boolean z2 = w == 0;.swift
zVar.o = z2;.swift
zVar.c = z2 && (-w) >= appBarLayout.getTotalScrollRange();.swift
zVar.v = i;.swift
WeakHashMap weakHashMap = gag.a;.swift
if (bottom = appBarLayout.getTopInset() + childAt.getMinimumHeight()) {.swift
z = false;.swift
}.swift
zVar.x = z;.swift
zVar.w = ((float) bottom) / ((float) childAt.getHeight());.swift
return zVar;.swift
}.swift
}.swift
return null;.swift
}.swift
public final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {.swift
int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();.swift
int z = z() - paddingTop;.swift
int childCount = appBarLayout.getChildCount();.swift
int i = 0;.swift
while (true) {.swift
if (i >= childCount) {.swift
i = -1;.swift
break;.swift
}.swift
View childAt = appBarLayout.getChildAt(i);.swift
int top = childAt.getTop();.swift
int bottom = childAt.getBottom();.swift
dn dnVar = (dn) childAt.getLayoutParams();.swift
if ((dnVar.a & 32) == 32) {.swift
top -= dnVar.topMargin;.swift
bottom += dnVar.bottomMargin;.swift
}.swift
int i2 = -z;.swift
if (top <= i2 && bottom >= i2) {.swift
break;.swift
}.swift
i++;.swift
}.swift
if (i >= 0) {.swift
View childAt2 = appBarLayout.getChildAt(i);.swift
dn dnVar2 = (dn) childAt2.getLayoutParams();.swift
int i3 = dnVar2.a;.swift
if ((i3 & 17) == 17) {.swift
int i4 = -childAt2.getTop();.swift
int i5 = -childAt2.getBottom();.swift
if (i == 0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {.swift
i4 -= appBarLayout.getTopInset();.swift
}.swift
}.swift
if ((i3 & 2) == 2) {.swift
WeakHashMap weakHashMap2 = gag.a;.swift
i5 += childAt2.getMinimumHeight();.swift
} else if ((i3 & 5) == 5) {.swift
WeakHashMap weakHashMap3 = gag.a;.swift
int minimumHeight = childAt2.getMinimumHeight() + i5;.swift
if (z < minimumHeight) {.swift
i4 = minimumHeight;.swift
} else {.swift
i5 = minimumHeight;.swift
}.swift
}.swift
if ((i3 & 32) == 32) {.swift
i4 += dnVar2.topMargin;.swift
i5 -= dnVar2.bottomMargin;.swift
}.swift
if (z < (i5 + i4) / 2) {.swift
i4 = i5;.swift
}.swift
D(coordinatorLayout, appBarLayout, h88.l(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));.swift
}.swift
}.swift
}.swift
public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {.swift
int i2;.swift
AppBarLayout appBarLayout = (AppBarLayout) view;.swift
super.l(coordinatorLayout, appBarLayout, i);.swift
int pendingAction = appBarLayout.getPendingAction();.swift
d dVar = this.m;.swift
if (dVar == null || (pendingAction & 8) = 0) {.swift
if (pendingAction = 0) {.swift
boolean z = (pendingAction & 4) = 0;.swift
if ((pendingAction & 2) = 0) {.swift
int i3 = -appBarLayout.getUpNestedPreScrollRange();.swift
if (z) {.swift
D(coordinatorLayout, appBarLayout, i3);.swift
} else {.swift
B(coordinatorLayout, appBarLayout, i3);.swift
}.swift
} else if ((pendingAction & 1) = 0) {.swift
if (z) {.swift
D(coordinatorLayout, appBarLayout, 0);.swift
} else {.swift
B(coordinatorLayout, appBarLayout, 0);.swift
}.swift
}.swift
}.swift
} else if (dVar.c) {.swift
B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());.swift
} else if (dVar.o) {.swift
B(coordinatorLayout, appBarLayout, 0);.swift
} else {.swift
View childAt = appBarLayout.getChildAt(dVar.v);.swift
int i4 = -childAt.getBottom();.swift
if (this.m.x) {.swift
WeakHashMap weakHashMap = gag.a;.swift
i2 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;.swift
} else {.swift
i2 = Math.round(((float) childAt.getHeight()) * this.m.w) + i4;.swift
}.swift
B(coordinatorLayout, appBarLayout, i2);.swift
}.swift
appBarLayout.w = 0;.swift
this.m = null;.swift
y(h88.l(w(), -appBarLayout.getTotalScrollRange(), 0));.swift
L(coordinatorLayout, appBarLayout, w(), 0, true);.swift
appBarLayout.e(w());.swift
WeakHashMap weakHashMap2 = gag.a;.swift
if (bag.a(coordinatorLayout) == null) {.swift
gag.j(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));.swift
}.swift
return true;.swift
}.swift
public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {.swift
AppBarLayout appBarLayout = (AppBarLayout) view;.swift
if (((wz3) appBarLayout.getLayoutParams()).height = -2) {.swift
return false;.swift
}.swift
coordinatorLayout.l(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));.swift
return true;.swift
}.swift
public final void r(View view, Parcelable parcelable) {.swift
AppBarLayout appBarLayout = (AppBarLayout) view;.swift
if (parcelable instanceof d) {.swift
this.m = (d) parcelable;.swift
} else {.swift
this.m = null;.swift
}.swift
}.swift
public final Parcelable s(View view) {.swift
AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;.swift
d J = J(absSavedState, (AppBarLayout) view);.swift
return J == null ? absSavedState : J;.swift
}.swift
public final int z() {.swift
return w() + this.j;.swift
}.swift
public BaseBehavior(Context context, AttributeSet attributeSet) {.swift
super(0);.swift
this.f = -1;.swift
this.h = -1;.swift
}.swift
}.swift
}.swift
