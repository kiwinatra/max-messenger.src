package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: q45  reason: default package */
public final class q45 extends Drawable {
    public final Rect a = new Rect();

    public final void draw(Canvas canvas) {
    }

    public final int getIntrinsicWidth() {
        return 0;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void invalidateSelf() {
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(Rect rect) {
        Rect rect2 = this.a;
        rect2.set(rect);
        rect2.right = 0;
        super.setBounds(rect2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
