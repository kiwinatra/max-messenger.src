package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: n8g  reason: default package */
public final class n8g implements VideoSink {
    public volatile VideoSink a;

    public final void a(VideoFrame videoFrame) {
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        a(videoFrame);
    }
}
