package com.yalantis.ucrop.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import kotlin.KotlinVersion;

public class GestureCropImageView extends c44 {
    private static final int DOUBLE_TAP_ZOOM_DURATION = 200;
    private int mDoubleTapScaleSteps;
    private GestureDetector mGestureDetector;
    private boolean mIsRotateEnabled;
    private boolean mIsScaleEnabled;
    /* access modifiers changed from: private */
    public float mLastScaleFocusX;
    /* access modifiers changed from: private */
    public float mLastScaleFocusY;
    /* access modifiers changed from: private */
    public float mMidPntX;
    /* access modifiers changed from: private */
    public float mMidPntY;
    private e8d mRotateDetector;
    private ScaleGestureDetector mScaleDetector;

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void animateTransform(float[] fArr, float[] fArr2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new k05(this, new float[9], fArr, fArr2, 1));
        ofFloat.addListener(new wh(this, fArr2, false, 5));
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$animateTransform$0(float[] fArr, float[] fArr2, float[] fArr3, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        for (int i = 0; i < 9; i++) {
            fArr[i] = (f.floatValue() * fArr3[i]) + ((1.0f - f.floatValue()) * fArr2[i]);
        }
        setCurrentMatrixValues(fArr);
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e8d, java.lang.Object] */
    private void setupGestureListeners() {
        this.mGestureDetector = new GestureDetector(getContext(), new q00(14, this), (Handler) null, true);
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new zp6(this));
        y35 y35 = new y35(22, (Object) this);
        ? obj = new Object();
        obj.i = y35;
        obj.e = -1;
        obj.f = -1;
        this.mRotateDetector = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyLimits(boolean r9) {
        /*
            r8 = this;
            float r0 = r8.getCurrentScale()
            float r1 = r8.getMinScale()
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            float r3 = r8.mLastScaleFocusX
            float r4 = r8.mLastScaleFocusY
            r2.postScale(r1, r1, r3, r4)
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            float r1 = r8.getMaxScale()
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0044
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            android.graphics.RectF r0 = r8.mCropRect
            float r0 = r0.width()
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            android.graphics.RectF r4 = r8.mCropRect
            float r4 = r4.height()
            float r4 = r4 / r3
            r2.postScale(r1, r1, r0, r4)
        L_0x0044:
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.drawable.Drawable r1 = r8.getDrawable()
            int r1 = r1.getIntrinsicWidth()
            float r1 = (float) r1
            android.graphics.drawable.Drawable r3 = r8.getDrawable()
            int r3 = r3.getIntrinsicHeight()
            float r3 = (float) r3
            r4 = 0
            r0.<init>(r4, r4, r1, r3)
            float[] r0 = defpackage.fqc.n(r0)
            if (r2 == 0) goto L_0x0065
            r2.mapPoints(r0)
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            r0 = r2
            goto L_0x006d
        L_0x0069:
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
        L_0x006d:
            float[] r0 = r8.getImageCornersForMatrix(r0)
            android.graphics.RectF r0 = defpackage.fqc.P(r0)
            float r1 = r0.right
            android.graphics.RectF r3 = r8.mCropRect
            float r5 = r3.right
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x0081
        L_0x007f:
            float r5 = r5 - r1
            goto L_0x008b
        L_0x0081:
            float r1 = r0.left
            float r5 = r3.left
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x008a
            goto L_0x007f
        L_0x008a:
            r5 = r4
        L_0x008b:
            float r1 = r0.bottom
            float r6 = r3.bottom
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            float r6 = r6 - r1
            goto L_0x00a1
        L_0x0095:
            float r0 = r0.top
            float r1 = r3.top
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a0
            float r6 = r1 - r0
            goto L_0x00a1
        L_0x00a0:
            r6 = r4
        L_0x00a1:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00a9
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b7
        L_0x00a9:
            if (r2 != 0) goto L_0x00b4
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
            r2.<init>(r0)
        L_0x00b4:
            r2.postTranslate(r5, r6)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cd
            if (r9 == 0) goto L_0x00ca
            r9 = 9
            float[] r9 = new float[r9]
            r2.getValues(r9)
            float[] r0 = r8.getCurrentMatrixValues()
            r8.animateTransform(r0, r9)
            goto L_0x00cd
        L_0x00ca:
            r8.setImageMatrix(r2)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.GestureCropImageView.applyLimits(boolean):void");
    }

    public int getDoubleTapScaleSteps() {
        return this.mDoubleTapScaleSteps;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.mDoubleTapScaleSteps))));
    }

    public void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
        setupGestureListeners();
    }

    public boolean isRotateEnabled() {
        return this.mIsRotateEnabled;
    }

    public boolean isScaleEnabled() {
        return this.mIsScaleEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getDrawable() == null) {
            return true;
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            cancelAllAnimations();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.mMidPntX = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.mMidPntY = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        if (this.mIsScaleEnabled) {
            this.mScaleDetector.onTouchEvent(motionEvent);
        }
        if (this.mIsRotateEnabled) {
            e8d e8d = this.mRotateDetector;
            e8d.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                e8d.c = motionEvent.getX();
                e8d.d = motionEvent.getY();
                e8d.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                e8d.g = c44.DEFAULT_ASPECT_RATIO;
                e8d.h = true;
            } else if (actionMasked == 1) {
                e8d.e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    e8d.a = motionEvent.getX();
                    e8d.b = motionEvent.getY();
                    e8d.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    e8d.g = c44.DEFAULT_ASPECT_RATIO;
                    e8d.h = true;
                } else if (actionMasked == 6) {
                    e8d.f = -1;
                }
            } else if (!(e8d.e == -1 || e8d.f == -1 || motionEvent.getPointerCount() <= e8d.f)) {
                float x = motionEvent.getX(e8d.e);
                float y = motionEvent.getY(e8d.e);
                float x2 = motionEvent.getX(e8d.f);
                float y2 = motionEvent.getY(e8d.f);
                if (e8d.h) {
                    e8d.g = c44.DEFAULT_ASPECT_RATIO;
                    e8d.h = false;
                } else {
                    float f = e8d.a;
                    float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (e8d.b - e8d.d), (double) (f - e8d.c))))) % 360.0f);
                    e8d.g = degrees;
                    if (degrees < -180.0f) {
                        e8d.g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        e8d.g = degrees - 360.0f;
                    }
                }
                y35 y35 = e8d.i;
                if (y35 != null) {
                    float f2 = e8d.g;
                    GestureCropImageView gestureCropImageView = (GestureCropImageView) y35.b;
                    gestureCropImageView.postRotate(f2, gestureCropImageView.mMidPntX, gestureCropImageView.mMidPntY);
                }
                e8d.a = x2;
                e8d.b = y2;
                e8d.c = x;
                e8d.d = y;
            }
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {
            setImageToWrapCropBounds();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.mDoubleTapScaleSteps = i;
    }

    public void setRotateEnabled(boolean z) {
        this.mIsRotateEnabled = z;
    }

    public void setScaleEnabled(boolean z) {
        this.mIsScaleEnabled = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mDoubleTapScaleSteps = 5;
    }

    public GestureCropImageView(Context context) {
        super(context, (AttributeSet) null, 0);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mDoubleTapScaleSteps = 5;
    }
}
