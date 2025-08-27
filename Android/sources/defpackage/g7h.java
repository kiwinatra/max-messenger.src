package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* renamed from: g7h  reason: default package */
public final class g7h extends a6h {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ v6h c;

    public g7h(v6h v6h, IBinder iBinder) {
        this.c = v6h;
        this.b = iBinder;
    }

    public final void a() {
        s2h s2h;
        v6h v6h = this.c;
        x7h x7h = (x7h) v6h.b;
        int i = j1h.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            s2h = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            s2h = queryLocalInterface instanceof s2h ? (s2h) queryLocalInterface : new g0h(iBinder);
        }
        x7h.m = s2h;
        x7h x7h2 = (x7h) v6h.b;
        x7h2.b.d("linkToDeath", new Object[0]);
        try {
            x7h2.m.asBinder().linkToDeath(x7h2.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            boolean isLoggable = Log.isLoggable("PlayCore", 6);
            kn5 kn5 = x7h2.b;
            if (isLoggable) {
                kn5.e(kn5.a, "linkToDeath failed", objArr);
            } else {
                kn5.getClass();
            }
        }
        x7h2.g = false;
        Iterator it = x7h2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        x7h2.d.clear();
    }
}
