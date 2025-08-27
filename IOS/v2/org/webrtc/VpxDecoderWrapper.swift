package org.webrtc;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFrame;

public class VpxDecoderWrapper {
    private VideoSink decodedFrameSink;
    private long decoder = nativeCreate();
    private int desiredFps;
    private ErrorCallback errorCallback;
    private long lastFrameTimeNs;
    private long timeBetweenFramesNs;

    public enum DecoderKind {
        VP8((byte) 0),
        VP9((byte) 1);
        
        /* access modifiers changed from: private */
        public final byte nativeKind;

        private DecoderKind(byte b) {
            this.nativeKind = b;
        }
    }

    public interface ErrorCallback {
        void onDecodeError(int i);
    }

    private static native long nativeCreate();

    private static native int nativeDecode(long j);

    private static native VideoFrame.Buffer nativeGetDecodedImage(long j);

    private static native long nativeImgHeight(long j);

    private static native long nativeImgWidth(long j);

    private static native void nativeInit(long j, byte b);

    private static native void nativeRelease(long j);

    private static native void nativeSetData(long j, ByteBuffer byteBuffer, long j2);

    public void close() {
        long j = this.decoder;
        if (j != 0) {
            nativeRelease(j);
        }
        this.decoder = 0;
    }

    public void decode(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        nativeSetData(this.decoder, slice, (long) slice.remaining());
        int nativeDecode = nativeDecode(this.decoder);
        if (nativeDecode != 0) {
            Logging.w("VpxDecoderWrap", "decode returned " + nativeDecode);
            this.errorCallback.onDecodeError(nativeDecode);
        }
        while (true) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (elapsedRealtimeNanos >= this.lastFrameTimeNs + this.timeBetweenFramesNs) {
                this.lastFrameTimeNs = elapsedRealtimeNanos;
                VideoFrame.Buffer nativeGetDecodedImage = nativeGetDecodedImage(this.decoder);
                if (nativeGetDecodedImage != null) {
                    VideoSink videoSink = this.decodedFrameSink;
                    if (videoSink != null) {
                        videoSink.onFrame(new VideoFrame(nativeGetDecodedImage, 0, System.nanoTime()));
                    }
                    nativeGetDecodedImage.release();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void init(DecoderKind decoderKind) {
        nativeInit(this.decoder, decoderKind.nativeKind);
    }

    public long lastDecodedHeight() {
        return nativeImgHeight(this.decoder);
    }

    public long lastDecodedWidth() {
        return nativeImgWidth(this.decoder);
    }

    public void setDesiredFps(int i) {
        this.desiredFps = i;
        this.timeBetweenFramesNs = i > 0 ? TimeUnit.SECONDS.toNanos(1) / ((long) i) : 0;
    }

    public void setErrorCallback(ErrorCallback errorCallback2) {
        this.errorCallback = errorCallback2;
    }

    public void setFrameHandler(VideoSink videoSink) {
        this.decodedFrameSink = videoSink;
    }
}
