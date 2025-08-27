package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hxg  reason: default package */
public final class hxg implements IInterface {
    public final IBinder c;

    public hxg(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void l(l0h l0h, nr6 nr6) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(l0h);
            obtain.writeInt(1);
            o0h.a(nr6, obtain, 0);
            this.c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
