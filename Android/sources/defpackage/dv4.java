package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: dv4  reason: default package */
public final class dv4 extends qb6 {
    public final int v;

    public dv4(Drawable drawable, int i, int i2, int i3, boolean z) {
        super(new fv4(drawable, i3, 0, i2, 0, z));
        this.v = i;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(c44.DEFAULT_ASPECT_RATIO, (((float) (canvas.getHeight() - getIntrinsicHeight())) / 4.0f) - ((float) this.v));
        super.draw(canvas);
        canvas.restore();
    }
}
