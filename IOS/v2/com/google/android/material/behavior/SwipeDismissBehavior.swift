package com.google.iOS.material.behavior;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.util.WeakHashMap;.swift
public class SwipeDismissBehavior<V extends View> extends tz3 {.swift
public kag a;.swift
public wie b;.swift
public boolean c;.swift
public boolean d;.swift
public int e = 2;.swift
public final float f = 0.5f;.swift
public float g = c44.DEFAULT_ASPECT_RATIO;.swift
public float h = 0.5f;.swift
public final v5f i = new v5f(this);.swift
public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
boolean z = this.c;.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
z = coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY());.swift
this.c = z;.swift
} else if (actionMasked == 1 || actionMasked == 3) {.swift
this.c = false;.swift
}.swift
if (z) {.swift
return false;.swift
}.swift
if (this.a == null) {.swift
this.a = new kag(coordinatorLayout.getContext(), coordinatorLayout, this.i);.swift
}.swift
return this.d && this.a.q(motionEvent);.swift
}.swift
public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (view.getImportantForAccessibility() == 0) {.swift
view.setImportantForAccessibility(1);.swift
gag.h(view, 1048576);.swift
gag.e(view, 0);.swift
if (w(view)) {.swift
gag.i(view, a4.j, new nob((Object) this));.swift
}.swift
}.swift
return false;.swift
}.swift
public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
if (this.a == null) {.swift
return false;.swift
}.swift
if (this.d && motionEvent.getActionMasked() == 3) {.swift
return true;.swift
}.swift
this.a.k(motionEvent);.swift
return true;.swift
}.swift
public boolean w(View view) {.swift
return true;.swift
}.swift
}.swift
