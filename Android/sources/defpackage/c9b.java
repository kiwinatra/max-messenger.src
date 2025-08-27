package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: c9b  reason: default package */
public final class c9b implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ d9b c;

    public c9b(d9b d9b, String str) {
        this.c = d9b;
        this.a = str;
    }

    public final void onFrame(VideoFrame videoFrame) {
        ln1 ln1;
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            d9b d9b = this.c;
            ConcurrentHashMap concurrentHashMap = d9b.Y;
            String str = this.a;
            ln1 ln12 = (ln1) concurrentHashMap.get(str);
            ConcurrentHashMap concurrentHashMap2 = d9b.Z;
            ConcurrentHashMap concurrentHashMap3 = d9b.Y;
            if (ln12 != null) {
                concurrentHashMap3.remove(str, ln12);
                concurrentHashMap2.remove(ln12, str);
            }
            if (compactParticipantId != null && (ln1 = (ln1) ((ConcurrentHashMap) ((wie) d9b.v).b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null) {
                concurrentHashMap3.put(str, ln1);
                concurrentHashMap2.put(ln1, str);
            }
        }
    }
}
