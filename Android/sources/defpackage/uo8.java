package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: uo8  reason: default package */
public final class uo8 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ox8 e;

    public uo8(Context context, ox8 ox8) {
        this.e = ox8;
        Object obj = ox8.b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.a = mediaController;
        if (ox8.a() == null) {
            so8 so8 = new so8((Handler) null);
            so8.b = new WeakReference(this);
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, (Bundle) null, so8);
        }
    }

    public final void a() {
        h67 a2 = this.e.a();
        if (a2 != null) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rp8 rp8 = (rp8) it.next();
                to8 to8 = new to8(rp8);
                this.d.put(rp8, to8);
                rp8.c = to8;
                try {
                    a2.f0(to8);
                    rp8.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                }
            }
            arrayList.clear();
        }
    }

    public final void b(rp8 rp8) {
        MediaController mediaController = this.a;
        ro8 ro8 = rp8.a;
        ro8.getClass();
        mediaController.unregisterCallback(ro8);
        synchronized (this.b) {
            h67 a2 = this.e.a();
            if (a2 != null) {
                try {
                    to8 to8 = (to8) this.d.remove(rp8);
                    if (to8 != null) {
                        rp8.c = null;
                        a2.W(to8);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(rp8);
            }
        }
    }
}
