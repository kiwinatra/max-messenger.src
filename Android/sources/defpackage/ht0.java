package defpackage;

import android.graphics.Bitmap;

/* renamed from: ht0  reason: default package */
public final class ht0 extends gk0 implements lo0 {
    public ht0(u9a u9a, pqb pqb, v9a v9a) {
        super(u9a, pqb, v9a);
        this.X = false;
        u9a.getClass();
        v9a.getClass();
    }

    public final Object a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    public final void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    public final int f(int i) {
        return i;
    }

    public final int g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    public final int h(int i) {
        return i;
    }

    public final Object i(ft0 ft0) {
        Bitmap bitmap = (Bitmap) super.i(ft0);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    public final boolean k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
