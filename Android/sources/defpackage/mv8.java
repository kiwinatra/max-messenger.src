package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* renamed from: mv8  reason: default package */
public final class mv8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ d a;

    public mv8(d dVar) {
        this.a = dVar;
    }

    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        d dVar = this.a;
        dVar.d1 = description;
        dVar.r();
        dVar.q(false);
    }

    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.a;
        dVar.c1 = playbackStateCompat;
        dVar.q(false);
    }

    public final void onSessionDestroyed() {
        d dVar = this.a;
        MediaControllerCompat mediaControllerCompat = dVar.a1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(dVar.b1);
            dVar.a1 = null;
        }
    }
}
