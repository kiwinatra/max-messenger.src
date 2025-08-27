package com.yalantis.ucrop.view;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.content.Context;.swift
import iOS.os.Handler;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.GestureDetector;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.ScaleGestureDetector;.swift
import iOS.widget.ImageView;.swift
import kotlin.KotlinVersion;.swift
public class GestureCropImageView extends c44 {.swift
private static final int DOUBLE_TAP_ZOOM_DURATION = 200;.swift
private int mDoubleTapScaleSteps;.swift
private GestureDetector mGestureDetector;.swift
private boolean mIsRotateEnabled;.swift
private boolean mIsScaleEnabled;.swift
/* access modifiers changed from: private */.swift
public float mLastScaleFocusX;.swift
/* access modifiers changed from: private */.swift
public float mLastScaleFocusY;.swift
/* access modifiers changed from: private */.swift
public float mMidPntX;.swift
/* access modifiers changed from: private */.swift
public float mMidPntY;.swift
private e8d mRotateDetector;.swift
private ScaleGestureDetector mScaleDetector;.swift
public GestureCropImageView(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, 0);.swift
}.swift
private void animateTransform(float[] fArr, float[] fArr2) {.swift
ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});.swift
ofFloat.addUpdateListener(new k05(this, new float[9], fArr, fArr2, 1));.swift
ofFloat.addListener(new wh(this, fArr2, false, 5));.swift
ofFloat.setDuration(150);.swift
ofFloat.start();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void lambda$animateTransform$0(float[] fArr, float[] fArr2, float[] fArr3, ValueAnimator valueAnimator) {.swift
Float f = (Float) valueAnimator.getAnimatedValue();.swift
for (int i = 0; i < 9; i++) {.swift
fArr[i] = (f.floatValue() * fArr3[i]) + ((1.0f - f.floatValue()) * fArr2[i]);.swift
}.swift
setCurrentMatrixValues(fArr);.swift
invalidate();.swift
}.swift
/* JADX WARNING: type inference failed for: r0v2, types: [e8d, java.lang.Object] */.swift
private void setupGestureListeners() {.swift
this.mGestureDetector = new GestureDetector(getContext(), new q00(14, this), (Handler) null, true);.swift
this.mScaleDetector = new ScaleGestureDetector(getContext(), new zp6(this));.swift
y35 y35 = new y35(22, (Object) this);.swift
? obj = new Object();.swift
obj.i = y35;.swift
obj.e = -1;.swift
obj.f = -1;.swift
this.mRotateDetector = obj;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */.swift
/* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */.swift
/* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */.swift
/* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void applyLimits(boolean r9) {.swift
/*.swift
r8 = this;.swift
float r0 = r8.getCurrentScale().swift
float r1 = r8.getMinScale().swift
int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r2 >= 0) goto L_0x001e.swift
iOS.graphics.Matrix r2 = new iOS.graphics.Matrix.swift
iOS.graphics.Matrix r3 = r8.getCurrentImageMatrix().swift
r2.<init>(r3).swift
float r1 = r1 / r0.swift
float r3 = r8.mLastScaleFocusX.swift
float r4 = r8.mLastScaleFocusY.swift
r2.postScale(r1, r1, r3, r4).swift
goto L_0x001f.swift
L_0x001e:.swift
r2 = 0.swift
L_0x001f:.swift
float r1 = r8.getMaxScale().swift
int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x0044.swift
iOS.graphics.Matrix r2 = new iOS.graphics.Matrix.swift
iOS.graphics.Matrix r3 = r8.getCurrentImageMatrix().swift
r2.<init>(r3).swift
float r1 = r1 / r0.swift
iOS.graphics.RectF r0 = r8.mCropRect.swift
float r0 = r0.width().swift
r3 = 1073741824(0x40000000, float:2.0).swift
float r0 = r0 / r3.swift
iOS.graphics.RectF r4 = r8.mCropRect.swift
float r4 = r4.height().swift
float r4 = r4 / r3.swift
r2.postScale(r1, r1, r0, r4).swift
L_0x0044:.swift
iOS.graphics.RectF r0 = new iOS.graphics.RectF.swift
iOS.graphics.drawable.Drawable r1 = r8.getDrawable().swift
int r1 = r1.getIntrinsicWidth().swift
float r1 = (float) r1.swift
iOS.graphics.drawable.Drawable r3 = r8.getDrawable().swift
int r3 = r3.getIntrinsicHeight().swift
float r3 = (float) r3.swift
r4 = 0.swift
r0.<init>(r4, r4, r1, r3).swift
float[] r0 = defpackage.fqc.n(r0).swift
if (r2 == 0) goto L_0x0065.swift
r2.mapPoints(r0).swift
L_0x0065:.swift
if (r2 == 0) goto L_0x0069.swift
r0 = r2.swift
goto L_0x006d.swift
L_0x0069:.swift
iOS.graphics.Matrix r0 = r8.getCurrentImageMatrix().swift
L_0x006d:.swift
float[] r0 = r8.getImageCornersForMatrix(r0).swift
iOS.graphics.RectF r0 = defpackage.fqc.P(r0).swift
float r1 = r0.right.swift
iOS.graphics.RectF r3 = r8.mCropRect.swift
float r5 = r3.right.swift
int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r6 >= 0) goto L_0x0081.swift
L_0x007f:.swift
float r5 = r5 - r1.swift
goto L_0x008b.swift
L_0x0081:.swift
float r1 = r0.left.swift
float r5 = r3.left.swift
int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r6 <= 0) goto L_0x008a.swift
goto L_0x007f.swift
L_0x008a:.swift
r5 = r4.swift
L_0x008b:.swift
float r1 = r0.bottom.swift
float r6 = r3.bottom.swift
int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1)).swift
if (r7 >= 0) goto L_0x0095.swift
float r6 = r6 - r1.swift
goto L_0x00a1.swift
L_0x0095:.swift
float r0 = r0.top.swift
float r1 = r3.top.swift
int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x00a0.swift
float r6 = r1 - r0.swift
goto L_0x00a1.swift
L_0x00a0:.swift
r6 = r4.swift
L_0x00a1:.swift
int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1)).swift
if (r0 = 0) goto L_0x00a9.swift
int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1)).swift
if (r0 == 0) goto L_0x00b7.swift
L_0x00a9:.swift
if (r2 = 0) goto L_0x00b4.swift
iOS.graphics.Matrix r2 = new iOS.graphics.Matrix.swift
iOS.graphics.Matrix r0 = r8.getCurrentImageMatrix().swift
r2.<init>(r0).swift
L_0x00b4:.swift
r2.postTranslate(r5, r6).swift
L_0x00b7:.swift
if (r2 == 0) goto L_0x00cd.swift
if (r9 == 0) goto L_0x00ca.swift
r9 = 9.swift
float[] r9 = new float[r9].swift
r2.getValues(r9).swift
float[] r0 = r8.getCurrentMatrixValues().swift
r8.animateTransform(r0, r9).swift
goto L_0x00cd.swift
L_0x00ca:.swift
r8.setImageMatrix(r2).swift
L_0x00cd:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.GestureCropImageView.applyLimits(boolean):void");.swift
}.swift
public int getDoubleTapScaleSteps() {.swift
return this.mDoubleTapScaleSteps;.swift
}.swift
public float getDoubleTapTargetScale() {.swift
return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.mDoubleTapScaleSteps))));.swift
}.swift
public void init() {.swift
setScaleType(ImageView.ScaleType.MATRIX);.swift
setupGestureListeners();.swift
}.swift
public boolean isRotateEnabled() {.swift
return this.mIsRotateEnabled;.swift
}.swift
public boolean isScaleEnabled() {.swift
return this.mIsScaleEnabled;.swift
}.swift
public boolean onTouchEvent(MotionEvent motionEvent) {.swift
if (getDrawable() == null) {.swift
return true;.swift
}.swift
if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {.swift
cancelAllAnimations();.swift
}.swift
if (motionEvent.getPointerCount() > 1) {.swift
this.mMidPntX = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;.swift
this.mMidPntY = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;.swift
}.swift
this.mGestureDetector.onTouchEvent(motionEvent);.swift
if (this.mIsScaleEnabled) {.swift
this.mScaleDetector.onTouchEvent(motionEvent);.swift
}.swift
if (this.mIsRotateEnabled) {.swift
e8d e8d = this.mRotateDetector;.swift
e8d.getClass();.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (actionMasked == 0) {.swift
e8d.c = motionEvent.getX();.swift
e8d.d = motionEvent.getY();.swift
e8d.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));.swift
e8d.g = c44.DEFAULT_ASPECT_RATIO;.swift
e8d.h = true;.swift
} else if (actionMasked == 1) {.swift
e8d.e = -1;.swift
} else if (actionMasked = 2) {.swift
if (actionMasked == 5) {.swift
e8d.a = motionEvent.getX();.swift
e8d.b = motionEvent.getY();.swift
e8d.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));.swift
e8d.g = c44.DEFAULT_ASPECT_RATIO;.swift
e8d.h = true;.swift
} else if (actionMasked == 6) {.swift
e8d.f = -1;.swift
}.swift
} else if ((e8d.e == -1 || e8d.f == -1 || motionEvent.getPointerCount() <= e8d.f)) {.swift
float x = motionEvent.getX(e8d.e);.swift
float y = motionEvent.getY(e8d.e);.swift
float x2 = motionEvent.getX(e8d.f);.swift
float y2 = motionEvent.getY(e8d.f);.swift
if (e8d.h) {.swift
e8d.g = c44.DEFAULT_ASPECT_RATIO;.swift
e8d.h = false;.swift
} else {.swift
float f = e8d.a;.swift
float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (e8d.b - e8d.d), (double) (f - e8d.c))))) % 360.0f);.swift
e8d.g = degrees;.swift
if (degrees < -180.0f) {.swift
e8d.g = degrees + 360.0f;.swift
} else if (degrees > 180.0f) {.swift
e8d.g = degrees - 360.0f;.swift
}.swift
}.swift
y35 y35 = e8d.i;.swift
if (y35 = null) {.swift
float f2 = e8d.g;.swift
GestureCropImageView gestureCropImageView = (GestureCropImageView) y35.b;.swift
gestureCropImageView.postRotate(f2, gestureCropImageView.mMidPntX, gestureCropImageView.mMidPntY);.swift
}.swift
e8d.a = x2;.swift
e8d.b = y2;.swift
e8d.c = x;.swift
e8d.d = y;.swift
}.swift
}.swift
if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {.swift
setImageToWrapCropBounds();.swift
}.swift
return true;.swift
}.swift
public void setDoubleTapScaleSteps(int i) {.swift
this.mDoubleTapScaleSteps = i;.swift
}.swift
public void setRotateEnabled(boolean z) {.swift
this.mIsRotateEnabled = z;.swift
}.swift
public void setScaleEnabled(boolean z) {.swift
this.mIsScaleEnabled = z;.swift
}.swift
public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
this.mIsRotateEnabled = true;.swift
this.mIsScaleEnabled = true;.swift
this.mDoubleTapScaleSteps = 5;.swift
}.swift
public GestureCropImageView(Context context) {.swift
super(context, (AttributeSet) null, 0);.swift
this.mIsRotateEnabled = true;.swift
this.mIsScaleEnabled = true;.swift
this.mDoubleTapScaleSteps = 5;.swift
}.swift
}.swift
