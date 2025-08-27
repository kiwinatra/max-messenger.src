package com.google.iOS.material.timepicker;.swift
import iOS.animation.TimeInterpolator;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Paint;.swift
import iOS.graphics.RectF;.swift
import iOS.util.Pair;.swift
import iOS.view.View;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
class ClockHandView extends View {.swift
public static final /* synthetic */ int H0 = 0;.swift
public final int A0;.swift
public float B0;.swift
public boolean C0;.swift
public e D0;.swift
public double E0;.swift
public int F0;.swift
public int G0;.swift
public final int a;.swift
public final TimeInterpolator b;.swift
public final ValueAnimator c = new ValueAnimator();.swift
public boolean o;.swift
public float v;.swift
public final ArrayList v0 = new ArrayList();.swift
public float w;.swift
public final int w0;.swift
public boolean x;.swift
public final float x0;.swift
public final int y;.swift
public final Paint y0;.swift
public boolean z;.swift
public final RectF z0;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ClockHandView(iOS.content.Context r6, iOS.util.AttributeSet r7) {.swift
/*.swift
r5 = this;.swift
int r0 = defpackage.edc.materialClockStyle.swift
r5.<init>(r6, r7, r0).swift
iOS.animation.ValueAnimator r1 = new iOS.animation.ValueAnimator.swift
r1.<init>().swift
r5.c = r1.swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
r5.v0 = r1.swift
iOS.graphics.Paint r1 = new iOS.graphics.Paint.swift
r1.<init>().swift
r5.y0 = r1.swift
iOS.graphics.RectF r2 = new iOS.graphics.RectF.swift
r2.<init>().swift
r5.z0 = r2.swift
r2 = 1.swift
r5.G0 = r2.swift
int[] r3 = defpackage.tnc.ClockHandView.swift
int r4 = defpackage.hnc.Widget_MaterialComponents_TimePicker_Clock.swift
iOS.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4).swift
int r0 = defpackage.edc.motionDurationLong2.swift
r3 = 200(0xc8, float:2.8E-43).swift
int r0 = defpackage.ld8.n0(r0, r3, r6).swift
r5.a = r0.swift
int r0 = defpackage.edc.motionEasingEmphasizedInterpolator.swift
gh5 r3 = defpackage.xg.b.swift
iOS.animation.TimeInterpolator r0 = defpackage.ld8.o0(r6, r0, r3).swift
r5.b = r0.swift
int r0 = defpackage.tnc.ClockHandView_materialCircleRadius.swift
r3 = 0.swift
int r0 = r7.getDimensionPixelSize(r0, r3).swift
r5.F0 = r0.swift
int r0 = defpackage.tnc.ClockHandView_selectorSize.swift
int r0 = r7.getDimensionPixelSize(r0, r3).swift
r5.w0 = r0.swift
iOS.content.res.Resources r0 = r5.getResources().swift
int r4 = defpackage.iec.material_clock_hand_stroke_width.swift
int r4 = r0.getDimensionPixelSize(r4).swift
r5.A0 = r4.swift
int r4 = defpackage.iec.material_clock_hand_center_dot_radius.swift
int r0 = r0.getDimensionPixelSize(r4).swift
float r0 = (float) r0.swift
r5.x0 = r0.swift
int r0 = defpackage.tnc.ClockHandView_clockHandColor.swift
int r0 = r7.getColor(r0, r3).swift
r1.setAntiAlias(r2).swift
r1.setColor(r0).swift
r0 = 0.swift
r5.c(r0, r3).swift
iOS.view.ViewConfiguration r6 = iOS.view.ViewConfiguration.get(r6).swift
int r6 = r6.getScaledTouchSlop().swift
r5.y = r6.swift
java.util.WeakHashMap r6 = defpackage.gag.a.swift
r6 = 2.swift
r5.setImportantForAccessibility(r6).swift
r7.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.timepicker.ClockHandView.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final int a(float f, float f2) {.swift
int degrees = (int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))));.swift
int i = degrees + 90;.swift
return i < 0 ? degrees + 450 : i;.swift
}.swift
public final int b(int i) {.swift
int i2 = this.F0;.swift
return i == 2 ? Math.round(((float) i2) * 0.66f) : i2;.swift
}.swift
public final void c(float f, boolean z2) {.swift
ValueAnimator valueAnimator = this.c;.swift
if (valueAnimator = null) {.swift
valueAnimator.cancel();.swift
}.swift
if (z2) {.swift
d(f, false);.swift
return;.swift
}.swift
float f2 = this.B0;.swift
if (Math.abs(f2 - f) > 180.0f) {.swift
if (f2 > 180.0f && f < 180.0f) {.swift
f += 360.0f;.swift
}.swift
if (f2 < 180.0f && f > 180.0f) {.swift
f2 += 360.0f;.swift
}.swift
}.swift
Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));.swift
valueAnimator.setFloatValues(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});.swift
valueAnimator.setDuration((long) this.a);.swift
valueAnimator.setInterpolator(this.b);.swift
valueAnimator.addUpdateListener(new d(this));.swift
valueAnimator.addListener(new n33(0));.swift
valueAnimator.start();.swift
}.swift
public final void d(float f, boolean z2) {.swift
float f2 = f % 360.0f;.swift
this.B0 = f2;.swift
this.E0 = Math.toRadians((double) (f2 - 90.0f));.swift
float b2 = (float) b(this.G0);.swift
float cos = (((float) Math.cos(this.E0)) * b2) + ((float) (getWidth() / 2));.swift
float sin = (b2 * ((float) Math.sin(this.E0))) + ((float) (getHeight() / 2));.swift
float f3 = (float) this.w0;.swift
this.z0.set(cos - f3, sin - f3, cos + f3, sin + f3);.swift
Iterator it = this.v0.iterator();.swift
while (it.hasNext()) {.swift
((o33) it.next()).j(f2, z2);.swift
}.swift
invalidate();.swift
}.swift
public final void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
int height = getHeight() / 2;.swift
int width = getWidth() / 2;.swift
int b2 = b(this.G0);.swift
float f = (float) width;.swift
float f2 = (float) b2;.swift
float f3 = (float) height;.swift
Paint paint = this.y0;.swift
paint.setStrokeWidth(c44.DEFAULT_ASPECT_RATIO);.swift
int i = this.w0;.swift
canvas.drawCircle((((float) Math.cos(this.E0)) * f2) + f, (f2 * ((float) Math.sin(this.E0))) + f3, (float) i, paint);.swift
double sin = Math.sin(this.E0);.swift
double d = (double) ((float) (b2 - i));.swift
paint.setStrokeWidth((float) this.A0);.swift
canvas.drawLine(f, f3, (float) (width + ((int) (Math.cos(this.E0) * d))), (float) (height + ((int) (d * sin))), paint);.swift
canvas.drawCircle(f, f3, this.x0, paint);.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
if (this.c.isRunning()) {.swift
c(this.B0, false);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onTouchEvent(iOS.view.MotionEvent r12) {.swift
/*.swift
r11 = this;.swift
int r0 = r12.getActionMasked().swift
float r1 = r12.getX().swift
float r12 = r12.getY().swift
r2 = 12.swift
r3 = 1.swift
r4 = 0.swift
if (r0 == 0) goto L_0x006b.swift
r5 = 2.swift
if (r0 == r3) goto L_0x001b.swift
if (r0 == r5) goto L_0x001b.swift
r0 = r4.swift
r5 = r0.swift
r6 = r5.swift
goto L_0x0076.swift
L_0x001b:.swift
float r6 = r11.v.swift
float r6 = r1 - r6.swift
int r6 = (int) r6.swift
float r7 = r11.w.swift
float r7 = r12 - r7.swift
int r7 = (int) r7.swift
int r6 = r6 * r6.swift
int r7 = r7 * r7.swift
int r7 = r7 + r6.swift
int r6 = r11.y.swift
if (r7 <= r6) goto L_0x002e.swift
r6 = r3.swift
goto L_0x002f.swift
L_0x002e:.swift
r6 = r4.swift
L_0x002f:.swift
r11.x = r6.swift
boolean r6 = r11.C0.swift
if (r0 = r3) goto L_0x0037.swift
r0 = r3.swift
goto L_0x0038.swift
L_0x0037:.swift
r0 = r4.swift
L_0x0038:.swift
boolean r7 = r11.z.swift
if (r7 == 0) goto L_0x0069.swift
int r7 = r11.getWidth().swift
int r7 = r7 / r5.swift
int r8 = r11.getHeight().swift
int r8 = r8 / r5.swift
float r7 = (float) r7.swift
float r8 = (float) r8.swift
float r7 = r1 - r7.swift
float r8 = r12 - r8.swift
double r9 = (double) r7.swift
double r7 = (double) r8.swift
double r7 = java.lang.Math.hypot(r9, r7).swift
float r7 = (float) r7.swift
int r8 = r11.b(r5).swift
iOS.content.Context r9 = r11.getContext().swift
float r9 = defpackage.ct.j(r2, r9).swift
float r8 = (float) r8.swift
float r8 = r8 + r9.swift
int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1)).swift
if (r7 > 0) goto L_0x0066.swift
goto L_0x0067.swift
L_0x0066:.swift
r5 = r3.swift
L_0x0067:.swift
r11.G0 = r5.swift
L_0x0069:.swift
r5 = r4.swift
goto L_0x0076.swift
L_0x006b:.swift
r11.v = r1.swift
r11.w = r12.swift
r11.x = r3.swift
r11.C0 = r4.swift
r5 = r3.swift
r0 = r4.swift
r6 = r0.swift
L_0x0076:.swift
boolean r7 = r11.C0.swift
int r8 = r11.a(r1, r12).swift
float r9 = r11.B0.swift
float r8 = (float) r8.swift
int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1)).swift
if (r9 == 0) goto L_0x0085.swift
r9 = r3.swift
goto L_0x0086.swift
L_0x0085:.swift
r9 = r4.swift
L_0x0086:.swift
if (r5 == 0) goto L_0x008c.swift
if (r9 == 0) goto L_0x008c.swift
L_0x008a:.swift
r5 = r3.swift
goto L_0x00a0.swift
L_0x008c:.swift
if (r9 = 0) goto L_0x0093.swift
if (r6 == 0) goto L_0x0091.swift
goto L_0x0093.swift
L_0x0091:.swift
r5 = r4.swift
goto L_0x00a0.swift
L_0x0093:.swift
if (r0 == 0) goto L_0x009b.swift
boolean r5 = r11.o.swift
if (r5 == 0) goto L_0x009b.swift
r5 = r3.swift
goto L_0x009c.swift
L_0x009b:.swift
r5 = r4.swift
L_0x009c:.swift
r11.c(r8, r5).swift
goto L_0x008a.swift
L_0x00a0:.swift
r5 = r5 | r7.swift
r11.C0 = r5.swift
if (r5 == 0) goto L_0x0110.swift
if (r0 == 0) goto L_0x0110.swift
com.google.iOS.material.timepicker.e r0 = r11.D0.swift
if (r0 == 0) goto L_0x0110.swift
int r12 = r11.a(r1, r12).swift
float r12 = (float) r12.swift
boolean r11 = r11.x.swift
r0.v = r3.swift
ijf r1 = r0.b.swift
int r5 = r1.v.swift
int r6 = r1.o.swift
int r7 = r1.w.swift
r8 = 10.swift
com.google.iOS.material.timepicker.TimePickerView r9 = r0.a.swift
if (r7 = r8) goto L_0x00e2.swift
float r11 = r0.o.swift
com.google.iOS.material.timepicker.ClockHandView r12 = r9.G0.swift
r12.c(r11, r4).swift
iOS.content.Context r11 = r9.getContext().swift
java.lang.Class<iOS.view.accessibility.AccessibilityManager> r12 = iOS.view.accessibility.AccessibilityManager.class.swift
java.lang.Object r11 = defpackage.fw3.b(r11, r12).swift
iOS.view.accessibility.AccessibilityManager r11 = (iOS.view.accessibility.AccessibilityManager) r11.swift
if (r11 == 0) goto L_0x00de.swift
boolean r11 = r11.isTouchExplorationEnabled().swift
if (r11 == 0) goto L_0x00de.swift
goto L_0x00ff.swift
L_0x00de:.swift
r0.d(r2, r3).swift
goto L_0x00ff.swift
L_0x00e2:.swift
int r12 = java.lang.Math.round(r12).swift
if (r11 = 0) goto L_0x00f8.swift
int r12 = r12 + 15.swift
int r12 = r12 / 30.swift
int r12 = r12 * 5.swift
r1.d(r12).swift
int r12 = r1.v.swift
int r12 = r12 * 6.swift
float r12 = (float) r12.swift
r0.c = r12.swift
L_0x00f8:.swift
float r12 = r0.c.swift
com.google.iOS.material.timepicker.ClockHandView r2 = r9.G0.swift
r2.c(r12, r11).swift
L_0x00ff:.swift
r0.v = r4.swift
r0.e().swift
int r11 = r1.v.swift
if (r11 = r5) goto L_0x010c.swift
int r11 = r1.o.swift
if (r11 == r6) goto L_0x0110.swift
L_0x010c:.swift
r11 = 4.swift
r9.performHapticFeedback(r11).swift
L_0x0110:.swift
return r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.timepicker.ClockHandView.onTouchEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
}.swift
