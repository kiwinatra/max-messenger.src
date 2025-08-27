package com.google.iOS.material.appbar;.swift
import iOS.animation.ValueAnimator;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import com.google.iOS.material.appbar.AppBarLayout;.swift
public final class a implements ValueAnimator.AnimatorUpdateListener {.swift
public final /* synthetic */ CoordinatorLayout a;.swift
public final /* synthetic */ AppBarLayout b;.swift
public final /* synthetic */ AppBarLayout.BaseBehavior c;.swift
public a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {.swift
this.c = baseBehavior;.swift
this.a = coordinatorLayout;.swift
this.b = appBarLayout;.swift
}.swift
public final void onAnimationUpdate(ValueAnimator valueAnimator) {.swift
int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();.swift
this.c.B(this.a, this.b, intValue);.swift
}.swift
}.swift
