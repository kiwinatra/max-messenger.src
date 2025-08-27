package org.webrtc;

public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    public long createNative(long j) {
        return nativeCreateDecoder();
    }
}
