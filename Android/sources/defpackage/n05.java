package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* renamed from: n05  reason: default package */
public final class n05 extends View implements i05, ScaleGestureDetector.OnScaleGestureListener {
    public ArrayList a;
    public ScaleGestureDetector b;
    public m05 c;
    public Matrix o;
    public Matrix v;
    public Rect v0;
    public Float w;
    public boolean w0;
    public Float x;
    public l05 x0;
    public float[] y;
    public float z;

    private Matrix getCorrectionMatrix() {
        Matrix matrix;
        float f;
        float f2;
        Matrix matrix2 = this.o;
        float[] fArr = this.y;
        matrix2.getValues(fArr);
        float f3 = fArr[0];
        if (f3 < 1.0f) {
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, 1.0f, 0.5f, 0.5f);
            return matrix3;
        }
        if (f3 > this.z) {
            matrix = new Matrix(matrix2);
            float f4 = this.z / f3;
            matrix.postScale(f4, f4, (float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
        } else {
            matrix = null;
        }
        RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        if (matrix != null) {
            matrix.mapRect(rectF);
        } else {
            matrix2.mapRect(rectF);
        }
        if (rectF.right < ((float) getMeasuredWidth())) {
            f = ((float) getMeasuredWidth()) - rectF.right;
        } else {
            float f5 = rectF.left;
            f = f5 > c44.DEFAULT_ASPECT_RATIO ? -f5 : 0.0f;
        }
        if (rectF.bottom < ((float) getMeasuredHeight())) {
            f2 = ((float) getMeasuredHeight()) - rectF.bottom;
        } else {
            float f6 = rectF.top;
            f2 = f6 > c44.DEFAULT_ASPECT_RATIO ? -f6 : 0.0f;
        }
        if (!(f == c44.DEFAULT_ASPECT_RATIO && f2 == c44.DEFAULT_ASPECT_RATIO)) {
            if (matrix == null) {
                matrix = new Matrix(matrix2);
            }
            matrix.postTranslate(f, f2);
        }
        return matrix;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.concat(this.o);
        Rect rect = this.v0;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((g05) it.next()).draw(canvas);
        }
        canvas.restore();
    }

    public Rect getBounds() {
        Rect rect = this.v0;
        return rect != null ? rect : new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public List<g05> getLayers() {
        return Collections.unmodifiableList(this.a);
    }

    public Rect getResultBounds() {
        l05 l05;
        Rect rect = this.v0;
        if (rect == null) {
            rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.w0 && (l05 = this.x0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) l05;
            editorSurfaceViewContainer.getClass();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            int i4 = rect.bottom;
            int i5 = rect.top;
            if (i4 - i5 >= i3) {
                rect.top = editorSurfaceViewContainer.a.getHeight() + i5;
                rect.bottom -= editorSurfaceViewContainer.b.getHeight();
            } else {
                rect.left = editorSurfaceViewContainer.a.getWidth() + i2;
                rect.right -= editorSurfaceViewContainer.b.getWidth();
            }
        }
        return rect;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Matrix matrix = this.o;
        matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
        Float f = this.w;
        if (!(f == null || this.x == null)) {
            matrix.postTranslate(focusX - f.floatValue(), focusY - this.x.floatValue());
        }
        matrix.invert(this.v);
        this.w = Float.valueOf(focusX);
        this.x = Float.valueOf(focusY);
        invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        m05 m05 = this.c;
        if (m05 == null) {
            return true;
        }
        j05 j05 = (j05) m05;
        xe8 xe8 = j05.c;
        if (xe8 != null) {
            xe8.k().a(j05.a);
        }
        j05.c = null;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.w = null;
        this.x = null;
        Matrix correctionMatrix = getCorrectionMatrix();
        if (correctionMatrix != null) {
            Matrix matrix = this.o;
            float[] fArr = this.y;
            matrix.getValues(fArr);
            float[] fArr2 = new float[9];
            correctionMatrix.getValues(fArr2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            ofFloat.addUpdateListener(new k05(this, new float[9], fArr, fArr2, 0));
            ofFloat.addListener(new wh(this, fArr2, false, 4));
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l05 l05;
        m05 m05;
        if (this.w0 && (l05 = this.x0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) l05;
            editorSurfaceViewContainer.getClass();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            View view = editorSurfaceViewContainer.a;
            Rect rect = editorSurfaceViewContainer.v;
            view.getHitRect(rect);
            View view2 = editorSurfaceViewContainer.b;
            Rect rect2 = editorSurfaceViewContainer.w;
            view2.getHitRect(rect2);
            if (rect.contains(x2, y2) || rect2.contains(x2, y2)) {
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (m05 = this.c) != null) {
                    ((j05) m05).c(motionEvent);
                }
                return true;
            }
        }
        this.b.onTouchEvent(motionEvent);
        if (!(this.c == null || motionEvent == null || this.b.isInProgress())) {
            motionEvent.transform(this.v);
            ((j05) this.c).c(motionEvent);
        }
        return true;
    }

    public void setBoundingListener(l05 l05) {
        this.x0 = l05;
    }

    public void setBounds(Rect rect) {
        this.v0 = rect;
        invalidate();
    }

    public void setDrawStickerEnabled(boolean z2) {
        if (z2 != this.w0) {
            this.w0 = z2;
            l05 l05 = this.x0;
            if (l05 != null) {
                l05.setDrawStickerEnabled(z2);
            }
        }
    }

    public void setListener(m05 m05) {
        this.c = m05;
    }

    public void setMaxZoom(float f) {
        this.z = f;
    }
}
