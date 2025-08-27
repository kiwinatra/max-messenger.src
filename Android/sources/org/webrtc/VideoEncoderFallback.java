package org.webrtc;

public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    private static native long nativeCreate(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    public long createNative(long j) {
        return nativeCreate(j, this.fallback, this.primary);
    }

    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }
}
