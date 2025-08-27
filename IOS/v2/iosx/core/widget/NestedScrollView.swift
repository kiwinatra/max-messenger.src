package iOSx.core.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Build;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.TypedValue;.swift
import iOS.view.FocusFinder;.swift
import iOS.view.KeyEvent;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.ViewConfiguration;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.animation.AnimationUtils;.swift
import iOS.widget.EdgeEffect;.swift
import iOS.widget.FrameLayout;.swift
import iOS.widget.OverScroller;.swift
import java.util.ArrayList;.swift
import java.util.WeakHashMap;.swift
import kotlin.KotlinVersion;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class NestedScrollView extends FrameLayout implements k6a, g6a, nid {.swift
public static final float N0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));.swift
public static final rg8 O0 = new rg8(3);.swift
public static final int[] P0 = {16843130};.swift
public final int A0;.swift
public final int B0;.swift
public final int C0;.swift
public int D0;.swift
public final int[] E0;.swift
public final int[] F0;.swift
public int G0;.swift
public int H0;.swift
public f6a I0;.swift
public final ft J0;.swift
public final i6a K0;.swift
public float L0;.swift
public final qo4 M0;.swift
public final float a;.swift
public long b;.swift
public final Rect c;.swift
public final OverScroller o;.swift
public final EdgeEffect v;.swift
public View v0;.swift
public final EdgeEffect w;.swift
public boolean w0;.swift
public int x;.swift
public VelocityTracker x0;.swift
public boolean y;.swift
public boolean y0;.swift
public boolean z;.swift
public boolean z0;.swift
public NestedScrollView(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, adc.nestedScrollViewStyle);.swift
}.swift
public static boolean g(View view, View view2) {.swift
if (view == view2) {.swift
return true;.swift
}.swift
ViewParent parent = view.getParent();.swift
return (parent instanceof ViewGroup) && g((View) parent, view2);.swift
}.swift
public final void a(int i) {.swift
this.K0.i(i);.swift
}.swift
public final void addView(View view) {.swift
if (getChildCount() <= 0) {.swift
super.addView(view);.swift
return;.swift
}.swift
throw new IllegalStateException("ScrollView can host only one direct child");.swift
}.swift
public final boolean b(int i) {.swift
View findFocus = findFocus();.swift
if (findFocus == this) {.swift
findFocus = null;.swift
}.swift
View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);.swift
int maxScrollAmount = getMaxScrollAmount();.swift
if (findNextFocus == null || h(findNextFocus, maxScrollAmount, getHeight())) {.swift
if (i == 33 && getScrollY() < maxScrollAmount) {.swift
maxScrollAmount = getScrollY();.swift
} else if (i == 130 && getChildCount() > 0) {.swift
View childAt = getChildAt(0);.swift
maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);.swift
}.swift
if (maxScrollAmount == 0) {.swift
return false;.swift
}.swift
if (i = 130) {.swift
maxScrollAmount = -maxScrollAmount;.swift
}.swift
q(maxScrollAmount, 0, 1, true);.swift
} else {.swift
Rect rect = this.c;.swift
findNextFocus.getDrawingRect(rect);.swift
offsetDescendantRectToMyCoords(findNextFocus, rect);.swift
q(c(rect), 0, 1, true);.swift
findNextFocus.requestFocus(i);.swift
}.swift
if (findFocus h(findFocus, 0, getHeight()))) {.swift
int descendantFocusability = getDescendantFocusability();.swift
setDescendantFocusability(131072);.swift
requestFocus();.swift
setDescendantFocusability(descendantFocusability);.swift
}.swift
return true;.swift
}.swift
public final int c(Rect rect) {.swift
if (getChildCount() == 0) {.swift
return 0;.swift
}.swift
int height = getHeight();.swift
int scrollY = getScrollY();.swift
int i = scrollY + height;.swift
int verticalFadingEdgeLength = getVerticalFadingEdgeLength();.swift
if (rect.top > 0) {.swift
scrollY += verticalFadingEdgeLength;.swift
}.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;.swift
int i3 = rect.bottom;.swift
if (i3 > i2 && rect.top > scrollY) {.swift
return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);.swift
} else if (rect.top >= scrollY || i3 >= i2) {.swift
return 0;.swift
} else {.swift
return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());.swift
}.swift
}.swift
public final int computeHorizontalScrollExtent() {.swift
return super.computeHorizontalScrollExtent();.swift
}.swift
public final int computeHorizontalScrollOffset() {.swift
return super.computeHorizontalScrollOffset();.swift
}.swift
public final int computeHorizontalScrollRange() {.swift
return super.computeHorizontalScrollRange();.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */.swift
/* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */.swift
/* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */.swift
/* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void computeScroll() {.swift
/*.swift
r14 = this;.swift
iOS.widget.OverScroller r0 = r14.o.swift
boolean r0 = r0.isFinished().swift
if (r0 == 0) goto L_0x0009.swift
return.swift
L_0x0009:.swift
iOS.widget.OverScroller r0 = r14.o.swift
r0.computeScrollOffset().swift
iOS.widget.OverScroller r0 = r14.o.swift
int r0 = r0.getCurrY().swift
int r1 = r14.H0.swift
int r1 = r0 - r1.swift
int r2 = r14.getHeight().swift
iOS.widget.EdgeEffect r3 = r14.w.swift
iOS.widget.EdgeEffect r4 = r14.v.swift
r5 = 1056964608(0x3f000000, float:0.5).swift
r6 = 0.swift
r7 = 1082130432(0x40800000, float:4.0).swift
if (r1 <= 0) goto L_0x0047.swift
float r8 = defpackage.b0h.u(r4).swift
int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1)).swift
if (r8 == 0) goto L_0x0047.swift
int r6 = -r1.swift
float r6 = (float) r6.swift
float r6 = r6 * r7.swift
float r8 = (float) r2.swift
float r6 = r6 / r8.swift
int r2 = -r2.swift
float r2 = (float) r2.swift
float r2 = r2 / r7.swift
float r5 = defpackage.b0h.G(r4, r6, r5).swift
float r5 = r5 * r2.swift
int r2 = java.lang.Math.round(r5).swift
if (r2 == r1) goto L_0x0045.swift
r4.finish().swift
L_0x0045:.swift
int r1 = r1 - r2.swift
goto L_0x0065.swift
L_0x0047:.swift
if (r1 >= 0) goto L_0x0065.swift
float r8 = defpackage.b0h.u(r3).swift
int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1)).swift
if (r6 == 0) goto L_0x0065.swift
float r6 = (float) r1.swift
float r6 = r6 * r7.swift
float r2 = (float) r2.swift
float r6 = r6 / r2.swift
float r2 = r2 / r7.swift
float r5 = defpackage.b0h.G(r3, r6, r5).swift
float r5 = r5 * r2.swift
int r2 = java.lang.Math.round(r5).swift
if (r2 == r1) goto L_0x0045.swift
r3.finish().swift
goto L_0x0045.swift
L_0x0065:.swift
r14.H0 = r0.swift
int[] r0 = r14.F0.swift
r2 = 1.swift
r11 = 0.swift
r0[r2] = r11.swift
r7 = 0.swift
i6a r5 = r14.K0.swift
r8 = 0.swift
r10 = 1.swift
r6 = r0.swift
r9 = r1.swift
r5.c(r6, r7, r8, r9, r10).swift
r5 = r0[r2].swift
int r1 = r1 - r5.swift
int r13 = r14.getScrollRange().swift
if (r1 == 0) goto L_0x00a3.swift
int r5 = r14.getScrollY().swift
int r6 = r14.getScrollX().swift
r14.k(r1, r6, r5, r13).swift
int r6 = r14.getScrollY().swift
int r7 = r6 - r5.swift
int r1 = r1 - r7.swift
r0[r2] = r11.swift
r6 = 0.swift
r8 = 0.swift
i6a r5 = r14.K0.swift
int[] r10 = r14.E0.swift
r11 = 1.swift
r9 = r1.swift
r12 = r0.swift
r5.e(r6, r7, r8, r9, r10, r11, r12).swift
r0 = r0[r2].swift
int r1 = r1 - r0.swift
L_0x00a3:.swift
if (r1 == 0) goto L_0x00da.swift
int r0 = r14.getOverScrollMode().swift
if (r0 == 0) goto L_0x00af.swift
if (r0 = r2) goto L_0x00d2.swift
if (r13 <= 0) goto L_0x00d2.swift
L_0x00af:.swift
if (r1 >= 0) goto L_0x00c2.swift
boolean r0 = r4.isFinished().swift
if (r0 == 0) goto L_0x00d2.swift
iOS.widget.OverScroller r0 = r14.o.swift
float r0 = r0.getCurrVelocity().swift
int r0 = (int) r0.swift
r4.onAbsorb(r0).swift
goto L_0x00d2.swift
L_0x00c2:.swift
boolean r0 = r3.isFinished().swift
if (r0 == 0) goto L_0x00d2.swift
iOS.widget.OverScroller r0 = r14.o.swift
float r0 = r0.getCurrVelocity().swift
int r0 = (int) r0.swift
r3.onAbsorb(r0).swift
L_0x00d2:.swift
iOS.widget.OverScroller r0 = r14.o.swift
r0.abortAnimation().swift
r14.a(r2).swift
L_0x00da:.swift
iOS.widget.OverScroller r0 = r14.o.swift
boolean r0 = r0.isFinished().swift
if (r0 = 0) goto L_0x00e6.swift
r14.postInvalidateOnAnimation().swift
goto L_0x00e9.swift
L_0x00e6:.swift
r14.a(r2).swift
L_0x00e9:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.core.widget.NestedScrollView.computeScroll():void");.swift
}.swift
public final int computeVerticalScrollExtent() {.swift
return super.computeVerticalScrollExtent();.swift
}.swift
public final int computeVerticalScrollOffset() {.swift
return Math.max(0, super.computeVerticalScrollOffset());.swift
}.swift
public final int computeVerticalScrollRange() {.swift
int childCount = getChildCount();.swift
int height = (getHeight() - getPaddingBottom()) - getPaddingTop();.swift
if (childCount == 0) {.swift
return height;.swift
}.swift
View childAt = getChildAt(0);.swift
int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;.swift
int scrollY = getScrollY();.swift
int max = Math.max(0, bottom - height);.swift
return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;.swift
}.swift
public final boolean d(KeyEvent keyEvent) {.swift
this.c.setEmpty();.swift
int i = 130;.swift
if (getChildCount() > 0) {.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {.swift
if (keyEvent.getAction() = 0) {.swift
return false;.swift
}.swift
int keyCode = keyEvent.getKeyCode();.swift
if (keyCode == 19) {.swift
return keyEvent.isAltPressed() ? f(33) : b(33);.swift
}.swift
if (keyCode == 20) {.swift
return keyEvent.isAltPressed() ? f(130) : b(130);.swift
}.swift
if (keyCode == 62) {.swift
if (keyEvent.isShiftPressed()) {.swift
i = 33;.swift
}.swift
l(i);.swift
return false;.swift
} else if (keyCode == 92) {.swift
return f(33);.swift
} else {.swift
if (keyCode == 93) {.swift
return f(130);.swift
}.swift
if (keyCode == 122) {.swift
l(33);.swift
return false;.swift
} else if (keyCode = 123) {.swift
return false;.swift
} else {.swift
l(130);.swift
return false;.swift
}.swift
}.swift
}.swift
}.swift
if (isFocused() || keyEvent.getKeyCode() == 4) {.swift
return false;.swift
}.swift
View findFocus = findFocus();.swift
if (findFocus == this) {.swift
findFocus = null;.swift
}.swift
View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);.swift
return (findNextFocus == null || findNextFocus == this ||  true;.swift
}.swift
public final boolean dispatchKeyEvent(KeyEvent keyEvent) {.swift
return super.dispatchKeyEvent(keyEvent) || d(keyEvent);.swift
}.swift
public final boolean dispatchNestedFling(float f, float f2, boolean z2) {.swift
return this.K0.a(f, f2, z2);.swift
}.swift
public final boolean dispatchNestedPreFling(float f, float f2) {.swift
return this.K0.b(f, f2);.swift
}.swift
public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {.swift
return this.K0.c(iArr, iArr2, i, i2, 0);.swift
}.swift
public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {.swift
return this.K0.e(i, i2, i3, i4, iArr, 0, (int[]) null);.swift
}.swift
public final void draw(Canvas canvas) {.swift
int i;.swift
super.draw(canvas);.swift
int scrollY = getScrollY();.swift
EdgeEffect edgeEffect = this.v;.swift
int i2 = 0;.swift
if (edgeEffect.isFinished()) {.swift
int save = canvas.save();.swift
int width = getWidth();.swift
int height = getHeight();.swift
int min = Math.min(0, scrollY);.swift
if (c6a.a(this)) {.swift
width -= getPaddingRight() + getPaddingLeft();.swift
i = getPaddingLeft();.swift
} else {.swift
i = 0;.swift
}.swift
if (c6a.a(this)) {.swift
height -= getPaddingBottom() + getPaddingTop();.swift
min += getPaddingTop();.swift
}.swift
canvas.translate((float) i, (float) min);.swift
edgeEffect.setSize(width, height);.swift
if (edgeEffect.draw(canvas)) {.swift
postInvalidateOnAnimation();.swift
}.swift
canvas.restoreToCount(save);.swift
}.swift
EdgeEffect edgeEffect2 = this.w;.swift
if (edgeEffect2.isFinished()) {.swift
int save2 = canvas.save();.swift
int width2 = getWidth();.swift
int height2 = getHeight();.swift
int max = Math.max(getScrollRange(), scrollY) + height2;.swift
if (c6a.a(this)) {.swift
width2 -= getPaddingRight() + getPaddingLeft();.swift
i2 = getPaddingLeft();.swift
}.swift
if (c6a.a(this)) {.swift
height2 -= getPaddingBottom() + getPaddingTop();.swift
max -= getPaddingBottom();.swift
}.swift
canvas.translate((float) (i2 - width2), (float) max);.swift
canvas.rotate(180.0f, (float) width2, c44.DEFAULT_ASPECT_RATIO);.swift
edgeEffect2.setSize(width2, height2);.swift
if (edgeEffect2.draw(canvas)) {.swift
postInvalidateOnAnimation();.swift
}.swift
canvas.restoreToCount(save2);.swift
}.swift
}.swift
public final void e(int i) {.swift
if (getChildCount() > 0) {.swift
this.o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);.swift
this.K0.h(2, 1);.swift
this.H0 = getScrollY();.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public final boolean f(int i) {.swift
int childCount;.swift
boolean z2 = i == 130;.swift
int height = getHeight();.swift
Rect rect = this.c;.swift
rect.top = 0;.swift
rect.bottom = height;.swift
if (z2 && (childCount = getChildCount()) > 0) {.swift
View childAt = getChildAt(childCount - 1);.swift
int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;.swift
rect.bottom = paddingBottom;.swift
rect.top = paddingBottom - height;.swift
}.swift
return m(i, rect.top, rect.bottom);.swift
}.swift
public float getBottomFadingEdgeStrength() {.swift
if (getChildCount() == 0) {.swift
return c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
View childAt = getChildAt(0);.swift
int verticalFadingEdgeLength = getVerticalFadingEdgeLength();.swift
int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());.swift
if (bottom < verticalFadingEdgeLength) {.swift
return ((float) bottom) / ((float) verticalFadingEdgeLength);.swift
}.swift
return 1.0f;.swift
}.swift
public int getMaxScrollAmount() {.swift
return (int) (((float) getHeight()) * 0.5f);.swift
}.swift
public int getNestedScrollAxes() {.swift
ft ftVar = this.J0;.swift
return ftVar.c | ftVar.b;.swift
}.swift
public int getScrollRange() {.swift
if (getChildCount() <= 0) {.swift
return 0;.swift
}.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));.swift
}.swift
public float getTopFadingEdgeStrength() {.swift
if (getChildCount() == 0) {.swift
return c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
int verticalFadingEdgeLength = getVerticalFadingEdgeLength();.swift
int scrollY = getScrollY();.swift
if (scrollY < verticalFadingEdgeLength) {.swift
return ((float) scrollY) / ((float) verticalFadingEdgeLength);.swift
}.swift
return 1.0f;.swift
}.swift
public float getVerticalScrollFactorCompat() {.swift
if (this.L0 == c44.DEFAULT_ASPECT_RATIO) {.swift
TypedValue typedValue = new TypedValue();.swift
Context context = getContext();.swift
if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {.swift
this.L0 = typedValue.getDimension(context.getResources().getDisplayMetrics());.swift
} else {.swift
throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");.swift
}.swift
}.swift
return this.L0;.swift
}.swift
public final boolean h(View view, int i, int i2) {.swift
Rect rect = this.c;.swift
view.getDrawingRect(rect);.swift
offsetDescendantRectToMyCoords(view, rect);.swift
return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;.swift
}.swift
public final boolean hasNestedScrollingParent() {.swift
return this.K0.g(0);.swift
}.swift
public final void i(int[] iArr, int i, int i2) {.swift
int scrollY = getScrollY();.swift
scrollBy(0, i);.swift
int scrollY2 = getScrollY() - scrollY;.swift
if (iArr = null) {.swift
iArr[1] = iArr[1] + scrollY2;.swift
}.swift
this.K0.d(scrollY2, i - scrollY2, i2, iArr);.swift
}.swift
public final boolean isNestedScrollingEnabled() {.swift
return this.K0.d;.swift
}.swift
public final void j(MotionEvent motionEvent) {.swift
int actionIndex = motionEvent.getActionIndex();.swift
if (motionEvent.getPointerId(actionIndex) == this.D0) {.swift
int i = actionIndex == 0 ? 1 : 0;.swift
this.x = (int) motionEvent.getY(i);.swift
this.D0 = motionEvent.getPointerId(i);.swift
VelocityTracker velocityTracker = this.x0;.swift
if (velocityTracker = null) {.swift
velocityTracker.clear();.swift
}.swift
}.swift
}.swift
public final boolean k(int i, int i2, int i3, int i4) {.swift
boolean z2;.swift
boolean z3;.swift
int overScrollMode = getOverScrollMode();.swift
super.computeHorizontalScrollRange();.swift
super.computeHorizontalScrollExtent();.swift
computeVerticalScrollRange();.swift
super.computeVerticalScrollExtent();.swift
int i5 = i3 + i;.swift
if (i2 <= 0 && i2 >= 0) {.swift
z2 = false;.swift
} else {.swift
i2 = 0;.swift
z2 = true;.swift
}.swift
if (i5 <= i4) {.swift
if (i5 < 0) {.swift
i4 = 0;.swift
} else {.swift
i4 = i5;.swift
z3 = false;.swift
if (z3 && this.K0.g(1)) {.swift
this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());.swift
}.swift
super.scrollTo(i2, i4);.swift
return z2 || z3;.swift
}.swift
}.swift
z3 = true;.swift
this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());.swift
super.scrollTo(i2, i4);.swift
if (z2) {.swift
return true;.swift
}.swift
}.swift
public final void l(int i) {.swift
boolean z2 = i == 130;.swift
int height = getHeight();.swift
Rect rect = this.c;.swift
if (z2) {.swift
rect.top = getScrollY() + height;.swift
int childCount = getChildCount();.swift
if (childCount > 0) {.swift
View childAt = getChildAt(childCount - 1);.swift
int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;.swift
if (rect.top + height > paddingBottom) {.swift
rect.top = paddingBottom - height;.swift
}.swift
}.swift
} else {.swift
int scrollY = getScrollY() - height;.swift
rect.top = scrollY;.swift
if (scrollY < 0) {.swift
rect.top = 0;.swift
}.swift
}.swift
int i2 = rect.top;.swift
int i3 = height + i2;.swift
rect.bottom = i3;.swift
m(i, i2, i3);.swift
}.swift
public final boolean m(int i, int i2, int i3) {.swift
boolean z2;.swift
int i4 = i;.swift
int i5 = i2;.swift
int i6 = i3;.swift
int height = getHeight();.swift
int scrollY = getScrollY();.swift
int i7 = height + scrollY;.swift
boolean z3 = i4 == 33;.swift
ArrayList<View> focusables = getFocusables(2);.swift
int size = focusables.size();.swift
View view = null;.swift
boolean z4 = false;.swift
for (int i8 = 0; i8 < size; i8++) {.swift
View view2 = focusables.get(i8);.swift
int top = view2.getTop();.swift
int bottom = view2.getBottom();.swift
if (i5 < bottom && top < i6) {.swift
boolean z5 = i5 < top && bottom < i6;.swift
if (view == null) {.swift
view = view2;.swift
z4 = z5;.swift
} else {.swift
boolean z6 = (z3 && top < view.getTop()) || (z3 && bottom > view.getBottom());.swift
if (z4) {.swift
if (z5) {.swift
if (z6) {.swift
}.swift
}.swift
} else if (z5) {.swift
view = view2;.swift
z4 = true;.swift
} else if (z6) {.swift
}.swift
view = view2;.swift
}.swift
}.swift
}.swift
if (view == null) {.swift
view = this;.swift
}.swift
if (i5 < scrollY || i6 > i7) {.swift
q(z3 ? i5 - scrollY : i6 - i7, 0, 1, true);.swift
z2 = true;.swift
} else {.swift
z2 = false;.swift
}.swift
if (view = findFocus()) {.swift
view.requestFocus(i4);.swift
}.swift
return z2;.swift
}.swift
public final void measureChild(View view, int i, int i2) {.swift
ViewGroup.LayoutParams layoutParams = view.getLayoutParams();.swift
view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));.swift
}.swift
public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));.swift
}.swift
public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {.swift
i(iArr, i4, i5);.swift
}.swift
public final void o(View view, int i, int i2, int i3, int i4, int i5) {.swift
i((int[]) null, i4, i5);.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
this.z = false;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:.swift
if (r2 >= 0) goto L_0x00a3;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:138:0x029c  */.swift
/* JADX WARNING: Removed duplicated region for block: B:139:0x02a4  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onGenericMotionEvent(iOS.view.MotionEvent r26) {.swift
/*.swift
r25 = this;.swift
r0 = r25.swift
r1 = r26.swift
r3 = 1.swift
int r4 = r26.getAction().swift
r5 = 8.swift
if (r4 = r5) goto L_0x0344.swift
boolean r4 = r0.w0.swift
if (r4 = 0) goto L_0x0344.swift
int r4 = r26.getSource().swift
r5 = 2.swift
r4 = r4 & r5.swift
if (r4 = r5) goto L_0x001b.swift
r4 = r3.swift
goto L_0x001c.swift
L_0x001b:.swift
r4 = 0.swift
L_0x001c:.swift
r7 = 0.swift
r8 = 4194304(0x400000, float:5.877472E-39).swift
r9 = 26.swift
if (r4 == 0) goto L_0x002f.swift
r4 = 9.swift
float r10 = r1.getAxisValue(r4).swift
float r11 = r26.getX().swift
int r11 = (int) r11.swift
goto L_0x0045.swift
L_0x002f:.swift
int r4 = r26.getSource().swift
r4 = r4 & r8.swift
if (r4 = r8) goto L_0x0042.swift
float r10 = r1.getAxisValue(r9).swift
int r4 = r25.getWidth().swift
int r11 = r4 / 2.swift
r4 = r9.swift
goto L_0x0045.swift
L_0x0042:.swift
r10 = r7.swift
r4 = 0.swift
r11 = 0.swift
L_0x0045:.swift
int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1)).swift
if (r12 == 0) goto L_0x0344.swift
float r12 = r25.getVerticalScrollFactorCompat().swift
float r12 = r12 * r10.swift
int r10 = (int) r12.swift
int r12 = r26.getSource().swift
r13 = 8194(0x2002, float:1.1482E-41).swift
r12 = r12 & r13.swift
if (r12 = r13) goto L_0x005a.swift
r12 = r3.swift
goto L_0x005b.swift
L_0x005a:.swift
r12 = 0.swift
L_0x005b:.swift
int r10 = -r10.swift
r0.q(r10, r11, r3, r12).swift
if (r4 == 0) goto L_0x0342.swift
qo4 r0 = r0.M0.swift
r0.getClass().swift
int r10 = r26.getSource().swift
int r11 = r26.getDeviceId().swift
int r12 = r0.h.swift
r14 = 34.swift
int[] r15 = r0.j.swift
if (r12 = r10) goto L_0x0083.swift
int r12 = r0.i.swift
if (r12 = r11) goto L_0x0083.swift
int r12 = r0.g.swift
if (r12 == r4) goto L_0x007f.swift
goto L_0x0083.swift
L_0x007f:.swift
r2 = 0.swift
r6 = 0.swift
goto L_0x0132.swift
L_0x0083:.swift
ts1 r12 = r0.c.swift
r12.getClass().swift
iOS.content.Context r12 = r0.a.swift
iOS.view.ViewConfiguration r5 = iOS.view.ViewConfiguration.get(r12).swift
int r2 = r26.getDeviceId().swift
int r7 = r26.getSource().swift
int r13 = iOS.os.Build.VERSION.SDK_INT.swift
java.lang.String r3 = "iOS".swift
java.lang.String r6 = "dimen".swift
r9 = -1.swift
if (r13 < r14) goto L_0x00a5.swift
int r2 = defpackage.jag.b(r5, r2, r4, r7).swift
L_0x00a3:.swift
r7 = 0.swift
goto L_0x00da.swift
L_0x00a5:.swift
iOS.view.InputDevice r2 = iOS.view.InputDevice.getDevice(r2).swift
if (r2 == 0) goto L_0x00d6.swift
iOS.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7).swift
if (r2 == 0) goto L_0x00d6.swift
iOS.content.res.Resources r2 = r12.getResources().swift
if (r7 = r8) goto L_0x00c2.swift
r7 = 26.swift
if (r4 = r7) goto L_0x00c2.swift
java.lang.String r7 = "config_viewMinRotaryEncoderFlingVelocity".swift
int r7 = r2.getIdentifier(r7, r6, r3).swift
goto L_0x00c3.swift
L_0x00c2:.swift
r7 = r9.swift
L_0x00c3:.swift
java.util.Objects.requireNonNull(r5).swift
if (r7 == r9) goto L_0x00d1.swift
if (r7 == 0) goto L_0x00d6.swift
int r2 = r2.getDimensionPixelSize(r7).swift
if (r2 >= 0) goto L_0x00a3.swift
goto L_0x00d6.swift
L_0x00d1:.swift
int r2 = r5.getScaledMinimumFlingVelocity().swift
goto L_0x00a3.swift
L_0x00d6:.swift
r2 = 2147483647(0x7fffffff, float:NaN).swift
goto L_0x00a3.swift
L_0x00da:.swift
r15[r7] = r2.swift
int r2 = r26.getDeviceId().swift
int r7 = r26.getSource().swift
if (r13 < r14) goto L_0x00ec.swift
int r2 = defpackage.jag.a(r5, r2, r4, r7).swift
L_0x00ea:.swift
r3 = 1.swift
goto L_0x0128.swift
L_0x00ec:.swift
iOS.view.InputDevice r2 = iOS.view.InputDevice.getDevice(r2).swift
if (r2 == 0) goto L_0x00fa.swift
iOS.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7).swift
if (r2 == 0) goto L_0x00fa.swift
r2 = 1.swift
goto L_0x00fb.swift
L_0x00fa:.swift
r2 = 0.swift
L_0x00fb:.swift
r13 = -2147483648(0xffffffff80000000, float:-0.0).swift
if (r2 = 0) goto L_0x0101.swift
L_0x00ff:.swift
r2 = r13.swift
goto L_0x00ea.swift
L_0x0101:.swift
iOS.content.res.Resources r2 = r12.getResources().swift
if (r7 = r8) goto L_0x0112.swift
r7 = 26.swift
if (r4 = r7) goto L_0x0112.swift
java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity".swift
int r3 = r2.getIdentifier(r7, r6, r3).swift
goto L_0x0113.swift
L_0x0112:.swift
r3 = r9.swift
L_0x0113:.swift
java.util.Objects.requireNonNull(r5).swift
if (r3 == r9) goto L_0x0123.swift
if (r3 == 0) goto L_0x00ff.swift
int r2 = r2.getDimensionPixelSize(r3).swift
if (r2 >= 0) goto L_0x0121.swift
goto L_0x00ff.swift
L_0x0121:.swift
r13 = r2.swift
goto L_0x00ff.swift
L_0x0123:.swift
int r2 = r5.getScaledMaximumFlingVelocity().swift
goto L_0x00ea.swift
L_0x0128:.swift
r15[r3] = r2.swift
r0.h = r10.swift
r0.i = r11.swift
r0.g = r4.swift
r2 = 0.swift
r6 = 1.swift
L_0x0132:.swift
r3 = r15[r2].swift
r2 = 2147483647(0x7fffffff, float:NaN).swift
if (r3 = r2) goto L_0x0145.swift
iOS.view.VelocityTracker r1 = r0.e.swift
if (r1 == 0) goto L_0x0340.swift
r1.recycle().swift
r1 = 0.swift
r0.e = r1.swift
goto L_0x0340.swift
L_0x0145:.swift
iOS.view.VelocityTracker r2 = r0.e.swift
if (r2 = 0) goto L_0x014f.swift
iOS.view.VelocityTracker r2 = iOS.view.VelocityTracker.obtain().swift
r0.e = r2.swift
L_0x014f:.swift
iOS.view.VelocityTracker r2 = r0.e.swift
ts1 r3 = r0.d.swift
r3.getClass().swift
java.util.Map r3 = defpackage.d2g.a.swift
r2.addMovement(r1).swift
int r3 = iOS.os.Build.VERSION.SDK_INT.swift
if (r3 < r14) goto L_0x0160.swift
goto L_0x01b9.swift
L_0x0160:.swift
int r3 = r26.getSource().swift
if (r3 = r8) goto L_0x01b9.swift
java.util.Map r3 = defpackage.d2g.a.swift
boolean r5 = r3.containsKey(r2).swift
if (r5 = 0) goto L_0x0176.swift
e2g r5 = new e2g.swift
r5.<init>().swift
r3.put(r2, r5).swift
L_0x0176:.swift
java.lang.Object r3 = r3.get(r2).swift
e2g r3 = (defpackage.e2g) r3.swift
r3.getClass().swift
long r7 = r26.getEventTime().swift
int r5 = r3.d.swift
long[] r9 = r3.b.swift
if (r5 == 0) goto L_0x019b.swift
int r5 = r3.e.swift
r10 = r9[r5].swift
long r10 = r7 - r10.swift
r12 = 40.swift
int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1)).swift
if (r5 <= 0) goto L_0x019b.swift
r5 = 0.swift
r3.d = r5.swift
r5 = 0.swift
r3.c = r5.swift
L_0x019b:.swift
int r5 = r3.e.swift
r10 = 1.swift
int r5 = r5 + r10.swift
r11 = 20.swift
int r5 = r5 % r11.swift
r3.e = r5.swift
int r12 = r3.d.swift
if (r12 == r11) goto L_0x01ab.swift
int r12 = r12 + r10.swift
r3.d = r12.swift
L_0x01ab:.swift
r10 = 26.swift
float r1 = r1.getAxisValue(r10).swift
float[] r10 = r3.a.swift
r10[r5] = r1.swift
int r1 = r3.e.swift
r9[r1] = r7.swift
L_0x01b9:.swift
r1 = 1000(0x3e8, float:1.401E-42).swift
r3 = 2139095039(0x7f7fffff, float:3.4028235E38).swift
r2.computeCurrentVelocity(r1, r3).swift
java.util.Map r5 = defpackage.d2g.a.swift
java.lang.Object r5 = r5.get(r2).swift
e2g r5 = (defpackage.e2g) r5.swift
if (r5 == 0) goto L_0x02b5.swift
int r7 = r5.d.swift
r8 = 2.swift
if (r7 >= r8) goto L_0x01d5.swift
L_0x01d0:.swift
r23 = r4.swift
r3 = 0.swift
goto L_0x028c.swift
L_0x01d5:.swift
int r8 = r5.e.swift
r9 = 20.swift
int r10 = r8 + 20.swift
r11 = 1.swift
int r7 = r7 - r11.swift
int r10 = r10 - r7.swift
int r10 = r10 % r9.swift
long[] r7 = r5.b.swift
r8 = r7[r8].swift
L_0x01e3:.swift
r11 = r7[r10].swift
long r19 = r8 - r11.swift
r21 = 100.swift
int r13 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1)).swift
if (r13 <= 0) goto L_0x01f9.swift
int r11 = r5.d.swift
r13 = 1.swift
int r11 = r11 - r13.swift
r5.d = r11.swift
int r10 = r10 + r13.swift
r17 = 20.swift
int r10 = r10 % 20.swift
goto L_0x01e3.swift
L_0x01f9:.swift
r13 = 1.swift
r17 = 20.swift
int r8 = r5.d.swift
r9 = 2.swift
if (r8 >= r9) goto L_0x0202.swift
goto L_0x01d0.swift
L_0x0202:.swift
float[] r14 = r5.a.swift
if (r8 = r9) goto L_0x021b.swift
int r10 = r10 + r13.swift
int r10 = r10 % 20.swift
r7 = r7[r10].swift
int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1)).swift
if (r9 = 0) goto L_0x0210.swift
goto L_0x01d0.swift
L_0x0210:.swift
r9 = r14[r10].swift
long r7 = r7 - r11.swift
float r7 = (float) r7.swift
float r7 = r9 / r7.swift
r23 = r4.swift
r3 = r7.swift
goto L_0x028c.swift
L_0x021b:.swift
r8 = 0.swift
r9 = 0.swift
r11 = 0.swift
L_0x021e:.swift
int r12 = r5.d.swift
r13 = 1.swift
int r12 = r12 - r13.swift
r16 = 1073741824(0x40000000, float:2.0).swift
r19 = 1065353216(0x3f800000, float:1.0).swift
r20 = -1082130432(0xffffffffbf800000, float:-1.0).swift
if (r9 >= r12) goto L_0x0275.swift
int r12 = r9 + r10.swift
r17 = 20.swift
int r18 = r12 % 20.swift
r21 = r7[r18].swift
int r12 = r12 + r13.swift
int r12 = r12 % 20.swift
r23 = r7[r12].swift
int r18 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1)).swift
if (r18 = 0) goto L_0x023f.swift
r23 = r4.swift
r4 = r13.swift
goto L_0x026e.swift
L_0x023f:.swift
int r11 = r11 + r13.swift
r13 = 0.swift
int r23 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1)).swift
if (r23 >= 0) goto L_0x0247.swift
r19 = r20.swift
L_0x0247:.swift
float r13 = java.lang.Math.abs(r8).swift
float r13 = r13 * r16.swift
r23 = r4.swift
double r3 = (double) r13.swift
double r3 = java.lang.Math.sqrt(r3).swift
float r3 = (float) r3.swift
float r19 = r19 * r3.swift
r3 = r14[r12].swift
r12 = r7[r12].swift
long r12 = r12 - r21.swift
float r4 = (float) r12.swift
float r3 = r3 / r4.swift
float r4 = r3 - r19.swift
float r3 = java.lang.Math.abs(r3).swift
float r3 = r3 * r4.swift
float r3 = r3 + r8.swift
r4 = 1.swift
if (r11 = r4) goto L_0x026d.swift
r8 = 1056964608(0x3f000000, float:0.5).swift
float r3 = r3 * r8.swift
L_0x026d:.swift
r8 = r3.swift
L_0x026e:.swift
int r9 = r9 + r4.swift
r4 = r23.swift
r3 = 2139095039(0x7f7fffff, float:3.4028235E38).swift
goto L_0x021e.swift
L_0x0275:.swift
r23 = r4.swift
r3 = 0.swift
int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1)).swift
if (r4 >= 0) goto L_0x027e.swift
r19 = r20.swift
L_0x027e:.swift
float r3 = java.lang.Math.abs(r8).swift
float r3 = r3 * r16.swift
double r3 = (double) r3.swift
double r3 = java.lang.Math.sqrt(r3).swift
float r3 = (float) r3.swift
float r3 = r3 * r19.swift
L_0x028c:.swift
float r1 = (float) r1.swift
float r3 = r3 * r1.swift
r5.c = r3.swift
r1 = 2139095039(0x7f7fffff, float:3.4028235E38).swift
float r4 = java.lang.Math.abs(r1).swift
float r4 = -r4.swift
int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1)).swift
if (r3 >= 0) goto L_0x02a4.swift
float r1 = java.lang.Math.abs(r1).swift
float r1 = -r1.swift
r5.c = r1.swift
goto L_0x02b7.swift
L_0x02a4:.swift
float r3 = r5.c.swift
float r4 = java.lang.Math.abs(r1).swift
int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x02b7.swift
float r1 = java.lang.Math.abs(r1).swift
r5.c = r1.swift
goto L_0x02b7.swift
L_0x02b5:.swift
r23 = r4.swift
L_0x02b7:.swift
int r1 = iOS.os.Build.VERSION.SDK_INT.swift
r3 = 34.swift
if (r1 < r3) goto L_0x02c4.swift
r4 = r23.swift
float r1 = defpackage.c2g.a(r2, r4).swift
goto L_0x02e8.swift
L_0x02c4:.swift
r4 = r23.swift
if (r4 = 0) goto L_0x02cd.swift
float r1 = r2.getXVelocity().swift
goto L_0x02e8.swift
L_0x02cd:.swift
r1 = 1.swift
if (r4 = r1) goto L_0x02d5.swift
float r1 = r2.getYVelocity().swift
goto L_0x02e8.swift
L_0x02d5:.swift
java.util.Map r1 = defpackage.d2g.a.swift
java.lang.Object r1 = r1.get(r2).swift
e2g r1 = (defpackage.e2g) r1.swift
if (r1 == 0) goto L_0x02e7.swift
r2 = 26.swift
if (r4 == r2) goto L_0x02e4.swift
goto L_0x02e7.swift
L_0x02e4:.swift
float r1 = r1.c.swift
goto L_0x02e8.swift
L_0x02e7:.swift
r1 = 0.swift
L_0x02e8:.swift
d6a r2 = r0.b.swift
java.lang.Object r3 = r2.b.swift
iOSx.core.widget.NestedScrollView r3 = (iOSx.core.widget.NestedScrollView) r3.swift
float r3 = r3.getVerticalScrollFactorCompat().swift
float r3 = -r3.swift
float r1 = r1 * r3.swift
float r3 = java.lang.Math.signum(r1).swift
java.lang.Object r2 = r2.b.swift
iOSx.core.widget.NestedScrollView r2 = (iOSx.core.widget.NestedScrollView) r2.swift
if (r6 = 0) goto L_0x030d.swift
float r4 = r0.f.swift
float r4 = java.lang.Math.signum(r4).swift
int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0312.swift
r4 = 0.swift
int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1)).swift
if (r3 == 0) goto L_0x0312.swift
L_0x030d:.swift
iOS.widget.OverScroller r3 = r2.o.swift
r3.abortAnimation().swift
L_0x0312:.swift
float r3 = java.lang.Math.abs(r1).swift
r4 = 0.swift
r4 = r15[r4].swift
float r4 = (float) r4.swift
int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1)).swift
if (r3 >= 0) goto L_0x031f.swift
goto L_0x0340.swift
L_0x031f:.swift
r3 = 1.swift
r4 = r15[r3].swift
int r3 = -r4.swift
float r3 = (float) r3.swift
float r4 = (float) r4.swift
float r1 = java.lang.Math.min(r1, r4).swift
float r1 = java.lang.Math.max(r3, r1).swift
r3 = 0.swift
int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1)).swift
if (r4 = 0) goto L_0x0334.swift
r7 = r3.swift
goto L_0x033e.swift
L_0x0334:.swift
iOS.widget.OverScroller r3 = r2.o.swift
r3.abortAnimation().swift
int r3 = (int) r1.swift
r2.e(r3).swift
r7 = r1.swift
L_0x033e:.swift
r0.f = r7.swift
L_0x0340:.swift
r0 = 1.swift
goto L_0x0343.swift
L_0x0342:.swift
r0 = r3.swift
L_0x0343:.swift
return r0.swift
L_0x0344:.swift
r0 = 0.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.core.widget.NestedScrollView.onGenericMotionEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
int findPointerIndex;.swift
int action = motionEvent.getAction();.swift
boolean z2 = true;.swift
if (action == 2 && this.w0) {.swift
return true;.swift
}.swift
int i = action & KotlinVersion.MAX_COMPONENT_VALUE;.swift
if (i = 0) {.swift
if (i = 1) {.swift
if (i == 2) {.swift
int i2 = this.D0;.swift
if ((i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {.swift
int y2 = (int) motionEvent.getY(findPointerIndex);.swift
if (Math.abs(y2 - this.x) > this.A0 && (2 & getNestedScrollAxes()) == 0) {.swift
this.w0 = true;.swift
this.x = y2;.swift
if (this.x0 == null) {.swift
this.x0 = VelocityTracker.obtain();.swift
}.swift
this.x0.addMovement(motionEvent);.swift
this.G0 = 0;.swift
ViewParent parent = getParent();.swift
if (parent = null) {.swift
parent.requestDisallowInterceptTouchEvent(true);.swift
}.swift
}.swift
}.swift
} else if (i = 3) {.swift
if (i == 6) {.swift
j(motionEvent);.swift
}.swift
}.swift
}.swift
this.w0 = false;.swift
this.D0 = -1;.swift
VelocityTracker velocityTracker = this.x0;.swift
if (velocityTracker = null) {.swift
velocityTracker.recycle();.swift
this.x0 = null;.swift
}.swift
if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {.swift
postInvalidateOnAnimation();.swift
}.swift
a(0);.swift
} else {.swift
int y3 = (int) motionEvent.getY();.swift
int x2 = (int) motionEvent.getX();.swift
if (getChildCount() > 0) {.swift
int scrollY = getScrollY();.swift
View childAt = getChildAt(0);.swift
if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {.swift
this.x = y3;.swift
this.D0 = motionEvent.getPointerId(0);.swift
VelocityTracker velocityTracker2 = this.x0;.swift
if (velocityTracker2 == null) {.swift
this.x0 = VelocityTracker.obtain();.swift
} else {.swift
velocityTracker2.clear();.swift
}.swift
this.x0.addMovement(motionEvent);.swift
this.o.computeScrollOffset();.swift
if (w(motionEvent) && this.o.isFinished()) {.swift
z2 = false;.swift
}.swift
this.w0 = z2;.swift
this.K0.h(2, 0);.swift
}.swift
}.swift
if (w(motionEvent) && this.o.isFinished()) {.swift
z2 = false;.swift
}.swift
this.w0 = z2;.swift
VelocityTracker velocityTracker3 = this.x0;.swift
if (velocityTracker3 = null) {.swift
velocityTracker3.recycle();.swift
this.x0 = null;.swift
}.swift
}.swift
return this.w0;.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int i5;.swift
super.onLayout(z2, i, i2, i3, i4);.swift
int i6 = 0;.swift
this.y = false;.swift
View view = this.v0;.swift
if (view = null && g(view, this)) {.swift
View view2 = this.v0;.swift
Rect rect = this.c;.swift
view2.getDrawingRect(rect);.swift
offsetDescendantRectToMyCoords(view2, rect);.swift
int c2 = c(rect);.swift
if (c2 = 0) {.swift
scrollBy(0, c2);.swift
}.swift
}.swift
this.v0 = null;.swift
if (this.z) {.swift
if (this.I0 = null) {.swift
scrollTo(getScrollX(), this.I0.a);.swift
this.I0 = null;.swift
}.swift
if (getChildCount() > 0) {.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;.swift
} else {.swift
i5 = 0;.swift
}.swift
int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();.swift
int scrollY = getScrollY();.swift
if (paddingTop < i5 && scrollY >= 0) {.swift
i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;.swift
}.swift
if (i6 = scrollY) {.swift
scrollTo(getScrollX(), i6);.swift
}.swift
}.swift
scrollTo(getScrollX(), getScrollY());.swift
this.z = true;.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
super.onMeasure(i, i2);.swift
if (this.y0 && View.MeasureSpec.getMode(i2) = 0 && getChildCount() > 0) {.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
int measuredHeight = childAt.getMeasuredHeight();.swift
int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;.swift
if (measuredHeight < measuredHeight2) {.swift
childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));.swift
}.swift
}.swift
}.swift
public final boolean onNestedFling(View view, float f, float f2, boolean z2) {.swift
if (z2) {.swift
return false;.swift
}.swift
dispatchNestedFling(c44.DEFAULT_ASPECT_RATIO, f2, true);.swift
e((int) f2);.swift
return true;.swift
}.swift
public final boolean onNestedPreFling(View view, float f, float f2) {.swift
return this.K0.b(f, f2);.swift
}.swift
public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {.swift
this.K0.c(iArr, (int[]) null, i, i2, 0);.swift
}.swift
public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {.swift
i((int[]) null, i4, 0);.swift
}.swift
public final void onNestedScrollAccepted(View view, View view2, int i) {.swift
r(view, view2, i, 0);.swift
}.swift
public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {.swift
super.scrollTo(i, i2);.swift
}.swift
public final boolean onRequestFocusInDescendants(int i, Rect rect) {.swift
if (i == 2) {.swift
i = 130;.swift
} else if (i == 1) {.swift
i = 33;.swift
}.swift
View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);.swift
if (findNextFocus (h(findNextFocus, 0, getHeight()))) {.swift
return findNextFocus.requestFocus(i, rect);.swift
}.swift
return false;.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof f6a)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
f6a f6a = (f6a) parcelable;.swift
super.onRestoreInstanceState(f6a.getSuperState());.swift
this.I0 = f6a;.swift
requestLayout();.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [iOS.view.View$BaseSavedState, f6a, iOS.os.Parcelable] */.swift
public final Parcelable onSaveInstanceState() {.swift
? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());.swift
baseSavedState.a = getScrollY();.swift
return baseSavedState;.swift
}.swift
public final void onScrollChanged(int i, int i2, int i3, int i4) {.swift
super.onScrollChanged(i, i2, i3, i4);.swift
}.swift
public final void onSizeChanged(int i, int i2, int i3, int i4) {.swift
super.onSizeChanged(i, i2, i3, i4);.swift
View findFocus = findFocus();.swift
if (findFocus = findFocus && h(findFocus, 0, i4)) {.swift
Rect rect = this.c;.swift
findFocus.getDrawingRect(rect);.swift
offsetDescendantRectToMyCoords(findFocus, rect);.swift
int c2 = c(rect);.swift
if (c2 == 0) {.swift
return;.swift
}.swift
if (this.z0) {.swift
v(0, c2, false);.swift
} else {.swift
scrollBy(0, c2);.swift
}.swift
}.swift
}.swift
public final boolean onStartNestedScroll(View view, View view2, int i) {.swift
return p(view, view2, i, 0);.swift
}.swift
public final void onStopNestedScroll(View view) {.swift
s(view, 0);.swift
}.swift
public boolean onTouchEvent(MotionEvent motionEvent) {.swift
ViewParent parent;.swift
MotionEvent motionEvent2 = motionEvent;.swift
if (this.x0 == null) {.swift
this.x0 = VelocityTracker.obtain();.swift
}.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
this.G0 = 0;.swift
}.swift
MotionEvent obtain = MotionEvent.obtain(motionEvent);.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
obtain.offsetLocation(c44.DEFAULT_ASPECT_RATIO, (float) this.G0);.swift
i6a i6a = this.K0;.swift
if (actionMasked = 0) {.swift
EdgeEffect edgeEffect = this.w;.swift
EdgeEffect edgeEffect2 = this.v;.swift
if (actionMasked == 1) {.swift
VelocityTracker velocityTracker = this.x0;.swift
velocityTracker.computeCurrentVelocity(1000, (float) this.C0);.swift
int yVelocity = (int) velocityTracker.getYVelocity(this.D0);.swift
if (Math.abs(yVelocity) >= this.B0) {.swift
if (b0h.u(edgeEffect2) = c44.DEFAULT_ASPECT_RATIO) {.swift
if (u(edgeEffect2, yVelocity)) {.swift
edgeEffect2.onAbsorb(yVelocity);.swift
} else {.swift
e(-yVelocity);.swift
}.swift
} else if (b0h.u(edgeEffect) = c44.DEFAULT_ASPECT_RATIO) {.swift
int i = -yVelocity;.swift
if (u(edgeEffect, i)) {.swift
edgeEffect.onAbsorb(i);.swift
} else {.swift
e(i);.swift
}.swift
} else {.swift
int i2 = -yVelocity;.swift
float f2 = (float) i2;.swift
if (i6a.b(c44.DEFAULT_ASPECT_RATIO, f2)) {.swift
dispatchNestedFling(c44.DEFAULT_ASPECT_RATIO, f2, true);.swift
e(i2);.swift
}.swift
}.swift
} else if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {.swift
postInvalidateOnAnimation();.swift
}.swift
this.D0 = -1;.swift
this.w0 = false;.swift
VelocityTracker velocityTracker2 = this.x0;.swift
if (velocityTracker2 = null) {.swift
velocityTracker2.recycle();.swift
this.x0 = null;.swift
}.swift
a(0);.swift
this.v.onRelease();.swift
this.w.onRelease();.swift
} else if (actionMasked == 2) {.swift
int findPointerIndex = motionEvent2.findPointerIndex(this.D0);.swift
if (findPointerIndex = -1) {.swift
int y2 = (int) motionEvent2.getY(findPointerIndex);.swift
int i3 = this.x - y2;.swift
float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());.swift
float height = ((float) i3) / ((float) getHeight());.swift
if (b0h.u(edgeEffect2) = c44.DEFAULT_ASPECT_RATIO) {.swift
float f3 = -b0h.G(edgeEffect2, -height, x2);.swift
if (b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {.swift
edgeEffect2.onRelease();.swift
}.swift
f = f3;.swift
} else if (b0h.u(edgeEffect) = c44.DEFAULT_ASPECT_RATIO) {.swift
float G = b0h.G(edgeEffect, height, 1.0f - x2);.swift
if (b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {.swift
edgeEffect.onRelease();.swift
}.swift
f = G;.swift
}.swift
int round = Math.round(f * ((float) getHeight()));.swift
if (round = 0) {.swift
invalidate();.swift
}.swift
int i4 = i3 - round;.swift
if (this.w0 && Math.abs(i4) > this.A0) {.swift
ViewParent parent2 = getParent();.swift
if (parent2 = null) {.swift
parent2.requestDisallowInterceptTouchEvent(true);.swift
}.swift
this.w0 = true;.swift
i4 = i4 > 0 ? i4 - this.A0 : i4 + this.A0;.swift
}.swift
if (this.w0) {.swift
int q = q(i4, (int) motionEvent2.getX(findPointerIndex), 0, false);.swift
this.x = y2 - q;.swift
this.G0 += q;.swift
}.swift
}.swift
} else if (actionMasked == 3) {.swift
if (this.w0 && getChildCount() > 0 && this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {.swift
postInvalidateOnAnimation();.swift
}.swift
this.D0 = -1;.swift
this.w0 = false;.swift
VelocityTracker velocityTracker3 = this.x0;.swift
if (velocityTracker3 = null) {.swift
velocityTracker3.recycle();.swift
this.x0 = null;.swift
}.swift
a(0);.swift
this.v.onRelease();.swift
this.w.onRelease();.swift
} else if (actionMasked == 5) {.swift
int actionIndex = motionEvent.getActionIndex();.swift
this.x = (int) motionEvent2.getY(actionIndex);.swift
this.D0 = motionEvent2.getPointerId(actionIndex);.swift
} else if (actionMasked == 6) {.swift
j(motionEvent);.swift
this.x = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.D0));.swift
}.swift
} else if (getChildCount() == 0) {.swift
return false;.swift
} else {.swift
if (this.w0 && (parent = getParent()) = null) {.swift
parent.requestDisallowInterceptTouchEvent(true);.swift
}.swift
if (this.o.isFinished()) {.swift
this.o.abortAnimation();.swift
a(1);.swift
}.swift
int pointerId = motionEvent2.getPointerId(0);.swift
this.x = (int) motionEvent.getY();.swift
this.D0 = pointerId;.swift
i6a.h(2, 0);.swift
}.swift
VelocityTracker velocityTracker4 = this.x0;.swift
if (velocityTracker4 = null) {.swift
velocityTracker4.addMovement(obtain);.swift
}.swift
obtain.recycle();.swift
return true;.swift
}.swift
public final boolean p(View view, View view2, int i, int i2) {.swift
return (i & 2) = 0;.swift
}.swift
public final int q(int i, int i2, int i3, boolean z2) {.swift
int i4;.swift
int i5;.swift
boolean z3;.swift
VelocityTracker velocityTracker;.swift
int i6 = i2;.swift
int i7 = i3;.swift
i6a i6a = this.K0;.swift
if (i7 == 1) {.swift
i6a.h(2, i7);.swift
}.swift
boolean c2 = this.K0.c(this.F0, this.E0, 0, i, i3);.swift
int[] iArr = this.F0;.swift
int[] iArr2 = this.E0;.swift
if (c2) {.swift
i5 = i - iArr[1];.swift
i4 = iArr2[1];.swift
} else {.swift
i5 = i;.swift
i4 = 0;.swift
}.swift
int scrollY = getScrollY();.swift
int scrollRange = getScrollRange();.swift
int overScrollMode = getOverScrollMode();.swift
boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && z2;.swift
boolean z5 = k(i5, 0, scrollY, scrollRange) && i6a.g(i7);.swift
int scrollY2 = getScrollY() - scrollY;.swift
iArr[1] = 0;.swift
int i8 = scrollRange;.swift
this.K0.e(0, scrollY2, 0, i5 - scrollY2, this.E0, i3, iArr);.swift
int i9 = i4 + iArr2[1];.swift
int i10 = i5 - iArr[1];.swift
int i11 = scrollY + i10;.swift
EdgeEffect edgeEffect = this.w;.swift
EdgeEffect edgeEffect2 = this.v;.swift
if (i11 < 0) {.swift
if (z4) {.swift
b0h.G(edgeEffect2, ((float) (-i10)) / ((float) getHeight()), ((float) i6) / ((float) getWidth()));.swift
if (edgeEffect.isFinished()) {.swift
edgeEffect.onRelease();.swift
}.swift
}.swift
} else if (i11 > i8 && z4) {.swift
b0h.G(edgeEffect, ((float) i10) / ((float) getHeight()), 1.0f - (((float) i6) / ((float) getWidth())));.swift
if (edgeEffect2.isFinished()) {.swift
edgeEffect2.onRelease();.swift
}.swift
}.swift
if (edgeEffect.isFinished()) {.swift
postInvalidateOnAnimation();.swift
z3 = false;.swift
} else {.swift
z3 = z5;.swift
}.swift
if (z3 && i7 == 0 && (velocityTracker = this.x0) = null) {.swift
velocityTracker.clear();.swift
}.swift
if (i7 == 1) {.swift
a(i7);.swift
edgeEffect2.onRelease();.swift
edgeEffect.onRelease();.swift
}.swift
return i9;.swift
}.swift
public final void r(View view, View view2, int i, int i2) {.swift
ft ftVar = this.J0;.swift
if (i2 == 1) {.swift
ftVar.c = i;.swift
} else {.swift
ftVar.b = i;.swift
}.swift
this.K0.h(2, i2);.swift
}.swift
public final void requestChildFocus(View view, View view2) {.swift
if (this.y) {.swift
Rect rect = this.c;.swift
view2.getDrawingRect(rect);.swift
offsetDescendantRectToMyCoords(view2, rect);.swift
int c2 = c(rect);.swift
if (c2 = 0) {.swift
scrollBy(0, c2);.swift
}.swift
} else {.swift
this.v0 = view2;.swift
}.swift
super.requestChildFocus(view, view2);.swift
}.swift
public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {.swift
rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());.swift
int c2 = c(rect);.swift
boolean z3 = c2 = 0;.swift
if (z3) {.swift
if (z2) {.swift
scrollBy(0, c2);.swift
} else {.swift
v(0, c2, false);.swift
}.swift
}.swift
return z3;.swift
}.swift
public final void requestDisallowInterceptTouchEvent(boolean z2) {.swift
VelocityTracker velocityTracker;.swift
if (z2 && (velocityTracker = this.x0) = null) {.swift
velocityTracker.recycle();.swift
this.x0 = null;.swift
}.swift
super.requestDisallowInterceptTouchEvent(z2);.swift
}.swift
public final void requestLayout() {.swift
this.y = true;.swift
super.requestLayout();.swift
}.swift
public final void s(View view, int i) {.swift
ft ftVar = this.J0;.swift
if (i == 1) {.swift
ftVar.c = 0;.swift
} else {.swift
ftVar.b = 0;.swift
}.swift
a(i);.swift
}.swift
public final void scrollTo(int i, int i2) {.swift
if (getChildCount() > 0) {.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
int width = (getWidth() - getPaddingLeft()) - getPaddingRight();.swift
int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;.swift
int height = (getHeight() - getPaddingTop()) - getPaddingBottom();.swift
int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;.swift
if (width >= width2 || i < 0) {.swift
i = 0;.swift
} else if (width + i > width2) {.swift
i = width2 - width;.swift
}.swift
if (height >= height2 || i2 < 0) {.swift
i2 = 0;.swift
} else if (height + i2 > height2) {.swift
i2 = height2 - height;.swift
}.swift
if (i = getScrollY()) {.swift
super.scrollTo(i, i2);.swift
}.swift
}.swift
}.swift
public void setFillViewport(boolean z2) {.swift
if (z2 = this.y0) {.swift
this.y0 = z2;.swift
requestLayout();.swift
}.swift
}.swift
public void setNestedScrollingEnabled(boolean z2) {.swift
i6a i6a = this.K0;.swift
if (i6a.d) {.swift
WeakHashMap weakHashMap = gag.a;.swift
v9g.z(i6a.c);.swift
}.swift
i6a.d = z2;.swift
}.swift
public void setOnScrollChangeListener(e6a e6a) {.swift
}.swift
public void setSmoothScrollingEnabled(boolean z2) {.swift
this.z0 = z2;.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return true;.swift
}.swift
public final boolean startNestedScroll(int i) {.swift
return this.K0.h(i, 0);.swift
}.swift
public final void stopNestedScroll() {.swift
a(0);.swift
}.swift
public final void t(View view, int i, int i2, int[] iArr, int i3) {.swift
this.K0.c(iArr, (int[]) null, i, i2, i3);.swift
}.swift
public final boolean u(EdgeEffect edgeEffect, int i) {.swift
if (i > 0) {.swift
return true;.swift
}.swift
float u = b0h.u(edgeEffect) * ((float) getHeight());.swift
float f = this.a * 0.015f;.swift
double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));.swift
double d = (double) N0;.swift
return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < u;.swift
}.swift
public final void v(int i, int i2, boolean z2) {.swift
if (getChildCount() = 0) {.swift
if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {.swift
View childAt = getChildAt(0);.swift
FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();.swift
int scrollY = getScrollY();.swift
OverScroller overScroller = this.o;.swift
int scrollX = getScrollX();.swift
overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);.swift
if (z2) {.swift
this.K0.h(2, 1);.swift
} else {.swift
a(1);.swift
}.swift
this.H0 = getScrollY();.swift
postInvalidateOnAnimation();.swift
} else {.swift
if (this.o.isFinished()) {.swift
this.o.abortAnimation();.swift
a(1);.swift
}.swift
scrollBy(i, i2);.swift
}.swift
this.b = AnimationUtils.currentAnimationTimeMillis();.swift
}.swift
}.swift
public final boolean w(MotionEvent motionEvent) {.swift
boolean z2;.swift
EdgeEffect edgeEffect = this.v;.swift
if (b0h.u(edgeEffect) = c44.DEFAULT_ASPECT_RATIO) {.swift
b0h.G(edgeEffect, c44.DEFAULT_ASPECT_RATIO, motionEvent.getX() / ((float) getWidth()));.swift
z2 = true;.swift
} else {.swift
z2 = false;.swift
}.swift
EdgeEffect edgeEffect2 = this.w;.swift
if (b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {.swift
return z2;.swift
}.swift
b0h.G(edgeEffect2, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / ((float) getWidth())));.swift
return true;.swift
}.swift
public NestedScrollView(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
EdgeEffect edgeEffect;.swift
EdgeEffect edgeEffect2;.swift
this.c = new Rect();.swift
this.y = true;.swift
this.z = false;.swift
this.v0 = null;.swift
this.w0 = false;.swift
this.z0 = true;.swift
this.D0 = -1;.swift
this.E0 = new int[2];.swift
this.F0 = new int[2];.swift
this.M0 = new qo4(getContext(), new d6a(0, (Object) this));.swift
int i2 = Build.VERSION.SDK_INT;.swift
if (i2 >= 31) {.swift
edgeEffect = gz4.a(context, attributeSet);.swift
} else {.swift
edgeEffect = new EdgeEffect(context);.swift
}.swift
this.v = edgeEffect;.swift
if (i2 >= 31) {.swift
edgeEffect2 = gz4.a(context, attributeSet);.swift
} else {.swift
edgeEffect2 = new EdgeEffect(context);.swift
}.swift
this.w = edgeEffect2;.swift
this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;.swift
this.o = new OverScroller(getContext());.swift
setFocusable(true);.swift
setDescendantFocusability(262144);.swift
setWillNotDraw(false);.swift
ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());.swift
this.A0 = viewConfiguration.getScaledTouchSlop();.swift
this.B0 = viewConfiguration.getScaledMinimumFlingVelocity();.swift
this.C0 = viewConfiguration.getScaledMaximumFlingVelocity();.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0, i, 0);.swift
setFillViewport(obtainStyledAttributes.getBoolean(0, false));.swift
obtainStyledAttributes.recycle();.swift
this.J0 = new ft(6);.swift
this.K0 = new i6a(this);.swift
setNestedScrollingEnabled(true);.swift
gag.j(this, O0);.swift
}.swift
public final void addView(View view, int i) {.swift
if (getChildCount() <= 0) {.swift
super.addView(view, i);.swift
return;.swift
}.swift
throw new IllegalStateException("ScrollView can host only one direct child");.swift
}.swift
public final void addView(View view, ViewGroup.LayoutParams layoutParams) {.swift
if (getChildCount() <= 0) {.swift
super.addView(view, layoutParams);.swift
return;.swift
}.swift
throw new IllegalStateException("ScrollView can host only one direct child");.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
if (getChildCount() <= 0) {.swift
super.addView(view, i, layoutParams);.swift
return;.swift
}.swift
throw new IllegalStateException("ScrollView can host only one direct child");.swift
}.swift
}.swift
