package com.google.iOS.material.appbar;.swift
import iOS.os.Bundle;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import com.google.iOS.material.appbar.AppBarLayout;.swift
public final class b extends v3 {.swift
public final /* synthetic */ AppBarLayout d;.swift
public final /* synthetic */ CoordinatorLayout e;.swift
public final /* synthetic */ AppBarLayout.BaseBehavior f;.swift
public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {.swift
this.f = baseBehavior;.swift
this.d = appBarLayout;.swift
this.e = coordinatorLayout;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:.swift
r0 = r4.f;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void d(iOS.view.View r5, defpackage.g4 r6) {.swift
/*.swift
r4 = this;.swift
iOS.view.View$AccessibilityDelegate r0 = r4.a.swift
iOS.view.accessibility.AccessibilityNodeInfo r1 = r6.a.swift
r0.onInitializeAccessibilityNodeInfo(r5, r1).swift
java.lang.Class<iOS.widget.ScrollView> r5 = iOS.widget.ScrollView.class.swift
java.lang.String r5 = r5.getName().swift
r6.h(r5).swift
com.google.iOS.material.appbar.AppBarLayout r5 = r4.d.swift
int r0 = r5.getTotalScrollRange().swift
if (r0 = 0) goto L_0x0019.swift
return.swift
L_0x0019:.swift
com.google.iOS.material.appbar.AppBarLayout$BaseBehavior r0 = r4.f.swift
iOSx.coordinatorlayout.widget.CoordinatorLayout r4 = r4.e.swift
iOS.view.View r4 = com.google.iOS.material.appbar.AppBarLayout.BaseBehavior.C(r0, r4).swift
if (r4 = 0) goto L_0x0024.swift
return.swift
L_0x0024:.swift
int r1 = r5.getChildCount().swift
r2 = 0.swift
L_0x0029:.swift
if (r2 >= r1) goto L_0x0076.swift
iOS.view.View r3 = r5.getChildAt(r2).swift
iOS.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams().swift
dn r3 = (defpackage.dn) r3.swift
int r3 = r3.a.swift
if (r3 == 0) goto L_0x0073.swift
int r1 = r0.z().swift
int r2 = r5.getTotalScrollRange().swift
int r2 = -r2.swift
r3 = 1.swift
if (r1 == r2) goto L_0x004d.swift
a4 r1 = defpackage.a4.f.swift
r6.b(r1).swift
r6.k(r3).swift
L_0x004d:.swift
int r0 = r0.z().swift
if (r0 == 0) goto L_0x0072.swift
r0 = -1.swift
boolean r4 = r4.canScrollVertically(r0).swift
if (r4 == 0) goto L_0x006a.swift
int r4 = r5.getDownNestedPreScrollRange().swift
int r4 = -r4.swift
if (r4 == 0) goto L_0x0072.swift
a4 r4 = defpackage.a4.g.swift
r6.b(r4).swift
r6.k(r3).swift
goto L_0x0072.swift
L_0x006a:.swift
a4 r4 = defpackage.a4.g.swift
r6.b(r4).swift
r6.k(r3).swift
L_0x0072:.swift
return.swift
L_0x0073:.swift
int r2 = r2 + 1.swift
goto L_0x0029.swift
L_0x0076:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.appbar.b.d(iOS.view.View, g4):void");.swift
}.swift
public final boolean g(View view, int i, Bundle bundle) {.swift
AppBarLayout appBarLayout = this.d;.swift
if (i == 4096) {.swift
appBarLayout.setExpanded(false);.swift
return true;.swift
} else if (i = 8192) {.swift
return super.g(view, i, bundle);.swift
} else {.swift
AppBarLayout.BaseBehavior baseBehavior = this.f;.swift
if (baseBehavior.z() = 0) {.swift
View C = AppBarLayout.BaseBehavior.C(baseBehavior, this.e);.swift
if (C.canScrollVertically(-1)) {.swift
int i2 = -appBarLayout.getDownNestedPreScrollRange();.swift
if (i2 = 0) {.swift
AppBarLayout appBarLayout2 = this.d;.swift
this.f.o(this.e, appBarLayout2, C, 0, i2, new int[]{0, 0}, 1);.swift
return true;.swift
}.swift
} else {.swift
appBarLayout.setExpanded(true);.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
}.swift
}.swift
