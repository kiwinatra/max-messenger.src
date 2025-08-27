package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Handler;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: xd6  reason: default package */
public final class xd6 extends MediaProjection.Callback implements CapturerObserver, y48 {
    public boolean X;
    public final p1e Y;
    public final EglBase.Context a;
    public final Context b;
    public final voc c;
    public final rx3 o = new rx3("SSFrameCapturer");
    public volatile SurfaceTextureHelper v;
    public volatile ScreenCapturerAndroid w;
    public VideoSink x;
    public final zjf y = new zjf();
    public boolean z;

    public xd6(EglBase.Context context, Context context2, p1e p1e, voc voc) {
        this.a = context;
        this.b = context2;
        this.c = voc;
        this.Y = p1e;
    }

    public final void a(int i, int i2) {
        this.o.c(new wt0(this, i, i2, 1));
    }

    public final void b(Size size, int i) {
        if (this.z && !this.X) {
            try {
                this.w.startCapture(size.width, size.height, 0);
                this.X = true;
            } catch (SecurityException e) {
                this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
                if (i > 10) {
                    this.c.reportException("FrameCapturerImpl", a81.j(i, "Error: ", "times of restart screen capture did fail"), e);
                    this.o.c(new wd6(this, 0));
                    return;
                }
                rx3 rx3 = this.o;
                ((Handler) rx3.b).postDelayed(new kh1((Object) this, (Object) size, i, 10), 400);
            } catch (RuntimeException e2) {
                this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
                this.o.c(new wd6(this, 0));
            }
        }
    }

    public final void onCapturerStarted(boolean z2) {
        p1e p1e;
        this.c.log("FrameCapturerImpl", i2a.i("Screen capture did start success=", z2));
        if (z2 && (p1e = this.Y) != null) {
            ((hz0) p1e.a).T0.log("OKRTCCall", "Screen capture has started, fast=false");
        }
    }

    public final void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        p1e p1e = this.Y;
        if (p1e != null) {
            p1e.e(false);
        }
    }

    public final void onFrameCaptured(VideoFrame videoFrame) {
        this.y.a();
        VideoSink videoSink = this.x;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    public final void onStop() {
        this.o.c(new wd6(this, 0));
    }
}
