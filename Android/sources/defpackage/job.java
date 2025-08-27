package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: job  reason: default package */
public abstract class job {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
