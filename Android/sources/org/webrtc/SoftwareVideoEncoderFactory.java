package org.webrtc;

import java.util.List;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    /* access modifiers changed from: private */
    public final long nativeFactory = nativeCreateFactory();

    /* access modifiers changed from: private */
    public static native long nativeCreate(long j, long j2, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j);

    private static native boolean nativeIsSupported(long j, VideoCodecInfo videoCodecInfo);

    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoEncoder() {
                public long createNative(long j) {
                    return SoftwareVideoEncoderFactory.nativeCreate(SoftwareVideoEncoderFactory.this.nativeFactory, j, videoCodecInfo);
                }

                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
