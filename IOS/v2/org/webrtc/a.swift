package org.webrtc;

import org.webrtc.Camera2Session;

public final /* synthetic */ class a implements VideoSink {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFrame(VideoFrame videoFrame) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                return;
            default:
                ((Camera2Session.CaptureSessionCallback) obj).lambda$onConfigured$0(videoFrame);
                return;
        }
    }
}
