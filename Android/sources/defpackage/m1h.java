package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* renamed from: m1h  reason: default package */
public final class m1h implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public m1h(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder == null) {
            a aVar = this.b;
            synchronized (aVar.w) {
                i = aVar.v0;
            }
            if (i == 3) {
                aVar.C0 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            syg syg = aVar.v;
            syg.sendMessage(syg.obtainMessage(i2, aVar.E0.get(), 16));
            return;
        }
        synchronized (this.b.x) {
            try {
                a aVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.y = (queryLocalInterface == null || !(queryLocalInterface instanceof hxg)) ? new hxg(iBinder) : (hxg) queryLocalInterface;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        aVar3.getClass();
        l3h l3h = new l3h(aVar3, 0);
        syg syg2 = aVar3.v;
        syg2.sendMessage(syg2.obtainMessage(7, i3, -1, l3h));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.x) {
            aVar = this.b;
            aVar.y = null;
        }
        int i = this.a;
        syg syg = aVar.v;
        syg.sendMessage(syg.obtainMessage(6, i, 1));
    }
}
