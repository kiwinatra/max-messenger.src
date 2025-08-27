package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: h4e  reason: default package */
public final class h4e {
    public static final int[] i = new int[3];
    public static final float[] j = {c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g = new Path();
    public final Paint h;

    public h4e() {
        Paint paint = new Paint();
        this.h = paint;
        this.a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.d = w53.h(i2, 68);
        this.e = w53.h(i2, 20);
        this.f = w53.h(i2, 0);
        this.a.setColor(this.d);
    }
}
