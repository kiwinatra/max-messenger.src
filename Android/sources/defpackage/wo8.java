package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: wo8  reason: default package */
public abstract class wo8 extends cjf {
    public final MediaController.TransportControls h;

    public wo8(MediaController.TransportControls transportControls) {
        this.h = transportControls;
    }

    public final void T(String str, Bundle bundle) {
        if (str != null && ((str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) && (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)))) {
            throw new IllegalArgumentException(wj6.k("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        this.h.sendCustomAction(str, bundle);
    }
}
