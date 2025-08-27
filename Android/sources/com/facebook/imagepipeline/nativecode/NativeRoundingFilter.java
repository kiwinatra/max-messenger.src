package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@cr4
public class NativeRoundingFilter {
    static {
        o5a.P("native-filters");
    }

    @cr4
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @cr4
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @cr4
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @cr4
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @cr4
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @cr4
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
