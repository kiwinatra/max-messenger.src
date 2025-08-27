package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.KotlinVersion;

public class HorizontalProgressWheelView extends View {
    public final Rect a = new Rect();
    public float b;
    public final Paint c;
    public final Paint o;
    public final int v = getContext().getResources().getDimensionPixelSize(kec.ucrop_width_horizontal_wheel_progress_line);
    public int v0 = fw3.a(getContext(), sdc.ucrop_color_widget_rotate_mid_line);
    public final int w = getContext().getResources().getDimensionPixelSize(kec.ucrop_height_horizontal_wheel_progress_line);
    public final int x = getContext().getResources().getDimensionPixelSize(kec.ucrop_margin_horizontal_wheel_progress_line);
    public boolean y;
    public float z;

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth((float) this.v);
        this.c.setColor(getResources().getColor(sdc.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.c);
        this.o = paint2;
        paint2.setColor(this.v0);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(kec.ucrop_width_middle_wheel_progress_line));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.a;
        canvas.getClipBounds(rect);
        int width = rect.width();
        int i = this.v;
        int i2 = this.x;
        int i3 = width / (i + i2);
        float f = this.z % ((float) (i2 + i));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.c.setAlpha((int) ((((float) i4) / ((float) i5)) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.c.setAlpha((int) ((((float) (i3 - i4)) / ((float) i5)) * 255.0f));
            } else {
                this.c.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            float f2 = -f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(((float) rect.left) + f2 + ((float) ((this.v + this.x) * i4)), ((float) rect.centerY()) - (((float) this.w) / 4.0f), f2 + ((float) rect.left) + ((float) ((this.v + this.x) * i4)), (((float) this.w) / 4.0f) + ((float) rect.centerY()), this.c);
        }
        float centerX = (float) rect.centerX();
        float centerY = ((float) rect.centerY()) - (((float) this.w) / 2.0f);
        Canvas canvas3 = canvas;
        float f3 = centerY;
        canvas3.drawLine(centerX, f3, (float) rect.centerX(), (((float) this.w) / 2.0f) + ((float) rect.centerY()), this.o);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
        } else if (action != 1 && action == 2) {
            float x2 = motionEvent.getX() - this.b;
            if (x2 != c44.DEFAULT_ASPECT_RATIO) {
                if (!this.y) {
                    this.y = true;
                }
                this.z -= x2;
                postInvalidate();
                this.b = motionEvent.getX();
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i) {
        this.v0 = i;
        invalidate();
    }

    public void setScrollingListener(o27 o27) {
    }
}
