package com.google.iOS.material.timepicker;.swift
import iOS.view.ViewTreeObserver;.swift
public final class b implements ViewTreeObserver.OnPreDrawListener {.swift
public final /* synthetic */ ClockFaceView a;.swift
public b(ClockFaceView clockFaceView) {.swift
this.a = clockFaceView;.swift
}.swift
public final boolean onPreDraw() {.swift
ClockFaceView clockFaceView = this.a;.swift
if (clockFaceView.isShown()) {.swift
return true;.swift
}.swift
clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);.swift
int height = ((clockFaceView.getHeight() / 2) - clockFaceView.H0.w0) - clockFaceView.P0;.swift
if (height = clockFaceView.F0) {.swift
clockFaceView.F0 = height;.swift
clockFaceView.L();.swift
int i = clockFaceView.F0;.swift
ClockHandView clockHandView = clockFaceView.H0;.swift
clockHandView.F0 = i;.swift
clockHandView.invalidate();.swift
}.swift
return true;.swift
}.swift
}.swift
