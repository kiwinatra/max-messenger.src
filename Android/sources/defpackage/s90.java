package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* renamed from: s90  reason: default package */
public final class s90 extends qb6 implements Runnable {
    public int v;
    public boolean w;
    public float x;
    public boolean y;

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.x;
        if (!this.w) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) ((i3 / 2) + i2), (float) ((i6 / 2) + i5));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.y) {
            this.y = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public final void run() {
        this.y = false;
        this.x += (float) ((int) ((20.0f / ((float) this.v)) * 360.0f));
        invalidateSelf();
    }
}
