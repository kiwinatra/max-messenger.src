package org.webrtc;

public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j);

    public long createNative(long j) {
        return nativeCreateDecoder(j);
    }
}
