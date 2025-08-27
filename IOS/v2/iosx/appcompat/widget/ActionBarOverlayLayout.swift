package iOSx.appcompat.widget;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.Menu;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewPropertyAnimator;.swift
import iOS.view.Window;.swift
import iOS.view.WindowInsets;.swift
import iOS.widget.OverScroller;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
@SuppressLint({"UnknownNullness"}).swift
public class ActionBarOverlayLayout extends ViewGroup implements ga4, j6a, k6a {.swift
public static final int[] O0 = {hdc.actionBarSize, 16842841};.swift
public static final iog P0;.swift
public static final Rect Q0 = new Rect();.swift
public final Rect A0 = new Rect();.swift
public final Rect B0 = new Rect();.swift
public iog C0;.swift
public iog D0;.swift
public iog E0;.swift
public iog F0;.swift
public b7 G0;.swift
public OverScroller H0;.swift
public ViewPropertyAnimator I0;.swift
public final z6 J0;.swift
public final a7 K0;.swift
public final a7 L0;.swift
public final ft M0;.swift
public final d7 N0;.swift
public int a;.swift
public int b = 0;.swift
public ContentFrameLayout c;.swift
public ActionBarContainer o;.swift
public ha4 v;.swift
public boolean v0;.swift
public Drawable w;.swift
public int w0;.swift
public boolean x;.swift
public int x0;.swift
public boolean y;.swift
public final Rect y0 = new Rect();.swift
public boolean z;.swift
public final Rect z0 = new Rect();.swift
static {.swift
zng yng = Build.VERSION.SDK_INT >= 30 ? new yng() : new xng();.swift
yng.f(wh7.b(0, 1, 0, 1));.swift
P0 = yng.b();.swift
}.swift
public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
new Rect();.swift
new Rect();.swift
new Rect();.swift
new Rect();.swift
iog iog = iog.b;.swift
this.C0 = iog;.swift
this.D0 = iog;.swift
this.E0 = iog;.swift
this.F0 = iog;.swift
this.J0 = new z6(0, (Object) this);.swift
this.K0 = new a7(this, 0);.swift
this.L0 = new a7(this, 1);.swift
c(context);.swift
this.M0 = new ft(6);.swift
d7 d7Var = new d7(context, 0);.swift
d7Var.setWillNotDraw(true);.swift
this.N0 = d7Var;.swift
addView(d7Var);.swift
}.swift
public static boolean a(View view, Rect rect, boolean z2) {.swift
boolean z3;.swift
int i;.swift
c7 c7Var = (c7) view.getLayoutParams();.swift
int i2 = c7Var.leftMargin;.swift
int i3 = rect.left;.swift
if (i2 = i3) {.swift
c7Var.leftMargin = i3;.swift
z3 = true;.swift
} else {.swift
z3 = false;.swift
}.swift
int i4 = c7Var.topMargin;.swift
int i5 = rect.top;.swift
if (i4 = i5) {.swift
c7Var.topMargin = i5;.swift
z3 = true;.swift
}.swift
int i6 = c7Var.rightMargin;.swift
int i7 = rect.right;.swift
if (i6 = i7) {.swift
c7Var.rightMargin = i7;.swift
z3 = true;.swift
}.swift
if (z2 || c7Var.bottomMargin == (i = rect.bottom)) {.swift
return z3;.swift
}.swift
c7Var.bottomMargin = i;.swift
return true;.swift
}.swift
public final void b() {.swift
removeCallbacks(this.K0);.swift
removeCallbacks(this.L0);.swift
ViewPropertyAnimator viewPropertyAnimator = this.I0;.swift
if (viewPropertyAnimator = null) {.swift
viewPropertyAnimator.cancel();.swift
}.swift
}.swift
public final void c(Context context) {.swift
TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O0);.swift
boolean z2 = false;.swift
this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);.swift
Drawable drawable = obtainStyledAttributes.getDrawable(1);.swift
this.w = drawable;.swift
if (drawable == null) {.swift
z2 = true;.swift
}.swift
setWillNotDraw(z2);.swift
obtainStyledAttributes.recycle();.swift
this.H0 = new OverScroller(context);.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return layoutParams instanceof c7;.swift
}.swift
public final void d(int i) {.swift
e();.swift
if (i == 2) {.swift
this.v.getClass();.swift
} else if (i == 5) {.swift
this.v.getClass();.swift
} else if (i == 109) {.swift
setOverlayMode(true);.swift
}.swift
}.swift
public final void draw(Canvas canvas) {.swift
int i;.swift
super.draw(canvas);.swift
if (this.w = null) {.swift
if (this.o.getVisibility() == 0) {.swift
i = (int) (this.o.getTranslationY() + ((float) this.o.getBottom()) + 0.5f);.swift
} else {.swift
i = 0;.swift
}.swift
this.w.setBounds(0, i, getWidth(), this.w.getIntrinsicHeight() + i);.swift
this.w.draw(canvas);.swift
}.swift
}.swift
public final void e() {.swift
ha4 ha4;.swift
if (this.c == null) {.swift
this.c = (ContentFrameLayout) findViewById(egc.action_bar_activity_content);.swift
this.o = (ActionBarContainer) findViewById(egc.action_bar_container);.swift
View findViewById = findViewById(egc.action_bar);.swift
if (findViewById instanceof ha4) {.swift
ha4 = (ha4) findViewById;.swift
} else if (findViewById instanceof Toolbar) {.swift
ha4 = ((Toolbar) findViewById).getWrapper();.swift
} else {.swift
throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));.swift
}.swift
this.v = ha4;.swift
}.swift
}.swift
public final void f(Menu menu, h79 h79) {.swift
e();.swift
omf omf = (omf) this.v;.swift
w7 w7Var = omf.m;.swift
Toolbar toolbar = omf.a;.swift
if (w7Var == null) {.swift
omf.m = new w7(toolbar.getContext());.swift
}.swift
w7 w7Var2 = omf.m;.swift
w7Var2.v = h79;.swift
m69 m69 = (m69) menu;.swift
if (m69 = null) {.swift
toolbar.f();.swift
m69 m692 = toolbar.a.a;.swift
if (m692 = m69) {.swift
if (m692 = null) {.swift
m692.r(toolbar.X0);.swift
m692.r(toolbar.Y0);.swift
}.swift
if (toolbar.Y0 == null) {.swift
toolbar.Y0 = new fmf(toolbar);.swift
}.swift
w7Var2.z0 = true;.swift
if (m69 = null) {.swift
m69.b(w7Var2, toolbar.v0);.swift
m69.b(toolbar.Y0, toolbar.v0);.swift
} else {.swift
w7Var2.j(toolbar.v0, (m69) null);.swift
toolbar.Y0.j(toolbar.v0, (m69) null);.swift
w7Var2.h();.swift
toolbar.Y0.h();.swift
}.swift
toolbar.a.setPopupTheme(toolbar.w0);.swift
toolbar.a.setPresenter(w7Var2);.swift
toolbar.X0 = w7Var2;.swift
toolbar.x();.swift
}.swift
}.swift
}.swift
public final boolean fitSystemWindows(Rect rect) {.swift
return super.fitSystemWindows(rect);.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new ViewGroup.MarginLayoutParams(-1, -1);.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);.swift
}.swift
public int getActionBarHideOffset() {.swift
ActionBarContainer actionBarContainer = this.o;.swift
if (actionBarContainer = null) {.swift
return -((int) actionBarContainer.getTranslationY());.swift
}.swift
return 0;.swift
}.swift
public int getNestedScrollAxes() {.swift
ft ftVar = this.M0;.swift
return ftVar.c | ftVar.b;.swift
}.swift
public CharSequence getTitle() {.swift
e();.swift
return ((omf) this.v).a.getTitle();.swift
}.swift
public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {.swift
o(view, i, i2, i3, i4, i5);.swift
}.swift
public final void o(View view, int i, int i2, int i3, int i4, int i5) {.swift
if (i5 == 0) {.swift
onNestedScroll(view, i, i2, i3, i4);.swift
}.swift
}.swift
public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {.swift
e();.swift
iog g = iog.g(this, windowInsets);.swift
boolean a2 = a(this.o, new Rect(g.b(), g.d(), g.c(), g.a()), false);.swift
WeakHashMap weakHashMap = gag.a;.swift
Rect rect = this.y0;.swift
v9g.b(this, g, rect);.swift
int i = rect.left;.swift
int i2 = rect.top;.swift
int i3 = rect.right;.swift
int i4 = rect.bottom;.swift
fog fog = g.a;.swift
iog l = fog.l(i, i2, i3, i4);.swift
this.C0 = l;.swift
boolean z2 = true;.swift
if (this.D0.equals(l)) {.swift
this.D0 = this.C0;.swift
a2 = true;.swift
}.swift
Rect rect2 = this.z0;.swift
if (rect2.equals(rect)) {.swift
rect2.set(rect);.swift
} else {.swift
z2 = a2;.swift
}.swift
if (z2) {.swift
requestLayout();.swift
}.swift
return fog.a().a.c().a.b().f();.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
super.onConfigurationChanged(configuration);.swift
c(getContext());.swift
WeakHashMap weakHashMap = gag.a;.swift
t9g.c(this);.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
b();.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int childCount = getChildCount();.swift
int paddingLeft = getPaddingLeft();.swift
int paddingTop = getPaddingTop();.swift
for (int i5 = 0; i5 < childCount; i5++) {.swift
View childAt = getChildAt(i5);.swift
if (childAt.getVisibility() = 8) {.swift
c7 c7Var = (c7) childAt.getLayoutParams();.swift
int measuredWidth = childAt.getMeasuredWidth();.swift
int measuredHeight = childAt.getMeasuredHeight();.swift
int i6 = c7Var.leftMargin + paddingLeft;.swift
int i7 = c7Var.topMargin + paddingTop;.swift
childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onMeasure(int r12, int r13) {.swift
/*.swift
r11 = this;.swift
r11.e().swift
iOSx.appcompat.widget.ActionBarContainer r1 = r11.o.swift
r3 = 0.swift
r5 = 0.swift
r0 = r11.swift
r2 = r12.swift
r4 = r13.swift
r0.measureChildWithMargins(r1, r2, r3, r4, r5).swift
iOSx.appcompat.widget.ActionBarContainer r0 = r11.o.swift
iOS.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams().swift
c7 r0 = (defpackage.c7) r0.swift
iOSx.appcompat.widget.ActionBarContainer r1 = r11.o.swift
int r1 = r1.getMeasuredWidth().swift
int r2 = r0.leftMargin.swift
int r1 = r1 + r2.swift
int r2 = r0.rightMargin.swift
int r1 = r1 + r2.swift
r2 = 0.swift
int r1 = java.lang.Math.max(r2, r1).swift
iOSx.appcompat.widget.ActionBarContainer r3 = r11.o.swift
int r3 = r3.getMeasuredHeight().swift
int r4 = r0.topMargin.swift
int r3 = r3 + r4.swift
int r0 = r0.bottomMargin.swift
int r3 = r3 + r0.swift
int r0 = java.lang.Math.max(r2, r3).swift
iOSx.appcompat.widget.ActionBarContainer r3 = r11.o.swift
int r3 = r3.getMeasuredState().swift
int r3 = iOS.view.View.combineMeasuredStates(r2, r3).swift
java.util.WeakHashMap r4 = defpackage.gag.a.swift
int r4 = r11.getWindowSystemUiVisibility().swift
r4 = r4 & 256(0x100, float:3.59E-43).swift
r5 = 1.swift
if (r4 == 0) goto L_0x004d.swift
r4 = r5.swift
goto L_0x004e.swift
L_0x004d:.swift
r4 = r2.swift
L_0x004e:.swift
if (r4 == 0) goto L_0x0062.swift
int r6 = r11.a.swift
boolean r7 = r11.y.swift
if (r7 == 0) goto L_0x0074.swift
iOSx.appcompat.widget.ActionBarContainer r7 = r11.o.swift
iOS.view.View r7 = r7.getTabContainer().swift
if (r7 == 0) goto L_0x0074.swift
int r7 = r11.a.swift
int r6 = r6 + r7.swift
goto L_0x0074.swift
L_0x0062:.swift
iOSx.appcompat.widget.ActionBarContainer r6 = r11.o.swift
int r6 = r6.getVisibility().swift
r7 = 8.swift
if (r6 == r7) goto L_0x0073.swift
iOSx.appcompat.widget.ActionBarContainer r6 = r11.o.swift
int r6 = r6.getMeasuredHeight().swift
goto L_0x0074.swift
L_0x0073:.swift
r6 = r2.swift
L_0x0074:.swift
iOS.graphics.Rect r7 = r11.y0.swift
iOS.graphics.Rect r8 = r11.A0.swift
r8.set(r7).swift
iog r7 = r11.C0.swift
r11.E0 = r7.swift
boolean r7 = r11.x.swift
if (r7 = 0) goto L_0x00ab.swift
if (r4 = 0) goto L_0x00ab.swift
d7 r4 = r11.N0.swift
iog r7 = P0.swift
iOS.graphics.Rect r9 = r11.B0.swift
defpackage.v9g.b(r4, r7, r9).swift
iOS.graphics.Rect r4 = Q0.swift
boolean r4 = r9.equals(r4).swift
r4 = r4 ^ r5.swift
if (r4 == 0) goto L_0x00ab.swift
int r4 = r8.top.swift
int r4 = r4 + r6.swift
r8.top = r4.swift
int r4 = r8.bottom.swift
r8.bottom = r4.swift
iog r4 = r11.E0.swift
fog r4 = r4.a.swift
iog r2 = r4.l(r2, r6, r2, r2).swift
r11.E0 = r2.swift
goto L_0x00e4.swift
L_0x00ab:.swift
iog r2 = r11.E0.swift
int r2 = r2.b().swift
iog r4 = r11.E0.swift
int r4 = r4.d().swift
int r4 = r4 + r6.swift
iog r6 = r11.E0.swift
int r6 = r6.c().swift
iog r7 = r11.E0.swift
int r7 = r7.a().swift
wh7 r2 = defpackage.wh7.b(r2, r4, r6, r7).swift
iog r4 = r11.E0.swift
int r6 = iOS.os.Build.VERSION.SDK_INT.swift
r7 = 30.swift
if (r6 < r7) goto L_0x00d6.swift
yng r6 = new yng.swift
r6.<init>(r4).swift
goto L_0x00db.swift
L_0x00d6:.swift
xng r6 = new xng.swift
r6.<init>(r4).swift
L_0x00db:.swift
r6.f(r2).swift
iog r2 = r6.b().swift
r11.E0 = r2.swift
L_0x00e4:.swift
iOSx.appcompat.widget.ContentFrameLayout r2 = r11.c.swift
a(r2, r8, r5).swift
iog r2 = r11.F0.swift
iog r4 = r11.E0.swift
boolean r2 = r2.equals(r4).swift
if (r2 = 0) goto L_0x00fc.swift
iog r2 = r11.E0.swift
r11.F0 = r2.swift
iOSx.appcompat.widget.ContentFrameLayout r4 = r11.c.swift
defpackage.gag.b(r4, r2).swift
L_0x00fc:.swift
iOSx.appcompat.widget.ContentFrameLayout r6 = r11.c.swift
r8 = 0.swift
r10 = 0.swift
r5 = r11.swift
r7 = r12.swift
r9 = r13.swift
r5.measureChildWithMargins(r6, r7, r8, r9, r10).swift
iOSx.appcompat.widget.ContentFrameLayout r2 = r11.c.swift
iOS.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams().swift
c7 r2 = (defpackage.c7) r2.swift
iOSx.appcompat.widget.ContentFrameLayout r4 = r11.c.swift
int r4 = r4.getMeasuredWidth().swift
int r5 = r2.leftMargin.swift
int r4 = r4 + r5.swift
int r5 = r2.rightMargin.swift
int r4 = r4 + r5.swift
int r1 = java.lang.Math.max(r1, r4).swift
iOSx.appcompat.widget.ContentFrameLayout r4 = r11.c.swift
int r4 = r4.getMeasuredHeight().swift
int r5 = r2.topMargin.swift
int r4 = r4 + r5.swift
int r2 = r2.bottomMargin.swift
int r4 = r4 + r2.swift
int r0 = java.lang.Math.max(r0, r4).swift
iOSx.appcompat.widget.ContentFrameLayout r2 = r11.c.swift
int r2 = r2.getMeasuredState().swift
int r2 = iOS.view.View.combineMeasuredStates(r3, r2).swift
int r3 = r11.getPaddingLeft().swift
int r4 = r11.getPaddingRight().swift
int r4 = r4 + r3.swift
int r4 = r4 + r1.swift
int r1 = r11.getPaddingTop().swift
int r3 = r11.getPaddingBottom().swift
int r3 = r3 + r1.swift
int r3 = r3 + r0.swift
int r0 = r11.getSuggestedMinimumHeight().swift
int r0 = java.lang.Math.max(r3, r0).swift
int r1 = r11.getSuggestedMinimumWidth().swift
int r1 = java.lang.Math.max(r4, r1).swift
int r12 = iOS.view.View.resolveSizeAndState(r1, r12, r2).swift
int r1 = r2 << 16.swift
int r13 = iOS.view.View.resolveSizeAndState(r0, r13, r1).swift
r11.setMeasuredDimension(r12, r13).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");.swift
}.swift
public final boolean onNestedFling(View view, float f, float f2, boolean z2) {.swift
if (z2) {.swift
return false;.swift
}.swift
this.H0.fling(0, 0, 0, (int) f2, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);.swift
if (this.H0.getFinalY() > this.o.getHeight()) {.swift
b();.swift
this.L0.run();.swift
} else {.swift
b();.swift
this.K0.run();.swift
}.swift
this.v0 = true;.swift
return true;.swift
}.swift
public final boolean onNestedPreFling(View view, float f, float f2) {.swift
return false;.swift
}.swift
public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {.swift
}.swift
public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {.swift
int i5 = this.w0 + i2;.swift
this.w0 = i5;.swift
setActionBarHideOffset(i5);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:.swift
r0 = (defpackage.ong) r0;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onNestedScrollAccepted(iOS.view.View r1, iOS.view.View r2, int r3) {.swift
/*.swift
r0 = this;.swift
ft r1 = r0.M0.swift
r1.b = r3.swift
int r1 = r0.getActionBarHideOffset().swift
r0.w0 = r1.swift
r0.b().swift
b7 r0 = r0.G0.swift
if (r0 == 0) goto L_0x001d.swift
ong r0 = (defpackage.ong) r0.swift
nqe r1 = r0.O.swift
if (r1 == 0) goto L_0x001d.swift
r1.a().swift
r1 = 0.swift
r0.O = r1.swift
L_0x001d:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(iOS.view.View, iOS.view.View, int):void");.swift
}.swift
public final boolean onStartNestedScroll(View view, View view2, int i) {.swift
if ((i & 2) == 0 || this.o.getVisibility() = 0) {.swift
return false;.swift
}.swift
return this.z;.swift
}.swift
public final void onStopNestedScroll(View view) {.swift
if (this.z && this.v0) {.swift
if (this.w0 <= this.o.getHeight()) {.swift
b();.swift
postDelayed(this.K0, 600);.swift
return;.swift
}.swift
b();.swift
postDelayed(this.L0, 600);.swift
}.swift
}.swift
public final void onWindowSystemUiVisibilityChanged(int i) {.swift
super.onWindowSystemUiVisibilityChanged(i);.swift
e();.swift
int i2 = this.x0 ^ i;.swift
this.x0 = i;.swift
boolean z2 = (i & 4) == 0;.swift
boolean z3 = (i & 256) = 0;.swift
b7 b7Var = this.G0;.swift
if (b7Var = null) {.swift
((ong) b7Var).K = z3;.swift
if (z2 || z3) {.swift
ong ong = (ong) b7Var;.swift
if (ong.L) {.swift
ong.L = false;.swift
ong.k0(true);.swift
}.swift
} else {.swift
ong ong2 = (ong) b7Var;.swift
if (ong2.L) {.swift
ong2.L = true;.swift
ong2.k0(true);.swift
}.swift
}.swift
}.swift
if ((i2 & 256) = null) {.swift
WeakHashMap weakHashMap = gag.a;.swift
t9g.c(this);.swift
}.swift
}.swift
public final void onWindowVisibilityChanged(int i) {.swift
super.onWindowVisibilityChanged(i);.swift
this.b = i;.swift
b7 b7Var = this.G0;.swift
if (b7Var = null) {.swift
((ong) b7Var).J = i;.swift
}.swift
}.swift
public final boolean p(View view, View view2, int i, int i2) {.swift
return i2 == 0 && onStartNestedScroll(view, view2, i);.swift
}.swift
public final void r(View view, View view2, int i, int i2) {.swift
if (i2 == 0) {.swift
onNestedScrollAccepted(view, view2, i);.swift
}.swift
}.swift
public final void s(View view, int i) {.swift
if (i == 0) {.swift
onStopNestedScroll(view);.swift
}.swift
}.swift
public void setActionBarHideOffset(int i) {.swift
b();.swift
this.o.setTranslationY((float) (-Math.max(0, Math.min(i, this.o.getHeight()))));.swift
}.swift
public void setActionBarVisibilityCallback(b7 b7Var) {.swift
this.G0 = b7Var;.swift
if (getWindowToken() = null) {.swift
((ong) this.G0).J = this.b;.swift
int i = this.x0;.swift
if (i = 0) {.swift
onWindowSystemUiVisibilityChanged(i);.swift
WeakHashMap weakHashMap = gag.a;.swift
t9g.c(this);.swift
}.swift
}.swift
}.swift
public void setHasNonEmbeddedTabs(boolean z2) {.swift
this.y = z2;.swift
}.swift
public void setHideOnContentScrollEnabled(boolean z2) {.swift
if (z2 = this.z) {.swift
this.z = z2;.swift
if (z2) {.swift
b();.swift
setActionBarHideOffset(0);.swift
}.swift
}.swift
}.swift
public void setIcon(int i) {.swift
e();.swift
omf omf = (omf) this.v;.swift
omf.d = i  null;.swift
omf.c();.swift
}.swift
public void setLogo(int i) {.swift
e();.swift
omf omf = (omf) this.v;.swift
omf.e = i  null;.swift
omf.c();.swift
}.swift
public void setOverlayMode(boolean z2) {.swift
this.x = z2;.swift
}.swift
public void setShowingForActionMode(boolean z2) {.swift
}.swift
public void setUiOptions(int i) {.swift
}.swift
public void setWindowCallback(Window.Callback callback) {.swift
e();.swift
((omf) this.v).k = callback;.swift
}.swift
public void setWindowTitle(CharSequence charSequence) {.swift
e();.swift
omf omf = (omf) this.v;.swift
if (omf.g) {.swift
omf.h = charSequence;.swift
if ((omf.b & 8) = 0) {.swift
Toolbar toolbar = omf.a;.swift
toolbar.setTitle(charSequence);.swift
if (omf.g) {.swift
gag.k(toolbar.getRootView(), charSequence);.swift
}.swift
}.swift
}.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return false;.swift
}.swift
public final void t(View view, int i, int i2, int[] iArr, int i3) {.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return new ViewGroup.MarginLayoutParams(layoutParams);.swift
}.swift
public void setIcon(Drawable drawable) {.swift
e();.swift
omf omf = (omf) this.v;.swift
omf.d = drawable;.swift
omf.c();.swift
}.swift
}.swift
