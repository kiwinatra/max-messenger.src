package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import java.util.List;

@cr4
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        List list = fa7.a;
        o5a.P("imagepipeline");
    }

    @cr4
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = false;
        cvg.l(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        cvg.l(Boolean.valueOf(bitmap.isMutable()));
        cvg.l(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z = true;
        }
        cvg.l(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @cr4
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
