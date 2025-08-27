package org.webrtc;

import java.nio.ByteBuffer;

public class VpxEncoderWrapper implements EncoderCallback {
    private EncoderCallback consumerCallback;
    private long encoder;

    public VpxEncoderWrapper() {
        long nativeCreate = nativeCreate();
        this.encoder = nativeCreate;
        nativeSetCallback(nativeCreate, this);
        nativeInit(this.encoder);
    }

    private static native long nativeCreate();

    private static native int nativeEncode(long j, VideoFrame videoFrame, boolean z);

    private static native void nativeInit(long j);

    private static native void nativeRelease(long j);

    private static native void nativeSetCallback(long j, VpxEncoderWrapper vpxEncoderWrapper);

    public void encode(VideoFrame videoFrame, boolean z) {
        long j = this.encoder;
        if (j != 0) {
            nativeEncode(j, videoFrame, z);
            return;
        }
        throw new IllegalStateException("encoder already released");
    }

    @CalledByNative
    public void onEncodedImage(EncodedImage encodedImage) {
        if (this.consumerCallback != null) {
            ByteBuffer allocate = ByteBuffer.allocate(encodedImage.buffer.remaining());
            allocate.put(encodedImage.buffer);
            allocate.rewind();
            this.consumerCallback.onEncodedImage(EncodedImage.builder().setBuffer(allocate, (Runnable) null).setEncodedHeight(encodedImage.encodedHeight).setEncodedWidth(encodedImage.encodedWidth).setFrameType(encodedImage.frameType).setQp(encodedImage.qp).setRotation(encodedImage.rotation).createEncodedImage());
            encodedImage.release();
        }
    }

    @CalledByNative
    public void onFrameDropped(int i) {
        EncoderCallback encoderCallback = this.consumerCallback;
        if (encoderCallback != null) {
            encoderCallback.onFrameDropped(i);
        }
    }

    public void release() {
        nativeRelease(this.encoder);
        this.encoder = 0;
    }

    public void setConsumerCallback(EncoderCallback encoderCallback) {
        this.consumerCallback = encoderCallback;
    }
}
