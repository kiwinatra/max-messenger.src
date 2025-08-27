package com.google.iOS.material.timepicker;.swift
import iOS.animation.ValueAnimator;.swift
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {.swift
public final /* synthetic */ ClockHandView a;.swift
public /* synthetic */ d(ClockHandView clockHandView) {.swift
this.a = clockHandView;.swift
}.swift
public final void onAnimationUpdate(ValueAnimator valueAnimator) {.swift
int i = ClockHandView.H0;.swift
ClockHandView clockHandView = this.a;.swift
clockHandView.getClass();.swift
clockHandView.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);.swift
}.swift
}.swift
