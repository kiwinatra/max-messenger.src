package defpackage;

import android.graphics.Bitmap;

/* renamed from: sx4  reason: default package */
public final class sx4 implements lo0 {
    public final void b(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
