package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: rn8  reason: default package */
public abstract class rn8 {
    public static void a(dn8 dn8, lpb lpb) {
        jpb jpb = lpb.a;
        jpb.getClass();
        LogSessionId logSessionId = jpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            dn8.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
