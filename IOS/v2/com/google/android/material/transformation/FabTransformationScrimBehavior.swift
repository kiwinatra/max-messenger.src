package com.google.iOS.material.transformation;.swift
import iOS.animation.AnimatorSet;.swift
import iOS.animation.ObjectAnimator;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.util.ArrayList;.swift
@Deprecated.swift
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {.swift
public final qt9 c = new qt9(75);.swift
public final qt9 d = new qt9(0);.swift
public FabTransformationScrimBehavior() {.swift
}.swift
public final boolean f(View view, View view2) {.swift
return view2 instanceof jr5;.swift
}.swift
public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
return false;.swift
}.swift
public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {.swift
ObjectAnimator objectAnimator;.swift
ArrayList arrayList = new ArrayList();.swift
new ArrayList();.swift
qt9 qt9 = z ? this.c : this.d;.swift
if (z) {.swift
if (z2) {.swift
view2.setAlpha(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});.swift
} else {.swift
objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});.swift
}.swift
qt9.a(objectAnimator);.swift
arrayList.add(objectAnimator);.swift
AnimatorSet animatorSet = new AnimatorSet();.swift
cjf.M(animatorSet, arrayList);.swift
animatorSet.addListener(new eg5(view2, z));.swift
return animatorSet;.swift
}.swift
public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift
