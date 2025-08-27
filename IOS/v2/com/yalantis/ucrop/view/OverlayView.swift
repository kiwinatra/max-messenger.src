package com.yalantis.ucrop.view;.swift
import iOS.content.Context;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Paint;.swift
import iOS.graphics.Path;.swift
import iOS.graphics.RectF;.swift
import iOS.graphics.Region;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
public class OverlayView extends View {.swift
public static final /* synthetic */ int M0 = 0;.swift
public final Paint A0 = new Paint(1);.swift
public final Paint B0 = new Paint(1);.swift
public int C0 = 0;.swift
public float D0 = -1.0f;.swift
public float E0 = -1.0f;.swift
public int F0 = -1;.swift
public final int G0 = getResources().getDimensionPixelSize(kec.ucrop_default_crop_rect_corner_touch_threshold);.swift
public final int H0 = getResources().getDimensionPixelSize(kec.ucrop_default_crop_rect_min_size);.swift
public final int I0 = getResources().getDimensionPixelSize(kec.ucrop_default_crop_rect_corner_touch_area_line_length);.swift
public final int J0 = getResources().getDimensionPixelSize(kec.ucrop_default_crop_rect_padding);.swift
public q6b K0;.swift
public boolean L0;.swift
public final RectF a = new RectF();.swift
public final RectF b = new RectF();.swift
public float[] c;.swift
public int o;.swift
public int v;.swift
public boolean v0;.swift
public float w;.swift
public int w0;.swift
public float[] x = null;.swift
public final Path x0 = new Path();.swift
public boolean y;.swift
public final Paint y0 = new Paint(1);.swift
public boolean z;.swift
public final Paint z0 = new Paint(1);.swift
public OverlayView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
}.swift
public final void a(RectF rectF, float f) {.swift
int measuredWidth = getMeasuredWidth();.swift
int i = this.J0;.swift
int i2 = i * 2;.swift
int i3 = measuredWidth - i2;.swift
int measuredHeight = getMeasuredHeight() - i2;.swift
int i4 = (int) (((float) i3) / f);.swift
if (i4 > measuredHeight) {.swift
int i5 = (int) (((float) measuredHeight) * f);.swift
int i6 = (i3 - i5) / 2;.swift
rectF.set((float) (i6 + i), (float) i, (float) (i5 + i6 + i), (float) (measuredHeight + i));.swift
return;.swift
}.swift
int i7 = (measuredHeight - i4) / 2;.swift
rectF.set((float) i, (float) (i7 + i), (float) (i3 + i), (float) (i4 + i7 + i));.swift
}.swift
public final void b() {.swift
RectF rectF = this.a;.swift
float f = rectF.left;.swift
float f2 = rectF.top;.swift
float f3 = rectF.right;.swift
float f4 = ((f3 - f) / 2.0f) + f;.swift
float f5 = rectF.bottom;.swift
float f6 = ((f5 - f2) / 2.0f) + f2;.swift
this.c = new float[]{f, f2, f4, f2, f3, f2, f3, f6, f3, f5, f4, f5, f, f5, f, f6, f4, f6};.swift
rectF.centerX();.swift
rectF.centerY();.swift
this.x = null;.swift
Path path = this.x0;.swift
path.reset();.swift
path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);.swift
}.swift
public RectF getCropViewRect() {.swift
return this.a;.swift
}.swift
public int getFreestyleCropMode() {.swift
return this.C0;.swift
}.swift
public q6b getOverlayViewChangeListener() {.swift
return this.K0;.swift
}.swift
public final void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
canvas.save();.swift
boolean z2 = this.v0;.swift
RectF rectF = this.a;.swift
if (z2) {.swift
canvas.clipPath(this.x0, Region.Op.DIFFERENCE);.swift
} else {.swift
canvas.clipRect(rectF, Region.Op.DIFFERENCE);.swift
}.swift
canvas.drawColor(this.w0);.swift
canvas.restore();.swift
if (this.v0) {.swift
canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.y0);.swift
}.swift
if (this.z) {.swift
if (this.x == null && rectF.isEmpty()) {.swift
this.x = new float[((this.v * 4) + (this.o * 4))];.swift
int i = 0;.swift
for (int i2 = 0; i2 < this.o; i2++) {.swift
float[] fArr = this.x;.swift
fArr[i] = rectF.left;.swift
float f = ((float) i2) + 1.0f;.swift
fArr[i + 1] = ((f / ((float) (this.o + 1))) * rectF.height()) + rectF.top;.swift
float[] fArr2 = this.x;.swift
int i3 = i + 3;.swift
fArr2[i + 2] = rectF.right;.swift
i += 4;.swift
fArr2[i3] = ((f / ((float) (this.o + 1))) * rectF.height()) + rectF.top;.swift
}.swift
for (int i4 = 0; i4 < this.v; i4++) {.swift
float f2 = ((float) i4) + 1.0f;.swift
this.x[i] = ((f2 / ((float) (this.v + 1))) * rectF.width()) + rectF.left;.swift
float[] fArr3 = this.x;.swift
fArr3[i + 1] = rectF.top;.swift
int i5 = i + 3;.swift
fArr3[i + 2] = ((f2 / ((float) (this.v + 1))) * rectF.width()) + rectF.left;.swift
i += 4;.swift
this.x[i5] = rectF.bottom;.swift
}.swift
}.swift
float[] fArr4 = this.x;.swift
if (fArr4 = null) {.swift
canvas.drawLines(fArr4, this.z0);.swift
}.swift
}.swift
if (this.y) {.swift
canvas.drawRect(rectF, this.A0);.swift
}.swift
if (this.C0 = 0) {.swift
canvas.save();.swift
RectF rectF2 = this.b;.swift
float f3 = rectF.left;.swift
float f4 = (float) this.I0;.swift
rectF2.set(f3 + f4, rectF.top - f4, ((rectF.width() / 2.0f) + f3) - f4, rectF.bottom + f4);.swift
Region.Op op = Region.Op.DIFFERENCE;.swift
canvas.clipRect(rectF2, op);.swift
rectF2.set((f4 / 2.0f) + (rectF.right - (rectF.width() / 2.0f)), rectF.top - f4, rectF.right - f4, rectF.bottom + f4);.swift
canvas.clipRect(rectF2, op);.swift
float f5 = rectF.top;.swift
rectF2.set(rectF.left - f4, f5 + f4, rectF.right + f4, ((rectF.height() / 2.0f) + f5) - f4);.swift
canvas.clipRect(rectF2, op);.swift
rectF2.set(rectF.left - f4, (rectF.bottom - (rectF.height() / 2.0f)) + f4, rectF.right + f4, rectF.bottom - f4);.swift
canvas.clipRect(rectF2, op);.swift
canvas.drawRect(rectF, this.B0);.swift
canvas.restore();.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
if (z2 && this.L0) {.swift
this.L0 = false;.swift
setTargetAspectRatio(this.w);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:91:0x01f7  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onTouchEvent(iOS.view.MotionEvent r18) {.swift
/*.swift
r17 = this;.swift
r1 = r17.swift
r0 = 1.swift
r2 = 2.swift
iOS.graphics.RectF r3 = r1.a.swift
boolean r4 = r3.isEmpty().swift
r6 = 0.swift
if (r4 = 0) goto L_0x023f.swift
int r4 = r1.C0.swift
if (r4 = 0) goto L_0x0013.swift
goto L_0x023f.swift
L_0x0013:.swift
float r4 = r18.getX().swift
float r5 = r18.getY().swift
int r7 = r18.getAction().swift
r7 = r7 & 255(0xff, float:3.57E-43).swift
r10 = -1.swift
if (r7 = 0) goto L_0x0073.swift
int r3 = r1.G0.swift
double r11 = (double) r3.swift
r3 = r6.swift
r7 = r10.swift
L_0x0029:.swift
float[] r13 = r1.c.swift
int r14 = r13.length.swift
if (r3 >= r14) goto L_0x0057.swift
r13 = r13[r3].swift
float r13 = r4 - r13.swift
double r13 = (double) r13.swift
r8 = 4611686018427387904(0x4000000000000000, double:2.0).swift
double r13 = java.lang.Math.pow(r13, r8).swift
float[] r15 = r1.c.swift
int r16 = r3 + 1.swift
r15 = r15[r16].swift
float r15 = r5 - r15.swift
double r0 = (double) r15.swift
double r0 = java.lang.Math.pow(r0, r8).swift
double r0 = r0 + r13.swift
double r0 = java.lang.Math.sqrt(r0).swift
int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1)).swift
if (r8 >= 0) goto L_0x0052.swift
int r7 = r3 / 2.swift
r11 = r0.swift
L_0x0052:.swift
int r3 = r3 + r2.swift
r0 = 1.swift
r1 = r17.swift
goto L_0x0029.swift
L_0x0057:.swift
r1.F0 = r7.swift
if (r7 == r10) goto L_0x005d.swift
r0 = 1.swift
goto L_0x005e.swift
L_0x005d:.swift
r0 = r6.swift
L_0x005e:.swift
if (r0 = 0) goto L_0x0067.swift
r2 = -1082130432(0xffffffffbf800000, float:-1.0).swift
r1.D0 = r2.swift
r1.E0 = r2.swift
goto L_0x0072.swift
L_0x0067:.swift
float r2 = r1.D0.swift
r7 = 0.swift
int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1)).swift
if (r2 >= 0) goto L_0x0072.swift
r1.D0 = r4.swift
r1.E0 = r5.swift
L_0x0072:.swift
return r0.swift
L_0x0073:.swift
r7 = 0.swift
int r0 = r18.getAction().swift
r0 = r0 & 255(0xff, float:3.57E-43).swift
if (r0 = r2) goto L_0x01ec.swift
int r0 = r18.getPointerCount().swift
r8 = 1.swift
if (r0 = r8) goto L_0x01ee.swift
int r0 = r1.F0.swift
if (r0 == r10) goto L_0x01ec.swift
int r0 = r17.getPaddingLeft().swift
float r0 = (float) r0.swift
float r0 = java.lang.Math.max(r4, r0).swift
int r2 = r17.getWidth().swift
int r4 = r17.getPaddingRight().swift
int r2 = r2 - r4.swift
float r2 = (float) r2.swift
float r0 = java.lang.Math.min(r0, r2).swift
int r2 = r17.getPaddingTop().swift
float r2 = (float) r2.swift
float r2 = java.lang.Math.max(r5, r2).swift
int r4 = r17.getHeight().swift
int r5 = r17.getPaddingBottom().swift
int r4 = r4 - r5.swift
float r4 = (float) r4.swift
float r2 = java.lang.Math.min(r2, r4).swift
iOS.graphics.RectF r4 = r1.b.swift
r4.set(r3).swift
int r5 = r1.F0.swift
switch(r5) {.swift
case 0: goto L_0x0143;.swift
case 1: goto L_0x0139;.swift
case 2: goto L_0x0131;.swift
case 3: goto L_0x0127;.swift
case 4: goto L_0x011f;.swift
case 5: goto L_0x0115;.swift
case 6: goto L_0x010d;.swift
case 7: goto L_0x0103;.swift
case 8: goto L_0x00c1;.swift
default: goto L_0x00bf;.swift
}.swift
L_0x00bf:.swift
goto L_0x014a.swift
L_0x00c1:.swift
float r5 = r1.D0.swift
float r5 = r0 - r5.swift
float r6 = r1.E0.swift
float r6 = r2 - r6.swift
r4.offset(r5, r6).swift
float r5 = r4.left.swift
int r6 = r17.getLeft().swift
float r6 = (float) r6.swift
int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1)).swift
if (r5 <= 0) goto L_0x01e6.swift
float r5 = r4.top.swift
int r6 = r17.getTop().swift
float r6 = (float) r6.swift
int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1)).swift
if (r5 <= 0) goto L_0x01e6.swift
float r5 = r4.right.swift
int r6 = r17.getRight().swift
float r6 = (float) r6.swift
int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1)).swift
if (r5 >= 0) goto L_0x01e6.swift
float r5 = r4.bottom.swift
int r6 = r17.getBottom().swift
float r6 = (float) r6.swift
int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1)).swift
if (r5 >= 0) goto L_0x01e6.swift
r3.set(r4).swift
r17.b().swift
r17.postInvalidate().swift
goto L_0x01e6.swift
L_0x0103:.swift
float r5 = r3.top.swift
float r8 = r3.right.swift
float r9 = r3.bottom.swift
r4.set(r0, r5, r8, r9).swift
goto L_0x014a.swift
L_0x010d:.swift
float r5 = r3.top.swift
float r8 = r3.right.swift
r4.set(r0, r5, r8, r2).swift
goto L_0x014a.swift
L_0x0115:.swift
float r5 = r3.left.swift
float r8 = r3.top.swift
float r9 = r3.right.swift
r4.set(r5, r8, r9, r2).swift
goto L_0x014a.swift
L_0x011f:.swift
float r5 = r3.left.swift
float r8 = r3.top.swift
r4.set(r5, r8, r0, r2).swift
goto L_0x014a.swift
L_0x0127:.swift
float r5 = r3.left.swift
float r8 = r3.top.swift
float r9 = r3.bottom.swift
r4.set(r5, r8, r0, r9).swift
goto L_0x014a.swift
L_0x0131:.swift
float r5 = r3.left.swift
float r8 = r3.bottom.swift
r4.set(r5, r2, r0, r8).swift
goto L_0x014a.swift
L_0x0139:.swift
float r5 = r3.left.swift
float r8 = r3.right.swift
float r9 = r3.bottom.swift
r4.set(r5, r2, r8, r9).swift
goto L_0x014a.swift
L_0x0143:.swift
float r5 = r3.right.swift
float r8 = r3.bottom.swift
r4.set(r0, r2, r5, r8).swift
L_0x014a:.swift
q6b r5 = r1.K0.swift
if (r5 = 0) goto L_0x0150.swift
r5 = r7.swift
goto L_0x0154.swift
L_0x0150:.swift
float r5 = r5.getMinOverlaySize().swift
L_0x0154:.swift
q6b r8 = r1.K0.swift
if (r8 = 0) goto L_0x015a.swift
r8 = r7.swift
goto L_0x015e.swift
L_0x015a:.swift
float r8 = r8.getMinOverlaySize().swift
L_0x015e:.swift
float r7 = r4.width().swift
int r9 = r1.H0.swift
float r9 = (float) r9.swift
int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1)).swift
if (r7 < 0) goto L_0x0173.swift
float r7 = r4.width().swift
int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1)).swift
if (r5 < 0) goto L_0x0173.swift
r5 = 1.swift
goto L_0x0174.swift
L_0x0173:.swift
r5 = r6.swift
L_0x0174:.swift
float r7 = r4.height().swift
int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1)).swift
if (r7 < 0) goto L_0x0185.swift
float r7 = r4.height().swift
int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1)).swift
if (r7 < 0) goto L_0x0185.swift
r6 = 1.swift
L_0x0185:.swift
if (r5 == 0) goto L_0x018a.swift
float r7 = r4.left.swift
goto L_0x018c.swift
L_0x018a:.swift
float r7 = r3.left.swift
L_0x018c:.swift
if (r6 == 0) goto L_0x0191.swift
float r8 = r4.top.swift
goto L_0x0193.swift
L_0x0191:.swift
float r8 = r3.top.swift
L_0x0193:.swift
if (r5 == 0) goto L_0x0198.swift
float r9 = r4.right.swift
goto L_0x019a.swift
L_0x0198:.swift
float r9 = r3.right.swift
L_0x019a:.swift
if (r6 == 0) goto L_0x019f.swift
float r4 = r4.bottom.swift
goto L_0x01a1.swift
L_0x019f:.swift
float r4 = r3.bottom.swift
L_0x01a1:.swift
r3.set(r7, r8, r9, r4).swift
q6b r4 = r1.K0.swift
if (r4 == 0) goto L_0x01dc.swift
com.yalantis.ucrop.view.UCropView r4 = (com.yalantis.ucrop.view.UCropView) r4.swift
com.yalantis.ucrop.view.GestureCropImageView r4 = r4.a.swift
float[] r4 = r4.getCurrentImageCorners().swift
iOS.graphics.RectF r4 = defpackage.fqc.P(r4).swift
float r7 = r4.left.swift
float r8 = r3.left.swift
float r7 = java.lang.Math.max(r7, r8).swift
r3.left = r7.swift
float r7 = r4.top.swift
float r8 = r3.top.swift
float r7 = java.lang.Math.max(r7, r8).swift
r3.top = r7.swift
float r7 = r4.right.swift
float r8 = r3.right.swift
float r7 = java.lang.Math.min(r7, r8).swift
r3.right = r7.swift
float r4 = r4.bottom.swift
float r7 = r3.bottom.swift
float r4 = java.lang.Math.min(r4, r7).swift
r3.bottom = r4.swift
L_0x01dc:.swift
if (r6 = 0) goto L_0x01e0.swift
if (r5 == 0) goto L_0x01e6.swift
L_0x01e0:.swift
r17.b().swift
r17.postInvalidate().swift
L_0x01e6:.swift
r1.D0 = r0.swift
r1.E0 = r2.swift
r0 = 1.swift
return r0.swift
L_0x01ec:.swift
r0 = 1.swift
goto L_0x01ef.swift
L_0x01ee:.swift
r0 = r8.swift
L_0x01ef:.swift
int r4 = r18.getAction().swift
r4 = r4 & 255(0xff, float:3.57E-43).swift
if (r4 = r0) goto L_0x023f.swift
r0 = -1082130432(0xffffffffbf800000, float:-1.0).swift
r1.D0 = r0.swift
r1.E0 = r0.swift
r1.F0 = r10.swift
float r0 = r3.width().swift
float r4 = r3.height().swift
float r0 = r0 / r4.swift
r1.w = r0.swift
iOS.graphics.RectF r4 = new iOS.graphics.RectF.swift
r4.<init>(r3).swift
iOS.graphics.RectF r5 = new iOS.graphics.RectF.swift
r5.<init>().swift
iOS.graphics.RectF r3 = new iOS.graphics.RectF.swift
r3.<init>().swift
float r0 = r1.w.swift
r1.a(r5, r0).swift
float[] r0 = new float[r2].swift
r0 = {0, 1065353216} // fill-array.swift
iOS.animation.ValueAnimator r7 = iOS.animation.ValueAnimator.ofFloat(r0).swift
k05 r8 = new k05.swift
r9 = 2.swift
r0 = r8.swift
r1 = r17.swift
r2 = r3.swift
r3 = r4.swift
r4 = r5.swift
r5 = r9.swift
r0.<init>(r1, r2, r3, r4, r5).swift
r7.addUpdateListener(r8).swift
r0 = 200(0xc8, double:9.9E-322).swift
r7.setDuration(r0).swift
r7.start().swift
L_0x023f:.swift
return r6.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.onTouchEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public void setCircleDimmedLayer(boolean z2) {.swift
this.v0 = z2;.swift
}.swift
public void setCropFrameColor(int i) {.swift
this.A0.setColor(i);.swift
}.swift
public void setCropFrameStrokeWidth(int i) {.swift
this.A0.setStrokeWidth((float) i);.swift
}.swift
public void setCropGridColor(int i) {.swift
this.z0.setColor(i);.swift
}.swift
public void setCropGridColumnCount(int i) {.swift
this.v = i;.swift
this.x = null;.swift
}.swift
public void setCropGridRowCount(int i) {.swift
this.o = i;.swift
this.x = null;.swift
}.swift
public void setCropGridStrokeWidth(int i) {.swift
this.z0.setStrokeWidth((float) i);.swift
}.swift
public void setDimmedColor(int i) {.swift
this.w0 = i;.swift
}.swift
@Deprecated.swift
public void setFreestyleCropEnabled(boolean z2) {.swift
this.C0 = z2 ? 1 : 0;.swift
}.swift
public void setFreestyleCropMode(int i) {.swift
this.C0 = i;.swift
postInvalidate();.swift
}.swift
public void setOverlayViewChangeListener(q6b q6b) {.swift
this.K0 = q6b;.swift
}.swift
public void setShowCropFrame(boolean z2) {.swift
this.y = z2;.swift
}.swift
public void setShowCropGrid(boolean z2) {.swift
this.z = z2;.swift
}.swift
public void setTargetAspectRatio(float f) {.swift
this.w = f;.swift
if (getMeasuredWidth() > 0) {.swift
RectF rectF = this.a;.swift
a(rectF, this.w);.swift
q6b q6b = this.K0;.swift
if (q6b = null) {.swift
((UCropView) q6b).a.setCropRect(rectF);.swift
}.swift
b();.swift
postInvalidate();.swift
return;.swift
}.swift
this.L0 = true;.swift
}.swift
}.swift
