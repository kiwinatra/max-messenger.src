package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* renamed from: l0h  reason: default package */
public final class l0h extends hvg {
    public a d;
    public final int e;

    public l0h(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.d = aVar;
        this.e = i;
    }

    public final boolean I0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            szg.b(parcel);
            vzg.n(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            aVar.getClass();
            w2h w2h = new w2h(aVar, parcel.readInt(), parcel.readStrongBinder(), (Bundle) szg.a(parcel, Bundle.CREATOR));
            syg syg = aVar.v;
            syg.sendMessage(syg.obtainMessage(1, this.e, -1, w2h));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) szg.a(parcel, Bundle.CREATOR);
            szg.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            h5h h5h = (h5h) szg.a(parcel, h5h.CREATOR);
            szg.b(parcel);
            a aVar2 = this.d;
            vzg.n(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            vzg.m(h5h);
            aVar2.D0 = h5h;
            if (aVar2.t()) {
                ki3 ki3 = h5h.o;
                b8d n = b8d.n();
                c8d c8d = ki3 == null ? null : ki3.a;
                synchronized (n) {
                    if (c8d == null) {
                        c8d = b8d.c;
                    } else {
                        c8d c8d2 = (c8d) n.a;
                        if (c8d2 != null) {
                            if (c8d2.a < c8d.a) {
                            }
                        }
                    }
                    n.a = c8d;
                }
            }
            Bundle bundle2 = h5h.a;
            vzg.n(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            aVar3.getClass();
            w2h w2h2 = new w2h(aVar3, readInt, readStrongBinder, bundle2);
            syg syg2 = aVar3.v;
            syg2.sendMessage(syg2.obtainMessage(1, this.e, -1, w2h2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
