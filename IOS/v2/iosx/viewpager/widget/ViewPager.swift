package iOSx.viewpager.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.ViewConfiguration;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.widget.EdgeEffect;.swift
import iOS.widget.Scroller;.swift
import com.google.iOS.material.tabs.TabLayout;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.WeakHashMap;.swift
import kotlin.KotlinVersion;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class ViewPager extends ViewGroup {.swift
public static final int[] i1 = {16842931};.swift
public static final ed7 j1 = new ed7(15);.swift
public static final vl7 k1 = new vl7(4);.swift
public int A0;.swift
public int B0;.swift
public float C0 = -3.4028235E38f;.swift
public float D0 = Float.MAX_VALUE;.swift
public int E0;.swift
public boolean F0;.swift
public boolean G0;.swift
public boolean H0;.swift
public int I0 = 1;.swift
public boolean J0;.swift
public boolean K0;.swift
public final int L0;.swift
public int M0;.swift
public final int N0;.swift
public float O0;.swift
public float P0;.swift
public float Q0;.swift
public float R0;.swift
public int S0 = -1;.swift
public VelocityTracker T0;.swift
public final int U0;.swift
public final int V0;.swift
public final int W0;.swift
public final int X0;.swift
public final EdgeEffect Y0;.swift
public final EdgeEffect Z0;.swift
public int a;.swift
public boolean a1 = true;.swift
public final ArrayList b = new ArrayList();.swift
public boolean b1;.swift
public final pbg c = new Object();.swift
public int c1;.swift
public ArrayList d1;.swift
public rbg e1;.swift
public ArrayList f1;.swift
public final haf g1 = new haf(10, (Object) this);.swift
public int h1 = 0;.swift
public final Rect o = new Rect();.swift
public q7b v;.swift
public final Scroller v0;.swift
public int w;.swift
public boolean w0;.swift
public int x = -1;.swift
public v44 x0;.swift
public Parcelable y = null;.swift
public int y0;.swift
public ClassLoader z = null;.swift
public Drawable z0;.swift
/* JADX WARNING: type inference failed for: r4v2, types: [pbg, java.lang.Object] */.swift
public ViewPager(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
setWillNotDraw(false);.swift
setDescendantFocusability(262144);.swift
setFocusable(true);.swift
Context context2 = getContext();.swift
this.v0 = new Scroller(context2, k1);.swift
ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);.swift
float f = context2.getResources().getDisplayMetrics().density;.swift
this.N0 = viewConfiguration.getScaledPagingTouchSlop();.swift
this.U0 = (int) (400.0f * f);.swift
this.V0 = viewConfiguration.getScaledMaximumFlingVelocity();.swift
this.Y0 = new EdgeEffect(context2);.swift
this.Z0 = new EdgeEffect(context2);.swift
this.W0 = (int) (25.0f * f);.swift
this.X0 = (int) (2.0f * f);.swift
this.L0 = (int) (f * 16.0f);.swift
gag.j(this, new el0(7, this));.swift
if (getImportantForAccessibility() == 0) {.swift
setImportantForAccessibility(1);.swift
}.swift
v9g.u(this, new nbg(this));.swift
}.swift
public static boolean d(int i, int i2, int i3, View view, boolean z2) {.swift
int i4;.swift
if (view instanceof ViewGroup) {.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
int scrollX = view.getScrollX();.swift
int scrollY = view.getScrollY();.swift
for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {.swift
View childAt = viewGroup.getChildAt(childCount);.swift
int i5 = i2 + scrollX;.swift
if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {.swift
return true;.swift
}.swift
}.swift
}.swift
return z2 && view.canScrollHorizontally(-i);.swift
}.swift
private int getClientWidth() {.swift
return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();.swift
}.swift
private void setScrollingCacheEnabled(boolean z2) {.swift
if (this.G0 = z2) {.swift
this.G0 = z2;.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [pbg, java.lang.Object] */.swift
public final pbg a(int i, int i2) {.swift
? obj = new Object();.swift
obj.b = i;.swift
obj.a = this.v.f(this, i);.swift
this.v.getClass();.swift
obj.d = 1.0f;.swift
ArrayList arrayList = this.b;.swift
if (i2 < 0 || i2 >= arrayList.size()) {.swift
arrayList.add(obj);.swift
} else {.swift
arrayList.add(i2, obj);.swift
}.swift
return obj;.swift
}.swift
public final void addFocusables(ArrayList arrayList, int i, int i2) {.swift
pbg i3;.swift
int size = arrayList.size();.swift
int descendantFocusability = getDescendantFocusability();.swift
if (descendantFocusability = 393216) {.swift
for (int i4 = 0; i4 < getChildCount(); i4++) {.swift
View childAt = getChildAt(i4);.swift
if (childAt.getVisibility() == 0 && (i3 = i(childAt)) = null && i3.b == this.w) {.swift
childAt.addFocusables(arrayList, i, i2);.swift
}.swift
}.swift
}.swift
if ((descendantFocusability == 262144 && size isFocusable()) {.swift
return;.swift
}.swift
if ((i2 & 1) isInTouchMode() || isFocusableInTouchMode()) {.swift
arrayList.add(this);.swift
}.swift
}.swift
public final void addTouchables(ArrayList arrayList) {.swift
pbg i;.swift
for (int i2 = 0; i2 < getChildCount(); i2++) {.swift
View childAt = getChildAt(i2);.swift
if (childAt.getVisibility() == 0 && (i = i(childAt)) = null && i.b == this.w) {.swift
childAt.addTouchables(arrayList);.swift
}.swift
}.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
if (checkLayoutParams(layoutParams)) {.swift
layoutParams = generateDefaultLayoutParams();.swift
}.swift
qbg qbg = (qbg) layoutParams;.swift
boolean z2 = qbg.a | (view.getClass().getAnnotation(obg.class) = null);.swift
qbg.a = z2;.swift
if (this.F0) {.swift
super.addView(view, i, layoutParams);.swift
} else if (z2) {.swift
qbg.d = true;.swift
addViewInLayout(view, i, layoutParams);.swift
} else {.swift
throw new IllegalStateException("Cannot add pager decor view during layout");.swift
}.swift
}.swift
public final void b(rbg rbg) {.swift
if (this.d1 == null) {.swift
this.d1 = new ArrayList();.swift
}.swift
this.d1.add(rbg);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean c(int r8) {.swift
/*.swift
r7 = this;.swift
iOS.view.View r0 = r7.findFocus().swift
r1 = 0.swift
if (r0 = r7) goto L_0x0009.swift
L_0x0007:.swift
r0 = r1.swift
goto L_0x002b.swift
L_0x0009:.swift
if (r0 == 0) goto L_0x002b.swift
iOS.view.ViewParent r2 = r0.getParent().swift
L_0x000f:.swift
boolean r3 = r2 instanceof iOS.view.ViewGroup.swift
if (r3 == 0) goto L_0x001b.swift
if (r2 = r7) goto L_0x0016.swift
goto L_0x002b.swift
L_0x0016:.swift
iOS.view.ViewParent r2 = r2.getParent().swift
goto L_0x000f.swift
L_0x001b:.swift
iOS.view.ViewParent r0 = r0.getParent().swift
L_0x001f:.swift
boolean r2 = r0 instanceof iOS.view.ViewGroup.swift
if (r2 == 0) goto L_0x0007.swift
r0.getClass().swift
iOS.view.ViewParent r0 = r0.getParent().swift
goto L_0x001f.swift
L_0x002b:.swift
iOS.view.FocusFinder r1 = iOS.view.FocusFinder.getInstance().swift
iOS.view.View r1 = r1.findNextFocus(r7, r0, r8).swift
r2 = 1.swift
r3 = 0.swift
r4 = 66.swift
r5 = 17.swift
if (r1 == 0) goto L_0x007e.swift
if (r1 == r0) goto L_0x007e.swift
iOS.graphics.Rect r6 = r7.o.swift
if (r8 = r5) goto L_0x0062.swift
iOS.graphics.Rect r4 = r7.h(r6, r1).swift
int r4 = r4.left.swift
iOS.graphics.Rect r5 = r7.h(r6, r0).swift
int r5 = r5.left.swift
if (r0 == 0) goto L_0x005c.swift
if (r4 < r5) goto L_0x005c.swift
int r0 = r7.w.swift
if (r0 <= 0) goto L_0x0098.swift
int r0 = r0 - r2.swift
r7.H0 = r3.swift
r7.v(r0, r3, r2, r3).swift
goto L_0x0099.swift
L_0x005c:.swift
boolean r0 = r1.requestFocus().swift
L_0x0060:.swift
r3 = r0.swift
goto L_0x009a.swift
L_0x0062:.swift
if (r8 = r4) goto L_0x009a.swift
iOS.graphics.Rect r2 = r7.h(r6, r1).swift
int r2 = r2.left.swift
iOS.graphics.Rect r3 = r7.h(r6, r0).swift
int r3 = r3.left.swift
if (r0 == 0) goto L_0x0079.swift
if (r2 > r3) goto L_0x0079.swift
boolean r0 = r7.n().swift
goto L_0x0060.swift
L_0x0079:.swift
boolean r0 = r1.requestFocus().swift
goto L_0x0060.swift
L_0x007e:.swift
if (r8 == r5) goto L_0x008d.swift
if (r8 = r2) goto L_0x0083.swift
goto L_0x008d.swift
L_0x0083:.swift
if (r8 == r4) goto L_0x0088.swift
r0 = 2.swift
if (r8 = r0) goto L_0x009a.swift
L_0x0088:.swift
boolean r3 = r7.n().swift
goto L_0x009a.swift
L_0x008d:.swift
int r0 = r7.w.swift
if (r0 <= 0) goto L_0x0098.swift
int r0 = r0 - r2.swift
r7.H0 = r3.swift
r7.v(r0, r3, r2, r3).swift
goto L_0x0099.swift
L_0x0098:.swift
r2 = r3.swift
L_0x0099:.swift
r3 = r2.swift
L_0x009a:.swift
if (r3 == 0) goto L_0x00a3.swift
int r8 = iOS.view.SoundEffectConstants.getContantForFocusDirection(r8).swift
r7.playSoundEffect(r8).swift
L_0x00a3:.swift
return r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.c(int):boolean");.swift
}.swift
public final boolean canScrollHorizontally(int i) {.swift
if (this.v == null) {.swift
return false;.swift
}.swift
int clientWidth = getClientWidth();.swift
int scrollX = getScrollX();.swift
return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.C0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.D0));.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return (layoutParams instanceof qbg) && super.checkLayoutParams(layoutParams);.swift
}.swift
public final void computeScroll() {.swift
this.w0 = true;.swift
Scroller scroller = this.v0;.swift
if (scroller.isFinished() || scroller.computeScrollOffset()) {.swift
e(true);.swift
return;.swift
}.swift
int scrollX = getScrollX();.swift
int scrollY = getScrollY();.swift
int currX = scroller.getCurrX();.swift
int currY = scroller.getCurrY();.swift
if ((scrollX == currX && scrollY == currY)) {.swift
scrollTo(currX, currY);.swift
if (o(currX)) {.swift
scroller.abortAnimation();.swift
scrollTo(0, currY);.swift
}.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */.swift
/* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean dispatchKeyEvent(iOS.view.KeyEvent r6) {.swift
/*.swift
r5 = this;.swift
boolean r0 = super.dispatchKeyEvent(r6).swift
r1 = 1.swift
if (r0 = 0) goto L_0x0066.swift
int r0 = r6.getAction().swift
r2 = 0.swift
if (r0 = 0) goto L_0x0061.swift
int r0 = r6.getKeyCode().swift
r3 = 21.swift
r4 = 2.swift
if (r0 == r3) goto L_0x0048.swift
r3 = 22.swift
if (r0 == r3) goto L_0x0036.swift
r3 = 61.swift
if (r0 == r3) goto L_0x0020.swift
goto L_0x0061.swift
L_0x0020:.swift
boolean r0 = r6.hasNoModifiers().swift
if (r0 == 0) goto L_0x002b.swift
boolean r5 = r5.c(r4).swift
goto L_0x0062.swift
L_0x002b:.swift
boolean r6 = r6.hasModifiers(r1).swift
if (r6 == 0) goto L_0x0061.swift
boolean r5 = r5.c(r1).swift
goto L_0x0062.swift
L_0x0036:.swift
boolean r6 = r6.hasModifiers(r4).swift
if (r6 == 0) goto L_0x0041.swift
boolean r5 = r5.n().swift
goto L_0x0062.swift
L_0x0041:.swift
r6 = 66.swift
boolean r5 = r5.c(r6).swift
goto L_0x0062.swift
L_0x0048:.swift
boolean r6 = r6.hasModifiers(r4).swift
if (r6 == 0) goto L_0x005a.swift
int r6 = r5.w.swift
if (r6 <= 0) goto L_0x0061.swift
int r6 = r6 - r1.swift
r5.H0 = r2.swift
r5.v(r6, r2, r1, r2).swift
r5 = r1.swift
goto L_0x0062.swift
L_0x005a:.swift
r6 = 17.swift
boolean r5 = r5.c(r6).swift
goto L_0x0062.swift
L_0x0061:.swift
r5 = r2.swift
L_0x0062:.swift
if (r5 == 0) goto L_0x0065.swift
goto L_0x0066.swift
L_0x0065:.swift
r1 = r2.swift
L_0x0066:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.dispatchKeyEvent(iOS.view.KeyEvent):boolean");.swift
}.swift
public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
pbg i;.swift
if (accessibilityEvent.getEventType() == 4096) {.swift
return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);.swift
}.swift
int childCount = getChildCount();.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = getChildAt(i2);.swift
if (childAt.getVisibility() == 0 && (i = i(childAt)) = null && i.b == this.w && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final void draw(Canvas canvas) {.swift
q7b q7b;.swift
EdgeEffect edgeEffect = this.Z0;.swift
EdgeEffect edgeEffect2 = this.Y0;.swift
super.draw(canvas);.swift
int overScrollMode = getOverScrollMode();.swift
boolean z2 = false;.swift
if (overScrollMode == 0 || (overScrollMode == 1 && (q7b = this.v) = null && q7b.c() > 1)) {.swift
if (edgeEffect2.isFinished()) {.swift
int save = canvas.save();.swift
int height = (getHeight() - getPaddingTop()) - getPaddingBottom();.swift
int width = getWidth();.swift
canvas.rotate(270.0f);.swift
canvas.translate((float) (getPaddingTop() + (-height)), this.C0 * ((float) width));.swift
edgeEffect2.setSize(height, width);.swift
z2 = edgeEffect2.draw(canvas);.swift
canvas.restoreToCount(save);.swift
}.swift
if (edgeEffect.isFinished()) {.swift
int save2 = canvas.save();.swift
int width2 = getWidth();.swift
int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();.swift
canvas.rotate(90.0f);.swift
canvas.translate((float) (-getPaddingTop()), (-(this.D0 + 1.0f)) * ((float) width2));.swift
edgeEffect.setSize(height2, width2);.swift
z2 |= edgeEffect.draw(canvas);.swift
canvas.restoreToCount(save2);.swift
}.swift
} else {.swift
edgeEffect2.finish();.swift
edgeEffect.finish();.swift
}.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
Drawable drawable = this.z0;.swift
if (drawable = null && drawable.isStateful()) {.swift
drawable.setState(getDrawableState());.swift
}.swift
}.swift
public final void e(boolean z2) {.swift
Scroller scroller = this.v0;.swift
boolean z3 = this.h1 == 2;.swift
if (z3) {.swift
setScrollingCacheEnabled(false);.swift
if (scroller.isFinished()) {.swift
scroller.abortAnimation();.swift
int scrollX = getScrollX();.swift
int scrollY = getScrollY();.swift
int currX = scroller.getCurrX();.swift
int currY = scroller.getCurrY();.swift
if ((scrollX == currX && scrollY == currY)) {.swift
scrollTo(currX, currY);.swift
if (currX = scrollX) {.swift
o(currX);.swift
}.swift
}.swift
}.swift
}.swift
this.H0 = false;.swift
int i = 0;.swift
while (true) {.swift
ArrayList arrayList = this.b;.swift
if (i >= arrayList.size()) {.swift
break;.swift
}.swift
pbg pbg = (pbg) arrayList.get(i);.swift
if (pbg.c) {.swift
pbg.c = false;.swift
z3 = true;.swift
}.swift
i++;.swift
}.swift
if (z3) {.swift
haf haf = this.g1;.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postOnAnimation(haf);.swift
return;.swift
}.swift
haf.run();.swift
}.swift
}.swift
public final void f() {.swift
int c2 = this.v.c();.swift
this.a = c2;.swift
ArrayList arrayList = this.b;.swift
boolean z2 = arrayList.size() < (this.I0 * 2) + 1 && arrayList.size() < c2;.swift
int i = this.w;.swift
int i2 = 0;.swift
boolean z3 = false;.swift
while (i2 < arrayList.size()) {.swift
pbg pbg = (pbg) arrayList.get(i2);.swift
int d = this.v.d(pbg.a);.swift
if (d = -1) {.swift
if (d == -2) {.swift
arrayList.remove(i2);.swift
i2--;.swift
if (z3) {.swift
this.v.l(this);.swift
z3 = true;.swift
}.swift
this.v.a(this, pbg.b, pbg.a);.swift
int i3 = this.w;.swift
if (i3 == pbg.b) {.swift
i = Math.max(0, Math.min(i3, c2 - 1));.swift
}.swift
} else {.swift
int i4 = pbg.b;.swift
if (i4 = d) {.swift
if (i4 == this.w) {.swift
i = d;.swift
}.swift
pbg.b = d;.swift
}.swift
}.swift
z2 = true;.swift
}.swift
i2++;.swift
}.swift
if (z3) {.swift
this.v.b();.swift
}.swift
Collections.sort(arrayList, j1);.swift
if (z2) {.swift
int childCount = getChildCount();.swift
for (int i5 = 0; i5 < childCount; i5++) {.swift
qbg qbg = (qbg) getChildAt(i5).getLayoutParams();.swift
if (qbg.a) {.swift
qbg.c = c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
}.swift
v(i, 0, false, true);.swift
requestLayout();.swift
}.swift
}.swift
public final void g(int i) {.swift
rbg rbg = this.e1;.swift
if (rbg = null) {.swift
rbg.m(i);.swift
}.swift
ArrayList arrayList = this.d1;.swift
if (arrayList = null) {.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
rbg rbg2 = (rbg) this.d1.get(i2);.swift
if (rbg2 = null) {.swift
rbg2.m(i);.swift
}.swift
}.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r1v1, types: [iOS.view.ViewGroup$LayoutParams, qbg] */.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
? layoutParams = new ViewGroup.LayoutParams(-1, -1);.swift
layoutParams.c = c44.DEFAULT_ASPECT_RATIO;.swift
return layoutParams;.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return generateDefaultLayoutParams();.swift
}.swift
public q7b getAdapter() {.swift
return this.v;.swift
}.swift
public final int getChildDrawingOrder(int i, int i2) {.swift
throw null;.swift
}.swift
public int getCurrentItem() {.swift
return this.w;.swift
}.swift
public int getOffscreenPageLimit() {.swift
return this.I0;.swift
}.swift
public int getPageMargin() {.swift
return this.y0;.swift
}.swift
public final Rect h(Rect rect, View view) {.swift
if (rect == null) {.swift
rect = new Rect();.swift
}.swift
if (view == null) {.swift
rect.set(0, 0, 0, 0);.swift
return rect;.swift
}.swift
rect.left = view.getLeft();.swift
rect.right = view.getRight();.swift
rect.top = view.getTop();.swift
rect.bottom = view.getBottom();.swift
ViewParent parent = view.getParent();.swift
while ((parent instanceof ViewGroup) && parent = this) {.swift
ViewGroup viewGroup = (ViewGroup) parent;.swift
rect.left = viewGroup.getLeft() + rect.left;.swift
rect.right = viewGroup.getRight() + rect.right;.swift
rect.top = viewGroup.getTop() + rect.top;.swift
rect.bottom = viewGroup.getBottom() + rect.bottom;.swift
parent = viewGroup.getParent();.swift
}.swift
return rect;.swift
}.swift
public final pbg i(View view) {.swift
int i = 0;.swift
while (true) {.swift
ArrayList arrayList = this.b;.swift
if (i >= arrayList.size()) {.swift
return null;.swift
}.swift
pbg pbg = (pbg) arrayList.get(i);.swift
if (this.v.g(view, pbg.a)) {.swift
return pbg;.swift
}.swift
i++;.swift
}.swift
}.swift
public final pbg j() {.swift
pbg pbg;.swift
int i;.swift
int clientWidth = getClientWidth();.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;.swift
float f2 = clientWidth > 0 ? ((float) this.y0) / ((float) clientWidth) : 0.0f;.swift
int i2 = 0;.swift
boolean z2 = true;.swift
pbg pbg2 = null;.swift
int i3 = -1;.swift
float f3 = 0.0f;.swift
while (true) {.swift
ArrayList arrayList = this.b;.swift
if (i2 >= arrayList.size()) {.swift
return pbg2;.swift
}.swift
pbg pbg3 = (pbg) arrayList.get(i2);.swift
if (z2 || pbg3.b == (i = i3 + 1)) {.swift
pbg = pbg3;.swift
} else {.swift
pbg pbg4 = this.c;.swift
pbg4.e = f + f3 + f2;.swift
pbg4.b = i;.swift
this.v.getClass();.swift
pbg4.d = 1.0f;.swift
i2--;.swift
pbg = pbg4;.swift
}.swift
f = pbg.e;.swift
float f4 = pbg.d + f + f2;.swift
if (z2 && scrollX < f) {.swift
return pbg2;.swift
}.swift
if (scrollX < f4 || i2 == arrayList.size() - 1) {.swift
return pbg;.swift
}.swift
int i4 = pbg.b;.swift
float f5 = pbg.d;.swift
i2++;.swift
z2 = false;.swift
pbg pbg5 = pbg;.swift
i3 = i4;.swift
f3 = f5;.swift
pbg2 = pbg5;.swift
}.swift
return pbg;.swift
}.swift
public final pbg k(int i) {.swift
int i2 = 0;.swift
while (true) {.swift
ArrayList arrayList = this.b;.swift
if (i2 >= arrayList.size()) {.swift
return null;.swift
}.swift
pbg pbg = (pbg) arrayList.get(i2);.swift
if (pbg.b == i) {.swift
return pbg;.swift
}.swift
i2++;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void l(int r12, float r13, int r14) {.swift
/*.swift
r11 = this;.swift
int r14 = r11.c1.swift
r0 = 0.swift
r1 = 1.swift
if (r14 <= 0) goto L_0x006c.swift
int r14 = r11.getScrollX().swift
int r2 = r11.getPaddingLeft().swift
int r3 = r11.getPaddingRight().swift
int r4 = r11.getWidth().swift
int r5 = r11.getChildCount().swift
r6 = r0.swift
L_0x001b:.swift
if (r6 >= r5) goto L_0x006c.swift
iOS.view.View r7 = r11.getChildAt(r6).swift
iOS.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams().swift
qbg r8 = (defpackage.qbg) r8.swift
boolean r9 = r8.a.swift
if (r9 = 0) goto L_0x002c.swift
goto L_0x0069.swift
L_0x002c:.swift
int r8 = r8.b.swift
r8 = r8 & 7.swift
if (r8 == r1) goto L_0x0050.swift
r9 = 3.swift
if (r8 == r9) goto L_0x004a.swift
r9 = 5.swift
if (r8 == r9) goto L_0x003a.swift
r8 = r2.swift
goto L_0x005d.swift
L_0x003a:.swift
int r8 = r4 - r3.swift
int r9 = r7.getMeasuredWidth().swift
int r8 = r8 - r9.swift
int r9 = r7.getMeasuredWidth().swift
int r3 = r3 + r9.swift
L_0x0046:.swift
r10 = r8.swift
r8 = r2.swift
r2 = r10.swift
goto L_0x005d.swift
L_0x004a:.swift
int r8 = r7.getWidth().swift
int r8 = r8 + r2.swift
goto L_0x005d.swift
L_0x0050:.swift
int r8 = r7.getMeasuredWidth().swift
int r8 = r4 - r8.swift
int r8 = r8 / 2.swift
int r8 = java.lang.Math.max(r8, r2).swift
goto L_0x0046.swift
L_0x005d:.swift
int r2 = r2 + r14.swift
int r9 = r7.getLeft().swift
int r2 = r2 - r9.swift
if (r2 == 0) goto L_0x0068.swift
r7.offsetLeftAndRight(r2).swift
L_0x0068:.swift
r2 = r8.swift
L_0x0069:.swift
int r6 = r6 + 1.swift
goto L_0x001b.swift
L_0x006c:.swift
rbg r14 = r11.e1.swift
if (r14 == 0) goto L_0x0073.swift
r14.f(r13, r12).swift
L_0x0073:.swift
java.util.ArrayList r14 = r11.d1.swift
if (r14 == 0) goto L_0x008d.swift
int r14 = r14.size().swift
L_0x007b:.swift
if (r0 >= r14) goto L_0x008d.swift
java.util.ArrayList r2 = r11.d1.swift
java.lang.Object r2 = r2.get(r0).swift
rbg r2 = (defpackage.rbg) r2.swift
if (r2 == 0) goto L_0x008a.swift
r2.f(r13, r12).swift
L_0x008a:.swift
int r0 = r0 + 1.swift
goto L_0x007b.swift
L_0x008d:.swift
r11.b1 = r1.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.l(int, float, int):void");.swift
}.swift
public final void m(MotionEvent motionEvent) {.swift
int actionIndex = motionEvent.getActionIndex();.swift
if (motionEvent.getPointerId(actionIndex) == this.S0) {.swift
int i = actionIndex == 0 ? 1 : 0;.swift
this.O0 = motionEvent.getX(i);.swift
this.S0 = motionEvent.getPointerId(i);.swift
VelocityTracker velocityTracker = this.T0;.swift
if (velocityTracker = null) {.swift
velocityTracker.clear();.swift
}.swift
}.swift
}.swift
public final boolean n() {.swift
q7b q7b = this.v;.swift
if (q7b == null || this.w >= q7b.c() - 1) {.swift
return false;.swift
}.swift
this.H0 = false;.swift
v(this.w + 1, 0, true, false);.swift
return true;.swift
}.swift
public final boolean o(int i) {.swift
if (this.b.size() = 0) {.swift
pbg j = j();.swift
int clientWidth = getClientWidth();.swift
int i2 = this.y0;.swift
int i3 = clientWidth + i2;.swift
float f = (float) clientWidth;.swift
int i4 = j.b;.swift
float f2 = ((((float) i) / f) - j.e) / (j.d + (((float) i2) / f));.swift
this.b1 = false;.swift
l(i4, f2, (int) (((float) i3) * f2));.swift
if (this.b1) {.swift
return true;.swift
}.swift
throw new IllegalStateException("onPageScrolled did not call superclass implementation");.swift
} else if (this.a1) {.swift
return false;.swift
} else {.swift
this.b1 = false;.swift
l(0, c44.DEFAULT_ASPECT_RATIO, 0);.swift
if (this.b1) {.swift
return false;.swift
}.swift
throw new IllegalStateException("onPageScrolled did not call superclass implementation");.swift
}.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
this.a1 = true;.swift
}.swift
public final void onDetachedFromWindow() {.swift
removeCallbacks(this.g1);.swift
Scroller scroller = this.v0;.swift
if (scroller scroller.isFinished()) {.swift
this.v0.abortAnimation();.swift
}.swift
super.onDetachedFromWindow();.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */.swift
/* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onDraw(iOS.graphics.Canvas r19) {.swift
/*.swift
r18 = this;.swift
r0 = r18.swift
super.onDraw(r19).swift
int r1 = r0.y0.swift
if (r1 <= 0) goto L_0x00a8.swift
iOS.graphics.drawable.Drawable r1 = r0.z0.swift
if (r1 == 0) goto L_0x00a8.swift
java.util.ArrayList r1 = r0.b.swift
int r2 = r1.size().swift
if (r2 <= 0) goto L_0x00a8.swift
q7b r2 = r0.v.swift
if (r2 == 0) goto L_0x00a8.swift
int r2 = r18.getScrollX().swift
int r3 = r18.getWidth().swift
int r4 = r0.y0.swift
float r4 = (float) r4.swift
float r5 = (float) r3.swift
float r4 = r4 / r5.swift
r6 = 0.swift
java.lang.Object r7 = r1.get(r6).swift
pbg r7 = (defpackage.pbg) r7.swift
float r8 = r7.e.swift
int r9 = r1.size().swift
int r10 = r7.b.swift
int r11 = r9 + -1.swift
java.lang.Object r11 = r1.get(r11).swift
pbg r11 = (defpackage.pbg) r11.swift
int r11 = r11.b.swift
L_0x003f:.swift
if (r10 >= r11) goto L_0x00a8.swift
L_0x0041:.swift
int r12 = r7.b.swift
if (r10 <= r12) goto L_0x0050.swift
if (r6 >= r9) goto L_0x0050.swift
int r6 = r6 + 1.swift
java.lang.Object r7 = r1.get(r6).swift
pbg r7 = (defpackage.pbg) r7.swift
goto L_0x0041.swift
L_0x0050:.swift
if (r10 = r12) goto L_0x005c.swift
float r8 = r7.e.swift
float r12 = r7.d.swift
float r13 = r8 + r12.swift
float r13 = r13 * r5.swift
float r8 = r8 + r12.swift
float r8 = r8 + r4.swift
goto L_0x0069.swift
L_0x005c:.swift
q7b r12 = r0.v.swift
r12.getClass().swift
r12 = 1065353216(0x3f800000, float:1.0).swift
float r13 = r8 + r12.swift
float r13 = r13 * r5.swift
float r12 = r12 + r4.swift
float r12 = r12 + r8.swift
r8 = r12.swift
L_0x0069:.swift
int r12 = r0.y0.swift
float r12 = (float) r12.swift
float r12 = r12 + r13.swift
float r14 = (float) r2.swift
int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1)).swift
if (r12 <= 0) goto L_0x0093.swift
iOS.graphics.drawable.Drawable r12 = r0.z0.swift
int r14 = java.lang.Math.round(r13).swift
int r15 = r0.A0.swift
r16 = r1.swift
int r1 = r0.y0.swift
float r1 = (float) r1.swift
float r1 = r1 + r13.swift
int r1 = java.lang.Math.round(r1).swift
r17 = r4.swift
int r4 = r0.B0.swift
r12.setBounds(r14, r15, r1, r4).swift
iOS.graphics.drawable.Drawable r1 = r0.z0.swift
r4 = r19.swift
r1.draw(r4).swift
goto L_0x0099.swift
L_0x0093:.swift
r16 = r1.swift
r17 = r4.swift
r4 = r19.swift
L_0x0099:.swift
int r1 = r2 + r3.swift
float r1 = (float) r1.swift
int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1)).swift
if (r1 <= 0) goto L_0x00a1.swift
goto L_0x00a8.swift
L_0x00a1:.swift
int r10 = r10 + 1.swift
r1 = r16.swift
r4 = r17.swift
goto L_0x003f.swift
L_0x00a8:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.onDraw(iOS.graphics.Canvas):void");.swift
}.swift
public boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
int i = this.N0;.swift
Scroller scroller = this.v0;.swift
int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;.swift
if (action == 3 || action == 1) {.swift
t();.swift
return false;.swift
}.swift
if (action = 0) {.swift
if (this.J0) {.swift
return true;.swift
}.swift
if (this.K0) {.swift
return false;.swift
}.swift
}.swift
if (action == 0) {.swift
float x2 = motionEvent.getX();.swift
this.Q0 = x2;.swift
this.O0 = x2;.swift
float y2 = motionEvent.getY();.swift
this.R0 = y2;.swift
this.P0 = y2;.swift
this.S0 = motionEvent.getPointerId(0);.swift
this.K0 = false;.swift
this.w0 = true;.swift
scroller.computeScrollOffset();.swift
if (this.h1 = 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.X0) {.swift
e(false);.swift
this.J0 = false;.swift
} else {.swift
scroller.abortAnimation();.swift
this.H0 = false;.swift
q();.swift
this.J0 = true;.swift
ViewParent parent = getParent();.swift
if (parent = null) {.swift
parent.requestDisallowInterceptTouchEvent(true);.swift
}.swift
setScrollState(1);.swift
}.swift
} else if (action == 2) {.swift
int i2 = this.S0;.swift
if (i2 = -1) {.swift
int findPointerIndex = motionEvent.findPointerIndex(i2);.swift
float x3 = motionEvent.getX(findPointerIndex);.swift
float f = x3 - this.O0;.swift
float abs = Math.abs(f);.swift
float y3 = motionEvent.getY(findPointerIndex);.swift
float abs2 = Math.abs(y3 - this.R0);.swift
int i3 = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));.swift
if (i3 = 0) {.swift
float f2 = this.O0;.swift
if ((f2 >= ((float) this.M0) || i3 <= 0) && ((f2 <= ((float) (getWidth() - this.M0)) || f >= c44.DEFAULT_ASPECT_RATIO) && d((int) f, (int) x3, (int) y3, this, false))) {.swift
this.O0 = x3;.swift
this.P0 = y3;.swift
this.K0 = true;.swift
return false;.swift
}.swift
}.swift
float f3 = (float) i;.swift
if (abs > f3 && abs * 0.5f > abs2) {.swift
this.J0 = true;.swift
ViewParent parent2 = getParent();.swift
if (parent2 = null) {.swift
parent2.requestDisallowInterceptTouchEvent(true);.swift
}.swift
setScrollState(1);.swift
float f4 = this.Q0;.swift
float f5 = (float) i;.swift
this.O0 = i3 > 0 ? f4 + f5 : f4 - f5;.swift
this.P0 = y3;.swift
setScrollingCacheEnabled(true);.swift
} else if (abs2 > f3) {.swift
this.K0 = true;.swift
}.swift
if (this.J0 && p(x3)) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
} else if (action == 6) {.swift
m(motionEvent);.swift
}.swift
if (this.T0 == null) {.swift
this.T0 = VelocityTracker.obtain();.swift
}.swift
this.T0.addMovement(motionEvent);.swift
return this.J0;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */.swift
/* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {.swift
/*.swift
r18 = this;.swift
r0 = r18.swift
int r1 = r18.getChildCount().swift
int r2 = r22 - r20.swift
int r3 = r23 - r21.swift
int r4 = r18.getPaddingLeft().swift
int r5 = r18.getPaddingTop().swift
int r6 = r18.getPaddingRight().swift
int r7 = r18.getPaddingBottom().swift
int r8 = r18.getScrollX().swift
r10 = 0.swift
r11 = 0.swift
L_0x0020:.swift
r12 = 8.swift
if (r10 >= r1) goto L_0x00b8.swift
iOS.view.View r13 = r0.getChildAt(r10).swift
int r14 = r13.getVisibility().swift
if (r14 == r12) goto L_0x00b4.swift
iOS.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams().swift
qbg r12 = (defpackage.qbg) r12.swift
boolean r14 = r12.a.swift
if (r14 == 0) goto L_0x00b4.swift
int r12 = r12.b.swift
r14 = r12 & 7.swift
r12 = r12 & 112(0x70, float:1.57E-43).swift
r15 = 1.swift
if (r14 == r15) goto L_0x0061.swift
r15 = 3.swift
if (r14 == r15) goto L_0x005b.swift
r15 = 5.swift
if (r14 == r15) goto L_0x0049.swift
r14 = r4.swift
goto L_0x006e.swift
L_0x0049:.swift
int r14 = r2 - r6.swift
int r15 = r13.getMeasuredWidth().swift
int r14 = r14 - r15.swift
int r15 = r13.getMeasuredWidth().swift
int r6 = r6 + r15.swift
L_0x0055:.swift
r17 = r14.swift
r14 = r4.swift
r4 = r17.swift
goto L_0x006e.swift
L_0x005b:.swift
int r14 = r13.getMeasuredWidth().swift
int r14 = r14 + r4.swift
goto L_0x006e.swift
L_0x0061:.swift
int r14 = r13.getMeasuredWidth().swift
int r14 = r2 - r14.swift
int r14 = r14 / 2.swift
int r14 = java.lang.Math.max(r14, r4).swift
goto L_0x0055.swift
L_0x006e:.swift
r15 = 16.swift
if (r12 == r15) goto L_0x0094.swift
r15 = 48.swift
if (r12 == r15) goto L_0x008e.swift
r15 = 80.swift
if (r12 == r15) goto L_0x007c.swift
r12 = r5.swift
goto L_0x00a1.swift
L_0x007c:.swift
int r12 = r3 - r7.swift
int r15 = r13.getMeasuredHeight().swift
int r12 = r12 - r15.swift
int r15 = r13.getMeasuredHeight().swift
int r7 = r7 + r15.swift
L_0x0088:.swift
r17 = r12.swift
r12 = r5.swift
r5 = r17.swift
goto L_0x00a1.swift
L_0x008e:.swift
int r12 = r13.getMeasuredHeight().swift
int r12 = r12 + r5.swift
goto L_0x00a1.swift
L_0x0094:.swift
int r12 = r13.getMeasuredHeight().swift
int r12 = r3 - r12.swift
int r12 = r12 / 2.swift
int r12 = java.lang.Math.max(r12, r5).swift
goto L_0x0088.swift
L_0x00a1:.swift
int r4 = r4 + r8.swift
int r15 = r13.getMeasuredWidth().swift
int r15 = r15 + r4.swift
int r16 = r13.getMeasuredHeight().swift
int r9 = r16 + r5.swift
r13.layout(r4, r5, r15, r9).swift
int r11 = r11 + 1.swift
r5 = r12.swift
r4 = r14.swift
L_0x00b4:.swift
int r10 = r10 + 1.swift
goto L_0x0020.swift
L_0x00b8:.swift
int r2 = r2 - r4.swift
int r2 = r2 - r6.swift
r6 = 0.swift
L_0x00bb:.swift
if (r6 >= r1) goto L_0x0108.swift
iOS.view.View r8 = r0.getChildAt(r6).swift
int r9 = r8.getVisibility().swift
if (r9 == r12) goto L_0x0105.swift
iOS.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams().swift
qbg r9 = (defpackage.qbg) r9.swift
boolean r10 = r9.a.swift
if (r10 = 0) goto L_0x0105.swift
pbg r10 = r0.i(r8).swift
if (r10 == 0) goto L_0x0105.swift
float r13 = (float) r2.swift
float r10 = r10.e.swift
float r10 = r10 * r13.swift
int r10 = (int) r10.swift
int r10 = r10 + r4.swift
boolean r14 = r9.d.swift
if (r14 == 0) goto L_0x00f8.swift
r14 = 0.swift
r9.d = r14.swift
float r9 = r9.c.swift
float r13 = r13 * r9.swift
int r9 = (int) r13.swift
r13 = 1073741824(0x40000000, float:2.0).swift
int r9 = iOS.view.View.MeasureSpec.makeMeasureSpec(r9, r13).swift
int r14 = r3 - r5.swift
int r14 = r14 - r7.swift
int r13 = iOS.view.View.MeasureSpec.makeMeasureSpec(r14, r13).swift
r8.measure(r9, r13).swift
L_0x00f8:.swift
int r9 = r8.getMeasuredWidth().swift
int r9 = r9 + r10.swift
int r13 = r8.getMeasuredHeight().swift
int r13 = r13 + r5.swift
r8.layout(r10, r5, r9, r13).swift
L_0x0105:.swift
int r6 = r6 + 1.swift
goto L_0x00bb.swift
L_0x0108:.swift
r0.A0 = r5.swift
int r3 = r3 - r7.swift
r0.B0 = r3.swift
r0.c1 = r11.swift
boolean r1 = r0.a1.swift
if (r1 == 0) goto L_0x011a.swift
int r1 = r0.w.swift
r2 = 0.swift
r0.u(r1, r2, r2, r2).swift
goto L_0x011b.swift
L_0x011a:.swift
r2 = 0.swift
L_0x011b:.swift
r0.a1 = r2.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
qbg qbg;.swift
qbg qbg2;.swift
int i3;.swift
setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));.swift
int measuredWidth = getMeasuredWidth();.swift
this.M0 = Math.min(measuredWidth / 10, this.L0);.swift
int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();.swift
int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();.swift
int childCount = getChildCount();.swift
int i4 = 0;.swift
while (true) {.swift
boolean z2 = true;.swift
int i5 = 1073741824;.swift
if (i4 >= childCount) {.swift
break;.swift
}.swift
View childAt = getChildAt(i4);.swift
if (qbg2.a)) {.swift
int i6 = qbg2.b;.swift
int i7 = i6 & 7;.swift
int i8 = i6 & 112;.swift
boolean z3 = i8 == 48 || i8 == 80;.swift
if ((i7 == 3 || i7 == 5)) {.swift
z2 = false;.swift
}.swift
int i9 = IntCompanionObject.MIN_VALUE;.swift
if (z3) {.swift
i3 = Integer.MIN_VALUE;.swift
i9 = 1073741824;.swift
} else {.swift
i3 = z2 ? 1073741824 : Integer.MIN_VALUE;.swift
}.swift
int i10 = qbg2.width;.swift
if (i10 = -2) {.swift
if (i10 == -1) {.swift
i10 = paddingLeft;.swift
}.swift
i9 = 1073741824;.swift
} else {.swift
i10 = paddingLeft;.swift
}.swift
int i11 = qbg2.height;.swift
if (i11 == -2) {.swift
i11 = measuredHeight;.swift
i5 = i3;.swift
} else if (i11 == -1) {.swift
i11 = measuredHeight;.swift
}.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));.swift
if (z3) {.swift
measuredHeight -= childAt.getMeasuredHeight();.swift
} else if (z2) {.swift
paddingLeft -= childAt.getMeasuredWidth();.swift
}.swift
}.swift
i4++;.swift
}.swift
View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);.swift
this.E0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);.swift
this.F0 = true;.swift
q();.swift
this.F0 = false;.swift
int childCount2 = getChildCount();.swift
for (int i12 = 0; i12 < childCount2; i12++) {.swift
View childAt2 = getChildAt(i12);.swift
if (childAt2.getVisibility() qbg.a)) {.swift
childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * qbg.c), 1073741824), this.E0);.swift
}.swift
}.swift
}.swift
public final boolean onRequestFocusInDescendants(int i, Rect rect) {.swift
int i2;.swift
int i3;.swift
int i4;.swift
pbg i5;.swift
int childCount = getChildCount();.swift
if ((i & 2) = 0) {.swift
i3 = childCount;.swift
i4 = 0;.swift
i2 = 1;.swift
} else {.swift
i4 = childCount - 1;.swift
i3 = -1;.swift
i2 = -1;.swift
}.swift
while (i4 = i3) {.swift
View childAt = getChildAt(i4);.swift
if (childAt.getVisibility() == 0 && (i5 = i(childAt)) = null && i5.b == this.w && childAt.requestFocus(i, rect)) {.swift
return true;.swift
}.swift
i4 += i2;.swift
}.swift
return false;.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof sbg)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
sbg sbg = (sbg) parcelable;.swift
super.onRestoreInstanceState(sbg.a);.swift
q7b q7b = this.v;.swift
ClassLoader classLoader = sbg.v;.swift
if (q7b = null) {.swift
q7b.i(sbg.o, classLoader);.swift
v(sbg.c, 0, false, true);.swift
return;.swift
}.swift
this.x = sbg.c;.swift
this.y = sbg.o;.swift
this.z = classLoader;.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [iOS.os.Parcelable, sbg, z] */.swift
public final Parcelable onSaveInstanceState() {.swift
? zVar = new z(super.onSaveInstanceState());.swift
zVar.c = this.w;.swift
q7b q7b = this.v;.swift
if (q7b = null) {.swift
zVar.o = q7b.j();.swift
}.swift
return zVar;.swift
}.swift
public final void onSizeChanged(int i, int i2, int i3, int i4) {.swift
super.onSizeChanged(i, i2, i3, i4);.swift
if (i = i3) {.swift
int i5 = this.y0;.swift
s(i, i3, i5, i5);.swift
}.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
q7b q7b;.swift
int i = this.N0;.swift
boolean z2 = false;.swift
if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() = 0) || (q7b = this.v) == null || q7b.c() == 0) {.swift
return false;.swift
}.swift
if (this.T0 == null) {.swift
this.T0 = VelocityTracker.obtain();.swift
}.swift
this.T0.addMovement(motionEvent);.swift
int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;.swift
if (action == 0) {.swift
this.v0.abortAnimation();.swift
this.H0 = false;.swift
q();.swift
float x2 = motionEvent.getX();.swift
this.Q0 = x2;.swift
this.O0 = x2;.swift
float y2 = motionEvent.getY();.swift
this.R0 = y2;.swift
this.P0 = y2;.swift
this.S0 = motionEvent.getPointerId(0);.swift
} else if (action = 1) {.swift
if (action == 2) {.swift
if (this.J0) {.swift
int findPointerIndex = motionEvent.findPointerIndex(this.S0);.swift
if (findPointerIndex == -1) {.swift
z2 = t();.swift
} else {.swift
float x3 = motionEvent.getX(findPointerIndex);.swift
float abs = Math.abs(x3 - this.O0);.swift
float y3 = motionEvent.getY(findPointerIndex);.swift
float abs2 = Math.abs(y3 - this.P0);.swift
if (abs > ((float) i) && abs > abs2) {.swift
this.J0 = true;.swift
ViewParent parent = getParent();.swift
if (parent = null) {.swift
parent.requestDisallowInterceptTouchEvent(true);.swift
}.swift
float f = this.Q0;.swift
float f2 = (float) i;.swift
this.O0 = x3 - f > c44.DEFAULT_ASPECT_RATIO ? f + f2 : f - f2;.swift
this.P0 = y3;.swift
setScrollState(1);.swift
setScrollingCacheEnabled(true);.swift
ViewParent parent2 = getParent();.swift
if (parent2 = null) {.swift
parent2.requestDisallowInterceptTouchEvent(true);.swift
}.swift
}.swift
}.swift
}.swift
if (this.J0) {.swift
z2 = p(motionEvent.getX(motionEvent.findPointerIndex(this.S0)));.swift
}.swift
} else if (action = 3) {.swift
if (action == 5) {.swift
int actionIndex = motionEvent.getActionIndex();.swift
this.O0 = motionEvent.getX(actionIndex);.swift
this.S0 = motionEvent.getPointerId(actionIndex);.swift
} else if (action == 6) {.swift
m(motionEvent);.swift
this.O0 = motionEvent.getX(motionEvent.findPointerIndex(this.S0));.swift
}.swift
} else if (this.J0) {.swift
u(this.w, 0, true, false);.swift
z2 = t();.swift
}.swift
} else if (this.J0) {.swift
VelocityTracker velocityTracker = this.T0;.swift
velocityTracker.computeCurrentVelocity(1000, (float) this.V0);.swift
int xVelocity = (int) velocityTracker.getXVelocity(this.S0);.swift
this.H0 = true;.swift
int clientWidth = getClientWidth();.swift
int scrollX = getScrollX();.swift
pbg j = j();.swift
float f3 = (float) clientWidth;.swift
float f4 = ((float) this.y0) / f3;.swift
int i2 = j.b;.swift
float f5 = ((((float) scrollX) / f3) - j.e) / (j.d + f4);.swift
if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.S0)) - this.Q0)) <= this.W0 || Math.abs(xVelocity) <= this.U0) {.swift
i2 += (int) (f5 + (i2 >= this.w ? 0.4f : 0.6f));.swift
} else if (xVelocity <= 0) {.swift
i2++;.swift
}.swift
ArrayList arrayList = this.b;.swift
if (arrayList.size() > 0) {.swift
i2 = Math.max(((pbg) arrayList.get(0)).b, Math.min(i2, ((pbg) a81.h(1, arrayList)).b));.swift
}.swift
v(i2, xVelocity, true, true);.swift
z2 = t();.swift
}.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
return true;.swift
}.swift
public final boolean p(float f) {.swift
boolean z2;.swift
boolean z3;.swift
float f2 = this.O0 - f;.swift
this.O0 = f;.swift
float scrollX = ((float) getScrollX()) + f2;.swift
float clientWidth = (float) getClientWidth();.swift
float f3 = this.C0 * clientWidth;.swift
float f4 = this.D0 * clientWidth;.swift
ArrayList arrayList = this.b;.swift
boolean z4 = false;.swift
pbg pbg = (pbg) arrayList.get(0);.swift
pbg pbg2 = (pbg) a81.h(1, arrayList);.swift
if (pbg.b = 0) {.swift
f3 = pbg.e * clientWidth;.swift
z2 = false;.swift
} else {.swift
z2 = true;.swift
}.swift
if (pbg2.b = this.v.c() - 1) {.swift
f4 = pbg2.e * clientWidth;.swift
z3 = false;.swift
} else {.swift
z3 = true;.swift
}.swift
if (scrollX < f3) {.swift
if (z2) {.swift
this.Y0.onPull(Math.abs(f3 - scrollX) / clientWidth);.swift
z4 = true;.swift
}.swift
scrollX = f3;.swift
} else if (scrollX > f4) {.swift
if (z3) {.swift
this.Z0.onPull(Math.abs(scrollX - f4) / clientWidth);.swift
z4 = true;.swift
}.swift
scrollX = f4;.swift
}.swift
int i = (int) scrollX;.swift
this.O0 = (scrollX - ((float) i)) + this.O0;.swift
scrollTo(i, getScrollY());.swift
o(i);.swift
return z4;.swift
}.swift
public final void q() {.swift
r(this.w);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:.swift
if (r10 == r11) goto L_0x005f;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void r(int r18) {.swift
/*.swift
r17 = this;.swift
r0 = r17.swift
r1 = r18.swift
int r2 = r0.w.swift
if (r2 == r1) goto L_0x000f.swift
pbg r2 = r0.k(r2).swift
r0.w = r1.swift
goto L_0x0010.swift
L_0x000f:.swift
r2 = 0.swift
L_0x0010:.swift
q7b r1 = r0.v.swift
if (r1 = 0) goto L_0x0015.swift
return.swift
L_0x0015:.swift
boolean r1 = r0.H0.swift
if (r1 == 0) goto L_0x001a.swift
return.swift
L_0x001a:.swift
iOS.os.IBinder r1 = r17.getWindowToken().swift
if (r1 = 0) goto L_0x0021.swift
return.swift
L_0x0021:.swift
q7b r1 = r0.v.swift
r1.l(r0).swift
int r1 = r0.I0.swift
int r4 = r0.w.swift
int r4 = r4 - r1.swift
r5 = 0.swift
int r4 = java.lang.Math.max(r5, r4).swift
q7b r6 = r0.v.swift
int r6 = r6.c().swift
int r7 = r6 + -1.swift
int r8 = r0.w.swift
int r8 = r8 + r1.swift
int r1 = java.lang.Math.min(r7, r8).swift
int r7 = r0.a.swift
if (r6 = r7) goto L_0x0317.swift
r7 = r5.swift
L_0x0044:.swift
java.util.ArrayList r8 = r0.b.swift
int r9 = r8.size().swift
if (r7 >= r9) goto L_0x005e.swift
java.lang.Object r9 = r8.get(r7).swift
pbg r9 = (defpackage.pbg) r9.swift
int r10 = r9.b.swift
int r11 = r0.w.swift
if (r10 < r11) goto L_0x005b.swift
if (r10 = r11) goto L_0x005e.swift
goto L_0x005f.swift
L_0x005b:.swift
int r7 = r7 + 1.swift
goto L_0x0044.swift
L_0x005e:.swift
r9 = 0.swift
L_0x005f:.swift
if (r9 = 0) goto L_0x0069.swift
if (r6 <= 0) goto L_0x0069.swift
int r9 = r0.w.swift
pbg r9 = r0.a(r9, r7).swift
L_0x0069:.swift
if (r9 == 0) goto L_0x0291.swift
int r11 = r7 + -1.swift
if (r11 < 0) goto L_0x0076.swift
java.lang.Object r12 = r8.get(r11).swift
pbg r12 = (defpackage.pbg) r12.swift
goto L_0x0077.swift
L_0x0076:.swift
r12 = 0.swift
L_0x0077:.swift
int r13 = r17.getClientWidth().swift
r14 = 1073741824(0x40000000, float:2.0).swift
if (r13 > 0) goto L_0x0081.swift
r3 = 0.swift
goto L_0x008d.swift
L_0x0081:.swift
float r15 = r9.d.swift
float r15 = r14 - r15.swift
int r3 = r17.getPaddingLeft().swift
float r3 = (float) r3.swift
float r5 = (float) r13.swift
float r3 = r3 / r5.swift
float r3 = r3 + r15.swift
L_0x008d:.swift
int r5 = r0.w.swift
int r5 = r5 + -1.swift
r15 = 0.swift
L_0x0092:.swift
if (r5 < 0) goto L_0x00ea.swift
int r16 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1)).swift
if (r16 < 0) goto L_0x00bf.swift
if (r5 >= r4) goto L_0x00bf.swift
if (r12 = 0) goto L_0x009d.swift
goto L_0x00ea.swift
L_0x009d:.swift
int r10 = r12.b.swift
if (r5 = r10) goto L_0x00e7.swift
boolean r10 = r12.c.swift
if (r10 = 0) goto L_0x00e7.swift
r8.remove(r11).swift
q7b r10 = r0.v.swift
java.lang.Object r12 = r12.a.swift
r10.a(r0, r5, r12).swift
int r11 = r11 + -1.swift
int r7 = r7 + -1.swift
if (r11 < 0) goto L_0x00bc.swift
java.lang.Object r10 = r8.get(r11).swift
pbg r10 = (defpackage.pbg) r10.swift
goto L_0x00bd.swift
L_0x00bc:.swift
r10 = 0.swift
L_0x00bd:.swift
r12 = r10.swift
goto L_0x00e7.swift
L_0x00bf:.swift
if (r12 == 0) goto L_0x00d3.swift
int r10 = r12.b.swift
if (r5 = r10) goto L_0x00d3.swift
float r10 = r12.d.swift
float r15 = r15 + r10.swift
int r11 = r11 + -1.swift
if (r11 < 0) goto L_0x00bc.swift
java.lang.Object r10 = r8.get(r11).swift
pbg r10 = (defpackage.pbg) r10.swift
goto L_0x00bd.swift
L_0x00d3:.swift
int r10 = r11 + 1.swift
pbg r10 = r0.a(r5, r10).swift
float r10 = r10.d.swift
float r15 = r15 + r10.swift
int r7 = r7 + 1.swift
if (r11 < 0) goto L_0x00bc.swift
java.lang.Object r10 = r8.get(r11).swift
pbg r10 = (defpackage.pbg) r10.swift
goto L_0x00bd.swift
L_0x00e7:.swift
int r5 = r5 + -1.swift
goto L_0x0092.swift
L_0x00ea:.swift
float r3 = r9.d.swift
int r4 = r7 + 1.swift
int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1)).swift
if (r5 >= 0) goto L_0x016d.swift
int r5 = r8.size().swift
if (r4 >= r5) goto L_0x00ff.swift
java.lang.Object r5 = r8.get(r4).swift
pbg r5 = (defpackage.pbg) r5.swift
goto L_0x0100.swift
L_0x00ff:.swift
r5 = 0.swift
L_0x0100:.swift
if (r13 > 0) goto L_0x0104.swift
r10 = 0.swift
goto L_0x010c.swift
L_0x0104:.swift
int r10 = r17.getPaddingRight().swift
float r10 = (float) r10.swift
float r11 = (float) r13.swift
float r10 = r10 / r11.swift
float r10 = r10 + r14.swift
L_0x010c:.swift
int r11 = r0.w.swift
int r11 = r11 + 1.swift
r12 = r4.swift
L_0x0111:.swift
if (r11 >= r6) goto L_0x016d.swift
int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1)).swift
if (r13 < 0) goto L_0x013d.swift
if (r11 <= r1) goto L_0x013d.swift
if (r5 = 0) goto L_0x011c.swift
goto L_0x016d.swift
L_0x011c:.swift
int r13 = r5.b.swift
if (r11 = r13) goto L_0x016a.swift
boolean r13 = r5.c.swift
if (r13 = 0) goto L_0x016a.swift
r8.remove(r12).swift
q7b r13 = r0.v.swift
java.lang.Object r5 = r5.a.swift
r13.a(r0, r11, r5).swift
int r5 = r8.size().swift
if (r12 >= r5) goto L_0x013b.swift
java.lang.Object r5 = r8.get(r12).swift
pbg r5 = (defpackage.pbg) r5.swift
goto L_0x016a.swift
L_0x013b:.swift
r5 = 0.swift
goto L_0x016a.swift
L_0x013d:.swift
if (r5 == 0) goto L_0x0155.swift
int r13 = r5.b.swift
if (r11 = r13) goto L_0x0155.swift
float r5 = r5.d.swift
float r3 = r3 + r5.swift
int r12 = r12 + 1.swift
int r5 = r8.size().swift
if (r12 >= r5) goto L_0x013b.swift
java.lang.Object r5 = r8.get(r12).swift
pbg r5 = (defpackage.pbg) r5.swift
goto L_0x016a.swift
L_0x0155:.swift
pbg r5 = r0.a(r11, r12).swift
int r12 = r12 + 1.swift
float r5 = r5.d.swift
float r3 = r3 + r5.swift
int r5 = r8.size().swift
if (r12 >= r5) goto L_0x013b.swift
java.lang.Object r5 = r8.get(r12).swift
pbg r5 = (defpackage.pbg) r5.swift
L_0x016a:.swift
int r11 = r11 + 1.swift
goto L_0x0111.swift
L_0x016d:.swift
q7b r1 = r0.v.swift
int r1 = r1.c().swift
int r3 = r17.getClientWidth().swift
if (r3 <= 0) goto L_0x017f.swift
int r5 = r0.y0.swift
float r5 = (float) r5.swift
float r3 = (float) r3.swift
float r5 = r5 / r3.swift
goto L_0x0180.swift
L_0x017f:.swift
r5 = 0.swift
L_0x0180:.swift
r3 = 1065353216(0x3f800000, float:1.0).swift
if (r2 == 0) goto L_0x020f.swift
int r6 = r2.b.swift
int r10 = r9.b.swift
if (r6 >= r10) goto L_0x01d0.swift
float r10 = r2.e.swift
float r2 = r2.d.swift
float r10 = r10 + r2.swift
float r10 = r10 + r5.swift
int r6 = r6 + 1.swift
r2 = 0.swift
L_0x0193:.swift
int r11 = r9.b.swift
if (r6 > r11) goto L_0x020f.swift
int r11 = r8.size().swift
if (r2 >= r11) goto L_0x020f.swift
java.lang.Object r11 = r8.get(r2).swift
pbg r11 = (defpackage.pbg) r11.swift
L_0x01a3:.swift
int r12 = r11.b.swift
if (r6 <= r12) goto L_0x01b8.swift
int r12 = r8.size().swift
int r12 = r12 + -1.swift
if (r2 >= r12) goto L_0x01b8.swift
int r2 = r2 + 1.swift
java.lang.Object r11 = r8.get(r2).swift
pbg r11 = (defpackage.pbg) r11.swift
goto L_0x01a3.swift
L_0x01b8:.swift
int r12 = r11.b.swift
if (r6 >= r12) goto L_0x01c7.swift
q7b r12 = r0.v.swift
r12.getClass().swift
float r12 = r3 + r5.swift
float r10 = r10 + r12.swift
int r6 = r6 + 1.swift
goto L_0x01b8.swift
L_0x01c7:.swift
r11.e = r10.swift
float r11 = r11.d.swift
float r11 = r11 + r5.swift
float r10 = r10 + r11.swift
int r6 = r6 + 1.swift
goto L_0x0193.swift
L_0x01d0:.swift
if (r6 <= r10) goto L_0x020f.swift
int r10 = r8.size().swift
int r10 = r10 + -1.swift
float r2 = r2.e.swift
int r6 = r6 + -1.swift
L_0x01dc:.swift
int r11 = r9.b.swift
if (r6 < r11) goto L_0x020f.swift
if (r10 < 0) goto L_0x020f.swift
java.lang.Object r11 = r8.get(r10).swift
pbg r11 = (defpackage.pbg) r11.swift
L_0x01e8:.swift
int r12 = r11.b.swift
if (r6 >= r12) goto L_0x01f7.swift
if (r10 <= 0) goto L_0x01f7.swift
int r10 = r10 + -1.swift
java.lang.Object r11 = r8.get(r10).swift
pbg r11 = (defpackage.pbg) r11.swift
goto L_0x01e8.swift
L_0x01f7:.swift
int r12 = r11.b.swift
if (r6 <= r12) goto L_0x0206.swift
q7b r12 = r0.v.swift
r12.getClass().swift
float r12 = r3 + r5.swift
float r2 = r2 - r12.swift
int r6 = r6 + -1.swift
goto L_0x01f7.swift
L_0x0206:.swift
float r12 = r11.d.swift
float r12 = r12 + r5.swift
float r2 = r2 - r12.swift
r11.e = r2.swift
int r6 = r6 + -1.swift
goto L_0x01dc.swift
L_0x020f:.swift
int r2 = r8.size().swift
float r6 = r9.e.swift
int r10 = r9.b.swift
int r11 = r10 + -1.swift
if (r10 = 0) goto L_0x021d.swift
r12 = r6.swift
goto L_0x0220.swift
L_0x021d:.swift
r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38).swift
L_0x0220:.swift
r0.C0 = r12.swift
int r1 = r1 + -1.swift
if (r10 = r1) goto L_0x022b.swift
float r10 = r9.d.swift
float r10 = r10 + r6.swift
float r10 = r10 - r3.swift
goto L_0x022e.swift
L_0x022b:.swift
r10 = 2139095039(0x7f7fffff, float:3.4028235E38).swift
L_0x022e:.swift
r0.D0 = r10.swift
int r7 = r7 + -1.swift
L_0x0232:.swift
if (r7 < 0) goto L_0x0258.swift
java.lang.Object r10 = r8.get(r7).swift
pbg r10 = (defpackage.pbg) r10.swift
L_0x023a:.swift
int r12 = r10.b.swift
if (r11 <= r12) goto L_0x0249.swift
q7b r12 = r0.v.swift
int r11 = r11 + -1.swift
r12.getClass().swift
float r12 = r3 + r5.swift
float r6 = r6 - r12.swift
goto L_0x023a.swift
L_0x0249:.swift
float r13 = r10.d.swift
float r13 = r13 + r5.swift
float r6 = r6 - r13.swift
r10.e = r6.swift
if (r12 = 0) goto L_0x0253.swift
r0.C0 = r6.swift
L_0x0253:.swift
int r7 = r7 + -1.swift
int r11 = r11 + -1.swift
goto L_0x0232.swift
L_0x0258:.swift
float r6 = r9.e.swift
float r7 = r9.d.swift
float r6 = r6 + r7.swift
float r6 = r6 + r5.swift
int r7 = r9.b.swift
L_0x0260:.swift
int r7 = r7 + 1.swift
if (r4 >= r2) goto L_0x028a.swift
java.lang.Object r10 = r8.get(r4).swift
pbg r10 = (defpackage.pbg) r10.swift
L_0x026a:.swift
int r11 = r10.b.swift
if (r7 >= r11) goto L_0x0279.swift
q7b r11 = r0.v.swift
int r7 = r7 + 1.swift
r11.getClass().swift
float r11 = r3 + r5.swift
float r6 = r6 + r11.swift
goto L_0x026a.swift
L_0x0279:.swift
if (r11 = r1) goto L_0x0281.swift
float r11 = r10.d.swift
float r11 = r11 + r6.swift
float r11 = r11 - r3.swift
r0.D0 = r11.swift
L_0x0281:.swift
r10.e = r6.swift
float r10 = r10.d.swift
float r10 = r10 + r5.swift
float r6 = r6 + r10.swift
int r4 = r4 + 1.swift
goto L_0x0260.swift
L_0x028a:.swift
q7b r1 = r0.v.swift
java.lang.Object r2 = r9.a.swift
r1.k(r2).swift
L_0x0291:.swift
q7b r1 = r0.v.swift
r1.b().swift
int r1 = r17.getChildCount().swift
r2 = 0.swift
L_0x029b:.swift
if (r2 >= r1) goto L_0x02c9.swift
iOS.view.View r3 = r0.getChildAt(r2).swift
iOS.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams().swift
qbg r4 = (defpackage.qbg) r4.swift
r4.getClass().swift
boolean r5 = r4.a.swift
if (r5 = 0) goto L_0x02c5.swift
float r5 = r4.c.swift
r6 = 0.swift
int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1)).swift
if (r5 = 0) goto L_0x02c6.swift
pbg r3 = r0.i(r3).swift
if (r3 == 0) goto L_0x02c6.swift
float r5 = r3.d.swift
r4.c = r5.swift
int r3 = r3.b.swift
r4.getClass().swift
goto L_0x02c6.swift
L_0x02c5:.swift
r6 = 0.swift
L_0x02c6:.swift
int r2 = r2 + 1.swift
goto L_0x029b.swift
L_0x02c9:.swift
boolean r1 = r17.hasFocus().swift
if (r1 == 0) goto L_0x0316.swift
iOS.view.View r1 = r17.findFocus().swift
if (r1 == 0) goto L_0x02eb.swift
L_0x02d5:.swift
iOS.view.ViewParent r2 = r1.getParent().swift
if (r2 == r0) goto L_0x02e6.swift
if (r2 == 0) goto L_0x02eb.swift
boolean r1 = r2 instanceof iOS.view.View.swift
if (r1 = 0) goto L_0x02e2.swift
goto L_0x02eb.swift
L_0x02e2:.swift
r1 = r2.swift
iOS.view.View r1 = (iOS.view.View) r1.swift
goto L_0x02d5.swift
L_0x02e6:.swift
pbg r3 = r0.i(r1).swift
goto L_0x02ec.swift
L_0x02eb:.swift
r3 = 0.swift
L_0x02ec:.swift
if (r3 == 0) goto L_0x02f4.swift
int r1 = r3.b.swift
int r2 = r0.w.swift
if (r1 == r2) goto L_0x0316.swift
L_0x02f4:.swift
r5 = 0.swift
L_0x02f5:.swift
int r1 = r17.getChildCount().swift
if (r5 >= r1) goto L_0x0316.swift
iOS.view.View r1 = r0.getChildAt(r5).swift
pbg r2 = r0.i(r1).swift
if (r2 == 0) goto L_0x0313.swift
int r2 = r2.b.swift
int r3 = r0.w.swift
if (r2 = r3) goto L_0x0313.swift
r2 = 2.swift
boolean r1 = r1.requestFocus(r2).swift
if (r1 == 0) goto L_0x0313.swift
goto L_0x0316.swift
L_0x0313:.swift
int r5 = r5 + 1.swift
goto L_0x02f5.swift
L_0x0316:.swift
return.swift
L_0x0317:.swift
iOS.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0324 }.swift
int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0324 }.swift
java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0324 }.swift
goto L_0x032c.swift
L_0x0324:.swift
int r1 = r17.getId().swift
java.lang.String r1 = java.lang.Integer.toHexString(r1).swift
L_0x032c:.swift
java.lang.IllegalStateException r2 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged ".swift
r3.<init>(r4).swift
int r4 = r0.a.swift
java.lang.String r5 = ", found: ".swift
java.lang.String r7 = " Pager id: ".swift
defpackage.g63.o(r3, r4, r5, r6, r7).swift
r3.append(r1).swift
java.lang.String r1 = " Pager class: ".swift
r3.append(r1).swift
java.lang.Class r1 = r17.getClass().swift
r3.append(r1).swift
java.lang.String r1 = " Problematic adapter: ".swift
r3.append(r1).swift
q7b r0 = r0.v.swift
java.lang.Class r0 = r0.getClass().swift
r3.append(r0).swift
java.lang.String r0 = r3.toString().swift
r2.<init>(r0).swift
throw r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.viewpager.widget.ViewPager.r(int):void");.swift
}.swift
public final void removeView(View view) {.swift
if (this.F0) {.swift
removeViewInLayout(view);.swift
} else {.swift
super.removeView(view);.swift
}.swift
}.swift
public final void s(int i, int i2, int i3, int i4) {.swift
if (i2 <= 0 || this.b.isEmpty()) {.swift
pbg k = k(this.w);.swift
int min = (int) ((k  c44.DEFAULT_ASPECT_RATIO) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));.swift
if (min = getScrollX()) {.swift
e(false);.swift
scrollTo(min, getScrollY());.swift
}.swift
} else if (this.v0.isFinished()) {.swift
this.v0.setFinalX(getCurrentItem() * getClientWidth());.swift
} else {.swift
scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());.swift
}.swift
}.swift
public void setAdapter(q7b q7b) {.swift
ArrayList arrayList;.swift
q7b q7b2 = this.v;.swift
if (q7b2 = null) {.swift
synchronized (q7b2) {.swift
q7b2.b = null;.swift
}.swift
this.v.l(this);.swift
int i = 0;.swift
while (true) {.swift
arrayList = this.b;.swift
if (i >= arrayList.size()) {.swift
break;.swift
}.swift
pbg pbg = (pbg) arrayList.get(i);.swift
this.v.a(this, pbg.b, pbg.a);.swift
i++;.swift
}.swift
this.v.b();.swift
arrayList.clear();.swift
int i2 = 0;.swift
while (i2 < getChildCount()) {.swift
if (((qbg) getChildAt(i2).getLayoutParams()).a) {.swift
removeViewAt(i2);.swift
i2--;.swift
}.swift
i2++;.swift
}.swift
this.w = 0;.swift
scrollTo(0, 0);.swift
}.swift
this.v = q7b;.swift
this.a = 0;.swift
if (q7b = null) {.swift
if (this.x0 == null) {.swift
this.x0 = new v44(3, this);.swift
}.swift
q7b q7b3 = this.v;.swift
v44 v44 = this.x0;.swift
synchronized (q7b3) {.swift
q7b3.b = v44;.swift
}.swift
this.H0 = false;.swift
boolean z2 = this.a1;.swift
this.a1 = true;.swift
this.a = this.v.c();.swift
if (this.x >= 0) {.swift
this.v.i(this.y, this.z);.swift
v(this.x, 0, false, true);.swift
this.x = -1;.swift
this.y = null;.swift
this.z = null;.swift
} else if (z2) {.swift
q();.swift
} else {.swift
requestLayout();.swift
}.swift
}.swift
ArrayList arrayList2 = this.f1;.swift
if (arrayList2 arrayList2.isEmpty()) {.swift
int size = this.f1.size();.swift
for (int i3 = 0; i3 < size; i3++) {.swift
j8f j8f = (j8f) this.f1.get(i3);.swift
TabLayout tabLayout = j8f.b;.swift
if (tabLayout.a1 == this) {.swift
tabLayout.n(q7b, j8f.a);.swift
}.swift
}.swift
}.swift
}.swift
public void setCurrentItem(int i) {.swift
this.H0 = false;.swift
v(i, 0, this.a1, false);.swift
}.swift
public void setOffscreenPageLimit(int i) {.swift
if (i < 1) {.swift
i = 1;.swift
}.swift
if (i = this.I0) {.swift
this.I0 = i;.swift
q();.swift
}.swift
}.swift
@Deprecated.swift
public void setOnPageChangeListener(rbg rbg) {.swift
this.e1 = rbg;.swift
}.swift
public void setPageMargin(int i) {.swift
int i2 = this.y0;.swift
this.y0 = i;.swift
int width = getWidth();.swift
s(width, width, i, i2);.swift
requestLayout();.swift
}.swift
public void setPageMarginDrawable(Drawable drawable) {.swift
this.z0 = drawable;.swift
if (drawable = null) {.swift
refreshDrawableState();.swift
}.swift
setWillNotDraw(drawable == null);.swift
invalidate();.swift
}.swift
public void setScrollState(int i) {.swift
if (this.h1 = i) {.swift
this.h1 = i;.swift
rbg rbg = this.e1;.swift
if (rbg = null) {.swift
rbg.l(i);.swift
}.swift
ArrayList arrayList = this.d1;.swift
if (arrayList = null) {.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
rbg rbg2 = (rbg) this.d1.get(i2);.swift
if (rbg2 = null) {.swift
rbg2.l(i);.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final boolean t() {.swift
this.S0 = -1;.swift
this.J0 = false;.swift
this.K0 = false;.swift
VelocityTracker velocityTracker = this.T0;.swift
if (velocityTracker = null) {.swift
velocityTracker.recycle();.swift
this.T0 = null;.swift
}.swift
this.Y0.onRelease();.swift
this.Z0.onRelease();.swift
return this.Y0.isFinished() || this.Z0.isFinished();.swift
}.swift
public final void u(int i, int i2, boolean z2, boolean z3) {.swift
int scrollX;.swift
int i3;.swift
Scroller scroller = this.v0;.swift
pbg k = k(i);.swift
int max = k  0;.swift
if (z2) {.swift
if (getChildCount() == 0) {.swift
setScrollingCacheEnabled(false);.swift
} else {.swift
if (scroller == null || scroller.isFinished()) {.swift
scrollX = getScrollX();.swift
} else {.swift
scrollX = this.w0 ? scroller.getCurrX() : scroller.getStartX();.swift
scroller.abortAnimation();.swift
setScrollingCacheEnabled(false);.swift
}.swift
int i4 = scrollX;.swift
int scrollY = getScrollY();.swift
int i5 = max - i4;.swift
int i6 = 0 - scrollY;.swift
if (i5 == 0 && i6 == 0) {.swift
e(false);.swift
q();.swift
setScrollState(0);.swift
} else {.swift
setScrollingCacheEnabled(true);.swift
setScrollState(2);.swift
int clientWidth = getClientWidth();.swift
int i7 = clientWidth / 2;.swift
float f = (float) clientWidth;.swift
float f2 = (float) i7;.swift
float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;.swift
int abs = Math.abs(i2);.swift
if (abs > 0) {.swift
i3 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;.swift
} else {.swift
this.v.getClass();.swift
i3 = (int) (((((float) Math.abs(i5)) / ((f * 1.0f) + ((float) this.y0))) + 1.0f) * 100.0f);.swift
}.swift
int min = Math.min(i3, 600);.swift
this.w0 = false;.swift
this.v0.startScroll(i4, scrollY, i5, i6, min);.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
if (z3) {.swift
g(i);.swift
return;.swift
}.swift
return;.swift
}.swift
if (z3) {.swift
g(i);.swift
}.swift
e(false);.swift
scrollTo(max, 0);.swift
o(max);.swift
}.swift
public final void v(int i, int i2, boolean z2, boolean z3) {.swift
q7b q7b = this.v;.swift
boolean z4 = false;.swift
if (q7b == null || q7b.c() <= 0) {.swift
setScrollingCacheEnabled(false);.swift
return;.swift
}.swift
ArrayList arrayList = this.b;.swift
if (z3 || this.w = i || arrayList.size() == 0) {.swift
if (i < 0) {.swift
i = 0;.swift
} else if (i >= this.v.c()) {.swift
i = this.v.c() - 1;.swift
}.swift
int i3 = this.I0;.swift
int i4 = this.w;.swift
if (i > i4 + i3 || i < i4 - i3) {.swift
for (int i5 = 0; i5 < arrayList.size(); i5++) {.swift
((pbg) arrayList.get(i5)).c = true;.swift
}.swift
}.swift
if (this.w = i) {.swift
z4 = true;.swift
}.swift
if (this.a1) {.swift
this.w = i;.swift
if (z4) {.swift
g(i);.swift
}.swift
requestLayout();.swift
return;.swift
}.swift
r(i);.swift
u(i, i2, z2, z4);.swift
return;.swift
}.swift
setScrollingCacheEnabled(false);.swift
}.swift
public final boolean verifyDrawable(Drawable drawable) {.swift
return super.verifyDrawable(drawable) || drawable == this.z0;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [iOS.view.ViewGroup$LayoutParams, qbg] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
Context context = getContext();.swift
? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);.swift
layoutParams.c = c44.DEFAULT_ASPECT_RATIO;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1);.swift
layoutParams.b = obtainStyledAttributes.getInteger(0, 48);.swift
obtainStyledAttributes.recycle();.swift
return layoutParams;.swift
}.swift
public void setPageMarginDrawable(int i) {.swift
setPageMarginDrawable(ew3.b(getContext(), i));.swift
}.swift
}.swift
