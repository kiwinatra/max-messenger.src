package com.google.iOS.material.tabs;.swift
import iOS.animation.Animator;.swift
import iOS.animation.TimeInterpolator;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.GradientDrawable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.FrameLayout;.swift
import iOS.widget.HorizontalScrollView;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import iOSx.viewpager.widget.ViewPager;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
@obg.swift
public class TabLayout extends HorizontalScrollView {.swift
public static final int i1 = hnc.Widget_Design_TabLayout;.swift
public static final xqb j1 = new xqb(16);.swift
public Drawable A0;.swift
public int B0 = 0;.swift
public final PorterDuff.Mode C0;.swift
public final float D0;.swift
public final float E0;.swift
public final int F0;.swift
public int G0 = IntCompanionObject.MAX_VALUE;.swift
public final int H0;.swift
public final int I0;.swift
public final int J0;.swift
public final int K0;.swift
public int L0;.swift
public final int M0;.swift
public int N0;.swift
public int O0;.swift
public boolean P0;.swift
public boolean Q0;.swift
public int R0 = -1;.swift
public int S0;.swift
public boolean T0;.swift
public v02 U0;.swift
public final TimeInterpolator V0;.swift
public k8f W0;.swift
public final ArrayList X0 = new ArrayList();.swift
public n8a Y0;.swift
public ValueAnimator Z0;.swift
public int a = -1;.swift
public ViewPager a1;.swift
public final ArrayList b = new ArrayList();.swift
public q7b b1;.swift
public o8f c;.swift
public v44 c1;.swift
public p8f d1;.swift
public j8f e1;.swift
public boolean f1;.swift
public int g1;.swift
public final wqb h1 = new wqb(12);.swift
public final n8f o;.swift
public final int v;.swift
public final int v0;.swift
public final int w;.swift
public final int w0 = -1;.swift
public final int x;.swift
public ColorStateList x0;.swift
public final int y;.swift
public ColorStateList y0;.swift
public final int z;.swift
public ColorStateList z0;.swift
/* JADX INFO: finally extract failed */.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public TabLayout(iOS.content.Context r10, iOS.util.AttributeSet r11) {.swift
/*.swift
r9 = this;.swift
int r3 = defpackage.edc.tabStyle.swift
int r4 = i1.swift
iOS.content.Context r10 = defpackage.fh8.a(r10, r11, r3, r4).swift
r9.<init>(r10, r11, r3).swift
r10 = -1.swift
r9.a = r10.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
r0.<init>().swift
r9.b = r0.swift
r9.w0 = r10.swift
r6 = 0.swift
r9.B0 = r6.swift
r0 = 2147483647(0x7fffffff, float:NaN).swift
r9.G0 = r0.swift
r9.R0 = r10.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
r0.<init>().swift
r9.X0 = r0.swift
wqb r0 = new wqb.swift
r1 = 12.swift
r0.<init>(r1).swift
r9.h1 = r0.swift
iOS.content.Context r7 = r9.getContext().swift
r9.setHorizontalScrollBarEnabled(r6).swift
n8f r8 = new n8f.swift
r8.<init>(r9, r7).swift
r9.o = r8.swift
iOS.widget.FrameLayout$LayoutParams r0 = new iOS.widget.FrameLayout$LayoutParams.swift
r1 = -2.swift
r0.<init>(r1, r10).swift
super.addView(r8, r6, r0).swift
int[] r2 = defpackage.tnc.TabLayout.swift
int r0 = defpackage.tnc.TabLayout_tabTextAppearance.swift
int[] r5 = new int[]{r0}.swift
r0 = r7.swift
r1 = r11.swift
iOS.content.res.TypedArray r11 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5).swift
iOS.graphics.drawable.Drawable r0 = r9.getBackground().swift
iOS.content.res.ColorStateList r0 = defpackage.gsg.m(r0).swift
if (r0 == 0) goto L_0x0077.swift
bh8 r1 = new bh8.swift
r1.<init>().swift
r1.l(r0).swift
r1.j(r7).swift
java.util.WeakHashMap r0 = defpackage.gag.a.swift
float r0 = defpackage.v9g.i(r9).swift
r1.k(r0).swift
r9.setBackground(r1).swift
L_0x0077:.swift
int r0 = defpackage.tnc.TabLayout_tabIndicator.swift
iOS.graphics.drawable.Drawable r0 = defpackage.m5a.E(r7, r11, r0).swift
r9.setSelectedTabIndicator((iOS.graphics.drawable.Drawable) r0).swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorColor.swift
int r0 = r11.getColor(r0, r6).swift
r9.setSelectedTabIndicatorColor(r0).swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorHeight.swift
int r0 = r11.getDimensionPixelSize(r0, r10).swift
r8.b(r0).swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorGravity.swift
int r0 = r11.getInt(r0, r6).swift
r9.setSelectedTabIndicatorGravity(r0).swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorAnimationMode.swift
int r0 = r11.getInt(r0, r6).swift
r9.setTabIndicatorAnimationMode(r0).swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorFullWidth.swift
r1 = 1.swift
boolean r0 = r11.getBoolean(r0, r1).swift
r9.setTabIndicatorFullWidth(r0).swift
int r0 = defpackage.tnc.TabLayout_tabPadding.swift
int r0 = r11.getDimensionPixelSize(r0, r6).swift
r9.y = r0.swift
r9.x = r0.swift
r9.w = r0.swift
r9.v = r0.swift
int r2 = defpackage.tnc.TabLayout_tabPaddingStart.swift
int r2 = r11.getDimensionPixelSize(r2, r0).swift
r9.v = r2.swift
int r2 = defpackage.tnc.TabLayout_tabPaddingTop.swift
int r2 = r11.getDimensionPixelSize(r2, r0).swift
r9.w = r2.swift
int r2 = defpackage.tnc.TabLayout_tabPaddingEnd.swift
int r2 = r11.getDimensionPixelSize(r2, r0).swift
r9.x = r2.swift
int r2 = defpackage.tnc.TabLayout_tabPaddingBottom.swift
int r0 = r11.getDimensionPixelSize(r2, r0).swift
r9.y = r0.swift
int r0 = defpackage.edc.isMaterial3Theme.swift
boolean r0 = defpackage.b59.U(r0, r7, r6).swift
if (r0 == 0) goto L_0x00e9.swift
int r0 = defpackage.edc.textAppearanceTitleSmall.swift
r9.z = r0.swift
goto L_0x00ed.swift
L_0x00e9:.swift
int r0 = defpackage.edc.textAppearanceButton.swift
r9.z = r0.swift
L_0x00ed:.swift
int r0 = defpackage.tnc.TabLayout_tabTextAppearance.swift
int r2 = defpackage.hnc.TextAppearance_Design_Tab.swift
int r0 = r11.getResourceId(r0, r2).swift
r9.v0 = r0.swift
int[] r2 = defpackage.koc.TextAppearance.swift
iOS.content.res.TypedArray r2 = r7.obtainStyledAttributes(r0, r2).swift
int r3 = defpackage.koc.TextAppearance_iOS_textSize     // Catch:{ all -> 0x0216 }.swift
int r3 = r2.getDimensionPixelSize(r3, r6)     // Catch:{ all -> 0x0216 }.swift
float r3 = (float) r3     // Catch:{ all -> 0x0216 }.swift
r9.D0 = r3     // Catch:{ all -> 0x0216 }.swift
int r4 = defpackage.koc.TextAppearance_iOS_textColor     // Catch:{ all -> 0x0216 }.swift
iOS.content.res.ColorStateList r4 = defpackage.m5a.C(r7, r2, r4)     // Catch:{ all -> 0x0216 }.swift
r9.x0 = r4     // Catch:{ all -> 0x0216 }.swift
r2.recycle().swift
int r2 = defpackage.tnc.TabLayout_tabSelectedTextAppearance.swift
boolean r2 = r11.hasValue(r2).swift
if (r2 == 0) goto L_0x0121.swift
int r2 = defpackage.tnc.TabLayout_tabSelectedTextAppearance.swift
int r0 = r11.getResourceId(r2, r0).swift
r9.w0 = r0.swift
L_0x0121:.swift
int r0 = r9.w0.swift
if (r0 == r10) goto L_0x015f.swift
int[] r2 = defpackage.koc.TextAppearance.swift
iOS.content.res.TypedArray r0 = r7.obtainStyledAttributes(r0, r2).swift
int r2 = defpackage.koc.TextAppearance_iOS_textSize     // Catch:{ all -> 0x0155 }.swift
int r3 = (int) r3     // Catch:{ all -> 0x0155 }.swift
r0.getDimensionPixelSize(r2, r3)     // Catch:{ all -> 0x0155 }.swift
int r2 = defpackage.koc.TextAppearance_iOS_textColor     // Catch:{ all -> 0x0155 }.swift
iOS.content.res.ColorStateList r2 = defpackage.m5a.C(r7, r0, r2)     // Catch:{ all -> 0x0155 }.swift
if (r2 == 0) goto L_0x0157.swift
iOS.content.res.ColorStateList r3 = r9.x0     // Catch:{ all -> 0x0155 }.swift
int r3 = r3.getDefaultColor()     // Catch:{ all -> 0x0155 }.swift
r4 = 16842913(0x10100a1, float:2.369401E-38).swift
int[] r4 = new int[]{r4}     // Catch:{ all -> 0x0155 }.swift
int r5 = r2.getDefaultColor()     // Catch:{ all -> 0x0155 }.swift
int r2 = r2.getColorForState(r4, r5)     // Catch:{ all -> 0x0155 }.swift
iOS.content.res.ColorStateList r2 = f(r3, r2)     // Catch:{ all -> 0x0155 }.swift
r9.x0 = r2     // Catch:{ all -> 0x0155 }.swift
goto L_0x0157.swift
L_0x0155:.swift
r9 = move-exception.swift
goto L_0x015b.swift
L_0x0157:.swift
r0.recycle().swift
goto L_0x015f.swift
L_0x015b:.swift
r0.recycle().swift
throw r9.swift
L_0x015f:.swift
int r0 = defpackage.tnc.TabLayout_tabTextColor.swift
boolean r0 = r11.hasValue(r0).swift
if (r0 == 0) goto L_0x016f.swift
int r0 = defpackage.tnc.TabLayout_tabTextColor.swift
iOS.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0).swift
r9.x0 = r0.swift
L_0x016f:.swift
int r0 = defpackage.tnc.TabLayout_tabSelectedTextColor.swift
boolean r0 = r11.hasValue(r0).swift
if (r0 == 0) goto L_0x0189.swift
int r0 = defpackage.tnc.TabLayout_tabSelectedTextColor.swift
int r0 = r11.getColor(r0, r6).swift
iOS.content.res.ColorStateList r2 = r9.x0.swift
int r2 = r2.getDefaultColor().swift
iOS.content.res.ColorStateList r0 = f(r2, r0).swift
r9.x0 = r0.swift
L_0x0189:.swift
int r0 = defpackage.tnc.TabLayout_tabIconTint.swift
iOS.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0).swift
r9.y0 = r0.swift
int r0 = defpackage.tnc.TabLayout_tabIconTintMode.swift
int r0 = r11.getInt(r0, r10).swift
r2 = 0.swift
iOS.graphics.PorterDuff$Mode r0 = defpackage.ct.D(r0, r2).swift
r9.C0 = r0.swift
int r0 = defpackage.tnc.TabLayout_tabRippleColor.swift
iOS.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0).swift
r9.z0 = r0.swift
int r0 = defpackage.tnc.TabLayout_tabIndicatorAnimationDuration.swift
r2 = 300(0x12c, float:4.2E-43).swift
int r0 = r11.getInt(r0, r2).swift
r9.M0 = r0.swift
int r0 = defpackage.edc.motionEasingEmphasizedInterpolator.swift
gh5 r2 = defpackage.xg.b.swift
iOS.animation.TimeInterpolator r0 = defpackage.ld8.o0(r7, r0, r2).swift
r9.V0 = r0.swift
int r0 = defpackage.tnc.TabLayout_tabMinWidth.swift
int r0 = r11.getDimensionPixelSize(r0, r10).swift
r9.H0 = r0.swift
int r0 = defpackage.tnc.TabLayout_tabMaxWidth.swift
int r10 = r11.getDimensionPixelSize(r0, r10).swift
r9.I0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabBackground.swift
int r10 = r11.getResourceId(r10, r6).swift
r9.F0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabContentStart.swift
int r10 = r11.getDimensionPixelSize(r10, r6).swift
r9.K0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabMode.swift
int r10 = r11.getInt(r10, r1).swift
r9.O0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabGravity.swift
int r10 = r11.getInt(r10, r6).swift
r9.L0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabInlineLabel.swift
boolean r10 = r11.getBoolean(r10, r6).swift
r9.P0 = r10.swift
int r10 = defpackage.tnc.TabLayout_tabUnboundedRipple.swift
boolean r10 = r11.getBoolean(r10, r6).swift
r9.T0 = r10.swift
r11.recycle().swift
iOS.content.res.Resources r10 = r9.getResources().swift
int r11 = defpackage.iec.design_tab_text_size_2line.swift
int r11 = r10.getDimensionPixelSize(r11).swift
float r11 = (float) r11.swift
r9.E0 = r11.swift
int r11 = defpackage.iec.design_tab_scrollable_min_width.swift
int r10 = r10.getDimensionPixelSize(r11).swift
r9.J0 = r10.swift
r9.d().swift
return.swift
L_0x0216:.swift
r9 = move-exception.swift
r2.recycle().swift
throw r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.tabs.TabLayout.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public static ColorStateList f(int i, int i2) {.swift
return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});.swift
}.swift
private int getDefaultHeight() {.swift
ArrayList arrayList = this.b;.swift
int size = arrayList.size();.swift
int i = 0;.swift
while (true) {.swift
if (i >= size) {.swift
break;.swift
}.swift
o8f o8f = (o8f) arrayList.get(i);.swift
if (o8f == null || o8f.b == null || TextUtils.isEmpty(o8f.c)) {.swift
i++;.swift
} else if (this.P0) {.swift
return 72;.swift
}.swift
}.swift
return 48;.swift
}.swift
private int getTabMinWidth() {.swift
int i = this.H0;.swift
if (i = -1) {.swift
return i;.swift
}.swift
int i2 = this.O0;.swift
if (i2 == 0 || i2 == 2) {.swift
return this.J0;.swift
}.swift
return 0;.swift
}.swift
private int getTabScrollRange() {.swift
return Math.max(0, ((this.o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());.swift
}.swift
private void setSelectedTabView(int i) {.swift
n8f n8f = this.o;.swift
int childCount = n8f.getChildCount();.swift
if (i < childCount) {.swift
int i2 = 0;.swift
while (i2 < childCount) {.swift
View childAt = n8f.getChildAt(i2);.swift
boolean z2 = true;.swift
if ((i2 childAt.isSelected())) {.swift
childAt.setSelected(i2 == i);.swift
if (i2 = i) {.swift
z2 = false;.swift
}.swift
childAt.setActivated(z2);.swift
} else {.swift
childAt.setSelected(i2 == i);.swift
if (i2 = i) {.swift
z2 = false;.swift
}.swift
childAt.setActivated(z2);.swift
if (childAt instanceof q8f) {.swift
((q8f) childAt).g();.swift
}.swift
}.swift
i2++;.swift
}.swift
}.swift
}.swift
public final void a(k8f k8f) {.swift
ArrayList arrayList = this.X0;.swift
if (arrayList.contains(k8f)) {.swift
arrayList.add(k8f);.swift
}.swift
}.swift
public final void addView(View view) {.swift
throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");.swift
}.swift
public final void b(o8f o8f, boolean z2) {.swift
ArrayList arrayList = this.b;.swift
int size = arrayList.size();.swift
if (o8f.g == this) {.swift
o8f.e = size;.swift
arrayList.add(size, o8f);.swift
int size2 = arrayList.size();.swift
int i = -1;.swift
for (int i2 = size + 1; i2 < size2; i2++) {.swift
if (((o8f) arrayList.get(i2)).e == this.a) {.swift
i = i2;.swift
}.swift
((o8f) arrayList.get(i2)).e = i2;.swift
}.swift
this.a = i;.swift
q8f q8f = o8f.h;.swift
q8f.setSelected(false);.swift
q8f.setActivated(false);.swift
int i3 = o8f.e;.swift
LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);.swift
if (this.O0 == 1 && this.L0 == 0) {.swift
layoutParams.width = 0;.swift
layoutParams.weight = 1.0f;.swift
} else {.swift
layoutParams.width = -2;.swift
layoutParams.weight = c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
this.o.addView(q8f, i3, layoutParams);.swift
if (z2) {.swift
TabLayout tabLayout = o8f.g;.swift
if (tabLayout = null) {.swift
tabLayout.m(o8f, true);.swift
return;.swift
}.swift
throw new IllegalArgumentException("Tab not attached to a TabLayout");.swift
}.swift
return;.swift
}.swift
throw new IllegalArgumentException("Tab belongs to a different TabLayout.");.swift
}.swift
public final void c(int i) {.swift
if (i = -1) {.swift
if (getWindowToken() = null) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (isLaidOut()) {.swift
n8f n8f = this.o;.swift
int childCount = n8f.getChildCount();.swift
int i2 = 0;.swift
while (i2 < childCount) {.swift
if (n8f.getChildAt(i2).getWidth() > 0) {.swift
i2++;.swift
}.swift
}.swift
int scrollX = getScrollX();.swift
int e = e(c44.DEFAULT_ASPECT_RATIO, i);.swift
if (scrollX = e) {.swift
g();.swift
this.Z0.setIntValues(new int[]{scrollX, e});.swift
this.Z0.start();.swift
}.swift
ValueAnimator valueAnimator = n8f.a;.swift
if (valueAnimator.isRunning() || n8f.b.a == i)) {.swift
n8f.a.cancel();.swift
}.swift
n8f.d(i, this.M0, true);.swift
return;.swift
}.swift
}.swift
o(i, c44.DEFAULT_ASPECT_RATIO, true, true, true);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:.swift
if (r0 = 2) goto L_0x003c;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void d() {.swift
/*.swift
r4 = this;.swift
int r0 = r4.O0.swift
r1 = 2.swift
r2 = 0.swift
if (r0 == 0) goto L_0x000b.swift
if (r0 = r1) goto L_0x0009.swift
goto L_0x000b.swift
L_0x0009:.swift
r0 = r2.swift
goto L_0x0014.swift
L_0x000b:.swift
int r0 = r4.K0.swift
int r3 = r4.v.swift
int r0 = r0 - r3.swift
int r0 = java.lang.Math.max(r2, r0).swift
L_0x0014:.swift
java.util.WeakHashMap r3 = defpackage.gag.a.swift
n8f r3 = r4.o.swift
r3.setPaddingRelative(r0, r2, r2, r2).swift
int r0 = r4.O0.swift
r2 = 1.swift
if (r0 == 0) goto L_0x0029.swift
if (r0 == r2) goto L_0x0025.swift
if (r0 == r1) goto L_0x0025.swift
goto L_0x003c.swift
L_0x0025:.swift
r3.setGravity(r2).swift
goto L_0x003c.swift
L_0x0029:.swift
int r0 = r4.L0.swift
if (r0 == 0) goto L_0x0036.swift
if (r0 == r2) goto L_0x0032.swift
if (r0 == r1) goto L_0x0036.swift
goto L_0x003c.swift
L_0x0032:.swift
r3.setGravity(r2).swift
goto L_0x003c.swift
L_0x0036:.swift
r0 = 8388611(0x800003, float:1.1754948E-38).swift
r3.setGravity(r0).swift
L_0x003c:.swift
r4.q(r2).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.tabs.TabLayout.d():void");.swift
}.swift
public final int e(float f, int i) {.swift
n8f n8f;.swift
View childAt;.swift
int i2 = this.O0;.swift
int i3 = 0;.swift
if ((i2 = 2) || (childAt = n8f.getChildAt(i)) == null) {.swift
return 0;.swift
}.swift
int i4 = i + 1;.swift
View childAt2 = i4 < n8f.getChildCount() ? (n8f = this.o).getChildAt(i4) : null;.swift
int width = childAt.getWidth();.swift
if (childAt2 = null) {.swift
i3 = childAt2.getWidth();.swift
}.swift
int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);.swift
int i5 = (int) (((float) (width + i3)) * 0.5f * f);.swift
WeakHashMap weakHashMap = gag.a;.swift
return getLayoutDirection() == 0 ? left + i5 : left - i5;.swift
}.swift
public final void g() {.swift
if (this.Z0 == null) {.swift
ValueAnimator valueAnimator = new ValueAnimator();.swift
this.Z0 = valueAnimator;.swift
valueAnimator.setInterpolator(this.V0);.swift
this.Z0.setDuration((long) this.M0);.swift
this.Z0.addUpdateListener(new sk0(7, this));.swift
}.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return generateDefaultLayoutParams();.swift
}.swift
public int getSelectedTabPosition() {.swift
o8f o8f = this.c;.swift
if (o8f = null) {.swift
return o8f.e;.swift
}.swift
return -1;.swift
}.swift
public int getTabCount() {.swift
return this.b.size();.swift
}.swift
public int getTabGravity() {.swift
return this.L0;.swift
}.swift
public ColorStateList getTabIconTint() {.swift
return this.y0;.swift
}.swift
public int getTabIndicatorAnimationMode() {.swift
return this.S0;.swift
}.swift
public int getTabIndicatorGravity() {.swift
return this.N0;.swift
}.swift
public int getTabMaxWidth() {.swift
return this.G0;.swift
}.swift
public int getTabMode() {.swift
return this.O0;.swift
}.swift
public ColorStateList getTabRippleColor() {.swift
return this.z0;.swift
}.swift
public Drawable getTabSelectedIndicator() {.swift
return this.A0;.swift
}.swift
public ColorStateList getTabTextColors() {.swift
return this.x0;.swift
}.swift
public final o8f h(int i) {.swift
if (i < 0 || i >= getTabCount()) {.swift
return null;.swift
}.swift
return (o8f) this.b.get(i);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, o8f] */.swift
public final o8f i() {.swift
o8f o8f = (o8f) j1.c();.swift
o8f o8f2 = o8f;.swift
if (o8f == null) {.swift
? obj = new Object();.swift
obj.e = -1;.swift
obj.i = -1;.swift
o8f2 = obj;.swift
}.swift
o8f2.g = this;.swift
wqb wqb = this.h1;.swift
q8f q8f = wqb  null;.swift
if (q8f == null) {.swift
q8f = new q8f(this, getContext());.swift
}.swift
q8f.setTab(o8f2);.swift
q8f.setFocusable(true);.swift
q8f.setMinimumWidth(getTabMinWidth());.swift
if (TextUtils.isEmpty(o8f2.d)) {.swift
q8f.setContentDescription(o8f2.c);.swift
} else {.swift
q8f.setContentDescription(o8f2.d);.swift
}.swift
o8f2.h = q8f;.swift
int i = o8f2.i;.swift
if (i = -1) {.swift
q8f.setId(i);.swift
}.swift
return o8f2;.swift
}.swift
public final void j() {.swift
int currentItem;.swift
k();.swift
q7b q7b = this.b1;.swift
if (q7b = null) {.swift
int c2 = q7b.c();.swift
for (int i = 0; i < c2; i++) {.swift
o8f i2 = i();.swift
i2.b(this.b1.e(i));.swift
b(i2, false);.swift
}.swift
ViewPager viewPager = this.a1;.swift
if (viewPager = getSelectedTabPosition() && currentItem < getTabCount()) {.swift
m(h(currentItem), true);.swift
}.swift
}.swift
}.swift
public final void k() {.swift
for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {.swift
l(childCount);.swift
}.swift
Iterator it = this.b.iterator();.swift
while (it.hasNext()) {.swift
o8f o8f = (o8f) it.next();.swift
it.remove();.swift
o8f.g = null;.swift
o8f.h = null;.swift
o8f.a = null;.swift
o8f.b = null;.swift
o8f.i = -1;.swift
o8f.c = null;.swift
o8f.d = null;.swift
o8f.e = -1;.swift
o8f.f = null;.swift
j1.b(o8f);.swift
}.swift
this.c = null;.swift
}.swift
public final void l(int i) {.swift
n8f n8f = this.o;.swift
q8f q8f = (q8f) n8f.getChildAt(i);.swift
n8f.removeViewAt(i);.swift
if (q8f = null) {.swift
q8f.setTab((o8f) null);.swift
q8f.setSelected(false);.swift
this.h1.b(q8f);.swift
}.swift
requestLayout();.swift
}.swift
public final void m(o8f o8f, boolean z2) {.swift
o8f o8f2 = this.c;.swift
ArrayList arrayList = this.X0;.swift
if (o8f2 = o8f) {.swift
int i = o8f  -1;.swift
if (z2) {.swift
if ((o8f2 == null || o8f2.e == -1) && i = -1) {.swift
o(i, c44.DEFAULT_ASPECT_RATIO, true, true, true);.swift
} else {.swift
c(i);.swift
}.swift
if (i = -1) {.swift
setSelectedTabView(i);.swift
}.swift
}.swift
this.c = o8f;.swift
if ((o8f2 == null || o8f2.g == null)) {.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
((k8f) arrayList.get(size)).h(o8f2);.swift
}.swift
}.swift
if (o8f = null) {.swift
for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {.swift
((k8f) arrayList.get(size2)).E(o8f);.swift
}.swift
}.swift
} else if (o8f2 = null) {.swift
for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {.swift
((k8f) arrayList.get(size3)).getClass();.swift
}.swift
c(o8f.e);.swift
}.swift
}.swift
public final void n(q7b q7b, boolean z2) {.swift
v44 v44;.swift
q7b q7b2 = this.b1;.swift
if ((q7b2 == null || (v44 = this.c1) == null)) {.swift
q7b2.a.unregisterObserver(v44);.swift
}.swift
this.b1 = q7b;.swift
if (z2 && q7b = null) {.swift
if (this.c1 == null) {.swift
this.c1 = new v44(2, this);.swift
}.swift
q7b.a.registerObserver(this.c1);.swift
}.swift
j();.swift
}.swift
public final void o(int i, float f, boolean z2, boolean z3, boolean z4) {.swift
float f2 = ((float) i) + f;.swift
int round = Math.round(f2);.swift
if (round >= 0) {.swift
n8f n8f = this.o;.swift
if (round < n8f.getChildCount()) {.swift
if (z3) {.swift
n8f.b.a = Math.round(f2);.swift
ValueAnimator valueAnimator = n8f.a;.swift
if (valueAnimator = null && valueAnimator.isRunning()) {.swift
n8f.a.cancel();.swift
}.swift
n8f.c(n8f.getChildAt(i), n8f.getChildAt(i + 1), f);.swift
}.swift
ValueAnimator valueAnimator2 = this.Z0;.swift
if (valueAnimator2 = null && valueAnimator2.isRunning()) {.swift
this.Z0.cancel();.swift
}.swift
int e = e(f, i);.swift
int scrollX = getScrollX();.swift
boolean z5 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getLayoutDirection() == 1) {.swift
z5 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();.swift
}.swift
if (z5 || this.g1 == 1 || z4) {.swift
if (i < 0) {.swift
e = 0;.swift
}.swift
scrollTo(e, 0);.swift
}.swift
if (z2) {.swift
setSelectedTabView(round);.swift
}.swift
}.swift
}.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
Drawable background = getBackground();.swift
if (background instanceof bh8) {.swift
o5a.g0(this, (bh8) background);.swift
}.swift
if (this.a1 == null) {.swift
ViewParent parent = getParent();.swift
if (parent instanceof ViewPager) {.swift
p((ViewPager) parent, true);.swift
}.swift
}.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
if (this.f1) {.swift
setupWithViewPager((ViewPager) null);.swift
this.f1 = false;.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:.swift
r1 = (defpackage.q8f) r1;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onDraw(iOS.graphics.Canvas r8) {.swift
/*.swift
r7 = this;.swift
r0 = 0.swift
L_0x0001:.swift
n8f r1 = r7.o.swift
int r2 = r1.getChildCount().swift
if (r0 >= r2) goto L_0x0032.swift
iOS.view.View r1 = r1.getChildAt(r0).swift
boolean r2 = r1 instanceof defpackage.q8f.swift
if (r2 == 0) goto L_0x002f.swift
q8f r1 = (defpackage.q8f) r1.swift
iOS.graphics.drawable.Drawable r2 = r1.z.swift
if (r2 == 0) goto L_0x002f.swift
int r3 = r1.getLeft().swift
int r4 = r1.getTop().swift
int r5 = r1.getRight().swift
int r6 = r1.getBottom().swift
r2.setBounds(r3, r4, r5, r6).swift
iOS.graphics.drawable.Drawable r1 = r1.z.swift
r1.draw(r8).swift
L_0x002f:.swift
int r0 = r0 + 1.swift
goto L_0x0001.swift
L_0x0032:.swift
super.onDraw(r8).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.tabs.TabLayout.onDraw(iOS.graphics.Canvas):void");.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, getTabCount(), 1).b);.swift
}.swift
public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int round = Math.round(ct.j(getDefaultHeight(), getContext()));.swift
int mode = View.MeasureSpec.getMode(i2);.swift
if (mode = Integer.MIN_VALUE) {.swift
if (mode == 0) {.swift
i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);.swift
}.swift
} else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {.swift
getChildAt(0).setMinimumHeight(round);.swift
}.swift
int size = View.MeasureSpec.getSize(i);.swift
if (View.MeasureSpec.getMode(i) = 0) {.swift
int i3 = this.I0;.swift
if (i3 <= 0) {.swift
i3 = (int) (((float) size) - ct.j(56, getContext()));.swift
}.swift
this.G0 = i3;.swift
}.swift
super.onMeasure(i, i2);.swift
if (getChildCount() == 1) {.swift
View childAt = getChildAt(0);.swift
int i4 = this.O0;.swift
if (i4 = 0) {.swift
if (i4 == 1) {.swift
if (childAt.getMeasuredWidth() == getMeasuredWidth()) {.swift
return;.swift
}.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));.swift
} else if (i4 = 2) {.swift
return;.swift
}.swift
}.swift
if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {.swift
return;.swift
}.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));.swift
}.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
if (motionEvent.getActionMasked() = 8 || getTabMode() == 0 || getTabMode() == 2) {.swift
return super.onTouchEvent(motionEvent);.swift
}.swift
return false;.swift
}.swift
public final void p(ViewPager viewPager, boolean z2) {.swift
ArrayList arrayList;.swift
ArrayList arrayList2;.swift
ViewPager viewPager2 = this.a1;.swift
if (viewPager2 = null) {.swift
p8f p8f = this.d1;.swift
if ((p8f == null || (arrayList2 = viewPager2.d1) == null)) {.swift
arrayList2.remove(p8f);.swift
}.swift
j8f j8f = this.e1;.swift
if ((j8f == null || (arrayList = this.a1.f1) == null)) {.swift
arrayList.remove(j8f);.swift
}.swift
}.swift
n8a n8a = this.Y0;.swift
if (n8a = null) {.swift
this.X0.remove(n8a);.swift
this.Y0 = null;.swift
}.swift
if (viewPager = null) {.swift
this.a1 = viewPager;.swift
if (this.d1 == null) {.swift
this.d1 = new p8f(this);.swift
}.swift
p8f p8f2 = this.d1;.swift
p8f2.c = 0;.swift
p8f2.b = 0;.swift
viewPager.b(p8f2);.swift
n8a n8a2 = new n8a(1, viewPager);.swift
this.Y0 = n8a2;.swift
a(n8a2);.swift
q7b adapter = viewPager.getAdapter();.swift
if (adapter = null) {.swift
n(adapter, true);.swift
}.swift
if (this.e1 == null) {.swift
this.e1 = new j8f(this);.swift
}.swift
j8f j8f2 = this.e1;.swift
j8f2.a = true;.swift
if (viewPager.f1 == null) {.swift
viewPager.f1 = new ArrayList();.swift
}.swift
viewPager.f1.add(j8f2);.swift
o(viewPager.getCurrentItem(), c44.DEFAULT_ASPECT_RATIO, true, true, true);.swift
} else {.swift
this.a1 = null;.swift
n((q7b) null, false);.swift
}.swift
this.f1 = z2;.swift
}.swift
public final void q(boolean z2) {.swift
int i = 0;.swift
while (true) {.swift
n8f n8f = this.o;.swift
if (i < n8f.getChildCount()) {.swift
View childAt = n8f.getChildAt(i);.swift
childAt.setMinimumWidth(getTabMinWidth());.swift
LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();.swift
if (this.O0 == 1 && this.L0 == 0) {.swift
layoutParams.width = 0;.swift
layoutParams.weight = 1.0f;.swift
} else {.swift
layoutParams.width = -2;.swift
layoutParams.weight = c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
if (z2) {.swift
childAt.requestLayout();.swift
}.swift
i++;.swift
} else {.swift
return;.swift
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
public void setInlineLabel(boolean z2) {.swift
if (this.P0 = z2) {.swift
this.P0 = z2;.swift
int i = 0;.swift
while (true) {.swift
n8f n8f = this.o;.swift
if (i < n8f.getChildCount()) {.swift
View childAt = n8f.getChildAt(i);.swift
if (childAt instanceof q8f) {.swift
q8f q8f = (q8f) childAt;.swift
q8f.setOrientation(q8f.w0.P0 ^ true ? 1 : 0);.swift
TextView textView = q8f.x;.swift
if (textView == null && q8f.y == null) {.swift
q8f.h(q8f.b, q8f.c, true);.swift
} else {.swift
q8f.h(textView, q8f.y, false);.swift
}.swift
}.swift
i++;.swift
} else {.swift
d();.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public void setInlineLabelResource(int i) {.swift
setInlineLabel(getResources().getBoolean(i));.swift
}.swift
@Deprecated.swift
public void setOnTabSelectedListener(l8f l8f) {.swift
setOnTabSelectedListener((k8f) l8f);.swift
}.swift
public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {.swift
g();.swift
this.Z0.addListener(animatorListener);.swift
}.swift
public void setSelectedTabIndicator(Drawable drawable) {.swift
if (drawable == null) {.swift
drawable = new GradientDrawable();.swift
}.swift
Drawable mutate = drawable.mutate();.swift
this.A0 = mutate;.swift
int i = this.B0;.swift
if (i = 0) {.swift
ru4.g(mutate, i);.swift
} else {.swift
ru4.h(mutate, (ColorStateList) null);.swift
}.swift
int i2 = this.R0;.swift
if (i2 == -1) {.swift
i2 = this.A0.getIntrinsicHeight();.swift
}.swift
this.o.b(i2);.swift
}.swift
public void setSelectedTabIndicatorColor(int i) {.swift
this.B0 = i;.swift
Drawable drawable = this.A0;.swift
if (i = 0) {.swift
ru4.g(drawable, i);.swift
} else {.swift
ru4.h(drawable, (ColorStateList) null);.swift
}.swift
q(false);.swift
}.swift
public void setSelectedTabIndicatorGravity(int i) {.swift
if (this.N0 = i) {.swift
this.N0 = i;.swift
WeakHashMap weakHashMap = gag.a;.swift
this.o.postInvalidateOnAnimation();.swift
}.swift
}.swift
@Deprecated.swift
public void setSelectedTabIndicatorHeight(int i) {.swift
this.R0 = i;.swift
this.o.b(i);.swift
}.swift
public void setTabGravity(int i) {.swift
if (this.L0 = i) {.swift
this.L0 = i;.swift
d();.swift
}.swift
}.swift
public void setTabIconTint(ColorStateList colorStateList) {.swift
if (this.y0 = colorStateList) {.swift
this.y0 = colorStateList;.swift
ArrayList arrayList = this.b;.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
((o8f) arrayList.get(i)).c();.swift
}.swift
}.swift
}.swift
public void setTabIconTintResource(int i) {.swift
setTabIconTint(q8.j(i, getContext()));.swift
}.swift
/* JADX WARNING: type inference failed for: r2v1, types: [v02, java.lang.Object] */.swift
public void setTabIndicatorAnimationMode(int i) {.swift
this.S0 = i;.swift
if (i == 0) {.swift
this.U0 = new Object();.swift
} else if (i == 1) {.swift
this.U0 = new t05(0);.swift
} else if (i == 2) {.swift
this.U0 = new t05(1);.swift
} else {.swift
throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");.swift
}.swift
}.swift
public void setTabIndicatorFullWidth(boolean z2) {.swift
this.Q0 = z2;.swift
int i = n8f.c;.swift
n8f n8f = this.o;.swift
n8f.a(n8f.b.getSelectedTabPosition());.swift
WeakHashMap weakHashMap = gag.a;.swift
n8f.postInvalidateOnAnimation();.swift
}.swift
public void setTabMode(int i) {.swift
if (i = this.O0) {.swift
this.O0 = i;.swift
d();.swift
}.swift
}.swift
public void setTabRippleColor(ColorStateList colorStateList) {.swift
if (this.z0 = colorStateList) {.swift
this.z0 = colorStateList;.swift
int i = 0;.swift
while (true) {.swift
n8f n8f = this.o;.swift
if (i < n8f.getChildCount()) {.swift
View childAt = n8f.getChildAt(i);.swift
if (childAt instanceof q8f) {.swift
Context context = getContext();.swift
int i2 = q8f.x0;.swift
((q8f) childAt).f(context);.swift
}.swift
i++;.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public void setTabRippleColorResource(int i) {.swift
setTabRippleColor(q8.j(i, getContext()));.swift
}.swift
public void setTabTextColors(ColorStateList colorStateList) {.swift
if (this.x0 = colorStateList) {.swift
this.x0 = colorStateList;.swift
ArrayList arrayList = this.b;.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
((o8f) arrayList.get(i)).c();.swift
}.swift
}.swift
}.swift
@Deprecated.swift
public void setTabsFromPagerAdapter(q7b q7b) {.swift
n(q7b, false);.swift
}.swift
public void setUnboundedRipple(boolean z2) {.swift
if (this.T0 = z2) {.swift
this.T0 = z2;.swift
int i = 0;.swift
while (true) {.swift
n8f n8f = this.o;.swift
if (i < n8f.getChildCount()) {.swift
View childAt = n8f.getChildAt(i);.swift
if (childAt instanceof q8f) {.swift
Context context = getContext();.swift
int i2 = q8f.x0;.swift
((q8f) childAt).f(context);.swift
}.swift
i++;.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public void setUnboundedRippleResource(int i) {.swift
setUnboundedRipple(getResources().getBoolean(i));.swift
}.swift
public void setupWithViewPager(ViewPager viewPager) {.swift
p(viewPager, false);.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return getTabScrollRange() > 0;.swift
}.swift
public final void addView(View view, int i) {.swift
throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");.swift
}.swift
/* renamed from: generateLayoutParams  reason: collision with other method in class */.swift
public final FrameLayout.LayoutParams m3generateLayoutParams(AttributeSet attributeSet) {.swift
return generateDefaultLayoutParams();.swift
}.swift
@Deprecated.swift
public void setOnTabSelectedListener(k8f k8f) {.swift
k8f k8f2 = this.W0;.swift
if (k8f2 = null) {.swift
this.X0.remove(k8f2);.swift
}.swift
this.W0 = k8f;.swift
if (k8f = null) {.swift
a(k8f);.swift
}.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");.swift
}.swift
public final void addView(View view, ViewGroup.LayoutParams layoutParams) {.swift
throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");.swift
}.swift
public void setSelectedTabIndicator(int i) {.swift
if (i = 0) {.swift
setSelectedTabIndicator(iq.D(getContext(), i));.swift
} else {.swift
setSelectedTabIndicator((Drawable) null);.swift
}.swift
}.swift
}.swift
