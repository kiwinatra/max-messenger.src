package org.webrtc;

import org.webrtc.VideoDecoder;

public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    public abstract long createNative(long j);

    public final VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
