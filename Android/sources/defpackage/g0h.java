package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g0h  reason: default package */
public final class g0h implements s2h, IInterface {
    public final IBinder c;

    public g0h(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void m0(String str, Bundle bundle, t6h t6h) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = lzg.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(t6h);
        try {
            this.c.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
