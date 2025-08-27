package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;

/* renamed from: de9  reason: default package */
public final class de9 extends Drawable {
    public final Paint a;
    public final /* synthetic */ fe9 b;

    public de9(fe9 fe9) {
        this.b = fe9;
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        Context context = fe9.getContext();
        Lazy lazy = scf.b0;
        paint.setColor(j4b.k0(context).l);
    }

    public final void draw(Canvas canvas) {
        fe9 fe9 = this.b;
        boolean z = ct.z(fe9);
        Paint paint = this.a;
        if (z) {
            int i = getBounds().right;
            int i2 = fe9.a.b;
            canvas.drawRect((float) (i - i2), (float) i2, (float) getBounds().right, (float) getBounds().bottom, paint);
            return;
        }
        int i3 = fe9.a.b;
        canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, (float) i3, (float) i3, (float) getBounds().bottom, paint);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
