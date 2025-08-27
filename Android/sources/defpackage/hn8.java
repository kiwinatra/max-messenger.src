package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: hn8  reason: default package */
public interface hn8 {
    void a(int i, int i2, int i3, long j);

    void c(int i, long j);

    int e();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i);

    void j(Surface surface);

    void n(int i, h44 h44, long j);

    void q(ho8 ho8, Handler handler);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);
}
