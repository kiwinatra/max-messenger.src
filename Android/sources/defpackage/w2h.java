package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* renamed from: w2h  reason: default package */
public final class w2h extends dxg {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w2h(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    public final void b(bi3 bi3) {
        xga xga = this.h.x0;
        if (xga != null) {
            ((gt6) xga.b).l(bi3);
        }
        System.currentTimeMillis();
    }

    public final boolean c() {
        IInterface l;
        IBinder iBinder = this.g;
        try {
            vzg.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (aVar.p().equals(interfaceDescriptor) && (l = aVar.l(iBinder)) != null && (a.u(aVar, 2, 4, l) || a.u(aVar, 3, 4, l))) {
                aVar.B0 = null;
                ykb ykb = aVar.w0;
                if (ykb == null) {
                    return true;
                }
                ((ft6) ykb.b).onConnected();
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }
}
