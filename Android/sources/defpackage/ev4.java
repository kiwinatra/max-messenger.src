package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: ev4  reason: default package */
public final class ev4 extends qb6 {
    public final Drawable v;
    public final int w;
    public final int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev4(Drawable drawable, Drawable drawable2) {
        super(drawable);
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        this.v = drawable2;
        this.w = intrinsicWidth;
        this.x = intrinsicHeight;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int centerX = getBounds().centerX();
        int i = this.w;
        int centerY = getBounds().centerY();
        int i2 = this.x;
        Drawable drawable = this.v;
        drawable.setBounds(centerX - (i / 2), centerY - (i2 / 2), (i / 2) + getBounds().centerX(), (i2 / 2) + getBounds().centerY());
        drawable.draw(canvas);
    }
}
