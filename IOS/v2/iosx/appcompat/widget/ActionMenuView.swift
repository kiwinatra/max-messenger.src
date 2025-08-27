package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ContextThemeWrapper;.swift
import iOS.view.Menu;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.widget.LinearLayout;.swift
import iOSx.appcompat.view.menu.ActionMenuItemView;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class ActionMenuView extends yv7 implements l69, l79 {.swift
public m69 a;.swift
public Context b;.swift
public int c = 0;.swift
public boolean o;.swift
public w7 v;.swift
public final int v0;.swift
public h79 w;.swift
public final int w0;.swift
public k69 x;.swift
public z7 x0;.swift
public boolean y;.swift
public int z;.swift
public ActionMenuView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
setBaselineAligned(false);.swift
float f = context.getResources().getDisplayMetrics().density;.swift
this.v0 = (int) (56.0f * f);.swift
this.w0 = (int) (f * 4.0f);.swift
this.b = context;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [iOS.widget.LinearLayout$LayoutParams, y7] */.swift
public static y7 c() {.swift
? layoutParams = new LinearLayout.LayoutParams(-2, -2);.swift
layoutParams.a = false;.swift
layoutParams.gravity = 16;.swift
return layoutParams;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v2, types: [iOS.widget.LinearLayout$LayoutParams] */.swift
/* JADX WARNING: type inference failed for: r0v3, types: [iOS.widget.LinearLayout$LayoutParams, y7] */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static defpackage.y7 e(iOS.view.ViewGroup.LayoutParams r1) {.swift
/*.swift
if (r1 == 0) goto L_0x0020.swift
boolean r0 = r1 instanceof defpackage.y7.swift
if (r0 == 0) goto L_0x0012.swift
y7 r0 = new y7.swift
y7 r1 = (defpackage.y7) r1.swift
r0.<init>(r1).swift
boolean r1 = r1.a.swift
r0.a = r1.swift
goto L_0x0017.swift
L_0x0012:.swift
y7 r0 = new y7.swift
r0.<init>(r1).swift
L_0x0017:.swift
int r1 = r0.gravity.swift
if (r1 > 0) goto L_0x001f.swift
r1 = 16.swift
r0.gravity = r1.swift
L_0x001f:.swift
return r0.swift
L_0x0020:.swift
y7 r1 = c().swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ActionMenuView.e(iOS.view.ViewGroup$LayoutParams):y7");.swift
}.swift
public final boolean a(u69 u69) {.swift
return this.a.q(u69, (i79) null, 0);.swift
}.swift
public final void b(m69 m69) {.swift
this.a = m69;.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return layoutParams instanceof y7;.swift
}.swift
public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
return false;.swift
}.swift
public final boolean f(int i) {.swift
boolean z2 = false;.swift
if (i == 0) {.swift
return false;.swift
}.swift
View childAt = getChildAt(i - 1);.swift
View childAt2 = getChildAt(i);.swift
if (i < getChildCount() && (childAt instanceof x7)) {.swift
z2 = ((x7) childAt).b();.swift
}.swift
return (i <= 0 ||  z2 | ((x7) childAt2).e();.swift
}.swift
public Menu getMenu() {.swift
if (this.a == null) {.swift
Context context = getContext();.swift
m69 m69 = new m69(context);.swift
this.a = m69;.swift
m69.v = new b8d((Object) this);.swift
w7 w7Var = new w7(context);.swift
this.v = w7Var;.swift
w7Var.Z = true;.swift
w7Var.v0 = true;.swift
h79 h79 = this.w;.swift
if (h79 == null) {.swift
h79 = new ece(6);.swift
}.swift
w7Var.v = h79;.swift
this.a.b(w7Var, this.b);.swift
w7 w7Var2 = this.v;.swift
w7Var2.y = this;.swift
this.a = w7Var2.c;.swift
}.swift
return this.a;.swift
}.swift
public Drawable getOverflowIcon() {.swift
getMenu();.swift
w7 w7Var = this.v;.swift
v7 v7Var = w7Var.z;.swift
if (v7Var = null) {.swift
return v7Var.getDrawable();.swift
}.swift
if (w7Var.Y) {.swift
return w7Var.X;.swift
}.swift
return null;.swift
}.swift
public int getPopupTheme() {.swift
return this.c;.swift
}.swift
public int getWindowAnimations() {.swift
return 0;.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
super.onConfigurationChanged(configuration);.swift
w7 w7Var = this.v;.swift
if (w7Var = null) {.swift
w7Var.h();.swift
if (this.v.i()) {.swift
this.v.b();.swift
this.v.k();.swift
}.swift
}.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
w7 w7Var = this.v;.swift
if (w7Var = null) {.swift
w7Var.b();.swift
t7 t7Var = w7Var.C0;.swift
if (t7Var = null && t7Var.b()) {.swift
t7Var.j.dismiss();.swift
}.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int i5;.swift
int i6;.swift
if (this.y) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
return;.swift
}.swift
int childCount = getChildCount();.swift
int i7 = (i4 - i2) / 2;.swift
int dividerWidth = getDividerWidth();.swift
int i8 = i3 - i;.swift
int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();.swift
boolean z3 = getLayoutDirection() == 1;.swift
int i9 = 0;.swift
int i10 = 0;.swift
for (int i11 = 0; i11 < childCount; i11++) {.swift
View childAt = getChildAt(i11);.swift
if (childAt.getVisibility() = 8) {.swift
y7 y7Var = (y7) childAt.getLayoutParams();.swift
if (y7Var.a) {.swift
int measuredWidth = childAt.getMeasuredWidth();.swift
if (f(i11)) {.swift
measuredWidth += dividerWidth;.swift
}.swift
int measuredHeight = childAt.getMeasuredHeight();.swift
if (z3) {.swift
i5 = getPaddingLeft() + y7Var.leftMargin;.swift
i6 = i5 + measuredWidth;.swift
} else {.swift
i6 = (getWidth() - getPaddingRight()) - y7Var.rightMargin;.swift
i5 = i6 - measuredWidth;.swift
}.swift
int i12 = i7 - (measuredHeight / 2);.swift
childAt.layout(i5, i12, i6, measuredHeight + i12);.swift
paddingRight -= measuredWidth;.swift
i9 = 1;.swift
} else {.swift
paddingRight -= (childAt.getMeasuredWidth() + y7Var.leftMargin) + y7Var.rightMargin;.swift
f(i11);.swift
i10++;.swift
}.swift
}.swift
}.swift
if (childCount == 1 && i9 == 0) {.swift
View childAt2 = getChildAt(0);.swift
int measuredWidth2 = childAt2.getMeasuredWidth();.swift
int measuredHeight2 = childAt2.getMeasuredHeight();.swift
int i13 = (i8 / 2) - (measuredWidth2 / 2);.swift
int i14 = i7 - (measuredHeight2 / 2);.swift
childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);.swift
return;.swift
}.swift
int i15 = i10 - (i9 ^ 1);.swift
int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);.swift
if (z3) {.swift
int width = getWidth() - getPaddingRight();.swift
for (int i16 = 0; i16 < childCount; i16++) {.swift
View childAt3 = getChildAt(i16);.swift
y7 y7Var2 = (y7) childAt3.getLayoutParams();.swift
if (childAt3.getVisibility() y7Var2.a) {.swift
int i17 = width - y7Var2.rightMargin;.swift
int measuredWidth3 = childAt3.getMeasuredWidth();.swift
int measuredHeight3 = childAt3.getMeasuredHeight();.swift
int i18 = i7 - (measuredHeight3 / 2);.swift
childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);.swift
width = i17 - ((measuredWidth3 + y7Var2.leftMargin) + max);.swift
}.swift
}.swift
return;.swift
}.swift
int paddingLeft = getPaddingLeft();.swift
for (int i19 = 0; i19 < childCount; i19++) {.swift
View childAt4 = getChildAt(i19);.swift
y7 y7Var3 = (y7) childAt4.getLayoutParams();.swift
if (childAt4.getVisibility() y7Var3.a) {.swift
int i20 = paddingLeft + y7Var3.leftMargin;.swift
int measuredWidth4 = childAt4.getMeasuredWidth();.swift
int measuredHeight4 = childAt4.getMeasuredHeight();.swift
int i21 = i7 - (measuredHeight4 / 2);.swift
childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);.swift
paddingLeft = measuredWidth4 + y7Var3.rightMargin + max + i20;.swift
}.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
int i4;.swift
int i5;.swift
boolean z2;.swift
int i6;.swift
int i7;.swift
int i8;.swift
int i9;.swift
boolean z3;.swift
int i10;.swift
int i11;.swift
int i12;.swift
m69 m69;.swift
boolean z4 = this.y;.swift
boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;.swift
this.y = z5;.swift
if (z4 = z5) {.swift
this.z = 0;.swift
}.swift
int size = View.MeasureSpec.getSize(i);.swift
if (this.y || (m69 = this.a) == null || size == this.z)) {.swift
this.z = size;.swift
m69.p(true);.swift
}.swift
int childCount = getChildCount();.swift
if (this.y || childCount <= 0) {.swift
int i13 = i2;.swift
for (int i14 = 0; i14 < childCount; i14++) {.swift
y7 y7Var = (y7) getChildAt(i14).getLayoutParams();.swift
y7Var.rightMargin = 0;.swift
y7Var.leftMargin = 0;.swift
}.swift
super.onMeasure(i, i2);.swift
return;.swift
}.swift
int mode = View.MeasureSpec.getMode(i2);.swift
int size2 = View.MeasureSpec.getSize(i);.swift
int size3 = View.MeasureSpec.getSize(i2);.swift
int paddingRight = getPaddingRight() + getPaddingLeft();.swift
int paddingBottom = getPaddingBottom() + getPaddingTop();.swift
int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);.swift
int i15 = size2 - paddingRight;.swift
int i16 = this.v0;.swift
int i17 = i15 / i16;.swift
int i18 = i15 % i16;.swift
if (i17 == 0) {.swift
setMeasuredDimension(i15, 0);.swift
return;.swift
}.swift
int i19 = (i18 / i17) + i16;.swift
int childCount2 = getChildCount();.swift
int i20 = 0;.swift
int i21 = 0;.swift
int i22 = 0;.swift
boolean z6 = false;.swift
int i23 = 0;.swift
int i24 = 0;.swift
long j = 0;.swift
while (true) {.swift
i3 = this.w0;.swift
if (i22 >= childCount2) {.swift
break;.swift
}.swift
View childAt = getChildAt(i22);.swift
int i25 = size3;.swift
if (childAt.getVisibility() == 8) {.swift
i10 = i15;.swift
i11 = paddingBottom;.swift
} else {.swift
boolean z7 = childAt instanceof ActionMenuItemView;.swift
int i26 = i20 + 1;.swift
if (z7) {.swift
childAt.setPadding(i3, 0, i3, 0);.swift
}.swift
y7 y7Var2 = (y7) childAt.getLayoutParams();.swift
y7Var2.f = false;.swift
y7Var2.c = 0;.swift
y7Var2.b = 0;.swift
y7Var2.d = false;.swift
y7Var2.leftMargin = 0;.swift
y7Var2.rightMargin = 0;.swift
y7Var2.e = z7 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);.swift
int i27 = y7Var2.a ? 1 : i17;.swift
int i28 = i26;.swift
y7 y7Var3 = (y7) childAt.getLayoutParams();.swift
i10 = i15;.swift
i11 = paddingBottom;.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));.swift
ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;.swift
boolean z8 = actionMenuItemView = null && (TextUtils.isEmpty(actionMenuItemView.getText())  true);.swift
if (i27 <= 0 || (z8 && i27 < 2)) {.swift
i12 = 0;.swift
} else {.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i19, IntCompanionObject.MIN_VALUE), makeMeasureSpec);.swift
int measuredWidth = childAt.getMeasuredWidth();.swift
i12 = measuredWidth / i19;.swift
if (measuredWidth % i19 = 0) {.swift
i12++;.swift
}.swift
if (z8 && i12 < 2) {.swift
i12 = 2;.swift
}.swift
}.swift
y7Var3.d = y7Var3.a && z8;.swift
y7Var3.b = i12;.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, 1073741824), makeMeasureSpec);.swift
i21 = Math.max(i21, i12);.swift
if (y7Var2.d) {.swift
i23++;.swift
}.swift
if (y7Var2.a) {.swift
z6 = true;.swift
}.swift
i17 -= i12;.swift
i24 = Math.max(i24, childAt.getMeasuredHeight());.swift
if (i12 == 1) {.swift
j |= (long) (1 << i22);.swift
}.swift
i20 = i28;.swift
}.swift
i22++;.swift
size3 = i25;.swift
paddingBottom = i11;.swift
i15 = i10;.swift
}.swift
int i29 = i15;.swift
int i30 = size3;.swift
int i31 = i24;.swift
boolean z9 = z6 && i20 == 2;.swift
boolean z10 = false;.swift
while (true) {.swift
if (i23 <= 0 || i17 <= 0) {.swift
i4 = mode;.swift
i5 = i31;.swift
z2 = z10;.swift
} else {.swift
int i32 = IntCompanionObject.MAX_VALUE;.swift
int i33 = 0;.swift
int i34 = 0;.swift
long j2 = 0;.swift
while (i34 < childCount2) {.swift
int i35 = i31;.swift
y7 y7Var4 = (y7) getChildAt(i34).getLayoutParams();.swift
boolean z11 = z10;.swift
if (y7Var4.d) {.swift
int i36 = y7Var4.b;.swift
if (i36 < i32) {.swift
j2 = 1 << i34;.swift
i32 = i36;.swift
i33 = 1;.swift
} else if (i36 == i32) {.swift
i33++;.swift
j2 |= 1 << i34;.swift
}.swift
}.swift
i34++;.swift
z10 = z11;.swift
i31 = i35;.swift
}.swift
i5 = i31;.swift
z2 = z10;.swift
j |= j2;.swift
if (i33 > i17) {.swift
i4 = mode;.swift
break;.swift
}.swift
int i37 = i32 + 1;.swift
int i38 = 0;.swift
while (i38 < childCount2) {.swift
View childAt2 = getChildAt(i38);.swift
y7 y7Var5 = (y7) childAt2.getLayoutParams();.swift
int i39 = mode;.swift
int i40 = childMeasureSpec;.swift
int i41 = childCount2;.swift
long j3 = (long) (1 << i38);.swift
if ((j2 & j3) = 0) {.swift
if (y7Var5.e) {.swift
z3 = true;.swift
} else {.swift
z3 = true;.swift
if (i17 == 1) {.swift
childAt2.setPadding(i3 + i19, 0, i3, 0);.swift
}.swift
}.swift
y7Var5.b += z3 ? 1 : 0;.swift
y7Var5.f = z3;.swift
i17--;.swift
} else if (y7Var5.b == i37) {.swift
j |= j3;.swift
}.swift
i38++;.swift
childMeasureSpec = i40;.swift
mode = i39;.swift
childCount2 = i41;.swift
}.swift
i31 = i5;.swift
z10 = true;.swift
}.swift
}.swift
i4 = mode;.swift
i5 = i31;.swift
z2 = z10;.swift
int i42 = childMeasureSpec;.swift
int i43 = childCount2;.swift
boolean z12 = z6 && i20 == 1;.swift
if (i17 <= 0 || j == 0 || (i17 >= i20 - 1 && z12 && i21 <= 1)) {.swift
i6 = i43;.swift
} else {.swift
float bitCount = (float) Long.bitCount(j);.swift
if (z12) {.swift
if ((j & 1) ((y7) getChildAt(0).getLayoutParams()).e) {.swift
bitCount -= 0.5f;.swift
}.swift
int i44 = i43 - 1;.swift
if ((j & ((long) (1 << i44))) ((y7) getChildAt(i44).getLayoutParams()).e) {.swift
bitCount -= 0.5f;.swift
}.swift
}.swift
int i45 = bitCount > c44.DEFAULT_ASPECT_RATIO ? (int) (((float) (i17 * i19)) / bitCount) : 0;.swift
i6 = i43;.swift
for (int i46 = 0; i46 < i6; i46++) {.swift
if ((j & ((long) (1 << i46))) = 0) {.swift
View childAt3 = getChildAt(i46);.swift
y7 y7Var6 = (y7) childAt3.getLayoutParams();.swift
if (childAt3 instanceof ActionMenuItemView) {.swift
y7Var6.c = i45;.swift
y7Var6.f = true;.swift
if (i46 == 0 && y7Var6.e) {.swift
y7Var6.leftMargin = (-i45) / 2;.swift
}.swift
z2 = true;.swift
} else if (y7Var6.a) {.swift
y7Var6.c = i45;.swift
y7Var6.f = true;.swift
y7Var6.rightMargin = (-i45) / 2;.swift
z2 = true;.swift
} else {.swift
if (i46 = 0) {.swift
y7Var6.leftMargin = i45 / 2;.swift
}.swift
if (i46 = i6 - 1) {.swift
y7Var6.rightMargin = i45 / 2;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
if (z2) {.swift
int i47 = 0;.swift
while (i47 < i6) {.swift
View childAt4 = getChildAt(i47);.swift
y7 y7Var7 = (y7) childAt4.getLayoutParams();.swift
if (y7Var7.f) {.swift
i9 = i42;.swift
} else {.swift
i9 = i42;.swift
childAt4.measure(View.MeasureSpec.makeMeasureSpec((y7Var7.b * i19) + y7Var7.c, 1073741824), i9);.swift
}.swift
i47++;.swift
i42 = i9;.swift
}.swift
}.swift
if (i4 = 1073741824) {.swift
i8 = i29;.swift
i7 = i5;.swift
} else {.swift
i7 = i30;.swift
i8 = i29;.swift
}.swift
setMeasuredDimension(i8, i7);.swift
}.swift
public void setExpandedActionViewsExclusive(boolean z2) {.swift
this.v.z0 = z2;.swift
}.swift
public void setOnMenuItemClickListener(z7 z7Var) {.swift
this.x0 = z7Var;.swift
}.swift
public void setOverflowIcon(Drawable drawable) {.swift
getMenu();.swift
w7 w7Var = this.v;.swift
v7 v7Var = w7Var.z;.swift
if (v7Var = null) {.swift
v7Var.setImageDrawable(drawable);.swift
return;.swift
}.swift
w7Var.Y = true;.swift
w7Var.X = drawable;.swift
}.swift
public void setOverflowReserved(boolean z2) {.swift
this.o = z2;.swift
}.swift
public void setPopupTheme(int i) {.swift
if (this.c = i) {.swift
this.c = i;.swift
if (i == 0) {.swift
this.b = getContext();.swift
} else {.swift
this.b = new ContextThemeWrapper(getContext(), i);.swift
}.swift
}.swift
}.swift
public void setPresenter(w7 w7Var) {.swift
this.v = w7Var;.swift
w7Var.y = this;.swift
this.a = w7Var.c;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [xv7, iOS.widget.LinearLayout$LayoutParams] */.swift
/* renamed from: generateLayoutParams  reason: collision with other method in class */.swift
public final xv7 m0generateLayoutParams(AttributeSet attributeSet) {.swift
return new LinearLayout.LayoutParams(getContext(), attributeSet);.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return new LinearLayout.LayoutParams(getContext(), attributeSet);.swift
}.swift
}.swift
