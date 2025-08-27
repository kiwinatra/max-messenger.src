package defpackage;

import android.graphics.Matrix;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import org.webrtc.VideoSink;

/* renamed from: laf  reason: default package */
public final class laf implements VideoSink {
    public final DecimalFormat X;
    public final iaf Y;
    public final String a;
    public final Object b = new Object();
    public final Object c;
    public long o;
    public final Object v;
    public final Object w;
    public final Object x;
    public int y;
    public long z;

    public laf(String str) {
        new VideoFrameDrawer();
        new ArrayList();
        new ArrayList();
        this.c = new Object();
        new Matrix();
        this.w = new Object();
        this.x = new Object();
        new GlTextureFrameBuffer(6408);
        this.X = new DecimalFormat("#.0");
        kv0.J();
        vpa vpa = kv0.f;
        (vpa == null ? null : vpa).getClass();
        new haf(0, (Object) this);
        this.Y = new iaf(this);
        this.a = str;
    }

    public static String a(int i, long j) {
        if (i <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j / ((long) i)) + " us";
    }

    public final void b(String str) {
        z68.a("EglRenderer", this.a + str);
    }

    public final void c(float f) {
        b("setLayoutAspectRatio: " + f);
        synchronized (this.w) {
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        synchronized (this.x) {
            this.y++;
        }
        synchronized (this.b) {
            b("Dropping frame - Not initialized or already released.");
        }
    }
}
