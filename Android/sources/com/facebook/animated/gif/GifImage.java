package com.facebook.animated.gif;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.IntCompanionObject;

@cr4
public class GifImage {
    public static volatile boolean b;
    public Bitmap.Config a = null;
    @cr4
    private long mNativeContext;

    @cr4
    public GifImage() {
    }

    public static GifImage a(ByteBuffer byteBuffer, c97 c97) {
        c();
        byteBuffer.rewind();
        c97.getClass();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, IntCompanionObject.MAX_VALUE, false);
        nativeCreateFromDirectByteBuffer.a = c97.b;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage b(long j, int i, c97 c97) {
        c();
        if (j != 0) {
            c97.getClass();
            GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, IntCompanionObject.MAX_VALUE, false);
            nativeCreateFromNativeMemory.a = c97.b;
            return nativeCreateFromNativeMemory;
        }
        throw new IllegalArgumentException();
    }

    public static synchronized void c() {
        synchronized (GifImage.class) {
            if (!b) {
                b = true;
                o5a.P("gifimage");
            }
        }
    }

    @cr4
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @cr4
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @cr4
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @cr4
    private native void nativeDispose();

    @cr4
    private native void nativeFinalize();

    @cr4
    private native int nativeGetDuration();

    @cr4
    private native GifFrame nativeGetFrame(int i);

    @cr4
    private native int nativeGetFrameCount();

    @cr4
    private native int[] nativeGetFrameDurations();

    @cr4
    private native int nativeGetHeight();

    @cr4
    private native int nativeGetLoopCount();

    @cr4
    private native int nativeGetSizeInBytes();

    @cr4
    private native int nativeGetWidth();

    @cr4
    private native boolean nativeIsAnimated();

    public final GifFrame d(int i) {
        return nativeGetFrame(i);
    }

    public final int e() {
        return nativeGetFrameCount();
    }

    public final int[] f() {
        return nativeGetFrameDurations();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final ff g(int i) {
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int e = nativeGetFrame.e();
            int f = nativeGetFrame.f();
            int d = nativeGetFrame.d();
            int c = nativeGetFrame.c();
            int b2 = nativeGetFrame.b();
            int i2 = 1;
            if (b2 != 0) {
                if (b2 != 1) {
                    int i3 = 2;
                    if (b2 != 2) {
                        i3 = 3;
                        if (b2 == 3) {
                        }
                    }
                    i2 = i3;
                }
            }
            return new ff(e, f, d, c, i2);
        } finally {
            nativeGetFrame.a();
        }
    }

    public final int h() {
        return nativeGetHeight();
    }

    public final int i() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    public final int j() {
        return nativeGetSizeInBytes();
    }

    public final int k() {
        return nativeGetWidth();
    }

    @cr4
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
