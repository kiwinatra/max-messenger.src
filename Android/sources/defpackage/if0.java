package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: if0  reason: default package */
public final class if0 implements g05 {
    public final Drawable a;
    public final Rect b = new Rect();
    public int c;
    public int d;

    public if0(Drawable drawable) {
        this.a = drawable;
        this.c = drawable.getIntrinsicWidth();
        this.d = drawable.getIntrinsicHeight();
    }

    public static void a(if0 if0, int i, int i2, Rect rect) {
        int i3;
        int i4 = if0.d;
        int i5 = if0.c;
        int i6 = (int) ((((float) i4) / ((float) i5)) * ((float) i));
        if (i6 > i2) {
            i3 = (int) ((((float) i5) / ((float) i4)) * ((float) i2));
            i6 = i2;
        } else {
            i3 = i;
        }
        int i7 = (int) (((float) (i2 - i6)) / 2.0f);
        int i8 = (int) (((float) (i - i3)) / 2.0f);
        rect.set(i8, i7, i3 + i8, i6 + i7);
    }

    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect rect = this.b;
        a(this, width, height, rect);
        Drawable drawable = this.a;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
