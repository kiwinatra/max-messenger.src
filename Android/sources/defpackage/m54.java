package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: m54  reason: default package */
public final class m54 extends bh8 {
    public static final /* synthetic */ int I0 = 0;
    public l54 H0;

    public m54(l54 l54) {
        super((ah8) l54);
        this.H0 = l54;
    }

    public final void g(Canvas canvas) {
        if (this.H0.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.H0.v);
        super.g(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.H0 = new l54(this.H0);
        return this;
    }

    public final void r(float f, float f2, float f3, float f4) {
        RectF rectF = this.H0.v;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
