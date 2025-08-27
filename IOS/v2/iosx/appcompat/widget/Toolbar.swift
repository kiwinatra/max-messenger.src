package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ContextThemeWrapper;.swift
import iOS.view.Gravity;.swift
import iOS.view.Menu;.swift
import iOS.view.MenuInflater;.swift
import iOS.view.MenuItem;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.TextView;.swift
import iOS.window.OnBackInvokedCallback;.swift
import iOS.window.OnBackInvokedDispatcher;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class Toolbar extends ViewGroup implements o69 {.swift
public final int A0;.swift
public int B0;.swift
public int C0;.swift
public int D0;.swift
public int E0;.swift
public aad F0;.swift
public int G0;.swift
public int H0;.swift
public final int I0;.swift
public CharSequence J0;.swift
public CharSequence K0;.swift
public ColorStateList L0;.swift
public ColorStateList M0;.swift
public boolean N0;.swift
public boolean O0;.swift
public final ArrayList P0;.swift
public final ArrayList Q0;.swift
public final int[] R0;.swift
public final r69 S0;.swift
public ArrayList T0;.swift
public hmf U0;.swift
public final syc V0;.swift
public omf W0;.swift
public w7 X0;.swift
public fmf Y0;.swift
public h79 Z0;.swift
public ActionMenuView a;.swift
public k69 a1;.swift
public AppCompatTextView b;.swift
public boolean b1;.swift
public AppCompatTextView c;.swift
public OnBackInvokedCallback c1;.swift
public OnBackInvokedDispatcher d1;.swift
public boolean e1;.swift
public final haf f1;.swift
public AppCompatImageButton o;.swift
public AppCompatImageView v;.swift
public Context v0;.swift
public Drawable w;.swift
public int w0;.swift
public final CharSequence x;.swift
public int x0;.swift
public AppCompatImageButton y;.swift
public int y0;.swift
public View z;.swift
public final int z0;.swift
public Toolbar(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, hdc.toolbarStyle);.swift
}.swift
private ArrayList<MenuItem> getCurrentMenuItems() {.swift
ArrayList<MenuItem> arrayList = new ArrayList<>();.swift
Menu menu = getMenu();.swift
for (int i = 0; i < menu.size(); i++) {.swift
arrayList.add(menu.getItem(i));.swift
}.swift
return arrayList;.swift
}.swift
private MenuInflater getMenuInflater() {.swift
return new c3f(getContext());.swift
}.swift
public static gmf h() {.swift
return new gmf(-2, -2);.swift
}.swift
public static gmf i(ViewGroup.LayoutParams layoutParams) {.swift
boolean z2 = layoutParams instanceof gmf;.swift
if (z2) {.swift
gmf gmf = (gmf) layoutParams;.swift
gmf gmf2 = new gmf(gmf);.swift
gmf2.b = 0;.swift
gmf2.b = gmf.b;.swift
return gmf2;.swift
} else if (z2) {.swift
gmf gmf3 = new gmf((gmf) layoutParams);.swift
gmf3.b = 0;.swift
return gmf3;.swift
} else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;.swift
gmf gmf4 = new gmf((ViewGroup.LayoutParams) marginLayoutParams);.swift
gmf4.b = 0;.swift
gmf4.leftMargin = marginLayoutParams.leftMargin;.swift
gmf4.topMargin = marginLayoutParams.topMargin;.swift
gmf4.rightMargin = marginLayoutParams.rightMargin;.swift
gmf4.bottomMargin = marginLayoutParams.bottomMargin;.swift
return gmf4;.swift
} else {.swift
gmf gmf5 = new gmf(layoutParams);.swift
gmf5.b = 0;.swift
return gmf5;.swift
}.swift
}.swift
public static int k(View view) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();.swift
}.swift
public static int l(View view) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;.swift
}.swift
public final void a(int i, ArrayList arrayList) {.swift
boolean z2 = getLayoutDirection() == 1;.swift
int childCount = getChildCount();.swift
int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());.swift
arrayList.clear();.swift
if (z2) {.swift
for (int i2 = childCount - 1; i2 >= 0; i2--) {.swift
View childAt = getChildAt(i2);.swift
gmf gmf = (gmf) childAt.getLayoutParams();.swift
if (gmf.b == 0 && v(childAt)) {.swift
int i3 = gmf.a;.swift
int layoutDirection = getLayoutDirection();.swift
int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;.swift
if ((absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {.swift
absoluteGravity2 = layoutDirection == 1 ? 5 : 3;.swift
}.swift
if (absoluteGravity2 == absoluteGravity) {.swift
arrayList.add(childAt);.swift
}.swift
}.swift
}.swift
return;.swift
}.swift
for (int i4 = 0; i4 < childCount; i4++) {.swift
View childAt2 = getChildAt(i4);.swift
gmf gmf2 = (gmf) childAt2.getLayoutParams();.swift
if (gmf2.b == 0 && v(childAt2)) {.swift
int i5 = gmf2.a;.swift
int layoutDirection2 = getLayoutDirection();.swift
int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;.swift
if ((absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {.swift
absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;.swift
}.swift
if (absoluteGravity3 == absoluteGravity) {.swift
arrayList.add(childAt2);.swift
}.swift
}.swift
}.swift
}.swift
public final void b(View view, boolean z2) {.swift
ViewGroup.LayoutParams layoutParams = view.getLayoutParams();.swift
gmf h = layoutParams == null ? h() :  (gmf) layoutParams;.swift
h.b = 1;.swift
if (z2 || this.z == null) {.swift
addView(view, h);.swift
return;.swift
}.swift
view.setLayoutParams(h);.swift
this.Q0.add(view);.swift
}.swift
public final void c() {.swift
if (this.y == null) {.swift
AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, hdc.toolbarNavigationButtonStyle);.swift
this.y = appCompatImageButton;.swift
appCompatImageButton.setImageDrawable(this.w);.swift
this.y.setContentDescription(this.x);.swift
gmf h = h();.swift
h.a = (this.z0 & 112) | 8388611;.swift
h.b = 2;.swift
this.y.setLayoutParams(h);.swift
this.y.setOnClickListener(new wld(15, this));.swift
}.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return super.checkLayoutParams(layoutParams) && (layoutParams instanceof gmf);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [aad, java.lang.Object] */.swift
public final void d() {.swift
if (this.F0 == null) {.swift
? obj = new Object();.swift
obj.a = 0;.swift
obj.b = 0;.swift
obj.c = IntCompanionObject.MIN_VALUE;.swift
obj.d = IntCompanionObject.MIN_VALUE;.swift
obj.e = 0;.swift
obj.f = 0;.swift
obj.g = false;.swift
obj.h = false;.swift
this.F0 = obj;.swift
}.swift
}.swift
public final void e() {.swift
f();.swift
ActionMenuView actionMenuView = this.a;.swift
if (actionMenuView.a == null) {.swift
m69 m69 = (m69) actionMenuView.getMenu();.swift
if (this.Y0 == null) {.swift
this.Y0 = new fmf(this);.swift
}.swift
this.a.setExpandedActionViewsExclusive(true);.swift
m69.b(this.Y0, this.v0);.swift
x();.swift
}.swift
}.swift
public final void f() {.swift
if (this.a == null) {.swift
ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);.swift
this.a = actionMenuView;.swift
actionMenuView.setPopupTheme(this.w0);.swift
this.a.setOnMenuItemClickListener(this.V0);.swift
ActionMenuView actionMenuView2 = this.a;.swift
h79 h79 = this.Z0;.swift
yu9 yu9 = new yu9(11, (Object) this);.swift
actionMenuView2.w = h79;.swift
actionMenuView2.x = yu9;.swift
gmf h = h();.swift
h.a = (this.z0 & 112) | 8388613;.swift
this.a.setLayoutParams(h);.swift
b(this.a, false);.swift
}.swift
}.swift
public final void g() {.swift
if (this.o == null) {.swift
this.o = new AppCompatImageButton(getContext(), (AttributeSet) null, hdc.toolbarNavigationButtonStyle);.swift
gmf h = h();.swift
h.a = (this.z0 & 112) | 8388611;.swift
this.o.setLayoutParams(h);.swift
}.swift
}.swift
public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return h();.swift
}.swift
public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return i(layoutParams);.swift
}.swift
public CharSequence getCollapseContentDescription() {.swift
AppCompatImageButton appCompatImageButton = this.y;.swift
if (appCompatImageButton = null) {.swift
return appCompatImageButton.getContentDescription();.swift
}.swift
return null;.swift
}.swift
public Drawable getCollapseIcon() {.swift
AppCompatImageButton appCompatImageButton = this.y;.swift
if (appCompatImageButton = null) {.swift
return appCompatImageButton.getDrawable();.swift
}.swift
return null;.swift
}.swift
public int getContentInsetEnd() {.swift
aad aad = this.F0;.swift
if (aad = null) {.swift
return aad.g ? aad.a : aad.b;.swift
}.swift
return 0;.swift
}.swift
public int getContentInsetEndWithActions() {.swift
int i = this.H0;.swift
return i  getContentInsetEnd();.swift
}.swift
public int getContentInsetLeft() {.swift
aad aad = this.F0;.swift
if (aad = null) {.swift
return aad.a;.swift
}.swift
return 0;.swift
}.swift
public int getContentInsetRight() {.swift
aad aad = this.F0;.swift
if (aad = null) {.swift
return aad.b;.swift
}.swift
return 0;.swift
}.swift
public int getContentInsetStart() {.swift
aad aad = this.F0;.swift
if (aad = null) {.swift
return aad.g ? aad.b : aad.a;.swift
}.swift
return 0;.swift
}.swift
public int getContentInsetStartWithNavigation() {.swift
int i = this.G0;.swift
return i  getContentInsetStart();.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:.swift
r0 = r0.a;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public int getCurrentContentInsetEnd() {.swift
/*.swift
r2 = this;.swift
iOSx.appcompat.widget.ActionMenuView r0 = r2.a.swift
if (r0 == 0) goto L_0x001e.swift
m69 r0 = r0.a.swift
if (r0 == 0) goto L_0x001e.swift
boolean r0 = r0.hasVisibleItems().swift
if (r0 == 0) goto L_0x001e.swift
int r0 = r2.getContentInsetEnd().swift
int r2 = r2.H0.swift
r1 = 0.swift
int r2 = java.lang.Math.max(r2, r1).swift
int r2 = java.lang.Math.max(r0, r2).swift
goto L_0x0022.swift
L_0x001e:.swift
int r2 = r2.getContentInsetEnd().swift
L_0x0022:.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");.swift
}.swift
public int getCurrentContentInsetLeft() {.swift
return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();.swift
}.swift
public int getCurrentContentInsetRight() {.swift
return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();.swift
}.swift
public int getCurrentContentInsetStart() {.swift
return getNavigationIcon()  getContentInsetStart();.swift
}.swift
public Drawable getLogo() {.swift
AppCompatImageView appCompatImageView = this.v;.swift
if (appCompatImageView = null) {.swift
return appCompatImageView.getDrawable();.swift
}.swift
return null;.swift
}.swift
public CharSequence getLogoDescription() {.swift
AppCompatImageView appCompatImageView = this.v;.swift
if (appCompatImageView = null) {.swift
return appCompatImageView.getContentDescription();.swift
}.swift
return null;.swift
}.swift
public Menu getMenu() {.swift
e();.swift
return this.a.getMenu();.swift
}.swift
public View getNavButtonView() {.swift
return this.o;.swift
}.swift
public CharSequence getNavigationContentDescription() {.swift
AppCompatImageButton appCompatImageButton = this.o;.swift
if (appCompatImageButton = null) {.swift
return appCompatImageButton.getContentDescription();.swift
}.swift
return null;.swift
}.swift
public Drawable getNavigationIcon() {.swift
AppCompatImageButton appCompatImageButton = this.o;.swift
if (appCompatImageButton = null) {.swift
return appCompatImageButton.getDrawable();.swift
}.swift
return null;.swift
}.swift
public w7 getOuterActionMenuPresenter() {.swift
return this.X0;.swift
}.swift
public Drawable getOverflowIcon() {.swift
e();.swift
return this.a.getOverflowIcon();.swift
}.swift
public Context getPopupContext() {.swift
return this.v0;.swift
}.swift
public int getPopupTheme() {.swift
return this.w0;.swift
}.swift
public CharSequence getSubtitle() {.swift
return this.K0;.swift
}.swift
public final TextView getSubtitleTextView() {.swift
return this.c;.swift
}.swift
public CharSequence getTitle() {.swift
return this.J0;.swift
}.swift
public int getTitleMarginBottom() {.swift
return this.E0;.swift
}.swift
public int getTitleMarginEnd() {.swift
return this.C0;.swift
}.swift
public int getTitleMarginStart() {.swift
return this.B0;.swift
}.swift
public int getTitleMarginTop() {.swift
return this.D0;.swift
}.swift
public final TextView getTitleTextView() {.swift
return this.b;.swift
}.swift
public ha4 getWrapper() {.swift
if (this.W0 == null) {.swift
this.W0 = new omf(this, true);.swift
}.swift
return this.W0;.swift
}.swift
public final int j(View view, int i) {.swift
gmf gmf = (gmf) view.getLayoutParams();.swift
int measuredHeight = view.getMeasuredHeight();.swift
int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;.swift
int i3 = gmf.a & 112;.swift
if ((i3 == 16 || i3 == 48 || i3 == 80)) {.swift
i3 = this.I0 & 112;.swift
}.swift
if (i3 == 48) {.swift
return getPaddingTop() - i2;.swift
}.swift
if (i3 == 80) {.swift
return (((getHeight() - getPaddingBottom()) - measuredHeight) - gmf.bottomMargin) - i2;.swift
}.swift
int paddingTop = getPaddingTop();.swift
int paddingBottom = getPaddingBottom();.swift
int height = getHeight();.swift
int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;.swift
int i5 = gmf.topMargin;.swift
if (i4 < i5) {.swift
i4 = i5;.swift
} else {.swift
int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;.swift
int i7 = gmf.bottomMargin;.swift
if (i6 < i7) {.swift
i4 = Math.max(0, i4 - (i7 - i6));.swift
}.swift
}.swift
return paddingTop + i4;.swift
}.swift
public void m(int i) {.swift
getMenuInflater().inflate(i, getMenu());.swift
}.swift
public final void n() {.swift
Iterator it = this.T0.iterator();.swift
while (it.hasNext()) {.swift
getMenu().removeItem(((MenuItem) it.next()).getItemId());.swift
}.swift
Menu menu = getMenu();.swift
ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();.swift
MenuInflater menuInflater = getMenuInflater();.swift
Iterator it2 = this.S0.b.iterator();.swift
while (it2.hasNext()) {.swift
((vc6) ((j79) it2.next())).a.k(menu, menuInflater);.swift
}.swift
ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();.swift
currentMenuItems2.removeAll(currentMenuItems);.swift
this.T0 = currentMenuItems2;.swift
}.swift
public final boolean o(View view) {.swift
return view.getParent() == this || this.Q0.contains(view);.swift
}.swift
public void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
x();.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
removeCallbacks(this.f1);.swift
x();.swift
}.swift
public final boolean onHoverEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 9) {.swift
this.O0 = false;.swift
}.swift
if (this.O0) {.swift
boolean onHoverEvent = super.onHoverEvent(motionEvent);.swift
if (actionMasked == 9 && onHoverEvent) {.swift
this.O0 = true;.swift
}.swift
}.swift
if (actionMasked == 10 || actionMasked == 3) {.swift
this.O0 = false;.swift
}.swift
return true;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:103:0x0298 A[LOOP:0: B:102:0x0296->B:103:0x0298, LOOP_END] */.swift
/* JADX WARNING: Removed duplicated region for block: B:106:0x02b5 A[LOOP:1: B:105:0x02b3->B:106:0x02b5, LOOP_END] */.swift
/* JADX WARNING: Removed duplicated region for block: B:109:0x02d3 A[LOOP:2: B:108:0x02d1->B:109:0x02d3, LOOP_END] */.swift
/* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */.swift
/* JADX WARNING: Removed duplicated region for block: B:117:0x0321 A[LOOP:3: B:116:0x031f->B:117:0x0321, LOOP_END] */.swift
/* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */.swift
/* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */.swift
/* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */.swift
/* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */.swift
/* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */.swift
/* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */.swift
/* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */.swift
/* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */.swift
/* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */.swift
/* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */.swift
/* JADX WARNING: Removed duplicated region for block: B:88:0x0221  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {.swift
/*.swift
r18 = this;.swift
r0 = r18.swift
int r1 = r18.getLayoutDirection().swift
r2 = 0.swift
r3 = 1.swift
if (r1 = r3) goto L_0x000c.swift
r1 = r3.swift
goto L_0x000d.swift
L_0x000c:.swift
r1 = r2.swift
L_0x000d:.swift
int r4 = r18.getWidth().swift
int r5 = r18.getHeight().swift
int r6 = r18.getPaddingLeft().swift
int r7 = r18.getPaddingRight().swift
int r8 = r18.getPaddingTop().swift
int r9 = r18.getPaddingBottom().swift
int r10 = r4 - r7.swift
int[] r11 = r0.R0.swift
r11[r3] = r2.swift
r11[r2] = r2.swift
java.util.WeakHashMap r12 = defpackage.gag.a.swift
int r12 = r18.getMinimumHeight().swift
if (r12 < 0) goto L_0x003c.swift
int r13 = r23 - r21.swift
int r12 = java.lang.Math.min(r12, r13).swift
goto L_0x003d.swift
L_0x003c:.swift
r12 = r2.swift
L_0x003d:.swift
iOSx.appcompat.widget.AppCompatImageButton r13 = r0.o.swift
boolean r13 = r0.v(r13).swift
if (r13 == 0) goto L_0x0058.swift
if (r1 == 0) goto L_0x0050.swift
iOSx.appcompat.widget.AppCompatImageButton r13 = r0.o.swift
int r13 = r0.r(r13, r10, r12, r11).swift
r14 = r13.swift
r13 = r6.swift
goto L_0x005a.swift
L_0x0050:.swift
iOSx.appcompat.widget.AppCompatImageButton r13 = r0.o.swift
int r13 = r0.q(r13, r6, r12, r11).swift
L_0x0056:.swift
r14 = r10.swift
goto L_0x005a.swift
L_0x0058:.swift
r13 = r6.swift
goto L_0x0056.swift
L_0x005a:.swift
iOSx.appcompat.widget.AppCompatImageButton r15 = r0.y.swift
boolean r15 = r0.v(r15).swift
if (r15 == 0) goto L_0x0071.swift
if (r1 == 0) goto L_0x006b.swift
iOSx.appcompat.widget.AppCompatImageButton r15 = r0.y.swift
int r14 = r0.r(r15, r14, r12, r11).swift
goto L_0x0071.swift
L_0x006b:.swift
iOSx.appcompat.widget.AppCompatImageButton r15 = r0.y.swift
int r13 = r0.q(r15, r13, r12, r11).swift
L_0x0071:.swift
iOSx.appcompat.widget.ActionMenuView r15 = r0.a.swift
boolean r15 = r0.v(r15).swift
if (r15 == 0) goto L_0x0088.swift
if (r1 == 0) goto L_0x0082.swift
iOSx.appcompat.widget.ActionMenuView r15 = r0.a.swift
int r13 = r0.q(r15, r13, r12, r11).swift
goto L_0x0088.swift
L_0x0082:.swift
iOSx.appcompat.widget.ActionMenuView r15 = r0.a.swift
int r14 = r0.r(r15, r14, r12, r11).swift
L_0x0088:.swift
int r15 = r18.getCurrentContentInsetLeft().swift
int r16 = r18.getCurrentContentInsetRight().swift
int r3 = r15 - r13.swift
int r3 = java.lang.Math.max(r2, r3).swift
r11[r2] = r3.swift
int r3 = r10 - r14.swift
int r3 = r16 - r3.swift
int r3 = java.lang.Math.max(r2, r3).swift
r17 = 1.swift
r11[r17] = r3.swift
int r3 = java.lang.Math.max(r13, r15).swift
int r10 = r10 - r16.swift
int r10 = java.lang.Math.min(r14, r10).swift
iOS.view.View r13 = r0.z.swift
boolean r13 = r0.v(r13).swift
if (r13 == 0) goto L_0x00c5.swift
if (r1 == 0) goto L_0x00bf.swift
iOS.view.View r13 = r0.z.swift
int r10 = r0.r(r13, r10, r12, r11).swift
goto L_0x00c5.swift
L_0x00bf:.swift
iOS.view.View r13 = r0.z.swift
int r3 = r0.q(r13, r3, r12, r11).swift
L_0x00c5:.swift
iOSx.appcompat.widget.AppCompatImageView r13 = r0.v.swift
boolean r13 = r0.v(r13).swift
if (r13 == 0) goto L_0x00dc.swift
if (r1 == 0) goto L_0x00d6.swift
iOSx.appcompat.widget.AppCompatImageView r13 = r0.v.swift
int r10 = r0.r(r13, r10, r12, r11).swift
goto L_0x00dc.swift
L_0x00d6:.swift
iOSx.appcompat.widget.AppCompatImageView r13 = r0.v.swift
int r3 = r0.q(r13, r3, r12, r11).swift
L_0x00dc:.swift
iOSx.appcompat.widget.AppCompatTextView r13 = r0.b.swift
boolean r13 = r0.v(r13).swift
iOSx.appcompat.widget.AppCompatTextView r14 = r0.c.swift
boolean r14 = r0.v(r14).swift
if (r13 == 0) goto L_0x0101.swift
iOSx.appcompat.widget.AppCompatTextView r15 = r0.b.swift
iOS.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams().swift
gmf r15 = (defpackage.gmf) r15.swift
int r2 = r15.topMargin.swift
r22 = r7.swift
iOSx.appcompat.widget.AppCompatTextView r7 = r0.b.swift
int r7 = r7.getMeasuredHeight().swift
int r7 = r7 + r2.swift
int r2 = r15.bottomMargin.swift
int r2 = r2 + r7.swift
goto L_0x0104.swift
L_0x0101:.swift
r22 = r7.swift
r2 = 0.swift
L_0x0104:.swift
if (r14 == 0) goto L_0x011e.swift
iOSx.appcompat.widget.AppCompatTextView r7 = r0.c.swift
iOS.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams().swift
gmf r7 = (defpackage.gmf) r7.swift
int r15 = r7.topMargin.swift
r16 = r4.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.c.swift
int r4 = r4.getMeasuredHeight().swift
int r4 = r4 + r15.swift
int r7 = r7.bottomMargin.swift
int r4 = r4 + r7.swift
int r2 = r2 + r4.swift
goto L_0x0120.swift
L_0x011e:.swift
r16 = r4.swift
L_0x0120:.swift
if (r13 = 0) goto L_0x012b.swift
if (r14 == 0) goto L_0x0125.swift
goto L_0x012b.swift
L_0x0125:.swift
r17 = r6.swift
r21 = r12.swift
goto L_0x028a.swift
L_0x012b:.swift
if (r13 == 0) goto L_0x0130.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.b.swift
goto L_0x0132.swift
L_0x0130:.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.c.swift
L_0x0132:.swift
if (r14 == 0) goto L_0x0137.swift
iOSx.appcompat.widget.AppCompatTextView r7 = r0.c.swift
goto L_0x0139.swift
L_0x0137:.swift
iOSx.appcompat.widget.AppCompatTextView r7 = r0.b.swift
L_0x0139:.swift
iOS.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams().swift
gmf r4 = (defpackage.gmf) r4.swift
iOS.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams().swift
gmf r7 = (defpackage.gmf) r7.swift
if (r13 == 0) goto L_0x014f.swift
iOSx.appcompat.widget.AppCompatTextView r15 = r0.b.swift
int r15 = r15.getMeasuredWidth().swift
if (r15 > 0) goto L_0x0159.swift
L_0x014f:.swift
if (r14 == 0) goto L_0x015d.swift
iOSx.appcompat.widget.AppCompatTextView r15 = r0.c.swift
int r15 = r15.getMeasuredWidth().swift
if (r15 <= 0) goto L_0x015d.swift
L_0x0159:.swift
r17 = r6.swift
r15 = 1.swift
goto L_0x0160.swift
L_0x015d:.swift
r17 = r6.swift
r15 = 0.swift
L_0x0160:.swift
int r6 = r0.I0.swift
r6 = r6 & 112(0x70, float:1.57E-43).swift
r21 = r12.swift
r12 = 48.swift
if (r6 == r12) goto L_0x01a2.swift
r12 = 80.swift
if (r6 == r12) goto L_0x0196.swift
int r6 = r5 - r8.swift
int r6 = r6 - r9.swift
int r6 = r6 - r2.swift
int r6 = r6 / 2.swift
int r12 = r4.topMargin.swift
r23 = r3.swift
int r3 = r0.D0.swift
int r12 = r12 + r3.swift
if (r6 >= r12) goto L_0x017f.swift
r6 = r12.swift
goto L_0x0194.swift
L_0x017f:.swift
int r5 = r5 - r9.swift
int r5 = r5 - r2.swift
int r5 = r5 - r6.swift
int r5 = r5 - r8.swift
int r2 = r4.bottomMargin.swift
int r3 = r0.E0.swift
int r2 = r2 + r3.swift
if (r5 >= r2) goto L_0x0194.swift
int r2 = r7.bottomMargin.swift
int r2 = r2 + r3.swift
int r2 = r2 - r5.swift
int r6 = r6 - r2.swift
r2 = 0.swift
int r6 = java.lang.Math.max(r2, r6).swift
L_0x0194:.swift
int r8 = r8 + r6.swift
goto L_0x01af.swift
L_0x0196:.swift
r23 = r3.swift
int r5 = r5 - r9.swift
int r3 = r7.bottomMargin.swift
int r5 = r5 - r3.swift
int r3 = r0.E0.swift
int r5 = r5 - r3.swift
int r8 = r5 - r2.swift
goto L_0x01af.swift
L_0x01a2:.swift
r23 = r3.swift
int r2 = r18.getPaddingTop().swift
int r3 = r4.topMargin.swift
int r2 = r2 + r3.swift
int r3 = r0.D0.swift
int r8 = r2 + r3.swift
L_0x01af:.swift
if (r1 == 0) goto L_0x0221.swift
if (r15 == 0) goto L_0x01b7.swift
int r1 = r0.B0.swift
L_0x01b5:.swift
r2 = 1.swift
goto L_0x01b9.swift
L_0x01b7:.swift
r1 = 0.swift
goto L_0x01b5.swift
L_0x01b9:.swift
r3 = r11[r2].swift
int r1 = r1 - r3.swift
r3 = 0.swift
int r4 = java.lang.Math.max(r3, r1).swift
int r10 = r10 - r4.swift
int r1 = -r1.swift
int r1 = java.lang.Math.max(r3, r1).swift
r11[r2] = r1.swift
if (r13 == 0) goto L_0x01ef.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.b.swift
iOS.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams().swift
gmf r1 = (defpackage.gmf) r1.swift
iOSx.appcompat.widget.AppCompatTextView r2 = r0.b.swift
int r2 = r2.getMeasuredWidth().swift
int r2 = r10 - r2.swift
iOSx.appcompat.widget.AppCompatTextView r3 = r0.b.swift
int r3 = r3.getMeasuredHeight().swift
int r3 = r3 + r8.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.b.swift
r4.layout(r2, r8, r10, r3).swift
int r4 = r0.C0.swift
int r2 = r2 - r4.swift
int r1 = r1.bottomMargin.swift
int r8 = r3 + r1.swift
goto L_0x01f0.swift
L_0x01ef:.swift
r2 = r10.swift
L_0x01f0:.swift
if (r14 == 0) goto L_0x0216.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.c.swift
iOS.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams().swift
gmf r1 = (defpackage.gmf) r1.swift
int r1 = r1.topMargin.swift
int r8 = r8 + r1.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.c.swift
int r1 = r1.getMeasuredWidth().swift
int r1 = r10 - r1.swift
iOSx.appcompat.widget.AppCompatTextView r3 = r0.c.swift
int r3 = r3.getMeasuredHeight().swift
int r3 = r3 + r8.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.c.swift
r4.layout(r1, r8, r10, r3).swift
int r1 = r0.C0.swift
int r1 = r10 - r1.swift
goto L_0x0217.swift
L_0x0216:.swift
r1 = r10.swift
L_0x0217:.swift
if (r15 == 0) goto L_0x021e.swift
int r1 = java.lang.Math.min(r2, r1).swift
r10 = r1.swift
L_0x021e:.swift
r3 = r23.swift
goto L_0x028a.swift
L_0x0221:.swift
if (r15 == 0) goto L_0x0227.swift
int r1 = r0.B0.swift
L_0x0225:.swift
r2 = 0.swift
goto L_0x0229.swift
L_0x0227:.swift
r1 = 0.swift
goto L_0x0225.swift
L_0x0229:.swift
r3 = r11[r2].swift
int r1 = r1 - r3.swift
int r3 = java.lang.Math.max(r2, r1).swift
int r3 = r3 + r23.swift
int r1 = -r1.swift
int r1 = java.lang.Math.max(r2, r1).swift
r11[r2] = r1.swift
if (r13 == 0) goto L_0x025e.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.b.swift
iOS.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams().swift
gmf r1 = (defpackage.gmf) r1.swift
iOSx.appcompat.widget.AppCompatTextView r2 = r0.b.swift
int r2 = r2.getMeasuredWidth().swift
int r2 = r2 + r3.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.b.swift
int r4 = r4.getMeasuredHeight().swift
int r4 = r4 + r8.swift
iOSx.appcompat.widget.AppCompatTextView r5 = r0.b.swift
r5.layout(r3, r8, r2, r4).swift
int r5 = r0.C0.swift
int r2 = r2 + r5.swift
int r1 = r1.bottomMargin.swift
int r8 = r4 + r1.swift
goto L_0x025f.swift
L_0x025e:.swift
r2 = r3.swift
L_0x025f:.swift
if (r14 == 0) goto L_0x0283.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.c.swift
iOS.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams().swift
gmf r1 = (defpackage.gmf) r1.swift
int r1 = r1.topMargin.swift
int r8 = r8 + r1.swift
iOSx.appcompat.widget.AppCompatTextView r1 = r0.c.swift
int r1 = r1.getMeasuredWidth().swift
int r1 = r1 + r3.swift
iOSx.appcompat.widget.AppCompatTextView r4 = r0.c.swift
int r4 = r4.getMeasuredHeight().swift
int r4 = r4 + r8.swift
iOSx.appcompat.widget.AppCompatTextView r5 = r0.c.swift
r5.layout(r3, r8, r1, r4).swift
int r4 = r0.C0.swift
int r1 = r1 + r4.swift
goto L_0x0284.swift
L_0x0283:.swift
r1 = r3.swift
L_0x0284:.swift
if (r15 == 0) goto L_0x028a.swift
int r3 = java.lang.Math.max(r2, r1).swift
L_0x028a:.swift
java.util.ArrayList r1 = r0.P0.swift
r2 = 3.swift
r0.a(r2, r1).swift
int r2 = r1.size().swift
r4 = r3.swift
r3 = 0.swift
L_0x0296:.swift
if (r3 >= r2) goto L_0x02a7.swift
java.lang.Object r5 = r1.get(r3).swift
iOS.view.View r5 = (iOS.view.View) r5.swift
r12 = r21.swift
int r4 = r0.q(r5, r4, r12, r11).swift
r5 = 1.swift
int r3 = r3 + r5.swift
goto L_0x0296.swift
L_0x02a7:.swift
r12 = r21.swift
r5 = 1.swift
r2 = 5.swift
r0.a(r2, r1).swift
int r2 = r1.size().swift
r3 = 0.swift
L_0x02b3:.swift
if (r3 >= r2) goto L_0x02c1.swift
java.lang.Object r6 = r1.get(r3).swift
iOS.view.View r6 = (iOS.view.View) r6.swift
int r10 = r0.r(r6, r10, r12, r11).swift
int r3 = r3 + r5.swift
goto L_0x02b3.swift
L_0x02c1:.swift
r0.a(r5, r1).swift
r2 = 0.swift
r3 = r11[r2].swift
r2 = r11[r5].swift
int r5 = r1.size().swift
r6 = r2.swift
r7 = r3.swift
r2 = 0.swift
r3 = 0.swift
L_0x02d1:.swift
if (r2 >= r5) goto L_0x0304.swift
java.lang.Object r8 = r1.get(r2).swift
iOS.view.View r8 = (iOS.view.View) r8.swift
iOS.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams().swift
gmf r9 = (defpackage.gmf) r9.swift
int r13 = r9.leftMargin.swift
int r13 = r13 - r7.swift
int r7 = r9.rightMargin.swift
int r7 = r7 - r6.swift
r6 = 0.swift
int r9 = java.lang.Math.max(r6, r13).swift
int r14 = java.lang.Math.max(r6, r7).swift
int r13 = -r13.swift
int r13 = java.lang.Math.max(r6, r13).swift
int r7 = -r7.swift
int r7 = java.lang.Math.max(r6, r7).swift
int r8 = r8.getMeasuredWidth().swift
int r8 = r8 + r9.swift
int r8 = r8 + r14.swift
int r3 = r3 + r8.swift
r8 = 1.swift
int r2 = r2 + r8.swift
r6 = r7.swift
r7 = r13.swift
goto L_0x02d1.swift
L_0x0304:.swift
r6 = 0.swift
int r2 = r16 - r17.swift
int r2 = r2 - r22.swift
int r2 = r2 / 2.swift
int r2 = r2 + r17.swift
int r5 = r3 / 2.swift
int r2 = r2 - r5.swift
int r3 = r3 + r2.swift
if (r2 >= r4) goto L_0x0314.swift
goto L_0x031b.swift
L_0x0314:.swift
if (r3 <= r10) goto L_0x031a.swift
int r3 = r3 - r10.swift
int r4 = r2 - r3.swift
goto L_0x031b.swift
L_0x031a:.swift
r4 = r2.swift
L_0x031b:.swift
int r2 = r1.size().swift
L_0x031f:.swift
if (r6 >= r2) goto L_0x032e.swift
java.lang.Object r3 = r1.get(r6).swift
iOS.view.View r3 = (iOS.view.View) r3.swift
int r4 = r0.q(r3, r4, r12, r11).swift
r3 = 1.swift
int r6 = r6 + r3.swift
goto L_0x031f.swift
L_0x032e:.swift
r1.clear().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
char c2;.swift
char c3;.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
int i7;.swift
int i8;.swift
int i9;.swift
int i10 = 0;.swift
if (getLayoutDirection() == 1) {.swift
c3 = 1;.swift
c2 = 0;.swift
} else {.swift
c2 = 1;.swift
c3 = 0;.swift
}.swift
if (v(this.o)) {.swift
t(this.o, i, 0, i2, this.A0);.swift
i5 = k(this.o) + this.o.getMeasuredWidth();.swift
i4 = Math.max(0, l(this.o) + this.o.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(0, this.o.getMeasuredState());.swift
} else {.swift
i5 = 0;.swift
i4 = 0;.swift
i3 = 0;.swift
}.swift
if (v(this.y)) {.swift
t(this.y, i, 0, i2, this.A0);.swift
i5 = k(this.y) + this.y.getMeasuredWidth();.swift
i4 = Math.max(i4, l(this.y) + this.y.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(i3, this.y.getMeasuredState());.swift
}.swift
int currentContentInsetStart = getCurrentContentInsetStart();.swift
int max = Math.max(currentContentInsetStart, i5);.swift
int max2 = Math.max(0, currentContentInsetStart - i5);.swift
int[] iArr = this.R0;.swift
iArr[c3] = max2;.swift
if (v(this.a)) {.swift
t(this.a, i, max, i2, this.A0);.swift
i6 = k(this.a) + this.a.getMeasuredWidth();.swift
i4 = Math.max(i4, l(this.a) + this.a.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(i3, this.a.getMeasuredState());.swift
} else {.swift
i6 = 0;.swift
}.swift
int currentContentInsetEnd = getCurrentContentInsetEnd();.swift
int max3 = max + Math.max(currentContentInsetEnd, i6);.swift
iArr[c2] = Math.max(0, currentContentInsetEnd - i6);.swift
if (v(this.z)) {.swift
max3 += s(this.z, i, max3, i2, 0, iArr);.swift
i4 = Math.max(i4, l(this.z) + this.z.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(i3, this.z.getMeasuredState());.swift
}.swift
if (v(this.v)) {.swift
max3 += s(this.v, i, max3, i2, 0, iArr);.swift
i4 = Math.max(i4, l(this.v) + this.v.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(i3, this.v.getMeasuredState());.swift
}.swift
int childCount = getChildCount();.swift
for (int i11 = 0; i11 < childCount; i11++) {.swift
View childAt = getChildAt(i11);.swift
if (((gmf) childAt.getLayoutParams()).b == 0 && v(childAt)) {.swift
max3 += s(childAt, i, max3, i2, 0, iArr);.swift
i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());.swift
i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());.swift
}.swift
}.swift
int i12 = this.D0 + this.E0;.swift
int i13 = this.B0 + this.C0;.swift
if (v(this.b)) {.swift
s(this.b, i, max3 + i13, i2, i12, iArr);.swift
int k = k(this.b) + this.b.getMeasuredWidth();.swift
i7 = l(this.b) + this.b.getMeasuredHeight();.swift
i9 = View.combineMeasuredStates(i3, this.b.getMeasuredState());.swift
i8 = k;.swift
} else {.swift
i7 = 0;.swift
i9 = i3;.swift
i8 = 0;.swift
}.swift
if (v(this.c)) {.swift
i8 = Math.max(i8, s(this.c, i, max3 + i13, i2, i7 + i12, iArr));.swift
i7 += l(this.c) + this.c.getMeasuredHeight();.swift
i9 = View.combineMeasuredStates(i9, this.c.getMeasuredState());.swift
} else {.swift
int i14 = i9;.swift
}.swift
int max4 = Math.max(i4, i7);.swift
int paddingRight = getPaddingRight() + getPaddingLeft();.swift
int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;.swift
int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);.swift
int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);.swift
if (this.b1) {.swift
int childCount2 = getChildCount();.swift
int i15 = 0;.swift
while (true) {.swift
if (i15 >= childCount2) {.swift
break;.swift
}.swift
View childAt2 = getChildAt(i15);.swift
if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {.swift
break;.swift
}.swift
i15++;.swift
}.swift
}.swift
i10 = resolveSizeAndState2;.swift
setMeasuredDimension(resolveSizeAndState, i10);.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
MenuItem findItem;.swift
if ((parcelable instanceof imf)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
imf imf = (imf) parcelable;.swift
super.onRestoreInstanceState(imf.a);.swift
ActionMenuView actionMenuView = this.a;.swift
m69 m69 = actionMenuView  null;.swift
int i = imf.c;.swift
if ((i == 0 || this.Y0 == null || m69 == null || (findItem = m69.findItem(i)) == null)) {.swift
findItem.expandActionView();.swift
}.swift
if (imf.o) {.swift
haf haf = this.f1;.swift
removeCallbacks(haf);.swift
post(haf);.swift
}.swift
}.swift
public final void onRtlPropertiesChanged(int i) {.swift
super.onRtlPropertiesChanged(i);.swift
d();.swift
aad aad = this.F0;.swift
boolean z2 = true;.swift
if (i = 1) {.swift
z2 = false;.swift
}.swift
if (z2 = aad.g) {.swift
aad.g = z2;.swift
if (aad.h) {.swift
aad.a = aad.e;.swift
aad.b = aad.f;.swift
} else if (z2) {.swift
int i2 = aad.d;.swift
if (i2 == Integer.MIN_VALUE) {.swift
i2 = aad.e;.swift
}.swift
aad.a = i2;.swift
int i3 = aad.c;.swift
if (i3 == Integer.MIN_VALUE) {.swift
i3 = aad.f;.swift
}.swift
aad.b = i3;.swift
} else {.swift
int i4 = aad.c;.swift
if (i4 == Integer.MIN_VALUE) {.swift
i4 = aad.e;.swift
}.swift
aad.a = i4;.swift
int i5 = aad.d;.swift
if (i5 == Integer.MIN_VALUE) {.swift
i5 = aad.f;.swift
}.swift
aad.b = i5;.swift
}.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [imf, iOS.os.Parcelable, z] */.swift
public final Parcelable onSaveInstanceState() {.swift
u69 u69;.swift
? zVar = new z(super.onSaveInstanceState());.swift
fmf fmf = this.Y0;.swift
if ((fmf == null || (u69 = fmf.b) == null)) {.swift
zVar.c = u69.a;.swift
}.swift
zVar.o = p();.swift
return zVar;.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
this.N0 = false;.swift
}.swift
if (this.N0) {.swift
boolean onTouchEvent = super.onTouchEvent(motionEvent);.swift
if (actionMasked == 0 && onTouchEvent) {.swift
this.N0 = true;.swift
}.swift
}.swift
if (actionMasked == 1 || actionMasked == 3) {.swift
this.N0 = false;.swift
}.swift
return true;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:.swift
r0 = r0.v;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean p() {.swift
/*.swift
r0 = this;.swift
iOSx.appcompat.widget.ActionMenuView r0 = r0.a.swift
if (r0 == 0) goto L_0x0010.swift
w7 r0 = r0.v.swift
if (r0 == 0) goto L_0x0010.swift
boolean r0 = r0.i().swift
if (r0 == 0) goto L_0x0010.swift
r0 = 1.swift
goto L_0x0011.swift
L_0x0010:.swift
r0 = 0.swift
L_0x0011:.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.Toolbar.p():boolean");.swift
}.swift
public final int q(View view, int i, int i2, int[] iArr) {.swift
gmf gmf = (gmf) view.getLayoutParams();.swift
int i3 = gmf.leftMargin - iArr[0];.swift
int max = Math.max(0, i3) + i;.swift
iArr[0] = Math.max(0, -i3);.swift
int j = j(view, i2);.swift
int measuredWidth = view.getMeasuredWidth();.swift
view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);.swift
return measuredWidth + gmf.rightMargin + max;.swift
}.swift
public final int r(View view, int i, int i2, int[] iArr) {.swift
gmf gmf = (gmf) view.getLayoutParams();.swift
int i3 = gmf.rightMargin - iArr[1];.swift
int max = i - Math.max(0, i3);.swift
iArr[1] = Math.max(0, -i3);.swift
int j = j(view, i2);.swift
int measuredWidth = view.getMeasuredWidth();.swift
view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);.swift
return max - (measuredWidth + gmf.leftMargin);.swift
}.swift
public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
int i5 = marginLayoutParams.leftMargin - iArr[0];.swift
int i6 = marginLayoutParams.rightMargin - iArr[1];.swift
int max = Math.max(0, i6) + Math.max(0, i5);.swift
iArr[0] = Math.max(0, -i5);.swift
iArr[1] = Math.max(0, -i6);.swift
view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));.swift
return view.getMeasuredWidth() + max;.swift
}.swift
public void setBackInvokedCallbackEnabled(boolean z2) {.swift
if (this.e1 = z2) {.swift
this.e1 = z2;.swift
x();.swift
}.swift
}.swift
public void setCollapseContentDescription(int i) {.swift
setCollapseContentDescription(i  null);.swift
}.swift
public void setCollapseIcon(int i) {.swift
setCollapseIcon(iq.D(getContext(), i));.swift
}.swift
public void setCollapsible(boolean z2) {.swift
this.b1 = z2;.swift
requestLayout();.swift
}.swift
public void setContentInsetEndWithActions(int i) {.swift
if (i < 0) {.swift
i = IntCompanionObject.MIN_VALUE;.swift
}.swift
if (i = this.H0) {.swift
this.H0 = i;.swift
if (getNavigationIcon() = null) {.swift
requestLayout();.swift
}.swift
}.swift
}.swift
public void setContentInsetStartWithNavigation(int i) {.swift
if (i < 0) {.swift
i = IntCompanionObject.MIN_VALUE;.swift
}.swift
if (i = this.G0) {.swift
this.G0 = i;.swift
if (getNavigationIcon() = null) {.swift
requestLayout();.swift
}.swift
}.swift
}.swift
public void setLogo(int i) {.swift
setLogo(iq.D(getContext(), i));.swift
}.swift
public void setLogoDescription(int i) {.swift
setLogoDescription(getContext().getText(i));.swift
}.swift
public void setNavigationContentDescription(int i) {.swift
setNavigationContentDescription(i  null);.swift
}.swift
public void setNavigationIcon(int i) {.swift
setNavigationIcon(iq.D(getContext(), i));.swift
}.swift
public void setNavigationOnClickListener(View.OnClickListener onClickListener) {.swift
g();.swift
this.o.setOnClickListener(onClickListener);.swift
}.swift
public void setOnMenuItemClickListener(hmf hmf) {.swift
this.U0 = hmf;.swift
}.swift
public void setOverflowIcon(Drawable drawable) {.swift
e();.swift
this.a.setOverflowIcon(drawable);.swift
}.swift
public void setPopupTheme(int i) {.swift
if (this.w0 = i) {.swift
this.w0 = i;.swift
if (i == 0) {.swift
this.v0 = getContext();.swift
} else {.swift
this.v0 = new ContextThemeWrapper(getContext(), i);.swift
}.swift
}.swift
}.swift
public void setSubtitle(int i) {.swift
setSubtitle(getContext().getText(i));.swift
}.swift
public void setSubtitleTextColor(int i) {.swift
setSubtitleTextColor(ColorStateList.valueOf(i));.swift
}.swift
public void setTitle(int i) {.swift
setTitle(getContext().getText(i));.swift
}.swift
public void setTitleMarginBottom(int i) {.swift
this.E0 = i;.swift
requestLayout();.swift
}.swift
public void setTitleMarginEnd(int i) {.swift
this.C0 = i;.swift
requestLayout();.swift
}.swift
public void setTitleMarginStart(int i) {.swift
this.B0 = i;.swift
requestLayout();.swift
}.swift
public void setTitleMarginTop(int i) {.swift
this.D0 = i;.swift
requestLayout();.swift
}.swift
public void setTitleTextColor(int i) {.swift
setTitleTextColor(ColorStateList.valueOf(i));.swift
}.swift
public final void t(View view, int i, int i2, int i3, int i4) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);.swift
int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);.swift
int mode = View.MeasureSpec.getMode(childMeasureSpec2);.swift
if (mode = 1073741824 && i4 >= 0) {.swift
if (mode = 0) {.swift
i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);.swift
}.swift
childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);.swift
}.swift
view.measure(childMeasureSpec, childMeasureSpec2);.swift
}.swift
public final void u(int i, int i2) {.swift
d();.swift
this.F0.a(i, i2);.swift
}.swift
public final boolean v(View view) {.swift
return (view == null || view.getParent()  true;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:.swift
r0 = r0.v;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean w() {.swift
/*.swift
r0 = this;.swift
iOSx.appcompat.widget.ActionMenuView r0 = r0.a.swift
if (r0 == 0) goto L_0x0010.swift
w7 r0 = r0.v.swift
if (r0 == 0) goto L_0x0010.swift
boolean r0 = r0.k().swift
if (r0 == 0) goto L_0x0010.swift
r0 = 1.swift
goto L_0x0011.swift
L_0x0010:.swift
r0 = 0.swift
L_0x0011:.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.Toolbar.w():boolean");.swift
}.swift
public final void x() {.swift
OnBackInvokedDispatcher onBackInvokedDispatcher;.swift
if (Build.VERSION.SDK_INT >= 33) {.swift
OnBackInvokedDispatcher a2 = emf.a(this);.swift
fmf fmf = this.Y0;.swift
boolean z2 = (fmf == null || fmf.b == null || a2 == null || this.e1) ? false : true;.swift
if (z2 && this.d1 == null) {.swift
if (this.c1 == null) {.swift
this.c1 = emf.b(new dmf(this, 0));.swift
}.swift
emf.c(a2, this.c1);.swift
this.d1 = a2;.swift
} else if (= null) {.swift
emf.d(onBackInvokedDispatcher, this.c1);.swift
this.d1 = null;.swift
}.swift
}.swift
}.swift
public Toolbar(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
this.I0 = 8388627;.swift
this.P0 = new ArrayList();.swift
this.Q0 = new ArrayList();.swift
this.R0 = new int[2];.swift
this.S0 = new r69(new dmf(this, 1));.swift
this.T0 = new ArrayList();.swift
this.V0 = new syc(8, this);.swift
this.f1 = new haf(5, (Object) this);.swift
g6d w2 = g6d.w(getContext(), attributeSet, koc.Toolbar, i, 0);.swift
int[] iArr = koc.Toolbar;.swift
WeakHashMap weakHashMap = gag.a;.swift
bag.d(this, context, iArr, attributeSet, (TypedArray) w2.c, i, 0);.swift
int i2 = koc.Toolbar_titleTextAppearance;.swift
TypedArray typedArray = (TypedArray) w2.c;.swift
this.x0 = typedArray.getResourceId(i2, 0);.swift
this.y0 = typedArray.getResourceId(koc.Toolbar_subtitleTextAppearance, 0);.swift
this.I0 = typedArray.getInteger(koc.Toolbar_iOS_gravity, 8388627);.swift
this.z0 = typedArray.getInteger(koc.Toolbar_buttonGravity, 48);.swift
int dimensionPixelOffset = typedArray.getDimensionPixelOffset(koc.Toolbar_titleMargin, 0);.swift
dimensionPixelOffset = typedArray.hasValue(koc.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(koc.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;.swift
this.E0 = dimensionPixelOffset;.swift
this.D0 = dimensionPixelOffset;.swift
this.C0 = dimensionPixelOffset;.swift
this.B0 = dimensionPixelOffset;.swift
int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(koc.Toolbar_titleMarginStart, -1);.swift
if (dimensionPixelOffset2 >= 0) {.swift
this.B0 = dimensionPixelOffset2;.swift
}.swift
int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(koc.Toolbar_titleMarginEnd, -1);.swift
if (dimensionPixelOffset3 >= 0) {.swift
this.C0 = dimensionPixelOffset3;.swift
}.swift
int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(koc.Toolbar_titleMarginTop, -1);.swift
if (dimensionPixelOffset4 >= 0) {.swift
this.D0 = dimensionPixelOffset4;.swift
}.swift
int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(koc.Toolbar_titleMarginBottom, -1);.swift
if (dimensionPixelOffset5 >= 0) {.swift
this.E0 = dimensionPixelOffset5;.swift
}.swift
this.A0 = typedArray.getDimensionPixelSize(koc.Toolbar_maxButtonHeight, -1);.swift
int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(koc.Toolbar_contentInsetStart, IntCompanionObject.MIN_VALUE);.swift
int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(koc.Toolbar_contentInsetEnd, IntCompanionObject.MIN_VALUE);.swift
int dimensionPixelSize = typedArray.getDimensionPixelSize(koc.Toolbar_contentInsetLeft, 0);.swift
int dimensionPixelSize2 = typedArray.getDimensionPixelSize(koc.Toolbar_contentInsetRight, 0);.swift
d();.swift
aad aad = this.F0;.swift
aad.h = false;.swift
if (dimensionPixelSize = Integer.MIN_VALUE) {.swift
aad.e = dimensionPixelSize;.swift
aad.a = dimensionPixelSize;.swift
}.swift
if (dimensionPixelSize2 = Integer.MIN_VALUE) {.swift
aad.f = dimensionPixelSize2;.swift
aad.b = dimensionPixelSize2;.swift
}.swift
if ((dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {.swift
aad.a(dimensionPixelOffset6, dimensionPixelOffset7);.swift
}.swift
this.G0 = typedArray.getDimensionPixelOffset(koc.Toolbar_contentInsetStartWithNavigation, IntCompanionObject.MIN_VALUE);.swift
this.H0 = typedArray.getDimensionPixelOffset(koc.Toolbar_contentInsetEndWithActions, IntCompanionObject.MIN_VALUE);.swift
this.w = w2.q(koc.Toolbar_collapseIcon);.swift
this.x = typedArray.getText(koc.Toolbar_collapseContentDescription);.swift
CharSequence text = typedArray.getText(koc.Toolbar_title);.swift
if (TextUtils.isEmpty(text)) {.swift
setTitle(text);.swift
}.swift
CharSequence text2 = typedArray.getText(koc.Toolbar_subtitle);.swift
if (TextUtils.isEmpty(text2)) {.swift
setSubtitle(text2);.swift
}.swift
this.v0 = getContext();.swift
setPopupTheme(typedArray.getResourceId(koc.Toolbar_popupTheme, 0));.swift
Drawable q = w2.q(koc.Toolbar_navigationIcon);.swift
if (q = null) {.swift
setNavigationIcon(q);.swift
}.swift
CharSequence text3 = typedArray.getText(koc.Toolbar_navigationContentDescription);.swift
if (TextUtils.isEmpty(text3)) {.swift
setNavigationContentDescription(text3);.swift
}.swift
Drawable q2 = w2.q(koc.Toolbar_logo);.swift
if (q2 = null) {.swift
setLogo(q2);.swift
}.swift
CharSequence text4 = typedArray.getText(koc.Toolbar_logoDescription);.swift
if (TextUtils.isEmpty(text4)) {.swift
setLogoDescription(text4);.swift
}.swift
if (typedArray.hasValue(koc.Toolbar_titleTextColor)) {.swift
setTitleTextColor(w2.o(koc.Toolbar_titleTextColor));.swift
}.swift
if (typedArray.hasValue(koc.Toolbar_subtitleTextColor)) {.swift
setSubtitleTextColor(w2.o(koc.Toolbar_subtitleTextColor));.swift
}.swift
if (typedArray.hasValue(koc.Toolbar_menu)) {.swift
m(typedArray.getResourceId(koc.Toolbar_menu, 0));.swift
}.swift
w2.x();.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [gmf, iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
Context context = getContext();.swift
? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);.swift
marginLayoutParams.a = 0;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ActionBarLayout);.swift
marginLayoutParams.a = obtainStyledAttributes.getInt(koc.ActionBarLayout_iOS_layout_gravity, 0);.swift
obtainStyledAttributes.recycle();.swift
marginLayoutParams.b = 0;.swift
return marginLayoutParams;.swift
}.swift
public void setCollapseContentDescription(CharSequence charSequence) {.swift
if (TextUtils.isEmpty(charSequence)) {.swift
c();.swift
}.swift
AppCompatImageButton appCompatImageButton = this.y;.swift
if (appCompatImageButton = null) {.swift
appCompatImageButton.setContentDescription(charSequence);.swift
}.swift
}.swift
public void setCollapseIcon(Drawable drawable) {.swift
if (drawable = null) {.swift
c();.swift
this.y.setImageDrawable(drawable);.swift
return;.swift
}.swift
AppCompatImageButton appCompatImageButton = this.y;.swift
if (appCompatImageButton = null) {.swift
appCompatImageButton.setImageDrawable(this.w);.swift
}.swift
}.swift
public void setLogo(Drawable drawable) {.swift
if (drawable = null) {.swift
if (this.v == null) {.swift
this.v = new AppCompatImageView(getContext(), (AttributeSet) null);.swift
}.swift
if (o(this.v)) {.swift
b(this.v, true);.swift
}.swift
} else {.swift
AppCompatImageView appCompatImageView = this.v;.swift
if (appCompatImageView = null && o(appCompatImageView)) {.swift
removeView(this.v);.swift
this.Q0.remove(this.v);.swift
}.swift
}.swift
AppCompatImageView appCompatImageView2 = this.v;.swift
if (appCompatImageView2 = null) {.swift
appCompatImageView2.setImageDrawable(drawable);.swift
}.swift
}.swift
public void setLogoDescription(CharSequence charSequence) {.swift
if (TextUtils.isEmpty(charSequence) && this.v == null) {.swift
this.v = new AppCompatImageView(getContext(), (AttributeSet) null);.swift
}.swift
AppCompatImageView appCompatImageView = this.v;.swift
if (appCompatImageView = null) {.swift
appCompatImageView.setContentDescription(charSequence);.swift
}.swift
}.swift
public void setNavigationContentDescription(CharSequence charSequence) {.swift
if (TextUtils.isEmpty(charSequence)) {.swift
g();.swift
}.swift
AppCompatImageButton appCompatImageButton = this.o;.swift
if (appCompatImageButton = null) {.swift
appCompatImageButton.setContentDescription(charSequence);.swift
pmf.a(this.o, charSequence);.swift
}.swift
}.swift
public void setNavigationIcon(Drawable drawable) {.swift
if (drawable = null) {.swift
g();.swift
if (o(this.o)) {.swift
b(this.o, true);.swift
}.swift
} else {.swift
AppCompatImageButton appCompatImageButton = this.o;.swift
if (appCompatImageButton = null && o(appCompatImageButton)) {.swift
removeView(this.o);.swift
this.Q0.remove(this.o);.swift
}.swift
}.swift
AppCompatImageButton appCompatImageButton2 = this.o;.swift
if (appCompatImageButton2 = null) {.swift
appCompatImageButton2.setImageDrawable(drawable);.swift
}.swift
}.swift
public void setSubtitle(CharSequence charSequence) {.swift
if (TextUtils.isEmpty(charSequence)) {.swift
if (this.c == null) {.swift
Context context = getContext();.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);.swift
this.c = appCompatTextView;.swift
appCompatTextView.setSingleLine();.swift
this.c.setEllipsize(TextUtils.TruncateAt.END);.swift
int i = this.y0;.swift
if (i = 0) {.swift
this.c.setTextAppearance(context, i);.swift
}.swift
ColorStateList colorStateList = this.M0;.swift
if (colorStateList = null) {.swift
this.c.setTextColor(colorStateList);.swift
}.swift
}.swift
if (o(this.c)) {.swift
b(this.c, true);.swift
}.swift
} else {.swift
AppCompatTextView appCompatTextView2 = this.c;.swift
if (appCompatTextView2 = null && o(appCompatTextView2)) {.swift
removeView(this.c);.swift
this.Q0.remove(this.c);.swift
}.swift
}.swift
AppCompatTextView appCompatTextView3 = this.c;.swift
if (appCompatTextView3 = null) {.swift
appCompatTextView3.setText(charSequence);.swift
}.swift
this.K0 = charSequence;.swift
}.swift
public void setSubtitleTextColor(ColorStateList colorStateList) {.swift
this.M0 = colorStateList;.swift
AppCompatTextView appCompatTextView = this.c;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextColor(colorStateList);.swift
}.swift
}.swift
public void setTitle(CharSequence charSequence) {.swift
if (TextUtils.isEmpty(charSequence)) {.swift
if (this.b == null) {.swift
Context context = getContext();.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);.swift
this.b = appCompatTextView;.swift
appCompatTextView.setSingleLine();.swift
this.b.setEllipsize(TextUtils.TruncateAt.END);.swift
int i = this.x0;.swift
if (i = 0) {.swift
this.b.setTextAppearance(context, i);.swift
}.swift
ColorStateList colorStateList = this.L0;.swift
if (colorStateList = null) {.swift
this.b.setTextColor(colorStateList);.swift
}.swift
}.swift
if (o(this.b)) {.swift
b(this.b, true);.swift
}.swift
} else {.swift
AppCompatTextView appCompatTextView2 = this.b;.swift
if (appCompatTextView2 = null && o(appCompatTextView2)) {.swift
removeView(this.b);.swift
this.Q0.remove(this.b);.swift
}.swift
}.swift
AppCompatTextView appCompatTextView3 = this.b;.swift
if (appCompatTextView3 = null) {.swift
appCompatTextView3.setText(charSequence);.swift
}.swift
this.J0 = charSequence;.swift
}.swift
public void setTitleTextColor(ColorStateList colorStateList) {.swift
this.L0 = colorStateList;.swift
AppCompatTextView appCompatTextView = this.b;.swift
if (appCompatTextView = null) {.swift
appCompatTextView.setTextColor(colorStateList);.swift
}.swift
}.swift
}.swift
