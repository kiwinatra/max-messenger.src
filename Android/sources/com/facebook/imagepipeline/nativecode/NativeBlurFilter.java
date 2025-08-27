package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@cr4
public class NativeBlurFilter {
    static {
        o5a.P("native-filters");
    }

    @cr4
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
