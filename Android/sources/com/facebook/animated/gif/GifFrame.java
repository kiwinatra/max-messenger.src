package com.facebook.animated.gif;

import android.graphics.Bitmap;

public class GifFrame {
    @cr4
    private long mNativeContext;

    @cr4
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @cr4
    private native void nativeDispose();

    @cr4
    private native void nativeFinalize();

    @cr4
    private native int nativeGetDisposalMode();

    @cr4
    private native int nativeGetDurationMs();

    @cr4
    private native int nativeGetHeight();

    @cr4
    private native int nativeGetTransparentPixelColor();

    @cr4
    private native int nativeGetWidth();

    @cr4
    private native int nativeGetXOffset();

    @cr4
    private native int nativeGetYOffset();

    @cr4
    private native boolean nativeHasTransparency();

    @cr4
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final void a() {
        nativeDispose();
    }

    public final int b() {
        return nativeGetDisposalMode();
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final int d() {
        return nativeGetWidth();
    }

    public final int e() {
        return nativeGetXOffset();
    }

    public final int f() {
        return nativeGetYOffset();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final void g(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
