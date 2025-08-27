package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.task.a;
import com.yalantis.ucrop.util.MatrixUtils;

/* renamed from: frf  reason: default package */
public abstract class frf extends AppCompatImageView {
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    private static final String TAG = "TransformImageView";
    protected boolean mBitmapDecoded = false;
    protected boolean mBitmapLaidOut = false;
    protected final float[] mCurrentImageCenter = new float[2];
    protected final float[] mCurrentImageCorners = new float[8];
    protected Matrix mCurrentImageMatrix = new Matrix();
    /* access modifiers changed from: private */
    public ta5 mExifInfo;
    /* access modifiers changed from: private */
    public String mImageInputPath;
    /* access modifiers changed from: private */
    public String mImageOutputPath;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues = new float[9];
    private int mMaxBitmapSize = 0;
    protected int mThisHeight;
    protected int mThisWidth;
    protected erf mTransformImageListener;
    private float minImageSize;

    public frf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void flipHorizontally(float f, float f2) {
        this.mCurrentImageMatrix.postScale(-1.0f, 1.0f, f, f2);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public float getCurrentAngle() {
        return MatrixUtils.getMatrixAngle(this.mCurrentImageMatrix);
    }

    public float[] getCurrentImageCorners() {
        return this.mCurrentImageCorners;
    }

    public Matrix getCurrentImageMatrix() {
        return this.mCurrentImageMatrix;
    }

    public float[] getCurrentMatrixValues() {
        this.mCurrentImageMatrix.getValues(this.mMatrixValues);
        return this.mMatrixValues;
    }

    public float getCurrentScale() {
        return MatrixUtils.getMatrixScale(this.mCurrentImageMatrix);
    }

    public ta5 getExifInfo() {
        return this.mExifInfo;
    }

    public float[] getImageCornersForMatrix(Matrix matrix) {
        float[] fArr = this.mInitialImageCorners;
        float[] fArr2 = new float[fArr.length];
        matrix.mapPoints(fArr2, fArr);
        return fArr2;
    }

    public String getImageInputPath() {
        return this.mImageInputPath;
    }

    public String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public float[] getInitialImageCorners() {
        return this.mInitialImageCorners;
    }

    public int getMaxBitmapSize() {
        if (this.mMaxBitmapSize <= 0) {
            this.mMaxBitmapSize = vzg.d(getContext());
        }
        return this.mMaxBitmapSize;
    }

    public float getMinOverlaySize() {
        if (this.minImageSize == c44.DEFAULT_ASPECT_RATIO) {
            return Float.MAX_VALUE;
        }
        return getCurrentScale() * this.minImageSize;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof eh5)) {
            return null;
        }
        return ((eh5) getDrawable()).b;
    }

    public abstract void init();

    public void onImageLaidOut() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)});
            RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, intrinsicWidth, intrinsicHeight);
            this.mInitialImageCorners = fqc.n(rectF);
            this.mInitialImageCenter = new float[]{rectF.centerX(), rectF.centerY()};
            this.mBitmapLaidOut = true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.mThisWidth = (getWidth() - getPaddingRight()) - paddingLeft;
            this.mThisHeight = (getHeight() - getPaddingBottom()) - paddingTop;
            onImageLaidOut();
        }
    }

    public void postRotate(float f, float f2, float f3) {
        if (f != c44.DEFAULT_ASPECT_RATIO) {
            this.mCurrentImageMatrix.postRotate(f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
        }
    }

    public void postScale(float f, float f2, float f3) {
        if (f != c44.DEFAULT_ASPECT_RATIO) {
            this.mCurrentImageMatrix.postScale(f, f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
        }
    }

    public void postTranslate(float f, float f2) {
        if (f != c44.DEFAULT_ASPECT_RATIO || f2 != c44.DEFAULT_ASPECT_RATIO) {
            this.mCurrentImageMatrix.postTranslate(f, f2);
            setImageMatrix(this.mCurrentImageMatrix);
        }
    }

    public void printMatrix(String str, Matrix matrix) {
        MatrixUtils.getMatrixValue(matrix, 2);
        MatrixUtils.getMatrixValue(matrix, 5);
        MatrixUtils.getMatrixScale(matrix);
        MatrixUtils.getMatrixAngle(matrix);
    }

    public void setCurrentMatrixValues(float[] fArr) {
        this.mCurrentImageMatrix.setValues(fArr);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new eh5(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        try {
            this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
            this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
        } catch (Exception unused) {
        }
    }

    public void setImageUri(Uri uri, Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        new a(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new rt6(1, (Object) this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void setMaxBitmapSize(int i) {
        this.mMaxBitmapSize = i;
    }

    public void setMinImageSize(float f) {
        this.minImageSize = f;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(erf erf) {
    }
}
