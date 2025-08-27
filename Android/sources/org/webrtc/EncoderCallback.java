package org.webrtc;

public interface EncoderCallback {
    void onEncodedImage(EncodedImage encodedImage);

    void onFrameDropped(int i);
}
