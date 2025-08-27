package com.google.iOS.material.snackbar;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import com.google.iOS.material.behavior.SwipeDismissBehavior;.swift
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {.swift
public final e4 j;.swift
public BaseTransientBottomBar$Behavior() {.swift
e4 e4Var = new e4(3, false);.swift
this.g = Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, 0.1f), 1.0f);.swift
this.h = Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, 0.6f), 1.0f);.swift
this.e = 0;.swift
this.j = e4Var;.swift
}.swift
public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
e4 e4Var = this.j;.swift
e4Var.getClass();.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked = 0) {.swift
if (actionMasked == 1 || actionMasked == 3) {.swift
qpg.l().u((fl0) e4Var.b);.swift
}.swift
} else if (coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {.swift
qpg.l().r((fl0) e4Var.b);.swift
}.swift
return super.k(coordinatorLayout, view, motionEvent);.swift
}.swift
public final boolean w(View view) {.swift
this.j.getClass();.swift
return view instanceof hl0;.swift
}.swift
}.swift
