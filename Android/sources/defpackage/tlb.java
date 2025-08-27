package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* renamed from: tlb  reason: default package */
public final class tlb extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public float A0;
    public ValueAnimator B0;
    public AnimatorSet C0;
    public fof D0;
    public final ScaleGestureDetector a;
    public slb b = slb.b;
    public float c;
    public float o = 1.0f;
    public float v;
    public float v0;
    public float w;
    public float w0;
    public boolean x;
    public float x0;
    public final Paint y;
    public float y0;
    public final Rect z;
    public float z0;

    public tlb(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.y = paint;
        this.z = new Rect();
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final slb getStateByScale() {
        slb slb = this.b;
        slb slb2 = slb.b;
        if (slb == slb2) {
            float f = (float) 1;
            return this.o > i2a.f(this.w, f, 0.25f, f) ? slb.a : slb2;
        }
        float f2 = this.o;
        float f3 = this.w;
        return f2 < f3 - ((f3 - ((float) 1)) * 0.25f) ? slb2 : slb.a;
    }

    private final View getVideoView() {
        Object obj;
        z69 z69 = new z69(1, this);
        while (true) {
            if (!z69.hasNext()) {
                obj = null;
                break;
            }
            obj = z69.next();
            if (((View) obj) instanceof h9g) {
                break;
            }
        }
        return (View) obj;
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.z0, this.A0);
        float f = this.o;
        canvas.scale(f, f, this.v0, this.w0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.x) {
            canvas.drawRect(this.z, this.y);
        }
    }

    public final fof getTouchEventDelegate() {
        return this.D0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fof fof = this.D0;
        if (fof != null) {
            ((nr4) fof).d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return this.D0 != null && motionEvent.getPointerCount() <= 1;
        }
        return true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView != null) {
            int measuredHeight = videoView.getMeasuredHeight();
            int measuredWidth = videoView.getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
                float f = (float) measuredWidth2;
                float f2 = (float) measuredHeight2;
                float f3 = (float) measuredWidth;
                float f4 = (float) measuredHeight;
                float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
                this.w = f5;
                this.v = f5 * 4.0f;
                this.z.set(0, 0, measuredWidth2, measuredHeight2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.o = scaleFactor;
        this.o = (float) Math.min((double) this.v, Math.max(0.8999999761581421d, (double) scaleFactor));
        if (getStateByScale() == slb.a && this.b == slb.b) {
            this.y.setAlpha(HttpStatus.SC_PROCESSING);
            this.x = true;
        } else {
            this.x = false;
        }
        invalidate();
        this.z0 = scaleGestureDetector.getFocusX() - this.x0;
        this.A0 = scaleGestureDetector.getFocusY() - this.y0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.o;
        if (this.b == slb.b) {
            this.v0 = scaleGestureDetector.getFocusX();
            this.w0 = scaleGestureDetector.getFocusY();
        }
        this.x0 = scaleGestureDetector.getFocusX();
        this.y0 = scaleGestureDetector.getFocusY();
        if (this.B0 != null) {
            this.B0 = null;
            this.x = false;
        }
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.C0 = null;
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimator;
        ArrayList arrayList = new ArrayList();
        slb stateByScale = getStateByScale();
        slb slb = slb.a;
        if (stateByScale == slb && this.b == slb.b) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, c44.DEFAULT_ASPECT_RATIO});
            ofFloat.setDuration(600);
            ofFloat.addUpdateListener(new rlb(this, 0));
            arrayList.add(ofFloat);
            this.B0 = ofFloat;
        }
        if (getStateByScale() == slb) {
            this.b = slb;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, this.w});
        } else {
            this.b = slb.b;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, 1.0f});
        }
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new rlb(this, 1));
        arrayList.add(valueAnimator);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.v0, ((float) getWidth()) / 2.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new rlb(this, 2));
        arrayList.add(ofFloat2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{this.w0, ((float) getHeight()) / 2.0f});
        ofFloat3.setDuration(300);
        ofFloat3.addUpdateListener(new rlb(this, 3));
        arrayList.add(ofFloat3);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{this.z0, 0.0f});
        ofFloat4.setDuration(300);
        ofFloat4.addUpdateListener(new rlb(this, 4));
        arrayList.add(ofFloat4);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{this.A0, 0.0f});
        ofFloat5.setDuration(300);
        ofFloat5.addUpdateListener(new rlb(this, 5));
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.C0 = animatorSet;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        fof fof = this.D0;
        if (fof != null) {
            nr4 nr4 = (nr4) fof;
            Rect rect = (Rect) nr4.j;
            ((FrameLayout) nr4.c).getHitRect(rect);
            int x2 = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x2 >= i2 && x2 <= rect.centerX() - i3) {
                ((GestureDetector) ((cs) nr4.g).o).onTouchEvent(motionEvent);
            } else if (x2 < rect.centerX() + i3 || x2 > rect.right) {
                ((GestureDetector) nr4.h).onTouchEvent(motionEvent);
            } else {
                ((GestureDetector) ((cs) nr4.f).o).onTouchEvent(motionEvent);
            }
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            View videoView = getVideoView();
            if (videoView != null) {
                videoView.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void setTouchEventDelegate(fof fof) {
        this.D0 = fof;
    }
}
