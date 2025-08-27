package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final Long compactParticipantId;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        @CalledByNative("Buffer")
        int getBufferType() {
            return 0;
        }

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @CalledByNative("Buffer")
        void release();

        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        int getBufferType() {
            return 1;
        }

        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            private Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
            throw new UnsupportedOperationException("Not implemented");
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getUnscaledHeight() {
            return getHeight();
        }

        int getUnscaledWidth() {
            return getWidth();
        }
    }

    public VideoFrame(Buffer buffer2, int i, long j) {
        this(buffer2, i, j, (Long) null);
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    public Long getCompactParticipantId() {
        return this.compactParticipantId;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer2, int i, long j, Long l) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.compactParticipantId = l;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}
