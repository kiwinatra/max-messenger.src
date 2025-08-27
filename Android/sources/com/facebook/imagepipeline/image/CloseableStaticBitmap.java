package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import java.util.Map;

public interface CloseableStaticBitmap extends v33 {
    static CloseableStaticBitmap of(Bitmap bitmap, b4d b4d, tac tac, int i) {
        return of(bitmap, b4d, tac, i, 0);
    }

    y33 cloneUnderlyingBitmapReference();

    /* synthetic */ void close();

    y33 convertToBitmapReference();

    int getExifOrientation();

    /* synthetic */ Map getExtras();

    /* synthetic */ int getHeight();

    /* synthetic */ k97 getImageInfo();

    /* synthetic */ tac getQualityInfo();

    int getRotationAngle();

    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    /* synthetic */ int getWidth();

    /* synthetic */ boolean isClosed();

    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(y33 y33, tac tac, int i) {
        return of(y33, tac, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, b4d b4d, tac tac, int i, int i2) {
        int i3 = kd4.z;
        return new kd4(bitmap, b4d, tac, i, i2);
    }

    static CloseableStaticBitmap of(y33 y33, tac tac, int i, int i2) {
        int i3 = kd4.z;
        return new kd4(y33, tac, i, i2);
    }
}
