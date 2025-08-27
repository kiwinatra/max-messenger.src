package ru.ok.messages.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.apache.http.HttpStatus;

public class PinchToZoomVideoViewWrapper extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final /* synthetic */ int I0 = 0;
    public float A0;
    public float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public ValueAnimator E0;
    public ValueAnimator F0;
    public ValueAnimator G0;
    public ValueAnimator H0;
    public final ScaleGestureDetector a;
    public final nd b = ((qra) ym.e()).c();
    public qlb c = qlb.b;
    public float o;
    public float v = 1.0f;
    public final Rect v0;
    public float w;
    public float w0;
    public float x;
    public float x0;
    public boolean y = false;
    public float y0;
    public final Paint z;
    public float z0;

    public PinchToZoomVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.z = paint;
        this.v0 = new Rect();
        paint.setColor(-1);
        getContext();
        paint.setStrokeWidth((float) ro4.b().z);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private qlb getStateByScale() {
        qlb qlb = this.c;
        qlb qlb2 = qlb.b;
        qlb qlb3 = qlb.a;
        if (qlb == qlb2) {
            return this.v > i2a.f(this.x, 1.0f, 0.25f, 1.0f) ? qlb3 : qlb2;
        }
        float f = this.v;
        float f2 = this.x;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? qlb2 : qlb3;
    }

    private View getVideoView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VideoView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Wrapper should contains VideoView");
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A0, this.B0);
        float f = this.v;
        canvas.scale(f, f, this.w0, this.x0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.y) {
            canvas.drawRect(this.v0, this.z);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.C0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.E0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.F0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.G0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.H0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getVideoView().getMeasuredHeight();
        int measuredWidth = getVideoView().getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
            float f = (float) measuredWidth2;
            float f2 = (float) measuredHeight2;
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            if (f3 / f4 > f / f2) {
                this.x = f2 / f4;
            } else {
                this.x = f / f3;
            }
            this.w = this.x * 4.0f;
            this.v0.set(0, 0, measuredWidth2, measuredHeight2);
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.o;
        this.v = scaleFactor;
        this.v = Math.min(this.w, Math.max(0.9f, scaleFactor));
        if (getStateByScale() == qlb.a && this.c == qlb.b) {
            this.z.setAlpha(HttpStatus.SC_PROCESSING);
            this.y = true;
        } else {
            this.y = false;
        }
        invalidate();
        this.A0 = scaleGestureDetector.getFocusX() - this.y0;
        this.B0 = scaleGestureDetector.getFocusY() - this.z0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.o = this.v;
        if (this.c == qlb.b) {
            this.w0 = scaleGestureDetector.getFocusX();
            this.x0 = scaleGestureDetector.getFocusY();
        }
        this.y0 = scaleGestureDetector.getFocusX();
        this.z0 = scaleGestureDetector.getFocusY();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C0 = null;
        }
        ValueAnimator valueAnimator2 = this.D0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.D0 = null;
            this.y = false;
        }
        ValueAnimator valueAnimator3 = this.E0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.F0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.G0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.H0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        qlb stateByScale = getStateByScale();
        qlb qlb = qlb.a;
        qlb qlb2 = qlb.b;
        if (stateByScale == qlb && this.c == qlb2) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, c44.DEFAULT_ASPECT_RATIO}).setDuration(600);
            this.D0 = duration;
            duration.addUpdateListener(new plb(this, 0));
            this.D0.start();
        }
        if (getStateByScale() == qlb) {
            this.c = qlb;
            this.C0 = ValueAnimator.ofFloat(new float[]{this.v, this.x});
        } else {
            this.c = qlb2;
            this.C0 = ValueAnimator.ofFloat(new float[]{this.v, 1.0f});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scaleType", this.c.toString());
        hashMap.put("orientation", Integer.valueOf(hd8.K(getContext())));
        this.b.g("PINCH_TO_ZOOM", hashMap);
        this.C0.setDuration(300).addUpdateListener(new plb(this, 1));
        this.C0.start();
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{this.w0, (float) (getWidth() / 2)}).setDuration(300);
        this.E0 = duration2;
        duration2.addUpdateListener(new plb(this, 2));
        this.E0.start();
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{this.x0, (float) (getHeight() / 2)}).setDuration(300);
        this.F0 = duration3;
        duration3.addUpdateListener(new plb(this, 3));
        this.F0.start();
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{this.A0, 0.0f}).setDuration(300);
        this.G0 = duration4;
        duration4.addUpdateListener(new plb(this, 4));
        this.G0.start();
        ValueAnimator duration5 = ValueAnimator.ofFloat(new float[]{this.B0, 0.0f}).setDuration(300);
        this.H0 = duration5;
        duration5.addUpdateListener(new plb(this, 5));
        this.H0.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getVideoView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
