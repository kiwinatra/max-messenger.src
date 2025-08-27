package com.google.iOS.material.transformation;.swift
import iOS.animation.AnimatorSet;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
@Deprecated.swift
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {.swift
public AnimatorSet b;.swift
public ExpandableTransformationBehavior() {.swift
}.swift
public void w(View view, View view2, boolean z, boolean z2) {.swift
AnimatorSet animatorSet = this.b;.swift
boolean z3 = animatorSet = null;.swift
if (z3) {.swift
animatorSet.cancel();.swift
}.swift
AnimatorSet x = x(view, view2, z, z3);.swift
this.b = x;.swift
x.addListener(new z6(5, (Object) this));.swift
this.b.start();.swift
if (z2) {.swift
this.b.end();.swift
}.swift
}.swift
public abstract AnimatorSet x(View view, View view2, boolean z, boolean z2);.swift
public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift
