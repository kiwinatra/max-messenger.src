package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

/* renamed from: d8d  reason: default package */
public final class d8d implements VideoFrame.TextureBuffer {
    public final VideoFrame.TextureBuffer a;
    public final int b;
    public final Handler c;
    public final YuvConverter d;

    public d8d(VideoFrame.TextureBuffer textureBuffer, int i, Handler handler, YuvConverter yuvConverter) {
        this.a = textureBuffer;
        this.b = i;
        this.c = handler;
        this.d = yuvConverter;
    }

    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        VideoFrame.TextureBuffer textureBuffer = this.a;
        Matrix matrix = new Matrix(textureBuffer.getTransformMatrix());
        int i7 = this.b;
        if (i7 != 0) {
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate((float) i7);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        matrix.preTranslate(((float) i) / ((float) getWidth()), ((float) i2) / ((float) getHeight()));
        matrix.preScale(((float) i3) / ((float) getWidth()), ((float) i4) / ((float) getHeight()));
        textureBuffer.retain();
        return new TextureBufferImpl(i5, i6, textureBuffer.getType(), textureBuffer.getTextureId(), matrix, this.c, this.d, (Runnable) new o99(28, this));
    }

    public final int getHeight() {
        int i = this.b % 180;
        VideoFrame.TextureBuffer textureBuffer = this.a;
        return i == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
    }

    public final int getTextureId() {
        return this.a.getTextureId();
    }

    public final Matrix getTransformMatrix() {
        return this.a.getTransformMatrix();
    }

    public final VideoFrame.TextureBuffer.Type getType() {
        return this.a.getType();
    }

    public final int getWidth() {
        int i = this.b % 180;
        VideoFrame.TextureBuffer textureBuffer = this.a;
        return i == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
    }

    public final void release() {
        this.a.release();
    }

    public final void retain() {
        this.a.retain();
    }

    public final VideoFrame.I420Buffer toI420() {
        return this.a.toI420();
    }
}
