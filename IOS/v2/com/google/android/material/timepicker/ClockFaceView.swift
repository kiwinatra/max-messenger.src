package com.google.iOS.material.timepicker;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.RadialGradient;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.graphics.Shader;.swift
import iOS.util.DisplayMetrics;.swift
import iOS.util.SparseArray;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.TextView;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.List;.swift
import java.util.Map;.swift
class ClockFaceView extends apc implements o33 {.swift
public final ClockHandView H0;.swift
public final Rect I0 = new Rect();.swift
public final RectF J0 = new RectF();.swift
public final Rect K0 = new Rect();.swift
public final SparseArray L0 = new SparseArray();.swift
public final c M0;.swift
public final int[] N0;.swift
public final float[] O0 = {c44.DEFAULT_ASPECT_RATIO, 0.9f, 1.0f};.swift
public final int P0;.swift
public final int Q0;.swift
public final int R0;.swift
public final int S0;.swift
public String[] T0;.swift
public float U0;.swift
public final ColorStateList V0;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ClockFaceView(iOS.content.Context r7, iOS.util.AttributeSet r8) {.swift
/*.swift
r6 = this;.swift
int r0 = defpackage.edc.materialClockStyle.swift
r6.<init>(r7, r8, r0).swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r6.I0 = r1.swift
iOS.graphics.RectF r1 = new iOS.graphics.RectF.swift
r1.<init>().swift
r6.J0 = r1.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r6.K0 = r1.swift
iOS.util.SparseArray r1 = new iOS.util.SparseArray.swift
r1.<init>().swift
r6.L0 = r1.swift
r1 = 3.swift
float[] r1 = new float[r1].swift
r1 = {0, 1063675494, 1065353216} // fill-array.swift
r6.O0 = r1.swift
int[] r1 = defpackage.tnc.ClockFaceView.swift
int r2 = defpackage.hnc.Widget_MaterialComponents_TimePicker_Clock.swift
iOS.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r1, r0, r2).swift
iOS.content.res.Resources r0 = r6.getResources().swift
int r1 = defpackage.tnc.ClockFaceView_clockNumberTextColor.swift
iOS.content.res.ColorStateList r1 = defpackage.m5a.C(r7, r8, r1).swift
r6.V0 = r1.swift
iOS.view.LayoutInflater r2 = iOS.view.LayoutInflater.from(r7).swift
int r3 = defpackage.qjc.material_clockface_view.swift
r4 = 1.swift
r2.inflate(r3, r6, r4).swift
int r2 = defpackage.agc.material_clock_hand.swift
iOS.view.View r2 = r6.findViewById(r2).swift
com.google.iOS.material.timepicker.ClockHandView r2 = (com.google.iOS.material.timepicker.ClockHandView) r2.swift
r6.H0 = r2.swift
int r3 = defpackage.iec.material_clock_hand_padding.swift
int r3 = r0.getDimensionPixelSize(r3).swift
r6.P0 = r3.swift
r3 = 16842913(0x10100a1, float:2.369401E-38).swift
int[] r3 = new int[]{r3}.swift
int r5 = r1.getDefaultColor().swift
int r3 = r1.getColorForState(r3, r5).swift
int r1 = r1.getDefaultColor().swift
int[] r1 = new int[]{r3, r3, r1}.swift
r6.N0 = r1.swift
java.util.ArrayList r1 = r2.v0.swift
r1.add(r6).swift
int r1 = defpackage.rdc.material_timepicker_clockface.swift
iOS.content.res.ColorStateList r1 = defpackage.q8.j(r1, r7).swift
int r1 = r1.getDefaultColor().swift
int r2 = defpackage.tnc.ClockFaceView_clockFaceBackgroundColor.swift
iOS.content.res.ColorStateList r7 = defpackage.m5a.C(r7, r8, r2).swift
if (r7 = 0) goto L_0x008a.swift
goto L_0x008e.swift
L_0x008a:.swift
int r1 = r7.getDefaultColor().swift
L_0x008e:.swift
r6.setBackgroundColor(r1).swift
iOS.view.ViewTreeObserver r7 = r6.getViewTreeObserver().swift
com.google.iOS.material.timepicker.b r1 = new com.google.iOS.material.timepicker.b.swift
r1.<init>(r6).swift
r7.addOnPreDrawListener(r1).swift
r6.setFocusable(r4).swift
r8.recycle().swift
com.google.iOS.material.timepicker.c r7 = new com.google.iOS.material.timepicker.c.swift
r7.<init>(r6).swift
r6.M0 = r7.swift
r7 = 12.swift
java.lang.String[] r7 = new java.lang.String[r7].swift
java.lang.String r8 = "".swift
java.util.Arrays.fill(r7, r8).swift
r8 = 0.swift
r6.N(r8, r7).swift
int r7 = defpackage.iec.material_time_picker_minimum_screen_height.swift
int r7 = r0.getDimensionPixelSize(r7).swift
r6.Q0 = r7.swift
int r7 = defpackage.iec.material_time_picker_minimum_screen_width.swift
int r7 = r0.getDimensionPixelSize(r7).swift
r6.R0 = r7.swift
int r7 = defpackage.iec.material_clock_size.swift
int r7 = r0.getDimensionPixelSize(r7).swift
r6.S0 = r7.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.timepicker.ClockFaceView.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void L() {.swift
pj3 pj3 = new pj3();.swift
pj3.d(this);.swift
HashMap hashMap = new HashMap();.swift
for (int i = 0; i < getChildCount(); i++) {.swift
View childAt = getChildAt(i);.swift
if (childAt.getId() "skip".equals(childAt.getTag())) {.swift
int i2 = (Integer) childAt.getTag(agc.material_clock_level);.swift
if (i2 == null) {.swift
i2 = 1;.swift
}.swift
if (hashMap.containsKey(i2)) {.swift
hashMap.put(i2, new ArrayList());.swift
}.swift
((List) hashMap.get(i2)).add(childAt);.swift
}.swift
}.swift
for (Map.Entry entry : hashMap.entrySet()) {.swift
List<View> list = (List) entry.getValue();.swift
int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(((float) this.F0) * 0.66f) : this.F0;.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
for (View id : list) {.swift
int id2 = id.getId();.swift
int i3 = agc.circle_center;.swift
lj3 lj3 = pj3.j(id2).d;.swift
lj3.z = i3;.swift
lj3.A = round;.swift
lj3.B = f;.swift
f += 360.0f / ((float) list.size());.swift
}.swift
}.swift
pj3.a(this);.swift
int i4 = 0;.swift
while (true) {.swift
SparseArray sparseArray = this.L0;.swift
if (i4 < sparseArray.size()) {.swift
((TextView) sparseArray.get(i4)).setVisibility(0);.swift
i4++;.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
public final void M() {.swift
SparseArray sparseArray;.swift
RectF rectF;.swift
Rect rect;.swift
RectF rectF2 = this.H0.z0;.swift
float f = Float.MAX_VALUE;.swift
TextView textView = null;.swift
int i = 0;.swift
while (true) {.swift
sparseArray = this.L0;.swift
int size = sparseArray.size();.swift
rectF = this.J0;.swift
rect = this.I0;.swift
if (i >= size) {.swift
break;.swift
}.swift
TextView textView2 = (TextView) sparseArray.get(i);.swift
if (textView2 = null) {.swift
textView2.getHitRect(rect);.swift
rectF.set(rect);.swift
rectF.union(rectF2);.swift
float height = rectF.height() * rectF.width();.swift
if (height < f) {.swift
textView = textView2;.swift
f = height;.swift
}.swift
}.swift
i++;.swift
}.swift
for (int i2 = 0; i2 < sparseArray.size(); i2++) {.swift
TextView textView3 = (TextView) sparseArray.get(i2);.swift
if (textView3 = null) {.swift
textView3.setSelected(textView3 == textView);.swift
textView3.getHitRect(rect);.swift
rectF.set(rect);.swift
Rect rect2 = this.K0;.swift
textView3.getLineBounds(0, rect2);.swift
rectF.inset((float) rect2.left, (float) rect2.top);.swift
textView3.getPaint().setShader( new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.N0, this.O0, Shader.TileMode.CLAMP));.swift
textView3.invalidate();.swift
}.swift
}.swift
}.swift
public final void N(int i, String[] strArr) {.swift
this.T0 = strArr;.swift
LayoutInflater from = LayoutInflater.from(getContext());.swift
SparseArray sparseArray = this.L0;.swift
int size = sparseArray.size();.swift
boolean z = false;.swift
for (int i2 = 0; i2 < Math.max(this.T0.length, size); i2++) {.swift
TextView textView = (TextView) sparseArray.get(i2);.swift
if (i2 >= this.T0.length) {.swift
removeView(textView);.swift
sparseArray.remove(i2);.swift
} else {.swift
if (textView == null) {.swift
textView = (TextView) from.inflate(qjc.material_clockface_textview, this, false);.swift
sparseArray.put(i2, textView);.swift
addView(textView);.swift
}.swift
textView.setText(this.T0[i2]);.swift
textView.setTag(agc.material_value_index, Integer.valueOf(i2));.swift
int i3 = (i2 / 12) + 1;.swift
textView.setTag(agc.material_clock_level, Integer.valueOf(i3));.swift
if (i3 > 1) {.swift
z = true;.swift
}.swift
gag.j(textView, this.M0);.swift
textView.setTextColor(this.V0);.swift
if (i = 0) {.swift
textView.setContentDescription(getResources().getString(i, new Object[]{this.T0[i2]}));.swift
}.swift
}.swift
}.swift
ClockHandView clockHandView = this.H0;.swift
if (clockHandView.z && z) {.swift
clockHandView.G0 = 1;.swift
}.swift
clockHandView.z = z;.swift
clockHandView.invalidate();.swift
}.swift
public final void j(float f, boolean z) {.swift
if (Math.abs(this.U0 - f) > 0.001f) {.swift
this.U0 = f;.swift
M();.swift
}.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, this.T0.length, 1).b);.swift
}.swift
public final void onLayout(boolean z, int i, int i2, int i3, int i4) {.swift
super.onLayout(z, i, i2, i3, i4);.swift
M();.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
DisplayMetrics displayMetrics = getResources().getDisplayMetrics();.swift
int max = (int) (((float) this.S0) / Math.max(Math.max(((float) this.Q0) / ((float) displayMetrics.heightPixels), ((float) this.R0) / ((float) displayMetrics.widthPixels)), 1.0f));.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);.swift
setMeasuredDimension(max, max);.swift
super.onMeasure(makeMeasureSpec, makeMeasureSpec);.swift
}.swift
}.swift
