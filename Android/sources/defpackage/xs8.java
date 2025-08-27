package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* renamed from: xs8  reason: default package */
public abstract /* synthetic */ class xs8 {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder g() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder h() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder i(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
