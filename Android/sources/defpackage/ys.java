package defpackage;

import android.graphics.Bitmap;

/* renamed from: ys  reason: default package */
public final class ys extends ynb {
    public final lo0 a;
    public final b8d b;

    public ys(lo0 lo0, b8d b8d) {
        this.a = lo0;
        this.b = b8d;
    }

    public final y33 c(int i, int i2, Bitmap.Config config) {
        int c = vo0.c(i, i2, config);
        lo0 lo0 = this.a;
        Bitmap bitmap = (Bitmap) lo0.get(c);
        if (bitmap.getAllocationByteCount() >= vo0.b(config) * i * i2) {
            bitmap.reconfigure(i, i2, config);
            return y33.q0(bitmap, lo0, (u6h) this.b.a);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
