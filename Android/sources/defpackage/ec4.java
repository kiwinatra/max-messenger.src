package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: ec4  reason: default package */
public abstract class ec4 {
    public static void a(AudioTrack audioTrack, mpb mpb) {
        kpb kpb = mpb.b;
        kpb.getClass();
        LogSessionId logSessionId = kpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
