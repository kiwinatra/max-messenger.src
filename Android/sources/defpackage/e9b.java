package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: e9b  reason: default package */
public final class e9b implements VideoSink {
    public final Map a;
    public final wie b;

    public e9b(ConcurrentHashMap concurrentHashMap, wie wie) {
        this.a = concurrentHashMap;
        this.b = wie;
    }

    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        ln1 ln1;
        List<VideoSink> list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null && (ln1 = (ln1) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null && (list = (List) this.a.get(ln1)) != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }
}
