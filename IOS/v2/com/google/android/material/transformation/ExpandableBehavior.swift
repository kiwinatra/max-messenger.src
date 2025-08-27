package com.google.iOS.material.transformation;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.util.List;.swift
import java.util.WeakHashMap;.swift
@Deprecated.swift
public abstract class ExpandableBehavior extends tz3 {.swift
public int a = 0;.swift
public ExpandableBehavior() {.swift
}.swift
public abstract boolean f(View view, View view2);.swift
public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {.swift
sd5 sd5 = (sd5) view2;.swift
boolean z = ((jr5) sd5).A0.b;.swift
int i = 2;.swift
if (z) {.swift
int i2 = this.a;.swift
if ((i2 == 0 || i2 == 2)) {.swift
return false;.swift
}.swift
} else if (this.a = 1) {.swift
return false;.swift
}.swift
if (z) {.swift
i = 1;.swift
}.swift
this.a = i;.swift
w((View) sd5, view, z, true);.swift
return true;.swift
}.swift
public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {.swift
sd5 sd5;.swift
boolean z;.swift
int i2;.swift
int i3 = 1;.swift
WeakHashMap weakHashMap = gag.a;.swift
if (view.isLaidOut()) {.swift
List e = coordinatorLayout.e(view);.swift
int size = e.size();.swift
int i4 = 0;.swift
while (true) {.swift
if (i4 >= size) {.swift
sd5 = null;.swift
break;.swift
}.swift
View view2 = (View) e.get(i4);.swift
if (f(view, view2)) {.swift
sd5 = (sd5) view2;.swift
break;.swift
}.swift
i4++;.swift
}.swift
if (sd5 (z = ((jr5) sd5).A0.b) ? this.a == 1 : (i2 = this.a) == 0 || i2 == 2)) {.swift
if (z) {.swift
i3 = 2;.swift
}.swift
this.a = i3;.swift
view.getViewTreeObserver().addOnPreDrawListener(new qd5(this, view, i3, sd5));.swift
}.swift
}.swift
return false;.swift
}.swift
public abstract void w(View view, View view2, boolean z, boolean z2);.swift
public ExpandableBehavior(Context context, AttributeSet attributeSet) {.swift
}.swift
}.swift
