package org.webrtc;

public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j);

    public long createNative(long j) {
        return nativeCreate(j);
    }

    public boolean isHardwareEncoder() {
        return false;
    }
}
