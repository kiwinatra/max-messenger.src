package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import kotlin.jvm.internal.IntCompanionObject;

public class BrushWidthViewImpl extends View implements ns0 {
    public final boolean A0 = false;
    public final HashSet B0 = new HashSet();
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint o;
    public final int v;
    public float v0;
    public final float w;
    public float w0;
    public float x;
    public boolean x0;
    public float y;
    public float y0;
    public float z;
    public float z0;

    public BrushWidthViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
        this.x = (float) hd8.n(2, getContext());
        this.w = (float) hd8.n(11, getContext());
        this.y0 = (float) hd8.n(2, getContext());
        this.z0 = (float) hd8.n(32, getContext());
        this.v = hd8.n(1, getContext());
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStrokeWidth(this.x);
        this.a.setAntiAlias(true);
        this.a.setShadowLayer((float) hd8.n(2, getContext()), c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, IntCompanionObject.MIN_VALUE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setShadowLayer((float) hd8.n(3, getContext()), c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, IntCompanionObject.MIN_VALUE);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-1);
        this.c.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.o = paint4;
        paint4.setColor(-1);
        this.o.setAntiAlias(true);
        this.o.setShadowLayer((float) hd8.n(3, getContext()), c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, IntCompanionObject.MIN_VALUE);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.A0 = true;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.A0) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
        }
        float f = this.y;
        canvas.drawLine(f, this.v0, f, this.w0, this.a);
        float f2 = this.z;
        float f3 = this.w0;
        float f4 = this.v0;
        float f5 = this.y0;
        float f6 = (((this.z0 - f5) * ((f3 - f2) / (f3 - f4))) + f5) / 2.0f;
        canvas.drawCircle(this.y - (this.w * 3.0f), f2, ((float) this.v) + f6, this.o);
        canvas.drawCircle(this.y - (this.w * 3.0f), this.z, f6, this.c);
        canvas.drawCircle(this.y, this.z, this.w, this.b);
        if (this.A0) {
            canvas.restore();
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        if (this.y == c44.DEFAULT_ASPECT_RATIO) {
            this.y = (float) (((double) width) * 0.8d);
            double d = (double) height;
            this.v0 = (float) (0.1d * d);
            float f = (float) (d * 0.9d);
            this.w0 = f;
            this.z = f;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        if (this.A0) {
            x2 = ((float) getWidth()) - x2;
        }
        if (motionEvent.getAction() == 0) {
            float f = this.y;
            float f2 = this.w;
            if (x2 > f - (f2 * 2.0f) && x2 < (f2 * 2.0f) + f && motionEvent.getY() > this.v0 - (this.w * 2.0f)) {
                if (motionEvent.getY() < (this.w * 2.0f) + this.w0) {
                    this.x0 = true;
                }
            }
        }
        if (motionEvent.getAction() != 2 || !this.x0) {
            if (motionEvent.getAction() == 1 && this.x0) {
                this.x0 = false;
                post(new b(18, (Object) this));
            }
            return true;
        }
        float f3 = this.z;
        float y2 = motionEvent.getY();
        float f4 = this.v0;
        if (y2 < f4) {
            this.z = f4;
        } else {
            float y3 = motionEvent.getY();
            float f5 = this.w0;
            if (y3 > f5) {
                this.z = f5;
            } else {
                this.z = motionEvent.getY();
            }
        }
        if (this.z != f3) {
            invalidate();
        }
        return true;
    }

    public void setBrushWidth(float f) {
        post(new os0(this, f));
    }

    public void setMaxBrushWidth(float f) {
        this.z0 = f;
    }

    public void setMinBrushWidth(float f) {
        this.y0 = f;
    }

    public void setPreviewColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setSeekBarLineColor(int i) {
        this.a.setColor(i);
    }

    public void setSeekBarLineWidth(float f) {
        this.x = f;
    }

    public void setSeekBarToggleColor(int i) {
        this.b.setColor(i);
    }
}
