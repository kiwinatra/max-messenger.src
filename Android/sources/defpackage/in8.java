package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: in8  reason: default package */
public interface in8 {
    void a(int i, int i2, int i3, long j);

    void c(int i, long j);

    int e();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i);

    void i(int i, h44 h44, long j, int i2);

    void j(Surface surface);

    boolean k(tn8 tn8) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);

    void t(ho8 ho8, Handler handler);
}
