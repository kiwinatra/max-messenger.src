package com.yalantis.ucrop.task;

import android.graphics.Bitmap;

public class BitmapLoadTask$BitmapWorkerResult {
    public Bitmap bitmapResult;
    Exception bitmapWorkerException;
    ta5 exifInfo;

    public BitmapLoadTask$BitmapWorkerResult(Bitmap bitmap, ta5 ta5) {
        this.bitmapResult = bitmap;
        this.exifInfo = ta5;
    }

    public BitmapLoadTask$BitmapWorkerResult(Exception exc) {
        this.bitmapWorkerException = exc;
    }
}
