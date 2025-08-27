package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;

/* renamed from: im8  reason: default package */
public final class im8 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ w28 a;

    public im8(w28 w28) {
        this.a = w28;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [f67, java.lang.Object] */
    public final void onConnected() {
        h67 h67;
        w28 w28 = this.a;
        jm8 jm8 = (jm8) w28.c;
        boolean z = true;
        if (jm8 != null) {
            MediaBrowser mediaBrowser = jm8.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        dm4 dm4 = new dm4(binder, jm8.c);
                        jm8.f = dm4;
                        hm8 hm8 = jm8.d;
                        Messenger messenger = new Messenger(hm8);
                        jm8.g = messenger;
                        hm8.getClass();
                        hm8.c = new WeakReference(messenger);
                        try {
                            Context context = jm8.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) dm4.c);
                            dm4.u(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = ix8.d;
                    if (binder2 == null) {
                        h67 = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof h67)) {
                            ? obj = new Object();
                            obj.c = binder2;
                            h67 = obj;
                        } else {
                            h67 = (h67) queryLocalInterface;
                        }
                    }
                    if (h67 != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        n79.n(sessionToken != null);
                        if (sessionToken instanceof MediaSession.Token) {
                            jm8.h = new ox8(sessionToken, h67);
                        } else {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        tp8 tp8 = (tp8) w28.o;
        lm8 lm8 = tp8.h;
        if (lm8 != null) {
            jm8 jm82 = lm8.a;
            if (jm82.h == null) {
                MediaSession.Token sessionToken2 = jm82.b.getSessionToken();
                if (sessionToken2 == null) {
                    z = false;
                }
                n79.n(z);
                if (sessionToken2 instanceof MediaSession.Token) {
                    jm82.h = new ox8(sessionToken2, (h67) null);
                } else {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
            }
            uo5 uo5 = new uo5(26, (Object) tp8, (Object) jm82.h);
            qo8 qo8 = tp8.b;
            qo8.H0(uo5);
            qo8.v.post(new qp8(tp8, 0));
        }
    }

    public final void onConnectionFailed() {
        w28 w28 = this.a;
        Object obj = w28.c;
        ((tp8) w28.o).b.release();
    }

    public final void onConnectionSuspended() {
        w28 w28 = this.a;
        jm8 jm8 = (jm8) w28.c;
        if (jm8 != null) {
            jm8.f = null;
            jm8.g = null;
            jm8.h = null;
            hm8 hm8 = jm8.d;
            hm8.getClass();
            hm8.c = new WeakReference((Object) null);
        }
        ((tp8) w28.o).b.release();
    }
}
