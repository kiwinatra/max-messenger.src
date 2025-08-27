package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: ro8  reason: default package */
public final class ro8 extends MediaController.Callback {
    public final WeakReference a;

    public ro8(rp8 rp8) {
        this.a = new WeakReference(rp8);
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null && playbackInfo != null) {
            rp8.a(new vo8(playbackInfo.getPlaybackType(), new k30(new j30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
        }
    }

    public final void onExtrasChanged(Bundle bundle) {
        px8.a(bundle);
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            rp8.c(bundle);
        }
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        vs8 vs8;
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            ts tsVar = vs8.c;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                vs8 = vs8.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                vs8.b = mediaMetadata;
            } else {
                vs8 = null;
            }
            rp8.d(vs8);
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null && rp8.c == null) {
            rp8.e(mob.a(playbackState));
        }
    }

    public final void onQueueChanged(List list) {
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            rp8.f(mx8.a(list));
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            rp8.g(charSequence);
        }
    }

    public final void onSessionDestroyed() {
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            rp8.e.b.release();
        }
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        px8.a(bundle);
        rp8 rp8 = (rp8) this.a.get();
        if (rp8 != null) {
            rp8.h(str, bundle);
        }
    }
}
