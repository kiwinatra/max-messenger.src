package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: te6  reason: default package */
public abstract class te6 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, lpb lpb) {
        jpb jpb = lpb.a;
        jpb.getClass();
        LogSessionId logSessionId = jpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent d = mediaDrm.getPlaybackComponent(bArr);
            d.getClass();
            hv3.e(d).setLogSessionId(logSessionId);
        }
    }
}
