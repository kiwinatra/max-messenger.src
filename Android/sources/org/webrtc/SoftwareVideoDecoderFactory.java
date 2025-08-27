package org.webrtc;

import java.util.List;

public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    /* access modifiers changed from: private */
    public final long nativeFactory = nativeCreateFactory();

    /* access modifiers changed from: private */
    public static native long nativeCreate(long j, long j2, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j);

    private static native boolean nativeIsSupported(long j, VideoCodecInfo videoCodecInfo);

    public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
        if (nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoDecoder() {
                public long createNative(long j) {
                    return SoftwareVideoDecoderFactory.nativeCreate(SoftwareVideoDecoderFactory.this.nativeFactory, j, videoCodecInfo);
                }
            };
        }
        Logging.w(TAG, "Trying to create decoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
