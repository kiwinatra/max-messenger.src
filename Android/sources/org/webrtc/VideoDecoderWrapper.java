package org.webrtc;

import org.webrtc.VideoDecoder;

class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new d(j);
    }

    /* access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
