package iOSx.gridlayout.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.LogPrinter;.swift
import iOS.util.Printer;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.Space;.swift
import java.util.Arrays;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class GridLayout extends ViewGroup {.swift
public static final int A0 = ioc.GridLayout_alignmentMode;.swift
public static final int B0 = ioc.GridLayout_rowOrderPreserved;.swift
public static final int C0 = ioc.GridLayout_columnOrderPreserved;.swift
public static final ku6 D0 = new ku6(0);.swift
public static final ku6 E0;.swift
public static final ku6 F0;.swift
public static final ku6 G0;.swift
public static final ku6 H0;.swift
public static final lu6 I0;.swift
public static final lu6 J0;.swift
public static final ku6 K0 = new ku6(3);.swift
public static final ku6 L0 = new ku6(4);.swift
public static final ku6 M0 = new ku6(5);.swift
public static final ju6 v0 = new Object();.swift
public static final int w0 = ioc.GridLayout_orientation;.swift
public static final int x0 = ioc.GridLayout_rowCount;.swift
public static final int y0 = ioc.GridLayout_columnCount;.swift
public static final LogPrinter z = new LogPrinter(3, GridLayout.class.getName());.swift
public static final int z0 = ioc.GridLayout_useDefaultMargins;.swift
public final pu6 a = new pu6(this, true);.swift
public final pu6 b = new pu6(this, false);.swift
public int c = 0;.swift
public boolean o = false;.swift
public int v = 1;.swift
public final int w;.swift
public int x = 0;.swift
public Printer y = z;.swift
/* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ju6] */.swift
static {.swift
ku6 ku6 = new ku6(1);.swift
ku6 ku62 = new ku6(2);.swift
E0 = ku6;.swift
F0 = ku62;.swift
G0 = ku6;.swift
H0 = ku62;.swift
I0 = new lu6(ku6, ku62);.swift
J0 = new lu6(ku62, ku6);.swift
}.swift
public GridLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
this.w = context.getResources().getDimensionPixelOffset(fec.default_gap);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ioc.GridLayout);.swift
try {.swift
setRowCount(obtainStyledAttributes.getInt(x0, IntCompanionObject.MIN_VALUE));.swift
setColumnCount(obtainStyledAttributes.getInt(y0, IntCompanionObject.MIN_VALUE));.swift
setOrientation(obtainStyledAttributes.getInt(w0, 0));.swift
setUseDefaultMargins(obtainStyledAttributes.getBoolean(z0, false));.swift
setAlignmentMode(obtainStyledAttributes.getInt(A0, 1));.swift
setRowOrderPreserved(obtainStyledAttributes.getBoolean(B0, true));.swift
setColumnOrderPreserved(obtainStyledAttributes.getBoolean(C0, true));.swift
} finally {.swift
obtainStyledAttributes.recycle();.swift
}.swift
}.swift
public static ryg d(int i, boolean z2) {.swift
int i2 = (i & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);.swift
return i2 = 3 ? i2 = 7 ? i2 = 8388613 ? D0 : H0 : G0 : M0 : z2 ? J0 : F0 : z2 ? I0 : E0 : K0;.swift
}.swift
public static void g(String str) {.swift
throw new IllegalArgumentException(tr1.j(str, ". "));.swift
}.swift
public static void k(su6 su6, int i, int i2, int i3, int i4) {.swift
ru6 ru6 = new ru6(i, i2 + i);.swift
uu6 uu6 = su6.a;.swift
su6.a = new uu6(uu6.a, ru6, uu6.c, uu6.d);.swift
ru6 ru62 = new ru6(i3, i4 + i3);.swift
uu6 uu62 = su6.b;.swift
su6.b = new uu6(uu62.a, ru62, uu62.c, uu62.d);.swift
}.swift
public static uu6 l(int i, int i2, ryg ryg, float f) {.swift
return new uu6(i = Integer.MIN_VALUE, new ru6(i, i2 + i), ryg, f);.swift
}.swift
public final void a(su6 su6, boolean z2) {.swift
String str = z2 ? "column" : "row";.swift
ru6 ru6 = (z2 ? su6.b : su6.a).b;.swift
int i = ru6.a;.swift
if (i == Integer.MIN_VALUE || i >= 0) {.swift
int i2 = (z2 ? this.a : this.b).b;.swift
if (i2 == Integer.MIN_VALUE) {.swift
return;.swift
}.swift
if (ru6.b > i2) {.swift
g(str + " indices (start + span) mustn't exceed the " + str + " count");.swift
throw null;.swift
} else if (ru6.a() > i2) {.swift
g(str + " span mustn't exceed the " + str + " count");.swift
throw null;.swift
}.swift
} else {.swift
g(str.concat(" indices must be positive"));.swift
throw null;.swift
}.swift
}.swift
public final int b() {.swift
int childCount = getChildCount();.swift
int i = 1;.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = getChildAt(i2);.swift
if (childAt.getVisibility() = 8) {.swift
i = ((su6) childAt.getLayoutParams()).hashCode() + (i * 31);.swift
}.swift
}.swift
return i;.swift
}.swift
public final void c() {.swift
int i = this.x;.swift
if (i == 0) {.swift
boolean z2 = this.c == 0;.swift
int i2 = (z2 ? this.a : this.b).b;.swift
if (i2 == Integer.MIN_VALUE) {.swift
i2 = 0;.swift
}.swift
int[] iArr = new int[i2];.swift
int childCount = getChildCount();.swift
int i3 = 0;.swift
int i4 = 0;.swift
for (int i5 = 0; i5 < childCount; i5++) {.swift
su6 su6 = (su6) getChildAt(i5).getLayoutParams();.swift
uu6 uu6 = z2 ? su6.a : su6.b;.swift
ru6 ru6 = uu6.b;.swift
int a2 = ru6.a();.swift
boolean z3 = uu6.a;.swift
if (z3) {.swift
i3 = ru6.a;.swift
}.swift
uu6 uu62 = z2 ? su6.b : su6.a;.swift
ru6 ru62 = uu62.b;.swift
int a3 = ru62.a();.swift
boolean z4 = uu62.a;.swift
int i6 = ru62.a;.swift
if (i2 = 0) {.swift
a3 = Math.min(a3, i2 - (z4 ? Math.min(i6, i2) : 0));.swift
}.swift
if (z4) {.swift
i4 = i6;.swift
}.swift
if (i2 = 0) {.swift
if (z4) {.swift
while (true) {.swift
int i7 = i4 + a3;.swift
if (i7 <= i2) {.swift
int i8 = i4;.swift
while (i8 < i7) {.swift
if (iArr[i8] <= i3) {.swift
i8++;.swift
}.swift
}.swift
break;.swift
}.swift
if (z4) {.swift
i3++;.swift
} else if (i7 <= i2) {.swift
i4++;.swift
} else {.swift
i3++;.swift
i4 = 0;.swift
}.swift
}.swift
}.swift
Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + a3, i2), i3 + a2);.swift
}.swift
if (z2) {.swift
k(su6, i3, a2, i4, a3);.swift
} else {.swift
k(su6, i4, a3, i3, a2);.swift
}.swift
i4 += a3;.swift
}.swift
this.x = b();.swift
} else if (i = b()) {.swift
this.y.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");.swift
h();.swift
c();.swift
}.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
if ((layoutParams instanceof su6)) {.swift
return false;.swift
}.swift
su6 su6 = (su6) layoutParams;.swift
a(su6, true);.swift
a(su6, false);.swift
return true;.swift
}.swift
public final int e(View view, boolean z2, boolean z3) {.swift
int[] iArr;.swift
if (this.v == 1) {.swift
return f(view, z2, z3);.swift
}.swift
pu6 pu6 = z2 ? this.a : this.b;.swift
if (z3) {.swift
if (pu6.j == null) {.swift
pu6.j = new int[(pu6.f() + 1)];.swift
}.swift
if (pu6.k) {.swift
pu6.c(true);.swift
pu6.k = true;.swift
}.swift
iArr = pu6.j;.swift
} else {.swift
if (pu6.l == null) {.swift
pu6.l = new int[(pu6.f() + 1)];.swift
}.swift
if (pu6.m) {.swift
pu6.c(false);.swift
pu6.m = true;.swift
}.swift
iArr = pu6.l;.swift
}.swift
su6 su6 = (su6) view.getLayoutParams();.swift
ru6 ru6 = (z2 ? su6.b : su6.a).b;.swift
return iArr[z3 ? ru6.a : ru6.b];.swift
}.swift
public final int f(View view, boolean z2, boolean z3) {.swift
su6 su6 = (su6) view.getLayoutParams();.swift
int i = z2 ? z3 ? su6.leftMargin : su6.rightMargin : z3 ? su6.topMargin : su6.bottomMargin;.swift
if (i = Integer.MIN_VALUE) {.swift
return i;.swift
}.swift
int i2 = 0;.swift
if (this.o) {.swift
uu6 uu6 = z2 ? su6.b : su6.a;.swift
pu6 pu6 = z2 ? this.a : this.b;.swift
ru6 ru6 = uu6.b;.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getLayoutDirection() == 1) {.swift
z3 = z3;.swift
}.swift
}.swift
if (z3) {.swift
int i3 = ru6.a;.swift
} else {.swift
int i4 = ru6.b;.swift
pu6.f();.swift
}.swift
if ((view.getClass() == age.class || view.getClass() == Space.class)) {.swift
i2 = this.w / 2;.swift
}.swift
}.swift
return i2;.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new su6();.swift
}.swift
/* JADX INFO: finally extract failed */.swift
/* JADX WARNING: type inference failed for: r0v0, types: [su6, iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
Context context = getContext();.swift
? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);.swift
uu6 uu6 = uu6.e;.swift
marginLayoutParams.a = uu6;.swift
marginLayoutParams.b = uu6;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ioc.GridLayout_Layout);.swift
try {.swift
int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(su6.d, IntCompanionObject.MIN_VALUE);.swift
marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(su6.e, dimensionPixelSize);.swift
marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(su6.f, dimensionPixelSize);.swift
marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(su6.g, dimensionPixelSize);.swift
marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(su6.h, dimensionPixelSize);.swift
obtainStyledAttributes.recycle();.swift
TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ioc.GridLayout_Layout);.swift
try {.swift
int i = obtainStyledAttributes2.getInt(su6.o, 0);.swift
int i2 = obtainStyledAttributes2.getInt(su6.i, IntCompanionObject.MIN_VALUE);.swift
int i3 = su6.j;.swift
int i4 = su6.c;.swift
marginLayoutParams.b = l(i2, obtainStyledAttributes2.getInt(i3, i4), d(i, true), obtainStyledAttributes2.getFloat(su6.k, c44.DEFAULT_ASPECT_RATIO));.swift
marginLayoutParams.a = l(obtainStyledAttributes2.getInt(su6.l, IntCompanionObject.MIN_VALUE), obtainStyledAttributes2.getInt(su6.m, i4), d(i, false), obtainStyledAttributes2.getFloat(su6.n, c44.DEFAULT_ASPECT_RATIO));.swift
return marginLayoutParams;.swift
} finally {.swift
obtainStyledAttributes2.recycle();.swift
}.swift
} catch (Throwable th) {.swift
obtainStyledAttributes.recycle();.swift
throw th;.swift
}.swift
}.swift
public int getAlignmentMode() {.swift
return this.v;.swift
}.swift
public int getColumnCount() {.swift
return this.a.f();.swift
}.swift
public int getOrientation() {.swift
return this.c;.swift
}.swift
public Printer getPrinter() {.swift
return this.y;.swift
}.swift
public int getRowCount() {.swift
return this.b.f();.swift
}.swift
public boolean getUseDefaultMargins() {.swift
return this.o;.swift
}.swift
public final void h() {.swift
this.x = 0;.swift
pu6 pu6 = this.a;.swift
if (pu6 = null) {.swift
pu6.l();.swift
}.swift
pu6 pu62 = this.b;.swift
if (pu62 = null) {.swift
pu62.l();.swift
}.swift
if (pu6 = null) {.swift
pu6.m();.swift
pu62.m();.swift
}.swift
}.swift
public final void i(View view, int i, int i2, int i3, int i4) {.swift
view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));.swift
}.swift
public final void j(int i, int i2, boolean z2) {.swift
int childCount = getChildCount();.swift
for (int i3 = 0; i3 < childCount; i3++) {.swift
View childAt = getChildAt(i3);.swift
if (childAt.getVisibility() = 8) {.swift
su6 su6 = (su6) childAt.getLayoutParams();.swift
if (z2) {.swift
i(childAt, i, i2, su6.width, su6.height);.swift
} else {.swift
boolean z3 = this.c == 0;.swift
uu6 uu6 = z3 ? su6.b : su6.a;.swift
if (uu6.a(z3) == M0) {.swift
int[] h = (z3 ? this.a : this.b).h();.swift
ru6 ru6 = uu6.b;.swift
int e = (h[ru6.b] - h[ru6.a]) - (e(childAt, z3, false) + e(childAt, z3, true));.swift
if (z3) {.swift
i(childAt, i, i2, e, su6.height);.swift
} else {.swift
i(childAt, i, i2, su6.width, e);.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
pu6 pu6;.swift
pu6 pu62;.swift
int i5;.swift
boolean z3;.swift
int i6;.swift
View view;.swift
GridLayout gridLayout = this;.swift
c();.swift
int i7 = i3 - i;.swift
int paddingLeft = getPaddingLeft();.swift
int paddingTop = getPaddingTop();.swift
int paddingRight = getPaddingRight();.swift
int paddingBottom = getPaddingBottom();.swift
int i8 = (i7 - paddingLeft) - paddingRight;.swift
pu6 pu63 = gridLayout.a;.swift
pu63.v.a = i8;.swift
pu63.w.a = -i8;.swift
boolean z4 = false;.swift
pu63.q = false;.swift
pu63.h();.swift
int i9 = ((i4 - i2) - paddingTop) - paddingBottom;.swift
pu6 pu64 = gridLayout.b;.swift
pu64.v.a = i9;.swift
pu64.w.a = -i9;.swift
pu64.q = false;.swift
pu64.h();.swift
int[] h = pu63.h();.swift
int[] h2 = pu64.h();.swift
int i10 = 0;.swift
for (int childCount = getChildCount(); i10 < childCount; childCount = i6) {.swift
View childAt = gridLayout.getChildAt(i10);.swift
if (childAt.getVisibility() == 8) {.swift
i5 = i10;.swift
i6 = childCount;.swift
pu6 = pu63;.swift
z3 = z4;.swift
pu62 = pu64;.swift
} else {.swift
su6 su6 = (su6) childAt.getLayoutParams();.swift
uu6 uu6 = su6.b;.swift
uu6 uu62 = su6.a;.swift
ru6 ru6 = uu6.b;.swift
ru6 ru62 = uu62.b;.swift
int i11 = h[ru6.a];.swift
int i12 = childCount;.swift
int i13 = h2[ru62.a];.swift
int i14 = h[ru6.b] - i11;.swift
int i15 = h2[ru62.b] - i13;.swift
int measuredWidth = childAt.getMeasuredWidth();.swift
int measuredHeight = childAt.getMeasuredHeight();.swift
ryg a2 = uu6.a(true);.swift
ryg a3 = uu62.a(false);.swift
o5h g = pu63.g();.swift
pu6 = pu63;.swift
qu6 qu6 = (qu6) ((Object[]) g.c)[((int[]) g.a)[i10]];.swift
o5h g2 = pu64.g();.swift
pu62 = pu64;.swift
qu6 qu62 = (qu6) ((Object[]) g2.c)[((int[]) g2.a)[i10]];.swift
int s = a2.s(childAt, i14 - qu6.d(true));.swift
int s2 = a3.s(childAt, i15 - qu62.d(true));.swift
int e = gridLayout.e(childAt, true, true);.swift
int e2 = gridLayout.e(childAt, false, true);.swift
int e3 = gridLayout.e(childAt, true, false);.swift
int i16 = e + e3;.swift
int e4 = e2 + gridLayout.e(childAt, false, false);.swift
ryg ryg = a3;.swift
qu6 qu63 = qu6;.swift
ryg ryg2 = a2;.swift
int i17 = measuredHeight;.swift
ryg ryg3 = ryg2;.swift
View view2 = childAt;.swift
i5 = i10;.swift
z3 = false;.swift
i6 = i12;.swift
int i18 = measuredWidth;.swift
int a4 = qu63.a(this, childAt, ryg3, measuredWidth + i16, true);.swift
int i19 = i17;.swift
ryg ryg4 = ryg;.swift
int a5 = qu62.a(this, view2, ryg4, i19 + e4, false);.swift
int y2 = ryg3.y(i18, i14 - i16);.swift
int y3 = ryg4.y(i19, i15 - e4);.swift
int i20 = i11 + s + a4;.swift
WeakHashMap weakHashMap = gag.a;.swift
int i21 = getLayoutDirection() == 1 ? (((i7 - y2) - paddingRight) - e3) - i20 : paddingLeft + e + i20;.swift
int i22 = paddingTop + i13 + s2 + a5 + e2;.swift
if (y2 == view2.getMeasuredWidth() && y3 == view2.getMeasuredHeight()) {.swift
view = view2;.swift
} else {.swift
view = view2;.swift
view.measure(View.MeasureSpec.makeMeasureSpec(y2, 1073741824), View.MeasureSpec.makeMeasureSpec(y3, 1073741824));.swift
}.swift
view.layout(i21, i22, y2 + i21, y3 + i22);.swift
}.swift
i10 = i5 + 1;.swift
gridLayout = this;.swift
pu63 = pu6;.swift
pu64 = pu62;.swift
z4 = z3;.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
int i4;.swift
c();.swift
pu6 pu6 = this.b;.swift
pu6 pu62 = this.a;.swift
if ((pu62 == null || pu6 == null)) {.swift
pu62.m();.swift
pu6.m();.swift
}.swift
int paddingRight = getPaddingRight() + getPaddingLeft();.swift
int paddingBottom = getPaddingBottom() + getPaddingTop();.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));.swift
int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));.swift
j(makeMeasureSpec, makeMeasureSpec2, true);.swift
if (this.c == 0) {.swift
i3 = pu62.j(makeMeasureSpec);.swift
j(makeMeasureSpec, makeMeasureSpec2, false);.swift
i4 = pu6.j(makeMeasureSpec2);.swift
} else {.swift
i4 = pu6.j(makeMeasureSpec2);.swift
j(makeMeasureSpec, makeMeasureSpec2, false);.swift
i3 = pu62.j(makeMeasureSpec);.swift
}.swift
setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));.swift
}.swift
public final void requestLayout() {.swift
super.requestLayout();.swift
h();.swift
}.swift
public void setAlignmentMode(int i) {.swift
this.v = i;.swift
requestLayout();.swift
}.swift
public void setColumnCount(int i) {.swift
this.a.o(i);.swift
h();.swift
requestLayout();.swift
}.swift
public void setColumnOrderPreserved(boolean z2) {.swift
pu6 pu6 = this.a;.swift
pu6.u = z2;.swift
pu6.l();.swift
h();.swift
requestLayout();.swift
}.swift
public void setOrientation(int i) {.swift
if (this.c = i) {.swift
this.c = i;.swift
h();.swift
requestLayout();.swift
}.swift
}.swift
public void setPrinter(Printer printer) {.swift
if (printer == null) {.swift
printer = v0;.swift
}.swift
this.y = printer;.swift
}.swift
public void setRowCount(int i) {.swift
this.b.o(i);.swift
h();.swift
requestLayout();.swift
}.swift
public void setRowOrderPreserved(boolean z2) {.swift
pu6 pu6 = this.b;.swift
pu6.u = z2;.swift
pu6.l();.swift
h();.swift
requestLayout();.swift
}.swift
public void setUseDefaultMargins(boolean z2) {.swift
this.o = z2;.swift
requestLayout();.swift
}.swift
/* JADX WARNING: type inference failed for: r1v3, types: [su6, iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams] */.swift
/* JADX WARNING: type inference failed for: r1v4, types: [su6, iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams] */.swift
/* JADX WARNING: type inference failed for: r1v5, types: [su6, iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
if (layoutParams instanceof su6) {.swift
su6 su6 = (su6) layoutParams;.swift
? marginLayoutParams = new ViewGroup.MarginLayoutParams(su6);.swift
uu6 uu6 = uu6.e;.swift
marginLayoutParams.a = uu6;.swift
marginLayoutParams.b = uu6;.swift
marginLayoutParams.a = su6.a;.swift
marginLayoutParams.b = su6.b;.swift
return marginLayoutParams;.swift
} else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);.swift
uu6 uu62 = uu6.e;.swift
marginLayoutParams2.a = uu62;.swift
marginLayoutParams2.b = uu62;.swift
return marginLayoutParams2;.swift
} else {.swift
? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);.swift
uu6 uu63 = uu6.e;.swift
marginLayoutParams3.a = uu63;.swift
marginLayoutParams3.b = uu63;.swift
return marginLayoutParams3;.swift
}.swift
}.swift
}.swift
