package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* renamed from: be6  reason: default package */
public final class be6 implements EncoderCallback, VideoSink {
    public final zjf X;
    public final zjf Y;
    public final AtomicInteger Z = new AtomicInteger(0);
    public final long a;
    public final long b;
    public final rx3 c;
    public final voc o;
    public final i8d v;
    public volatile boolean v0;
    public volatile VpxEncoderWrapper w;
    public volatile long w0;
    public volatile pe6 x;
    public volatile pe6 y;
    public volatile long z;

    public be6(voc voc, i8d i8d) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5);
        this.b = timeUnit.toNanos(1) / 10;
        this.o = voc;
        this.v = i8d;
        this.c = new rx3("SSFrameEncoder");
        this.X = new zjf();
        this.Y = new zjf();
    }

    public final void a() {
        this.v0 = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.w;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.w = null;
    }

    public final void onEncodedImage(EncodedImage encodedImage) {
        this.X.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.z = SystemClock.elapsedRealtime();
        }
        if (this.x != null) {
            pe6 pe6 = this.x;
            if (!pe6.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                pe6.h = false;
            }
            pe6.c.add(encodedImage);
            pe6.d.addAndGet(encodedImage.buffer.remaining());
            pe6.b(pe6.g);
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        pe6 pe6 = this.y;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (elapsedRealtimeNanos >= this.w0 + this.b) {
            if ((pe6 == null || (pe6.c.size() <= 15 && pe6.d.get() <= 4000000)) && this.Z.get() < 5) {
                try {
                    VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                    this.v.getClass();
                    float rotation = (((float) (videoFrame.getRotation() + 360)) + c44.DEFAULT_ASPECT_RATIO) % 360.0f;
                    voc voc = this.o;
                    voc.log("SSFrameEncoder", "rotation angle = " + rotation);
                    VideoFrame videoFrame2 = new VideoFrame(i420, (int) rotation, videoFrame.getTimestampNs());
                    this.w0 = elapsedRealtimeNanos;
                    this.Z.incrementAndGet();
                    this.c.c(new x55((Object) this, (Object) pe6, (Object) videoFrame2, 8));
                } catch (GlUtil.GlOutOfMemoryException unused) {
                    this.o.log("SSFrameEncoder", "gl oom @ toI420, skipping");
                }
            }
        }
    }

    public final void onFrameDropped(int i) {
        this.Y.a();
    }
}
