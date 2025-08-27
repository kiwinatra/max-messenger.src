package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: dc4  reason: default package */
public abstract class dc4 {
    public static void a(AudioTrack audioTrack, lpb lpb) {
        jpb jpb = lpb.a;
        jpb.getClass();
        LogSessionId logSessionId = jpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
