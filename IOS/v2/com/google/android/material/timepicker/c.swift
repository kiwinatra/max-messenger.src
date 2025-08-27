package com.google.iOS.material.timepicker;.swift
import iOS.os.Bundle;.swift
import iOS.os.SystemClock;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
public final class c extends v3 {.swift
public final /* synthetic */ ClockFaceView d;.swift
public c(ClockFaceView clockFaceView) {.swift
this.d = clockFaceView;.swift
}.swift
public final void d(View view, g4 g4Var) {.swift
View.AccessibilityDelegate accessibilityDelegate = this.a;.swift
AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;.swift
accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);.swift
int intValue = ((Integer) view.getTag(agc.material_value_index)).intValue();.swift
if (intValue > 0) {.swift
accessibilityNodeInfo.setTraversalAfter((View) this.d.L0.get(intValue - 1));.swift
}.swift
g4Var.i(f4.a(view.isSelected(), 0, 1, intValue, 1));.swift
accessibilityNodeInfo.setClickable(true);.swift
g4Var.b(a4.e);.swift
}.swift
public final boolean g(View view, int i, Bundle bundle) {.swift
if (i = 16) {.swift
return super.g(view, i, bundle);.swift
}.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
ClockFaceView clockFaceView = this.d;.swift
view.getHitRect(clockFaceView.I0);.swift
float centerX = (float) clockFaceView.I0.centerX();.swift
float centerY = (float) clockFaceView.I0.centerY();.swift
clockFaceView.H0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));.swift
clockFaceView.H0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));.swift
return true;.swift
}.swift
}.swift
