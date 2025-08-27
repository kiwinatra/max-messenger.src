package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: gx8  reason: default package */
public final class gx8 extends MediaSession.Callback {
    public final /* synthetic */ f0 a;

    public gx8(f0 f0Var) {
        this.a = f0Var;
    }

    public final jx8 a() {
        jx8 jx8;
        synchronized (this.a.o) {
            jx8 = (jx8) ((WeakReference) this.a.b).get();
        }
        if (jx8 == null || this.a != jx8.getCallback()) {
            return null;
        }
        return jx8;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        t2g t2g;
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            try {
                if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                    if (resultReceiver != null) {
                        Bundle bundle2 = new Bundle();
                        ox8 ox8 = a2.c;
                        h67 a3 = ox8.a();
                        bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, a3 == null ? null : a3.asBinder());
                        synchronized (ox8.a) {
                            t2g = ox8.o;
                        }
                        i8b.M(bundle2, t2g);
                        resultReceiver.send(0, bundle2);
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.i((zp8) pt7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), zp8.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                    if (bundle != null) {
                        this.a.j((zp8) pt7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), zp8.CREATOR), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.x((zp8) pt7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), zp8.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                    List list = a2.h;
                    if (!(list == null || bundle == null)) {
                        int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                        mx8 mx8 = (i < 0 || i >= list.size()) ? null : (mx8) list.get(i);
                        if (mx8 != null) {
                            this.a.x(mx8.a);
                        }
                    }
                } else {
                    this.a.k(str, bundle, resultReceiver);
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((ly8) null);
        }
    }

    public final void onCustomAction(String str, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            try {
                boolean equals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
                f0 f0Var = this.a;
                if (equals) {
                    if (bundle != null) {
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        px8.a(bundle2);
                        f0Var.s((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                    f0Var.t();
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                    if (bundle != null) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        px8.a(bundle3);
                        f0Var.u(string, bundle3);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    if (bundle != null) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        px8.a(bundle4);
                        f0Var.v(string2, bundle4);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                    if (bundle != null) {
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        px8.a(bundle5);
                        f0Var.w((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle5);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    if (bundle != null) {
                        bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                        f0Var.getClass();
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                    if (bundle != null) {
                        f0Var.D(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                    if (bundle != null) {
                        f0Var.E(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                    if (bundle != null) {
                        px8.a(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        f0Var.C((upc) pt7.a(bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), upc.CREATOR));
                    }
                } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                    f0Var.l(str, bundle);
                } else if (bundle != null) {
                    f0Var.A(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((ly8) null);
        }
    }

    public final void onFastForward() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.m();
            a2.a((ly8) null);
        }
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        jx8 a2 = a();
        if (a2 == null) {
            return false;
        }
        boolean n = this.a.n(intent);
        a2.a((ly8) null);
        return n || super.onMediaButtonEvent(intent);
    }

    public final void onPause() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.o();
            a2.a((ly8) null);
        }
    }

    public final void onPlay() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.p();
            a2.a((ly8) null);
        }
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.q(str, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.r(str, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.s(uri, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onPrepare() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.t();
            a2.a((ly8) null);
        }
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.u(str, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.v(str, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        jx8 a2 = a();
        if (a2 != null) {
            px8.a(bundle);
            this.a.w(uri, bundle);
            a2.a((ly8) null);
        }
    }

    public final void onRewind() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.y();
            a2.a((ly8) null);
        }
    }

    public final void onSeekTo(long j) {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.z(j);
            a2.a((ly8) null);
        }
    }

    public final void onSetPlaybackSpeed(float f) {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.A(f);
            a2.a((ly8) null);
        }
    }

    public final void onSetRating(Rating rating) {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.B(upc.a(rating));
            a2.a((ly8) null);
        }
    }

    public final void onSkipToNext() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.F();
            a2.a((ly8) null);
        }
    }

    public final void onSkipToPrevious() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.G();
            a2.a((ly8) null);
        }
    }

    public final void onSkipToQueueItem(long j) {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.H(j);
            a2.a((ly8) null);
        }
    }

    public final void onStop() {
        jx8 a2 = a();
        if (a2 != null) {
            this.a.I();
            a2.a((ly8) null);
        }
    }
}
