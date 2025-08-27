package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec2) {
            this.mediaCodec = mediaCodec2;
        }

        public boolean cbrSupported(MediaFormat mediaFormat) {
            return this.mediaCodec.getCodecInfo().getCapabilitiesForType(mediaFormat.getString("mime")).getEncoderCapabilities().isBitrateModeSupported(2);
        }

        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        public void flush() {
            this.mediaCodec.flush();
        }

        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        public ByteBuffer getInputBuffer(int i) {
            return this.mediaCodec.getInputBuffer(i);
        }

        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        public ByteBuffer getOutputBuffer(int i) {
            return this.mediaCodec.getOutputBuffer(i);
        }

        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        public void release() {
            this.mediaCodec.release();
        }

        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        public void start() {
            this.mediaCodec.start();
        }

        public void stop() {
            this.mediaCodec.stop();
        }

        public MediaFormat getOutputFormat(int i) {
            return this.mediaCodec.getOutputFormat(i);
        }
    }

    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
