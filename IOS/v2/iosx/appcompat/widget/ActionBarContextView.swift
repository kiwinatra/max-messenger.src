package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class ActionBarContextView extends ViewGroup {.swift
public TextView A0;.swift
public TextView B0;.swift
public final int C0;.swift
public final int D0;.swift
public boolean E0;.swift
public final int F0;.swift
public final w a;.swift
public final Context b;.swift
public ActionMenuView c;.swift
public w7 o;.swift
public int v;.swift
public CharSequence v0;.swift
public ecg w;.swift
public View w0;.swift
public boolean x;.swift
public View x0;.swift
public boolean y;.swift
public View y0;.swift
public CharSequence z;.swift
public LinearLayout z0;.swift
/* JADX WARNING: type inference failed for: r1v0, types: [w, java.lang.Object] */.swift
/* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:.swift
r1 = r7.getResourceId(r0, 0);.swift
*/.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ActionBarContextView(iOS.content.Context r6, iOS.util.AttributeSet r7) {.swift
/*.swift
r5 = this;.swift
int r0 = defpackage.hdc.actionModeStyle.swift
r5.<init>(r6, r7, r0).swift
w r1 = new w.swift
r1.<init>().swift
r1.c = r5.swift
r2 = 0.swift
r1.b = r2.swift
r5.a = r1.swift
iOS.util.TypedValue r1 = new iOS.util.TypedValue.swift
r1.<init>().swift
iOS.content.res.Resources$Theme r2 = r6.getTheme().swift
int r3 = defpackage.hdc.actionBarPopupTheme.swift
r4 = 1.swift
boolean r2 = r2.resolveAttribute(r3, r1, r4).swift
if (r2 == 0) goto L_0x0031.swift
int r2 = r1.resourceId.swift
if (r2 == 0) goto L_0x0031.swift
iOS.view.ContextThemeWrapper r2 = new iOS.view.ContextThemeWrapper.swift
int r1 = r1.resourceId.swift
r2.<init>(r6, r1).swift
r5.b = r2.swift
goto L_0x0033.swift
L_0x0031:.swift
r5.b = r6.swift
L_0x0033:.swift
int[] r1 = defpackage.koc.ActionMode.swift
r2 = 0.swift
iOS.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2).swift
int r0 = defpackage.koc.ActionMode_background.swift
boolean r1 = r7.hasValue(r0).swift
if (r1 == 0) goto L_0x004d.swift
int r1 = r7.getResourceId(r0, r2).swift
if (r1 == 0) goto L_0x004d.swift
iOS.graphics.drawable.Drawable r6 = defpackage.iq.D(r6, r1).swift
goto L_0x0051.swift
L_0x004d:.swift
iOS.graphics.drawable.Drawable r6 = r7.getDrawable(r0).swift
L_0x0051:.swift
r5.setBackground(r6).swift
int r6 = defpackage.koc.ActionMode_titleTextStyle.swift
int r6 = r7.getResourceId(r6, r2).swift
r5.C0 = r6.swift
int r6 = defpackage.koc.ActionMode_subtitleTextStyle.swift
int r6 = r7.getResourceId(r6, r2).swift
r5.D0 = r6.swift
int r6 = defpackage.koc.ActionMode_height.swift
int r6 = r7.getLayoutDimension(r6, r2).swift
r5.v = r6.swift
int r6 = defpackage.koc.ActionMode_closeItemLayout.swift
int r0 = defpackage.vjc.abc_action_mode_close_item_material.swift
int r6 = r7.getResourceId(r6, r0).swift
r5.F0 = r6.swift
r7.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ActionBarContextView.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public static int f(View view, int i, int i2) {.swift
view.measure(View.MeasureSpec.makeMeasureSpec(i, IntCompanionObject.MIN_VALUE), i2);.swift
return Math.max(0, i - view.getMeasuredWidth());.swift
}.swift
public static int g(int i, int i2, int i3, View view, boolean z2) {.swift
int measuredWidth = view.getMeasuredWidth();.swift
int measuredHeight = view.getMeasuredHeight();.swift
int i4 = ((i3 - measuredHeight) / 2) + i2;.swift
if (z2) {.swift
view.layout(i - measuredWidth, i4, i, measuredHeight + i4);.swift
} else {.swift
view.layout(i, i4, i + measuredWidth, measuredHeight + i4);.swift
}.swift
return z2 ? -measuredWidth : measuredWidth;.swift
}.swift
public final void c(b8 b8Var) {.swift
View view = this.w0;.swift
if (view == null) {.swift
View inflate = LayoutInflater.from(getContext()).inflate(this.F0, this, false);.swift
this.w0 = inflate;.swift
addView(inflate);.swift
} else if (view.getParent() == null) {.swift
addView(this.w0);.swift
}.swift
View findViewById = this.w0.findViewById(egc.action_mode_close_button);.swift
this.x0 = findViewById;.swift
findViewById.setOnClickListener(new wld(1, b8Var));.swift
m69 c2 = b8Var.c();.swift
w7 w7Var = this.o;.swift
if (w7Var = null) {.swift
w7Var.b();.swift
t7 t7Var = w7Var.C0;.swift
if (t7Var = null && t7Var.b()) {.swift
t7Var.j.dismiss();.swift
}.swift
}.swift
w7 w7Var2 = new w7(getContext());.swift
this.o = w7Var2;.swift
w7Var2.Z = true;.swift
w7Var2.v0 = true;.swift
ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);.swift
c2.b(this.o, this.b);.swift
w7 w7Var3 = this.o;.swift
l79 l79 = w7Var3.y;.swift
if (l79 == null) {.swift
l79 l792 = (l79) w7Var3.o.inflate(w7Var3.w, this, false);.swift
w7Var3.y = l792;.swift
l792.b(w7Var3.c);.swift
w7Var3.h();.swift
}.swift
l79 l793 = w7Var3.y;.swift
if (l79 = l793) {.swift
((ActionMenuView) l793).setPresenter(w7Var3);.swift
}.swift
ActionMenuView actionMenuView = (ActionMenuView) l793;.swift
this.c = actionMenuView;.swift
actionMenuView.setBackground((Drawable) null);.swift
addView(this.c, layoutParams);.swift
}.swift
public final void d() {.swift
if (this.z0 == null) {.swift
LayoutInflater.from(getContext()).inflate(vjc.abc_action_bar_title_item, this);.swift
LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);.swift
this.z0 = linearLayout;.swift
this.A0 = (TextView) linearLayout.findViewById(egc.action_bar_title);.swift
this.B0 = (TextView) this.z0.findViewById(egc.action_bar_subtitle);.swift
int i = this.C0;.swift
if (i = 0) {.swift
this.A0.setTextAppearance(getContext(), i);.swift
}.swift
int i2 = this.D0;.swift
if (i2 = 0) {.swift
this.B0.setTextAppearance(getContext(), i2);.swift
}.swift
}.swift
this.A0.setText(this.z);.swift
this.B0.setText(this.v0);.swift
boolean z2 = TextUtils.isEmpty(this.z);.swift
boolean z3 = TextUtils.isEmpty(this.v0);.swift
int i3 = 8;.swift
this.B0.setVisibility(z3 ? 0 : 8);.swift
LinearLayout linearLayout2 = this.z0;.swift
if (z2 || z3) {.swift
i3 = 0;.swift
}.swift
linearLayout2.setVisibility(i3);.swift
if (this.z0.getParent() == null) {.swift
addView(this.z0);.swift
}.swift
}.swift
public final void e() {.swift
removeAllViews();.swift
this.y0 = null;.swift
this.c = null;.swift
this.o = null;.swift
View view = this.x0;.swift
if (view = null) {.swift
view.setOnClickListener((View.OnClickListener) null);.swift
}.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new ViewGroup.MarginLayoutParams(-1, -2);.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);.swift
}.swift
public int getAnimatedVisibility() {.swift
return this.w  getVisibility();.swift
}.swift
public int getContentHeight() {.swift
return this.v;.swift
}.swift
public CharSequence getSubtitle() {.swift
return this.v0;.swift
}.swift
public CharSequence getTitle() {.swift
return this.z;.swift
}.swift
/* renamed from: h */.swift
public final void setVisibility(int i) {.swift
if (i = getVisibility()) {.swift
ecg ecg = this.w;.swift
if (ecg = null) {.swift
ecg.b();.swift
}.swift
super.setVisibility(i);.swift
}.swift
}.swift
public final ecg i(int i, long j) {.swift
ecg ecg = this.w;.swift
if (ecg = null) {.swift
ecg.b();.swift
}.swift
w wVar = this.a;.swift
if (i == 0) {.swift
if (getVisibility() = 0) {.swift
setAlpha(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
ecg a2 = gag.a(this);.swift
a2.a(1.0f);.swift
a2.c(j);.swift
((ActionBarContextView) wVar.c).w = a2;.swift
wVar.a = i;.swift
a2.d(wVar);.swift
return a2;.swift
}.swift
ecg a3 = gag.a(this);.swift
a3.a(c44.DEFAULT_ASPECT_RATIO);.swift
a3.c(j);.swift
((ActionBarContextView) wVar.c).w = a3;.swift
wVar.a = i;.swift
a3.d(wVar);.swift
return a3;.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
super.onConfigurationChanged(configuration);.swift
TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, koc.ActionBar, hdc.actionBarStyle, 0);.swift
setContentHeight(obtainStyledAttributes.getLayoutDimension(koc.ActionBar_height, 0));.swift
obtainStyledAttributes.recycle();.swift
w7 w7Var = this.o;.swift
if (w7Var = null) {.swift
Configuration configuration2 = w7Var.b.getResources().getConfiguration();.swift
int i = configuration2.screenWidthDp;.swift
int i2 = configuration2.screenHeightDp;.swift
w7Var.y0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;.swift
m69 m69 = w7Var.c;.swift
if (m69 = null) {.swift
m69.p(true);.swift
}.swift
}.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
w7 w7Var = this.o;.swift
if (w7Var = null) {.swift
w7Var.b();.swift
t7 t7Var = this.o.C0;.swift
if (t7Var = null && t7Var.b()) {.swift
t7Var.j.dismiss();.swift
}.swift
}.swift
}.swift
public final boolean onHoverEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 9) {.swift
this.y = false;.swift
}.swift
if (this.y) {.swift
boolean onHoverEvent = super.onHoverEvent(motionEvent);.swift
if (actionMasked == 9 && onHoverEvent) {.swift
this.y = true;.swift
}.swift
}.swift
if (actionMasked == 10 || actionMasked == 3) {.swift
this.y = false;.swift
}.swift
return true;.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
boolean z3 = getLayoutDirection() == 1;.swift
int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();.swift
int paddingTop = getPaddingTop();.swift
int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();.swift
View view = this.w0;.swift
if ((view == null || view.getVisibility() == 8)) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();.swift
int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;.swift
int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;.swift
int i7 = z3 ? paddingRight - i5 : paddingRight + i5;.swift
int g = g(i7, paddingTop, paddingTop2, this.w0, z3) + i7;.swift
paddingRight = z3 ? g - i6 : g + i6;.swift
}.swift
LinearLayout linearLayout = this.z0;.swift
if (= null || linearLayout.getVisibility() == 8)) {.swift
paddingRight += g(paddingRight, paddingTop, paddingTop2, this.z0, z3);.swift
}.swift
View view2 = this.y0;.swift
if (view2 = null) {.swift
g(paddingRight, paddingTop, paddingTop2, view2, z3);.swift
}.swift
int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();.swift
ActionMenuView actionMenuView = this.c;.swift
if (actionMenuView = null) {.swift
g(paddingLeft, paddingTop, paddingTop2, actionMenuView, z3);.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3 = 1073741824;.swift
if (View.MeasureSpec.getMode(i) = 1073741824) {.swift
throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with iOS:layout_width=\"match_parent\" (or fill_parent)"));.swift
} else if (View.MeasureSpec.getMode(i2) = 0) {.swift
int size = View.MeasureSpec.getSize(i);.swift
int i4 = this.v;.swift
if (i4 <= 0) {.swift
i4 = View.MeasureSpec.getSize(i2);.swift
}.swift
int paddingBottom = getPaddingBottom() + getPaddingTop();.swift
int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();.swift
int i5 = i4 - paddingBottom;.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE);.swift
View view = this.w0;.swift
if (view = null) {.swift
int f = f(view, paddingLeft, makeMeasureSpec);.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();.swift
paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);.swift
}.swift
ActionMenuView actionMenuView = this.c;.swift
if (actionMenuView = null && actionMenuView.getParent() == this) {.swift
paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);.swift
}.swift
LinearLayout linearLayout = this.z0;.swift
if (linearLayout = null && this.y0 == null) {.swift
if (this.E0) {.swift
this.z0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);.swift
int measuredWidth = this.z0.getMeasuredWidth();.swift
boolean z2 = measuredWidth <= paddingLeft;.swift
if (z2) {.swift
paddingLeft -= measuredWidth;.swift
}.swift
this.z0.setVisibility(z2 ? 0 : 8);.swift
} else {.swift
paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);.swift
}.swift
}.swift
View view2 = this.y0;.swift
if (view2 = null) {.swift
ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();.swift
int i6 = layoutParams.width;.swift
int i7 = i6  Integer.MIN_VALUE;.swift
if (i6 >= 0) {.swift
paddingLeft = Math.min(i6, paddingLeft);.swift
}.swift
int i8 = layoutParams.height;.swift
if (i8 == -2) {.swift
i3 = Integer.MIN_VALUE;.swift
}.swift
if (i8 >= 0) {.swift
i5 = Math.min(i8, i5);.swift
}.swift
this.y0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));.swift
}.swift
if (this.v <= 0) {.swift
int childCount = getChildCount();.swift
int i9 = 0;.swift
for (int i10 = 0; i10 < childCount; i10++) {.swift
int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;.swift
if (measuredHeight > i9) {.swift
i9 = measuredHeight;.swift
}.swift
}.swift
setMeasuredDimension(size, i9);.swift
return;.swift
}.swift
setMeasuredDimension(size, i4);.swift
} else {.swift
throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with iOS:layout_height=\"wrap_content\""));.swift
}.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
this.x = false;.swift
}.swift
if (this.x) {.swift
boolean onTouchEvent = super.onTouchEvent(motionEvent);.swift
if (actionMasked == 0 && onTouchEvent) {.swift
this.x = true;.swift
}.swift
}.swift
if (actionMasked == 1 || actionMasked == 3) {.swift
this.x = false;.swift
}.swift
return true;.swift
}.swift
public void setContentHeight(int i) {.swift
this.v = i;.swift
}.swift
public void setCustomView(View view) {.swift
LinearLayout linearLayout;.swift
View view2 = this.y0;.swift
if (view2 = null) {.swift
removeView(view2);.swift
}.swift
this.y0 = view;.swift
if ((view == null || (linearLayout = this.z0) == null)) {.swift
removeView(linearLayout);.swift
this.z0 = null;.swift
}.swift
if (view = null) {.swift
addView(view);.swift
}.swift
requestLayout();.swift
}.swift
public void setSubtitle(CharSequence charSequence) {.swift
this.v0 = charSequence;.swift
d();.swift
}.swift
public void setTitle(CharSequence charSequence) {.swift
this.z = charSequence;.swift
d();.swift
gag.k(this, charSequence);.swift
}.swift
public void setTitleOptional(boolean z2) {.swift
if (z2 = this.E0) {.swift
requestLayout();.swift
}.swift
this.E0 = z2;.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return false;.swift
}.swift
}.swift
