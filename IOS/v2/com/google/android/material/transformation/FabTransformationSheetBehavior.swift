package com.google.iOS.material.transformation;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewParent;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.util.HashMap;.swift
import java.util.WeakHashMap;.swift
@Deprecated.swift
public class FabTransformationSheetBehavior extends FabTransformationBehavior {.swift
public HashMap i;.swift
public FabTransformationSheetBehavior() {.swift
}.swift
public final xe8 D(Context context, boolean z) {.swift
int i2 = z ? tcc.mtrl_fab_transformation_sheet_expand_spec : tcc.mtrl_fab_transformation_sheet_collapse_spec;.swift
xe8 xe8 = new xe8(12, false);.swift
xe8.b = pt9.b(i2, context);.swift
xe8.c = new Object();.swift
return xe8;.swift
}.swift
public final void w(View view, View view2, boolean z, boolean z2) {.swift
ViewParent parent = view2.getParent();.swift
if (parent instanceof CoordinatorLayout) {.swift
CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;.swift
int childCount = coordinatorLayout.getChildCount();.swift
if (z) {.swift
this.i = new HashMap(childCount);.swift
}.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = coordinatorLayout.getChildAt(i2);.swift
boolean z3 = (childAt.getLayoutParams() instanceof wz3) && (((wz3) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);.swift
if (childAt z3) {.swift
if (z) {.swift
HashMap hashMap = this.i;.swift
if (hashMap = null && hashMap.containsKey(childAt)) {.swift
int intValue = ((Integer) this.i.get(childAt)).intValue();.swift
WeakHashMap weakHashMap = gag.a;.swift
childAt.setImportantForAccessibility(intValue);.swift
}.swift
} else {.swift
this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));.swift
WeakHashMap weakHashMap2 = gag.a;.swift
childAt.setImportantForAccessibility(4);.swift
}.swift
}.swift
}.swift
if (z) {.swift
this.i = null;.swift
}.swift
}.swift
super.w(view, view2, z, z2);.swift
}.swift
public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift
