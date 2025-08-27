package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* renamed from: kc5  reason: default package */
public abstract class kc5 {
    public static mpb a(Context context, tc5 tc5, boolean z, String str) {
        MediaMetricsManager g = hv3.g(context.getSystemService("media_metrics"));
        ys8 ys8 = g == null ? null : new ys8(context, g.createPlaybackSession());
        if (ys8 == null) {
            i8b.V("MediaMetricsService unavailable.");
            return new mpb(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            tc5.getClass();
            wb4 wb4 = tc5.A0;
            wb4.getClass();
            wb4.w.c(ys8);
        }
        return new mpb(ys8.c.getSessionId(), str);
    }
}
