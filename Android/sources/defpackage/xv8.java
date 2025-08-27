package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* renamed from: xv8  reason: default package */
public final class xv8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ dw8 a;

    public xv8(dw8 dw8) {
        this.a = dw8;
    }

    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        dw8 dw8 = this.a;
        dw8.U0 = description;
        dw8.h();
        dw8.l();
    }

    public final void onSessionDestroyed() {
        dw8 dw8 = this.a;
        MediaControllerCompat mediaControllerCompat = dw8.S0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(dw8.T0);
            dw8.S0 = null;
        }
    }
}
