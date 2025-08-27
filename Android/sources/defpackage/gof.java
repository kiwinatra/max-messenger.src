package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: gof  reason: default package */
public final class gof extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, i5b {
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final vge c;
    public final float o;
    public final GestureDetector v;
    public volatile float w;

    public gof(Context context, vge vge) {
        this.c = vge;
        this.o = 25.0f;
        this.v = new GestureDetector(context, this);
        this.w = 3.1415927f;
    }

    public final void a(float[] fArr, float f) {
        this.w = -f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.o;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.o;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.w;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        vge vge = this.c;
        PointF pointF3 = this.b;
        synchronized (vge) {
            float f5 = pointF3.y;
            vge.x = f5;
            Matrix.setRotateM(vge.v, 0, -f5, (float) Math.cos((double) vge.y), (float) Math.sin((double) vge.y), c44.DEFAULT_ASPECT_RATIO);
            Matrix.setRotateM(vge.w, 0, -pointF3.x, c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO);
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.Y.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.v.onTouchEvent(motionEvent);
    }
}
