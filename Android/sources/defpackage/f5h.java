package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: f5h  reason: default package */
public final /* synthetic */ class f5h implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h7h h7h = (h7h) obj;
                h7h.b.a("reportBinderDeath", new Object[0]);
                rae.w(h7h.i.get());
                h7h.b.a("%s : Binder has died.", h7h.c);
                Iterator it = h7h.d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(h7h.c).concat(" : Binder has died."));
                    qdf qdf = ((z4h) it.next()).a;
                    if (qdf != null) {
                        qdf.c(remoteException);
                    }
                }
                h7h.d.clear();
                synchronized (h7h.f) {
                    h7h.c();
                }
                return;
            default:
                x7h x7h = (x7h) obj;
                x7h.b.d("reportBinderDeath", new Object[0]);
                rae.w(x7h.i.get());
                x7h.b.d("%s : Binder has died.", x7h.c);
                Iterator it2 = x7h.d.iterator();
                while (it2.hasNext()) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(x7h.c).concat(" : Binder has died."));
                    qdf qdf2 = ((a6h) it2.next()).a;
                    if (qdf2 != null) {
                        qdf2.c(remoteException2);
                    }
                }
                x7h.d.clear();
                synchronized (x7h.f) {
                    x7h.d();
                }
                return;
        }
    }
}
