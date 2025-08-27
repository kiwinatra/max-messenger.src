package defpackage;

import android.graphics.Canvas;
import android.widget.FrameLayout;

/* renamed from: c6f  reason: default package */
public abstract class c6f extends FrameLayout {
    public int a;
    public int b;

    static {
        qw6 qw6 = qw6.VIRTUAL_KEY;
    }

    public final boolean a() {
        return Math.abs(c44.DEFAULT_ASPECT_RATIO) > ((float) ((this.b / 3) * 2));
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int getDirection() {
        return this.a;
    }

    public final boolean performClick() {
        if (c44.DEFAULT_ASPECT_RATIO == c44.DEFAULT_ASPECT_RATIO) {
            return super.performClick();
        }
        return false;
    }

    public final boolean performLongClick() {
        if (c44.DEFAULT_ASPECT_RATIO == c44.DEFAULT_ASPECT_RATIO) {
            return super.performLongClick();
        }
        return false;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setDirection(int i) {
        this.a = i;
        ct.b(this);
        if (ct.y(getContext())) {
            int i2 = this.a;
            if (i2 == 0) {
                this.a = 1;
            } else if (i2 == 1) {
                this.a = 0;
            }
        }
    }

    public void setSwipeLimit(int i) {
        this.b = i;
    }

    public void setSwipeListener(b6f b6f) {
    }
}
