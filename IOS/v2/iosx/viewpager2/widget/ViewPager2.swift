package iOSx.viewpager2.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.view.Gravity;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOSx.recyclerview.widget.a;.swift
import java.util.ArrayList;.swift
import java.util.WeakHashMap;.swift
import kotlin.io.ConstantsKt;.swift
public final class ViewPager2 extends ViewGroup {.swift
public o7b A0;.swift
public yyc B0 = null;.swift
public boolean C0 = false;.swift
public boolean D0 = true;.swift
public int E0 = -1;.swift
public srd F0;.swift
public final Rect a = new Rect();.swift
public final Rect b = new Rect();.swift
public final gi0 c = new gi0();.swift
public int o;.swift
public boolean v = false;.swift
public acg v0;.swift
public final tbg w = new tbg(0, this);.swift
public zbg w0;.swift
public wbg x;.swift
public bid x0;.swift
public int y = -1;.swift
public gi0 y0;.swift
public Parcelable z;.swift
public e4 z0;.swift
public ViewPager2(Context context) {.swift
super(context);.swift
a(context, (AttributeSet) null);.swift
}.swift
/* JADX INFO: finally extract failed */.swift
/* JADX WARNING: type inference failed for: r2v0, types: [srd, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, czc] */.swift
public final void a(Context context, AttributeSet attributeSet) {.swift
? obj = new Object();.swift
obj.o = this;.swift
obj.a = new syc(11, obj);.swift
obj.b = new yu9(14, (Object) obj);.swift
this.F0 = obj;.swift
acg acg = new acg(this, context);.swift
this.v0 = acg;.swift
acg.setId(View.generateViewId());.swift
this.v0.setDescendantFocusability(131072);.swift
wbg wbg = new wbg(this);.swift
this.x = wbg;.swift
this.v0.setLayoutManager(wbg);.swift
this.v0.setScrollingTouchSlop(1);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pnc.ViewPager2);.swift
int[] iArr = pnc.ViewPager2;.swift
WeakHashMap weakHashMap = gag.a;.swift
bag.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);.swift
try {.swift
setOrientation(obtainStyledAttributes.getInt(pnc.ViewPager2_iOS_orientation, 0));.swift
obtainStyledAttributes.recycle();.swift
this.v0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));.swift
this.v0.k(new Object());.swift
bid bid = new bid(this);.swift
this.x0 = bid;.swift
this.z0 = new e4(17, (Object) bid);.swift
zbg zbg = new zbg(this);.swift
this.w0 = zbg;.swift
zbg.a(this.v0);.swift
this.v0.m(this.x0);.swift
gi0 gi0 = new gi0();.swift
this.y0 = gi0;.swift
this.x0.a = gi0;.swift
ubg ubg = new ubg(this, 0);.swift
ubg ubg2 = new ubg(this, 1);.swift
((ArrayList) gi0.b).add(ubg);.swift
((ArrayList) this.y0.b).add(ubg2);.swift
this.F0.M(this.v0);.swift
gi0 gi02 = this.y0;.swift
((ArrayList) gi02.b).add(this.c);.swift
o7b o7b = new o7b(this.x);.swift
this.A0 = o7b;.swift
((ArrayList) this.y0.b).add(o7b);.swift
acg acg2 = this.v0;.swift
attachViewToParent(acg2, 0, acg2.getLayoutParams());.swift
} catch (Throwable th) {.swift
obtainStyledAttributes.recycle();.swift
throw th;.swift
}.swift
}.swift
public final void b(xbg xbg) {.swift
((ArrayList) this.c.b).add(xbg);.swift
}.swift
public final void c() {.swift
if (this.A0.b = null) {.swift
bid bid = this.x0;.swift
bid.e();.swift
aid aid = bid.g;.swift
double d = ((double) aid.b) + ((double) aid.a);.swift
int i = (int) d;.swift
float f = (float) (d - ((double) i));.swift
this.A0.b(i, f, Math.round(((float) getPageSize()) * f));.swift
}.swift
}.swift
public final boolean canScrollHorizontally(int i) {.swift
return this.v0.canScrollHorizontally(i);.swift
}.swift
public final boolean canScrollVertically(int i) {.swift
return this.v0.canScrollVertically(i);.swift
}.swift
public final void d() {.swift
tyc adapter;.swift
if (this.y = null) {.swift
Parcelable parcelable = this.z;.swift
if (parcelable = null) {.swift
if (adapter instanceof bne) {.swift
((bne) adapter).c(parcelable);.swift
}.swift
this.z = null;.swift
}.swift
int max = Math.max(0, Math.min(this.y, adapter.j() - 1));.swift
this.o = max;.swift
this.y = -1;.swift
this.v0.z0(max);.swift
this.F0.P();.swift
}.swift
}.swift
public final void dispatchRestoreInstanceState(SparseArray sparseArray) {.swift
Parcelable parcelable = (Parcelable) sparseArray.get(getId());.swift
if (parcelable instanceof bcg) {.swift
int i = ((bcg) parcelable).a;.swift
sparseArray.put(this.v0.getId(), (Parcelable) sparseArray.get(i));.swift
sparseArray.remove(i);.swift
}.swift
super.dispatchRestoreInstanceState(sparseArray);.swift
d();.swift
}.swift
public final void e(int i, boolean z2) {.swift
if (((bid) this.z0.b).m) {.swift
f(i, z2);.swift
return;.swift
}.swift
throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");.swift
}.swift
public final void f(int i, boolean z2) {.swift
xbg xbg;.swift
tyc adapter = getAdapter();.swift
boolean z3 = false;.swift
if (adapter == null) {.swift
if (this.y = -1) {.swift
this.y = Math.max(i, 0);.swift
}.swift
} else if (adapter.j() > 0) {.swift
int min = Math.min(Math.max(i, 0), adapter.j() - 1);.swift
int i2 = this.o;.swift
if (min = 0) {.swift
if (min z2) {.swift
double d = (double) i2;.swift
this.o = min;.swift
this.F0.P();.swift
bid bid = this.x0;.swift
if (bid.f = 0) {.swift
bid.e();.swift
aid aid = bid.g;.swift
d = ((double) aid.b) + ((double) aid.a);.swift
}.swift
bid bid2 = this.x0;.swift
bid2.getClass();.swift
bid2.e = z2 ? 2 : 3;.swift
bid2.m = false;.swift
if (bid2.i = min) {.swift
z3 = true;.swift
}.swift
bid2.i = min;.swift
bid2.c(2);.swift
if (z3 && (xbg = bid2.a) = null) {.swift
xbg.c(min);.swift
}.swift
if (z2) {.swift
this.v0.z0(min);.swift
return;.swift
}.swift
double d2 = (double) min;.swift
if (Math.abs(d2 - d) > 3.0d) {.swift
this.v0.z0(d2 > d ? min - 3 : min + 3);.swift
acg acg = this.v0;.swift
acg.post(new tk0(acg, min));.swift
return;.swift
}.swift
this.v0.D0(min);.swift
}.swift
}.swift
}.swift
}.swift
public final void g(xbg xbg) {.swift
((ArrayList) this.c.b).remove(xbg);.swift
}.swift
public CharSequence getAccessibilityClassName() {.swift
this.F0.getClass();.swift
this.F0.getClass();.swift
return "iOSx.viewpager.widget.ViewPager";.swift
}.swift
public tyc getAdapter() {.swift
return this.v0.getAdapter();.swift
}.swift
public int getCurrentItem() {.swift
return this.o;.swift
}.swift
public int getItemDecorationCount() {.swift
return this.v0.getItemDecorationCount();.swift
}.swift
public int getOffscreenPageLimit() {.swift
return this.E0;.swift
}.swift
public int getOrientation() {.swift
return this.x.p == 1 ? 1 : 0;.swift
}.swift
public int getPageSize() {.swift
int height;.swift
int paddingBottom;.swift
acg acg = this.v0;.swift
if (getOrientation() == 0) {.swift
height = acg.getWidth() - acg.getPaddingLeft();.swift
paddingBottom = acg.getPaddingRight();.swift
} else {.swift
height = acg.getHeight() - acg.getPaddingTop();.swift
paddingBottom = acg.getPaddingBottom();.swift
}.swift
return height - paddingBottom;.swift
}.swift
public int getScrollState() {.swift
return this.x0.f;.swift
}.swift
public final void h() {.swift
zbg zbg = this.w0;.swift
if (zbg = null) {.swift
View d = zbg.d(this.x);.swift
if (d = null) {.swift
this.x.getClass();.swift
int M = a.M(d);.swift
if (M = this.o && getScrollState() == 0) {.swift
this.y0.c(M);.swift
}.swift
this.v = false;.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalStateException("Design assumption violated.");.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
int i;.swift
int i2;.swift
int j;.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
ViewPager2 viewPager2 = (ViewPager2) this.F0.o;.swift
if (viewPager2.getAdapter() == null) {.swift
i2 = 0;.swift
i = 0;.swift
} else if (viewPager2.getOrientation() == 1) {.swift
i2 = viewPager2.getAdapter().j();.swift
i = 1;.swift
} else {.swift
i = viewPager2.getAdapter().j();.swift
i2 = 1;.swift
}.swift
accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(i2, i, 0).b);.swift
tyc adapter = viewPager2.getAdapter();.swift
if (adapter = 0 && viewPager2.D0) {.swift
if (viewPager2.o > 0) {.swift
accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);.swift
}.swift
if (viewPager2.o < j - 1) {.swift
accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);.swift
}.swift
accessibilityNodeInfo.setScrollable(true);.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int measuredWidth = this.v0.getMeasuredWidth();.swift
int measuredHeight = this.v0.getMeasuredHeight();.swift
int paddingLeft = getPaddingLeft();.swift
Rect rect = this.a;.swift
rect.left = paddingLeft;.swift
rect.right = (i3 - i) - getPaddingRight();.swift
rect.top = getPaddingTop();.swift
rect.bottom = (i4 - i2) - getPaddingBottom();.swift
Rect rect2 = this.b;.swift
Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);.swift
this.v0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);.swift
if (this.v) {.swift
h();.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
measureChild(this.v0, i, i2);.swift
int measuredWidth = this.v0.getMeasuredWidth();.swift
int measuredHeight = this.v0.getMeasuredHeight();.swift
int measuredState = this.v0.getMeasuredState();.swift
int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;.swift
int paddingTop = getPaddingTop();.swift
setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof bcg)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
bcg bcg = (bcg) parcelable;.swift
super.onRestoreInstanceState(bcg.getSuperState());.swift
this.y = bcg.b;.swift
this.z = bcg.c;.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [iOS.view.View$BaseSavedState, iOS.os.Parcelable, bcg] */.swift
public final Parcelable onSaveInstanceState() {.swift
? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());.swift
baseSavedState.a = this.v0.getId();.swift
int i = this.y;.swift
if (i == -1) {.swift
i = this.o;.swift
}.swift
baseSavedState.b = i;.swift
Parcelable parcelable = this.z;.swift
if (parcelable = null) {.swift
baseSavedState.c = parcelable;.swift
} else {.swift
tyc adapter = this.v0.getAdapter();.swift
if (adapter instanceof bne) {.swift
baseSavedState.c = ((bne) adapter).a();.swift
}.swift
}.swift
return baseSavedState;.swift
}.swift
public final void onViewAdded(View view) {.swift
throw new IllegalStateException("ViewPager2 does not support direct child views");.swift
}.swift
public final boolean performAccessibilityAction(int i, Bundle bundle) {.swift
this.F0.getClass();.swift
if (i = 4096) {.swift
return super.performAccessibilityAction(i, bundle);.swift
}.swift
srd srd = this.F0;.swift
srd.getClass();.swift
if (i == 8192 || i == 4096) {.swift
ViewPager2 viewPager2 = (ViewPager2) srd.o;.swift
int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;.swift
if (viewPager2.D0) {.swift
viewPager2.f(currentItem, true);.swift
}.swift
return true;.swift
}.swift
throw new IllegalStateException();.swift
}.swift
public void setAdapter(tyc tyc) {.swift
tyc adapter = this.v0.getAdapter();.swift
srd srd = this.F0;.swift
if (adapter = null) {.swift
adapter.D((tbg) srd.c);.swift
} else {.swift
srd.getClass();.swift
}.swift
tbg tbg = this.w;.swift
if (adapter = null) {.swift
adapter.D(tbg);.swift
}.swift
this.v0.setAdapter(tyc);.swift
this.o = 0;.swift
d();.swift
srd srd2 = this.F0;.swift
srd2.P();.swift
if (tyc = null) {.swift
tyc.A((tbg) srd2.c);.swift
}.swift
if (tyc = null) {.swift
tyc.A(tbg);.swift
}.swift
}.swift
public void setCurrentItem(int i) {.swift
e(i, true);.swift
}.swift
public void setLayoutDirection(int i) {.swift
super.setLayoutDirection(i);.swift
this.F0.P();.swift
}.swift
public void setOffscreenPageLimit(int i) {.swift
if (i >= 1 || i == -1) {.swift
this.E0 = i;.swift
this.v0.requestLayout();.swift
return;.swift
}.swift
throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");.swift
}.swift
public void setOrientation(int i) {.swift
this.x.n1(i);.swift
this.F0.P();.swift
}.swift
public void setPageTransformer(ybg ybg) {.swift
if (ybg = null) {.swift
if (this.C0) {.swift
this.B0 = this.v0.getItemAnimator();.swift
this.C0 = true;.swift
}.swift
this.v0.setItemAnimator((yyc) null);.swift
} else if (this.C0) {.swift
this.v0.setItemAnimator(this.B0);.swift
this.B0 = null;.swift
this.C0 = false;.swift
}.swift
o7b o7b = this.A0;.swift
if (ybg = o7b.b) {.swift
o7b.b = ybg;.swift
c();.swift
}.swift
}.swift
public void setUserInputEnabled(boolean z2) {.swift
this.D0 = z2;.swift
this.F0.P();.swift
}.swift
public ViewPager2(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
a(context, attributeSet);.swift
}.swift
}.swift
