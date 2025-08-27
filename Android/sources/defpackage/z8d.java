package defpackage;

import android.graphics.Canvas;

/* renamed from: z8d  reason: default package */
public final class z8d extends y8d {
    public final void draw(Canvas canvas) {
        tf6.P();
        if (this.b || this.c || this.o > c44.DEFAULT_ASPECT_RATIO) {
            f();
            d();
            canvas.clipPath(this.v);
            super.draw(canvas);
            tf6.P();
            return;
        }
        super.draw(canvas);
        tf6.P();
    }
}
