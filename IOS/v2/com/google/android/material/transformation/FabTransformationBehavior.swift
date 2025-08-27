package com.google.iOS.material.transformation;.swift
import iOS.animation.Animator;.swift
import iOS.animation.AnimatorSet;.swift
import iOS.animation.ObjectAnimator;.swift
import iOS.content.Context;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.Pair;.swift
import iOS.util.Property;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.util.ArrayList;.swift
import java.util.WeakHashMap;.swift
@Deprecated.swift
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {.swift
public final Rect c = new Rect();.swift
public final RectF d = new RectF();.swift
public final RectF e = new RectF();.swift
public final int[] f = new int[2];.swift
public float g;.swift
public float h;.swift
public FabTransformationBehavior() {.swift
}.swift
public static float B(xe8 xe8, qt9 qt9, float f2) {.swift
long j = qt9.a;.swift
qt9 d2 = ((pt9) xe8.b).d("expansion");.swift
return xg.a(f2, c44.DEFAULT_ASPECT_RATIO, qt9.b().getInterpolation(((float) (((d2.a + d2.b) + 17) - j)) / ((float) qt9.b)));.swift
}.swift
public static Pair y(float f2, float f3, boolean z, xe8 xe8) {.swift
qt9 qt9;.swift
qt9 qt92;.swift
int i;.swift
if (f2 == c44.DEFAULT_ASPECT_RATIO || f3 == c44.DEFAULT_ASPECT_RATIO) {.swift
qt92 = ((pt9) xe8.b).d("translationXLinear");.swift
qt9 = ((pt9) xe8.b).d("translationYLinear");.swift
} else if ((z || f3 >= c44.DEFAULT_ASPECT_RATIO) && (z || i <= 0)) {.swift
qt92 = ((pt9) xe8.b).d("translationXCurveDownwards");.swift
qt9 = ((pt9) xe8.b).d("translationYCurveDownwards");.swift
} else {.swift
qt92 = ((pt9) xe8.b).d("translationXCurveUpwards");.swift
qt9 = ((pt9) xe8.b).d("translationYCurveUpwards");.swift
}.swift
return new Pair(qt92, qt9);.swift
}.swift
public final float A(View view, View view2, cd4 cd4) {.swift
RectF rectF = this.d;.swift
RectF rectF2 = this.e;.swift
C(view, rectF);.swift
rectF.offset(this.g, this.h);.swift
C(view2, rectF2);.swift
cd4.getClass();.swift
return (rectF2.centerY() - rectF.centerY()) + c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public final void C(View view, RectF rectF) {.swift
rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) view.getWidth(), (float) view.getHeight());.swift
int[] iArr = this.f;.swift
view.getLocationInWindow(iArr);.swift
rectF.offsetTo((float) iArr[0], (float) iArr[1]);.swift
rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));.swift
}.swift
public abstract xe8 D(Context context, boolean z);.swift
public final boolean f(View view, View view2) {.swift
if (view.getVisibility() == 8) {.swift
throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");.swift
} else if ((view2 instanceof jr5)) {.swift
return false;.swift
} else {.swift
int expandedComponentIdHint = ((jr5) view2).getExpandedComponentIdHint();.swift
return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();.swift
}.swift
}.swift
public final void g(wz3 wz3) {.swift
if (wz3.h == 0) {.swift
wz3.h = 80;.swift
}.swift
}.swift
public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {.swift
ObjectAnimator objectAnimator;.swift
ArrayList arrayList;.swift
ObjectAnimator objectAnimator2;.swift
ObjectAnimator objectAnimator3;.swift
ObjectAnimator objectAnimator4;.swift
View view3 = view;.swift
View view4 = view2;.swift
boolean z3 = z;.swift
xe8 D = D(view2.getContext(), z3);.swift
if (z3) {.swift
this.g = view.getTranslationX();.swift
this.h = view.getTranslationY();.swift
}.swift
ArrayList arrayList2 = new ArrayList();.swift
ArrayList arrayList3 = new ArrayList();.swift
WeakHashMap weakHashMap = gag.a;.swift
float i = v9g.i(view2) - v9g.i(view);.swift
if (z3) {.swift
if (z2) {.swift
view4.setTranslationZ(-i);.swift
}.swift
objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, new float[]{0.0f});.swift
} else {.swift
objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, new float[]{-i});.swift
}.swift
((pt9) D.b).d("elevation").a(objectAnimator);.swift
arrayList2.add(objectAnimator);.swift
RectF rectF = this.d;.swift
float z4 = z(view3, view4, (cd4) D.c);.swift
float A = A(view3, view4, (cd4) D.c);.swift
Pair y = y(z4, A, z3, D);.swift
qt9 qt9 = (qt9) y.first;.swift
qt9 qt92 = (qt9) y.second;.swift
if (z3) {.swift
if (z2) {.swift
view4.setTranslationX(-z4);.swift
view4.setTranslationY(-A);.swift
}.swift
arrayList = arrayList3;.swift
ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});.swift
ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});.swift
float B = B(D, qt9, -z4);.swift
float B2 = B(D, qt92, -A);.swift
Rect rect = this.c;.swift
view4.getWindowVisibleDisplayFrame(rect);.swift
rectF.set(rect);.swift
RectF rectF2 = this.e;.swift
C(view4, rectF2);.swift
rectF2.offset(B, B2);.swift
rectF2.intersect(rectF);.swift
rectF.set(rectF2);.swift
objectAnimator2 = ofFloat2;.swift
objectAnimator3 = ofFloat;.swift
} else {.swift
arrayList = arrayList3;.swift
objectAnimator3 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-z4});.swift
objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-A});.swift
}.swift
qt9.a(objectAnimator3);.swift
qt92.a(objectAnimator2);.swift
arrayList2.add(objectAnimator3);.swift
arrayList2.add(objectAnimator2);.swift
rectF.width();.swift
rectF.height();.swift
float z5 = z(view3, view4, (cd4) D.c);.swift
float A2 = A(view3, view4, (cd4) D.c);.swift
Pair y2 = y(z5, A2, z3, D);.swift
qt9 qt93 = (qt9) y2.first;.swift
qt9 qt94 = (qt9) y2.second;.swift
Property property = View.TRANSLATION_X;.swift
if (z3) {.swift
z5 = this.g;.swift
}.swift
ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, property, new float[]{z5});.swift
Property property2 = View.TRANSLATION_Y;.swift
if (z3) {.swift
A2 = this.h;.swift
}.swift
ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, property2, new float[]{A2});.swift
qt93.a(ofFloat3);.swift
qt94.a(ofFloat4);.swift
arrayList2.add(ofFloat3);.swift
arrayList2.add(ofFloat4);.swift
if (view4 instanceof ViewGroup) {.swift
View findViewById = view4.findViewById(agc.mtrl_child_content_container);.swift
ViewGroup viewGroup = findViewById  null : (ViewGroup) view4;.swift
if (viewGroup = null) {.swift
if (z3) {.swift
if (z2) {.swift
nz2.a.set(viewGroup, Float.valueOf(c44.DEFAULT_ASPECT_RATIO));.swift
}.swift
objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, nz2.a, new float[]{1.0f});.swift
} else {.swift
objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, nz2.a, new float[]{0.0f});.swift
}.swift
((pt9) D.b).d("contentFade").a(objectAnimator4);.swift
arrayList2.add(objectAnimator4);.swift
}.swift
}.swift
AnimatorSet animatorSet = new AnimatorSet();.swift
cjf.M(animatorSet, arrayList2);.swift
animatorSet.addListener(new dg5(z3, view4, view3));.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i2));.swift
}.swift
return animatorSet;.swift
}.swift
public final float z(View view, View view2, cd4 cd4) {.swift
RectF rectF = this.d;.swift
RectF rectF2 = this.e;.swift
C(view, rectF);.swift
rectF.offset(this.g, this.h);.swift
C(view2, rectF2);.swift
cd4.getClass();.swift
return (rectF2.centerX() - rectF.centerX()) + c44.DEFAULT_ASPECT_RATIO;.swift
}.swift
public FabTransformationBehavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift
