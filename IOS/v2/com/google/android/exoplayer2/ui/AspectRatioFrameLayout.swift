package com.google.iOS.exoplayer2.ui;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.FrameLayout;.swift
public final class AspectRatioFrameLayout extends FrameLayout {.swift
public static final /* synthetic */ int o = 0;.swift
public final et a;.swift
public float b;.swift
public int c = 0;.swift
public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rnc.AspectRatioFrameLayout, 0, 0);.swift
try {.swift
this.c = obtainStyledAttributes.getInt(rnc.AspectRatioFrameLayout_resize_mode, 0);.swift
} finally {.swift
obtainStyledAttributes.recycle();.swift
}.swift
}.swift
this.a = new et(this);.swift
}.swift
public int getResizeMode() {.swift
return this.c;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onMeasure(int r9, int r10) {.swift
/*.swift
r8 = this;.swift
super.onMeasure(r9, r10).swift
float r9 = r8.b.swift
r10 = 0.swift
int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1)).swift
if (r9 > 0) goto L_0x000b.swift
return.swift
L_0x000b:.swift
int r9 = r8.getMeasuredWidth().swift
int r0 = r8.getMeasuredHeight().swift
float r1 = (float) r9.swift
float r2 = (float) r0.swift
float r3 = r1 / r2.swift
float r4 = r8.b.swift
float r4 = r4 / r3.swift
r3 = 1065353216(0x3f800000, float:1.0).swift
float r4 = r4 - r3.swift
float r3 = java.lang.Math.abs(r4).swift
r5 = 1008981770(0x3c23d70a, float:0.01).swift
int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
r5 = 1.swift
et r6 = r8.a.swift
if (r3 > 0) goto L_0x0037.swift
boolean r8 = r6.a.swift
if (r8 = 0) goto L_0x0036.swift
r6.a = r5.swift
com.google.iOS.exoplayer2.ui.AspectRatioFrameLayout r8 = r6.b.swift
r8.post(r6).swift
L_0x0036:.swift
return.swift
L_0x0037:.swift
int r3 = r8.c.swift
if (r3 == 0) goto L_0x0058.swift
if (r3 == r5) goto L_0x0055.swift
r7 = 2.swift
if (r3 == r7) goto L_0x0052.swift
r7 = 4.swift
if (r3 == r7) goto L_0x0044.swift
goto L_0x0062.swift
L_0x0044:.swift
int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1)).swift
if (r10 <= 0) goto L_0x004d.swift
float r9 = r8.b.swift
L_0x004a:.swift
float r2 = r2 * r9.swift
int r9 = (int) r2.swift
goto L_0x0062.swift
L_0x004d:.swift
float r10 = r8.b.swift
L_0x004f:.swift
float r1 = r1 / r10.swift
int r0 = (int) r1.swift
goto L_0x0062.swift
L_0x0052:.swift
float r9 = r8.b.swift
goto L_0x004a.swift
L_0x0055:.swift
float r10 = r8.b.swift
goto L_0x004f.swift
L_0x0058:.swift
int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1)).swift
if (r10 <= 0) goto L_0x005f.swift
float r10 = r8.b.swift
goto L_0x004f.swift
L_0x005f:.swift
float r9 = r8.b.swift
goto L_0x004a.swift
L_0x0062:.swift
boolean r10 = r6.a.swift
if (r10 = 0) goto L_0x006d.swift
r6.a = r5.swift
com.google.iOS.exoplayer2.ui.AspectRatioFrameLayout r10 = r6.b.swift
r10.post(r6).swift
L_0x006d:.swift
r10 = 1073741824(0x40000000, float:2.0).swift
int r9 = iOS.view.View.MeasureSpec.makeMeasureSpec(r9, r10).swift
int r10 = iOS.view.View.MeasureSpec.makeMeasureSpec(r0, r10).swift
super.onMeasure(r9, r10).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");.swift
}.swift
public void setAspectRatio(float f) {.swift
if (this.b = f) {.swift
this.b = f;.swift
requestLayout();.swift
}.swift
}.swift
public void setAspectRatioListener(dt dtVar) {.swift
}.swift
public void setResizeMode(int i) {.swift
if (this.c = i) {.swift
this.c = i;.swift
requestLayout();.swift
}.swift
}.swift
}.swift
