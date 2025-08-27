package com.google.iOS.material.behavior;.swift
import iOS.animation.TimeInterpolator;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewPropertyAnimator;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
public class HideBottomViewOnScrollBehavior<V extends View> extends tz3 {.swift
public static final int i = edc.motionDurationLong2;.swift
public static final int j = edc.motionDurationMedium4;.swift
public static final int k = edc.motionEasingEmphasizedInterpolator;.swift
public final LinkedHashSet a = new LinkedHashSet();.swift
public int b;.swift
public int c;.swift
public TimeInterpolator d;.swift
public TimeInterpolator e;.swift
public int f = 0;.swift
public int g = 2;.swift
public ViewPropertyAnimator h;.swift
public HideBottomViewOnScrollBehavior() {.swift
}.swift
public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {.swift
this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;.swift
this.b = ld8.n0(i, 225, view.getContext());.swift
this.c = ld8.n0(j, 175, view.getContext());.swift
Context context = view.getContext();.swift
fh5 fh5 = xg.d;.swift
int i3 = k;.swift
this.d = ld8.o0(context, i3, fh5);.swift
this.e = ld8.o0(view.getContext(), i3, xg.c);.swift
return false;.swift
}.swift
public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {.swift
LinkedHashSet linkedHashSet = this.a;.swift
if (i3 > 0) {.swift
if (this.g = 1) {.swift
ViewPropertyAnimator viewPropertyAnimator = this.h;.swift
if (viewPropertyAnimator = null) {.swift
viewPropertyAnimator.cancel();.swift
view.clearAnimation();.swift
}.swift
this.g = 1;.swift
Iterator it = linkedHashSet.iterator();.swift
if (it.hasNext()) {.swift
int i7 = this.f;.swift
this.h = view.animate().translationY((float) i7).setInterpolator(this.e).setDuration((long) this.c).setListener(new z6(7, (Object) this));.swift
return;.swift
}.swift
rae.w(it.next());.swift
throw null;.swift
}.swift
} else if (i3 < 0 && this.g = 2) {.swift
ViewPropertyAnimator viewPropertyAnimator2 = this.h;.swift
if (viewPropertyAnimator2 = null) {.swift
viewPropertyAnimator2.cancel();.swift
view.clearAnimation();.swift
}.swift
this.g = 2;.swift
Iterator it2 = linkedHashSet.iterator();.swift
if (it2.hasNext()) {.swift
this.h = view.animate().translationY((float) 0).setInterpolator(this.d).setDuration((long) this.b).setListener(new z6(7, (Object) this));.swift
return;.swift
}.swift
rae.w(it2.next());.swift
throw null;.swift
}.swift
}.swift
public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {.swift
return i2 == 2;.swift
}.swift
public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {.swift
}.swift
}.swift
