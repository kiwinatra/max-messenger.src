package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: sn8  reason: default package */
public abstract class sn8 {
    public static void a(en8 en8, mpb mpb) {
        kpb kpb = mpb.b;
        kpb.getClass();
        LogSessionId logSessionId = kpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            en8.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
