package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: vu8  reason: default package */
public final class vu8 extends hw8 {
    public final String a;
    public final uu8 b;

    public vu8(String str, uu8 uu8) {
        this.a = str;
        this.b = uu8;
    }

    public final void f(int i) {
        uu8 uu8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (uu8 = this.b) != null && (routingController = uu8.g) != null && !routingController.isReleased() && (messenger = uu8.h) != null) {
            int andIncrement = uu8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = uu8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }

    public final void i(int i) {
        uu8 uu8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (uu8 = this.b) != null && (routingController = uu8.g) != null && !routingController.isReleased() && (messenger = uu8.h) != null) {
            int andIncrement = uu8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = uu8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }
}
