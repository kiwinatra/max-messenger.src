package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.yalantis.ucrop.util.MatrixUtils;
import com.yalantis.ucrop.view.UCropView;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: c44  reason: default package */
public abstract class c44 extends frf {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private d44 initialCropState = null;
    private z34 mCropBoundsChangeListener;
    protected final RectF mCropRect = new RectF();
    private float mMaxScale;
    private float mMaxScaleMultiplier = 10.0f;
    private float mMinScale;
    private float mTargetAspectRatio;
    private final Matrix mTempMatrix = new Matrix();
    private final RectF mTempRect = new RectF();
    private Runnable mWrapCropBoundsRunnable;
    private Runnable mZoomImageToPositionRunnable = null;

    public c44(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void setupInitialCropState(d44 d44) {
        this.mCurrentImageMatrix.setValues(d44.c);
        this.mCurrentImageMatrix.invert(this.mTempMatrix);
        this.mTempRect.set(this.mCropRect);
        this.mTempMatrix.mapRect(this.mTempRect);
        float width = this.mTempRect.width();
        RectF rectF = d44.a;
        float max = Math.max(width / rectF.width(), this.mTempRect.height() / rectF.height());
        this.mCurrentImageMatrix.postScale(max, max, DEFAULT_ASPECT_RATIO, DEFAULT_ASPECT_RATIO);
        Matrix matrix = this.mCurrentImageMatrix;
        matrix.postTranslate(-MatrixUtils.getMatrixValue(matrix, 2), -MatrixUtils.getMatrixValue(this.mCurrentImageMatrix, 5));
        this.mCurrentImageMatrix.mapRect(rectF);
        Matrix matrix2 = this.mCurrentImageMatrix;
        RectF rectF2 = this.mCropRect;
        matrix2.postTranslate(rectF2.left - rectF.left, rectF2.top - rectF.top);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void calculateImageScaleBounds() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            f((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.mWrapCropBoundsRunnable);
        removeCallbacks(this.mZoomImageToPositionRunnable);
    }

    public void crop(Bitmap.CompressFormat compressFormat) throws IOException {
        crop(getViewBitmap(), getImageOutputPath(), compressFormat);
    }

    public final void f(float f, float f2) {
        RectF rectF = new RectF(DEFAULT_ASPECT_RATIO, DEFAULT_ASPECT_RATIO, f, f2);
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(getCurrentAngle());
        float[] n = fqc.n(rectF);
        this.mTempMatrix.mapPoints(n);
        RectF P = fqc.P(n);
        float max = Math.max(Math.abs(this.mCropRect.width() / P.width()), Math.abs(this.mCropRect.height() / P.height()));
        this.mMinScale = max;
        this.mMaxScale = max * this.mMaxScaleMultiplier;
    }

    public void flipHorizontally() {
        super.flipHorizontally(this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public RectF geDrawableCropRect() {
        this.mTempMatrix.reset();
        float currentScale = 1.0f / getCurrentScale();
        this.mTempMatrix.postScale(currentScale, currentScale);
        this.mTempRect.set(this.mCropRect);
        this.mTempMatrix.mapRect(this.mTempRect);
        return this.mTempRect;
    }

    public d44 getCropState() {
        this.mCurrentImageMatrix.invert(this.mTempMatrix);
        this.mTempRect.set(this.mCropRect);
        this.mTempMatrix.mapRect(this.mTempRect);
        this.mTempMatrix.mapPoints(new float[]{this.mCropRect.centerX(), this.mCropRect.centerY()});
        float[] fArr = new float[9];
        this.mCurrentImageMatrix.getValues(fArr);
        return new d44(this.mTempRect, this.mCropRect.width() / this.mCropRect.height(), fArr);
    }

    public Matrix getInitialMatrix() {
        if (getDrawable() == null) {
            return new Matrix();
        }
        Matrix matrix = new Matrix();
        float f = this.mMinScale;
        matrix.postScale(f, f);
        this.mTempRect.set(DEFAULT_ASPECT_RATIO, DEFAULT_ASPECT_RATIO, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        matrix.mapRect(this.mTempRect);
        matrix.postTranslate((((float) getMeasuredWidth()) - this.mCropRect.width()) / 2.0f, (((float) getMeasuredHeight()) - this.mCropRect.height()) / 2.0f);
        return matrix;
    }

    public float getMaxScale() {
        return this.mMaxScale;
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    public float getTargetAspectRatio() {
        return this.mTargetAspectRatio;
    }

    public boolean hasChanges() {
        return !getInitialMatrix().equals(this.mCurrentImageMatrix);
    }

    public boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    public void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.mTargetAspectRatio == DEFAULT_ASPECT_RATIO) {
                this.mTargetAspectRatio = intrinsicWidth / intrinsicHeight;
            }
            d44 d44 = this.initialCropState;
            if (d44 != null) {
                this.mTargetAspectRatio = d44.b;
            }
            z34 z34 = this.mCropBoundsChangeListener;
            if (z34 != null) {
                ((UCropView) z34).b.setTargetAspectRatio(this.mTargetAspectRatio);
            }
            f(intrinsicWidth, intrinsicHeight);
            this.mCurrentImageMatrix.set(getInitialMatrix());
            setImageMatrix(this.mCurrentImageMatrix);
            d44 d442 = this.initialCropState;
            if (d442 != null) {
                setupInitialCropState(d442);
                this.initialCropState = null;
            }
        }
    }

    public void postRotate(float f) {
        postRotate(f, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void postScale(float f) {
        postScale(f, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void processStyledAttributes(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(vnc.UCropView_ucrop_aspect_ratio_x, DEFAULT_ASPECT_RATIO));
        float abs2 = Math.abs(typedArray.getFloat(vnc.UCropView_ucrop_aspect_ratio_y, DEFAULT_ASPECT_RATIO));
        if (abs == DEFAULT_ASPECT_RATIO || abs2 == DEFAULT_ASPECT_RATIO) {
            this.mTargetAspectRatio = DEFAULT_ASPECT_RATIO;
        } else {
            this.mTargetAspectRatio = abs / abs2;
        }
    }

    public void resetCropState() {
        this.mTargetAspectRatio = DEFAULT_ASPECT_RATIO;
        onImageLaidOut();
    }

    public void setCropBoundsChangeListener(z34 z34) {
        this.mCropBoundsChangeListener = z34;
    }

    public void setCropRect(RectF rectF) {
        this.mTargetAspectRatio = rectF.width() / rectF.height();
        this.mCropRect.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        calculateImageScaleBounds();
    }

    public void setCropRectAdjustMatrix(RectF rectF, RectF rectF2) {
        this.mTempMatrix.reset();
        float currentScale = 1.0f / getCurrentScale();
        this.mTempMatrix.postScale(currentScale, currentScale);
        this.mTempRect.set(rectF);
        this.mTempMatrix.mapRect(this.mTempRect);
        float matrixValue = MatrixUtils.getMatrixValue(this.mCurrentImageMatrix, 2);
        float[] fArr = {matrixValue - rectF.left, MatrixUtils.getMatrixValue(this.mCurrentImageMatrix, 5) - rectF.top};
        this.mTempMatrix.mapPoints(fArr);
        float max = Math.max(rectF2.width() / this.mTempRect.width(), rectF2.height() / this.mTempRect.height()) / getCurrentScale();
        this.mCurrentImageMatrix.postScale(max, max, rectF2.centerX(), rectF2.centerY());
        Matrix matrix = this.mCurrentImageMatrix;
        matrix.postTranslate(-MatrixUtils.getMatrixValue(matrix, 2), -MatrixUtils.getMatrixValue(this.mCurrentImageMatrix, 5));
        this.mTempMatrix.reset();
        float currentScale2 = getCurrentScale();
        this.mTempMatrix.postScale(currentScale2, currentScale2);
        this.mTempMatrix.mapPoints(fArr);
        this.mCurrentImageMatrix.postTranslate(rectF2.left + fArr[0], rectF2.top + fArr[1]);
        setImageMatrix(this.mCurrentImageMatrix);
        this.mCropRect.set(rectF2);
        calculateImageScaleBounds();
        postInvalidateOnAnimation();
    }

    public void setImageToWrapCropBounds() {
        setImageToWrapCropBounds(true);
    }

    public void setImageUri(Uri uri, Uri uri2, d44 d44) throws Exception {
        super.setImageUri(uri, uri2);
        this.initialCropState = d44;
    }

    public void setMaxScaleMultiplier(float f) {
        this.mMaxScaleMultiplier = f;
    }

    public void zoomImageToPosition(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b44 b44 = new b44(this, j, currentScale, f - currentScale, f2, f3);
        this.mZoomImageToPositionRunnable = b44;
        post(b44);
    }

    public void zoomInImage(float f) {
        zoomInImage(f, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomOutImage(float f) {
        zoomOutImage(f, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public boolean isImageWrapCropBounds(float[] fArr) {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(copyOf);
        float[] n = fqc.n(this.mCropRect);
        this.mTempMatrix.mapPoints(n);
        return fqc.P(copyOf).contains(fqc.P(n));
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.mBitmapLaidOut && !isImageWrapCropBounds()) {
            float[] fArr = this.mCurrentImageCenter;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.mCropRect.centerX() - f5;
            float centerY = this.mCropRect.centerY() - f6;
            this.mTempMatrix.reset();
            this.mTempMatrix.setTranslate(centerX, centerY);
            float[] fArr2 = this.mCurrentImageCorners;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.mTempMatrix.mapPoints(copyOf);
            boolean isImageWrapCropBounds = isImageWrapCropBounds(copyOf);
            float f7 = DEFAULT_ASPECT_RATIO;
            if (isImageWrapCropBounds) {
                this.mTempMatrix.reset();
                this.mTempMatrix.setRotate(-getCurrentAngle());
                float[] fArr3 = this.mCurrentImageCorners;
                float[] copyOf2 = Arrays.copyOf(fArr3, fArr3.length);
                float[] n = fqc.n(this.mCropRect);
                this.mTempMatrix.mapPoints(copyOf2);
                this.mTempMatrix.mapPoints(n);
                RectF P = fqc.P(copyOf2);
                RectF P2 = fqc.P(n);
                float f8 = P.left - P2.left;
                float f9 = P.top - P2.top;
                float f10 = P.right - P2.right;
                float f11 = P.bottom - P2.bottom;
                if (f8 <= DEFAULT_ASPECT_RATIO) {
                    f8 = 0.0f;
                }
                if (f9 <= DEFAULT_ASPECT_RATIO) {
                    f9 = 0.0f;
                }
                if (f10 >= DEFAULT_ASPECT_RATIO) {
                    f10 = 0.0f;
                }
                if (f11 >= DEFAULT_ASPECT_RATIO) {
                    f11 = 0.0f;
                }
                float[] fArr4 = {f8, f9, f10, f11};
                this.mTempMatrix.reset();
                this.mTempMatrix.setRotate(getCurrentAngle());
                this.mTempMatrix.mapPoints(fArr4);
                f3 = -(fArr4[0] + fArr4[2]);
                f = f6;
                f2 = -(fArr4[1] + fArr4[3]);
                f4 = 0.0f;
            } else {
                RectF rectF = new RectF(this.mCropRect);
                this.mTempMatrix.reset();
                this.mTempMatrix.setRotate(getCurrentAngle());
                this.mTempMatrix.mapRect(rectF);
                float[] fArr5 = this.mCurrentImageCorners;
                f = f6;
                RectF rectF2 = rectF;
                float[] fArr6 = {(float) Math.sqrt(Math.pow((double) (fArr5[1] - fArr5[3]), 2.0d) + Math.pow((double) (fArr5[0] - fArr5[2]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr5[3] - fArr5[5]), 2.0d) + Math.pow((double) (fArr5[2] - fArr5[4]), 2.0d))};
                f7 = (Math.max(rectF2.width() / fArr6[0], rectF2.height() / fArr6[1]) * currentScale) - currentScale;
                f3 = centerX;
                f2 = centerY;
                f4 = DEFAULT_ASPECT_RATIO;
            }
            if (f7 != f4) {
                this.mMinScale = currentScale + f7;
            }
            if (z) {
                a44 a44 = new a44(this, f5, f, f3, f2, currentScale, f7, isImageWrapCropBounds);
                this.mWrapCropBoundsRunnable = a44;
                post(a44);
                return;
            }
            postTranslate(f3, f2);
            if (!isImageWrapCropBounds) {
                zoomInImage(currentScale + f7, this.mCropRect.centerX(), this.mCropRect.centerY());
            }
        }
    }

    public void zoomInImage(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    public void zoomOutImage(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    public void crop(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) throws IOException {
        d44 cropState = getCropState();
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalStateException("bitmap recycled or null");
        }
        Matrix matrix = new Matrix();
        matrix.setValues(cropState.c);
        Matrix matrix2 = new Matrix();
        matrix2.set(matrix);
        float matrixScale = 1.0f / MatrixUtils.getMatrixScale(matrix);
        matrix2.postScale(matrixScale, matrixScale, DEFAULT_ASPECT_RATIO, DEFAULT_ASPECT_RATIO);
        matrix2.postTranslate(-MatrixUtils.getMatrixValue(matrix2, 2), -MatrixUtils.getMatrixValue(matrix2, 5));
        RectF rectF = cropState.a;
        matrix2.mapRect(rectF);
        matrix2.postTranslate(-rectF.left, -rectF.top);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix2, (Paint) null);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            createBitmap.compress(compressFormat, 100, fileOutputStream);
            createBitmap.recycle();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
