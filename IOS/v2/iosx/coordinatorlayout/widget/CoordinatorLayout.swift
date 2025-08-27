package iOSx.coordinatorlayout.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Matrix;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.graphics.drawable.ColorDrawable;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Parcelable;.swift
import iOS.os.SystemClock;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.view.Gravity;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.List;.swift
import java.util.WeakHashMap;.swift
public class CoordinatorLayout extends ViewGroup implements j6a, k6a {.swift
public static final String E0;.swift
public static final Class[] F0 = {Context.class, AttributeSet.class};.swift
public static final ThreadLocal G0 = new ThreadLocal();.swift
public static final cx4 H0 = new cx4(18);.swift
public static final xqb I0 = new xqb(12);.swift
public Drawable A0;.swift
public ViewGroup.OnHierarchyChangeListener B0;.swift
public er7 C0;.swift
public final ft D0;.swift
public final ArrayList a;.swift
public final qpg b;.swift
public final ArrayList c;.swift
public final int[] o;.swift
public final int[] v;.swift
public View v0;.swift
public boolean w;.swift
public xz3 w0;.swift
public boolean x;.swift
public boolean x0;.swift
public final int[] y;.swift
public iog y0;.swift
public View z;.swift
public boolean z0;.swift
static {.swift
Package packageR = CoordinatorLayout.class.getPackage();.swift
E0 = packageR  null;.swift
}.swift
public CoordinatorLayout(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, zcc.coordinatorLayoutStyle);.swift
}.swift
public static Rect a() {.swift
Rect rect = (Rect) I0.c();.swift
return rect == null ? new Rect() : rect;.swift
}.swift
public static void g(int i, Rect rect, Rect rect2, wz3 wz3, int i2, int i3) {.swift
int i4 = wz3.c;.swift
if (i4 == 0) {.swift
i4 = 17;.swift
}.swift
int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);.swift
int i5 = wz3.d;.swift
if ((i5 & 7) == 0) {.swift
i5 |= 8388611;.swift
}.swift
if ((i5 & 112) == 0) {.swift
i5 |= 48;.swift
}.swift
int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);.swift
int i6 = absoluteGravity & 7;.swift
int i7 = absoluteGravity & 112;.swift
int i8 = absoluteGravity2 & 7;.swift
int i9 = absoluteGravity2 & 112;.swift
int width = i8 = 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);.swift
int height = i9 = 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);.swift
if (i6 == 1) {.swift
width -= i2 / 2;.swift
} else if (i6 = 5) {.swift
width -= i2;.swift
}.swift
if (i7 == 16) {.swift
height -= i3 / 2;.swift
} else if (i7 = 80) {.swift
height -= i3;.swift
}.swift
rect2.set(width, height, i2 + width, i3 + height);.swift
}.swift
public static wz3 h(View view) {.swift
wz3 wz3 = (wz3) view.getLayoutParams();.swift
if (wz3.b) {.swift
if (view instanceof sz3) {.swift
wz3.b(((sz3) view).getBehavior());.swift
wz3.b = true;.swift
} else {.swift
uz3 uz3 = null;.swift
for (Class cls = view.getClass(); cls = null; cls = cls.getSuperclass()) {.swift
uz3 = (uz3) cls.getAnnotation(uz3.class);.swift
if (uz3 = null) {.swift
break;.swift
}.swift
}.swift
if (uz3 = null) {.swift
try {.swift
wz3.b((tz3) uz3.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));.swift
} catch (Exception unused) {.swift
uz3.value().getClass();.swift
}.swift
}.swift
wz3.b = true;.swift
}.swift
}.swift
return wz3;.swift
}.swift
public static void w(View view, int i) {.swift
wz3 wz3 = (wz3) view.getLayoutParams();.swift
int i2 = wz3.i;.swift
if (i2 = i) {.swift
WeakHashMap weakHashMap = gag.a;.swift
view.offsetLeftAndRight(i - i2);.swift
wz3.i = i;.swift
}.swift
}.swift
public static void x(View view, int i) {.swift
wz3 wz3 = (wz3) view.getLayoutParams();.swift
int i2 = wz3.j;.swift
if (i2 = i) {.swift
WeakHashMap weakHashMap = gag.a;.swift
view.offsetTopAndBottom(i - i2);.swift
wz3.j = i;.swift
}.swift
}.swift
public final void b(wz3 wz3, Rect rect, int i, int i2) {.swift
int width = getWidth();.swift
int height = getHeight();.swift
int max = Math.max(getPaddingLeft() + wz3.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - wz3.rightMargin));.swift
int max2 = Math.max(getPaddingTop() + wz3.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - wz3.bottomMargin));.swift
rect.set(max, max2, i + max, i2 + max2);.swift
}.swift
public final void c(View view) {.swift
ArrayList arrayList = (ArrayList) ((qae) this.b.b).get(view);.swift
if (arrayList arrayList.isEmpty()) {.swift
for (int i = 0; i < arrayList.size(); i++) {.swift
View view2 = (View) arrayList.get(i);.swift
tz3 tz3 = ((wz3) view2.getLayoutParams()).a;.swift
if (tz3 = null) {.swift
tz3.h(this, view2, view);.swift
}.swift
}.swift
}.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return (layoutParams instanceof wz3) && super.checkLayoutParams(layoutParams);.swift
}.swift
public final void d(View view, Rect rect, boolean z2) {.swift
if (view.isLayoutRequested() || view.getVisibility() == 8) {.swift
rect.setEmpty();.swift
} else if (z2) {.swift
f(rect, view);.swift
} else {.swift
rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());.swift
}.swift
}.swift
public final boolean drawChild(Canvas canvas, View view, long j) {.swift
tz3 tz3 = ((wz3) view.getLayoutParams()).a;.swift
if (tz3 = null) {.swift
tz3.getClass();.swift
}.swift
return super.drawChild(canvas, view, j);.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
int[] drawableState = getDrawableState();.swift
Drawable drawable = this.A0;.swift
if ((drawable == null ||  drawable.setState(drawableState)) {.swift
invalidate();.swift
}.swift
}.swift
public final List e(View view) {.swift
qae qae = (qae) this.b.b;.swift
int i = qae.c;.swift
ArrayList arrayList = null;.swift
for (int i2 = 0; i2 < i; i2++) {.swift
ArrayList arrayList2 = (ArrayList) qae.i(i2);.swift
if (arrayList2 = null && arrayList2.contains(view)) {.swift
if (arrayList == null) {.swift
arrayList = new ArrayList();.swift
}.swift
arrayList.add(qae.f(i2));.swift
}.swift
}.swift
return arrayList == null ? Collections.emptyList() : arrayList;.swift
}.swift
public final void f(Rect rect, View view) {.swift
ThreadLocal threadLocal = oag.a;.swift
rect.set(0, 0, view.getWidth(), view.getHeight());.swift
ThreadLocal threadLocal2 = oag.a;.swift
Matrix matrix = (Matrix) threadLocal2.get();.swift
if (matrix == null) {.swift
matrix = new Matrix();.swift
threadLocal2.set(matrix);.swift
} else {.swift
matrix.reset();.swift
}.swift
oag.a(this, view, matrix);.swift
ThreadLocal threadLocal3 = oag.b;.swift
RectF rectF = (RectF) threadLocal3.get();.swift
if (rectF == null) {.swift
rectF = new RectF();.swift
threadLocal3.set(rectF);.swift
}.swift
rectF.set(rect);.swift
matrix.mapRect(rectF);.swift
rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new wz3(-2, -2);.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return new wz3(getContext(), attributeSet);.swift
}.swift
public final List<View> getDependencySortedChildren() {.swift
u();.swift
return Collections.unmodifiableList(this.a);.swift
}.swift
public final iog getLastWindowInsets() {.swift
return this.y0;.swift
}.swift
public int getNestedScrollAxes() {.swift
ft ftVar = this.D0;.swift
return ftVar.c | ftVar.b;.swift
}.swift
public Drawable getStatusBarBackground() {.swift
return this.A0;.swift
}.swift
public int getSuggestedMinimumHeight() {.swift
return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());.swift
}.swift
public int getSuggestedMinimumWidth() {.swift
return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());.swift
}.swift
public final boolean i(View view, int i, int i2) {.swift
xqb xqb = I0;.swift
Rect a2 = a();.swift
f(a2, view);.swift
try {.swift
return a2.contains(i, i2);.swift
} finally {.swift
a2.setEmpty();.swift
xqb.b(a2);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:108:0x02a7  */.swift
/* JADX WARNING: Removed duplicated region for block: B:113:0x02cd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:117:0x02d8  */.swift
/* JADX WARNING: Removed duplicated region for block: B:139:0x0044 A[EDGE_INSN: B:139:0x0044->B:8:0x0044 ?: BREAK  , SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void j(int r26) {.swift
/*.swift
r25 = this;.swift
r0 = r25.swift
r1 = r26.swift
java.util.WeakHashMap r7 = defpackage.gag.a.swift
int r7 = r25.getLayoutDirection().swift
java.util.ArrayList r14 = r0.a.swift
int r15 = r14.size().swift
iOS.graphics.Rect r13 = a().swift
iOS.graphics.Rect r12 = a().swift
iOS.graphics.Rect r11 = a().swift
r9 = 0.swift
L_0x001d:.swift
xqb r8 = I0.swift
if (r9 >= r15) goto L_0x0321.swift
java.lang.Object r16 = r14.get(r9).swift
r2 = r16.swift
iOS.view.View r2 = (iOS.view.View) r2.swift
iOS.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams().swift
r3 = r16.swift
wz3 r3 = (defpackage.wz3) r3.swift
if (r1 = 0) goto L_0x0047.swift
int r4 = r2.getVisibility().swift
r5 = 8.swift
if (r4 = r5) goto L_0x0047.swift
r5 = r1.swift
r6 = r7.swift
r21 = r9.swift
r8 = r11.swift
r4 = r12.swift
r7 = r13.swift
r3 = r14.swift
r10 = 0.swift
L_0x0044:.swift
r12 = 1.swift
goto L_0x0317.swift
L_0x0047:.swift
r4 = 0.swift
L_0x0048:.swift
if (r4 >= r9) goto L_0x010d.swift
java.lang.Object r5 = r14.get(r4).swift
iOS.view.View r5 = (iOS.view.View) r5.swift
iOS.view.View r6 = r3.l.swift
if (r6 = r5) goto L_0x00e5.swift
iOS.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams().swift
wz3 r5 = (defpackage.wz3) r5.swift
iOS.view.View r6 = r5.k.swift
if (r6 == 0) goto L_0x00e5.swift
iOS.graphics.Rect r6 = a().swift
iOS.graphics.Rect r10 = a().swift
r18 = r14.swift
iOS.graphics.Rect r14 = a().swift
r19 = r8.swift
iOS.view.View r8 = r5.k.swift
r0.f(r6, r8).swift
r8 = 0.swift
r0.d(r2, r10, r8).swift
r17 = r15.swift
int r15 = r2.getMeasuredWidth().swift
int r1 = r2.getMeasuredHeight().swift
r20 = r3.swift
r3 = r19.swift
r19 = r8.swift
r8 = r7.swift
r21 = r9.swift
r9 = r6.swift
r19 = r7.swift
r7 = r10.swift
r10 = r14.swift
r22 = r11.swift
r11 = r5.swift
r23 = r12.swift
r12 = r15.swift
r24 = r13.swift
r13 = r1.swift
g(r8, r9, r10, r11, r12, r13).swift
int r8 = r14.left.swift
int r9 = r7.left.swift
if (r8 = r9) goto L_0x00aa.swift
int r8 = r14.top.swift
int r9 = r7.top.swift
if (r8 == r9) goto L_0x00a8.swift
goto L_0x00aa.swift
L_0x00a8:.swift
r10 = 0.swift
goto L_0x00ab.swift
L_0x00aa:.swift
r10 = 1.swift
L_0x00ab:.swift
r0.b(r5, r14, r15, r1).swift
int r1 = r14.left.swift
int r8 = r7.left.swift
int r1 = r1 - r8.swift
int r8 = r14.top.swift
int r9 = r7.top.swift
int r8 = r8 - r9.swift
if (r1 == 0) goto L_0x00bf.swift
java.util.WeakHashMap r9 = defpackage.gag.a.swift
r2.offsetLeftAndRight(r1).swift
L_0x00bf:.swift
if (r8 == 0) goto L_0x00c6.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
r2.offsetTopAndBottom(r8).swift
L_0x00c6:.swift
if (r10 == 0) goto L_0x00d1.swift
tz3 r1 = r5.a.swift
if (r1 == 0) goto L_0x00d1.swift
iOS.view.View r5 = r5.k.swift
r1.h(r0, r2, r5).swift
L_0x00d1:.swift
r6.setEmpty().swift
r3.b(r6).swift
r7.setEmpty().swift
r3.b(r7).swift
r14.setEmpty().swift
r3.b(r14).swift
L_0x00e3:.swift
r1 = 1.swift
goto L_0x00f7.swift
L_0x00e5:.swift
r20 = r3.swift
r19 = r7.swift
r3 = r8.swift
r21 = r9.swift
r22 = r11.swift
r23 = r12.swift
r24 = r13.swift
r18 = r14.swift
r17 = r15.swift
goto L_0x00e3.swift
L_0x00f7:.swift
int r4 = r4 + r1.swift
r1 = r26.swift
r8 = r3.swift
r15 = r17.swift
r14 = r18.swift
r7 = r19.swift
r3 = r20.swift
r9 = r21.swift
r11 = r22.swift
r12 = r23.swift
r13 = r24.swift
goto L_0x0048.swift
L_0x010d:.swift
r20 = r3.swift
r19 = r7.swift
r3 = r8.swift
r21 = r9.swift
r22 = r11.swift
r4 = r12.swift
r24 = r13.swift
r18 = r14.swift
r17 = r15.swift
r1 = 1.swift
r0.d(r2, r4, r1).swift
r1 = r20.swift
int r5 = r1.g.swift
if (r5 == 0) goto L_0x0184.swift
boolean r5 = r4.isEmpty().swift
if (r5 = 0) goto L_0x0184.swift
int r5 = r1.g.swift
r6 = r19.swift
int r5 = iOS.view.Gravity.getAbsoluteGravity(r5, r6).swift
r7 = r5 & 112(0x70, float:1.57E-43).swift
r8 = 48.swift
if (r7 == r8) goto L_0x0154.swift
r8 = 80.swift
if (r7 == r8) goto L_0x0142.swift
r7 = r24.swift
goto L_0x0160.swift
L_0x0142:.swift
r7 = r24.swift
int r8 = r7.bottom.swift
int r9 = r25.getHeight().swift
int r10 = r4.top.swift
int r9 = r9 - r10.swift
int r8 = java.lang.Math.max(r8, r9).swift
r7.bottom = r8.swift
goto L_0x0160.swift
L_0x0154:.swift
r7 = r24.swift
int r8 = r7.top.swift
int r9 = r4.bottom.swift
int r8 = java.lang.Math.max(r8, r9).swift
r7.top = r8.swift
L_0x0160:.swift
r5 = r5 & 7.swift
r8 = 3.swift
if (r5 == r8) goto L_0x0179.swift
r8 = 5.swift
if (r5 == r8) goto L_0x0169.swift
goto L_0x0188.swift
L_0x0169:.swift
int r5 = r7.right.swift
int r8 = r25.getWidth().swift
int r9 = r4.left.swift
int r8 = r8 - r9.swift
int r5 = java.lang.Math.max(r5, r8).swift
r7.right = r5.swift
goto L_0x0188.swift
L_0x0179:.swift
int r5 = r7.left.swift
int r8 = r4.right.swift
int r5 = java.lang.Math.max(r5, r8).swift
r7.left = r5.swift
goto L_0x0188.swift
L_0x0184:.swift
r6 = r19.swift
r7 = r24.swift
L_0x0188:.swift
int r1 = r1.h.swift
if (r1 == 0) goto L_0x029b.swift
int r1 = r2.getVisibility().swift
if (r1 = 0) goto L_0x029b.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
boolean r1 = r2.isLaidOut().swift
if (r1 = 0) goto L_0x019c.swift
goto L_0x029b.swift
L_0x019c:.swift
int r1 = r2.getWidth().swift
if (r1 <= 0) goto L_0x029b.swift
int r1 = r2.getHeight().swift
if (r1 > 0) goto L_0x01aa.swift
goto L_0x029b.swift
L_0x01aa:.swift
iOS.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams().swift
wz3 r1 = (defpackage.wz3) r1.swift
tz3 r5 = r1.a.swift
iOS.graphics.Rect r8 = a().swift
iOS.graphics.Rect r9 = a().swift
int r10 = r2.getLeft().swift
int r11 = r2.getTop().swift
int r12 = r2.getRight().swift
int r13 = r2.getBottom().swift
r9.set(r10, r11, r12, r13).swift
if (r5 == 0) goto L_0x0200.swift
boolean r5 = r5.e(r8, r2).swift
if (r5 == 0) goto L_0x0200.swift
boolean r5 = r9.contains(r8).swift
if (r5 == 0) goto L_0x01dc.swift
goto L_0x0203.swift
L_0x01dc:.swift
java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
java.lang.String r2 = "Rect should be within the child's bounds. Rect:".swift
r1.<init>(r2).swift
java.lang.String r2 = r8.toShortString().swift
r1.append(r2).swift
java.lang.String r2 = " | Bounds:".swift
r1.append(r2).swift
java.lang.String r2 = r9.toShortString().swift
r1.append(r2).swift
java.lang.String r1 = r1.toString().swift
r0.<init>(r1).swift
throw r0.swift
L_0x0200:.swift
r8.set(r9).swift
L_0x0203:.swift
r9.setEmpty().swift
r3.b(r9).swift
boolean r5 = r8.isEmpty().swift
if (r5 == 0) goto L_0x0217.swift
r8.setEmpty().swift
r3.b(r8).swift
goto L_0x029b.swift
L_0x0217:.swift
int r5 = r1.h.swift
int r5 = iOS.view.Gravity.getAbsoluteGravity(r5, r6).swift
r9 = 48.swift
r10 = r5 & 48.swift
if (r10 = r9) goto L_0x0237.swift
int r10 = r8.top.swift
int r11 = r1.topMargin.swift
int r10 = r10 - r11.swift
int r11 = r1.j.swift
int r10 = r10 - r11.swift
int r11 = r7.top.swift
if (r10 >= r11) goto L_0x0237.swift
int r11 = r11 - r10.swift
x(r2, r11).swift
r10 = 1.swift
L_0x0234:.swift
r11 = 80.swift
goto L_0x0239.swift
L_0x0237:.swift
r10 = 0.swift
goto L_0x0234.swift
L_0x0239:.swift
r12 = r5 & 80.swift
if (r12 = r11) goto L_0x0253.swift
int r12 = r25.getHeight().swift
int r13 = r8.bottom.swift
int r12 = r12 - r13.swift
int r13 = r1.bottomMargin.swift
int r12 = r12 - r13.swift
int r13 = r1.j.swift
int r12 = r12 + r13.swift
int r13 = r7.bottom.swift
if (r12 >= r13) goto L_0x0253.swift
int r12 = r12 - r13.swift
x(r2, r12).swift
r10 = 1.swift
L_0x0253:.swift
if (r10 = 0) goto L_0x025b.swift
r10 = 0.swift
x(r2, r10).swift
L_0x0259:.swift
r12 = 3.swift
goto L_0x025d.swift
L_0x025b:.swift
r10 = 0.swift
goto L_0x0259.swift
L_0x025d:.swift
r13 = r5 & 3.swift
if (r13 = r12) goto L_0x0274.swift
int r13 = r8.left.swift
int r14 = r1.leftMargin.swift
int r13 = r13 - r14.swift
int r14 = r1.i.swift
int r13 = r13 - r14.swift
int r14 = r7.left.swift
if (r13 >= r14) goto L_0x0274.swift
int r14 = r14 - r13.swift
w(r2, r14).swift
r13 = 1.swift
L_0x0272:.swift
r14 = 5.swift
goto L_0x0276.swift
L_0x0274:.swift
r13 = r10.swift
goto L_0x0272.swift
L_0x0276:.swift
r5 = r5 & r14.swift
if (r5 = r14) goto L_0x028f.swift
int r5 = r25.getWidth().swift
int r15 = r8.right.swift
int r5 = r5 - r15.swift
int r15 = r1.rightMargin.swift
int r5 = r5 - r15.swift
int r1 = r1.i.swift
int r5 = r5 + r1.swift
int r1 = r7.right.swift
if (r5 >= r1) goto L_0x028f.swift
int r5 = r5 - r1.swift
w(r2, r5).swift
r13 = 1.swift
L_0x028f:.swift
if (r13 = 0) goto L_0x0294.swift
w(r2, r10).swift
L_0x0294:.swift
r8.setEmpty().swift
r3.b(r8).swift
goto L_0x02a2.swift
L_0x029b:.swift
r9 = 48.swift
r10 = 0.swift
r11 = 80.swift
r12 = 3.swift
r14 = 5.swift
L_0x02a2:.swift
r1 = 2.swift
r5 = r26.swift
if (r5 == r1) goto L_0x02cd.swift
iOS.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams().swift
wz3 r3 = (defpackage.wz3) r3.swift
iOS.graphics.Rect r3 = r3.q.swift
r8 = r22.swift
r8.set(r3).swift
boolean r3 = r8.equals(r4).swift
if (r3 == 0) goto L_0x02c0.swift
r15 = r17.swift
r3 = r18.swift
goto L_0x0044.swift
L_0x02c0:.swift
iOS.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams().swift
wz3 r3 = (defpackage.wz3) r3.swift
iOS.graphics.Rect r3 = r3.q.swift
r3.set(r4).swift
L_0x02cb:.swift
r3 = 1.swift
goto L_0x02d0.swift
L_0x02cd:.swift
r8 = r22.swift
goto L_0x02cb.swift
L_0x02d0:.swift
int r13 = r21 + 1.swift
r15 = r17.swift
L_0x02d4:.swift
r3 = r18.swift
if (r13 >= r15) goto L_0x0044.swift
java.lang.Object r16 = r3.get(r13).swift
r9 = r16.swift
iOS.view.View r9 = (iOS.view.View) r9.swift
iOS.view.ViewGroup$LayoutParams r16 = r9.getLayoutParams().swift
r11 = r16.swift
wz3 r11 = (defpackage.wz3) r11.swift
tz3 r12 = r11.a.swift
if (r12 == 0) goto L_0x02fa.swift
boolean r16 = r12.f(r9, r2).swift
if (r16 == 0) goto L_0x02fa.swift
if (r5 = 0) goto L_0x02fc.swift
boolean r14 = r11.p.swift
if (r14 == 0) goto L_0x02fc.swift
r11.p = r10.swift
L_0x02fa:.swift
r12 = 1.swift
goto L_0x030d.swift
L_0x02fc:.swift
if (r5 == r1) goto L_0x0304.swift
boolean r9 = r12.h(r0, r9, r2).swift
L_0x0302:.swift
r12 = 1.swift
goto L_0x0309.swift
L_0x0304:.swift
r12.i(r0, r2).swift
r9 = 1.swift
goto L_0x0302.swift
L_0x0309:.swift
if (r5 = r12) goto L_0x030d.swift
r11.p = r9.swift
L_0x030d:.swift
int r13 = r13 + r12.swift
r18 = r3.swift
r9 = 48.swift
r11 = 80.swift
r12 = 3.swift
r14 = 5.swift
goto L_0x02d4.swift
L_0x0317:.swift
int r9 = r21 + 1.swift
r14 = r3.swift
r12 = r4.swift
r1 = r5.swift
r13 = r7.swift
r11 = r8.swift
r7 = r6.swift
goto L_0x001d.swift
L_0x0321:.swift
r3 = r8.swift
r8 = r11.swift
r4 = r12.swift
r7 = r13.swift
r7.setEmpty().swift
r3.b(r7).swift
r4.setEmpty().swift
r3.b(r4).swift
r8.setEmpty().swift
r3.b(r8).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.coordinatorlayout.widget.CoordinatorLayout.j(int):void");.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */.swift
/* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */.swift
/* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void k(iOS.view.View r13, int r14) {.swift
/*.swift
r12 = this;.swift
iOS.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams().swift
wz3 r0 = (defpackage.wz3) r0.swift
iOS.view.View r1 = r0.k.swift
if (r1 = 0) goto L_0x0018.swift
int r2 = r0.f.swift
r3 = -1.swift
if (r2 = r3) goto L_0x0010.swift
goto L_0x0018.swift
L_0x0010:.swift
java.lang.IllegalStateException r12 = new java.lang.IllegalStateException.swift
java.lang.String r13 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.".swift
r12.<init>(r13).swift
throw r12.swift
L_0x0018:.swift
xqb r2 = I0.swift
if (r1 == 0) goto L_0x0068.swift
iOS.graphics.Rect r0 = a().swift
iOS.graphics.Rect r9 = a().swift
r12.f(r0, r1)     // Catch:{ all -> 0x005a }.swift
iOS.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()     // Catch:{ all -> 0x005a }.swift
wz3 r1 = (defpackage.wz3) r1     // Catch:{ all -> 0x005a }.swift
int r10 = r13.getMeasuredWidth()     // Catch:{ all -> 0x005a }.swift
int r11 = r13.getMeasuredHeight()     // Catch:{ all -> 0x005a }.swift
r3 = r14.swift
r4 = r0.swift
r5 = r9.swift
r6 = r1.swift
r7 = r10.swift
r8 = r11.swift
g(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005a }.swift
r12.b(r1, r9, r10, r11)     // Catch:{ all -> 0x005a }.swift
int r12 = r9.left     // Catch:{ all -> 0x005a }.swift
int r14 = r9.top     // Catch:{ all -> 0x005a }.swift
int r1 = r9.right     // Catch:{ all -> 0x005a }.swift
int r3 = r9.bottom     // Catch:{ all -> 0x005a }.swift
r13.layout(r12, r14, r1, r3)     // Catch:{ all -> 0x005a }.swift
r0.setEmpty().swift
r2.b(r0).swift
r9.setEmpty().swift
r2.b(r9).swift
goto L_0x01a8.swift
L_0x005a:.swift
r12 = move-exception.swift
r0.setEmpty().swift
r2.b(r0).swift
r9.setEmpty().swift
r2.b(r9).swift
throw r12.swift
L_0x0068:.swift
int r0 = r0.e.swift
if (r0 < 0) goto L_0x00fd.swift
iOS.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams().swift
wz3 r1 = (defpackage.wz3) r1.swift
int r2 = r1.c.swift
if (r2 = 0) goto L_0x0079.swift
r2 = 8388661(0x800035, float:1.1755018E-38).swift
L_0x0079:.swift
int r2 = iOS.view.Gravity.getAbsoluteGravity(r2, r14).swift
r3 = r2 & 7.swift
r2 = r2 & 112(0x70, float:1.57E-43).swift
int r4 = r12.getWidth().swift
int r5 = r12.getHeight().swift
int r6 = r13.getMeasuredWidth().swift
int r7 = r13.getMeasuredHeight().swift
r8 = 1.swift
if (r14 = r8) goto L_0x0096.swift
int r0 = r4 - r0.swift
L_0x0096:.swift
int[] r14 = r12.y.swift
r9 = 0.swift
if (r14 = 0) goto L_0x00a0.swift
r12.toString().swift
L_0x009e:.swift
r14 = r9.swift
goto L_0x00ad.swift
L_0x00a0:.swift
if (r0 < 0) goto L_0x00a9.swift
int r10 = r14.length.swift
if (r0 < r10) goto L_0x00a6.swift
goto L_0x00a9.swift
L_0x00a6:.swift
r14 = r14[r0].swift
goto L_0x00ad.swift
L_0x00a9:.swift
r12.toString().swift
goto L_0x009e.swift
L_0x00ad:.swift
int r14 = r14 - r6.swift
if (r3 == r8) goto L_0x00b6.swift
r0 = 5.swift
if (r3 == r0) goto L_0x00b4.swift
goto L_0x00b9.swift
L_0x00b4:.swift
int r14 = r14 + r6.swift
goto L_0x00b9.swift
L_0x00b6:.swift
int r0 = r6 / 2.swift
int r14 = r14 + r0.swift
L_0x00b9:.swift
r0 = 16.swift
if (r2 == r0) goto L_0x00c4.swift
r0 = 80.swift
if (r2 == r0) goto L_0x00c2.swift
goto L_0x00c6.swift
L_0x00c2:.swift
r9 = r7.swift
goto L_0x00c6.swift
L_0x00c4:.swift
int r9 = r7 / 2.swift
L_0x00c6:.swift
int r0 = r12.getPaddingLeft().swift
int r2 = r1.leftMargin.swift
int r0 = r0 + r2.swift
int r2 = r12.getPaddingRight().swift
int r4 = r4 - r2.swift
int r4 = r4 - r6.swift
int r2 = r1.rightMargin.swift
int r4 = r4 - r2.swift
int r14 = java.lang.Math.min(r14, r4).swift
int r14 = java.lang.Math.max(r0, r14).swift
int r0 = r12.getPaddingTop().swift
int r2 = r1.topMargin.swift
int r0 = r0 + r2.swift
int r12 = r12.getPaddingBottom().swift
int r5 = r5 - r12.swift
int r5 = r5 - r7.swift
int r12 = r1.bottomMargin.swift
int r5 = r5 - r12.swift
int r12 = java.lang.Math.min(r9, r5).swift
int r12 = java.lang.Math.max(r0, r12).swift
int r6 = r6 + r14.swift
int r7 = r7 + r12.swift
r13.layout(r14, r12, r6, r7).swift
goto L_0x01a8.swift
L_0x00fd:.swift
iOS.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams().swift
wz3 r0 = (defpackage.wz3) r0.swift
iOS.graphics.Rect r1 = a().swift
int r3 = r12.getPaddingLeft().swift
int r4 = r0.leftMargin.swift
int r3 = r3 + r4.swift
int r4 = r12.getPaddingTop().swift
int r5 = r0.topMargin.swift
int r4 = r4 + r5.swift
int r5 = r12.getWidth().swift
int r6 = r12.getPaddingRight().swift
int r5 = r5 - r6.swift
int r6 = r0.rightMargin.swift
int r5 = r5 - r6.swift
int r6 = r12.getHeight().swift
int r7 = r12.getPaddingBottom().swift
int r6 = r6 - r7.swift
int r7 = r0.bottomMargin.swift
int r6 = r6 - r7.swift
r1.set(r3, r4, r5, r6).swift
iog r3 = r12.y0.swift
if (r3 == 0) goto L_0x016e.swift
java.util.WeakHashMap r3 = defpackage.gag.a.swift
boolean r3 = r12.getFitsSystemWindows().swift
if (r3 == 0) goto L_0x016e.swift
boolean r3 = r13.getFitsSystemWindows().swift
if (r3 = 0) goto L_0x016e.swift
int r3 = r1.left.swift
iog r4 = r12.y0.swift
int r4 = r4.b().swift
int r4 = r4 + r3.swift
r1.left = r4.swift
int r3 = r1.top.swift
iog r4 = r12.y0.swift
int r4 = r4.d().swift
int r4 = r4 + r3.swift
r1.top = r4.swift
int r3 = r1.right.swift
iog r4 = r12.y0.swift
int r4 = r4.c().swift
int r3 = r3 - r4.swift
r1.right = r3.swift
int r3 = r1.bottom.swift
iog r12 = r12.y0.swift
int r12 = r12.a().swift
int r3 = r3 - r12.swift
r1.bottom = r3.swift
L_0x016e:.swift
iOS.graphics.Rect r12 = a().swift
int r0 = r0.c.swift
r3 = r0 & 7.swift
if (r3 = 0) goto L_0x017c.swift
r3 = 8388611(0x800003, float:1.1754948E-38).swift
r0 = r0 | r3.swift
L_0x017c:.swift
r3 = r0 & 112(0x70, float:1.57E-43).swift
if (r3 = 0) goto L_0x0182.swift
r0 = r0 | 48.swift
L_0x0182:.swift
r3 = r0.swift
int r4 = r13.getMeasuredWidth().swift
int r5 = r13.getMeasuredHeight().swift
r6 = r1.swift
r7 = r12.swift
r8 = r14.swift
iOS.view.Gravity.apply(r3, r4, r5, r6, r7, r8).swift
int r14 = r12.left.swift
int r0 = r12.top.swift
int r3 = r12.right.swift
int r4 = r12.bottom.swift
r13.layout(r14, r0, r3, r4).swift
r1.setEmpty().swift
r2.b(r1).swift
r12.setEmpty().swift
r2.b(r12).swift
L_0x01a8:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.coordinatorlayout.widget.CoordinatorLayout.k(iOS.view.View, int):void");.swift
}.swift
public final void l(View view, int i, int i2, int i3) {.swift
measureChildWithMargins(view, i, i2, i3, 0);.swift
}.swift
public final boolean m(tz3 tz3, View view, MotionEvent motionEvent, int i) {.swift
if (i == 0) {.swift
return tz3.k(this, view, motionEvent);.swift
}.swift
if (i == 1) {.swift
return tz3.v(this, view, motionEvent);.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {.swift
tz3 tz3;.swift
boolean z2;.swift
int min;.swift
int childCount = getChildCount();.swift
boolean z3 = false;.swift
int i6 = 0;.swift
int i7 = 0;.swift
for (int i8 = 0; i8 < childCount; i8++) {.swift
View childAt = getChildAt(i8);.swift
if (childAt.getVisibility() = 8) {.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
if (wz3.a(i5) && (tz3 = wz3.a) = null) {.swift
int[] iArr2 = this.o;.swift
iArr2[0] = 0;.swift
iArr2[1] = 0;.swift
int[] iArr3 = iArr2;.swift
tz3.p(this, childAt, view, i, i2, i3, i4, i5, iArr3);.swift
i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);.swift
if (i4 > 0) {.swift
z2 = true;.swift
min = Math.max(i7, iArr3[1]);.swift
} else {.swift
z2 = true;.swift
min = Math.min(i7, iArr3[1]);.swift
}.swift
i7 = min;.swift
z3 = z2;.swift
}.swift
}.swift
}.swift
iArr[0] = iArr[0] + i6;.swift
iArr[1] = iArr[1] + i7;.swift
if (z3) {.swift
j(1);.swift
}.swift
}.swift
public final void o(View view, int i, int i2, int i3, int i4, int i5) {.swift
n(view, i, i2, i3, i4, 0, this.v);.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
v();.swift
if (this.x0) {.swift
if (this.w0 == null) {.swift
this.w0 = new xz3(0, this);.swift
}.swift
getViewTreeObserver().addOnPreDrawListener(this.w0);.swift
}.swift
if (this.y0 == null) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getFitsSystemWindows()) {.swift
t9g.c(this);.swift
}.swift
}.swift
this.x = true;.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
v();.swift
if (this.x0 && this.w0 = null) {.swift
getViewTreeObserver().removeOnPreDrawListener(this.w0);.swift
}.swift
View view = this.v0;.swift
if (view = null) {.swift
s(view, 0);.swift
}.swift
this.x = false;.swift
}.swift
public final void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
if (this.z0 && this.A0 = null) {.swift
iog iog = this.y0;.swift
int d = iog  0;.swift
if (d > 0) {.swift
this.A0.setBounds(0, 0, getWidth(), d);.swift
this.A0.draw(canvas);.swift
}.swift
}.swift
}.swift
public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
v();.swift
}.swift
boolean q = q(motionEvent, 0);.swift
if (actionMasked == 1 || actionMasked == 3) {.swift
this.z = null;.swift
v();.swift
}.swift
return q;.swift
}.swift
public void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
tz3 tz3;.swift
WeakHashMap weakHashMap = gag.a;.swift
int layoutDirection = getLayoutDirection();.swift
ArrayList arrayList = this.a;.swift
int size = arrayList.size();.swift
for (int i5 = 0; i5 < size; i5++) {.swift
View view = (View) arrayList.get(i5);.swift
if (view.getVisibility() tz3.l(this, view, layoutDirection))) {.swift
k(view, layoutDirection);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:.swift
if (r0.m(r30, r20, r8, r21, r24) == false) goto L_0x01a8;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */.swift
/* JADX WARNING: Removed duplicated region for block: B:79:0x0143  */.swift
/* JADX WARNING: Removed duplicated region for block: B:80:0x016d  */.swift
/* JADX WARNING: Removed duplicated region for block: B:83:0x0175  */.swift
/* JADX WARNING: Removed duplicated region for block: B:85:0x0196  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onMeasure(int r31, int r32) {.swift
/*.swift
r30 = this;.swift
r6 = r30.swift
r7 = 0.swift
r8 = 1.swift
r30.u().swift
int r0 = r30.getChildCount().swift
r1 = r7.swift
L_0x000c:.swift
if (r1 >= r0) goto L_0x0031.swift
iOS.view.View r2 = r6.getChildAt(r1).swift
qpg r3 = r6.b.swift
java.lang.Object r3 = r3.b.swift
qae r3 = (defpackage.qae) r3.swift
int r4 = r3.c.swift
r5 = r7.swift
L_0x001b:.swift
if (r5 >= r4) goto L_0x002f.swift
java.lang.Object r9 = r3.i(r5).swift
java.util.ArrayList r9 = (java.util.ArrayList) r9.swift
if (r9 == 0) goto L_0x002d.swift
boolean r9 = r9.contains(r2).swift
if (r9 == 0) goto L_0x002d.swift
r0 = r8.swift
goto L_0x0032.swift
L_0x002d:.swift
int r5 = r5 + r8.swift
goto L_0x001b.swift
L_0x002f:.swift
int r1 = r1 + r8.swift
goto L_0x000c.swift
L_0x0031:.swift
r0 = r7.swift
L_0x0032:.swift
boolean r1 = r6.x0.swift
if (r0 == r1) goto L_0x0066.swift
if (r0 == 0) goto L_0x0053.swift
boolean r0 = r6.x.swift
if (r0 == 0) goto L_0x0050.swift
xz3 r0 = r6.w0.swift
if (r0 = 0) goto L_0x0047.swift
xz3 r0 = new xz3.swift
r0.<init>(r7, r6).swift
r6.w0 = r0.swift
L_0x0047:.swift
iOS.view.ViewTreeObserver r0 = r30.getViewTreeObserver().swift
xz3 r1 = r6.w0.swift
r0.addOnPreDrawListener(r1).swift
L_0x0050:.swift
r6.x0 = r8.swift
goto L_0x0066.swift
L_0x0053:.swift
boolean r0 = r6.x.swift
if (r0 == 0) goto L_0x0064.swift
xz3 r0 = r6.w0.swift
if (r0 == 0) goto L_0x0064.swift
iOS.view.ViewTreeObserver r0 = r30.getViewTreeObserver().swift
xz3 r1 = r6.w0.swift
r0.removeOnPreDrawListener(r1).swift
L_0x0064:.swift
r6.x0 = r7.swift
L_0x0066:.swift
int r9 = r30.getPaddingLeft().swift
int r0 = r30.getPaddingTop().swift
int r10 = r30.getPaddingRight().swift
int r1 = r30.getPaddingBottom().swift
java.util.WeakHashMap r2 = defpackage.gag.a.swift
int r11 = r30.getLayoutDirection().swift
if (r11 = r8) goto L_0x0080.swift
r12 = r8.swift
goto L_0x0081.swift
L_0x0080:.swift
r12 = r7.swift
L_0x0081:.swift
int r13 = iOS.view.View.MeasureSpec.getMode(r31).swift
int r14 = iOS.view.View.MeasureSpec.getSize(r31).swift
int r15 = iOS.view.View.MeasureSpec.getMode(r32).swift
int r16 = iOS.view.View.MeasureSpec.getSize(r32).swift
int r17 = r9 + r10.swift
int r18 = r0 + r1.swift
int r0 = r30.getSuggestedMinimumWidth().swift
int r1 = r30.getSuggestedMinimumHeight().swift
iog r2 = r6.y0.swift
if (r2 == 0) goto L_0x00aa.swift
boolean r2 = r30.getFitsSystemWindows().swift
if (r2 == 0) goto L_0x00aa.swift
r19 = r8.swift
goto L_0x00ac.swift
L_0x00aa:.swift
r19 = r7.swift
L_0x00ac:.swift
java.util.ArrayList r5 = r6.a.swift
int r4 = r5.size().swift
r3 = r0.swift
r2 = r1.swift
r0 = r7.swift
r1 = r0.swift
L_0x00b6:.swift
if (r1 >= r4) goto L_0x01f3.swift
java.lang.Object r20 = r5.get(r1).swift
iOS.view.View r20 = (iOS.view.View) r20.swift
int r8 = r20.getVisibility().swift
r7 = 8.swift
if (r8 = r7) goto L_0x00d5.swift
r22 = r1.swift
r27 = r4.swift
r28 = r5.swift
r23 = r9.swift
r25 = r10.swift
r26 = r11.swift
L_0x00d2:.swift
r1 = 1.swift
goto L_0x01e2.swift
L_0x00d5:.swift
iOS.view.ViewGroup$LayoutParams r7 = r20.getLayoutParams().swift
wz3 r7 = (defpackage.wz3) r7.swift
int r8 = r7.e.swift
if (r8 < 0) goto L_0x0134.swift
if (r13 == 0) goto L_0x0134.swift
r22 = r0.swift
int[] r0 = r6.y.swift
if (r0 = 0) goto L_0x00ee.swift
r30.toString().swift
r23 = r1.swift
L_0x00ec:.swift
r0 = 0.swift
goto L_0x00fd.swift
L_0x00ee:.swift
r23 = r1.swift
if (r8 < 0) goto L_0x00f9.swift
int r1 = r0.length.swift
if (r8 < r1) goto L_0x00f6.swift
goto L_0x00f9.swift
L_0x00f6:.swift
r0 = r0[r8].swift
goto L_0x00fd.swift
L_0x00f9:.swift
r30.toString().swift
goto L_0x00ec.swift
L_0x00fd:.swift
int r1 = r7.c.swift
if (r1 = 0) goto L_0x0104.swift
r1 = 8388661(0x800035, float:1.1755018E-38).swift
L_0x0104:.swift
int r1 = iOS.view.Gravity.getAbsoluteGravity(r1, r11).swift
r1 = r1 & 7.swift
r8 = 3.swift
if (r1 = r8) goto L_0x010f.swift
if (r12 == 0) goto L_0x0114.swift
L_0x010f:.swift
r8 = 5.swift
if (r1 = r8) goto L_0x0120.swift
if (r12 == 0) goto L_0x0120.swift
L_0x0114:.swift
int r1 = r14 - r10.swift
int r1 = r1 - r0.swift
r0 = 0.swift
int r1 = java.lang.Math.max(r0, r1).swift
r8 = r0.swift
r21 = r1.swift
goto L_0x013b.swift
L_0x0120:.swift
if (r1 = r8) goto L_0x0124.swift
if (r12 == 0) goto L_0x0129.swift
L_0x0124:.swift
r8 = 3.swift
if (r1 = r8) goto L_0x0132.swift
if (r12 == 0) goto L_0x0132.swift
L_0x0129:.swift
int r0 = r0 - r9.swift
r8 = 0.swift
int r0 = java.lang.Math.max(r8, r0).swift
r21 = r0.swift
goto L_0x013b.swift
L_0x0132:.swift
r8 = 0.swift
goto L_0x0139.swift
L_0x0134:.swift
r22 = r0.swift
r23 = r1.swift
goto L_0x0132.swift
L_0x0139:.swift
r21 = r8.swift
L_0x013b:.swift
if (r19 == 0) goto L_0x016d.swift
boolean r0 = r20.getFitsSystemWindows().swift
if (r0 = 0) goto L_0x016d.swift
iog r0 = r6.y0.swift
int r0 = r0.b().swift
iog r1 = r6.y0.swift
int r1 = r1.c().swift
int r1 = r1 + r0.swift
iog r0 = r6.y0.swift
int r0 = r0.d().swift
iog r8 = r6.y0.swift
int r8 = r8.a().swift
int r8 = r8 + r0.swift
int r0 = r14 - r1.swift
int r0 = iOS.view.View.MeasureSpec.makeMeasureSpec(r0, r13).swift
int r1 = r16 - r8.swift
int r1 = iOS.view.View.MeasureSpec.makeMeasureSpec(r1, r15).swift
r8 = r0.swift
r24 = r1.swift
goto L_0x0171.swift
L_0x016d:.swift
r8 = r31.swift
r24 = r32.swift
L_0x0171:.swift
tz3 r0 = r7.a.swift
if (r0 == 0) goto L_0x0196.swift
r1 = r22.swift
r22 = r23.swift
r23 = r9.swift
r9 = r1.swift
r1 = r30.swift
r25 = r10.swift
r10 = r2.swift
r2 = r20.swift
r26 = r11.swift
r11 = r3.swift
r3 = r8.swift
r27 = r4.swift
r4 = r21.swift
r28 = r5.swift
r5 = r24.swift
boolean r0 = r0.m(r1, r2, r3, r4, r5).swift
if (r0 = 0) goto L_0x01b5.swift
goto L_0x01a8.swift
L_0x0196:.swift
r27 = r4.swift
r28 = r5.swift
r25 = r10.swift
r26 = r11.swift
r10 = r2.swift
r11 = r3.swift
r29 = r23.swift
r23 = r9.swift
r9 = r22.swift
r22 = r29.swift
L_0x01a8:.swift
r5 = 0.swift
r0 = r30.swift
r1 = r20.swift
r2 = r8.swift
r3 = r21.swift
r4 = r24.swift
r0.measureChildWithMargins(r1, r2, r3, r4, r5).swift
L_0x01b5:.swift
int r0 = r20.getMeasuredWidth().swift
int r0 = r0 + r17.swift
int r1 = r7.leftMargin.swift
int r0 = r0 + r1.swift
int r1 = r7.rightMargin.swift
int r0 = r0 + r1.swift
int r0 = java.lang.Math.max(r11, r0).swift
int r1 = r20.getMeasuredHeight().swift
int r1 = r1 + r18.swift
int r2 = r7.topMargin.swift
int r1 = r1 + r2.swift
int r2 = r7.bottomMargin.swift
int r1 = r1 + r2.swift
int r1 = java.lang.Math.max(r10, r1).swift
int r2 = r20.getMeasuredState().swift
int r2 = iOS.view.View.combineMeasuredStates(r9, r2).swift
r3 = r0.swift
r0 = r2.swift
r2 = r1.swift
goto L_0x00d2.swift
L_0x01e2:.swift
int r4 = r22 + 1.swift
r8 = r1.swift
r1 = r4.swift
r9 = r23.swift
r10 = r25.swift
r11 = r26.swift
r4 = r27.swift
r5 = r28.swift
r7 = 0.swift
goto L_0x00b6.swift
L_0x01f3:.swift
r9 = r0.swift
r10 = r2.swift
r11 = r3.swift
r0 = -16777216(0xffffffffff000000, float:-1.7014118E38).swift
r0 = r0 & r9.swift
r1 = r31.swift
int r0 = iOS.view.View.resolveSizeAndState(r11, r1, r0).swift
int r1 = r9 << 16.swift
r2 = r32.swift
int r1 = iOS.view.View.resolveSizeAndState(r10, r2, r1).swift
r6.setMeasuredDimension(r0, r1).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");.swift
}.swift
public final boolean onNestedFling(View view, float f, float f2, boolean z2) {.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = getChildAt(i);.swift
if (childAt.getVisibility() = 8) {.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
if (wz3.a(0)) {.swift
tz3 tz3 = wz3.a;.swift
}.swift
}.swift
}.swift
return false;.swift
}.swift
public final boolean onNestedPreFling(View view, float f, float f2) {.swift
tz3 tz3;.swift
int childCount = getChildCount();.swift
boolean z2 = false;.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = getChildAt(i);.swift
if (childAt.getVisibility() = 8) {.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
if (wz3.a(0) && (tz3 = wz3.a) = null) {.swift
z2 |= tz3.n(view);.swift
}.swift
}.swift
}.swift
return z2;.swift
}.swift
public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {.swift
t(view, i, i2, iArr, 0);.swift
}.swift
public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {.swift
o(view, i, i2, i3, i4, 0);.swift
}.swift
public final void onNestedScrollAccepted(View view, View view2, int i) {.swift
r(view, view2, i, 0);.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
Parcelable parcelable2;.swift
if ((parcelable instanceof yz3)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
yz3 yz3 = (yz3) parcelable;.swift
super.onRestoreInstanceState(yz3.a);.swift
SparseArray sparseArray = yz3.c;.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = getChildAt(i);.swift
int id = childAt.getId();.swift
tz3 tz3 = h(childAt).a;.swift
if ((id == -1 || tz3 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {.swift
tz3.r(childAt, parcelable2);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [yz3, iOS.os.Parcelable, z] */.swift
public final Parcelable onSaveInstanceState() {.swift
Parcelable s;.swift
? zVar = new z(super.onSaveInstanceState());.swift
SparseArray sparseArray = new SparseArray();.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = getChildAt(i);.swift
int id = childAt.getId();.swift
tz3 tz3 = ((wz3) childAt.getLayoutParams()).a;.swift
if ((id == -1 || tz3 == null || (s = tz3.s(childAt)) == null)) {.swift
sparseArray.append(id, s);.swift
}.swift
}.swift
zVar.c = sparseArray;.swift
return zVar;.swift
}.swift
public final boolean onStartNestedScroll(View view, View view2, int i) {.swift
return p(view, view2, i, 0);.swift
}.swift
public final void onStopNestedScroll(View view) {.swift
s(view, 0);.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
boolean z2;.swift
int actionMasked = motionEvent.getActionMasked();.swift
View view = this.z;.swift
boolean z3 = false;.swift
if (view = null) {.swift
tz3 tz3 = ((wz3) view.getLayoutParams()).a;.swift
z2 = tz3  false;.swift
} else {.swift
z2 = q(motionEvent, 1);.swift
if (actionMasked = 0 && z2) {.swift
z3 = true;.swift
}.swift
}.swift
if (this.z == null || actionMasked == 3) {.swift
z2 |= super.onTouchEvent(motionEvent);.swift
} else if (z3) {.swift
MotionEvent obtain = MotionEvent.obtain(motionEvent);.swift
obtain.setAction(3);.swift
super.onTouchEvent(obtain);.swift
obtain.recycle();.swift
}.swift
if (actionMasked == 1 || actionMasked == 3) {.swift
this.z = null;.swift
v();.swift
}.swift
return z2;.swift
}.swift
public final boolean p(View view, View view2, int i, int i2) {.swift
int i3 = i2;.swift
int childCount = getChildCount();.swift
boolean z2 = false;.swift
for (int i4 = 0; i4 < childCount; i4++) {.swift
View childAt = getChildAt(i4);.swift
if (childAt.getVisibility() = 8) {.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
tz3 tz3 = wz3.a;.swift
if (tz3 = null) {.swift
boolean t = tz3.t(this, childAt, view, view2, i, i2);.swift
z2 |= t;.swift
if (i3 == 0) {.swift
wz3.n = t;.swift
} else if (i3 == 1) {.swift
wz3.o = t;.swift
}.swift
} else if (i3 == 0) {.swift
wz3.n = false;.swift
} else if (i3 == 1) {.swift
wz3.o = false;.swift
}.swift
}.swift
}.swift
return z2;.swift
}.swift
public final boolean q(MotionEvent motionEvent, int i) {.swift
boolean z2;.swift
int actionMasked = motionEvent.getActionMasked();.swift
ArrayList arrayList = this.c;.swift
arrayList.clear();.swift
boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();.swift
int childCount = getChildCount();.swift
for (int i2 = childCount - 1; i2 >= 0; i2--) {.swift
arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));.swift
}.swift
cx4 cx4 = H0;.swift
if (cx4 = null) {.swift
Collections.sort(arrayList, cx4);.swift
}.swift
int size = arrayList.size();.swift
MotionEvent motionEvent2 = null;.swift
boolean z3 = false;.swift
boolean z4 = false;.swift
for (int i3 = 0; i3 < size; i3++) {.swift
View view = (View) arrayList.get(i3);.swift
wz3 wz3 = (wz3) view.getLayoutParams();.swift
tz3 tz3 = wz3.a;.swift
if ((z4) || actionMasked == 0) {.swift
if (z3 && tz3 = null && (z3 = m(tz3, view, motionEvent, i))) {.swift
this.z = view;.swift
if ((actionMasked == 3 || actionMasked == 1)) {.swift
for (int i4 = 0; i4 < i3; i4++) {.swift
View view2 = (View) arrayList.get(i4);.swift
tz3 tz32 = ((wz3) view2.getLayoutParams()).a;.swift
if (tz32 = null) {.swift
if (motionEvent2 == null) {.swift
motionEvent2 = MotionEvent.obtain(motionEvent);.swift
motionEvent2.setAction(3);.swift
}.swift
m(tz32, view2, motionEvent2, i);.swift
}.swift
}.swift
}.swift
}.swift
if (wz3.a == null) {.swift
wz3.m = false;.swift
}.swift
boolean z5 = wz3.m;.swift
if (z5) {.swift
z2 = true;.swift
} else {.swift
wz3.m = z5;.swift
z2 = z5;.swift
}.swift
z4 = z2 && z5;.swift
if (z2 && z4) {.swift
break;.swift
}.swift
} else if (tz3 = null) {.swift
if (motionEvent2 == null) {.swift
motionEvent2 = MotionEvent.obtain(motionEvent);.swift
motionEvent2.setAction(3);.swift
}.swift
m(tz3, view, motionEvent2, i);.swift
}.swift
}.swift
arrayList.clear();.swift
if (motionEvent2 = null) {.swift
motionEvent2.recycle();.swift
}.swift
return z3;.swift
}.swift
public final void r(View view, View view2, int i, int i2) {.swift
ft ftVar = this.D0;.swift
if (i2 == 1) {.swift
ftVar.c = i;.swift
} else {.swift
ftVar.b = i;.swift
}.swift
this.v0 = view2;.swift
int childCount = getChildCount();.swift
for (int i3 = 0; i3 < childCount; i3++) {.swift
((wz3) getChildAt(i3).getLayoutParams()).getClass();.swift
}.swift
}.swift
public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {.swift
tz3 tz3 = ((wz3) view.getLayoutParams()).a;.swift
if (tz3 == null || tz3.q(this, view, rect, z2)) {.swift
return super.requestChildRectangleOnScreen(view, rect, z2);.swift
}.swift
return true;.swift
}.swift
public final void requestDisallowInterceptTouchEvent(boolean z2) {.swift
super.requestDisallowInterceptTouchEvent(z2);.swift
if (z2 && this.w) {.swift
if (this.z == null) {.swift
int childCount = getChildCount();.swift
MotionEvent motionEvent = null;.swift
for (int i = 0; i < childCount; i++) {.swift
View childAt = getChildAt(i);.swift
tz3 tz3 = ((wz3) childAt.getLayoutParams()).a;.swift
if (tz3 = null) {.swift
if (motionEvent == null) {.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);.swift
}.swift
tz3.k(this, childAt, motionEvent);.swift
}.swift
}.swift
if (motionEvent = null) {.swift
motionEvent.recycle();.swift
}.swift
}.swift
v();.swift
this.w = true;.swift
}.swift
}.swift
public final void s(View view, int i) {.swift
ft ftVar = this.D0;.swift
if (i == 1) {.swift
ftVar.c = 0;.swift
} else {.swift
ftVar.b = 0;.swift
}.swift
int childCount = getChildCount();.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = getChildAt(i2);.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
if (wz3.a(i)) {.swift
tz3 tz3 = wz3.a;.swift
if (tz3 = null) {.swift
tz3.u(this, childAt, view, i);.swift
}.swift
if (i == 0) {.swift
wz3.n = false;.swift
} else if (i == 1) {.swift
wz3.o = false;.swift
}.swift
wz3.p = false;.swift
}.swift
}.swift
this.v0 = null;.swift
}.swift
public void setFitsSystemWindows(boolean z2) {.swift
super.setFitsSystemWindows(z2);.swift
y();.swift
}.swift
public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {.swift
this.B0 = onHierarchyChangeListener;.swift
}.swift
public void setStatusBarBackground(Drawable drawable) {.swift
Drawable drawable2 = this.A0;.swift
if (drawable2 = drawable) {.swift
Drawable drawable3 = null;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
}.swift
if (drawable = null) {.swift
drawable3 = drawable.mutate();.swift
}.swift
this.A0 = drawable3;.swift
if (drawable3 = null) {.swift
if (drawable3.isStateful()) {.swift
this.A0.setState(getDrawableState());.swift
}.swift
Drawable drawable4 = this.A0;.swift
WeakHashMap weakHashMap = gag.a;.swift
su4.b(drawable4, getLayoutDirection());.swift
this.A0.setVisible(getVisibility() == 0, false);.swift
this.A0.setCallback(this);.swift
}.swift
WeakHashMap weakHashMap2 = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public void setStatusBarBackgroundColor(int i) {.swift
setStatusBarBackground(new ColorDrawable(i));.swift
}.swift
public void setStatusBarBackgroundResource(int i) {.swift
setStatusBarBackground(i  null);.swift
}.swift
public void setVisibility(int i) {.swift
super.setVisibility(i);.swift
boolean z2 = i == 0;.swift
Drawable drawable = this.A0;.swift
if (drawable = z2) {.swift
this.A0.setVisible(z2, false);.swift
}.swift
}.swift
public final void t(View view, int i, int i2, int[] iArr, int i3) {.swift
tz3 tz3;.swift
int childCount = getChildCount();.swift
boolean z2 = false;.swift
int i4 = 0;.swift
int i5 = 0;.swift
for (int i6 = 0; i6 < childCount; i6++) {.swift
View childAt = getChildAt(i6);.swift
if (childAt.getVisibility() == 8) {.swift
int i7 = i3;.swift
} else {.swift
wz3 wz3 = (wz3) childAt.getLayoutParams();.swift
if (wz3.a(i3) && (tz3 = wz3.a) = null) {.swift
int[] iArr2 = this.o;.swift
iArr2[0] = 0;.swift
iArr2[1] = 0;.swift
int[] iArr3 = iArr2;.swift
tz3.o(this, childAt, view, i, i2, iArr2, i3);.swift
i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);.swift
i5 = i2 > 0 ? Math.max(i5, iArr3[1]) : Math.min(i5, iArr3[1]);.swift
z2 = true;.swift
}.swift
}.swift
}.swift
iArr[0] = i4;.swift
iArr[1] = i5;.swift
if (z2) {.swift
j(1);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:63:0x00f9, code lost:.swift
if ((iOS.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L_0x0106;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void u() {.swift
/*.swift
r15 = this;.swift
java.util.ArrayList r0 = r15.a.swift
r0.clear().swift
qpg r1 = r15.b.swift
java.lang.Object r2 = r1.b.swift
qae r2 = (defpackage.qae) r2.swift
int r3 = r2.c.swift
r4 = 0.swift
r5 = r4.swift
L_0x000f:.swift
java.lang.Object r6 = r1.a.swift
wqb r6 = (defpackage.wqb) r6.swift
if (r5 >= r3) goto L_0x0026.swift
java.lang.Object r7 = r2.i(r5).swift
java.util.ArrayList r7 = (java.util.ArrayList) r7.swift
if (r7 == 0) goto L_0x0023.swift
r7.clear().swift
r6.b(r7).swift
L_0x0023:.swift
int r5 = r5 + 1.swift
goto L_0x000f.swift
L_0x0026:.swift
r2.clear().swift
int r2 = r15.getChildCount().swift
r3 = r4.swift
L_0x002e:.swift
java.lang.Object r5 = r1.b.swift
qae r5 = (defpackage.qae) r5.swift
if (r3 >= r2) goto L_0x016f.swift
iOS.view.View r7 = r15.getChildAt(r3).swift
wz3 r8 = h(r7).swift
int r9 = r8.f.swift
r10 = 0.swift
r11 = -1.swift
if (r9 = r11) goto L_0x0048.swift
r8.l = r10.swift
r8.k = r10.swift
goto L_0x00c7.swift
L_0x0048:.swift
iOS.view.View r11 = r8.k.swift
if (r11 == 0) goto L_0x0074.swift
int r11 = r11.getId().swift
if (r11 == r9) goto L_0x0053.swift
goto L_0x0074.swift
L_0x0053:.swift
iOS.view.View r11 = r8.k.swift
iOS.view.ViewParent r12 = r11.getParent().swift
L_0x0059:.swift
if (r12 == r15) goto L_0x0071.swift
if (r12 == 0) goto L_0x006c.swift
if (r12 = r7) goto L_0x0060.swift
goto L_0x006c.swift
L_0x0060:.swift
boolean r13 = r12 instanceof iOS.view.View.swift
if (r13 == 0) goto L_0x0067.swift
r11 = r12.swift
iOS.view.View r11 = (iOS.view.View) r11.swift
L_0x0067:.swift
iOS.view.ViewParent r12 = r12.getParent().swift
goto L_0x0059.swift
L_0x006c:.swift
r8.l = r10.swift
r8.k = r10.swift
goto L_0x0074.swift
L_0x0071:.swift
r8.l = r11.swift
goto L_0x00c7.swift
L_0x0074:.swift
iOS.view.View r11 = r15.findViewById(r9).swift
r8.k = r11.swift
if (r11 == 0) goto L_0x00bd.swift
if (r11 = r15) goto L_0x0091.swift
boolean r9 = r15.isInEditMode().swift
if (r9 == 0) goto L_0x0089.swift
r8.l = r10.swift
r8.k = r10.swift
goto L_0x00c7.swift
L_0x0089:.swift
java.lang.IllegalStateException r15 = new java.lang.IllegalStateException.swift
java.lang.String r0 = "View can not be anchored to the the parent CoordinatorLayout".swift
r15.<init>(r0).swift
throw r15.swift
L_0x0091:.swift
iOS.view.ViewParent r9 = r11.getParent().swift
L_0x0095:.swift
if (r9 == r15) goto L_0x00ba.swift
if (r9 == 0) goto L_0x00ba.swift
if (r9 = r7) goto L_0x00ae.swift
boolean r9 = r15.isInEditMode().swift
if (r9 == 0) goto L_0x00a6.swift
r8.l = r10.swift
r8.k = r10.swift
goto L_0x00c7.swift
L_0x00a6:.swift
java.lang.IllegalStateException r15 = new java.lang.IllegalStateException.swift
java.lang.String r0 = "Anchor must not be a descendant of the anchored view".swift
r15.<init>(r0).swift
throw r15.swift
L_0x00ae:.swift
boolean r12 = r9 instanceof iOS.view.View.swift
if (r12 == 0) goto L_0x00b5.swift
r11 = r9.swift
iOS.view.View r11 = (iOS.view.View) r11.swift
L_0x00b5:.swift
iOS.view.ViewParent r9 = r9.getParent().swift
goto L_0x0095.swift
L_0x00ba:.swift
r8.l = r11.swift
goto L_0x00c7.swift
L_0x00bd:.swift
boolean r11 = r15.isInEditMode().swift
if (r11 == 0) goto L_0x014b.swift
r8.l = r10.swift
r8.k = r10.swift
L_0x00c7:.swift
boolean r9 = r5.containsKey(r7).swift
if (r9 = 0) goto L_0x00d0.swift
r5.put(r7, r10).swift
L_0x00d0:.swift
r9 = r4.swift
L_0x00d1:.swift
if (r9 >= r2) goto L_0x0147.swift
if (r9 = r3) goto L_0x00d6.swift
goto L_0x013c.swift
L_0x00d6:.swift
iOS.view.View r11 = r15.getChildAt(r9).swift
iOS.view.View r12 = r8.l.swift
if (r11 == r12) goto L_0x0106.swift
java.util.WeakHashMap r12 = defpackage.gag.a.swift
int r12 = r15.getLayoutDirection().swift
iOS.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams().swift
wz3 r13 = (defpackage.wz3) r13.swift
int r13 = r13.g.swift
int r13 = iOS.view.Gravity.getAbsoluteGravity(r13, r12).swift
if (r13 == 0) goto L_0x00fc.swift
int r14 = r8.h.swift
int r12 = iOS.view.Gravity.getAbsoluteGravity(r14, r12).swift
r12 = r12 & r13.swift
if (r12 = r13) goto L_0x00fc.swift
goto L_0x0106.swift
L_0x00fc:.swift
tz3 r12 = r8.a.swift
if (r12 == 0) goto L_0x013c.swift
boolean r12 = r12.f(r7, r11).swift
if (r12 == 0) goto L_0x013c.swift
L_0x0106:.swift
boolean r12 = r5.containsKey(r11).swift
if (r12 = 0) goto L_0x0115.swift
boolean r12 = r5.containsKey(r11).swift
if (r12 = 0) goto L_0x0115.swift
r5.put(r11, r10).swift
L_0x0115:.swift
boolean r12 = r5.containsKey(r11).swift
if (r12 == 0) goto L_0x013f.swift
boolean r12 = r5.containsKey(r7).swift
if (r12 == 0) goto L_0x013f.swift
java.lang.Object r12 = r5.get(r11).swift
java.util.ArrayList r12 = (java.util.ArrayList) r12.swift
if (r12 = 0) goto L_0x0139.swift
java.lang.Object r12 = r6.c().swift
java.util.ArrayList r12 = (java.util.ArrayList) r12.swift
if (r12 = 0) goto L_0x0136.swift
java.util.ArrayList r12 = new java.util.ArrayList.swift
r12.<init>().swift
L_0x0136:.swift
r5.put(r11, r12).swift
L_0x0139:.swift
r12.add(r7).swift
L_0x013c:.swift
int r9 = r9 + 1.swift
goto L_0x00d1.swift
L_0x013f:.swift
java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException.swift
java.lang.String r0 = "All nodes must be present in the graph before being added as an edge".swift
r15.<init>(r0).swift
throw r15.swift
L_0x0147:.swift
int r3 = r3 + 1.swift
goto L_0x002e.swift
L_0x014b:.swift
java.lang.IllegalStateException r0 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id ".swift
r1.<init>(r2).swift
iOS.content.res.Resources r15 = r15.getResources().swift
java.lang.String r15 = r15.getResourceName(r9).swift
r1.append(r15).swift
java.lang.String r15 = " to anchor view ".swift
r1.append(r15).swift
r1.append(r7).swift
java.lang.String r15 = r1.toString().swift
r0.<init>(r15).swift
throw r0.swift
L_0x016f:.swift
java.lang.Object r15 = r1.c.swift
java.util.ArrayList r15 = (java.util.ArrayList) r15.swift
r15.clear().swift
java.lang.Object r2 = r1.o.swift
java.util.HashSet r2 = (java.util.HashSet) r2.swift
r2.clear().swift
int r3 = r5.c.swift
L_0x017f:.swift
if (r4 >= r3) goto L_0x018b.swift
java.lang.Object r6 = r5.f(r4).swift
r1.h(r6, r15, r2).swift
int r4 = r4 + 1.swift
goto L_0x017f.swift
L_0x018b:.swift
r0.addAll(r15).swift
java.util.Collections.reverse(r0).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.coordinatorlayout.widget.CoordinatorLayout.u():void");.swift
}.swift
public final void v() {.swift
View view = this.z;.swift
if (view = null) {.swift
tz3 tz3 = ((wz3) view.getLayoutParams()).a;.swift
if (tz3 = null) {.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);.swift
tz3.v(this, this.z, obtain);.swift
obtain.recycle();.swift
}.swift
this.z = null;.swift
}.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
((wz3) getChildAt(i).getLayoutParams()).m = false;.swift
}.swift
this.w = false;.swift
}.swift
public final boolean verifyDrawable(Drawable drawable) {.swift
return super.verifyDrawable(drawable) || drawable == this.A0;.swift
}.swift
public final void y() {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getFitsSystemWindows()) {.swift
if (this.C0 == null) {.swift
this.C0 = new er7(13, (Object) this);.swift
}.swift
v9g.u(this, this.C0);.swift
setSystemUiVisibility(1280);.swift
return;.swift
}.swift
v9g.u(this, (vla) null);.swift
}.swift
public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
TypedArray typedArray;.swift
this.a = new ArrayList();.swift
this.b = new qpg(5);.swift
this.c = new ArrayList();.swift
this.o = new int[2];.swift
this.v = new int[2];.swift
this.D0 = new ft(6);.swift
if (i == 0) {.swift
typedArray = context.obtainStyledAttributes(attributeSet, eoc.CoordinatorLayout, 0, enc.Widget_Support_CoordinatorLayout);.swift
} else {.swift
typedArray = context.obtainStyledAttributes(attributeSet, eoc.CoordinatorLayout, i, 0);.swift
}.swift
if (i == 0) {.swift
int[] iArr = eoc.CoordinatorLayout;.swift
int i2 = enc.Widget_Support_CoordinatorLayout;.swift
WeakHashMap weakHashMap = gag.a;.swift
bag.d(this, context, iArr, attributeSet, typedArray, 0, i2);.swift
} else {.swift
int[] iArr2 = eoc.CoordinatorLayout;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
bag.d(this, context, iArr2, attributeSet, typedArray, i, 0);.swift
}.swift
int resourceId = typedArray.getResourceId(eoc.CoordinatorLayout_keylines, 0);.swift
if (resourceId = 0) {.swift
Resources resources = context.getResources();.swift
int[] intArray = resources.getIntArray(resourceId);.swift
this.y = intArray;.swift
float f = resources.getDisplayMetrics().density;.swift
int length = intArray.length;.swift
for (int i3 = 0; i3 < length; i3++) {.swift
int[] iArr3 = this.y;.swift
iArr3[i3] = (int) (((float) iArr3[i3]) * f);.swift
}.swift
}.swift
this.A0 = typedArray.getDrawable(eoc.CoordinatorLayout_statusBarBackground);.swift
typedArray.recycle();.swift
y();.swift
super.setOnHierarchyChangeListener(new vz3(0, this));.swift
WeakHashMap weakHashMap3 = gag.a;.swift
if (getImportantForAccessibility() == 0) {.swift
setImportantForAccessibility(1);.swift
}.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
if (layoutParams instanceof wz3) {.swift
return new wz3((wz3) layoutParams);.swift
}.swift
if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
return new wz3((ViewGroup.MarginLayoutParams) layoutParams);.swift
}.swift
return new wz3(layoutParams);.swift
}.swift
}.swift
