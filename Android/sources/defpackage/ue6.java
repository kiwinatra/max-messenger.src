package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: ue6  reason: default package */
public abstract class ue6 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, mpb mpb) {
        kpb kpb = mpb.b;
        kpb.getClass();
        LogSessionId logSessionId = kpb.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent d = mediaDrm.getPlaybackComponent(bArr);
            d.getClass();
            hv3.e(d).setLogSessionId(logSessionId);
        }
    }
}
