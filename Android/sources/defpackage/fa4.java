package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* renamed from: fa4  reason: default package */
public final class fa4 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final AtomicInteger X = new AtomicInteger(0);
    public final AtomicInteger Y = new AtomicInteger(0);
    public final AtomicInteger Z = new AtomicInteger(-1);
    public final VpxDecoderWrapper a;
    public final pbb b;
    public final voc c;
    public final HandlerThread o;
    public final Handler v;
    public final AtomicInteger v0 = new AtomicInteger(-1);
    public final int w;
    public final AtomicInteger w0 = new AtomicInteger(-1);
    public volatile boolean x = false;
    public final /* synthetic */ bug x0;
    public volatile boolean y = false;
    public volatile boolean z = true;

    public fa4(bug bug, int i, pbb pbb, voc voc) {
        this.x0 = bug;
        this.b = pbb;
        this.c = voc;
        this.a = new VpxDecoderWrapper();
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.o = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.v = handler;
        this.w = i;
        handler.post(new l40(this, i, 7));
    }

    public final void a() {
        if (!this.x) {
            this.x = true;
            voc voc = this.c;
            voc.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
            HandlerThread handlerThread = this.o;
            Handler handler = this.x0.e;
            VpxDecoderWrapper vpxDecoderWrapper = this.a;
            Objects.requireNonNull(vpxDecoderWrapper);
            pr1 pr1 = new pr1(25, vpxDecoderWrapper);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(pr1);
            handlerThread.quitSafely();
            this.y = true;
        }
    }

    public final void onDecodeError(int i) {
        StringBuilder o2 = wj6.o(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        o2.append(System.identityHashCode(this));
        this.c.log("DecoderWrapper", o2.toString());
        bug bug = this.x0;
        bug.x.a();
        bug.t.incrementAndGet();
        this.z = true;
        this.Z.set(this.Y.get());
    }

    public final void onFrame(VideoFrame videoFrame) {
        if (!this.x) {
            this.x0.s.incrementAndGet();
            this.x0.w.a();
            if (SystemClock.elapsedRealtimeNanos() > bug.E) {
                pbb pbb = this.b;
                ihd ihd = (ihd) pbb.b;
                ue1 ue1 = (ue1) pbb.c;
                if (!ihd.f) {
                    ihd.e.a(ue1, videoFrame);
                }
            }
            this.v0.set(videoFrame.getRotatedWidth());
            this.w0.set(videoFrame.getRotatedHeight());
        }
    }
}
