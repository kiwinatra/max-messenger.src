package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* renamed from: w8g  reason: default package */
public final /* synthetic */ class w8g implements VideoSink {
    public final /* synthetic */ VideoSource a;

    public /* synthetic */ w8g(VideoSource videoSource) {
        this.a = videoSource;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.a.lambda$setVideoProcessor$1(videoFrame);
    }
}
