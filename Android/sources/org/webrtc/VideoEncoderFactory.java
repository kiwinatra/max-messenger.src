package org.webrtc;

public interface VideoEncoderFactory {

    public interface VideoEncoderSelector {
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onAvailableBitrate(int i);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onEncoderBroken();

        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onResolutionChange(int i, int i2) {
            return null;
        }
    }

    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @CalledByNative
    VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
