package org.webrtc;

public interface VideoDecoderFactory {
    @CalledByNative
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}
