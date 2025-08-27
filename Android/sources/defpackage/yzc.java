package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* renamed from: yzc  reason: default package */
public final class yzc implements IBinder.DeathRecipient {
    public final Messenger a;
    public final ad b;
    public final Messenger c;
    public int d = 1;
    public int e = 1;
    public int f;
    public int g;
    public final SparseArray h = new SparseArray();
    public final /* synthetic */ d0d i;

    public yzc(d0d d0d, Messenger messenger) {
        this.i = d0d;
        this.a = messenger;
        ad adVar = new ad(this);
        this.b = adVar;
        this.c = new Messenger(adVar);
    }

    public final void a(int i2) {
        int i3 = this.d;
        this.d = i3 + 1;
        b(5, i3, i2, (Bundle) null, (Bundle) null);
    }

    public final boolean b(int i2, int i3, int i4, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.arg1 = i3;
        obtain.arg2 = i4;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    public final void binderDied() {
        this.i.X.post(new xzc(this, 1));
    }

    public final void c(int i2, int i3) {
        Bundle g2 = wj6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(7, i4, i2, (Bundle) null, g2);
    }

    public final void d(int i2, int i3) {
        Bundle g2 = wj6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(8, i4, i2, (Bundle) null, g2);
    }
}
