package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: cv4  reason: default package */
public final class cv4 extends qb6 {
    public final Drawable v;

    public cv4(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.v = drawable2;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.v;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        super.draw(canvas);
    }
}
